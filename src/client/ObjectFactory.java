
package client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service.hello.yss.com package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetBiDate_QNAME = new QName("http://com.yss.hello.service", "getBiDate");
    private final static QName _GetBiDateResponse_QNAME = new QName("http://com.yss.hello.service", "getBiDateResponse");
    private final static QName _GetHandDate_QNAME = new QName("http://com.yss.hello.service", "getHandDate");
    private final static QName _GetHandDateResponse_QNAME = new QName("http://com.yss.hello.service", "getHandDateResponse");
    private final static QName _GetTrusteeFeeData_QNAME = new QName("http://com.yss.hello.service", "getTrusteeFeeData");
    private final static QName _GetTrusteeFeeDataResponse_QNAME = new QName("http://com.yss.hello.service", "getTrusteeFeeDataResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service.hello.yss.com
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBiDate }
     * 
     */
    public GetBiDate createGetBiDate() {
        return new GetBiDate();
    }

    /**
     * Create an instance of {@link GetBiDateResponse }
     * 
     */
    public GetBiDateResponse createGetBiDateResponse() {
        return new GetBiDateResponse();
    }

    /**
     * Create an instance of {@link GetHandDate }
     * 
     */
    public GetHandDate createGetHandDate() {
        return new GetHandDate();
    }

    /**
     * Create an instance of {@link GetHandDateResponse }
     * 
     */
    public GetHandDateResponse createGetHandDateResponse() {
        return new GetHandDateResponse();
    }

    /**
     * Create an instance of {@link GetTrusteeFeeData }
     * 
     */
    public GetTrusteeFeeData createGetTrusteeFeeData() {
        return new GetTrusteeFeeData();
    }

    /**
     * Create an instance of {@link GetTrusteeFeeDataResponse }
     * 
     */
    public GetTrusteeFeeDataResponse createGetTrusteeFeeDataResponse() {
        return new GetTrusteeFeeDataResponse();
    }

    /**
     * Create an instance of {@link BiDateInfo }
     * 
     */
    public BiDateInfo createBiDateInfo() {
        return new BiDateInfo();
    }

    /**
     * Create an instance of {@link HandDateInfo }
     * 
     */
    public HandDateInfo createHandDateInfo() {
        return new HandDateInfo();
    }

    /**
     * Create an instance of {@link TrusteeFeeInfo }
     * 
     */
    public TrusteeFeeInfo createTrusteeFeeInfo() {
        return new TrusteeFeeInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBiDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.yss.hello.service", name = "getBiDate")
    public JAXBElement<GetBiDate> createGetBiDate(GetBiDate value) {
        return new JAXBElement<GetBiDate>(_GetBiDate_QNAME, GetBiDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBiDateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.yss.hello.service", name = "getBiDateResponse")
    public JAXBElement<GetBiDateResponse> createGetBiDateResponse(GetBiDateResponse value) {
        return new JAXBElement<GetBiDateResponse>(_GetBiDateResponse_QNAME, GetBiDateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHandDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.yss.hello.service", name = "getHandDate")
    public JAXBElement<GetHandDate> createGetHandDate(GetHandDate value) {
        return new JAXBElement<GetHandDate>(_GetHandDate_QNAME, GetHandDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHandDateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.yss.hello.service", name = "getHandDateResponse")
    public JAXBElement<GetHandDateResponse> createGetHandDateResponse(GetHandDateResponse value) {
        return new JAXBElement<GetHandDateResponse>(_GetHandDateResponse_QNAME, GetHandDateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTrusteeFeeData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.yss.hello.service", name = "getTrusteeFeeData")
    public JAXBElement<GetTrusteeFeeData> createGetTrusteeFeeData(GetTrusteeFeeData value) {
        return new JAXBElement<GetTrusteeFeeData>(_GetTrusteeFeeData_QNAME, GetTrusteeFeeData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTrusteeFeeDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.yss.hello.service", name = "getTrusteeFeeDataResponse")
    public JAXBElement<GetTrusteeFeeDataResponse> createGetTrusteeFeeDataResponse(GetTrusteeFeeDataResponse value) {
        return new JAXBElement<GetTrusteeFeeDataResponse>(_GetTrusteeFeeDataResponse_QNAME, GetTrusteeFeeDataResponse.class, null, value);
    }

}
