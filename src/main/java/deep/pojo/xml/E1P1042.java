
package deep.pojo.xml;

import javax.xml.bind.annotation.*;


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
 *         &lt;element name="MANDT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PLVAR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OTYPE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OBJID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
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
 *         &lt;element name="ISTAT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRIOX" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
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
 *         &lt;element name="ENDDA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VARYF" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SEQNR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AEDTM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNAME" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="REASN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HISTO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ITXNR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ACLAS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AMUST" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="REFAK" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BGDAY" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RDAY1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RDAY2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RDAY3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RDAY4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RDAYL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="REFRQ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NDAYS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NHOURS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TABNR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="32"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TABSEQNR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TAGNR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZBLID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
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
    "mandt",
    "plvar",
    "otype",
    "objid",
    "infty",
    "subty",
    "istat",
    "priox",
    "begda",
    "endda",
    "varyf",
    "seqnr",
    "aedtm",
    "uname",
    "reasn",
    "histo",
    "itxnr",
    "aclas",
    "amust",
    "refak",
    "bgday",
    "rday1",
    "rday2",
    "rday3",
    "rday4",
    "rdayl",
    "refrq",
    "ndays",
    "nhours",
    "tabnr",
    "tabseqnr",
    "tagnr",
    "zblid"
})
public class E1P1042 {

    @XmlElement(name = "MANDT")
    protected String mandt;
    @XmlElement(name = "PLVAR")
    protected String plvar;
    @XmlElement(name = "OTYPE")
    protected String otype;
    @XmlElement(name = "OBJID")
    protected String objid;
    @XmlElement(name = "INFTY")
    protected String infty;
    @XmlElement(name = "SUBTY")
    protected String subty;
    @XmlElement(name = "ISTAT")
    protected String istat;
    @XmlElement(name = "PRIOX")
    protected String priox;
    @XmlElement(name = "BEGDA")
    protected String begda;
    @XmlElement(name = "ENDDA")
    protected String endda;
    @XmlElement(name = "VARYF")
    protected String varyf;
    @XmlElement(name = "SEQNR")
    protected String seqnr;
    @XmlElement(name = "AEDTM")
    protected String aedtm;
    @XmlElement(name = "UNAME")
    protected String uname;
    @XmlElement(name = "REASN")
    protected String reasn;
    @XmlElement(name = "HISTO")
    protected String histo;
    @XmlElement(name = "ITXNR")
    protected String itxnr;
    @XmlElement(name = "ACLAS")
    protected String aclas;
    @XmlElement(name = "AMUST")
    protected String amust;
    @XmlElement(name = "REFAK")
    protected String refak;
    @XmlElement(name = "BGDAY")
    protected String bgday;
    @XmlElement(name = "RDAY1")
    protected String rday1;
    @XmlElement(name = "RDAY2")
    protected String rday2;
    @XmlElement(name = "RDAY3")
    protected String rday3;
    @XmlElement(name = "RDAY4")
    protected String rday4;
    @XmlElement(name = "RDAYL")
    protected String rdayl;
    @XmlElement(name = "REFRQ")
    protected String refrq;
    @XmlElement(name = "NDAYS")
    protected String ndays;
    @XmlElement(name = "NHOURS")
    protected String nhours;
    @XmlElement(name = "TABNR")
    protected String tabnr;
    @XmlElement(name = "TABSEQNR")
    protected String tabseqnr;
    @XmlElement(name = "TAGNR")
    protected String tagnr;
    @XmlElement(name = "ZBLID")
    protected String zblid;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Gets the value of the mandt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMANDT() {
        return mandt;
    }

    /**
     * Sets the value of the mandt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMANDT(String value) {
        this.mandt = value;
    }

    /**
     * Gets the value of the plvar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLVAR() {
        return plvar;
    }

    /**
     * Sets the value of the plvar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLVAR(String value) {
        this.plvar = value;
    }

    /**
     * Gets the value of the otype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTYPE() {
        return otype;
    }

    /**
     * Sets the value of the otype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTYPE(String value) {
        this.otype = value;
    }

    /**
     * Gets the value of the objid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBJID() {
        return objid;
    }

    /**
     * Sets the value of the objid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBJID(String value) {
        this.objid = value;
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
     * Gets the value of the istat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISTAT() {
        return istat;
    }

    /**
     * Sets the value of the istat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISTAT(String value) {
        this.istat = value;
    }

    /**
     * Gets the value of the priox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRIOX() {
        return priox;
    }

    /**
     * Sets the value of the priox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRIOX(String value) {
        this.priox = value;
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
     * Gets the value of the varyf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVARYF() {
        return varyf;
    }

    /**
     * Sets the value of the varyf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVARYF(String value) {
        this.varyf = value;
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
     * Gets the value of the aedtm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAEDTM() {
        return aedtm;
    }

    /**
     * Sets the value of the aedtm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAEDTM(String value) {
        this.aedtm = value;
    }

    /**
     * Gets the value of the uname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNAME() {
        return uname;
    }

    /**
     * Sets the value of the uname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNAME(String value) {
        this.uname = value;
    }

    /**
     * Gets the value of the reasn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREASN() {
        return reasn;
    }

    /**
     * Sets the value of the reasn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREASN(String value) {
        this.reasn = value;
    }

    /**
     * Gets the value of the histo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHISTO() {
        return histo;
    }

    /**
     * Sets the value of the histo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHISTO(String value) {
        this.histo = value;
    }

    /**
     * Gets the value of the itxnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITXNR() {
        return itxnr;
    }

    /**
     * Sets the value of the itxnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITXNR(String value) {
        this.itxnr = value;
    }

    /**
     * Gets the value of the aclas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACLAS() {
        return aclas;
    }

    /**
     * Sets the value of the aclas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACLAS(String value) {
        this.aclas = value;
    }

    /**
     * Gets the value of the amust property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMUST() {
        return amust;
    }

    /**
     * Sets the value of the amust property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMUST(String value) {
        this.amust = value;
    }

    /**
     * Gets the value of the refak property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFAK() {
        return refak;
    }

    /**
     * Sets the value of the refak property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFAK(String value) {
        this.refak = value;
    }

    /**
     * Gets the value of the bgday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBGDAY() {
        return bgday;
    }

    /**
     * Sets the value of the bgday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBGDAY(String value) {
        this.bgday = value;
    }

    /**
     * Gets the value of the rday1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRDAY1() {
        return rday1;
    }

    /**
     * Sets the value of the rday1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRDAY1(String value) {
        this.rday1 = value;
    }

    /**
     * Gets the value of the rday2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRDAY2() {
        return rday2;
    }

    /**
     * Sets the value of the rday2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRDAY2(String value) {
        this.rday2 = value;
    }

    /**
     * Gets the value of the rday3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRDAY3() {
        return rday3;
    }

    /**
     * Sets the value of the rday3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRDAY3(String value) {
        this.rday3 = value;
    }

    /**
     * Gets the value of the rday4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRDAY4() {
        return rday4;
    }

    /**
     * Sets the value of the rday4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRDAY4(String value) {
        this.rday4 = value;
    }

    /**
     * Gets the value of the rdayl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRDAYL() {
        return rdayl;
    }

    /**
     * Sets the value of the rdayl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRDAYL(String value) {
        this.rdayl = value;
    }

    /**
     * Gets the value of the refrq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFRQ() {
        return refrq;
    }

    /**
     * Sets the value of the refrq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFRQ(String value) {
        this.refrq = value;
    }

    /**
     * Gets the value of the ndays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNDAYS() {
        return ndays;
    }

    /**
     * Sets the value of the ndays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNDAYS(String value) {
        this.ndays = value;
    }

    /**
     * Gets the value of the nhours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNHOURS() {
        return nhours;
    }

    /**
     * Sets the value of the nhours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNHOURS(String value) {
        this.nhours = value;
    }

    /**
     * Gets the value of the tabnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTABNR() {
        return tabnr;
    }

    /**
     * Sets the value of the tabnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTABNR(String value) {
        this.tabnr = value;
    }

    /**
     * Gets the value of the tabseqnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTABSEQNR() {
        return tabseqnr;
    }

    /**
     * Sets the value of the tabseqnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTABSEQNR(String value) {
        this.tabseqnr = value;
    }

    /**
     * Gets the value of the tagnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAGNR() {
        return tagnr;
    }

    /**
     * Sets the value of the tagnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAGNR(String value) {
        this.tagnr = value;
    }

    /**
     * Gets the value of the zblid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZBLID() {
        return zblid;
    }

    /**
     * Sets the value of the zblid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZBLID(String value) {
        this.zblid = value;
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
