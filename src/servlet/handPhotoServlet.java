package servlet;

import client.YssWebServiceIService;
import client.YssWebServiceWS;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 13:54 2019/05/07
 */
@WebServlet("/handPhoto")
public class handPhotoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String retVal = "";
        String beginHandDate = request.getParameter("beginHandDate");
        String endHandDate = request.getParameter("endHandDate");
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String callvalue = handPhotoServlet.getHandDate(beginHandDate, endHandDate);
            if ( "1".equals(callvalue)){
                retVal = "handPhoto success";
            } else {
                retVal = "handPhoto server deal exception,please contact administrator";
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
            retVal = "handPhoto client deal exception,please contact administrator";
        } finally {
            out.write( "<script>alert('"+retVal+"');history.go(-1);</script>");
            out.flush();
            out.close();
        }

    }

    /**
     * 传参数到服务端
     * @param beginHandDate
     * @param endHandDate
     * @return
     */
    public static String getHandDate(String beginHandDate, String endHandDate) {
        YssWebServiceIService yssWebServiceIService = new YssWebServiceIService();
        YssWebServiceWS yssWebServiceWSPort = yssWebServiceIService.getYssWebServiceWSPort();
        return yssWebServiceWSPort.getHandDate(beginHandDate,endHandDate);
    }
}
