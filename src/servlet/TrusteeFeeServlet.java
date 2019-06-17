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
@WebServlet("/trusteeFee")
public class TrusteeFeeServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String retVal = "";
        TrusteeFeeInfo trusteeFeeInfo = new TrusteeFeeInfo();
        try {
            //参数映射到bean中
            BeanUtils.populate(trusteeFeeInfo, request.getParameterMap());
            System.out.println(trusteeFeeInfo.toString());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String callvalue = TrusteeFeeServlet.getTrusteeFeeData(trusteeFeeInfo);
            if ( "1".equals(callvalue)){
                retVal = "deal success";
            } else {
                retVal = "trusteeFee server deal exception,please contact administrator";
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
            retVal = "trusteeFee client deal exception,please contact administrator";
        } finally {
            out.write( "<script>alert('"+retVal+"');history.go(-1);</script>");
            out.flush();
            out.close();
        }

    }

    /**
     * 传参数到服务端
     * @param trusteeFeeInfo
     * @return
     */
    public static String getTrusteeFeeData(TrusteeFeeInfo trusteeFeeInfo) {
        YssWebServiceIService yssWebServiceIService = new YssWebServiceIService();
        YssWebServiceWS yssWebServiceWSPort = yssWebServiceIService.getYssWebServiceWSPort();
        return yssWebServiceWSPort.getTrusteeFeeData(trusteeFeeInfo);
    }
}
