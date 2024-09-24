
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
 *         &lt;element name="BVKTL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BVKKA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BVAKA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BVMKT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BVETL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BVEKI" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BVECH" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BVEMV" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BVWMV" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BVWWE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BVATL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BVAMT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BVFAM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BVTAX" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BVVAK" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BVFSV" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
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
 *         &lt;element name="BVPCT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BVMUT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BVAMU" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BVEPC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BVEXC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BVBOR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BVRES" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BVFOR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BV281" minOccurs="0"&gt;
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
 *         &lt;element name="CHIAL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BVCOA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NR65S" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="N65SD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TAXDE" minOccurs="0"&gt;
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
    "bvktl",
    "bvkka",
    "bvaka",
    "bvmkt",
    "bvetl",
    "bveki",
    "bvech",
    "bvemv",
    "bvwmv",
    "bvwwe",
    "bvatl",
    "bvamt",
    "bvfam",
    "bvtax",
    "bvvak",
    "bvfsv",
    "waers",
    "bvpct",
    "bvmut",
    "bvamu",
    "bvepc",
    "bvexc",
    "bvbor",
    "bvres",
    "bvfor",
    "bv281",
    "grpvl",
    "chial",
    "bvcoa",
    "nr65S",
    "n65SD",
    "taxde"
})
public class E1P0101 {

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
    @XmlElement(name = "BVKTL")
    protected String bvktl;
    @XmlElement(name = "BVKKA")
    protected String bvkka;
    @XmlElement(name = "BVAKA")
    protected String bvaka;
    @XmlElement(name = "BVMKT")
    protected String bvmkt;
    @XmlElement(name = "BVETL")
    protected String bvetl;
    @XmlElement(name = "BVEKI")
    protected String bveki;
    @XmlElement(name = "BVECH")
    protected String bvech;
    @XmlElement(name = "BVEMV")
    protected String bvemv;
    @XmlElement(name = "BVWMV")
    protected String bvwmv;
    @XmlElement(name = "BVWWE")
    protected String bvwwe;
    @XmlElement(name = "BVATL")
    protected String bvatl;
    @XmlElement(name = "BVAMT")
    protected String bvamt;
    @XmlElement(name = "BVFAM")
    protected String bvfam;
    @XmlElement(name = "BVTAX")
    protected String bvtax;
    @XmlElement(name = "BVVAK")
    protected String bvvak;
    @XmlElement(name = "BVFSV")
    protected String bvfsv;
    @XmlElement(name = "WAERS")
    protected String waers;
    @XmlElement(name = "BVPCT")
    protected String bvpct;
    @XmlElement(name = "BVMUT")
    protected String bvmut;
    @XmlElement(name = "BVAMU")
    protected String bvamu;
    @XmlElement(name = "BVEPC")
    protected String bvepc;
    @XmlElement(name = "BVEXC")
    protected String bvexc;
    @XmlElement(name = "BVBOR")
    protected String bvbor;
    @XmlElement(name = "BVRES")
    protected String bvres;
    @XmlElement(name = "BVFOR")
    protected String bvfor;
    @XmlElement(name = "BV281")
    protected String bv281;
    @XmlElement(name = "GRPVL")
    protected String grpvl;
    @XmlElement(name = "CHIAL")
    protected String chial;
    @XmlElement(name = "BVCOA")
    protected String bvcoa;
    @XmlElement(name = "NR65S")
    protected String nr65S;
    @XmlElement(name = "N65SD")
    protected String n65SD;
    @XmlElement(name = "TAXDE")
    protected String taxde;
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
     * Gets the value of the bvktl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBVKTL() {
        return bvktl;
    }

    /**
     * Sets the value of the bvktl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBVKTL(String value) {
        this.bvktl = value;
    }

    /**
     * Gets the value of the bvkka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBVKKA() {
        return bvkka;
    }

    /**
     * Sets the value of the bvkka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBVKKA(String value) {
        this.bvkka = value;
    }

    /**
     * Gets the value of the bvaka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBVAKA() {
        return bvaka;
    }

    /**
     * Sets the value of the bvaka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBVAKA(String value) {
        this.bvaka = value;
    }

    /**
     * Gets the value of the bvmkt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBVMKT() {
        return bvmkt;
    }

    /**
     * Sets the value of the bvmkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBVMKT(String value) {
        this.bvmkt = value;
    }

    /**
     * Gets the value of the bvetl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBVETL() {
        return bvetl;
    }

    /**
     * Sets the value of the bvetl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBVETL(String value) {
        this.bvetl = value;
    }

    /**
     * Gets the value of the bveki property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBVEKI() {
        return bveki;
    }

    /**
     * Sets the value of the bveki property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBVEKI(String value) {
        this.bveki = value;
    }

    /**
     * Gets the value of the bvech property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBVECH() {
        return bvech;
    }

    /**
     * Sets the value of the bvech property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBVECH(String value) {
        this.bvech = value;
    }

    /**
     * Gets the value of the bvemv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBVEMV() {
        return bvemv;
    }

    /**
     * Sets the value of the bvemv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBVEMV(String value) {
        this.bvemv = value;
    }

    /**
     * Gets the value of the bvwmv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBVWMV() {
        return bvwmv;
    }

    /**
     * Sets the value of the bvwmv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBVWMV(String value) {
        this.bvwmv = value;
    }

    /**
     * Gets the value of the bvwwe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBVWWE() {
        return bvwwe;
    }

    /**
     * Sets the value of the bvwwe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBVWWE(String value) {
        this.bvwwe = value;
    }

    /**
     * Gets the value of the bvatl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBVATL() {
        return bvatl;
    }

    /**
     * Sets the value of the bvatl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBVATL(String value) {
        this.bvatl = value;
    }

    /**
     * Gets the value of the bvamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBVAMT() {
        return bvamt;
    }

    /**
     * Sets the value of the bvamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBVAMT(String value) {
        this.bvamt = value;
    }

    /**
     * Gets the value of the bvfam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBVFAM() {
        return bvfam;
    }

    /**
     * Sets the value of the bvfam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBVFAM(String value) {
        this.bvfam = value;
    }

    /**
     * Gets the value of the bvtax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBVTAX() {
        return bvtax;
    }

    /**
     * Sets the value of the bvtax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBVTAX(String value) {
        this.bvtax = value;
    }

    /**
     * Gets the value of the bvvak property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBVVAK() {
        return bvvak;
    }

    /**
     * Sets the value of the bvvak property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBVVAK(String value) {
        this.bvvak = value;
    }

    /**
     * Gets the value of the bvfsv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBVFSV() {
        return bvfsv;
    }

    /**
     * Sets the value of the bvfsv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBVFSV(String value) {
        this.bvfsv = value;
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
     * Gets the value of the bvpct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBVPCT() {
        return bvpct;
    }

    /**
     * Sets the value of the bvpct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBVPCT(String value) {
        this.bvpct = value;
    }

    /**
     * Gets the value of the bvmut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBVMUT() {
        return bvmut;
    }

    /**
     * Sets the value of the bvmut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBVMUT(String value) {
        this.bvmut = value;
    }

    /**
     * Gets the value of the bvamu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBVAMU() {
        return bvamu;
    }

    /**
     * Sets the value of the bvamu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBVAMU(String value) {
        this.bvamu = value;
    }

    /**
     * Gets the value of the bvepc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBVEPC() {
        return bvepc;
    }

    /**
     * Sets the value of the bvepc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBVEPC(String value) {
        this.bvepc = value;
    }

    /**
     * Gets the value of the bvexc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBVEXC() {
        return bvexc;
    }

    /**
     * Sets the value of the bvexc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBVEXC(String value) {
        this.bvexc = value;
    }

    /**
     * Gets the value of the bvbor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBVBOR() {
        return bvbor;
    }

    /**
     * Sets the value of the bvbor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBVBOR(String value) {
        this.bvbor = value;
    }

    /**
     * Gets the value of the bvres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBVRES() {
        return bvres;
    }

    /**
     * Sets the value of the bvres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBVRES(String value) {
        this.bvres = value;
    }

    /**
     * Gets the value of the bvfor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBVFOR() {
        return bvfor;
    }

    /**
     * Sets the value of the bvfor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBVFOR(String value) {
        this.bvfor = value;
    }

    /**
     * Gets the value of the bv281 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBV281() {
        return bv281;
    }

    /**
     * Sets the value of the bv281 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBV281(String value) {
        this.bv281 = value;
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
     * Gets the value of the chial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHIAL() {
        return chial;
    }

    /**
     * Sets the value of the chial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHIAL(String value) {
        this.chial = value;
    }

    /**
     * Gets the value of the bvcoa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBVCOA() {
        return bvcoa;
    }

    /**
     * Sets the value of the bvcoa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBVCOA(String value) {
        this.bvcoa = value;
    }

    /**
     * Gets the value of the nr65S property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNR65S() {
        return nr65S;
    }

    /**
     * Sets the value of the nr65S property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNR65S(String value) {
        this.nr65S = value;
    }

    /**
     * Gets the value of the n65SD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getN65SD() {
        return n65SD;
    }

    /**
     * Sets the value of the n65SD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setN65SD(String value) {
        this.n65SD = value;
    }

    /**
     * Gets the value of the taxde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAXDE() {
        return taxde;
    }

    /**
     * Sets the value of the taxde property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAXDE(String value) {
        this.taxde = value;
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
