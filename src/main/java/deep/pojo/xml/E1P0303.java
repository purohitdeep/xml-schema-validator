
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
 *         &lt;element name="DLNLL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DLNLW" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DATLW" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KENTLW" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DLNOW" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DATOW" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KENTOW" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TTSOW" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DSTLL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DATLL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KENTLL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SKNOW" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KENTSKNOW" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DABOV" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="URBOV" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VGBOV" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EHBOV_UR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EHBOV_VG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DATBOV" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KENTBOV" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
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
 *         &lt;element name="DVMBO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PVMBO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DSTAG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DLEVC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTEVC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSTAG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DLINC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTINC" minOccurs="0"&gt;
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
    "dlnll",
    "dlnlw",
    "datlw",
    "kentlw",
    "dlnow",
    "datow",
    "kentow",
    "ttsow",
    "dstll",
    "datll",
    "kentll",
    "sknow",
    "kentsknow",
    "dabov",
    "urbov",
    "vgbov",
    "ehbovur",
    "ehbovvg",
    "datbov",
    "kentbov",
    "grpvl",
    "dvmbo",
    "pvmbo",
    "dstag",
    "dlevc",
    "dtevc",
    "pstag",
    "dlinc",
    "dtinc"
})
public class E1P0303 {

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
    @XmlElement(name = "DLNLL")
    protected String dlnll;
    @XmlElement(name = "DLNLW")
    protected String dlnlw;
    @XmlElement(name = "DATLW")
    protected String datlw;
    @XmlElement(name = "KENTLW")
    protected String kentlw;
    @XmlElement(name = "DLNOW")
    protected String dlnow;
    @XmlElement(name = "DATOW")
    protected String datow;
    @XmlElement(name = "KENTOW")
    protected String kentow;
    @XmlElement(name = "TTSOW")
    protected String ttsow;
    @XmlElement(name = "DSTLL")
    protected String dstll;
    @XmlElement(name = "DATLL")
    protected String datll;
    @XmlElement(name = "KENTLL")
    protected String kentll;
    @XmlElement(name = "SKNOW")
    protected String sknow;
    @XmlElement(name = "KENTSKNOW")
    protected String kentsknow;
    @XmlElement(name = "DABOV")
    protected String dabov;
    @XmlElement(name = "URBOV")
    protected String urbov;
    @XmlElement(name = "VGBOV")
    protected String vgbov;
    @XmlElement(name = "EHBOV_UR")
    protected String ehbovur;
    @XmlElement(name = "EHBOV_VG")
    protected String ehbovvg;
    @XmlElement(name = "DATBOV")
    protected String datbov;
    @XmlElement(name = "KENTBOV")
    protected String kentbov;
    @XmlElement(name = "GRPVL")
    protected String grpvl;
    @XmlElement(name = "DVMBO")
    protected String dvmbo;
    @XmlElement(name = "PVMBO")
    protected String pvmbo;
    @XmlElement(name = "DSTAG")
    protected String dstag;
    @XmlElement(name = "DLEVC")
    protected String dlevc;
    @XmlElement(name = "DTEVC")
    protected String dtevc;
    @XmlElement(name = "PSTAG")
    protected String pstag;
    @XmlElement(name = "DLINC")
    protected String dlinc;
    @XmlElement(name = "DTINC")
    protected String dtinc;
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
     * Gets the value of the dlnll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDLNLL() {
        return dlnll;
    }

    /**
     * Sets the value of the dlnll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDLNLL(String value) {
        this.dlnll = value;
    }

    /**
     * Gets the value of the dlnlw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDLNLW() {
        return dlnlw;
    }

    /**
     * Sets the value of the dlnlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDLNLW(String value) {
        this.dlnlw = value;
    }

    /**
     * Gets the value of the datlw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATLW() {
        return datlw;
    }

    /**
     * Sets the value of the datlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATLW(String value) {
        this.datlw = value;
    }

    /**
     * Gets the value of the kentlw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKENTLW() {
        return kentlw;
    }

    /**
     * Sets the value of the kentlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKENTLW(String value) {
        this.kentlw = value;
    }

    /**
     * Gets the value of the dlnow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDLNOW() {
        return dlnow;
    }

    /**
     * Sets the value of the dlnow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDLNOW(String value) {
        this.dlnow = value;
    }

    /**
     * Gets the value of the datow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATOW() {
        return datow;
    }

    /**
     * Sets the value of the datow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATOW(String value) {
        this.datow = value;
    }

    /**
     * Gets the value of the kentow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKENTOW() {
        return kentow;
    }

    /**
     * Sets the value of the kentow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKENTOW(String value) {
        this.kentow = value;
    }

    /**
     * Gets the value of the ttsow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTTSOW() {
        return ttsow;
    }

    /**
     * Sets the value of the ttsow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTTSOW(String value) {
        this.ttsow = value;
    }

    /**
     * Gets the value of the dstll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSTLL() {
        return dstll;
    }

    /**
     * Sets the value of the dstll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSTLL(String value) {
        this.dstll = value;
    }

    /**
     * Gets the value of the datll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATLL() {
        return datll;
    }

    /**
     * Sets the value of the datll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATLL(String value) {
        this.datll = value;
    }

    /**
     * Gets the value of the kentll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKENTLL() {
        return kentll;
    }

    /**
     * Sets the value of the kentll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKENTLL(String value) {
        this.kentll = value;
    }

    /**
     * Gets the value of the sknow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKNOW() {
        return sknow;
    }

    /**
     * Sets the value of the sknow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKNOW(String value) {
        this.sknow = value;
    }

    /**
     * Gets the value of the kentsknow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKENTSKNOW() {
        return kentsknow;
    }

    /**
     * Sets the value of the kentsknow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKENTSKNOW(String value) {
        this.kentsknow = value;
    }

    /**
     * Gets the value of the dabov property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDABOV() {
        return dabov;
    }

    /**
     * Sets the value of the dabov property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDABOV(String value) {
        this.dabov = value;
    }

    /**
     * Gets the value of the urbov property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURBOV() {
        return urbov;
    }

    /**
     * Sets the value of the urbov property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURBOV(String value) {
        this.urbov = value;
    }

    /**
     * Gets the value of the vgbov property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVGBOV() {
        return vgbov;
    }

    /**
     * Sets the value of the vgbov property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVGBOV(String value) {
        this.vgbov = value;
    }

    /**
     * Gets the value of the ehbovur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEHBOVUR() {
        return ehbovur;
    }

    /**
     * Sets the value of the ehbovur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEHBOVUR(String value) {
        this.ehbovur = value;
    }

    /**
     * Gets the value of the ehbovvg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEHBOVVG() {
        return ehbovvg;
    }

    /**
     * Sets the value of the ehbovvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEHBOVVG(String value) {
        this.ehbovvg = value;
    }

    /**
     * Gets the value of the datbov property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATBOV() {
        return datbov;
    }

    /**
     * Sets the value of the datbov property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATBOV(String value) {
        this.datbov = value;
    }

    /**
     * Gets the value of the kentbov property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKENTBOV() {
        return kentbov;
    }

    /**
     * Sets the value of the kentbov property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKENTBOV(String value) {
        this.kentbov = value;
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
     * Gets the value of the dvmbo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDVMBO() {
        return dvmbo;
    }

    /**
     * Sets the value of the dvmbo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDVMBO(String value) {
        this.dvmbo = value;
    }

    /**
     * Gets the value of the pvmbo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPVMBO() {
        return pvmbo;
    }

    /**
     * Sets the value of the pvmbo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPVMBO(String value) {
        this.pvmbo = value;
    }

    /**
     * Gets the value of the dstag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSTAG() {
        return dstag;
    }

    /**
     * Sets the value of the dstag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSTAG(String value) {
        this.dstag = value;
    }

    /**
     * Gets the value of the dlevc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDLEVC() {
        return dlevc;
    }

    /**
     * Sets the value of the dlevc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDLEVC(String value) {
        this.dlevc = value;
    }

    /**
     * Gets the value of the dtevc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTEVC() {
        return dtevc;
    }

    /**
     * Sets the value of the dtevc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTEVC(String value) {
        this.dtevc = value;
    }

    /**
     * Gets the value of the pstag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSTAG() {
        return pstag;
    }

    /**
     * Sets the value of the pstag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSTAG(String value) {
        this.pstag = value;
    }

    /**
     * Gets the value of the dlinc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDLINC() {
        return dlinc;
    }

    /**
     * Sets the value of the dlinc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDLINC(String value) {
        this.dlinc = value;
    }

    /**
     * Gets the value of the dtinc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTINC() {
        return dtinc;
    }

    /**
     * Sets the value of the dtinc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTINC(String value) {
        this.dtinc = value;
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
