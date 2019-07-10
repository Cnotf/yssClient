
package saveclient;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;


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
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="deleteFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="photoDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="photoOperationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="photoStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="photoType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "createDate",
    "deleteFlag",
    "id",
    "photoDate",
    "photoOperationDate",
    "photoStatus",
    "photoType"
})
public class HandDateInfo {

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Date createDate;
    protected String deleteFlag;
    protected Long id;
    protected String photoDate;
    protected String photoOperationDate;
    protected String photoStatus;
    protected String photoType;

    /**
     * ��ȡcreateDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * ����createDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateDate(Date value) {
        this.createDate = value;
    }

    /**
     * ��ȡdeleteFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * ����deleteFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeleteFlag(String value) {
        this.deleteFlag = value;
    }

    /**
     * ��ȡid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * ����id���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * ��ȡphotoDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoDate() {
        return photoDate;
    }

    /**
     * ����photoDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoDate(String value) {
        this.photoDate = value;
    }

    /**
     * ��ȡphotoOperationDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoOperationDate() {
        return photoOperationDate;
    }

    /**
     * ����photoOperationDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoOperationDate(String value) {
        this.photoOperationDate = value;
    }

    /**
     * ��ȡphotoStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoStatus() {
        return photoStatus;
    }

    /**
     * ����photoStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoStatus(String value) {
        this.photoStatus = value;
    }

    /**
     * ��ȡphotoType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoType() {
        return photoType;
    }

    /**
     * ����photoType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoType(String value) {
        this.photoType = value;
    }


    @Override
    public String toString() {
        return "HandDateInfo{" +
                "createDate=" + createDate +
                ", deleteFlag='" + deleteFlag + '\'' +
                ", id=" + id +
                ", photoDate='" + photoDate + '\'' +
                ", photoOperationDate='" + photoOperationDate + '\'' +
                ", photoStatus='" + photoStatus + '\'' +
                ", photoType='" + photoType + '\'' +
                '}';
    }
}
