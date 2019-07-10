package servlet;

import net.sf.json.JSONArray;
import org.apache.commons.beanutils.BeanUtils;
import queryclient.QueryServiceWS;
import queryclient.YssQueryServiceIService;
import saveclient.*;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 13:54 2019/05/07
 */
@WebServlet("/handPhoto")
public class HandPhotoServlet extends HttpServlet {


    private static final String QUERY= "query";
    private static final String SAVE = "save";
    private static final String DELETE = "delete";
    private static final String HAND_PHOTO = "handPhoto";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response){
        //获取action 问号后面的参数 来决定调用什么方法
        String queryString = request.getQueryString();
        if (QUERY.equals(queryString)) {
            HandPhotoServlet.queryPhotoDataList(request, response);
        } else if (SAVE.equals(queryString)){
            HandPhotoServlet.savePhotoDataList(request, response);
        } else if (DELETE.equals(queryString)){
            HandPhotoServlet.deletePhotoDataList(request, response);
        } else if (HAND_PHOTO.equals(queryString)){
            HandPhotoServlet.handPhotoDataList(request, response);
        }
    }

    /**
     * 查询拍照信息
     * @param request
     * @param response
     */
    public static void queryPhotoDataList(HttpServletRequest request, HttpServletResponse response){
        PrintWriter out = null;
        try {
            request.setCharacterEncoding("UTF-8");
            response.setContentType("text/html");
            response.setCharacterEncoding("UTF-8");
            out = response.getWriter();
            HandDateInfo handDateInfo = new HandDateInfo();
            try {
                //查询条件映射到bean中
                BeanUtils.populate(handDateInfo, request.getParameterMap());
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
            List<HandDateInfo> handDateInfoList = HandPhotoServlet.queryHandDataInfo(handDateInfo);
            JSONArray jsonArray = JSONArray.fromObject(handDateInfoList);
            String json = jsonArray.toString();
            out.write(json);
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            out.flush();
            out.close();
        }
    }

    /**
     * 删除拍照信息
     * @param request
     * @param response
     */
    public static void deletePhotoDataList(HttpServletRequest request, HttpServletResponse response){
        PrintWriter out = null;
        String returnVal = "";
        List<HandDateInfo> list = new ArrayList<HandDateInfo>();
        try {
            request.setCharacterEncoding("UTF-8");
            response.setContentType("text/html");
            response.setCharacterEncoding("UTF-8");
            out = response.getWriter();
            returnVal = HandPhotoServlet.deleteHandDataInfo(json2List(request,list)) + "";
        } catch (Exception e){
            e.printStackTrace();
            returnVal = "3";
        } finally {
            out.write(returnVal);
            out.flush();
            out.close();
        }
    }



    /**
     * 手工拍照
     * @param request
     * @param response
     */
    public static void handPhotoDataList(HttpServletRequest request, HttpServletResponse response){
        PrintWriter out = null;
        String retVal = "";
        List<HandDateInfo> list = new ArrayList<HandDateInfo>();
        try {
            response.setContentType("text/html");
            response.setCharacterEncoding("UTF-8");
            out = response.getWriter();
            String callvalue = HandPhotoServlet.handDate(json2List(request,list), "0");
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
     * 保存拍照信息
     * @param request
     * @param response
     */
    public static void savePhotoDataList(HttpServletRequest request, HttpServletResponse response){
        PrintWriter out = null;
        String retVal = "";
        List<HandDateInfo> list = new ArrayList<HandDateInfo>();
        try {
            response.setContentType("text/html");
            response.setCharacterEncoding("UTF-8");
            out = response.getWriter();
            Integer callvalue = HandPhotoServlet.saveHandDataInfo(json2List(request,list));
            retVal = callvalue+"";
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
     * 查询拍照信息
     * @return
     */
    public static List<HandDateInfo> queryHandDataInfo(HandDateInfo handDateInfo) {
        YssQueryServiceIService yssQueryServiceIService = new YssQueryServiceIService();
        QueryServiceWS queryServiceWSPort = yssQueryServiceIService.getQueryServiceWSPort();
        return queryServiceWSPort.queryHandPhotoList(handDateInfo);
    }

    /**
     * 删除拍照信息
     * @return
     */
    public static Integer deleteHandDataInfo(List<HandDateInfo> handDateInfo) {
        YssQueryServiceIService yssQueryServiceIService = new YssQueryServiceIService();
        QueryServiceWS queryServiceWSPort = yssQueryServiceIService.getQueryServiceWSPort();
        return queryServiceWSPort.deleteHandPhotoData(handDateInfo);
    }
    /**
     * 保存拍照信息
     * @return
     */
    public static Integer saveHandDataInfo(List<HandDateInfo> handDateInfo) {
        YssQueryServiceIService yssQueryServiceIService = new YssQueryServiceIService();
        QueryServiceWS queryServiceWSPort = yssQueryServiceIService.getQueryServiceWSPort();
        return queryServiceWSPort.saveHandPhotoData(handDateInfo);
    }

    /**
     * 拍照
     * @param handDateInfoList
     * @return
     */
    public static String handDate(List<HandDateInfo> handDateInfoList, String photoType) {
        YssWebServiceIService yssWebServiceIService = new YssWebServiceIService();
        SaveWebServiceWS saveWebServiceWSPort = yssWebServiceIService.getSaveWebServiceWSPort();
        return saveWebServiceWSPort.saveHandDate(handDateInfoList, photoType);
    }


    public static List<HandDateInfo> json2List(HttpServletRequest request, List<HandDateInfo> list) {
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
            list = (List<HandDateInfo>)JSONArray.toCollection(jsonarray, HandDateInfo.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
