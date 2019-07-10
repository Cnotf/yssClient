
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
 *         &lt;element name="lastQuarterAccDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastQuarterPhotoDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastYearAccDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastYearPhotoDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="quarterAccDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="quarterPhotoDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startAccountDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startPhotoDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startYearAccDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startYearPhotoDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "lastQuarterAccDate",
    "lastQuarterPhotoDate",
    "lastYearAccDate",
    "lastYearPhotoDate",
    "quarterAccDate",
    "quarterPhotoDate",
    "startAccountDate",
    "startPhotoDate",
    "startYearAccDate",
    "startYearPhotoDate"
})
public class BiDateInfo {

    protected String biName;
    protected String endAccountDate;
    protected String endPhotoDate;
    protected String lastQuarterAccDate;
    protected String lastQuarterPhotoDate;
    protected String lastYearAccDate;
    protected String lastYearPhotoDate;
    protected String quarterAccDate;
    protected String quarterPhotoDate;
    protected String startAccountDate;
    protected String startPhotoDate;
    protected String startYearAccDate;
    protected String startYearPhotoDate;

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
     * ��ȡlastQuarterAccDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastQuarterAccDate() {
        return lastQuarterAccDate;
    }

    /**
     * ����lastQuarterAccDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastQuarterAccDate(String value) {
        this.lastQuarterAccDate = value;
    }

    /**
     * ��ȡlastQuarterPhotoDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastQuarterPhotoDate() {
        return lastQuarterPhotoDate;
    }

    /**
     * ����lastQuarterPhotoDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastQuarterPhotoDate(String value) {
        this.lastQuarterPhotoDate = value;
    }

    /**
     * ��ȡlastYearAccDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastYearAccDate() {
        return lastYearAccDate;
    }

    /**
     * ����lastYearAccDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastYearAccDate(String value) {
        this.lastYearAccDate = value;
    }

    /**
     * ��ȡlastYearPhotoDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastYearPhotoDate() {
        return lastYearPhotoDate;
    }

    /**
     * ����lastYearPhotoDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastYearPhotoDate(String value) {
        this.lastYearPhotoDate = value;
    }

    /**
     * ��ȡquarterAccDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuarterAccDate() {
        return quarterAccDate;
    }

    /**
     * ����quarterAccDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuarterAccDate(String value) {
        this.quarterAccDate = value;
    }

    /**
     * ��ȡquarterPhotoDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuarterPhotoDate() {
        return quarterPhotoDate;
    }

    /**
     * ����quarterPhotoDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuarterPhotoDate(String value) {
        this.quarterPhotoDate = value;
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

    /**
     * ��ȡstartYearAccDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartYearAccDate() {
        return startYearAccDate;
    }

    /**
     * ����startYearAccDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartYearAccDate(String value) {
        this.startYearAccDate = value;
    }

    /**
     * ��ȡstartYearPhotoDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartYearPhotoDate() {
        return startYearPhotoDate;
    }

    /**
     * ����startYearPhotoDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartYearPhotoDate(String value) {
        this.startYearPhotoDate = value;
    }


    @Override
    public String toString() {
        return "BiDateInfo{" +
                "biName='" + biName + '\'' +
                ", endAccountDate='" + endAccountDate + '\'' +
                ", endPhotoDate='" + endPhotoDate + '\'' +
                ", lastQuarterAccDate='" + lastQuarterAccDate + '\'' +
                ", lastQuarterPhotoDate='" + lastQuarterPhotoDate + '\'' +
                ", lastYearAccDate='" + lastYearAccDate + '\'' +
                ", lastYearPhotoDate='" + lastYearPhotoDate + '\'' +
                ", quarterAccDate='" + quarterAccDate + '\'' +
                ", quarterPhotoDate='" + quarterPhotoDate + '\'' +
                ", startAccountDate='" + startAccountDate + '\'' +
                ", startPhotoDate='" + startPhotoDate + '\'' +
                ", startYearAccDate='" + startYearAccDate + '\'' +
                ", startYearPhotoDate='" + startYearPhotoDate + '\'' +
                '}';
    }
}
