
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
 *         &lt;element name="UNBER" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PFREI" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PFMER" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PFNET" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PFBAR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PFREF" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="P850C" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PHEBK" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSOND" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSTSV" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BVBEZ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZFBTR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZGRND" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZMEHR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZGRBT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZMEIN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZVERF" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VART1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VNUM1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VART2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VNUM2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VART3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VNUM3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FELD1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FELD2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FELD3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FELD4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FELD5" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FELD6" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VOB01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VOB02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VOB03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VOB04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VOB05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VOB06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VOB07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VOB08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VOB09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VOB10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
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
    "pfart",
    "pfnum",
    "unber",
    "pfrei",
    "pfmer",
    "pfnet",
    "pfbar",
    "pfref",
    "p850C",
    "phebk",
    "psond",
    "pstsv",
    "bvbez",
    "zfbtr",
    "zgrnd",
    "zmehr",
    "zgrbt",
    "zmein",
    "zverf",
    "vart1",
    "vnum1",
    "vart2",
    "vnum2",
    "vart3",
    "vnum3",
    "feld1",
    "feld2",
    "feld3",
    "feld4",
    "feld5",
    "feld6",
    "vob01",
    "vob02",
    "vob03",
    "vob04",
    "vob05",
    "vob06",
    "vob07",
    "vob08",
    "vob09",
    "vob10",
    "grpvl"
})
public class E1P0114 {

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
    @XmlElement(name = "UNBER")
    protected String unber;
    @XmlElement(name = "PFREI")
    protected String pfrei;
    @XmlElement(name = "PFMER")
    protected String pfmer;
    @XmlElement(name = "PFNET")
    protected String pfnet;
    @XmlElement(name = "PFBAR")
    protected String pfbar;
    @XmlElement(name = "PFREF")
    protected String pfref;
    @XmlElement(name = "P850C")
    protected String p850C;
    @XmlElement(name = "PHEBK")
    protected String phebk;
    @XmlElement(name = "PSOND")
    protected String psond;
    @XmlElement(name = "PSTSV")
    protected String pstsv;
    @XmlElement(name = "BVBEZ")
    protected String bvbez;
    @XmlElement(name = "ZFBTR")
    protected String zfbtr;
    @XmlElement(name = "ZGRND")
    protected String zgrnd;
    @XmlElement(name = "ZMEHR")
    protected String zmehr;
    @XmlElement(name = "ZGRBT")
    protected String zgrbt;
    @XmlElement(name = "ZMEIN")
    protected String zmein;
    @XmlElement(name = "ZVERF")
    protected String zverf;
    @XmlElement(name = "VART1")
    protected String vart1;
    @XmlElement(name = "VNUM1")
    protected String vnum1;
    @XmlElement(name = "VART2")
    protected String vart2;
    @XmlElement(name = "VNUM2")
    protected String vnum2;
    @XmlElement(name = "VART3")
    protected String vart3;
    @XmlElement(name = "VNUM3")
    protected String vnum3;
    @XmlElement(name = "FELD1")
    protected String feld1;
    @XmlElement(name = "FELD2")
    protected String feld2;
    @XmlElement(name = "FELD3")
    protected String feld3;
    @XmlElement(name = "FELD4")
    protected String feld4;
    @XmlElement(name = "FELD5")
    protected String feld5;
    @XmlElement(name = "FELD6")
    protected String feld6;
    @XmlElement(name = "VOB01")
    protected String vob01;
    @XmlElement(name = "VOB02")
    protected String vob02;
    @XmlElement(name = "VOB03")
    protected String vob03;
    @XmlElement(name = "VOB04")
    protected String vob04;
    @XmlElement(name = "VOB05")
    protected String vob05;
    @XmlElement(name = "VOB06")
    protected String vob06;
    @XmlElement(name = "VOB07")
    protected String vob07;
    @XmlElement(name = "VOB08")
    protected String vob08;
    @XmlElement(name = "VOB09")
    protected String vob09;
    @XmlElement(name = "VOB10")
    protected String vob10;
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
     * Gets the value of the unber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBER() {
        return unber;
    }

    /**
     * Sets the value of the unber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBER(String value) {
        this.unber = value;
    }

    /**
     * Gets the value of the pfrei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPFREI() {
        return pfrei;
    }

    /**
     * Sets the value of the pfrei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPFREI(String value) {
        this.pfrei = value;
    }

    /**
     * Gets the value of the pfmer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPFMER() {
        return pfmer;
    }

    /**
     * Sets the value of the pfmer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPFMER(String value) {
        this.pfmer = value;
    }

    /**
     * Gets the value of the pfnet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPFNET() {
        return pfnet;
    }

    /**
     * Sets the value of the pfnet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPFNET(String value) {
        this.pfnet = value;
    }

    /**
     * Gets the value of the pfbar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPFBAR() {
        return pfbar;
    }

    /**
     * Sets the value of the pfbar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPFBAR(String value) {
        this.pfbar = value;
    }

    /**
     * Gets the value of the pfref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPFREF() {
        return pfref;
    }

    /**
     * Sets the value of the pfref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPFREF(String value) {
        this.pfref = value;
    }

    /**
     * Gets the value of the p850C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getP850C() {
        return p850C;
    }

    /**
     * Sets the value of the p850C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setP850C(String value) {
        this.p850C = value;
    }

    /**
     * Gets the value of the phebk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPHEBK() {
        return phebk;
    }

    /**
     * Sets the value of the phebk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPHEBK(String value) {
        this.phebk = value;
    }

    /**
     * Gets the value of the psond property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSOND() {
        return psond;
    }

    /**
     * Sets the value of the psond property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSOND(String value) {
        this.psond = value;
    }

    /**
     * Gets the value of the pstsv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSTSV() {
        return pstsv;
    }

    /**
     * Sets the value of the pstsv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSTSV(String value) {
        this.pstsv = value;
    }

    /**
     * Gets the value of the bvbez property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBVBEZ() {
        return bvbez;
    }

    /**
     * Sets the value of the bvbez property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBVBEZ(String value) {
        this.bvbez = value;
    }

    /**
     * Gets the value of the zfbtr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZFBTR() {
        return zfbtr;
    }

    /**
     * Sets the value of the zfbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZFBTR(String value) {
        this.zfbtr = value;
    }

    /**
     * Gets the value of the zgrnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZGRND() {
        return zgrnd;
    }

    /**
     * Sets the value of the zgrnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZGRND(String value) {
        this.zgrnd = value;
    }

    /**
     * Gets the value of the zmehr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZMEHR() {
        return zmehr;
    }

    /**
     * Sets the value of the zmehr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZMEHR(String value) {
        this.zmehr = value;
    }

    /**
     * Gets the value of the zgrbt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZGRBT() {
        return zgrbt;
    }

    /**
     * Sets the value of the zgrbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZGRBT(String value) {
        this.zgrbt = value;
    }

    /**
     * Gets the value of the zmein property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZMEIN() {
        return zmein;
    }

    /**
     * Sets the value of the zmein property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZMEIN(String value) {
        this.zmein = value;
    }

    /**
     * Gets the value of the zverf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZVERF() {
        return zverf;
    }

    /**
     * Sets the value of the zverf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZVERF(String value) {
        this.zverf = value;
    }

    /**
     * Gets the value of the vart1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVART1() {
        return vart1;
    }

    /**
     * Sets the value of the vart1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVART1(String value) {
        this.vart1 = value;
    }

    /**
     * Gets the value of the vnum1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVNUM1() {
        return vnum1;
    }

    /**
     * Sets the value of the vnum1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVNUM1(String value) {
        this.vnum1 = value;
    }

    /**
     * Gets the value of the vart2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVART2() {
        return vart2;
    }

    /**
     * Sets the value of the vart2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVART2(String value) {
        this.vart2 = value;
    }

    /**
     * Gets the value of the vnum2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVNUM2() {
        return vnum2;
    }

    /**
     * Sets the value of the vnum2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVNUM2(String value) {
        this.vnum2 = value;
    }

    /**
     * Gets the value of the vart3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVART3() {
        return vart3;
    }

    /**
     * Sets the value of the vart3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVART3(String value) {
        this.vart3 = value;
    }

    /**
     * Gets the value of the vnum3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVNUM3() {
        return vnum3;
    }

    /**
     * Sets the value of the vnum3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVNUM3(String value) {
        this.vnum3 = value;
    }

    /**
     * Gets the value of the feld1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFELD1() {
        return feld1;
    }

    /**
     * Sets the value of the feld1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFELD1(String value) {
        this.feld1 = value;
    }

    /**
     * Gets the value of the feld2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFELD2() {
        return feld2;
    }

    /**
     * Sets the value of the feld2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFELD2(String value) {
        this.feld2 = value;
    }

    /**
     * Gets the value of the feld3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFELD3() {
        return feld3;
    }

    /**
     * Sets the value of the feld3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFELD3(String value) {
        this.feld3 = value;
    }

    /**
     * Gets the value of the feld4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFELD4() {
        return feld4;
    }

    /**
     * Sets the value of the feld4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFELD4(String value) {
        this.feld4 = value;
    }

    /**
     * Gets the value of the feld5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFELD5() {
        return feld5;
    }

    /**
     * Sets the value of the feld5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFELD5(String value) {
        this.feld5 = value;
    }

    /**
     * Gets the value of the feld6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFELD6() {
        return feld6;
    }

    /**
     * Sets the value of the feld6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFELD6(String value) {
        this.feld6 = value;
    }

    /**
     * Gets the value of the vob01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOB01() {
        return vob01;
    }

    /**
     * Sets the value of the vob01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOB01(String value) {
        this.vob01 = value;
    }

    /**
     * Gets the value of the vob02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOB02() {
        return vob02;
    }

    /**
     * Sets the value of the vob02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOB02(String value) {
        this.vob02 = value;
    }

    /**
     * Gets the value of the vob03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOB03() {
        return vob03;
    }

    /**
     * Sets the value of the vob03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOB03(String value) {
        this.vob03 = value;
    }

    /**
     * Gets the value of the vob04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOB04() {
        return vob04;
    }

    /**
     * Sets the value of the vob04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOB04(String value) {
        this.vob04 = value;
    }

    /**
     * Gets the value of the vob05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOB05() {
        return vob05;
    }

    /**
     * Sets the value of the vob05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOB05(String value) {
        this.vob05 = value;
    }

    /**
     * Gets the value of the vob06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOB06() {
        return vob06;
    }

    /**
     * Sets the value of the vob06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOB06(String value) {
        this.vob06 = value;
    }

    /**
     * Gets the value of the vob07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOB07() {
        return vob07;
    }

    /**
     * Sets the value of the vob07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOB07(String value) {
        this.vob07 = value;
    }

    /**
     * Gets the value of the vob08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOB08() {
        return vob08;
    }

    /**
     * Sets the value of the vob08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOB08(String value) {
        this.vob08 = value;
    }

    /**
     * Gets the value of the vob09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOB09() {
        return vob09;
    }

    /**
     * Sets the value of the vob09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOB09(String value) {
        this.vob09 = value;
    }

    /**
     * Gets the value of the vob10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOB10() {
        return vob10;
    }

    /**
     * Sets the value of the vob10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOB10(String value) {
        this.vob10 = value;
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
