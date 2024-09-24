
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
 *         &lt;element name="HISTO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ITXEX" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="REFEX" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ORDEX" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ITBLD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PREAS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FLAG1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FLAG2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FLAG3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FLAG4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RESE1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RESE2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FAMSA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FGBDT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FGBLD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FANAT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FASEX" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FAVOR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FANAM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GBDEP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FGBOT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FKNZN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDART" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FNAMK" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LNAMK" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INDRL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DP1ID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DP2ID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DP3ID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DP4ID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DPHID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DPFAL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DP5ID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DEATH" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NONRE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
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
 *         &lt;element name="DPNID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CASBT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CAOBJ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CABGD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CAEDD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CASQN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CNSBT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CNOBJ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CHGRS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CFDPE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="60"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RFDPE" minOccurs="0"&gt;
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
    "infty",
    "subty",
    "objps",
    "sprps",
    "endda",
    "begda",
    "seqnr",
    "aedtm",
    "uname",
    "histo",
    "itxex",
    "refex",
    "ordex",
    "itbld",
    "preas",
    "flag1",
    "flag2",
    "flag3",
    "flag4",
    "rese1",
    "rese2",
    "famsa",
    "fgbdt",
    "fgbld",
    "fanat",
    "fasex",
    "favor",
    "fanam",
    "gbdep",
    "fgbot",
    "fknzn",
    "kdart",
    "fnamk",
    "lnamk",
    "indrl",
    "dp1ID",
    "dp2ID",
    "dp3ID",
    "dp4ID",
    "dphid",
    "dpfal",
    "dp5ID",
    "death",
    "nonre",
    "grpvl",
    "dpnid",
    "casbt",
    "caobj",
    "cabgd",
    "caedd",
    "casqn",
    "cnsbt",
    "cnobj",
    "chgrs",
    "cfdpe",
    "rfdpe"
})
public class E1P0148 {

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
    @XmlElement(name = "HISTO")
    protected String histo;
    @XmlElement(name = "ITXEX")
    protected String itxex;
    @XmlElement(name = "REFEX")
    protected String refex;
    @XmlElement(name = "ORDEX")
    protected String ordex;
    @XmlElement(name = "ITBLD")
    protected String itbld;
    @XmlElement(name = "PREAS")
    protected String preas;
    @XmlElement(name = "FLAG1")
    protected String flag1;
    @XmlElement(name = "FLAG2")
    protected String flag2;
    @XmlElement(name = "FLAG3")
    protected String flag3;
    @XmlElement(name = "FLAG4")
    protected String flag4;
    @XmlElement(name = "RESE1")
    protected String rese1;
    @XmlElement(name = "RESE2")
    protected String rese2;
    @XmlElement(name = "FAMSA")
    protected String famsa;
    @XmlElement(name = "FGBDT")
    protected String fgbdt;
    @XmlElement(name = "FGBLD")
    protected String fgbld;
    @XmlElement(name = "FANAT")
    protected String fanat;
    @XmlElement(name = "FASEX")
    protected String fasex;
    @XmlElement(name = "FAVOR")
    protected String favor;
    @XmlElement(name = "FANAM")
    protected String fanam;
    @XmlElement(name = "GBDEP")
    protected String gbdep;
    @XmlElement(name = "FGBOT")
    protected String fgbot;
    @XmlElement(name = "FKNZN")
    protected String fknzn;
    @XmlElement(name = "KDART")
    protected String kdart;
    @XmlElement(name = "FNAMK")
    protected String fnamk;
    @XmlElement(name = "LNAMK")
    protected String lnamk;
    @XmlElement(name = "INDRL")
    protected String indrl;
    @XmlElement(name = "DP1ID")
    protected String dp1ID;
    @XmlElement(name = "DP2ID")
    protected String dp2ID;
    @XmlElement(name = "DP3ID")
    protected String dp3ID;
    @XmlElement(name = "DP4ID")
    protected String dp4ID;
    @XmlElement(name = "DPHID")
    protected String dphid;
    @XmlElement(name = "DPFAL")
    protected String dpfal;
    @XmlElement(name = "DP5ID")
    protected String dp5ID;
    @XmlElement(name = "DEATH")
    protected String death;
    @XmlElement(name = "NONRE")
    protected String nonre;
    @XmlElement(name = "GRPVL")
    protected String grpvl;
    @XmlElement(name = "DPNID")
    protected String dpnid;
    @XmlElement(name = "CASBT")
    protected String casbt;
    @XmlElement(name = "CAOBJ")
    protected String caobj;
    @XmlElement(name = "CABGD")
    protected String cabgd;
    @XmlElement(name = "CAEDD")
    protected String caedd;
    @XmlElement(name = "CASQN")
    protected String casqn;
    @XmlElement(name = "CNSBT")
    protected String cnsbt;
    @XmlElement(name = "CNOBJ")
    protected String cnobj;
    @XmlElement(name = "CHGRS")
    protected String chgrs;
    @XmlElement(name = "CFDPE")
    protected String cfdpe;
    @XmlElement(name = "RFDPE")
    protected String rfdpe;
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
     * Gets the value of the itxex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITXEX() {
        return itxex;
    }

    /**
     * Sets the value of the itxex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITXEX(String value) {
        this.itxex = value;
    }

    /**
     * Gets the value of the refex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFEX() {
        return refex;
    }

    /**
     * Sets the value of the refex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFEX(String value) {
        this.refex = value;
    }

    /**
     * Gets the value of the ordex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDEX() {
        return ordex;
    }

    /**
     * Sets the value of the ordex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDEX(String value) {
        this.ordex = value;
    }

    /**
     * Gets the value of the itbld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITBLD() {
        return itbld;
    }

    /**
     * Sets the value of the itbld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITBLD(String value) {
        this.itbld = value;
    }

    /**
     * Gets the value of the preas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPREAS() {
        return preas;
    }

    /**
     * Sets the value of the preas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPREAS(String value) {
        this.preas = value;
    }

    /**
     * Gets the value of the flag1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAG1() {
        return flag1;
    }

    /**
     * Sets the value of the flag1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAG1(String value) {
        this.flag1 = value;
    }

    /**
     * Gets the value of the flag2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAG2() {
        return flag2;
    }

    /**
     * Sets the value of the flag2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAG2(String value) {
        this.flag2 = value;
    }

    /**
     * Gets the value of the flag3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAG3() {
        return flag3;
    }

    /**
     * Sets the value of the flag3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAG3(String value) {
        this.flag3 = value;
    }

    /**
     * Gets the value of the flag4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAG4() {
        return flag4;
    }

    /**
     * Sets the value of the flag4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAG4(String value) {
        this.flag4 = value;
    }

    /**
     * Gets the value of the rese1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESE1() {
        return rese1;
    }

    /**
     * Sets the value of the rese1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESE1(String value) {
        this.rese1 = value;
    }

    /**
     * Gets the value of the rese2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESE2() {
        return rese2;
    }

    /**
     * Sets the value of the rese2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESE2(String value) {
        this.rese2 = value;
    }

    /**
     * Gets the value of the famsa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAMSA() {
        return famsa;
    }

    /**
     * Sets the value of the famsa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAMSA(String value) {
        this.famsa = value;
    }

    /**
     * Gets the value of the fgbdt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFGBDT() {
        return fgbdt;
    }

    /**
     * Sets the value of the fgbdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFGBDT(String value) {
        this.fgbdt = value;
    }

    /**
     * Gets the value of the fgbld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFGBLD() {
        return fgbld;
    }

    /**
     * Sets the value of the fgbld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFGBLD(String value) {
        this.fgbld = value;
    }

    /**
     * Gets the value of the fanat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFANAT() {
        return fanat;
    }

    /**
     * Sets the value of the fanat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFANAT(String value) {
        this.fanat = value;
    }

    /**
     * Gets the value of the fasex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFASEX() {
        return fasex;
    }

    /**
     * Sets the value of the fasex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFASEX(String value) {
        this.fasex = value;
    }

    /**
     * Gets the value of the favor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAVOR() {
        return favor;
    }

    /**
     * Sets the value of the favor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAVOR(String value) {
        this.favor = value;
    }

    /**
     * Gets the value of the fanam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFANAM() {
        return fanam;
    }

    /**
     * Sets the value of the fanam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFANAM(String value) {
        this.fanam = value;
    }

    /**
     * Gets the value of the gbdep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGBDEP() {
        return gbdep;
    }

    /**
     * Sets the value of the gbdep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGBDEP(String value) {
        this.gbdep = value;
    }

    /**
     * Gets the value of the fgbot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFGBOT() {
        return fgbot;
    }

    /**
     * Sets the value of the fgbot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFGBOT(String value) {
        this.fgbot = value;
    }

    /**
     * Gets the value of the fknzn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFKNZN() {
        return fknzn;
    }

    /**
     * Sets the value of the fknzn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFKNZN(String value) {
        this.fknzn = value;
    }

    /**
     * Gets the value of the kdart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDART() {
        return kdart;
    }

    /**
     * Sets the value of the kdart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDART(String value) {
        this.kdart = value;
    }

    /**
     * Gets the value of the fnamk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNAMK() {
        return fnamk;
    }

    /**
     * Sets the value of the fnamk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNAMK(String value) {
        this.fnamk = value;
    }

    /**
     * Gets the value of the lnamk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLNAMK() {
        return lnamk;
    }

    /**
     * Sets the value of the lnamk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLNAMK(String value) {
        this.lnamk = value;
    }

    /**
     * Gets the value of the indrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDRL() {
        return indrl;
    }

    /**
     * Sets the value of the indrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDRL(String value) {
        this.indrl = value;
    }

    /**
     * Gets the value of the dp1ID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDP1ID() {
        return dp1ID;
    }

    /**
     * Sets the value of the dp1ID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDP1ID(String value) {
        this.dp1ID = value;
    }

    /**
     * Gets the value of the dp2ID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDP2ID() {
        return dp2ID;
    }

    /**
     * Sets the value of the dp2ID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDP2ID(String value) {
        this.dp2ID = value;
    }

    /**
     * Gets the value of the dp3ID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDP3ID() {
        return dp3ID;
    }

    /**
     * Sets the value of the dp3ID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDP3ID(String value) {
        this.dp3ID = value;
    }

    /**
     * Gets the value of the dp4ID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDP4ID() {
        return dp4ID;
    }

    /**
     * Sets the value of the dp4ID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDP4ID(String value) {
        this.dp4ID = value;
    }

    /**
     * Gets the value of the dphid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPHID() {
        return dphid;
    }

    /**
     * Sets the value of the dphid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPHID(String value) {
        this.dphid = value;
    }

    /**
     * Gets the value of the dpfal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPFAL() {
        return dpfal;
    }

    /**
     * Sets the value of the dpfal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPFAL(String value) {
        this.dpfal = value;
    }

    /**
     * Gets the value of the dp5ID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDP5ID() {
        return dp5ID;
    }

    /**
     * Sets the value of the dp5ID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDP5ID(String value) {
        this.dp5ID = value;
    }

    /**
     * Gets the value of the death property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEATH() {
        return death;
    }

    /**
     * Sets the value of the death property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEATH(String value) {
        this.death = value;
    }

    /**
     * Gets the value of the nonre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNONRE() {
        return nonre;
    }

    /**
     * Sets the value of the nonre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNONRE(String value) {
        this.nonre = value;
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
     * Gets the value of the dpnid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPNID() {
        return dpnid;
    }

    /**
     * Sets the value of the dpnid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPNID(String value) {
        this.dpnid = value;
    }

    /**
     * Gets the value of the casbt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCASBT() {
        return casbt;
    }

    /**
     * Sets the value of the casbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCASBT(String value) {
        this.casbt = value;
    }

    /**
     * Gets the value of the caobj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAOBJ() {
        return caobj;
    }

    /**
     * Sets the value of the caobj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAOBJ(String value) {
        this.caobj = value;
    }

    /**
     * Gets the value of the cabgd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCABGD() {
        return cabgd;
    }

    /**
     * Sets the value of the cabgd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCABGD(String value) {
        this.cabgd = value;
    }

    /**
     * Gets the value of the caedd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAEDD() {
        return caedd;
    }

    /**
     * Sets the value of the caedd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAEDD(String value) {
        this.caedd = value;
    }

    /**
     * Gets the value of the casqn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCASQN() {
        return casqn;
    }

    /**
     * Sets the value of the casqn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCASQN(String value) {
        this.casqn = value;
    }

    /**
     * Gets the value of the cnsbt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNSBT() {
        return cnsbt;
    }

    /**
     * Sets the value of the cnsbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNSBT(String value) {
        this.cnsbt = value;
    }

    /**
     * Gets the value of the cnobj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNOBJ() {
        return cnobj;
    }

    /**
     * Sets the value of the cnobj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNOBJ(String value) {
        this.cnobj = value;
    }

    /**
     * Gets the value of the chgrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHGRS() {
        return chgrs;
    }

    /**
     * Sets the value of the chgrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHGRS(String value) {
        this.chgrs = value;
    }

    /**
     * Gets the value of the cfdpe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCFDPE() {
        return cfdpe;
    }

    /**
     * Sets the value of the cfdpe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCFDPE(String value) {
        this.cfdpe = value;
    }

    /**
     * Gets the value of the rfdpe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFDPE() {
        return rfdpe;
    }

    /**
     * Sets the value of the rfdpe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFDPE(String value) {
        this.rfdpe = value;
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
