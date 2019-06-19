
package queryclient;

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

    private final static QName _QueryTrusteeFeeData_QNAME = new QName("http://services.cnotf.yss.com", "queryTrusteeFeeData");
    private final static QName _QueryTrusteeFeeDataResponse_QNAME = new QName("http://services.cnotf.yss.com", "queryTrusteeFeeDataResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.yss.cnotf.services
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link TrusteeFeeInfo }
     * 
     */
    public TrusteeFeeInfo createTrusteeFeeInfo() {
        return new TrusteeFeeInfo();
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

}
