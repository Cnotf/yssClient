package queryclient;

import saveclient.BiDateInfo;
import saveclient.HandDateInfo;

import javax.jws.*;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2019-07-26T15:29:26.963+08:00
 * Generated source version: 3.1.8
 * 
 */
@WebService(targetNamespace = "http://services.cnotf.yss.com", name = "queryServiceWS")
@XmlSeeAlso({ObjectFactory.class})
public interface QueryServiceWS {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "queryTrusteeFeeData", targetNamespace = "http://services.cnotf.yss.com", className = "com.yss.cnotf.services.QueryTrusteeFeeData")
    @WebMethod
    @ResponseWrapper(localName = "queryTrusteeFeeDataResponse", targetNamespace = "http://services.cnotf.yss.com", className = "com.yss.cnotf.services.QueryTrusteeFeeDataResponse")
    public java.util.List<TrusteeFeeInfo> queryTrusteeFeeData(
            @WebParam(name = "arg0", targetNamespace = "")
                    TrusteeFeeInfo arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "deleteHandPhotoData", targetNamespace = "http://services.cnotf.yss.com", className = "com.yss.cnotf.services.DeleteHandPhotoData")
    @WebMethod
    @ResponseWrapper(localName = "deleteHandPhotoDataResponse", targetNamespace = "http://services.cnotf.yss.com", className = "com.yss.cnotf.services.DeleteHandPhotoDataResponse")
    public Integer deleteHandPhotoData(
            @WebParam(name = "arg0", targetNamespace = "")
                    java.util.List<HandDateInfo> arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "saveHandPhotoData", targetNamespace = "http://services.cnotf.yss.com", className = "com.yss.cnotf.services.SaveHandPhotoData")
    @WebMethod
    @ResponseWrapper(localName = "saveHandPhotoDataResponse", targetNamespace = "http://services.cnotf.yss.com", className = "com.yss.cnotf.services.SaveHandPhotoDataResponse")
    public Integer saveHandPhotoData(
            @WebParam(name = "arg0", targetNamespace = "")
                    java.util.List<HandDateInfo> arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "queryHandPhotoList", targetNamespace = "http://services.cnotf.yss.com", className = "com.yss.cnotf.services.QueryHandPhotoList")
    @WebMethod
    @ResponseWrapper(localName = "queryHandPhotoListResponse", targetNamespace = "http://services.cnotf.yss.com", className = "com.yss.cnotf.services.QueryHandPhotoListResponse")
    public java.util.List<HandDateInfo> queryHandPhotoList(
            @WebParam(name = "arg0", targetNamespace = "")
                    HandDateInfo arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "queryBiList", targetNamespace = "http://services.cnotf.yss.com", className = "com.yss.cnotf.services.QueryBiList")
    @WebMethod
    @ResponseWrapper(localName = "queryBiListResponse", targetNamespace = "http://services.cnotf.yss.com", className = "com.yss.cnotf.services.QueryBiListResponse")
    public java.util.List<BiDateInfo> queryBiList(
            @WebParam(name = "arg0", targetNamespace = "")
                    BiDateInfo arg0
    );
}
