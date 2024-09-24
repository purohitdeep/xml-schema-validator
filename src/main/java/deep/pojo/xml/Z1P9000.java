
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
 *         &lt;element name="LANGU" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BUKRS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BUTXT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PLANS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PLANSTXT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ORGEH" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ORGEHTXT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PERNRMGR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NACHNMGR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VORNAMGR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FLAGMGR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="STELL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="STELLTXT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BUTYPE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BUCODE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CFTYPE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CFCODE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
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
 *         &lt;element name="WERKSTXT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BTRTLTXT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="STATE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LTEXT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MGTXT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AMPNR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AMSUR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AMFIN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="STELLTRU" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SHORT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KOSTX" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
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
    "langu",
    "bukrs",
    "butxt",
    "plans",
    "planstxt",
    "orgeh",
    "orgehtxt",
    "pernrmgr",
    "nachnmgr",
    "vornamgr",
    "flagmgr",
    "stell",
    "stelltxt",
    "butype",
    "bucode",
    "cftype",
    "cfcode",
    "trfgr",
    "werkstxt",
    "btrtltxt",
    "state",
    "ltext",
    "mgtxt",
    "ampnr",
    "amsur",
    "amfin",
    "stelltru",
    "_short",
    "kostx"
})
public class Z1P9000 {

    @XmlElement(name = "PERNR")
    protected String pernr;
    @XmlElement(name = "LANGU")
    protected String langu;
    @XmlElement(name = "BUKRS")
    protected String bukrs;
    @XmlElement(name = "BUTXT")
    protected String butxt;
    @XmlElement(name = "PLANS")
    protected String plans;
    @XmlElement(name = "PLANSTXT")
    protected String planstxt;
    @XmlElement(name = "ORGEH")
    protected String orgeh;
    @XmlElement(name = "ORGEHTXT")
    protected String orgehtxt;
    @XmlElement(name = "PERNRMGR")
    protected String pernrmgr;
    @XmlElement(name = "NACHNMGR")
    protected String nachnmgr;
    @XmlElement(name = "VORNAMGR")
    protected String vornamgr;
    @XmlElement(name = "FLAGMGR")
    protected String flagmgr;
    @XmlElement(name = "STELL")
    protected String stell;
    @XmlElement(name = "STELLTXT")
    protected String stelltxt;
    @XmlElement(name = "BUTYPE")
    protected String butype;
    @XmlElement(name = "BUCODE")
    protected String bucode;
    @XmlElement(name = "CFTYPE")
    protected String cftype;
    @XmlElement(name = "CFCODE")
    protected String cfcode;
    @XmlElement(name = "TRFGR")
    protected String trfgr;
    @XmlElement(name = "WERKSTXT")
    protected String werkstxt;
    @XmlElement(name = "BTRTLTXT")
    protected String btrtltxt;
    @XmlElement(name = "STATE")
    protected String state;
    @XmlElement(name = "LTEXT")
    protected String ltext;
    @XmlElement(name = "MGTXT")
    protected String mgtxt;
    @XmlElement(name = "AMPNR")
    protected String ampnr;
    @XmlElement(name = "AMSUR")
    protected String amsur;
    @XmlElement(name = "AMFIN")
    protected String amfin;
    @XmlElement(name = "STELLTRU")
    protected String stelltru;
    @XmlElement(name = "SHORT")
    protected String _short;
    @XmlElement(name = "KOSTX")
    protected String kostx;
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
     * Gets the value of the langu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU() {
        return langu;
    }

    /**
     * Sets the value of the langu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU(String value) {
        this.langu = value;
    }

    /**
     * Gets the value of the bukrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUKRS() {
        return bukrs;
    }

    /**
     * Sets the value of the bukrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUKRS(String value) {
        this.bukrs = value;
    }

    /**
     * Gets the value of the butxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUTXT() {
        return butxt;
    }

    /**
     * Sets the value of the butxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUTXT(String value) {
        this.butxt = value;
    }

    /**
     * Gets the value of the plans property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLANS() {
        return plans;
    }

    /**
     * Sets the value of the plans property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLANS(String value) {
        this.plans = value;
    }

    /**
     * Gets the value of the planstxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLANSTXT() {
        return planstxt;
    }

    /**
     * Sets the value of the planstxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLANSTXT(String value) {
        this.planstxt = value;
    }

    /**
     * Gets the value of the orgeh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORGEH() {
        return orgeh;
    }

    /**
     * Sets the value of the orgeh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORGEH(String value) {
        this.orgeh = value;
    }

    /**
     * Gets the value of the orgehtxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORGEHTXT() {
        return orgehtxt;
    }

    /**
     * Sets the value of the orgehtxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORGEHTXT(String value) {
        this.orgehtxt = value;
    }

    /**
     * Gets the value of the pernrmgr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERNRMGR() {
        return pernrmgr;
    }

    /**
     * Sets the value of the pernrmgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERNRMGR(String value) {
        this.pernrmgr = value;
    }

    /**
     * Gets the value of the nachnmgr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNACHNMGR() {
        return nachnmgr;
    }

    /**
     * Sets the value of the nachnmgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNACHNMGR(String value) {
        this.nachnmgr = value;
    }

    /**
     * Gets the value of the vornamgr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVORNAMGR() {
        return vornamgr;
    }

    /**
     * Sets the value of the vornamgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVORNAMGR(String value) {
        this.vornamgr = value;
    }

    /**
     * Gets the value of the flagmgr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGMGR() {
        return flagmgr;
    }

    /**
     * Sets the value of the flagmgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGMGR(String value) {
        this.flagmgr = value;
    }

    /**
     * Gets the value of the stell property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTELL() {
        return stell;
    }

    /**
     * Sets the value of the stell property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTELL(String value) {
        this.stell = value;
    }

    /**
     * Gets the value of the stelltxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTELLTXT() {
        return stelltxt;
    }

    /**
     * Sets the value of the stelltxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTELLTXT(String value) {
        this.stelltxt = value;
    }

    /**
     * Gets the value of the butype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUTYPE() {
        return butype;
    }

    /**
     * Sets the value of the butype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUTYPE(String value) {
        this.butype = value;
    }

    /**
     * Gets the value of the bucode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUCODE() {
        return bucode;
    }

    /**
     * Sets the value of the bucode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUCODE(String value) {
        this.bucode = value;
    }

    /**
     * Gets the value of the cftype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCFTYPE() {
        return cftype;
    }

    /**
     * Sets the value of the cftype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCFTYPE(String value) {
        this.cftype = value;
    }

    /**
     * Gets the value of the cfcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCFCODE() {
        return cfcode;
    }

    /**
     * Sets the value of the cfcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCFCODE(String value) {
        this.cfcode = value;
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
     * Gets the value of the werkstxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWERKSTXT() {
        return werkstxt;
    }

    /**
     * Sets the value of the werkstxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWERKSTXT(String value) {
        this.werkstxt = value;
    }

    /**
     * Gets the value of the btrtltxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBTRTLTXT() {
        return btrtltxt;
    }

    /**
     * Sets the value of the btrtltxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBTRTLTXT(String value) {
        this.btrtltxt = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATE() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATE(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the ltext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLTEXT() {
        return ltext;
    }

    /**
     * Sets the value of the ltext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLTEXT(String value) {
        this.ltext = value;
    }

    /**
     * Gets the value of the mgtxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMGTXT() {
        return mgtxt;
    }

    /**
     * Sets the value of the mgtxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMGTXT(String value) {
        this.mgtxt = value;
    }

    /**
     * Gets the value of the ampnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMPNR() {
        return ampnr;
    }

    /**
     * Sets the value of the ampnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMPNR(String value) {
        this.ampnr = value;
    }

    /**
     * Gets the value of the amsur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMSUR() {
        return amsur;
    }

    /**
     * Sets the value of the amsur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMSUR(String value) {
        this.amsur = value;
    }

    /**
     * Gets the value of the amfin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMFIN() {
        return amfin;
    }

    /**
     * Sets the value of the amfin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMFIN(String value) {
        this.amfin = value;
    }

    /**
     * Gets the value of the stelltru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTELLTRU() {
        return stelltru;
    }

    /**
     * Sets the value of the stelltru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTELLTRU(String value) {
        this.stelltru = value;
    }

    /**
     * Gets the value of the short property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHORT() {
        return _short;
    }

    /**
     * Sets the value of the short property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHORT(String value) {
        this._short = value;
    }

    /**
     * Gets the value of the kostx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOSTX() {
        return kostx;
    }

    /**
     * Sets the value of the kostx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOSTX(String value) {
        this.kostx = value;
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
