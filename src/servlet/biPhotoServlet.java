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
@WebServlet("/biPhoto")
public class biPhotoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String retVal = "";
        String beginPhotoDate = request.getParameter("beginPhotoDate");
        String endPhotoDate = request.getParameter("endPhotoDate");
        String startAccountDate = request.getParameter("startAccountDate");
        String endAccountDate = request.getParameter("endAccountDate");
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String callvalue = biPhotoServlet.getBiDate(beginPhotoDate, endPhotoDate,
                    startAccountDate, endAccountDate);
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
     * @param beginPhotoDate
     * @param endPhotoDate
     * @param startAccountDate
     * @param endAccountDate
     * @return
     */
    public static String getBiDate(String beginPhotoDate, String endPhotoDate,
                                   String startAccountDate, String endAccountDate) {
        YssWebServiceIService yssWebServiceIService = new YssWebServiceIService();
        YssWebServiceWS yssWebServiceWSPort = yssWebServiceIService.getYssWebServiceWSPort();
        return yssWebServiceWSPort.getBiDate(beginPhotoDate,endPhotoDate,startAccountDate,endAccountDate);
    }
}
