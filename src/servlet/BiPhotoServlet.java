package servlet;

import client.*;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 13:54 2019/05/07
 */
@WebServlet("/biPhoto")
public class BiPhotoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String retVal = "";
        BiDateInfo biDateInfo = new BiDateInfo();
        try {
            //参数映射到bean中
            BeanUtils.populate(biDateInfo, request.getParameterMap());
            System.out.println(biDateInfo.toString());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String callvalue = BiPhotoServlet.getBiDate(biDateInfo);
            if ( "1".equals(callvalue)){
                retVal = "biPhoto success";
            } else {
                retVal = "biPhoto server deal exception,please contact administrator";
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
            retVal = "biPhoto client deal exception,please contact administrator";
        } finally {
            out.write( "<script>alert('"+retVal+"');history.go(-1);</script>");
            out.flush();
            out.close();
        }

    }

    /**
     * 传参数到服务端
     * @param biDateInfo
     * @return
     */
    public static String getBiDate(BiDateInfo biDateInfo) {
        YssWebServiceIService yssWebServiceIService = new YssWebServiceIService();
        YssWebServiceWS yssWebServiceWSPort = yssWebServiceIService.getYssWebServiceWSPort();
        return yssWebServiceWSPort.getBiDate(biDateInfo);
    }
}
