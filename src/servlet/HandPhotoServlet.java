package servlet;

import org.apache.commons.beanutils.BeanUtils;
import saveclient.*;

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
@WebServlet("/handPhoto")
public class HandPhotoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String retVal = "";
        HandDateInfo handDateInfo = new HandDateInfo();
        try {
            BeanUtils.populate(handDateInfo, request.getParameterMap());
            System.out.println(handDateInfo.toString());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String callvalue = HandPhotoServlet.getHandDate(handDateInfo);
            if ( "1".equals(callvalue)){
                retVal = "handPhoto success";
            } else {
                retVal = "handPhoto server deal exception,please contact administrator";
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
            retVal = "handPhoto saveclient deal exception,please contact administrator";
        } finally {
            out.write( "<script>alert('"+retVal+"');history.go(-1);</script>");
            out.flush();
            out.close();
        }

    }

    /**
     * 传参数到服务端
     * @param handDateInfo
     * @return
     */
    public static String getHandDate(HandDateInfo handDateInfo) {
        YssWebServiceIService yssWebServiceIService = new YssWebServiceIService();
        SaveWebServiceWS saveWebServiceWSPort = yssWebServiceIService.getSaveWebServiceWSPort();
        return saveWebServiceWSPort.saveHandDate(handDateInfo);
    }
}
