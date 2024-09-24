
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
 *         &lt;element name="PLI03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PLI04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PLI05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PLI06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PLI07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PLI08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PLI09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PLI10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PLI11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PLI12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BSMOD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MUSER" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GRPVL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DOFOSO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RSA01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RSA02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RSA03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RSA04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RSA05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RSA06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RSA07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RSA08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RSA09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RSA10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RSA11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RSA12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PERCO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCBAM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DADAM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DRFOS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FOSON" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FOSOR" minOccurs="0"&gt;
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
    "pli03",
    "pli04",
    "pli05",
    "pli06",
    "pli07",
    "pli08",
    "pli09",
    "pli10",
    "pli11",
    "pli12",
    "bsmod",
    "muser",
    "grpvl",
    "dofoso",
    "rsa01",
    "rsa02",
    "rsa03",
    "rsa04",
    "rsa05",
    "rsa06",
    "rsa07",
    "rsa08",
    "rsa09",
    "rsa10",
    "rsa11",
    "rsa12",
    "perco",
    "ccbam",
    "dadam",
    "drfos",
    "foson",
    "fosor"
})
public class E1Q0098 {

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
    @XmlElement(name = "PLI03")
    protected String pli03;
    @XmlElement(name = "PLI04")
    protected String pli04;
    @XmlElement(name = "PLI05")
    protected String pli05;
    @XmlElement(name = "PLI06")
    protected String pli06;
    @XmlElement(name = "PLI07")
    protected String pli07;
    @XmlElement(name = "PLI08")
    protected String pli08;
    @XmlElement(name = "PLI09")
    protected String pli09;
    @XmlElement(name = "PLI10")
    protected String pli10;
    @XmlElement(name = "PLI11")
    protected String pli11;
    @XmlElement(name = "PLI12")
    protected String pli12;
    @XmlElement(name = "BSMOD")
    protected String bsmod;
    @XmlElement(name = "MUSER")
    protected String muser;
    @XmlElement(name = "GRPVL")
    protected String grpvl;
    @XmlElement(name = "DOFOSO")
    protected String dofoso;
    @XmlElement(name = "RSA01")
    protected String rsa01;
    @XmlElement(name = "RSA02")
    protected String rsa02;
    @XmlElement(name = "RSA03")
    protected String rsa03;
    @XmlElement(name = "RSA04")
    protected String rsa04;
    @XmlElement(name = "RSA05")
    protected String rsa05;
    @XmlElement(name = "RSA06")
    protected String rsa06;
    @XmlElement(name = "RSA07")
    protected String rsa07;
    @XmlElement(name = "RSA08")
    protected String rsa08;
    @XmlElement(name = "RSA09")
    protected String rsa09;
    @XmlElement(name = "RSA10")
    protected String rsa10;
    @XmlElement(name = "RSA11")
    protected String rsa11;
    @XmlElement(name = "RSA12")
    protected String rsa12;
    @XmlElement(name = "PERCO")
    protected String perco;
    @XmlElement(name = "CCBAM")
    protected String ccbam;
    @XmlElement(name = "DADAM")
    protected String dadam;
    @XmlElement(name = "DRFOS")
    protected String drfos;
    @XmlElement(name = "FOSON")
    protected String foson;
    @XmlElement(name = "FOSOR")
    protected String fosor;
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
     * Gets the value of the pli03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLI03() {
        return pli03;
    }

    /**
     * Sets the value of the pli03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLI03(String value) {
        this.pli03 = value;
    }

    /**
     * Gets the value of the pli04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLI04() {
        return pli04;
    }

    /**
     * Sets the value of the pli04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLI04(String value) {
        this.pli04 = value;
    }

    /**
     * Gets the value of the pli05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLI05() {
        return pli05;
    }

    /**
     * Sets the value of the pli05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLI05(String value) {
        this.pli05 = value;
    }

    /**
     * Gets the value of the pli06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLI06() {
        return pli06;
    }

    /**
     * Sets the value of the pli06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLI06(String value) {
        this.pli06 = value;
    }

    /**
     * Gets the value of the pli07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLI07() {
        return pli07;
    }

    /**
     * Sets the value of the pli07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLI07(String value) {
        this.pli07 = value;
    }

    /**
     * Gets the value of the pli08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLI08() {
        return pli08;
    }

    /**
     * Sets the value of the pli08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLI08(String value) {
        this.pli08 = value;
    }

    /**
     * Gets the value of the pli09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLI09() {
        return pli09;
    }

    /**
     * Sets the value of the pli09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLI09(String value) {
        this.pli09 = value;
    }

    /**
     * Gets the value of the pli10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLI10() {
        return pli10;
    }

    /**
     * Sets the value of the pli10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLI10(String value) {
        this.pli10 = value;
    }

    /**
     * Gets the value of the pli11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLI11() {
        return pli11;
    }

    /**
     * Sets the value of the pli11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLI11(String value) {
        this.pli11 = value;
    }

    /**
     * Gets the value of the pli12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLI12() {
        return pli12;
    }

    /**
     * Sets the value of the pli12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLI12(String value) {
        this.pli12 = value;
    }

    /**
     * Gets the value of the bsmod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSMOD() {
        return bsmod;
    }

    /**
     * Sets the value of the bsmod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSMOD(String value) {
        this.bsmod = value;
    }

    /**
     * Gets the value of the muser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMUSER() {
        return muser;
    }

    /**
     * Sets the value of the muser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMUSER(String value) {
        this.muser = value;
    }

    /**
     * Gets the value of the grpvl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRPVL() {
        return grpvl;
    }

    /**
     * Sets the value of the grpvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRPVL(String value) {
        this.grpvl = value;
    }

    /**
     * Gets the value of the dofoso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOFOSO() {
        return dofoso;
    }

    /**
     * Sets the value of the dofoso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOFOSO(String value) {
        this.dofoso = value;
    }

    /**
     * Gets the value of the rsa01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSA01() {
        return rsa01;
    }

    /**
     * Sets the value of the rsa01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSA01(String value) {
        this.rsa01 = value;
    }

    /**
     * Gets the value of the rsa02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSA02() {
        return rsa02;
    }

    /**
     * Sets the value of the rsa02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSA02(String value) {
        this.rsa02 = value;
    }

    /**
     * Gets the value of the rsa03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSA03() {
        return rsa03;
    }

    /**
     * Sets the value of the rsa03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSA03(String value) {
        this.rsa03 = value;
    }

    /**
     * Gets the value of the rsa04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSA04() {
        return rsa04;
    }

    /**
     * Sets the value of the rsa04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSA04(String value) {
        this.rsa04 = value;
    }

    /**
     * Gets the value of the rsa05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSA05() {
        return rsa05;
    }

    /**
     * Sets the value of the rsa05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSA05(String value) {
        this.rsa05 = value;
    }

    /**
     * Gets the value of the rsa06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSA06() {
        return rsa06;
    }

    /**
     * Sets the value of the rsa06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSA06(String value) {
        this.rsa06 = value;
    }

    /**
     * Gets the value of the rsa07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSA07() {
        return rsa07;
    }

    /**
     * Sets the value of the rsa07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSA07(String value) {
        this.rsa07 = value;
    }

    /**
     * Gets the value of the rsa08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSA08() {
        return rsa08;
    }

    /**
     * Sets the value of the rsa08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSA08(String value) {
        this.rsa08 = value;
    }

    /**
     * Gets the value of the rsa09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSA09() {
        return rsa09;
    }

    /**
     * Sets the value of the rsa09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSA09(String value) {
        this.rsa09 = value;
    }

    /**
     * Gets the value of the rsa10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSA10() {
        return rsa10;
    }

    /**
     * Sets the value of the rsa10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSA10(String value) {
        this.rsa10 = value;
    }

    /**
     * Gets the value of the rsa11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSA11() {
        return rsa11;
    }

    /**
     * Sets the value of the rsa11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSA11(String value) {
        this.rsa11 = value;
    }

    /**
     * Gets the value of the rsa12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSA12() {
        return rsa12;
    }

    /**
     * Sets the value of the rsa12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSA12(String value) {
        this.rsa12 = value;
    }

    /**
     * Gets the value of the perco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERCO() {
        return perco;
    }

    /**
     * Sets the value of the perco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERCO(String value) {
        this.perco = value;
    }

    /**
     * Gets the value of the ccbam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCBAM() {
        return ccbam;
    }

    /**
     * Sets the value of the ccbam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCBAM(String value) {
        this.ccbam = value;
    }

    /**
     * Gets the value of the dadam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDADAM() {
        return dadam;
    }

    /**
     * Sets the value of the dadam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDADAM(String value) {
        this.dadam = value;
    }

    /**
     * Gets the value of the drfos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRFOS() {
        return drfos;
    }

    /**
     * Sets the value of the drfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRFOS(String value) {
        this.drfos = value;
    }

    /**
     * Gets the value of the foson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOSON() {
        return foson;
    }

    /**
     * Sets the value of the foson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOSON(String value) {
        this.foson = value;
    }

    /**
     * Gets the value of the fosor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOSOR() {
        return fosor;
    }

    /**
     * Sets the value of the fosor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOSOR(String value) {
        this.fosor = value;
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
