
package saveclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>biDateInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="biDateInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="biName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endAccountDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endPhotoDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startAccountDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startPhotoDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "biDateInfo", propOrder = {
    "biName",
    "endAccountDate",
    "endPhotoDate",
    "startAccountDate",
    "startPhotoDate"
})
public class BiDateInfo {

    protected String biName;
    protected String endAccountDate;
    protected String endPhotoDate;
    protected String startAccountDate;
    protected String startPhotoDate;

    /**
     * ��ȡbiName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBiName() {
        return biName;
    }

    /**
     * ����biName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiName(String value) {
        this.biName = value;
    }

    /**
     * ��ȡendAccountDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndAccountDate() {
        return endAccountDate;
    }

    /**
     * ����endAccountDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndAccountDate(String value) {
        this.endAccountDate = value;
    }

    /**
     * ��ȡendPhotoDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndPhotoDate() {
        return endPhotoDate;
    }

    /**
     * ����endPhotoDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndPhotoDate(String value) {
        this.endPhotoDate = value;
    }

    /**
     * ��ȡstartAccountDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartAccountDate() {
        return startAccountDate;
    }

    /**
     * ����startAccountDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartAccountDate(String value) {
        this.startAccountDate = value;
    }

    /**
     * ��ȡstartPhotoDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartPhotoDate() {
        return startPhotoDate;
    }

    /**
     * ����startPhotoDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartPhotoDate(String value) {
        this.startPhotoDate = value;
    }


    @Override
    public String toString() {
        return "BiDateInfo{" +
                "biName='" + biName + '\'' +
                ", endAccountDate='" + endAccountDate + '\'' +
                ", endPhotoDate='" + endPhotoDate + '\'' +
                ", startAccountDate='" + startAccountDate + '\'' +
                ", startPhotoDate='" + startPhotoDate + '\'' +
                '}';
    }
}
