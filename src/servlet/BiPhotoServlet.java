package servlet;

import net.sf.json.JSONObject;
import org.apache.commons.beanutils.BeanUtils;
import queryclient.QueryServiceWS;
import queryclient.YssQueryServiceIService;
import saveclient.*;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.PrintWriter;
import java.util.*;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 13:54 2019/05/07
 */
@WebServlet("/biPhoto")
public class BiPhotoServlet extends HttpServlet {

    private static final String QUERY= "query";
    private static final String SAVE = "save";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response){
        //获取action 问号后面的参数 来决定调用什么方法
        String queryString = request.getQueryString();
        if (QUERY.equals(queryString)) {
            BiPhotoServlet.queryBiDataList(request, response);
        } else if (SAVE.equals(queryString)){
            BiPhotoServlet.saveBiDataList(request, response);
        }
    }

    /**
     * 保存报表信息
     * @param request
     * @param response
     */
    public static void saveBiDataList(HttpServletRequest request, HttpServletResponse response){
        String retVal = "";
        BiDateInfo biDateInfo = new BiDateInfo();
        PrintWriter out = null;
        try {
            out = response.getWriter();
            request.setCharacterEncoding("UTF-8");
            //参数映射到bean中
            BeanUtils.populate(biDateInfo, request.getParameterMap());
            response.setContentType("text/html");
            response.setCharacterEncoding("UTF-8");
            String callvalue = BiPhotoServlet.saveBiDate(biDateInfo);
            if ( "1".equals(callvalue)){
                retVal = "1";
            } else {
                retVal = "biPhoto server deal exception,please contact administrator";
            }
        } catch (Exception e){
            e.printStackTrace();
            retVal = "biPhoto saveclient deal exception,please contact administrator";
        }
        if ("1".equals(retVal)) {
            out.write( "<script>window.location.href = \"biExcelDownLoad.jsp\";</script>");
        } else {
            out.write( "<script>alert('"+retVal+"');history.go(-1);</script>");
        }
    }

    /**
     * 查询报表信息
     * @param request
     * @param response
     */
    public static void queryBiDataList(HttpServletRequest request, HttpServletResponse response){
        PrintWriter out = null;
        try {
            request.setCharacterEncoding("UTF-8");
            response.setContentType("text/html");
            response.setCharacterEncoding("UTF-8");
            out = response.getWriter();
            BiDateInfo biDateInfo = new BiDateInfo();
            try {
                //查询条件映射到bean中
                BeanUtils.populate(biDateInfo, request.getParameterMap());
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
            List<BiDateInfo> BiDateInfoList = BiPhotoServlet.queryBiDataInfo(biDateInfo);

            //定义map
            Map<String, Object> jsonMap = new HashMap<String, Object>();
            //total键 存放总记录数，必须的
            if (BiDateInfoList != null && BiDateInfoList.size()>0) {
                jsonMap.put("total", BiDateInfoList.get(0).getTotal());
            }else {
                jsonMap.put("total", 0);
            }
            jsonMap.put("rows", BiDateInfoList);
            //rows键 存放每页记录 list
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
     * @param biDateInfo
     * @return
     */
    public static String saveBiDate(BiDateInfo biDateInfo) {
        YssWebServiceIService yssWebServiceIService = new YssWebServiceIService();
        SaveWebServiceWS saveWebServiceWSPort = yssWebServiceIService.getSaveWebServiceWSPort();
        return saveWebServiceWSPort.saveBiDate(biDateInfo);
    }

    /**
     * 查询报表信息
     * @return
     */
    public static List<BiDateInfo> queryBiDataInfo(BiDateInfo biDateInfo) {
        YssQueryServiceIService yssQueryServiceIService = new YssQueryServiceIService();
        QueryServiceWS queryServiceWSPort = yssQueryServiceIService.getQueryServiceWSPort();
        return queryServiceWSPort.queryBiList(biDateInfo);
    }

}
