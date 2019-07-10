
package queryclient;

import saveclient.HandDateInfo;

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

    private final static QName _DeleteHandPhotoData_QNAME = new QName("http://services.cnotf.yss.com", "deleteHandPhotoData");
    private final static QName _DeleteHandPhotoDataResponse_QNAME = new QName("http://services.cnotf.yss.com", "deleteHandPhotoDataResponse");
    private final static QName _QueryHandPhotoList_QNAME = new QName("http://services.cnotf.yss.com", "queryHandPhotoList");
    private final static QName _QueryHandPhotoListResponse_QNAME = new QName("http://services.cnotf.yss.com", "queryHandPhotoListResponse");
    private final static QName _QueryTrusteeFeeData_QNAME = new QName("http://services.cnotf.yss.com", "queryTrusteeFeeData");
    private final static QName _QueryTrusteeFeeDataResponse_QNAME = new QName("http://services.cnotf.yss.com", "queryTrusteeFeeDataResponse");
    private final static QName _SaveHandPhotoData_QNAME = new QName("http://services.cnotf.yss.com", "saveHandPhotoData");
    private final static QName _SaveHandPhotoDataResponse_QNAME = new QName("http://services.cnotf.yss.com", "saveHandPhotoDataResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.yss.cnotf.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteHandPhotoData }
     * 
     */
    public DeleteHandPhotoData createDeleteHandPhotoData() {
        return new DeleteHandPhotoData();
    }

    /**
     * Create an instance of {@link DeleteHandPhotoDataResponse }
     * 
     */
    public DeleteHandPhotoDataResponse createDeleteHandPhotoDataResponse() {
        return new DeleteHandPhotoDataResponse();
    }

    /**
     * Create an instance of {@link QueryHandPhotoList }
     * 
     */
    public QueryHandPhotoList createQueryHandPhotoList() {
        return new QueryHandPhotoList();
    }

    /**
     * Create an instance of {@link QueryHandPhotoListResponse }
     * 
     */
    public QueryHandPhotoListResponse createQueryHandPhotoListResponse() {
        return new QueryHandPhotoListResponse();
    }

    /**
     * Create an instance of {@link QueryTrusteeFeeData }
     * 
     */
    public QueryTrusteeFeeData createQueryTrusteeFeeData() {
        return new QueryTrusteeFeeData();
    }

    /**
     * Create an instance of {@link QueryTrusteeFeeDataResponse }
     * 
     */
    public QueryTrusteeFeeDataResponse createQueryTrusteeFeeDataResponse() {
        return new QueryTrusteeFeeDataResponse();
    }

    /**
     * Create an instance of {@link SaveHandPhotoData }
     * 
     */
    public SaveHandPhotoData createSaveHandPhotoData() {
        return new SaveHandPhotoData();
    }

    /**
     * Create an instance of {@link SaveHandPhotoDataResponse }
     * 
     */
    public SaveHandPhotoDataResponse createSaveHandPhotoDataResponse() {
        return new SaveHandPhotoDataResponse();
    }

    /**
     * Create an instance of {@link TrusteeFeeInfo }
     * 
     */
    public TrusteeFeeInfo createTrusteeFeeInfo() {
        return new TrusteeFeeInfo();
    }

    /**
     * Create an instance of {@link HandDateInfo }
     * 
     */
    public HandDateInfo createHandDateInfo() {
        return new HandDateInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteHandPhotoData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.cnotf.yss.com", name = "deleteHandPhotoData")
    public JAXBElement<DeleteHandPhotoData> createDeleteHandPhotoData(DeleteHandPhotoData value) {
        return new JAXBElement<DeleteHandPhotoData>(_DeleteHandPhotoData_QNAME, DeleteHandPhotoData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteHandPhotoDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.cnotf.yss.com", name = "deleteHandPhotoDataResponse")
    public JAXBElement<DeleteHandPhotoDataResponse> createDeleteHandPhotoDataResponse(DeleteHandPhotoDataResponse value) {
        return new JAXBElement<DeleteHandPhotoDataResponse>(_DeleteHandPhotoDataResponse_QNAME, DeleteHandPhotoDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryHandPhotoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.cnotf.yss.com", name = "queryHandPhotoList")
    public JAXBElement<QueryHandPhotoList> createQueryHandPhotoList(QueryHandPhotoList value) {
        return new JAXBElement<QueryHandPhotoList>(_QueryHandPhotoList_QNAME, QueryHandPhotoList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryHandPhotoListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.cnotf.yss.com", name = "queryHandPhotoListResponse")
    public JAXBElement<QueryHandPhotoListResponse> createQueryHandPhotoListResponse(QueryHandPhotoListResponse value) {
        return new JAXBElement<QueryHandPhotoListResponse>(_QueryHandPhotoListResponse_QNAME, QueryHandPhotoListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryTrusteeFeeData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.cnotf.yss.com", name = "queryTrusteeFeeData")
    public JAXBElement<QueryTrusteeFeeData> createQueryTrusteeFeeData(QueryTrusteeFeeData value) {
        return new JAXBElement<QueryTrusteeFeeData>(_QueryTrusteeFeeData_QNAME, QueryTrusteeFeeData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryTrusteeFeeDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.cnotf.yss.com", name = "queryTrusteeFeeDataResponse")
    public JAXBElement<QueryTrusteeFeeDataResponse> createQueryTrusteeFeeDataResponse(QueryTrusteeFeeDataResponse value) {
        return new JAXBElement<QueryTrusteeFeeDataResponse>(_QueryTrusteeFeeDataResponse_QNAME, QueryTrusteeFeeDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveHandPhotoData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.cnotf.yss.com", name = "saveHandPhotoData")
    public JAXBElement<SaveHandPhotoData> createSaveHandPhotoData(SaveHandPhotoData value) {
        return new JAXBElement<SaveHandPhotoData>(_SaveHandPhotoData_QNAME, SaveHandPhotoData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveHandPhotoDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.cnotf.yss.com", name = "saveHandPhotoDataResponse")
    public JAXBElement<SaveHandPhotoDataResponse> createSaveHandPhotoDataResponse(SaveHandPhotoDataResponse value) {
        return new JAXBElement<SaveHandPhotoDataResponse>(_SaveHandPhotoDataResponse_QNAME, SaveHandPhotoDataResponse.class, null, value);
    }

}
