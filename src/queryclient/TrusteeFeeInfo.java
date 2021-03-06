
package queryclient;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * <p>trusteeFeeInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="trusteeFeeInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="intGrpCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="intGrpNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isRltv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pymAccNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pymDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rcptAccNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="scrType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trusteeFeeInfo", propOrder = {
    "amt",
    "id",
    "intGrpCd",
    "intGrpNm",
    "isRltv",
    "pymAccNo",
    "pymDt",
    "rcptAccNo",
    "scrType",
    "page",
    "rows",
    "total"
})
public class TrusteeFeeInfo {

    protected BigDecimal amt;
    protected BigInteger id;
    protected String intGrpCd;
    protected String intGrpNm;
    protected String isRltv;
    protected String pymAccNo;
    protected String pymDt;
    protected String rcptAccNo;
    protected String scrType;

    /**
     * 页数
     */
    protected Integer page;
    /**
     * 每页条数
     */
    protected Integer rows;
    /**
     * 总数
     */
    protected Integer total;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    /**
     * ��ȡamt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * ����amt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmt(BigDecimal value) {
        this.amt = value;
    }

    /**
     * ��ȡid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * ����id���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * ��ȡintGrpCd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntGrpCd() {
        return intGrpCd;
    }

    /**
     * ����intGrpCd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntGrpCd(String value) {
        this.intGrpCd = value;
    }

    /**
     * ��ȡintGrpNm���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntGrpNm() {
        return intGrpNm;
    }

    /**
     * ����intGrpNm���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntGrpNm(String value) {
        this.intGrpNm = value;
    }

    /**
     * ��ȡisRltv���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsRltv() {
        return isRltv;
    }

    /**
     * ����isRltv���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsRltv(String value) {
        this.isRltv = value;
    }

    /**
     * ��ȡpymAccNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPymAccNo() {
        return pymAccNo;
    }

    /**
     * ����pymAccNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPymAccNo(String value) {
        this.pymAccNo = value;
    }

    /**
     * ��ȡpymDt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPymDt() {
        return pymDt;
    }

    /**
     * ����pymDt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPymDt(String value) {
        this.pymDt = value;
    }

    /**
     * ��ȡrcptAccNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcptAccNo() {
        return rcptAccNo;
    }

    /**
     * ����rcptAccNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcptAccNo(String value) {
        this.rcptAccNo = value;
    }

    /**
     * ��ȡscrType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScrType() {
        return scrType;
    }

    /**
     * ����scrType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScrType(String value) {
        this.scrType = value;
    }

    @Override
    public String toString() {
        return "TrusteeFeeInfo{" +
                "amt=" + amt +
                ", id=" + id +
                ", intGrpCd='" + intGrpCd + '\'' +
                ", intGrpNm='" + intGrpNm + '\'' +
                ", isRltv='" + isRltv + '\'' +
                ", pymAccNo='" + pymAccNo + '\'' +
                ", pymDt='" + pymDt + '\'' +
                ", rcptAccNo='" + rcptAccNo + '\'' +
                ", scrType='" + scrType + '\'' +
                '}';
    }
}
