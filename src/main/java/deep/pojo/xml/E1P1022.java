
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
 *         &lt;element name="TAGNR_001" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZBLID_001" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TAGNR_002" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZBLID_002" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TAGNR_003" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZBLID_003" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TAGNR_004" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZBLID_004" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TAGNR_005" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZBLID_005" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TAGNR_006" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZBLID_006" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TAGNR_007" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZBLID_007" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TAGNR_008" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZBLID_008" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TAGNR_009" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZBLID_009" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TAGNR_010" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZBLID_010" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TAGNR_011" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZBLID_011" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TAGNR_012" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZBLID_012" minOccurs="0"&gt;
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
    "tagnr001",
    "zblid001",
    "tagnr002",
    "zblid002",
    "tagnr003",
    "zblid003",
    "tagnr004",
    "zblid004",
    "tagnr005",
    "zblid005",
    "tagnr006",
    "zblid006",
    "tagnr007",
    "zblid007",
    "tagnr008",
    "zblid008",
    "tagnr009",
    "zblid009",
    "tagnr010",
    "zblid010",
    "tagnr011",
    "zblid011",
    "tagnr012",
    "zblid012"
})
public class E1P1022 {

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
    @XmlElement(name = "TAGNR_001")
    protected String tagnr001;
    @XmlElement(name = "ZBLID_001")
    protected String zblid001;
    @XmlElement(name = "TAGNR_002")
    protected String tagnr002;
    @XmlElement(name = "ZBLID_002")
    protected String zblid002;
    @XmlElement(name = "TAGNR_003")
    protected String tagnr003;
    @XmlElement(name = "ZBLID_003")
    protected String zblid003;
    @XmlElement(name = "TAGNR_004")
    protected String tagnr004;
    @XmlElement(name = "ZBLID_004")
    protected String zblid004;
    @XmlElement(name = "TAGNR_005")
    protected String tagnr005;
    @XmlElement(name = "ZBLID_005")
    protected String zblid005;
    @XmlElement(name = "TAGNR_006")
    protected String tagnr006;
    @XmlElement(name = "ZBLID_006")
    protected String zblid006;
    @XmlElement(name = "TAGNR_007")
    protected String tagnr007;
    @XmlElement(name = "ZBLID_007")
    protected String zblid007;
    @XmlElement(name = "TAGNR_008")
    protected String tagnr008;
    @XmlElement(name = "ZBLID_008")
    protected String zblid008;
    @XmlElement(name = "TAGNR_009")
    protected String tagnr009;
    @XmlElement(name = "ZBLID_009")
    protected String zblid009;
    @XmlElement(name = "TAGNR_010")
    protected String tagnr010;
    @XmlElement(name = "ZBLID_010")
    protected String zblid010;
    @XmlElement(name = "TAGNR_011")
    protected String tagnr011;
    @XmlElement(name = "ZBLID_011")
    protected String zblid011;
    @XmlElement(name = "TAGNR_012")
    protected String tagnr012;
    @XmlElement(name = "ZBLID_012")
    protected String zblid012;
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
     * Gets the value of the tagnr001 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAGNR001() {
        return tagnr001;
    }

    /**
     * Sets the value of the tagnr001 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAGNR001(String value) {
        this.tagnr001 = value;
    }

    /**
     * Gets the value of the zblid001 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZBLID001() {
        return zblid001;
    }

    /**
     * Sets the value of the zblid001 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZBLID001(String value) {
        this.zblid001 = value;
    }

    /**
     * Gets the value of the tagnr002 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAGNR002() {
        return tagnr002;
    }

    /**
     * Sets the value of the tagnr002 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAGNR002(String value) {
        this.tagnr002 = value;
    }

    /**
     * Gets the value of the zblid002 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZBLID002() {
        return zblid002;
    }

    /**
     * Sets the value of the zblid002 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZBLID002(String value) {
        this.zblid002 = value;
    }

    /**
     * Gets the value of the tagnr003 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAGNR003() {
        return tagnr003;
    }

    /**
     * Sets the value of the tagnr003 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAGNR003(String value) {
        this.tagnr003 = value;
    }

    /**
     * Gets the value of the zblid003 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZBLID003() {
        return zblid003;
    }

    /**
     * Sets the value of the zblid003 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZBLID003(String value) {
        this.zblid003 = value;
    }

    /**
     * Gets the value of the tagnr004 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAGNR004() {
        return tagnr004;
    }

    /**
     * Sets the value of the tagnr004 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAGNR004(String value) {
        this.tagnr004 = value;
    }

    /**
     * Gets the value of the zblid004 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZBLID004() {
        return zblid004;
    }

    /**
     * Sets the value of the zblid004 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZBLID004(String value) {
        this.zblid004 = value;
    }

    /**
     * Gets the value of the tagnr005 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAGNR005() {
        return tagnr005;
    }

    /**
     * Sets the value of the tagnr005 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAGNR005(String value) {
        this.tagnr005 = value;
    }

    /**
     * Gets the value of the zblid005 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZBLID005() {
        return zblid005;
    }

    /**
     * Sets the value of the zblid005 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZBLID005(String value) {
        this.zblid005 = value;
    }

    /**
     * Gets the value of the tagnr006 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAGNR006() {
        return tagnr006;
    }

    /**
     * Sets the value of the tagnr006 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAGNR006(String value) {
        this.tagnr006 = value;
    }

    /**
     * Gets the value of the zblid006 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZBLID006() {
        return zblid006;
    }

    /**
     * Sets the value of the zblid006 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZBLID006(String value) {
        this.zblid006 = value;
    }

    /**
     * Gets the value of the tagnr007 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAGNR007() {
        return tagnr007;
    }

    /**
     * Sets the value of the tagnr007 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAGNR007(String value) {
        this.tagnr007 = value;
    }

    /**
     * Gets the value of the zblid007 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZBLID007() {
        return zblid007;
    }

    /**
     * Sets the value of the zblid007 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZBLID007(String value) {
        this.zblid007 = value;
    }

    /**
     * Gets the value of the tagnr008 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAGNR008() {
        return tagnr008;
    }

    /**
     * Sets the value of the tagnr008 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAGNR008(String value) {
        this.tagnr008 = value;
    }

    /**
     * Gets the value of the zblid008 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZBLID008() {
        return zblid008;
    }

    /**
     * Sets the value of the zblid008 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZBLID008(String value) {
        this.zblid008 = value;
    }

    /**
     * Gets the value of the tagnr009 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAGNR009() {
        return tagnr009;
    }

    /**
     * Sets the value of the tagnr009 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAGNR009(String value) {
        this.tagnr009 = value;
    }

    /**
     * Gets the value of the zblid009 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZBLID009() {
        return zblid009;
    }

    /**
     * Sets the value of the zblid009 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZBLID009(String value) {
        this.zblid009 = value;
    }

    /**
     * Gets the value of the tagnr010 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAGNR010() {
        return tagnr010;
    }

    /**
     * Sets the value of the tagnr010 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAGNR010(String value) {
        this.tagnr010 = value;
    }

    /**
     * Gets the value of the zblid010 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZBLID010() {
        return zblid010;
    }

    /**
     * Sets the value of the zblid010 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZBLID010(String value) {
        this.zblid010 = value;
    }

    /**
     * Gets the value of the tagnr011 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAGNR011() {
        return tagnr011;
    }

    /**
     * Sets the value of the tagnr011 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAGNR011(String value) {
        this.tagnr011 = value;
    }

    /**
     * Gets the value of the zblid011 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZBLID011() {
        return zblid011;
    }

    /**
     * Sets the value of the zblid011 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZBLID011(String value) {
        this.zblid011 = value;
    }

    /**
     * Gets the value of the tagnr012 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAGNR012() {
        return tagnr012;
    }

    /**
     * Sets the value of the tagnr012 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAGNR012(String value) {
        this.tagnr012 = value;
    }

    /**
     * Gets the value of the zblid012 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZBLID012() {
        return zblid012;
    }

    /**
     * Sets the value of the zblid012 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZBLID012(String value) {
        this.zblid012 = value;
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
