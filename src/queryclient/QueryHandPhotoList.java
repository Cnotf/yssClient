
package queryclient;

import saveclient.HandDateInfo;

import javax.xml.bind.annotation.*;


/**
 * <p>queryHandPhotoList complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="queryHandPhotoList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://services.cnotf.yss.com}handDateInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryhandphotolist", propOrder = {
    "arg0"
})
public class QueryHandPhotoList {

    protected HandDateInfo arg0;

    /**
     * ��ȡarg0���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link HandDateInfo }
     *     
     */
    public HandDateInfo getArg0() {
        return arg0;
    }

    /**
     * ����arg0���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link HandDateInfo }
     *     
     */
    public void setArg0(HandDateInfo value) {
        this.arg0 = value;
    }

}
