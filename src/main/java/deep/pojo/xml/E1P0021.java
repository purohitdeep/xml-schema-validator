
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
 *         &lt;element name="FGBOT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FGDEP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ERBNR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FGBNA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FNAC2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FCNAM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
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
 *         &lt;element name="FINIT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FVRSW" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FVRS2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FNMZU" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AHVNR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDSVH" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDBSL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDUTB" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDGBR" minOccurs="0"&gt;
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
 *         &lt;element name="KDZUG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDZUL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDVBE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ERMNR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AUSVL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AUSVG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FASDT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FASAR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FASIN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EGAGA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FANA2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FANA3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
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
 *         &lt;element name="TITEL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EMRGN" minOccurs="0"&gt;
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
    "fgbot",
    "fgdep",
    "erbnr",
    "fgbna",
    "fnac2",
    "fcnam",
    "fknzn",
    "finit",
    "fvrsw",
    "fvrs2",
    "fnmzu",
    "ahvnr",
    "kdsvh",
    "kdbsl",
    "kdutb",
    "kdgbr",
    "kdart",
    "kdzug",
    "kdzul",
    "kdvbe",
    "ermnr",
    "ausvl",
    "ausvg",
    "fasdt",
    "fasar",
    "fasin",
    "egaga",
    "fana2",
    "fana3",
    "betrg",
    "titel",
    "emrgn",
    "grpvl"
})
public class E1P0021 {

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
    @XmlElement(name = "FGBOT")
    protected String fgbot;
    @XmlElement(name = "FGDEP")
    protected String fgdep;
    @XmlElement(name = "ERBNR")
    protected String erbnr;
    @XmlElement(name = "FGBNA")
    protected String fgbna;
    @XmlElement(name = "FNAC2")
    protected String fnac2;
    @XmlElement(name = "FCNAM")
    protected String fcnam;
    @XmlElement(name = "FKNZN")
    protected String fknzn;
    @XmlElement(name = "FINIT")
    protected String finit;
    @XmlElement(name = "FVRSW")
    protected String fvrsw;
    @XmlElement(name = "FVRS2")
    protected String fvrs2;
    @XmlElement(name = "FNMZU")
    protected String fnmzu;
    @XmlElement(name = "AHVNR")
    protected String ahvnr;
    @XmlElement(name = "KDSVH")
    protected String kdsvh;
    @XmlElement(name = "KDBSL")
    protected String kdbsl;
    @XmlElement(name = "KDUTB")
    protected String kdutb;
    @XmlElement(name = "KDGBR")
    protected String kdgbr;
    @XmlElement(name = "KDART")
    protected String kdart;
    @XmlElement(name = "KDZUG")
    protected String kdzug;
    @XmlElement(name = "KDZUL")
    protected String kdzul;
    @XmlElement(name = "KDVBE")
    protected String kdvbe;
    @XmlElement(name = "ERMNR")
    protected String ermnr;
    @XmlElement(name = "AUSVL")
    protected String ausvl;
    @XmlElement(name = "AUSVG")
    protected String ausvg;
    @XmlElement(name = "FASDT")
    protected String fasdt;
    @XmlElement(name = "FASAR")
    protected String fasar;
    @XmlElement(name = "FASIN")
    protected String fasin;
    @XmlElement(name = "EGAGA")
    protected String egaga;
    @XmlElement(name = "FANA2")
    protected String fana2;
    @XmlElement(name = "FANA3")
    protected String fana3;
    @XmlElement(name = "BETRG")
    protected String betrg;
    @XmlElement(name = "TITEL")
    protected String titel;
    @XmlElement(name = "EMRGN")
    protected String emrgn;
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
     * Gets the value of the fgdep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFGDEP() {
        return fgdep;
    }

    /**
     * Sets the value of the fgdep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFGDEP(String value) {
        this.fgdep = value;
    }

    /**
     * Gets the value of the erbnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERBNR() {
        return erbnr;
    }

    /**
     * Sets the value of the erbnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERBNR(String value) {
        this.erbnr = value;
    }

    /**
     * Gets the value of the fgbna property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFGBNA() {
        return fgbna;
    }

    /**
     * Sets the value of the fgbna property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFGBNA(String value) {
        this.fgbna = value;
    }

    /**
     * Gets the value of the fnac2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNAC2() {
        return fnac2;
    }

    /**
     * Sets the value of the fnac2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNAC2(String value) {
        this.fnac2 = value;
    }

    /**
     * Gets the value of the fcnam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCNAM() {
        return fcnam;
    }

    /**
     * Sets the value of the fcnam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCNAM(String value) {
        this.fcnam = value;
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
     * Gets the value of the finit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFINIT() {
        return finit;
    }

    /**
     * Sets the value of the finit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFINIT(String value) {
        this.finit = value;
    }

    /**
     * Gets the value of the fvrsw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFVRSW() {
        return fvrsw;
    }

    /**
     * Sets the value of the fvrsw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFVRSW(String value) {
        this.fvrsw = value;
    }

    /**
     * Gets the value of the fvrs2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFVRS2() {
        return fvrs2;
    }

    /**
     * Sets the value of the fvrs2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFVRS2(String value) {
        this.fvrs2 = value;
    }

    /**
     * Gets the value of the fnmzu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNMZU() {
        return fnmzu;
    }

    /**
     * Sets the value of the fnmzu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNMZU(String value) {
        this.fnmzu = value;
    }

    /**
     * Gets the value of the ahvnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAHVNR() {
        return ahvnr;
    }

    /**
     * Sets the value of the ahvnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAHVNR(String value) {
        this.ahvnr = value;
    }

    /**
     * Gets the value of the kdsvh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDSVH() {
        return kdsvh;
    }

    /**
     * Sets the value of the kdsvh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDSVH(String value) {
        this.kdsvh = value;
    }

    /**
     * Gets the value of the kdbsl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDBSL() {
        return kdbsl;
    }

    /**
     * Sets the value of the kdbsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDBSL(String value) {
        this.kdbsl = value;
    }

    /**
     * Gets the value of the kdutb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDUTB() {
        return kdutb;
    }

    /**
     * Sets the value of the kdutb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDUTB(String value) {
        this.kdutb = value;
    }

    /**
     * Gets the value of the kdgbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDGBR() {
        return kdgbr;
    }

    /**
     * Sets the value of the kdgbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDGBR(String value) {
        this.kdgbr = value;
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
     * Gets the value of the kdzug property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDZUG() {
        return kdzug;
    }

    /**
     * Sets the value of the kdzug property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDZUG(String value) {
        this.kdzug = value;
    }

    /**
     * Gets the value of the kdzul property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDZUL() {
        return kdzul;
    }

    /**
     * Sets the value of the kdzul property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDZUL(String value) {
        this.kdzul = value;
    }

    /**
     * Gets the value of the kdvbe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDVBE() {
        return kdvbe;
    }

    /**
     * Sets the value of the kdvbe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDVBE(String value) {
        this.kdvbe = value;
    }

    /**
     * Gets the value of the ermnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERMNR() {
        return ermnr;
    }

    /**
     * Sets the value of the ermnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERMNR(String value) {
        this.ermnr = value;
    }

    /**
     * Gets the value of the ausvl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUSVL() {
        return ausvl;
    }

    /**
     * Sets the value of the ausvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUSVL(String value) {
        this.ausvl = value;
    }

    /**
     * Gets the value of the ausvg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUSVG() {
        return ausvg;
    }

    /**
     * Sets the value of the ausvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUSVG(String value) {
        this.ausvg = value;
    }

    /**
     * Gets the value of the fasdt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFASDT() {
        return fasdt;
    }

    /**
     * Sets the value of the fasdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFASDT(String value) {
        this.fasdt = value;
    }

    /**
     * Gets the value of the fasar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFASAR() {
        return fasar;
    }

    /**
     * Sets the value of the fasar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFASAR(String value) {
        this.fasar = value;
    }

    /**
     * Gets the value of the fasin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFASIN() {
        return fasin;
    }

    /**
     * Sets the value of the fasin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFASIN(String value) {
        this.fasin = value;
    }

    /**
     * Gets the value of the egaga property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEGAGA() {
        return egaga;
    }

    /**
     * Sets the value of the egaga property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEGAGA(String value) {
        this.egaga = value;
    }

    /**
     * Gets the value of the fana2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFANA2() {
        return fana2;
    }

    /**
     * Sets the value of the fana2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFANA2(String value) {
        this.fana2 = value;
    }

    /**
     * Gets the value of the fana3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFANA3() {
        return fana3;
    }

    /**
     * Sets the value of the fana3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFANA3(String value) {
        this.fana3 = value;
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
     * Gets the value of the titel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITEL() {
        return titel;
    }

    /**
     * Sets the value of the titel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITEL(String value) {
        this.titel = value;
    }

    /**
     * Gets the value of the emrgn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMRGN() {
        return emrgn;
    }

    /**
     * Sets the value of the emrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMRGN(String value) {
        this.emrgn = value;
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
