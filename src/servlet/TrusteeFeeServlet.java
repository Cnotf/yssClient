package servlet;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.beanutils.BeanUtils;
import queryclient.*;
import saveclient.SaveWebServiceWS;
import saveclient.YssWebServiceIService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 13:54 2019/05/07
 */
@WebServlet("/trusteeFee")
public class TrusteeFeeServlet extends HttpServlet {

    private static final String QUERY= "query";
    private static final String SAVE = "save";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response){
        //获取action 问号后面的参数 来决定调用什么方法
        String queryString = request.getQueryString();
        if (QUERY.equals(queryString)) {
            TrusteeFeeServlet.dealQueryTrusteeFeeData(request, response);
        } else if (SAVE.equals(queryString)){
            TrusteeFeeServlet.dealSaveTrusteeFeeData(request, response);
        }
    }

    /**
     * 处理save 返回值
     * @param request
     * @param response
     */
    public static void dealSaveTrusteeFeeData(HttpServletRequest request, HttpServletResponse response){
        PrintWriter out = null;
        String retVal = "";
        List<TrusteeFeeInfo> list = new ArrayList<TrusteeFeeInfo>();
        try {
            request.setCharacterEncoding("UTF-8");
            //参数映射到bean中
            BufferedReader streamReader = new BufferedReader( new InputStreamReader(request.getInputStream(), "UTF-8"));
            StringBuilder responseStrBuilder = new StringBuilder();
            String inputStr;
            while ((inputStr = streamReader.readLine()) != null) {
                responseStrBuilder.append(inputStr);
            }
            JSONArray jsonarray = JSONArray.fromObject(responseStrBuilder.toString());
            list = (List<TrusteeFeeInfo>)JSONArray.toCollection(jsonarray, TrusteeFeeInfo.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            response.setContentType("text/html");
            response.setCharacterEncoding("UTF-8");
            out = response.getWriter();
            //callvalue: 1：处理成功 2：服务端处理失败 3: 客户端处理失败
            String callvalue = TrusteeFeeServlet.saveTrusteeFeeData(list);
            retVal = callvalue;
        } catch (Exception e){
            e.printStackTrace();
            retVal = "3";
        } finally {
            out.write(retVal);
            out.flush();
            out.close();
        }
    }

    /**
     * 处理查询返回值
     * @param request
     * @param response
     */
    public static void dealQueryTrusteeFeeData(HttpServletRequest request, HttpServletResponse response){
        PrintWriter out = null;
        try {
            request.setCharacterEncoding("UTF-8");
            response.setContentType("text/html");
            response.setCharacterEncoding("UTF-8");
            out = response.getWriter();
            TrusteeFeeInfo trusteeFeeInfo = new TrusteeFeeInfo();
            try {
                //查询条件映射到bean中
                BeanUtils.populate(trusteeFeeInfo, request.getParameterMap());
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
            List<TrusteeFeeInfo> trusteeFeeInfoList = TrusteeFeeServlet.queryTrusteeFeeData(trusteeFeeInfo);
            //定义map
            Map<String, Object> jsonMap = new HashMap<String, Object>();
            //total键 存放总记录数，必须的
            if (trusteeFeeInfoList != null && trusteeFeeInfoList.size()>0) {
                jsonMap.put("total", trusteeFeeInfoList.get(0).getTotal());
            }else {
                jsonMap.put("total", 0);
            }
            //rows键 存放每页记录 list
            jsonMap.put("rows", trusteeFeeInfoList);
            //格式化result   一定要是JSONObject
            JSONObject result = JSONObject.fromObject(jsonMap);
            String json = result.toString();
            out.write(json);
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            out.flush();
            out.close();
        }
    }

    /**
     * 传参数到服务端
     * @param trusteeFeeInfo
     * @return
     */
    public static String saveTrusteeFeeData(List<TrusteeFeeInfo> trusteeFeeInfo) {
        YssWebServiceIService yssWebServiceIService = new YssWebServiceIService();
        SaveWebServiceWS saveWebServiceWSPort = yssWebServiceIService.getSaveWebServiceWSPort();
        return saveWebServiceWSPort.saveTrusteeFeeData(trusteeFeeInfo);
    }
    /**
     * 查询托管费信息
     * @return
     */
    public static List<TrusteeFeeInfo> queryTrusteeFeeData(TrusteeFeeInfo trusteeFeeInfo) {
        YssQueryServiceIService yssQueryServiceIService = new YssQueryServiceIService();
        QueryServiceWS queryServiceWSPort = yssQueryServiceIService.getQueryServiceWSPort();
        return queryServiceWSPort.queryTrusteeFeeData(trusteeFeeInfo);
    }
}
