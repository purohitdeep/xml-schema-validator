
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
 *         &lt;element name="KANTO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GEMND" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QSTPF" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LAUWG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ARBOR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BEMZ1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BEMZ2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BEMZ3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QSTAB" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QSPRO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QSBTR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ACL01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EMA01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ACL02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EMA02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ACL03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EMA03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ACL04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EMA04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ACL05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EMA05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ACL06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EMA06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ACL07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EMA07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ACL08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EMA08" minOccurs="0"&gt;
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
 *         &lt;element name="WGMGE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AGMGE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NMSRC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AKANT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MA3GB" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MAB3G" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="60"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NEBEN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANDBE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CONCU" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRSCA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DIF_MUNIDLIVING" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANNUI" minOccurs="0"&gt;
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
    "kanto",
    "gemnd",
    "qstpf",
    "lauwg",
    "arbor",
    "bemz1",
    "bemz2",
    "bemz3",
    "qstab",
    "qspro",
    "qsbtr",
    "acl01",
    "ema01",
    "acl02",
    "ema02",
    "acl03",
    "ema03",
    "acl04",
    "ema04",
    "acl05",
    "ema05",
    "acl06",
    "ema06",
    "acl07",
    "ema07",
    "acl08",
    "ema08",
    "grpvl",
    "wgmge",
    "agmge",
    "nmsrc",
    "akant",
    "ma3GB",
    "mab3G",
    "neben",
    "andbe",
    "concu",
    "prsca",
    "difmunidliving",
    "annui"
})
public class E1P0038 {

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
    @XmlElement(name = "KANTO")
    protected String kanto;
    @XmlElement(name = "GEMND")
    protected String gemnd;
    @XmlElement(name = "QSTPF")
    protected String qstpf;
    @XmlElement(name = "LAUWG")
    protected String lauwg;
    @XmlElement(name = "ARBOR")
    protected String arbor;
    @XmlElement(name = "BEMZ1")
    protected String bemz1;
    @XmlElement(name = "BEMZ2")
    protected String bemz2;
    @XmlElement(name = "BEMZ3")
    protected String bemz3;
    @XmlElement(name = "QSTAB")
    protected String qstab;
    @XmlElement(name = "QSPRO")
    protected String qspro;
    @XmlElement(name = "QSBTR")
    protected String qsbtr;
    @XmlElement(name = "ACL01")
    protected String acl01;
    @XmlElement(name = "EMA01")
    protected String ema01;
    @XmlElement(name = "ACL02")
    protected String acl02;
    @XmlElement(name = "EMA02")
    protected String ema02;
    @XmlElement(name = "ACL03")
    protected String acl03;
    @XmlElement(name = "EMA03")
    protected String ema03;
    @XmlElement(name = "ACL04")
    protected String acl04;
    @XmlElement(name = "EMA04")
    protected String ema04;
    @XmlElement(name = "ACL05")
    protected String acl05;
    @XmlElement(name = "EMA05")
    protected String ema05;
    @XmlElement(name = "ACL06")
    protected String acl06;
    @XmlElement(name = "EMA06")
    protected String ema06;
    @XmlElement(name = "ACL07")
    protected String acl07;
    @XmlElement(name = "EMA07")
    protected String ema07;
    @XmlElement(name = "ACL08")
    protected String acl08;
    @XmlElement(name = "EMA08")
    protected String ema08;
    @XmlElement(name = "GRPVL")
    protected String grpvl;
    @XmlElement(name = "WGMGE")
    protected String wgmge;
    @XmlElement(name = "AGMGE")
    protected String agmge;
    @XmlElement(name = "NMSRC")
    protected String nmsrc;
    @XmlElement(name = "AKANT")
    protected String akant;
    @XmlElement(name = "MA3GB")
    protected String ma3GB;
    @XmlElement(name = "MAB3G")
    protected String mab3G;
    @XmlElement(name = "NEBEN")
    protected String neben;
    @XmlElement(name = "ANDBE")
    protected String andbe;
    @XmlElement(name = "CONCU")
    protected String concu;
    @XmlElement(name = "PRSCA")
    protected String prsca;
    @XmlElement(name = "DIF_MUNIDLIVING")
    protected String difmunidliving;
    @XmlElement(name = "ANNUI")
    protected String annui;
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
     * Gets the value of the kanto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKANTO() {
        return kanto;
    }

    /**
     * Sets the value of the kanto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKANTO(String value) {
        this.kanto = value;
    }

    /**
     * Gets the value of the gemnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGEMND() {
        return gemnd;
    }

    /**
     * Sets the value of the gemnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGEMND(String value) {
        this.gemnd = value;
    }

    /**
     * Gets the value of the qstpf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQSTPF() {
        return qstpf;
    }

    /**
     * Sets the value of the qstpf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQSTPF(String value) {
        this.qstpf = value;
    }

    /**
     * Gets the value of the lauwg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLAUWG() {
        return lauwg;
    }

    /**
     * Sets the value of the lauwg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLAUWG(String value) {
        this.lauwg = value;
    }

    /**
     * Gets the value of the arbor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARBOR() {
        return arbor;
    }

    /**
     * Sets the value of the arbor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARBOR(String value) {
        this.arbor = value;
    }

    /**
     * Gets the value of the bemz1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEMZ1() {
        return bemz1;
    }

    /**
     * Sets the value of the bemz1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBEMZ1(String value) {
        this.bemz1 = value;
    }

    /**
     * Gets the value of the bemz2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEMZ2() {
        return bemz2;
    }

    /**
     * Sets the value of the bemz2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBEMZ2(String value) {
        this.bemz2 = value;
    }

    /**
     * Gets the value of the bemz3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEMZ3() {
        return bemz3;
    }

    /**
     * Sets the value of the bemz3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBEMZ3(String value) {
        this.bemz3 = value;
    }

    /**
     * Gets the value of the qstab property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQSTAB() {
        return qstab;
    }

    /**
     * Sets the value of the qstab property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQSTAB(String value) {
        this.qstab = value;
    }

    /**
     * Gets the value of the qspro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQSPRO() {
        return qspro;
    }

    /**
     * Sets the value of the qspro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQSPRO(String value) {
        this.qspro = value;
    }

    /**
     * Gets the value of the qsbtr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQSBTR() {
        return qsbtr;
    }

    /**
     * Sets the value of the qsbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQSBTR(String value) {
        this.qsbtr = value;
    }

    /**
     * Gets the value of the acl01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACL01() {
        return acl01;
    }

    /**
     * Sets the value of the acl01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACL01(String value) {
        this.acl01 = value;
    }

    /**
     * Gets the value of the ema01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMA01() {
        return ema01;
    }

    /**
     * Sets the value of the ema01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMA01(String value) {
        this.ema01 = value;
    }

    /**
     * Gets the value of the acl02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACL02() {
        return acl02;
    }

    /**
     * Sets the value of the acl02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACL02(String value) {
        this.acl02 = value;
    }

    /**
     * Gets the value of the ema02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMA02() {
        return ema02;
    }

    /**
     * Sets the value of the ema02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMA02(String value) {
        this.ema02 = value;
    }

    /**
     * Gets the value of the acl03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACL03() {
        return acl03;
    }

    /**
     * Sets the value of the acl03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACL03(String value) {
        this.acl03 = value;
    }

    /**
     * Gets the value of the ema03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMA03() {
        return ema03;
    }

    /**
     * Sets the value of the ema03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMA03(String value) {
        this.ema03 = value;
    }

    /**
     * Gets the value of the acl04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACL04() {
        return acl04;
    }

    /**
     * Sets the value of the acl04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACL04(String value) {
        this.acl04 = value;
    }

    /**
     * Gets the value of the ema04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMA04() {
        return ema04;
    }

    /**
     * Sets the value of the ema04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMA04(String value) {
        this.ema04 = value;
    }

    /**
     * Gets the value of the acl05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACL05() {
        return acl05;
    }

    /**
     * Sets the value of the acl05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACL05(String value) {
        this.acl05 = value;
    }

    /**
     * Gets the value of the ema05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMA05() {
        return ema05;
    }

    /**
     * Sets the value of the ema05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMA05(String value) {
        this.ema05 = value;
    }

    /**
     * Gets the value of the acl06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACL06() {
        return acl06;
    }

    /**
     * Sets the value of the acl06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACL06(String value) {
        this.acl06 = value;
    }

    /**
     * Gets the value of the ema06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMA06() {
        return ema06;
    }

    /**
     * Sets the value of the ema06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMA06(String value) {
        this.ema06 = value;
    }

    /**
     * Gets the value of the acl07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACL07() {
        return acl07;
    }

    /**
     * Sets the value of the acl07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACL07(String value) {
        this.acl07 = value;
    }

    /**
     * Gets the value of the ema07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMA07() {
        return ema07;
    }

    /**
     * Sets the value of the ema07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMA07(String value) {
        this.ema07 = value;
    }

    /**
     * Gets the value of the acl08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACL08() {
        return acl08;
    }

    /**
     * Sets the value of the acl08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACL08(String value) {
        this.acl08 = value;
    }

    /**
     * Gets the value of the ema08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMA08() {
        return ema08;
    }

    /**
     * Sets the value of the ema08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMA08(String value) {
        this.ema08 = value;
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
     * Gets the value of the wgmge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWGMGE() {
        return wgmge;
    }

    /**
     * Sets the value of the wgmge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWGMGE(String value) {
        this.wgmge = value;
    }

    /**
     * Gets the value of the agmge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGMGE() {
        return agmge;
    }

    /**
     * Sets the value of the agmge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGMGE(String value) {
        this.agmge = value;
    }

    /**
     * Gets the value of the nmsrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMSRC() {
        return nmsrc;
    }

    /**
     * Sets the value of the nmsrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMSRC(String value) {
        this.nmsrc = value;
    }

    /**
     * Gets the value of the akant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAKANT() {
        return akant;
    }

    /**
     * Sets the value of the akant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAKANT(String value) {
        this.akant = value;
    }

    /**
     * Gets the value of the ma3GB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMA3GB() {
        return ma3GB;
    }

    /**
     * Sets the value of the ma3GB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMA3GB(String value) {
        this.ma3GB = value;
    }

    /**
     * Gets the value of the mab3G property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAB3G() {
        return mab3G;
    }

    /**
     * Sets the value of the mab3G property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAB3G(String value) {
        this.mab3G = value;
    }

    /**
     * Gets the value of the neben property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNEBEN() {
        return neben;
    }

    /**
     * Sets the value of the neben property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNEBEN(String value) {
        this.neben = value;
    }

    /**
     * Gets the value of the andbe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANDBE() {
        return andbe;
    }

    /**
     * Sets the value of the andbe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANDBE(String value) {
        this.andbe = value;
    }

    /**
     * Gets the value of the concu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONCU() {
        return concu;
    }

    /**
     * Sets the value of the concu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONCU(String value) {
        this.concu = value;
    }

    /**
     * Gets the value of the prsca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRSCA() {
        return prsca;
    }

    /**
     * Sets the value of the prsca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRSCA(String value) {
        this.prsca = value;
    }

    /**
     * Gets the value of the difmunidliving property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIFMUNIDLIVING() {
        return difmunidliving;
    }

    /**
     * Sets the value of the difmunidliving property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIFMUNIDLIVING(String value) {
        this.difmunidliving = value;
    }

    /**
     * Gets the value of the annui property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANNUI() {
        return annui;
    }

    /**
     * Sets the value of the annui property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANNUI(String value) {
        this.annui = value;
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
