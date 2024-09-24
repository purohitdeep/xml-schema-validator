
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
 *         &lt;element name="PFART" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PFNUM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AZART" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AZGRD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ESTDT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BETRG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPKEN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGART" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DSXWA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DSBWA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="13"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DSXED" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DSBED" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DSNED" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="60"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DSXAG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DSTAG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DSXGF" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DSBGF" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="13"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DSGGF" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DSXKF" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DSGKF" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DSAKF" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DSXKZ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DSAKZ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DSXZB" minOccurs="0"&gt;
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
 *         &lt;element name="DSRSN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="60"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DSBWA_TEXT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="60"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DSBWA_2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="13"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DSBWA_2_TEXT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="60"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DSBWA_3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="13"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DSBWA_3_TEXT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="60"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DSBUH" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
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
    "pfart",
    "pfnum",
    "azart",
    "azgrd",
    "estdt",
    "betrg",
    "opken",
    "lgart",
    "dsxwa",
    "dsbwa",
    "dsxed",
    "dsbed",
    "dsned",
    "dsxag",
    "dstag",
    "dsxgf",
    "dsbgf",
    "dsggf",
    "dsxkf",
    "dsgkf",
    "dsakf",
    "dsxkz",
    "dsakz",
    "dsxzb",
    "grpvl",
    "dsrsn",
    "dsbwatext",
    "dsbwa2",
    "dsbwa2TEXT",
    "dsbwa3",
    "dsbwa3TEXT",
    "dsbuh"
})
public class E1P0137 {

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
    @XmlElement(name = "PFART")
    protected String pfart;
    @XmlElement(name = "PFNUM")
    protected String pfnum;
    @XmlElement(name = "AZART")
    protected String azart;
    @XmlElement(name = "AZGRD")
    protected String azgrd;
    @XmlElement(name = "ESTDT")
    protected String estdt;
    @XmlElement(name = "BETRG")
    protected String betrg;
    @XmlElement(name = "OPKEN")
    protected String opken;
    @XmlElement(name = "LGART")
    protected String lgart;
    @XmlElement(name = "DSXWA")
    protected String dsxwa;
    @XmlElement(name = "DSBWA")
    protected String dsbwa;
    @XmlElement(name = "DSXED")
    protected String dsxed;
    @XmlElement(name = "DSBED")
    protected String dsbed;
    @XmlElement(name = "DSNED")
    protected String dsned;
    @XmlElement(name = "DSXAG")
    protected String dsxag;
    @XmlElement(name = "DSTAG")
    protected String dstag;
    @XmlElement(name = "DSXGF")
    protected String dsxgf;
    @XmlElement(name = "DSBGF")
    protected String dsbgf;
    @XmlElement(name = "DSGGF")
    protected String dsggf;
    @XmlElement(name = "DSXKF")
    protected String dsxkf;
    @XmlElement(name = "DSGKF")
    protected String dsgkf;
    @XmlElement(name = "DSAKF")
    protected String dsakf;
    @XmlElement(name = "DSXKZ")
    protected String dsxkz;
    @XmlElement(name = "DSAKZ")
    protected String dsakz;
    @XmlElement(name = "DSXZB")
    protected String dsxzb;
    @XmlElement(name = "GRPVL")
    protected String grpvl;
    @XmlElement(name = "DSRSN")
    protected String dsrsn;
    @XmlElement(name = "DSBWA_TEXT")
    protected String dsbwatext;
    @XmlElement(name = "DSBWA_2")
    protected String dsbwa2;
    @XmlElement(name = "DSBWA_2_TEXT")
    protected String dsbwa2TEXT;
    @XmlElement(name = "DSBWA_3")
    protected String dsbwa3;
    @XmlElement(name = "DSBWA_3_TEXT")
    protected String dsbwa3TEXT;
    @XmlElement(name = "DSBUH")
    protected String dsbuh;
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
     * Gets the value of the pfart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPFART() {
        return pfart;
    }

    /**
     * Sets the value of the pfart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPFART(String value) {
        this.pfart = value;
    }

    /**
     * Gets the value of the pfnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPFNUM() {
        return pfnum;
    }

    /**
     * Sets the value of the pfnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPFNUM(String value) {
        this.pfnum = value;
    }

    /**
     * Gets the value of the azart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAZART() {
        return azart;
    }

    /**
     * Sets the value of the azart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAZART(String value) {
        this.azart = value;
    }

    /**
     * Gets the value of the azgrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAZGRD() {
        return azgrd;
    }

    /**
     * Sets the value of the azgrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAZGRD(String value) {
        this.azgrd = value;
    }

    /**
     * Gets the value of the estdt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESTDT() {
        return estdt;
    }

    /**
     * Sets the value of the estdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESTDT(String value) {
        this.estdt = value;
    }

    /**
     * Gets the value of the betrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBETRG() {
        return betrg;
    }

    /**
     * Sets the value of the betrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBETRG(String value) {
        this.betrg = value;
    }

    /**
     * Gets the value of the opken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPKEN() {
        return opken;
    }

    /**
     * Sets the value of the opken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPKEN(String value) {
        this.opken = value;
    }

    /**
     * Gets the value of the lgart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGART() {
        return lgart;
    }

    /**
     * Sets the value of the lgart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGART(String value) {
        this.lgart = value;
    }

    /**
     * Gets the value of the dsxwa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSXWA() {
        return dsxwa;
    }

    /**
     * Sets the value of the dsxwa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSXWA(String value) {
        this.dsxwa = value;
    }

    /**
     * Gets the value of the dsbwa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSBWA() {
        return dsbwa;
    }

    /**
     * Sets the value of the dsbwa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSBWA(String value) {
        this.dsbwa = value;
    }

    /**
     * Gets the value of the dsxed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSXED() {
        return dsxed;
    }

    /**
     * Sets the value of the dsxed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSXED(String value) {
        this.dsxed = value;
    }

    /**
     * Gets the value of the dsbed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSBED() {
        return dsbed;
    }

    /**
     * Sets the value of the dsbed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSBED(String value) {
        this.dsbed = value;
    }

    /**
     * Gets the value of the dsned property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSNED() {
        return dsned;
    }

    /**
     * Sets the value of the dsned property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSNED(String value) {
        this.dsned = value;
    }

    /**
     * Gets the value of the dsxag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSXAG() {
        return dsxag;
    }

    /**
     * Sets the value of the dsxag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSXAG(String value) {
        this.dsxag = value;
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
     * Gets the value of the dsxgf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSXGF() {
        return dsxgf;
    }

    /**
     * Sets the value of the dsxgf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSXGF(String value) {
        this.dsxgf = value;
    }

    /**
     * Gets the value of the dsbgf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSBGF() {
        return dsbgf;
    }

    /**
     * Sets the value of the dsbgf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSBGF(String value) {
        this.dsbgf = value;
    }

    /**
     * Gets the value of the dsggf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSGGF() {
        return dsggf;
    }

    /**
     * Sets the value of the dsggf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSGGF(String value) {
        this.dsggf = value;
    }

    /**
     * Gets the value of the dsxkf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSXKF() {
        return dsxkf;
    }

    /**
     * Sets the value of the dsxkf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSXKF(String value) {
        this.dsxkf = value;
    }

    /**
     * Gets the value of the dsgkf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSGKF() {
        return dsgkf;
    }

    /**
     * Sets the value of the dsgkf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSGKF(String value) {
        this.dsgkf = value;
    }

    /**
     * Gets the value of the dsakf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSAKF() {
        return dsakf;
    }

    /**
     * Sets the value of the dsakf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSAKF(String value) {
        this.dsakf = value;
    }

    /**
     * Gets the value of the dsxkz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSXKZ() {
        return dsxkz;
    }

    /**
     * Sets the value of the dsxkz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSXKZ(String value) {
        this.dsxkz = value;
    }

    /**
     * Gets the value of the dsakz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSAKZ() {
        return dsakz;
    }

    /**
     * Sets the value of the dsakz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSAKZ(String value) {
        this.dsakz = value;
    }

    /**
     * Gets the value of the dsxzb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSXZB() {
        return dsxzb;
    }

    /**
     * Sets the value of the dsxzb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSXZB(String value) {
        this.dsxzb = value;
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
     * Gets the value of the dsrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSRSN() {
        return dsrsn;
    }

    /**
     * Sets the value of the dsrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSRSN(String value) {
        this.dsrsn = value;
    }

    /**
     * Gets the value of the dsbwatext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSBWATEXT() {
        return dsbwatext;
    }

    /**
     * Sets the value of the dsbwatext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSBWATEXT(String value) {
        this.dsbwatext = value;
    }

    /**
     * Gets the value of the dsbwa2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSBWA2() {
        return dsbwa2;
    }

    /**
     * Sets the value of the dsbwa2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSBWA2(String value) {
        this.dsbwa2 = value;
    }

    /**
     * Gets the value of the dsbwa2TEXT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSBWA2TEXT() {
        return dsbwa2TEXT;
    }

    /**
     * Sets the value of the dsbwa2TEXT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSBWA2TEXT(String value) {
        this.dsbwa2TEXT = value;
    }

    /**
     * Gets the value of the dsbwa3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSBWA3() {
        return dsbwa3;
    }

    /**
     * Sets the value of the dsbwa3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSBWA3(String value) {
        this.dsbwa3 = value;
    }

    /**
     * Gets the value of the dsbwa3TEXT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSBWA3TEXT() {
        return dsbwa3TEXT;
    }

    /**
     * Sets the value of the dsbwa3TEXT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSBWA3TEXT(String value) {
        this.dsbwa3TEXT = value;
    }

    /**
     * Gets the value of the dsbuh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSBUH() {
        return dsbuh;
    }

    /**
     * Sets the value of the dsbuh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSBUH(String value) {
        this.dsbuh = value;
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
