
package client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>handDateInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="handDateInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beginHandDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endHandDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "handDateInfo", propOrder = {
    "beginHandDate",
    "endHandDate"
})
public class HandDateInfo {

    protected String beginHandDate;
    protected String endHandDate;

    /**
     * ��ȡbeginHandDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeginHandDate() {
        return beginHandDate;
    }

    /**
     * ����beginHandDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginHandDate(String value) {
        this.beginHandDate = value;
    }

    /**
     * ��ȡendHandDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndHandDate() {
        return endHandDate;
    }

    /**
     * ����endHandDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndHandDate(String value) {
        this.endHandDate = value;
    }

    @Override
    public String toString() {
        return "HandDateInfo{" +
                "beginHandDate='" + beginHandDate + '\'' +
                ", endHandDate='" + endHandDate + '\'' +
                '}';
    }

}
