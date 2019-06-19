
package saveclient;

import queryclient.TrusteeFeeInfo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.yss.cnotf.services package. 
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

    private final static QName _SaveBiDate_QNAME = new QName("http://services.cnotf.yss.com", "saveBiDate");
    private final static QName _SaveBiDateResponse_QNAME = new QName("http://services.cnotf.yss.com", "saveBiDateResponse");
    private final static QName _SaveHandDate_QNAME = new QName("http://services.cnotf.yss.com", "saveHandDate");
    private final static QName _SaveHandDateResponse_QNAME = new QName("http://services.cnotf.yss.com", "saveHandDateResponse");
    private final static QName _SaveTrusteeFeeData_QNAME = new QName("http://services.cnotf.yss.com", "saveTrusteeFeeData");
    private final static QName _SaveTrusteeFeeDataResponse_QNAME = new QName("http://services.cnotf.yss.com", "saveTrusteeFeeDataResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.yss.cnotf.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SaveBiDate }
     * 
     */
    public SaveBiDate createSaveBiDate() {
        return new SaveBiDate();
    }

    /**
     * Create an instance of {@link SaveBiDateResponse }
     * 
     */
    public SaveBiDateResponse createSaveBiDateResponse() {
        return new SaveBiDateResponse();
    }

    /**
     * Create an instance of {@link SaveHandDate }
     * 
     */
    public SaveHandDate createSaveHandDate() {
        return new SaveHandDate();
    }

    /**
     * Create an instance of {@link SaveHandDateResponse }
     * 
     */
    public SaveHandDateResponse createSaveHandDateResponse() {
        return new SaveHandDateResponse();
    }

    /**
     * Create an instance of {@link SaveTrusteeFeeData }
     * 
     */
    public SaveTrusteeFeeData createSaveTrusteeFeeData() {
        return new SaveTrusteeFeeData();
    }

    /**
     * Create an instance of {@link SaveTrusteeFeeDataResponse }
     * 
     */
    public SaveTrusteeFeeDataResponse createSaveTrusteeFeeDataResponse() {
        return new SaveTrusteeFeeDataResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveBiDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.cnotf.yss.com", name = "saveBiDate")
    public JAXBElement<SaveBiDate> createSaveBiDate(SaveBiDate value) {
        return new JAXBElement<SaveBiDate>(_SaveBiDate_QNAME, SaveBiDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveBiDateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.cnotf.yss.com", name = "saveBiDateResponse")
    public JAXBElement<SaveBiDateResponse> createSaveBiDateResponse(SaveBiDateResponse value) {
        return new JAXBElement<SaveBiDateResponse>(_SaveBiDateResponse_QNAME, SaveBiDateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveHandDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.cnotf.yss.com", name = "saveHandDate")
    public JAXBElement<SaveHandDate> createSaveHandDate(SaveHandDate value) {
        return new JAXBElement<SaveHandDate>(_SaveHandDate_QNAME, SaveHandDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveHandDateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.cnotf.yss.com", name = "saveHandDateResponse")
    public JAXBElement<SaveHandDateResponse> createSaveHandDateResponse(SaveHandDateResponse value) {
        return new JAXBElement<SaveHandDateResponse>(_SaveHandDateResponse_QNAME, SaveHandDateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveTrusteeFeeData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.cnotf.yss.com", name = "saveTrusteeFeeData")
    public JAXBElement<SaveTrusteeFeeData> createSaveTrusteeFeeData(SaveTrusteeFeeData value) {
        return new JAXBElement<SaveTrusteeFeeData>(_SaveTrusteeFeeData_QNAME, SaveTrusteeFeeData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveTrusteeFeeDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.cnotf.yss.com", name = "saveTrusteeFeeDataResponse")
    public JAXBElement<SaveTrusteeFeeDataResponse> createSaveTrusteeFeeDataResponse(SaveTrusteeFeeDataResponse value) {
        return new JAXBElement<SaveTrusteeFeeDataResponse>(_SaveTrusteeFeeDataResponse_QNAME, SaveTrusteeFeeDataResponse.class, null, value);
    }

}
