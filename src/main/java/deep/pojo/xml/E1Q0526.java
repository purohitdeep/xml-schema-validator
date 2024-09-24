
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
 *         &lt;element name="ANV50" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANB50" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANV60" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANB60" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN50" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN60" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNV50" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNB50" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNV60" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNB60" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNV70" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNB70" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNV80" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNB80" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
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
 *         &lt;element name="DGNA01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTEL01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AVER2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IBAN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="34"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TITL2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SBGB0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LABTG0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PLZL1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WORT1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="STRA1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BIC0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANV70" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANB70" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANV80" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANB80" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANV90" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANB90" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANVA0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANBA0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GEGC0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GEGT0" minOccurs="0"&gt;
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
    "anv50",
    "anb50",
    "anv60",
    "anb60",
    "ein50",
    "ein60",
    "unv50",
    "unb50",
    "unv60",
    "unb60",
    "unv70",
    "unb70",
    "unv80",
    "unb80",
    "grpvl",
    "dgna01",
    "dtel01",
    "aver2",
    "iban",
    "titl2",
    "sbgb0",
    "labtg0",
    "plzl1",
    "wort1",
    "stra1",
    "bic0",
    "apf01",
    "apf02",
    "apf03",
    "apf04",
    "apf05",
    "apf06",
    "apf07",
    "apf08",
    "apf09",
    "apf10",
    "anv70",
    "anb70",
    "anv80",
    "anb80",
    "anv90",
    "anb90",
    "anva0",
    "anba0",
    "gegc0",
    "gegt0"
})
public class E1Q0526 {

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
    @XmlElement(name = "ANV50")
    protected String anv50;
    @XmlElement(name = "ANB50")
    protected String anb50;
    @XmlElement(name = "ANV60")
    protected String anv60;
    @XmlElement(name = "ANB60")
    protected String anb60;
    @XmlElement(name = "EIN50")
    protected String ein50;
    @XmlElement(name = "EIN60")
    protected String ein60;
    @XmlElement(name = "UNV50")
    protected String unv50;
    @XmlElement(name = "UNB50")
    protected String unb50;
    @XmlElement(name = "UNV60")
    protected String unv60;
    @XmlElement(name = "UNB60")
    protected String unb60;
    @XmlElement(name = "UNV70")
    protected String unv70;
    @XmlElement(name = "UNB70")
    protected String unb70;
    @XmlElement(name = "UNV80")
    protected String unv80;
    @XmlElement(name = "UNB80")
    protected String unb80;
    @XmlElement(name = "GRPVL")
    protected String grpvl;
    @XmlElement(name = "DGNA01")
    protected String dgna01;
    @XmlElement(name = "DTEL01")
    protected String dtel01;
    @XmlElement(name = "AVER2")
    protected String aver2;
    @XmlElement(name = "IBAN")
    protected String iban;
    @XmlElement(name = "TITL2")
    protected String titl2;
    @XmlElement(name = "SBGB0")
    protected String sbgb0;
    @XmlElement(name = "LABTG0")
    protected String labtg0;
    @XmlElement(name = "PLZL1")
    protected String plzl1;
    @XmlElement(name = "WORT1")
    protected String wort1;
    @XmlElement(name = "STRA1")
    protected String stra1;
    @XmlElement(name = "BIC0")
    protected String bic0;
    @XmlElement(name = "APF01")
    protected String apf01;
    @XmlElement(name = "APF02")
    protected String apf02;
    @XmlElement(name = "APF03")
    protected String apf03;
    @XmlElement(name = "APF04")
    protected String apf04;
    @XmlElement(name = "APF05")
    protected String apf05;
    @XmlElement(name = "APF06")
    protected String apf06;
    @XmlElement(name = "APF07")
    protected String apf07;
    @XmlElement(name = "APF08")
    protected String apf08;
    @XmlElement(name = "APF09")
    protected String apf09;
    @XmlElement(name = "APF10")
    protected String apf10;
    @XmlElement(name = "ANV70")
    protected String anv70;
    @XmlElement(name = "ANB70")
    protected String anb70;
    @XmlElement(name = "ANV80")
    protected String anv80;
    @XmlElement(name = "ANB80")
    protected String anb80;
    @XmlElement(name = "ANV90")
    protected String anv90;
    @XmlElement(name = "ANB90")
    protected String anb90;
    @XmlElement(name = "ANVA0")
    protected String anva0;
    @XmlElement(name = "ANBA0")
    protected String anba0;
    @XmlElement(name = "GEGC0")
    protected String gegc0;
    @XmlElement(name = "GEGT0")
    protected String gegt0;
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
     * Gets the value of the anv50 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANV50() {
        return anv50;
    }

    /**
     * Sets the value of the anv50 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANV50(String value) {
        this.anv50 = value;
    }

    /**
     * Gets the value of the anb50 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANB50() {
        return anb50;
    }

    /**
     * Sets the value of the anb50 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANB50(String value) {
        this.anb50 = value;
    }

    /**
     * Gets the value of the anv60 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANV60() {
        return anv60;
    }

    /**
     * Sets the value of the anv60 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANV60(String value) {
        this.anv60 = value;
    }

    /**
     * Gets the value of the anb60 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANB60() {
        return anb60;
    }

    /**
     * Sets the value of the anb60 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANB60(String value) {
        this.anb60 = value;
    }

    /**
     * Gets the value of the ein50 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN50() {
        return ein50;
    }

    /**
     * Sets the value of the ein50 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN50(String value) {
        this.ein50 = value;
    }

    /**
     * Gets the value of the ein60 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN60() {
        return ein60;
    }

    /**
     * Sets the value of the ein60 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN60(String value) {
        this.ein60 = value;
    }

    /**
     * Gets the value of the unv50 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNV50() {
        return unv50;
    }

    /**
     * Sets the value of the unv50 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNV50(String value) {
        this.unv50 = value;
    }

    /**
     * Gets the value of the unb50 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNB50() {
        return unb50;
    }

    /**
     * Sets the value of the unb50 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNB50(String value) {
        this.unb50 = value;
    }

    /**
     * Gets the value of the unv60 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNV60() {
        return unv60;
    }

    /**
     * Sets the value of the unv60 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNV60(String value) {
        this.unv60 = value;
    }

    /**
     * Gets the value of the unb60 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNB60() {
        return unb60;
    }

    /**
     * Sets the value of the unb60 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNB60(String value) {
        this.unb60 = value;
    }

    /**
     * Gets the value of the unv70 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNV70() {
        return unv70;
    }

    /**
     * Sets the value of the unv70 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNV70(String value) {
        this.unv70 = value;
    }

    /**
     * Gets the value of the unb70 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNB70() {
        return unb70;
    }

    /**
     * Sets the value of the unb70 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNB70(String value) {
        this.unb70 = value;
    }

    /**
     * Gets the value of the unv80 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNV80() {
        return unv80;
    }

    /**
     * Sets the value of the unv80 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNV80(String value) {
        this.unv80 = value;
    }

    /**
     * Gets the value of the unb80 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNB80() {
        return unb80;
    }

    /**
     * Sets the value of the unb80 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNB80(String value) {
        this.unb80 = value;
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
     * Gets the value of the dgna01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDGNA01() {
        return dgna01;
    }

    /**
     * Sets the value of the dgna01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDGNA01(String value) {
        this.dgna01 = value;
    }

    /**
     * Gets the value of the dtel01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTEL01() {
        return dtel01;
    }

    /**
     * Sets the value of the dtel01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTEL01(String value) {
        this.dtel01 = value;
    }

    /**
     * Gets the value of the aver2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVER2() {
        return aver2;
    }

    /**
     * Sets the value of the aver2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVER2(String value) {
        this.aver2 = value;
    }

    /**
     * Gets the value of the iban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBAN() {
        return iban;
    }

    /**
     * Sets the value of the iban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBAN(String value) {
        this.iban = value;
    }

    /**
     * Gets the value of the titl2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITL2() {
        return titl2;
    }

    /**
     * Sets the value of the titl2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITL2(String value) {
        this.titl2 = value;
    }

    /**
     * Gets the value of the sbgb0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBGB0() {
        return sbgb0;
    }

    /**
     * Sets the value of the sbgb0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBGB0(String value) {
        this.sbgb0 = value;
    }

    /**
     * Gets the value of the labtg0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLABTG0() {
        return labtg0;
    }

    /**
     * Sets the value of the labtg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLABTG0(String value) {
        this.labtg0 = value;
    }

    /**
     * Gets the value of the plzl1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLZL1() {
        return plzl1;
    }

    /**
     * Sets the value of the plzl1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLZL1(String value) {
        this.plzl1 = value;
    }

    /**
     * Gets the value of the wort1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWORT1() {
        return wort1;
    }

    /**
     * Sets the value of the wort1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWORT1(String value) {
        this.wort1 = value;
    }

    /**
     * Gets the value of the stra1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTRA1() {
        return stra1;
    }

    /**
     * Sets the value of the stra1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTRA1(String value) {
        this.stra1 = value;
    }

    /**
     * Gets the value of the bic0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIC0() {
        return bic0;
    }

    /**
     * Sets the value of the bic0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIC0(String value) {
        this.bic0 = value;
    }

    /**
     * Gets the value of the apf01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF01() {
        return apf01;
    }

    /**
     * Sets the value of the apf01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF01(String value) {
        this.apf01 = value;
    }

    /**
     * Gets the value of the apf02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF02() {
        return apf02;
    }

    /**
     * Sets the value of the apf02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF02(String value) {
        this.apf02 = value;
    }

    /**
     * Gets the value of the apf03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF03() {
        return apf03;
    }

    /**
     * Sets the value of the apf03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF03(String value) {
        this.apf03 = value;
    }

    /**
     * Gets the value of the apf04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF04() {
        return apf04;
    }

    /**
     * Sets the value of the apf04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF04(String value) {
        this.apf04 = value;
    }

    /**
     * Gets the value of the apf05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF05() {
        return apf05;
    }

    /**
     * Sets the value of the apf05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF05(String value) {
        this.apf05 = value;
    }

    /**
     * Gets the value of the apf06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF06() {
        return apf06;
    }

    /**
     * Sets the value of the apf06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF06(String value) {
        this.apf06 = value;
    }

    /**
     * Gets the value of the apf07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF07() {
        return apf07;
    }

    /**
     * Sets the value of the apf07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF07(String value) {
        this.apf07 = value;
    }

    /**
     * Gets the value of the apf08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF08() {
        return apf08;
    }

    /**
     * Sets the value of the apf08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF08(String value) {
        this.apf08 = value;
    }

    /**
     * Gets the value of the apf09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF09() {
        return apf09;
    }

    /**
     * Sets the value of the apf09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF09(String value) {
        this.apf09 = value;
    }

    /**
     * Gets the value of the apf10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF10() {
        return apf10;
    }

    /**
     * Sets the value of the apf10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF10(String value) {
        this.apf10 = value;
    }

    /**
     * Gets the value of the anv70 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANV70() {
        return anv70;
    }

    /**
     * Sets the value of the anv70 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANV70(String value) {
        this.anv70 = value;
    }

    /**
     * Gets the value of the anb70 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANB70() {
        return anb70;
    }

    /**
     * Sets the value of the anb70 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANB70(String value) {
        this.anb70 = value;
    }

    /**
     * Gets the value of the anv80 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANV80() {
        return anv80;
    }

    /**
     * Sets the value of the anv80 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANV80(String value) {
        this.anv80 = value;
    }

    /**
     * Gets the value of the anb80 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANB80() {
        return anb80;
    }

    /**
     * Sets the value of the anb80 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANB80(String value) {
        this.anb80 = value;
    }

    /**
     * Gets the value of the anv90 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANV90() {
        return anv90;
    }

    /**
     * Sets the value of the anv90 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANV90(String value) {
        this.anv90 = value;
    }

    /**
     * Gets the value of the anb90 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANB90() {
        return anb90;
    }

    /**
     * Sets the value of the anb90 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANB90(String value) {
        this.anb90 = value;
    }

    /**
     * Gets the value of the anva0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANVA0() {
        return anva0;
    }

    /**
     * Sets the value of the anva0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANVA0(String value) {
        this.anva0 = value;
    }

    /**
     * Gets the value of the anba0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANBA0() {
        return anba0;
    }

    /**
     * Sets the value of the anba0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANBA0(String value) {
        this.anba0 = value;
    }

    /**
     * Gets the value of the gegc0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGEGC0() {
        return gegc0;
    }

    /**
     * Sets the value of the gegc0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGEGC0(String value) {
        this.gegc0 = value;
    }

    /**
     * Gets the value of the gegt0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGEGT0() {
        return gegt0;
    }

    /**
     * Sets the value of the gegt0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGEGT0(String value) {
        this.gegt0 = value;
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
