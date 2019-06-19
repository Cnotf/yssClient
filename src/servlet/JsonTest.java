package servlet;

import net.sf.json.JSONArray;
import queryclient.TrusteeFeeInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 13:06 2019/06/18
 */
public class JsonTest {
    public static void main(String[] args) {
        List<TrusteeFeeInfo> list = new ArrayList<TrusteeFeeInfo>();
        TrusteeFeeInfo trusteeFeeInfo = new TrusteeFeeInfo();
        trusteeFeeInfo.setIntGrpCd("2323");
        trusteeFeeInfo.setPymAccNo("232323");
        list.add(trusteeFeeInfo);
        String s = JSONArray.fromObject(list).toString();
        System.out.println(s);
    }
}
