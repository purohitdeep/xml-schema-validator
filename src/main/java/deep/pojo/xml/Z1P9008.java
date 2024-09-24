
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
 *         &lt;element name="TRFAR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TRFGB" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TRFGR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TRFST" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WAERS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VGLTA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VGLGB" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VGLGR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VGLST" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CPIND" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BSGRD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DIVGV" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANSAL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="17"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANCUR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="STVOR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ORZST" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PARTN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VGLSV" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FALGK" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FALGR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FLAGA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
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
    "aedtm",
    "uname",
    "trfar",
    "trfgb",
    "trfgr",
    "trfst",
    "waers",
    "vglta",
    "vglgb",
    "vglgr",
    "vglst",
    "cpind",
    "bsgrd",
    "divgv",
    "ansal",
    "ancur",
    "stvor",
    "orzst",
    "partn",
    "vglsv",
    "falgk",
    "falgr",
    "flaga"
})
public class Z1P9008 {

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
    @XmlElement(name = "AEDTM")
    protected String aedtm;
    @XmlElement(name = "UNAME")
    protected String uname;
    @XmlElement(name = "TRFAR")
    protected String trfar;
    @XmlElement(name = "TRFGB")
    protected String trfgb;
    @XmlElement(name = "TRFGR")
    protected String trfgr;
    @XmlElement(name = "TRFST")
    protected String trfst;
    @XmlElement(name = "WAERS")
    protected String waers;
    @XmlElement(name = "VGLTA")
    protected String vglta;
    @XmlElement(name = "VGLGB")
    protected String vglgb;
    @XmlElement(name = "VGLGR")
    protected String vglgr;
    @XmlElement(name = "VGLST")
    protected String vglst;
    @XmlElement(name = "CPIND")
    protected String cpind;
    @XmlElement(name = "BSGRD")
    protected String bsgrd;
    @XmlElement(name = "DIVGV")
    protected String divgv;
    @XmlElement(name = "ANSAL")
    protected String ansal;
    @XmlElement(name = "ANCUR")
    protected String ancur;
    @XmlElement(name = "STVOR")
    protected String stvor;
    @XmlElement(name = "ORZST")
    protected String orzst;
    @XmlElement(name = "PARTN")
    protected String partn;
    @XmlElement(name = "VGLSV")
    protected String vglsv;
    @XmlElement(name = "FALGK")
    protected String falgk;
    @XmlElement(name = "FALGR")
    protected String falgr;
    @XmlElement(name = "FLAGA")
    protected String flaga;
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
     * Gets the value of the trfar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRFAR() {
        return trfar;
    }

    /**
     * Sets the value of the trfar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRFAR(String value) {
        this.trfar = value;
    }

    /**
     * Gets the value of the trfgb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRFGB() {
        return trfgb;
    }

    /**
     * Sets the value of the trfgb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRFGB(String value) {
        this.trfgb = value;
    }

    /**
     * Gets the value of the trfgr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRFGR() {
        return trfgr;
    }

    /**
     * Sets the value of the trfgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRFGR(String value) {
        this.trfgr = value;
    }

    /**
     * Gets the value of the trfst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRFST() {
        return trfst;
    }

    /**
     * Sets the value of the trfst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRFST(String value) {
        this.trfst = value;
    }

    /**
     * Gets the value of the waers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAERS() {
        return waers;
    }

    /**
     * Sets the value of the waers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAERS(String value) {
        this.waers = value;
    }

    /**
     * Gets the value of the vglta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVGLTA() {
        return vglta;
    }

    /**
     * Sets the value of the vglta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVGLTA(String value) {
        this.vglta = value;
    }

    /**
     * Gets the value of the vglgb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVGLGB() {
        return vglgb;
    }

    /**
     * Sets the value of the vglgb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVGLGB(String value) {
        this.vglgb = value;
    }

    /**
     * Gets the value of the vglgr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVGLGR() {
        return vglgr;
    }

    /**
     * Sets the value of the vglgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVGLGR(String value) {
        this.vglgr = value;
    }

    /**
     * Gets the value of the vglst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVGLST() {
        return vglst;
    }

    /**
     * Sets the value of the vglst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVGLST(String value) {
        this.vglst = value;
    }

    /**
     * Gets the value of the cpind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPIND() {
        return cpind;
    }

    /**
     * Sets the value of the cpind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPIND(String value) {
        this.cpind = value;
    }

    /**
     * Gets the value of the bsgrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSGRD() {
        return bsgrd;
    }

    /**
     * Sets the value of the bsgrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSGRD(String value) {
        this.bsgrd = value;
    }

    /**
     * Gets the value of the divgv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIVGV() {
        return divgv;
    }

    /**
     * Sets the value of the divgv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIVGV(String value) {
        this.divgv = value;
    }

    /**
     * Gets the value of the ansal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANSAL() {
        return ansal;
    }

    /**
     * Sets the value of the ansal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANSAL(String value) {
        this.ansal = value;
    }

    /**
     * Gets the value of the ancur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANCUR() {
        return ancur;
    }

    /**
     * Sets the value of the ancur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANCUR(String value) {
        this.ancur = value;
    }

    /**
     * Gets the value of the stvor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTVOR() {
        return stvor;
    }

    /**
     * Sets the value of the stvor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTVOR(String value) {
        this.stvor = value;
    }

    /**
     * Gets the value of the orzst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORZST() {
        return orzst;
    }

    /**
     * Sets the value of the orzst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORZST(String value) {
        this.orzst = value;
    }

    /**
     * Gets the value of the partn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARTN() {
        return partn;
    }

    /**
     * Sets the value of the partn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARTN(String value) {
        this.partn = value;
    }

    /**
     * Gets the value of the vglsv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVGLSV() {
        return vglsv;
    }

    /**
     * Sets the value of the vglsv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVGLSV(String value) {
        this.vglsv = value;
    }

    /**
     * Gets the value of the falgk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFALGK() {
        return falgk;
    }

    /**
     * Sets the value of the falgk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFALGK(String value) {
        this.falgk = value;
    }

    /**
     * Gets the value of the falgr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFALGR() {
        return falgr;
    }

    /**
     * Sets the value of the falgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFALGR(String value) {
        this.falgr = value;
    }

    /**
     * Gets the value of the flaga property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGA() {
        return flaga;
    }

    /**
     * Sets the value of the flaga property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGA(String value) {
        this.flaga = value;
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
