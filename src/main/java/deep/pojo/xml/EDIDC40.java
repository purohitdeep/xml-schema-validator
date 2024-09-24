
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
 *         &lt;element name="TABNAM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MANDT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DOCNUM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DOCREL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="STATUS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DIRECT"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="1"/&gt;
 *               &lt;enumeration value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OUTMOD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EXPRSS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TEST" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IDOCTYP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CIMTYP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MESTYP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MESCOD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MESFCT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="STD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="STDVRS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="STDMES" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SNDPOR"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SNDPRT"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SNDPFC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SNDPRN"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SNDSAD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="21"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SNDLAD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RCVPOR"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RCVPRT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RCVPFC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RCVPRN"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RCVSAD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="21"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RCVLAD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CREDAT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRETIM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="REFINT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="14"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="REFGRP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="14"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="REFMES" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="14"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ARCKEY" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SERIAL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
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
    "tabnam",
    "mandt",
    "docnum",
    "docrel",
    "status",
    "direct",
    "outmod",
    "exprss",
    "test",
    "idoctyp",
    "cimtyp",
    "mestyp",
    "mescod",
    "mesfct",
    "std",
    "stdvrs",
    "stdmes",
    "sndpor",
    "sndprt",
    "sndpfc",
    "sndprn",
    "sndsad",
    "sndlad",
    "rcvpor",
    "rcvprt",
    "rcvpfc",
    "rcvprn",
    "rcvsad",
    "rcvlad",
    "credat",
    "cretim",
    "refint",
    "refgrp",
    "refmes",
    "arckey",
    "serial"
})
public class EDIDC40 {

    @XmlElement(name = "TABNAM", required = true)
    protected String tabnam;
    @XmlElement(name = "MANDT")
    protected String mandt;
    @XmlElement(name = "DOCNUM")
    protected String docnum;
    @XmlElement(name = "DOCREL")
    protected String docrel;
    @XmlElement(name = "STATUS")
    protected String status;
    @XmlElement(name = "DIRECT", required = true)
    protected String direct;
    @XmlElement(name = "OUTMOD")
    protected String outmod;
    @XmlElement(name = "EXPRSS")
    protected String exprss;
    @XmlElement(name = "TEST")
    protected String test;
    @XmlElement(name = "IDOCTYP", required = true)
    protected String idoctyp;
    @XmlElement(name = "CIMTYP", required = true)
    protected String cimtyp;
    @XmlElement(name = "MESTYP")
    protected String mestyp;
    @XmlElement(name = "MESCOD")
    protected String mescod;
    @XmlElement(name = "MESFCT")
    protected String mesfct;
    @XmlElement(name = "STD")
    protected String std;
    @XmlElement(name = "STDVRS")
    protected String stdvrs;
    @XmlElement(name = "STDMES")
    protected String stdmes;
    @XmlElement(name = "SNDPOR", required = true)
    protected String sndpor;
    @XmlElement(name = "SNDPRT", required = true)
    protected String sndprt;
    @XmlElement(name = "SNDPFC")
    protected String sndpfc;
    @XmlElement(name = "SNDPRN", required = true)
    protected String sndprn;
    @XmlElement(name = "SNDSAD")
    protected String sndsad;
    @XmlElement(name = "SNDLAD")
    protected String sndlad;
    @XmlElement(name = "RCVPOR", required = true)
    protected String rcvpor;
    @XmlElement(name = "RCVPRT")
    protected String rcvprt;
    @XmlElement(name = "RCVPFC")
    protected String rcvpfc;
    @XmlElement(name = "RCVPRN", required = true)
    protected String rcvprn;
    @XmlElement(name = "RCVSAD")
    protected String rcvsad;
    @XmlElement(name = "RCVLAD")
    protected String rcvlad;
    @XmlElement(name = "CREDAT")
    protected String credat;
    @XmlElement(name = "CRETIM")
    protected String cretim;
    @XmlElement(name = "REFINT")
    protected String refint;
    @XmlElement(name = "REFGRP")
    protected String refgrp;
    @XmlElement(name = "REFMES")
    protected String refmes;
    @XmlElement(name = "ARCKEY")
    protected String arckey;
    @XmlElement(name = "SERIAL")
    protected String serial;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Gets the value of the tabnam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTABNAM() {
        return tabnam;
    }

    /**
     * Sets the value of the tabnam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTABNAM(String value) {
        this.tabnam = value;
    }

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
     * Gets the value of the docnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCNUM() {
        return docnum;
    }

    /**
     * Sets the value of the docnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCNUM(String value) {
        this.docnum = value;
    }

    /**
     * Gets the value of the docrel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCREL() {
        return docrel;
    }

    /**
     * Sets the value of the docrel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCREL(String value) {
        this.docrel = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the direct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIRECT() {
        return direct;
    }

    /**
     * Sets the value of the direct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIRECT(String value) {
        this.direct = value;
    }

    /**
     * Gets the value of the outmod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOUTMOD() {
        return outmod;
    }

    /**
     * Sets the value of the outmod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOUTMOD(String value) {
        this.outmod = value;
    }

    /**
     * Gets the value of the exprss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXPRSS() {
        return exprss;
    }

    /**
     * Sets the value of the exprss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXPRSS(String value) {
        this.exprss = value;
    }

    /**
     * Gets the value of the test property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEST() {
        return test;
    }

    /**
     * Sets the value of the test property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEST(String value) {
        this.test = value;
    }

    /**
     * Gets the value of the idoctyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDOCTYP() {
        return idoctyp;
    }

    /**
     * Sets the value of the idoctyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDOCTYP(String value) {
        this.idoctyp = value;
    }

    /**
     * Gets the value of the cimtyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIMTYP() {
        return cimtyp;
    }

    /**
     * Sets the value of the cimtyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIMTYP(String value) {
        this.cimtyp = value;
    }

    /**
     * Gets the value of the mestyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMESTYP() {
        return mestyp;
    }

    /**
     * Sets the value of the mestyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMESTYP(String value) {
        this.mestyp = value;
    }

    /**
     * Gets the value of the mescod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMESCOD() {
        return mescod;
    }

    /**
     * Sets the value of the mescod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMESCOD(String value) {
        this.mescod = value;
    }

    /**
     * Gets the value of the mesfct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMESFCT() {
        return mesfct;
    }

    /**
     * Sets the value of the mesfct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMESFCT(String value) {
        this.mesfct = value;
    }

    /**
     * Gets the value of the std property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTD() {
        return std;
    }

    /**
     * Sets the value of the std property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTD(String value) {
        this.std = value;
    }

    /**
     * Gets the value of the stdvrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTDVRS() {
        return stdvrs;
    }

    /**
     * Sets the value of the stdvrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTDVRS(String value) {
        this.stdvrs = value;
    }

    /**
     * Gets the value of the stdmes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTDMES() {
        return stdmes;
    }

    /**
     * Sets the value of the stdmes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTDMES(String value) {
        this.stdmes = value;
    }

    /**
     * Gets the value of the sndpor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNDPOR() {
        return sndpor;
    }

    /**
     * Sets the value of the sndpor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNDPOR(String value) {
        this.sndpor = value;
    }

    /**
     * Gets the value of the sndprt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNDPRT() {
        return sndprt;
    }

    /**
     * Sets the value of the sndprt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNDPRT(String value) {
        this.sndprt = value;
    }

    /**
     * Gets the value of the sndpfc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNDPFC() {
        return sndpfc;
    }

    /**
     * Sets the value of the sndpfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNDPFC(String value) {
        this.sndpfc = value;
    }

    /**
     * Gets the value of the sndprn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNDPRN() {
        return sndprn;
    }

    /**
     * Sets the value of the sndprn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNDPRN(String value) {
        this.sndprn = value;
    }

    /**
     * Gets the value of the sndsad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNDSAD() {
        return sndsad;
    }

    /**
     * Sets the value of the sndsad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNDSAD(String value) {
        this.sndsad = value;
    }

    /**
     * Gets the value of the sndlad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNDLAD() {
        return sndlad;
    }

    /**
     * Sets the value of the sndlad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNDLAD(String value) {
        this.sndlad = value;
    }

    /**
     * Gets the value of the rcvpor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCVPOR() {
        return rcvpor;
    }

    /**
     * Sets the value of the rcvpor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCVPOR(String value) {
        this.rcvpor = value;
    }

    /**
     * Gets the value of the rcvprt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCVPRT() {
        return rcvprt;
    }

    /**
     * Sets the value of the rcvprt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCVPRT(String value) {
        this.rcvprt = value;
    }

    /**
     * Gets the value of the rcvpfc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCVPFC() {
        return rcvpfc;
    }

    /**
     * Sets the value of the rcvpfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCVPFC(String value) {
        this.rcvpfc = value;
    }

    /**
     * Gets the value of the rcvprn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCVPRN() {
        return rcvprn;
    }

    /**
     * Sets the value of the rcvprn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCVPRN(String value) {
        this.rcvprn = value;
    }

    /**
     * Gets the value of the rcvsad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCVSAD() {
        return rcvsad;
    }

    /**
     * Sets the value of the rcvsad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCVSAD(String value) {
        this.rcvsad = value;
    }

    /**
     * Gets the value of the rcvlad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCVLAD() {
        return rcvlad;
    }

    /**
     * Sets the value of the rcvlad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCVLAD(String value) {
        this.rcvlad = value;
    }

    /**
     * Gets the value of the credat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREDAT() {
        return credat;
    }

    /**
     * Sets the value of the credat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREDAT(String value) {
        this.credat = value;
    }

    /**
     * Gets the value of the cretim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRETIM() {
        return cretim;
    }

    /**
     * Sets the value of the cretim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRETIM(String value) {
        this.cretim = value;
    }

    /**
     * Gets the value of the refint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFINT() {
        return refint;
    }

    /**
     * Sets the value of the refint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFINT(String value) {
        this.refint = value;
    }

    /**
     * Gets the value of the refgrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFGRP() {
        return refgrp;
    }

    /**
     * Sets the value of the refgrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFGRP(String value) {
        this.refgrp = value;
    }

    /**
     * Gets the value of the refmes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFMES() {
        return refmes;
    }

    /**
     * Sets the value of the refmes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFMES(String value) {
        this.refmes = value;
    }

    /**
     * Gets the value of the arckey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARCKEY() {
        return arckey;
    }

    /**
     * Sets the value of the arckey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARCKEY(String value) {
        this.arckey = value;
    }

    /**
     * Gets the value of the serial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERIAL() {
        return serial;
    }

    /**
     * Sets the value of the serial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERIAL(String value) {
        this.serial = value;
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
