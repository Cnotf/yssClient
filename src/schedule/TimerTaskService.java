package schedule;

import servlet.HandPhotoServlet;
import util.CommonUtils;

import java.util.Date;
import java.util.TimerTask;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 20:40 2019/07/04
 */
public class TimerTaskService extends TimerTask {

    @Override
    public void run() {
        System.out.println("定时拍照开始时间：" + CommonUtils.dateToString("yyyy-MM-dd HH:mm:ss.SSS", new Date()));
        String returnVal="";
        try {
            returnVal = HandPhotoServlet.handDate(null, "1");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if("1".equals(returnVal)) {
            System.out.println("==============定时拍照成功=============");
            System.out.println("定时拍照成功开始时间：" + CommonUtils.dateToString("yyyy-MM-dd HH:mm:ss.SSS", new Date()));
        } else {
            System.out.println("==============定时拍照失败=============");
        }
    }
}
