
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
 *         &lt;element name="KOMKD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TRPCT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FRDMD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FRMAX" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FRIVA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FRIBO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FRITF" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FRIBL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FRIAN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TXT27" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="58"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KMREG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EJAMB" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ARBST" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="STATS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AKTIV" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FRKOD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FRDAG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FRNRM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ATPCD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TRDEF" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FRDMDW" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FRMAXW" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FRIVAW" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FRDAGW" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FRNRMW" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ARBS1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BOLIG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="STYES" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HAUPTSENUM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SENUM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SEKEY" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
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
    "komkd",
    "trpct",
    "frdmd",
    "frmax",
    "friva",
    "fribo",
    "fritf",
    "fribl",
    "frian",
    "txt27",
    "kmreg",
    "ejamb",
    "arbst",
    "stats",
    "aktiv",
    "frkod",
    "frdag",
    "frnrm",
    "atpcd",
    "trdef",
    "frdmdw",
    "frmaxw",
    "frivaw",
    "frdagw",
    "frnrmw",
    "arbs1",
    "bolig",
    "styes",
    "hauptsenum",
    "senum",
    "sekey",
    "grpvl"
})
public class E1P0072 {

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
    @XmlElement(name = "KOMKD")
    protected String komkd;
    @XmlElement(name = "TRPCT")
    protected String trpct;
    @XmlElement(name = "FRDMD")
    protected String frdmd;
    @XmlElement(name = "FRMAX")
    protected String frmax;
    @XmlElement(name = "FRIVA")
    protected String friva;
    @XmlElement(name = "FRIBO")
    protected String fribo;
    @XmlElement(name = "FRITF")
    protected String fritf;
    @XmlElement(name = "FRIBL")
    protected String fribl;
    @XmlElement(name = "FRIAN")
    protected String frian;
    @XmlElement(name = "TXT27")
    protected String txt27;
    @XmlElement(name = "KMREG")
    protected String kmreg;
    @XmlElement(name = "EJAMB")
    protected String ejamb;
    @XmlElement(name = "ARBST")
    protected String arbst;
    @XmlElement(name = "STATS")
    protected String stats;
    @XmlElement(name = "AKTIV")
    protected String aktiv;
    @XmlElement(name = "FRKOD")
    protected String frkod;
    @XmlElement(name = "FRDAG")
    protected String frdag;
    @XmlElement(name = "FRNRM")
    protected String frnrm;
    @XmlElement(name = "ATPCD")
    protected String atpcd;
    @XmlElement(name = "TRDEF")
    protected String trdef;
    @XmlElement(name = "FRDMDW")
    protected String frdmdw;
    @XmlElement(name = "FRMAXW")
    protected String frmaxw;
    @XmlElement(name = "FRIVAW")
    protected String frivaw;
    @XmlElement(name = "FRDAGW")
    protected String frdagw;
    @XmlElement(name = "FRNRMW")
    protected String frnrmw;
    @XmlElement(name = "ARBS1")
    protected String arbs1;
    @XmlElement(name = "BOLIG")
    protected String bolig;
    @XmlElement(name = "STYES")
    protected String styes;
    @XmlElement(name = "HAUPTSENUM")
    protected String hauptsenum;
    @XmlElement(name = "SENUM")
    protected String senum;
    @XmlElement(name = "SEKEY")
    protected String sekey;
    @XmlElement(name = "GRPVL")
    protected String grpvl;
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
     * Gets the value of the komkd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOMKD() {
        return komkd;
    }

    /**
     * Sets the value of the komkd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOMKD(String value) {
        this.komkd = value;
    }

    /**
     * Gets the value of the trpct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRPCT() {
        return trpct;
    }

    /**
     * Sets the value of the trpct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRPCT(String value) {
        this.trpct = value;
    }

    /**
     * Gets the value of the frdmd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFRDMD() {
        return frdmd;
    }

    /**
     * Sets the value of the frdmd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFRDMD(String value) {
        this.frdmd = value;
    }

    /**
     * Gets the value of the frmax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFRMAX() {
        return frmax;
    }

    /**
     * Sets the value of the frmax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFRMAX(String value) {
        this.frmax = value;
    }

    /**
     * Gets the value of the friva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFRIVA() {
        return friva;
    }

    /**
     * Sets the value of the friva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFRIVA(String value) {
        this.friva = value;
    }

    /**
     * Gets the value of the fribo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFRIBO() {
        return fribo;
    }

    /**
     * Sets the value of the fribo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFRIBO(String value) {
        this.fribo = value;
    }

    /**
     * Gets the value of the fritf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFRITF() {
        return fritf;
    }

    /**
     * Sets the value of the fritf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFRITF(String value) {
        this.fritf = value;
    }

    /**
     * Gets the value of the fribl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFRIBL() {
        return fribl;
    }

    /**
     * Sets the value of the fribl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFRIBL(String value) {
        this.fribl = value;
    }

    /**
     * Gets the value of the frian property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFRIAN() {
        return frian;
    }

    /**
     * Sets the value of the frian property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFRIAN(String value) {
        this.frian = value;
    }

    /**
     * Gets the value of the txt27 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTXT27() {
        return txt27;
    }

    /**
     * Sets the value of the txt27 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTXT27(String value) {
        this.txt27 = value;
    }

    /**
     * Gets the value of the kmreg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKMREG() {
        return kmreg;
    }

    /**
     * Sets the value of the kmreg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKMREG(String value) {
        this.kmreg = value;
    }

    /**
     * Gets the value of the ejamb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEJAMB() {
        return ejamb;
    }

    /**
     * Sets the value of the ejamb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEJAMB(String value) {
        this.ejamb = value;
    }

    /**
     * Gets the value of the arbst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARBST() {
        return arbst;
    }

    /**
     * Sets the value of the arbst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARBST(String value) {
        this.arbst = value;
    }

    /**
     * Gets the value of the stats property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATS() {
        return stats;
    }

    /**
     * Sets the value of the stats property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATS(String value) {
        this.stats = value;
    }

    /**
     * Gets the value of the aktiv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAKTIV() {
        return aktiv;
    }

    /**
     * Sets the value of the aktiv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAKTIV(String value) {
        this.aktiv = value;
    }

    /**
     * Gets the value of the frkod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFRKOD() {
        return frkod;
    }

    /**
     * Sets the value of the frkod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFRKOD(String value) {
        this.frkod = value;
    }

    /**
     * Gets the value of the frdag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFRDAG() {
        return frdag;
    }

    /**
     * Sets the value of the frdag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFRDAG(String value) {
        this.frdag = value;
    }

    /**
     * Gets the value of the frnrm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFRNRM() {
        return frnrm;
    }

    /**
     * Sets the value of the frnrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFRNRM(String value) {
        this.frnrm = value;
    }

    /**
     * Gets the value of the atpcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATPCD() {
        return atpcd;
    }

    /**
     * Sets the value of the atpcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATPCD(String value) {
        this.atpcd = value;
    }

    /**
     * Gets the value of the trdef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRDEF() {
        return trdef;
    }

    /**
     * Sets the value of the trdef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRDEF(String value) {
        this.trdef = value;
    }

    /**
     * Gets the value of the frdmdw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFRDMDW() {
        return frdmdw;
    }

    /**
     * Sets the value of the frdmdw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFRDMDW(String value) {
        this.frdmdw = value;
    }

    /**
     * Gets the value of the frmaxw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFRMAXW() {
        return frmaxw;
    }

    /**
     * Sets the value of the frmaxw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFRMAXW(String value) {
        this.frmaxw = value;
    }

    /**
     * Gets the value of the frivaw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFRIVAW() {
        return frivaw;
    }

    /**
     * Sets the value of the frivaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFRIVAW(String value) {
        this.frivaw = value;
    }

    /**
     * Gets the value of the frdagw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFRDAGW() {
        return frdagw;
    }

    /**
     * Sets the value of the frdagw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFRDAGW(String value) {
        this.frdagw = value;
    }

    /**
     * Gets the value of the frnrmw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFRNRMW() {
        return frnrmw;
    }

    /**
     * Sets the value of the frnrmw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFRNRMW(String value) {
        this.frnrmw = value;
    }

    /**
     * Gets the value of the arbs1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARBS1() {
        return arbs1;
    }

    /**
     * Sets the value of the arbs1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARBS1(String value) {
        this.arbs1 = value;
    }

    /**
     * Gets the value of the bolig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOLIG() {
        return bolig;
    }

    /**
     * Sets the value of the bolig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOLIG(String value) {
        this.bolig = value;
    }

    /**
     * Gets the value of the styes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTYES() {
        return styes;
    }

    /**
     * Sets the value of the styes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTYES(String value) {
        this.styes = value;
    }

    /**
     * Gets the value of the hauptsenum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHAUPTSENUM() {
        return hauptsenum;
    }

    /**
     * Sets the value of the hauptsenum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHAUPTSENUM(String value) {
        this.hauptsenum = value;
    }

    /**
     * Gets the value of the senum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENUM() {
        return senum;
    }

    /**
     * Sets the value of the senum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENUM(String value) {
        this.senum = value;
    }

    /**
     * Gets the value of the sekey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEKEY() {
        return sekey;
    }

    /**
     * Sets the value of the sekey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEKEY(String value) {
        this.sekey = value;
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
