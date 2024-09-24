
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
 *         &lt;element name="KVKZ1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RVKZ1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AVKZ1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RVNUM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KVSFR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KVGST" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KVBKL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KVFBT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZUSKA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SONKV" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SONRV" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SONAV" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SELKV" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SELRV" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KVBFG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RVBFG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AVBFG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MAXKV" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MITNR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KVBAT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RVBAT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AVBAT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SVA01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SVA02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SVA03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SVA04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SVA05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SVA06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SVA07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SVA08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PVKZ1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PVBKL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PVFBT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SONPV" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SELPV" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PVBFG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PVBAT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MAXPV" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AUVOR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AUMIT" minOccurs="0"&gt;
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
    "kvkz1",
    "rvkz1",
    "avkz1",
    "rvnum",
    "kvsfr",
    "kvgst",
    "kvbkl",
    "kvfbt",
    "zuska",
    "sonkv",
    "sonrv",
    "sonav",
    "selkv",
    "selrv",
    "kvbfg",
    "rvbfg",
    "avbfg",
    "maxkv",
    "mitnr",
    "kvbat",
    "rvbat",
    "avbat",
    "sva01",
    "sva02",
    "sva03",
    "sva04",
    "sva05",
    "sva06",
    "sva07",
    "sva08",
    "pvkz1",
    "pvbkl",
    "pvfbt",
    "sonpv",
    "selpv",
    "pvbfg",
    "pvbat",
    "maxpv",
    "auvor",
    "aumit",
    "grpvl"
})
public class E1P0013 {

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
    @XmlElement(name = "KVKZ1")
    protected String kvkz1;
    @XmlElement(name = "RVKZ1")
    protected String rvkz1;
    @XmlElement(name = "AVKZ1")
    protected String avkz1;
    @XmlElement(name = "RVNUM")
    protected String rvnum;
    @XmlElement(name = "KVSFR")
    protected String kvsfr;
    @XmlElement(name = "KVGST")
    protected String kvgst;
    @XmlElement(name = "KVBKL")
    protected String kvbkl;
    @XmlElement(name = "KVFBT")
    protected String kvfbt;
    @XmlElement(name = "ZUSKA")
    protected String zuska;
    @XmlElement(name = "SONKV")
    protected String sonkv;
    @XmlElement(name = "SONRV")
    protected String sonrv;
    @XmlElement(name = "SONAV")
    protected String sonav;
    @XmlElement(name = "SELKV")
    protected String selkv;
    @XmlElement(name = "SELRV")
    protected String selrv;
    @XmlElement(name = "KVBFG")
    protected String kvbfg;
    @XmlElement(name = "RVBFG")
    protected String rvbfg;
    @XmlElement(name = "AVBFG")
    protected String avbfg;
    @XmlElement(name = "MAXKV")
    protected String maxkv;
    @XmlElement(name = "MITNR")
    protected String mitnr;
    @XmlElement(name = "KVBAT")
    protected String kvbat;
    @XmlElement(name = "RVBAT")
    protected String rvbat;
    @XmlElement(name = "AVBAT")
    protected String avbat;
    @XmlElement(name = "SVA01")
    protected String sva01;
    @XmlElement(name = "SVA02")
    protected String sva02;
    @XmlElement(name = "SVA03")
    protected String sva03;
    @XmlElement(name = "SVA04")
    protected String sva04;
    @XmlElement(name = "SVA05")
    protected String sva05;
    @XmlElement(name = "SVA06")
    protected String sva06;
    @XmlElement(name = "SVA07")
    protected String sva07;
    @XmlElement(name = "SVA08")
    protected String sva08;
    @XmlElement(name = "PVKZ1")
    protected String pvkz1;
    @XmlElement(name = "PVBKL")
    protected String pvbkl;
    @XmlElement(name = "PVFBT")
    protected String pvfbt;
    @XmlElement(name = "SONPV")
    protected String sonpv;
    @XmlElement(name = "SELPV")
    protected String selpv;
    @XmlElement(name = "PVBFG")
    protected String pvbfg;
    @XmlElement(name = "PVBAT")
    protected String pvbat;
    @XmlElement(name = "MAXPV")
    protected String maxpv;
    @XmlElement(name = "AUVOR")
    protected String auvor;
    @XmlElement(name = "AUMIT")
    protected String aumit;
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
     * Gets the value of the kvkz1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKVKZ1() {
        return kvkz1;
    }

    /**
     * Sets the value of the kvkz1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKVKZ1(String value) {
        this.kvkz1 = value;
    }

    /**
     * Gets the value of the rvkz1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRVKZ1() {
        return rvkz1;
    }

    /**
     * Sets the value of the rvkz1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRVKZ1(String value) {
        this.rvkz1 = value;
    }

    /**
     * Gets the value of the avkz1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVKZ1() {
        return avkz1;
    }

    /**
     * Sets the value of the avkz1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVKZ1(String value) {
        this.avkz1 = value;
    }

    /**
     * Gets the value of the rvnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRVNUM() {
        return rvnum;
    }

    /**
     * Sets the value of the rvnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRVNUM(String value) {
        this.rvnum = value;
    }

    /**
     * Gets the value of the kvsfr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKVSFR() {
        return kvsfr;
    }

    /**
     * Sets the value of the kvsfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKVSFR(String value) {
        this.kvsfr = value;
    }

    /**
     * Gets the value of the kvgst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKVGST() {
        return kvgst;
    }

    /**
     * Sets the value of the kvgst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKVGST(String value) {
        this.kvgst = value;
    }

    /**
     * Gets the value of the kvbkl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKVBKL() {
        return kvbkl;
    }

    /**
     * Sets the value of the kvbkl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKVBKL(String value) {
        this.kvbkl = value;
    }

    /**
     * Gets the value of the kvfbt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKVFBT() {
        return kvfbt;
    }

    /**
     * Sets the value of the kvfbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKVFBT(String value) {
        this.kvfbt = value;
    }

    /**
     * Gets the value of the zuska property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZUSKA() {
        return zuska;
    }

    /**
     * Sets the value of the zuska property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZUSKA(String value) {
        this.zuska = value;
    }

    /**
     * Gets the value of the sonkv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSONKV() {
        return sonkv;
    }

    /**
     * Sets the value of the sonkv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSONKV(String value) {
        this.sonkv = value;
    }

    /**
     * Gets the value of the sonrv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSONRV() {
        return sonrv;
    }

    /**
     * Sets the value of the sonrv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSONRV(String value) {
        this.sonrv = value;
    }

    /**
     * Gets the value of the sonav property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSONAV() {
        return sonav;
    }

    /**
     * Sets the value of the sonav property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSONAV(String value) {
        this.sonav = value;
    }

    /**
     * Gets the value of the selkv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSELKV() {
        return selkv;
    }

    /**
     * Sets the value of the selkv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSELKV(String value) {
        this.selkv = value;
    }

    /**
     * Gets the value of the selrv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSELRV() {
        return selrv;
    }

    /**
     * Sets the value of the selrv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSELRV(String value) {
        this.selrv = value;
    }

    /**
     * Gets the value of the kvbfg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKVBFG() {
        return kvbfg;
    }

    /**
     * Sets the value of the kvbfg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKVBFG(String value) {
        this.kvbfg = value;
    }

    /**
     * Gets the value of the rvbfg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRVBFG() {
        return rvbfg;
    }

    /**
     * Sets the value of the rvbfg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRVBFG(String value) {
        this.rvbfg = value;
    }

    /**
     * Gets the value of the avbfg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVBFG() {
        return avbfg;
    }

    /**
     * Sets the value of the avbfg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVBFG(String value) {
        this.avbfg = value;
    }

    /**
     * Gets the value of the maxkv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAXKV() {
        return maxkv;
    }

    /**
     * Sets the value of the maxkv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAXKV(String value) {
        this.maxkv = value;
    }

    /**
     * Gets the value of the mitnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMITNR() {
        return mitnr;
    }

    /**
     * Sets the value of the mitnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMITNR(String value) {
        this.mitnr = value;
    }

    /**
     * Gets the value of the kvbat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKVBAT() {
        return kvbat;
    }

    /**
     * Sets the value of the kvbat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKVBAT(String value) {
        this.kvbat = value;
    }

    /**
     * Gets the value of the rvbat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRVBAT() {
        return rvbat;
    }

    /**
     * Sets the value of the rvbat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRVBAT(String value) {
        this.rvbat = value;
    }

    /**
     * Gets the value of the avbat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVBAT() {
        return avbat;
    }

    /**
     * Sets the value of the avbat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVBAT(String value) {
        this.avbat = value;
    }

    /**
     * Gets the value of the sva01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSVA01() {
        return sva01;
    }

    /**
     * Sets the value of the sva01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSVA01(String value) {
        this.sva01 = value;
    }

    /**
     * Gets the value of the sva02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSVA02() {
        return sva02;
    }

    /**
     * Sets the value of the sva02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSVA02(String value) {
        this.sva02 = value;
    }

    /**
     * Gets the value of the sva03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSVA03() {
        return sva03;
    }

    /**
     * Sets the value of the sva03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSVA03(String value) {
        this.sva03 = value;
    }

    /**
     * Gets the value of the sva04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSVA04() {
        return sva04;
    }

    /**
     * Sets the value of the sva04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSVA04(String value) {
        this.sva04 = value;
    }

    /**
     * Gets the value of the sva05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSVA05() {
        return sva05;
    }

    /**
     * Sets the value of the sva05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSVA05(String value) {
        this.sva05 = value;
    }

    /**
     * Gets the value of the sva06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSVA06() {
        return sva06;
    }

    /**
     * Sets the value of the sva06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSVA06(String value) {
        this.sva06 = value;
    }

    /**
     * Gets the value of the sva07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSVA07() {
        return sva07;
    }

    /**
     * Sets the value of the sva07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSVA07(String value) {
        this.sva07 = value;
    }

    /**
     * Gets the value of the sva08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSVA08() {
        return sva08;
    }

    /**
     * Sets the value of the sva08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSVA08(String value) {
        this.sva08 = value;
    }

    /**
     * Gets the value of the pvkz1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPVKZ1() {
        return pvkz1;
    }

    /**
     * Sets the value of the pvkz1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPVKZ1(String value) {
        this.pvkz1 = value;
    }

    /**
     * Gets the value of the pvbkl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPVBKL() {
        return pvbkl;
    }

    /**
     * Sets the value of the pvbkl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPVBKL(String value) {
        this.pvbkl = value;
    }

    /**
     * Gets the value of the pvfbt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPVFBT() {
        return pvfbt;
    }

    /**
     * Sets the value of the pvfbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPVFBT(String value) {
        this.pvfbt = value;
    }

    /**
     * Gets the value of the sonpv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSONPV() {
        return sonpv;
    }

    /**
     * Sets the value of the sonpv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSONPV(String value) {
        this.sonpv = value;
    }

    /**
     * Gets the value of the selpv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSELPV() {
        return selpv;
    }

    /**
     * Sets the value of the selpv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSELPV(String value) {
        this.selpv = value;
    }

    /**
     * Gets the value of the pvbfg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPVBFG() {
        return pvbfg;
    }

    /**
     * Sets the value of the pvbfg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPVBFG(String value) {
        this.pvbfg = value;
    }

    /**
     * Gets the value of the pvbat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPVBAT() {
        return pvbat;
    }

    /**
     * Sets the value of the pvbat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPVBAT(String value) {
        this.pvbat = value;
    }

    /**
     * Gets the value of the maxpv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAXPV() {
        return maxpv;
    }

    /**
     * Sets the value of the maxpv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAXPV(String value) {
        this.maxpv = value;
    }

    /**
     * Gets the value of the auvor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUVOR() {
        return auvor;
    }

    /**
     * Sets the value of the auvor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUVOR(String value) {
        this.auvor = value;
    }

    /**
     * Gets the value of the aumit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUMIT() {
        return aumit;
    }

    /**
     * Sets the value of the aumit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUMIT(String value) {
        this.aumit = value;
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
