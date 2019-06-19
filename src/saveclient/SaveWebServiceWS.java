package saveclient;

import queryclient.TrusteeFeeInfo;

import javax.jws.*;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import java.util.List;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2019-06-18T17:40:46.705+08:00
 * Generated source version: 3.1.8
 * 
 */
@WebService(targetNamespace = "http://services.cnotf.yss.com", name = "saveWebServiceWS")
@XmlSeeAlso({ObjectFactory.class})
public interface SaveWebServiceWS {

    @WebMethod
    @RequestWrapper(localName = "saveBiDate", targetNamespace = "http://services.cnotf.yss.com", className = "com.yss.cnotf.services.SaveBiDate")
    @ResponseWrapper(localName = "saveBiDateResponse", targetNamespace = "http://services.cnotf.yss.com", className = "com.yss.cnotf.services.SaveBiDateResponse")
    @WebResult(name = "return", targetNamespace = "")
    public String saveBiDate(
            @WebParam(name = "arg0", targetNamespace = "")
                    BiDateInfo arg0
    );

    @WebMethod
    @RequestWrapper(localName = "saveHandDate", targetNamespace = "http://services.cnotf.yss.com", className = "com.yss.cnotf.services.SaveHandDate")
    @ResponseWrapper(localName = "saveHandDateResponse", targetNamespace = "http://services.cnotf.yss.com", className = "com.yss.cnotf.services.SaveHandDateResponse")
    @WebResult(name = "return", targetNamespace = "")
    public String saveHandDate(
            @WebParam(name = "arg0", targetNamespace = "")
                    HandDateInfo arg0
    );

    @WebMethod
    @RequestWrapper(localName = "saveTrusteeFeeData", targetNamespace = "http://services.cnotf.yss.com", className = "com.yss.cnotf.services.SaveTrusteeFeeData")
    @ResponseWrapper(localName = "saveTrusteeFeeDataResponse", targetNamespace = "http://services.cnotf.yss.com", className = "com.yss.cnotf.services.SaveTrusteeFeeDataResponse")
    @WebResult(name = "return", targetNamespace = "")
    public String saveTrusteeFeeData(
            @WebParam(name = "arg0", targetNamespace = "")
                    List<TrusteeFeeInfo> arg0
    );
}