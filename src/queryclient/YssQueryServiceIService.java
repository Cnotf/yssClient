package queryclient;

import util.PropertiesUtil;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2019-06-19T22:29:52.588+08:00
 * Generated source version: 3.1.8
 * 
 */
@WebServiceClient(name = "YssQueryServiceIService", 
                  wsdlLocation = "http://localhost:8003/yss_query_service?wsdl",
                  targetNamespace = "http://services.cnotf.yss.com") 
public class YssQueryServiceIService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://services.cnotf.yss.com", "YssQueryServiceIService");
    public final static QName QueryServiceWSPort = new QName("http://services.cnotf.yss.com", "queryServiceWSPort");
    static {
        URL url = null;
        PropertiesUtil propertiesUtil = new PropertiesUtil("properties/ipport.properties");
        String address = propertiesUtil.readProperty("queryaddress");
        try {
            url = new URL(address);
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(YssQueryServiceIService.class.getName())
                    .log(java.util.logging.Level.INFO,
                            "Can not initialize the default wsdl from {0}", address);
        }
        WSDL_LOCATION = url;
    }

    public YssQueryServiceIService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public YssQueryServiceIService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public YssQueryServiceIService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public YssQueryServiceIService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public YssQueryServiceIService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public YssQueryServiceIService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns QueryServiceWS
     */
    @WebEndpoint(name = "queryServiceWSPort")
    public QueryServiceWS getQueryServiceWSPort() {
        return super.getPort(QueryServiceWSPort, QueryServiceWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns QueryServiceWS
     */
    @WebEndpoint(name = "queryServiceWSPort")
    public QueryServiceWS getQueryServiceWSPort(WebServiceFeature... features) {
        return super.getPort(QueryServiceWSPort, QueryServiceWS.class, features);
    }

}
