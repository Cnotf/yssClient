package util;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 09:25 2019/05/01
 */
public class Test {
    public static void main(String[] args) {
        PropertiesUtil propertiesUtil = new PropertiesUtil("properties/ipport.properties");
        String address = propertiesUtil.readProperty("address");
        System.out.println(address);
    }
}
