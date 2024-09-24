
package deep.pojo.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PERNR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INFTY" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SUBTY" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OBJPS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SPRPS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ENDDA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BEGDA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SEQNR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INV16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IPT16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IAM16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INV17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IPT17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IAM17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INV18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IPT18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IAM18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INV19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IPT19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IAM19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INV20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IPT20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IAM20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EEPCT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PTPCT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPPCT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BCPCT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="SEGMENT" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pernr",
    "infty",
    "subty",
    "objps",
    "sprps",
    "endda",
    "begda",
    "seqnr",
    "inv16",
    "ipt16",
    "iam16",
    "inv17",
    "ipt17",
    "iam17",
    "inv18",
    "ipt18",
    "iam18",
    "inv19",
    "ipt19",
    "iam19",
    "inv20",
    "ipt20",
    "iam20",
    "eepct",
    "ptpct",
    "bppct",
    "bcpct"
})
public class E1Q0169 {

    @XmlElement(name = "PERNR")
    protected String pernr;
    @XmlElement(name = "INFTY")
    protected String infty;
    @XmlElement(name = "SUBTY")
    protected String subty;
    @XmlElement(name = "OBJPS")
    protected String objps;
    @XmlElement(name = "SPRPS")
    protected String sprps;
    @XmlElement(name = "ENDDA")
    protected String endda;
    @XmlElement(name = "BEGDA")
    protected String begda;
    @XmlElement(name = "SEQNR")
    protected String seqnr;
    @XmlElement(name = "INV16")
    protected String inv16;
    @XmlElement(name = "IPT16")
    protected String ipt16;
    @XmlElement(name = "IAM16")
    protected String iam16;
    @XmlElement(name = "INV17")
    protected String inv17;
    @XmlElement(name = "IPT17")
    protected String ipt17;
    @XmlElement(name = "IAM17")
    protected String iam17;
    @XmlElement(name = "INV18")
    protected String inv18;
    @XmlElement(name = "IPT18")
    protected String ipt18;
    @XmlElement(name = "IAM18")
    protected String iam18;
    @XmlElement(name = "INV19")
    protected String inv19;
    @XmlElement(name = "IPT19")
    protected String ipt19;
    @XmlElement(name = "IAM19")
    protected String iam19;
    @XmlElement(name = "INV20")
    protected String inv20;
    @XmlElement(name = "IPT20")
    protected String ipt20;
    @XmlElement(name = "IAM20")
    protected String iam20;
    @XmlElement(name = "EEPCT")
    protected String eepct;
    @XmlElement(name = "PTPCT")
    protected String ptpct;
    @XmlElement(name = "BPPCT")
    protected String bppct;
    @XmlElement(name = "BCPCT")
    protected String bcpct;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Gets the value of the pernr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERNR() {
        return pernr;
    }

    /**
     * Sets the value of the pernr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERNR(String value) {
        this.pernr = value;
    }

    /**
     * Gets the value of the infty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINFTY() {
        return infty;
    }

    /**
     * Sets the value of the infty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINFTY(String value) {
        this.infty = value;
    }

    /**
     * Gets the value of the subty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBTY() {
        return subty;
    }

    /**
     * Sets the value of the subty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBTY(String value) {
        this.subty = value;
    }

    /**
     * Gets the value of the objps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBJPS() {
        return objps;
    }

    /**
     * Sets the value of the objps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBJPS(String value) {
        this.objps = value;
    }

    /**
     * Gets the value of the sprps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPRPS() {
        return sprps;
    }

    /**
     * Sets the value of the sprps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPRPS(String value) {
        this.sprps = value;
    }

    /**
     * Gets the value of the endda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENDDA() {
        return endda;
    }

    /**
     * Sets the value of the endda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENDDA(String value) {
        this.endda = value;
    }

    /**
     * Gets the value of the begda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEGDA() {
        return begda;
    }

    /**
     * Sets the value of the begda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBEGDA(String value) {
        this.begda = value;
    }

    /**
     * Gets the value of the seqnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEQNR() {
        return seqnr;
    }

    /**
     * Sets the value of the seqnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEQNR(String value) {
        this.seqnr = value;
    }

    /**
     * Gets the value of the inv16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINV16() {
        return inv16;
    }

    /**
     * Sets the value of the inv16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINV16(String value) {
        this.inv16 = value;
    }

    /**
     * Gets the value of the ipt16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPT16() {
        return ipt16;
    }

    /**
     * Sets the value of the ipt16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPT16(String value) {
        this.ipt16 = value;
    }

    /**
     * Gets the value of the iam16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIAM16() {
        return iam16;
    }

    /**
     * Sets the value of the iam16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIAM16(String value) {
        this.iam16 = value;
    }

    /**
     * Gets the value of the inv17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINV17() {
        return inv17;
    }

    /**
     * Sets the value of the inv17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINV17(String value) {
        this.inv17 = value;
    }

    /**
     * Gets the value of the ipt17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPT17() {
        return ipt17;
    }

    /**
     * Sets the value of the ipt17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPT17(String value) {
        this.ipt17 = value;
    }

    /**
     * Gets the value of the iam17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIAM17() {
        return iam17;
    }

    /**
     * Sets the value of the iam17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIAM17(String value) {
        this.iam17 = value;
    }

    /**
     * Gets the value of the inv18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINV18() {
        return inv18;
    }

    /**
     * Sets the value of the inv18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINV18(String value) {
        this.inv18 = value;
    }

    /**
     * Gets the value of the ipt18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPT18() {
        return ipt18;
    }

    /**
     * Sets the value of the ipt18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPT18(String value) {
        this.ipt18 = value;
    }

    /**
     * Gets the value of the iam18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIAM18() {
        return iam18;
    }

    /**
     * Sets the value of the iam18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIAM18(String value) {
        this.iam18 = value;
    }

    /**
     * Gets the value of the inv19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINV19() {
        return inv19;
    }

    /**
     * Sets the value of the inv19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINV19(String value) {
        this.inv19 = value;
    }

    /**
     * Gets the value of the ipt19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPT19() {
        return ipt19;
    }

    /**
     * Sets the value of the ipt19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPT19(String value) {
        this.ipt19 = value;
    }

    /**
     * Gets the value of the iam19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIAM19() {
        return iam19;
    }

    /**
     * Sets the value of the iam19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIAM19(String value) {
        this.iam19 = value;
    }

    /**
     * Gets the value of the inv20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINV20() {
        return inv20;
    }

    /**
     * Sets the value of the inv20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINV20(String value) {
        this.inv20 = value;
    }

    /**
     * Gets the value of the ipt20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPT20() {
        return ipt20;
    }

    /**
     * Sets the value of the ipt20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPT20(String value) {
        this.ipt20 = value;
    }

    /**
     * Gets the value of the iam20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIAM20() {
        return iam20;
    }

    /**
     * Sets the value of the iam20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIAM20(String value) {
        this.iam20 = value;
    }

    /**
     * Gets the value of the eepct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEEPCT() {
        return eepct;
    }

    /**
     * Sets the value of the eepct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEEPCT(String value) {
        this.eepct = value;
    }

    /**
     * Gets the value of the ptpct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTPCT() {
        return ptpct;
    }

    /**
     * Sets the value of the ptpct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTPCT(String value) {
        this.ptpct = value;
    }

    /**
     * Gets the value of the bppct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPPCT() {
        return bppct;
    }

    /**
     * Sets the value of the bppct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPPCT(String value) {
        this.bppct = value;
    }

    /**
     * Gets the value of the bcpct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCPCT() {
        return bcpct;
    }

    /**
     * Sets the value of the bcpct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCPCT(String value) {
        this.bcpct = value;
    }

    /**
     * Gets the value of the segment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEGMENT() {
        return segment;
    }

    /**
     * Sets the value of the segment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEGMENT(String value) {
        this.segment = value;
    }

}
