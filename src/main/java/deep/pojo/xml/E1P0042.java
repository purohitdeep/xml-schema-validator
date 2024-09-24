
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
 *         &lt;element name="STAFZ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="STAKA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="STAKN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="STANR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ORDNZ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="STAKZ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="STAAG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AUSAN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="STAGR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="STAKD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="STAFS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="STAFR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="STAF1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WERBP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ALLKZ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KFZPS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LABKZ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PENKZ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FLAGB" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LSSTP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JHAUS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KIRCH" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FBP68" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRMJH" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AU691" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="STP35" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FBP35" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
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
 *         &lt;element name="KDAR1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNU1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNO1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAR2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNU2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNO2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAR3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNU3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNO3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAR4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNU4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNO4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAR5" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNU5" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNO5" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAR6" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNU6" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNO6" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAR7" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNU7" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNO7" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAR8" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNU8" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNO8" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAR9" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNU9" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNO9" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDARA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNUA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNOA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDARB" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNUB" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNOB" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDARC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNUC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNOC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDARD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNUD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNOD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDARE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNUE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNOE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDARF" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNUF" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNOF" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDARG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNUG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNOG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDARH" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNUH" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNOH" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDARI" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNUI" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNOI" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDARJ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNUJ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNOJ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDARK" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNUK" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNOK" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDARL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNUL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNOL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDARM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNUM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNOM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDARN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNUN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNON" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDARO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNUO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNOO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDARP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNUP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNOP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDARQ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNUQ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNOQ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDARR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNUR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNOR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDARS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNUS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNOS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDART" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNUT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNOT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDARU" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNUU" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDNOU" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ARTLZ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DBABM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ALAND" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KWBKB" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFV1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFL1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAA1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAK1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFV2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFL2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAA2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAK2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFV3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFL3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAA3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAK3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFV4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFL4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAA4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAK4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFV5" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFL5" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAA5" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAK5" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFV6" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFL6" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAA6" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAK6" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFV7" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFL7" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAA7" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAK7" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFV8" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFL8" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAA8" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAK8" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFV9" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFL9" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAA9" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAK9" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFVA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFLA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAAA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAKA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFVB" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFLB" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAAB" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAKB" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFVC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFLC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAAC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAKC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFVD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFLD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAAD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAKD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFVE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFLE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAAE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAKE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFVF" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFLF" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAAF" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAKF" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFVG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFLG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAAG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAKG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFVH" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFLH" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAAH" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAKH" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFVI" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFLI" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAAI" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAKI" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFVJ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFLJ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAAJ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAKJ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFVK" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFLK" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAAK" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAKK" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFVL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFLL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAAL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAKL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFVM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFLM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAAM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAKM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFVN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFLN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAAN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAKN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFVO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFLO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAAO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAKO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFVP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFLP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAAP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAKP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFVQ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFLQ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAAQ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAKQ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFVR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFLR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAAR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAKR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFVS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFLS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAAS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAKS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFVT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFLT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAAT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAKT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFVU" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDFLU" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAAU" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDAKU" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="E1031" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FABOPH" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="STP35P" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FBP35P" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
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
    "stafz",
    "staka",
    "stakn",
    "stanr",
    "ordnz",
    "stakz",
    "staag",
    "ausan",
    "stagr",
    "stakd",
    "stafs",
    "stafr",
    "staf1",
    "werbp",
    "allkz",
    "kfzps",
    "labkz",
    "penkz",
    "flagb",
    "lsstp",
    "jhaus",
    "kirch",
    "fbp68",
    "prmjh",
    "au691",
    "stp35",
    "fbp35",
    "grpvl",
    "kdar1",
    "kdnu1",
    "kdno1",
    "kdar2",
    "kdnu2",
    "kdno2",
    "kdar3",
    "kdnu3",
    "kdno3",
    "kdar4",
    "kdnu4",
    "kdno4",
    "kdar5",
    "kdnu5",
    "kdno5",
    "kdar6",
    "kdnu6",
    "kdno6",
    "kdar7",
    "kdnu7",
    "kdno7",
    "kdar8",
    "kdnu8",
    "kdno8",
    "kdar9",
    "kdnu9",
    "kdno9",
    "kdara",
    "kdnua",
    "kdnoa",
    "kdarb",
    "kdnub",
    "kdnob",
    "kdarc",
    "kdnuc",
    "kdnoc",
    "kdard",
    "kdnud",
    "kdnod",
    "kdare",
    "kdnue",
    "kdnoe",
    "kdarf",
    "kdnuf",
    "kdnof",
    "kdarg",
    "kdnug",
    "kdnog",
    "kdarh",
    "kdnuh",
    "kdnoh",
    "kdari",
    "kdnui",
    "kdnoi",
    "kdarj",
    "kdnuj",
    "kdnoj",
    "kdark",
    "kdnuk",
    "kdnok",
    "kdarl",
    "kdnul",
    "kdnol",
    "kdarm",
    "kdnum",
    "kdnom",
    "kdarn",
    "kdnun",
    "kdnon",
    "kdaro",
    "kdnuo",
    "kdnoo",
    "kdarp",
    "kdnup",
    "kdnop",
    "kdarq",
    "kdnuq",
    "kdnoq",
    "kdarr",
    "kdnur",
    "kdnor",
    "kdars",
    "kdnus",
    "kdnos",
    "kdart",
    "kdnut",
    "kdnot",
    "kdaru",
    "kdnuu",
    "kdnou",
    "artlz",
    "dbabm",
    "aland",
    "kwbkb",
    "kdfv1",
    "kdfl1",
    "kdaa1",
    "kdak1",
    "kdfv2",
    "kdfl2",
    "kdaa2",
    "kdak2",
    "kdfv3",
    "kdfl3",
    "kdaa3",
    "kdak3",
    "kdfv4",
    "kdfl4",
    "kdaa4",
    "kdak4",
    "kdfv5",
    "kdfl5",
    "kdaa5",
    "kdak5",
    "kdfv6",
    "kdfl6",
    "kdaa6",
    "kdak6",
    "kdfv7",
    "kdfl7",
    "kdaa7",
    "kdak7",
    "kdfv8",
    "kdfl8",
    "kdaa8",
    "kdak8",
    "kdfv9",
    "kdfl9",
    "kdaa9",
    "kdak9",
    "kdfva",
    "kdfla",
    "kdaaa",
    "kdaka",
    "kdfvb",
    "kdflb",
    "kdaab",
    "kdakb",
    "kdfvc",
    "kdflc",
    "kdaac",
    "kdakc",
    "kdfvd",
    "kdfld",
    "kdaad",
    "kdakd",
    "kdfve",
    "kdfle",
    "kdaae",
    "kdake",
    "kdfvf",
    "kdflf",
    "kdaaf",
    "kdakf",
    "kdfvg",
    "kdflg",
    "kdaag",
    "kdakg",
    "kdfvh",
    "kdflh",
    "kdaah",
    "kdakh",
    "kdfvi",
    "kdfli",
    "kdaai",
    "kdaki",
    "kdfvj",
    "kdflj",
    "kdaaj",
    "kdakj",
    "kdfvk",
    "kdflk",
    "kdaak",
    "kdakk",
    "kdfvl",
    "kdfll",
    "kdaal",
    "kdakl",
    "kdfvm",
    "kdflm",
    "kdaam",
    "kdakm",
    "kdfvn",
    "kdfln",
    "kdaan",
    "kdakn",
    "kdfvo",
    "kdflo",
    "kdaao",
    "kdako",
    "kdfvp",
    "kdflp",
    "kdaap",
    "kdakp",
    "kdfvq",
    "kdflq",
    "kdaaq",
    "kdakq",
    "kdfvr",
    "kdflr",
    "kdaar",
    "kdakr",
    "kdfvs",
    "kdfls",
    "kdaas",
    "kdaks",
    "kdfvt",
    "kdflt",
    "kdaat",
    "kdakt",
    "kdfvu",
    "kdflu",
    "kdaau",
    "kdaku",
    "e1031",
    "faboph",
    "stp35P",
    "fbp35P"
})
public class E1P0042 {

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
    @XmlElement(name = "STAFZ")
    protected String stafz;
    @XmlElement(name = "STAKA")
    protected String staka;
    @XmlElement(name = "STAKN")
    protected String stakn;
    @XmlElement(name = "STANR")
    protected String stanr;
    @XmlElement(name = "ORDNZ")
    protected String ordnz;
    @XmlElement(name = "STAKZ")
    protected String stakz;
    @XmlElement(name = "STAAG")
    protected String staag;
    @XmlElement(name = "AUSAN")
    protected String ausan;
    @XmlElement(name = "STAGR")
    protected String stagr;
    @XmlElement(name = "STAKD")
    protected String stakd;
    @XmlElement(name = "STAFS")
    protected String stafs;
    @XmlElement(name = "STAFR")
    protected String stafr;
    @XmlElement(name = "STAF1")
    protected String staf1;
    @XmlElement(name = "WERBP")
    protected String werbp;
    @XmlElement(name = "ALLKZ")
    protected String allkz;
    @XmlElement(name = "KFZPS")
    protected String kfzps;
    @XmlElement(name = "LABKZ")
    protected String labkz;
    @XmlElement(name = "PENKZ")
    protected String penkz;
    @XmlElement(name = "FLAGB")
    protected String flagb;
    @XmlElement(name = "LSSTP")
    protected String lsstp;
    @XmlElement(name = "JHAUS")
    protected String jhaus;
    @XmlElement(name = "KIRCH")
    protected String kirch;
    @XmlElement(name = "FBP68")
    protected String fbp68;
    @XmlElement(name = "PRMJH")
    protected String prmjh;
    @XmlElement(name = "AU691")
    protected String au691;
    @XmlElement(name = "STP35")
    protected String stp35;
    @XmlElement(name = "FBP35")
    protected String fbp35;
    @XmlElement(name = "GRPVL")
    protected String grpvl;
    @XmlElement(name = "KDAR1")
    protected String kdar1;
    @XmlElement(name = "KDNU1")
    protected String kdnu1;
    @XmlElement(name = "KDNO1")
    protected String kdno1;
    @XmlElement(name = "KDAR2")
    protected String kdar2;
    @XmlElement(name = "KDNU2")
    protected String kdnu2;
    @XmlElement(name = "KDNO2")
    protected String kdno2;
    @XmlElement(name = "KDAR3")
    protected String kdar3;
    @XmlElement(name = "KDNU3")
    protected String kdnu3;
    @XmlElement(name = "KDNO3")
    protected String kdno3;
    @XmlElement(name = "KDAR4")
    protected String kdar4;
    @XmlElement(name = "KDNU4")
    protected String kdnu4;
    @XmlElement(name = "KDNO4")
    protected String kdno4;
    @XmlElement(name = "KDAR5")
    protected String kdar5;
    @XmlElement(name = "KDNU5")
    protected String kdnu5;
    @XmlElement(name = "KDNO5")
    protected String kdno5;
    @XmlElement(name = "KDAR6")
    protected String kdar6;
    @XmlElement(name = "KDNU6")
    protected String kdnu6;
    @XmlElement(name = "KDNO6")
    protected String kdno6;
    @XmlElement(name = "KDAR7")
    protected String kdar7;
    @XmlElement(name = "KDNU7")
    protected String kdnu7;
    @XmlElement(name = "KDNO7")
    protected String kdno7;
    @XmlElement(name = "KDAR8")
    protected String kdar8;
    @XmlElement(name = "KDNU8")
    protected String kdnu8;
    @XmlElement(name = "KDNO8")
    protected String kdno8;
    @XmlElement(name = "KDAR9")
    protected String kdar9;
    @XmlElement(name = "KDNU9")
    protected String kdnu9;
    @XmlElement(name = "KDNO9")
    protected String kdno9;
    @XmlElement(name = "KDARA")
    protected String kdara;
    @XmlElement(name = "KDNUA")
    protected String kdnua;
    @XmlElement(name = "KDNOA")
    protected String kdnoa;
    @XmlElement(name = "KDARB")
    protected String kdarb;
    @XmlElement(name = "KDNUB")
    protected String kdnub;
    @XmlElement(name = "KDNOB")
    protected String kdnob;
    @XmlElement(name = "KDARC")
    protected String kdarc;
    @XmlElement(name = "KDNUC")
    protected String kdnuc;
    @XmlElement(name = "KDNOC")
    protected String kdnoc;
    @XmlElement(name = "KDARD")
    protected String kdard;
    @XmlElement(name = "KDNUD")
    protected String kdnud;
    @XmlElement(name = "KDNOD")
    protected String kdnod;
    @XmlElement(name = "KDARE")
    protected String kdare;
    @XmlElement(name = "KDNUE")
    protected String kdnue;
    @XmlElement(name = "KDNOE")
    protected String kdnoe;
    @XmlElement(name = "KDARF")
    protected String kdarf;
    @XmlElement(name = "KDNUF")
    protected String kdnuf;
    @XmlElement(name = "KDNOF")
    protected String kdnof;
    @XmlElement(name = "KDARG")
    protected String kdarg;
    @XmlElement(name = "KDNUG")
    protected String kdnug;
    @XmlElement(name = "KDNOG")
    protected String kdnog;
    @XmlElement(name = "KDARH")
    protected String kdarh;
    @XmlElement(name = "KDNUH")
    protected String kdnuh;
    @XmlElement(name = "KDNOH")
    protected String kdnoh;
    @XmlElement(name = "KDARI")
    protected String kdari;
    @XmlElement(name = "KDNUI")
    protected String kdnui;
    @XmlElement(name = "KDNOI")
    protected String kdnoi;
    @XmlElement(name = "KDARJ")
    protected String kdarj;
    @XmlElement(name = "KDNUJ")
    protected String kdnuj;
    @XmlElement(name = "KDNOJ")
    protected String kdnoj;
    @XmlElement(name = "KDARK")
    protected String kdark;
    @XmlElement(name = "KDNUK")
    protected String kdnuk;
    @XmlElement(name = "KDNOK")
    protected String kdnok;
    @XmlElement(name = "KDARL")
    protected String kdarl;
    @XmlElement(name = "KDNUL")
    protected String kdnul;
    @XmlElement(name = "KDNOL")
    protected String kdnol;
    @XmlElement(name = "KDARM")
    protected String kdarm;
    @XmlElement(name = "KDNUM")
    protected String kdnum;
    @XmlElement(name = "KDNOM")
    protected String kdnom;
    @XmlElement(name = "KDARN")
    protected String kdarn;
    @XmlElement(name = "KDNUN")
    protected String kdnun;
    @XmlElement(name = "KDNON")
    protected String kdnon;
    @XmlElement(name = "KDARO")
    protected String kdaro;
    @XmlElement(name = "KDNUO")
    protected String kdnuo;
    @XmlElement(name = "KDNOO")
    protected String kdnoo;
    @XmlElement(name = "KDARP")
    protected String kdarp;
    @XmlElement(name = "KDNUP")
    protected String kdnup;
    @XmlElement(name = "KDNOP")
    protected String kdnop;
    @XmlElement(name = "KDARQ")
    protected String kdarq;
    @XmlElement(name = "KDNUQ")
    protected String kdnuq;
    @XmlElement(name = "KDNOQ")
    protected String kdnoq;
    @XmlElement(name = "KDARR")
    protected String kdarr;
    @XmlElement(name = "KDNUR")
    protected String kdnur;
    @XmlElement(name = "KDNOR")
    protected String kdnor;
    @XmlElement(name = "KDARS")
    protected String kdars;
    @XmlElement(name = "KDNUS")
    protected String kdnus;
    @XmlElement(name = "KDNOS")
    protected String kdnos;
    @XmlElement(name = "KDART")
    protected String kdart;
    @XmlElement(name = "KDNUT")
    protected String kdnut;
    @XmlElement(name = "KDNOT")
    protected String kdnot;
    @XmlElement(name = "KDARU")
    protected String kdaru;
    @XmlElement(name = "KDNUU")
    protected String kdnuu;
    @XmlElement(name = "KDNOU")
    protected String kdnou;
    @XmlElement(name = "ARTLZ")
    protected String artlz;
    @XmlElement(name = "DBABM")
    protected String dbabm;
    @XmlElement(name = "ALAND")
    protected String aland;
    @XmlElement(name = "KWBKB")
    protected String kwbkb;
    @XmlElement(name = "KDFV1")
    protected String kdfv1;
    @XmlElement(name = "KDFL1")
    protected String kdfl1;
    @XmlElement(name = "KDAA1")
    protected String kdaa1;
    @XmlElement(name = "KDAK1")
    protected String kdak1;
    @XmlElement(name = "KDFV2")
    protected String kdfv2;
    @XmlElement(name = "KDFL2")
    protected String kdfl2;
    @XmlElement(name = "KDAA2")
    protected String kdaa2;
    @XmlElement(name = "KDAK2")
    protected String kdak2;
    @XmlElement(name = "KDFV3")
    protected String kdfv3;
    @XmlElement(name = "KDFL3")
    protected String kdfl3;
    @XmlElement(name = "KDAA3")
    protected String kdaa3;
    @XmlElement(name = "KDAK3")
    protected String kdak3;
    @XmlElement(name = "KDFV4")
    protected String kdfv4;
    @XmlElement(name = "KDFL4")
    protected String kdfl4;
    @XmlElement(name = "KDAA4")
    protected String kdaa4;
    @XmlElement(name = "KDAK4")
    protected String kdak4;
    @XmlElement(name = "KDFV5")
    protected String kdfv5;
    @XmlElement(name = "KDFL5")
    protected String kdfl5;
    @XmlElement(name = "KDAA5")
    protected String kdaa5;
    @XmlElement(name = "KDAK5")
    protected String kdak5;
    @XmlElement(name = "KDFV6")
    protected String kdfv6;
    @XmlElement(name = "KDFL6")
    protected String kdfl6;
    @XmlElement(name = "KDAA6")
    protected String kdaa6;
    @XmlElement(name = "KDAK6")
    protected String kdak6;
    @XmlElement(name = "KDFV7")
    protected String kdfv7;
    @XmlElement(name = "KDFL7")
    protected String kdfl7;
    @XmlElement(name = "KDAA7")
    protected String kdaa7;
    @XmlElement(name = "KDAK7")
    protected String kdak7;
    @XmlElement(name = "KDFV8")
    protected String kdfv8;
    @XmlElement(name = "KDFL8")
    protected String kdfl8;
    @XmlElement(name = "KDAA8")
    protected String kdaa8;
    @XmlElement(name = "KDAK8")
    protected String kdak8;
    @XmlElement(name = "KDFV9")
    protected String kdfv9;
    @XmlElement(name = "KDFL9")
    protected String kdfl9;
    @XmlElement(name = "KDAA9")
    protected String kdaa9;
    @XmlElement(name = "KDAK9")
    protected String kdak9;
    @XmlElement(name = "KDFVA")
    protected String kdfva;
    @XmlElement(name = "KDFLA")
    protected String kdfla;
    @XmlElement(name = "KDAAA")
    protected String kdaaa;
    @XmlElement(name = "KDAKA")
    protected String kdaka;
    @XmlElement(name = "KDFVB")
    protected String kdfvb;
    @XmlElement(name = "KDFLB")
    protected String kdflb;
    @XmlElement(name = "KDAAB")
    protected String kdaab;
    @XmlElement(name = "KDAKB")
    protected String kdakb;
    @XmlElement(name = "KDFVC")
    protected String kdfvc;
    @XmlElement(name = "KDFLC")
    protected String kdflc;
    @XmlElement(name = "KDAAC")
    protected String kdaac;
    @XmlElement(name = "KDAKC")
    protected String kdakc;
    @XmlElement(name = "KDFVD")
    protected String kdfvd;
    @XmlElement(name = "KDFLD")
    protected String kdfld;
    @XmlElement(name = "KDAAD")
    protected String kdaad;
    @XmlElement(name = "KDAKD")
    protected String kdakd;
    @XmlElement(name = "KDFVE")
    protected String kdfve;
    @XmlElement(name = "KDFLE")
    protected String kdfle;
    @XmlElement(name = "KDAAE")
    protected String kdaae;
    @XmlElement(name = "KDAKE")
    protected String kdake;
    @XmlElement(name = "KDFVF")
    protected String kdfvf;
    @XmlElement(name = "KDFLF")
    protected String kdflf;
    @XmlElement(name = "KDAAF")
    protected String kdaaf;
    @XmlElement(name = "KDAKF")
    protected String kdakf;
    @XmlElement(name = "KDFVG")
    protected String kdfvg;
    @XmlElement(name = "KDFLG")
    protected String kdflg;
    @XmlElement(name = "KDAAG")
    protected String kdaag;
    @XmlElement(name = "KDAKG")
    protected String kdakg;
    @XmlElement(name = "KDFVH")
    protected String kdfvh;
    @XmlElement(name = "KDFLH")
    protected String kdflh;
    @XmlElement(name = "KDAAH")
    protected String kdaah;
    @XmlElement(name = "KDAKH")
    protected String kdakh;
    @XmlElement(name = "KDFVI")
    protected String kdfvi;
    @XmlElement(name = "KDFLI")
    protected String kdfli;
    @XmlElement(name = "KDAAI")
    protected String kdaai;
    @XmlElement(name = "KDAKI")
    protected String kdaki;
    @XmlElement(name = "KDFVJ")
    protected String kdfvj;
    @XmlElement(name = "KDFLJ")
    protected String kdflj;
    @XmlElement(name = "KDAAJ")
    protected String kdaaj;
    @XmlElement(name = "KDAKJ")
    protected String kdakj;
    @XmlElement(name = "KDFVK")
    protected String kdfvk;
    @XmlElement(name = "KDFLK")
    protected String kdflk;
    @XmlElement(name = "KDAAK")
    protected String kdaak;
    @XmlElement(name = "KDAKK")
    protected String kdakk;
    @XmlElement(name = "KDFVL")
    protected String kdfvl;
    @XmlElement(name = "KDFLL")
    protected String kdfll;
    @XmlElement(name = "KDAAL")
    protected String kdaal;
    @XmlElement(name = "KDAKL")
    protected String kdakl;
    @XmlElement(name = "KDFVM")
    protected String kdfvm;
    @XmlElement(name = "KDFLM")
    protected String kdflm;
    @XmlElement(name = "KDAAM")
    protected String kdaam;
    @XmlElement(name = "KDAKM")
    protected String kdakm;
    @XmlElement(name = "KDFVN")
    protected String kdfvn;
    @XmlElement(name = "KDFLN")
    protected String kdfln;
    @XmlElement(name = "KDAAN")
    protected String kdaan;
    @XmlElement(name = "KDAKN")
    protected String kdakn;
    @XmlElement(name = "KDFVO")
    protected String kdfvo;
    @XmlElement(name = "KDFLO")
    protected String kdflo;
    @XmlElement(name = "KDAAO")
    protected String kdaao;
    @XmlElement(name = "KDAKO")
    protected String kdako;
    @XmlElement(name = "KDFVP")
    protected String kdfvp;
    @XmlElement(name = "KDFLP")
    protected String kdflp;
    @XmlElement(name = "KDAAP")
    protected String kdaap;
    @XmlElement(name = "KDAKP")
    protected String kdakp;
    @XmlElement(name = "KDFVQ")
    protected String kdfvq;
    @XmlElement(name = "KDFLQ")
    protected String kdflq;
    @XmlElement(name = "KDAAQ")
    protected String kdaaq;
    @XmlElement(name = "KDAKQ")
    protected String kdakq;
    @XmlElement(name = "KDFVR")
    protected String kdfvr;
    @XmlElement(name = "KDFLR")
    protected String kdflr;
    @XmlElement(name = "KDAAR")
    protected String kdaar;
    @XmlElement(name = "KDAKR")
    protected String kdakr;
    @XmlElement(name = "KDFVS")
    protected String kdfvs;
    @XmlElement(name = "KDFLS")
    protected String kdfls;
    @XmlElement(name = "KDAAS")
    protected String kdaas;
    @XmlElement(name = "KDAKS")
    protected String kdaks;
    @XmlElement(name = "KDFVT")
    protected String kdfvt;
    @XmlElement(name = "KDFLT")
    protected String kdflt;
    @XmlElement(name = "KDAAT")
    protected String kdaat;
    @XmlElement(name = "KDAKT")
    protected String kdakt;
    @XmlElement(name = "KDFVU")
    protected String kdfvu;
    @XmlElement(name = "KDFLU")
    protected String kdflu;
    @XmlElement(name = "KDAAU")
    protected String kdaau;
    @XmlElement(name = "KDAKU")
    protected String kdaku;
    @XmlElement(name = "E1031")
    protected String e1031;
    @XmlElement(name = "FABOPH")
    protected String faboph;
    @XmlElement(name = "STP35P")
    protected String stp35P;
    @XmlElement(name = "FBP35P")
    protected String fbp35P;
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
     * Gets the value of the stafz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTAFZ() {
        return stafz;
    }

    /**
     * Sets the value of the stafz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTAFZ(String value) {
        this.stafz = value;
    }

    /**
     * Gets the value of the staka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTAKA() {
        return staka;
    }

    /**
     * Sets the value of the staka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTAKA(String value) {
        this.staka = value;
    }

    /**
     * Gets the value of the stakn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTAKN() {
        return stakn;
    }

    /**
     * Sets the value of the stakn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTAKN(String value) {
        this.stakn = value;
    }

    /**
     * Gets the value of the stanr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTANR() {
        return stanr;
    }

    /**
     * Sets the value of the stanr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTANR(String value) {
        this.stanr = value;
    }

    /**
     * Gets the value of the ordnz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDNZ() {
        return ordnz;
    }

    /**
     * Sets the value of the ordnz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDNZ(String value) {
        this.ordnz = value;
    }

    /**
     * Gets the value of the stakz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTAKZ() {
        return stakz;
    }

    /**
     * Sets the value of the stakz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTAKZ(String value) {
        this.stakz = value;
    }

    /**
     * Gets the value of the staag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTAAG() {
        return staag;
    }

    /**
     * Sets the value of the staag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTAAG(String value) {
        this.staag = value;
    }

    /**
     * Gets the value of the ausan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUSAN() {
        return ausan;
    }

    /**
     * Sets the value of the ausan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUSAN(String value) {
        this.ausan = value;
    }

    /**
     * Gets the value of the stagr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTAGR() {
        return stagr;
    }

    /**
     * Sets the value of the stagr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTAGR(String value) {
        this.stagr = value;
    }

    /**
     * Gets the value of the stakd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTAKD() {
        return stakd;
    }

    /**
     * Sets the value of the stakd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTAKD(String value) {
        this.stakd = value;
    }

    /**
     * Gets the value of the stafs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTAFS() {
        return stafs;
    }

    /**
     * Sets the value of the stafs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTAFS(String value) {
        this.stafs = value;
    }

    /**
     * Gets the value of the stafr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTAFR() {
        return stafr;
    }

    /**
     * Sets the value of the stafr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTAFR(String value) {
        this.stafr = value;
    }

    /**
     * Gets the value of the staf1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTAF1() {
        return staf1;
    }

    /**
     * Sets the value of the staf1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTAF1(String value) {
        this.staf1 = value;
    }

    /**
     * Gets the value of the werbp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWERBP() {
        return werbp;
    }

    /**
     * Sets the value of the werbp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWERBP(String value) {
        this.werbp = value;
    }

    /**
     * Gets the value of the allkz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALLKZ() {
        return allkz;
    }

    /**
     * Sets the value of the allkz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALLKZ(String value) {
        this.allkz = value;
    }

    /**
     * Gets the value of the kfzps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKFZPS() {
        return kfzps;
    }

    /**
     * Sets the value of the kfzps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKFZPS(String value) {
        this.kfzps = value;
    }

    /**
     * Gets the value of the labkz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLABKZ() {
        return labkz;
    }

    /**
     * Sets the value of the labkz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLABKZ(String value) {
        this.labkz = value;
    }

    /**
     * Gets the value of the penkz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPENKZ() {
        return penkz;
    }

    /**
     * Sets the value of the penkz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPENKZ(String value) {
        this.penkz = value;
    }

    /**
     * Gets the value of the flagb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGB() {
        return flagb;
    }

    /**
     * Sets the value of the flagb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGB(String value) {
        this.flagb = value;
    }

    /**
     * Gets the value of the lsstp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLSSTP() {
        return lsstp;
    }

    /**
     * Sets the value of the lsstp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLSSTP(String value) {
        this.lsstp = value;
    }

    /**
     * Gets the value of the jhaus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJHAUS() {
        return jhaus;
    }

    /**
     * Sets the value of the jhaus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJHAUS(String value) {
        this.jhaus = value;
    }

    /**
     * Gets the value of the kirch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKIRCH() {
        return kirch;
    }

    /**
     * Sets the value of the kirch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKIRCH(String value) {
        this.kirch = value;
    }

    /**
     * Gets the value of the fbp68 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFBP68() {
        return fbp68;
    }

    /**
     * Sets the value of the fbp68 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFBP68(String value) {
        this.fbp68 = value;
    }

    /**
     * Gets the value of the prmjh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRMJH() {
        return prmjh;
    }

    /**
     * Sets the value of the prmjh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRMJH(String value) {
        this.prmjh = value;
    }

    /**
     * Gets the value of the au691 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAU691() {
        return au691;
    }

    /**
     * Sets the value of the au691 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAU691(String value) {
        this.au691 = value;
    }

    /**
     * Gets the value of the stp35 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTP35() {
        return stp35;
    }

    /**
     * Sets the value of the stp35 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTP35(String value) {
        this.stp35 = value;
    }

    /**
     * Gets the value of the fbp35 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFBP35() {
        return fbp35;
    }

    /**
     * Sets the value of the fbp35 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFBP35(String value) {
        this.fbp35 = value;
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
     * Gets the value of the kdar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAR1() {
        return kdar1;
    }

    /**
     * Sets the value of the kdar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAR1(String value) {
        this.kdar1 = value;
    }

    /**
     * Gets the value of the kdnu1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNU1() {
        return kdnu1;
    }

    /**
     * Sets the value of the kdnu1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNU1(String value) {
        this.kdnu1 = value;
    }

    /**
     * Gets the value of the kdno1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNO1() {
        return kdno1;
    }

    /**
     * Sets the value of the kdno1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNO1(String value) {
        this.kdno1 = value;
    }

    /**
     * Gets the value of the kdar2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAR2() {
        return kdar2;
    }

    /**
     * Sets the value of the kdar2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAR2(String value) {
        this.kdar2 = value;
    }

    /**
     * Gets the value of the kdnu2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNU2() {
        return kdnu2;
    }

    /**
     * Sets the value of the kdnu2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNU2(String value) {
        this.kdnu2 = value;
    }

    /**
     * Gets the value of the kdno2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNO2() {
        return kdno2;
    }

    /**
     * Sets the value of the kdno2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNO2(String value) {
        this.kdno2 = value;
    }

    /**
     * Gets the value of the kdar3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAR3() {
        return kdar3;
    }

    /**
     * Sets the value of the kdar3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAR3(String value) {
        this.kdar3 = value;
    }

    /**
     * Gets the value of the kdnu3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNU3() {
        return kdnu3;
    }

    /**
     * Sets the value of the kdnu3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNU3(String value) {
        this.kdnu3 = value;
    }

    /**
     * Gets the value of the kdno3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNO3() {
        return kdno3;
    }

    /**
     * Sets the value of the kdno3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNO3(String value) {
        this.kdno3 = value;
    }

    /**
     * Gets the value of the kdar4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAR4() {
        return kdar4;
    }

    /**
     * Sets the value of the kdar4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAR4(String value) {
        this.kdar4 = value;
    }

    /**
     * Gets the value of the kdnu4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNU4() {
        return kdnu4;
    }

    /**
     * Sets the value of the kdnu4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNU4(String value) {
        this.kdnu4 = value;
    }

    /**
     * Gets the value of the kdno4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNO4() {
        return kdno4;
    }

    /**
     * Sets the value of the kdno4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNO4(String value) {
        this.kdno4 = value;
    }

    /**
     * Gets the value of the kdar5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAR5() {
        return kdar5;
    }

    /**
     * Sets the value of the kdar5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAR5(String value) {
        this.kdar5 = value;
    }

    /**
     * Gets the value of the kdnu5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNU5() {
        return kdnu5;
    }

    /**
     * Sets the value of the kdnu5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNU5(String value) {
        this.kdnu5 = value;
    }

    /**
     * Gets the value of the kdno5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNO5() {
        return kdno5;
    }

    /**
     * Sets the value of the kdno5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNO5(String value) {
        this.kdno5 = value;
    }

    /**
     * Gets the value of the kdar6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAR6() {
        return kdar6;
    }

    /**
     * Sets the value of the kdar6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAR6(String value) {
        this.kdar6 = value;
    }

    /**
     * Gets the value of the kdnu6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNU6() {
        return kdnu6;
    }

    /**
     * Sets the value of the kdnu6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNU6(String value) {
        this.kdnu6 = value;
    }

    /**
     * Gets the value of the kdno6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNO6() {
        return kdno6;
    }

    /**
     * Sets the value of the kdno6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNO6(String value) {
        this.kdno6 = value;
    }

    /**
     * Gets the value of the kdar7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAR7() {
        return kdar7;
    }

    /**
     * Sets the value of the kdar7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAR7(String value) {
        this.kdar7 = value;
    }

    /**
     * Gets the value of the kdnu7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNU7() {
        return kdnu7;
    }

    /**
     * Sets the value of the kdnu7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNU7(String value) {
        this.kdnu7 = value;
    }

    /**
     * Gets the value of the kdno7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNO7() {
        return kdno7;
    }

    /**
     * Sets the value of the kdno7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNO7(String value) {
        this.kdno7 = value;
    }

    /**
     * Gets the value of the kdar8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAR8() {
        return kdar8;
    }

    /**
     * Sets the value of the kdar8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAR8(String value) {
        this.kdar8 = value;
    }

    /**
     * Gets the value of the kdnu8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNU8() {
        return kdnu8;
    }

    /**
     * Sets the value of the kdnu8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNU8(String value) {
        this.kdnu8 = value;
    }

    /**
     * Gets the value of the kdno8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNO8() {
        return kdno8;
    }

    /**
     * Sets the value of the kdno8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNO8(String value) {
        this.kdno8 = value;
    }

    /**
     * Gets the value of the kdar9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAR9() {
        return kdar9;
    }

    /**
     * Sets the value of the kdar9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAR9(String value) {
        this.kdar9 = value;
    }

    /**
     * Gets the value of the kdnu9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNU9() {
        return kdnu9;
    }

    /**
     * Sets the value of the kdnu9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNU9(String value) {
        this.kdnu9 = value;
    }

    /**
     * Gets the value of the kdno9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNO9() {
        return kdno9;
    }

    /**
     * Sets the value of the kdno9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNO9(String value) {
        this.kdno9 = value;
    }

    /**
     * Gets the value of the kdara property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDARA() {
        return kdara;
    }

    /**
     * Sets the value of the kdara property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDARA(String value) {
        this.kdara = value;
    }

    /**
     * Gets the value of the kdnua property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNUA() {
        return kdnua;
    }

    /**
     * Sets the value of the kdnua property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNUA(String value) {
        this.kdnua = value;
    }

    /**
     * Gets the value of the kdnoa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNOA() {
        return kdnoa;
    }

    /**
     * Sets the value of the kdnoa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNOA(String value) {
        this.kdnoa = value;
    }

    /**
     * Gets the value of the kdarb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDARB() {
        return kdarb;
    }

    /**
     * Sets the value of the kdarb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDARB(String value) {
        this.kdarb = value;
    }

    /**
     * Gets the value of the kdnub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNUB() {
        return kdnub;
    }

    /**
     * Sets the value of the kdnub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNUB(String value) {
        this.kdnub = value;
    }

    /**
     * Gets the value of the kdnob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNOB() {
        return kdnob;
    }

    /**
     * Sets the value of the kdnob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNOB(String value) {
        this.kdnob = value;
    }

    /**
     * Gets the value of the kdarc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDARC() {
        return kdarc;
    }

    /**
     * Sets the value of the kdarc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDARC(String value) {
        this.kdarc = value;
    }

    /**
     * Gets the value of the kdnuc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNUC() {
        return kdnuc;
    }

    /**
     * Sets the value of the kdnuc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNUC(String value) {
        this.kdnuc = value;
    }

    /**
     * Gets the value of the kdnoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNOC() {
        return kdnoc;
    }

    /**
     * Sets the value of the kdnoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNOC(String value) {
        this.kdnoc = value;
    }

    /**
     * Gets the value of the kdard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDARD() {
        return kdard;
    }

    /**
     * Sets the value of the kdard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDARD(String value) {
        this.kdard = value;
    }

    /**
     * Gets the value of the kdnud property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNUD() {
        return kdnud;
    }

    /**
     * Sets the value of the kdnud property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNUD(String value) {
        this.kdnud = value;
    }

    /**
     * Gets the value of the kdnod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNOD() {
        return kdnod;
    }

    /**
     * Sets the value of the kdnod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNOD(String value) {
        this.kdnod = value;
    }

    /**
     * Gets the value of the kdare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDARE() {
        return kdare;
    }

    /**
     * Sets the value of the kdare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDARE(String value) {
        this.kdare = value;
    }

    /**
     * Gets the value of the kdnue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNUE() {
        return kdnue;
    }

    /**
     * Sets the value of the kdnue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNUE(String value) {
        this.kdnue = value;
    }

    /**
     * Gets the value of the kdnoe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNOE() {
        return kdnoe;
    }

    /**
     * Sets the value of the kdnoe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNOE(String value) {
        this.kdnoe = value;
    }

    /**
     * Gets the value of the kdarf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDARF() {
        return kdarf;
    }

    /**
     * Sets the value of the kdarf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDARF(String value) {
        this.kdarf = value;
    }

    /**
     * Gets the value of the kdnuf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNUF() {
        return kdnuf;
    }

    /**
     * Sets the value of the kdnuf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNUF(String value) {
        this.kdnuf = value;
    }

    /**
     * Gets the value of the kdnof property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNOF() {
        return kdnof;
    }

    /**
     * Sets the value of the kdnof property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNOF(String value) {
        this.kdnof = value;
    }

    /**
     * Gets the value of the kdarg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDARG() {
        return kdarg;
    }

    /**
     * Sets the value of the kdarg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDARG(String value) {
        this.kdarg = value;
    }

    /**
     * Gets the value of the kdnug property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNUG() {
        return kdnug;
    }

    /**
     * Sets the value of the kdnug property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNUG(String value) {
        this.kdnug = value;
    }

    /**
     * Gets the value of the kdnog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNOG() {
        return kdnog;
    }

    /**
     * Sets the value of the kdnog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNOG(String value) {
        this.kdnog = value;
    }

    /**
     * Gets the value of the kdarh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDARH() {
        return kdarh;
    }

    /**
     * Sets the value of the kdarh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDARH(String value) {
        this.kdarh = value;
    }

    /**
     * Gets the value of the kdnuh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNUH() {
        return kdnuh;
    }

    /**
     * Sets the value of the kdnuh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNUH(String value) {
        this.kdnuh = value;
    }

    /**
     * Gets the value of the kdnoh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNOH() {
        return kdnoh;
    }

    /**
     * Sets the value of the kdnoh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNOH(String value) {
        this.kdnoh = value;
    }

    /**
     * Gets the value of the kdari property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDARI() {
        return kdari;
    }

    /**
     * Sets the value of the kdari property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDARI(String value) {
        this.kdari = value;
    }

    /**
     * Gets the value of the kdnui property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNUI() {
        return kdnui;
    }

    /**
     * Sets the value of the kdnui property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNUI(String value) {
        this.kdnui = value;
    }

    /**
     * Gets the value of the kdnoi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNOI() {
        return kdnoi;
    }

    /**
     * Sets the value of the kdnoi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNOI(String value) {
        this.kdnoi = value;
    }

    /**
     * Gets the value of the kdarj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDARJ() {
        return kdarj;
    }

    /**
     * Sets the value of the kdarj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDARJ(String value) {
        this.kdarj = value;
    }

    /**
     * Gets the value of the kdnuj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNUJ() {
        return kdnuj;
    }

    /**
     * Sets the value of the kdnuj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNUJ(String value) {
        this.kdnuj = value;
    }

    /**
     * Gets the value of the kdnoj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNOJ() {
        return kdnoj;
    }

    /**
     * Sets the value of the kdnoj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNOJ(String value) {
        this.kdnoj = value;
    }

    /**
     * Gets the value of the kdark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDARK() {
        return kdark;
    }

    /**
     * Sets the value of the kdark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDARK(String value) {
        this.kdark = value;
    }

    /**
     * Gets the value of the kdnuk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNUK() {
        return kdnuk;
    }

    /**
     * Sets the value of the kdnuk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNUK(String value) {
        this.kdnuk = value;
    }

    /**
     * Gets the value of the kdnok property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNOK() {
        return kdnok;
    }

    /**
     * Sets the value of the kdnok property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNOK(String value) {
        this.kdnok = value;
    }

    /**
     * Gets the value of the kdarl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDARL() {
        return kdarl;
    }

    /**
     * Sets the value of the kdarl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDARL(String value) {
        this.kdarl = value;
    }

    /**
     * Gets the value of the kdnul property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNUL() {
        return kdnul;
    }

    /**
     * Sets the value of the kdnul property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNUL(String value) {
        this.kdnul = value;
    }

    /**
     * Gets the value of the kdnol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNOL() {
        return kdnol;
    }

    /**
     * Sets the value of the kdnol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNOL(String value) {
        this.kdnol = value;
    }

    /**
     * Gets the value of the kdarm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDARM() {
        return kdarm;
    }

    /**
     * Sets the value of the kdarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDARM(String value) {
        this.kdarm = value;
    }

    /**
     * Gets the value of the kdnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNUM() {
        return kdnum;
    }

    /**
     * Sets the value of the kdnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNUM(String value) {
        this.kdnum = value;
    }

    /**
     * Gets the value of the kdnom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNOM() {
        return kdnom;
    }

    /**
     * Sets the value of the kdnom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNOM(String value) {
        this.kdnom = value;
    }

    /**
     * Gets the value of the kdarn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDARN() {
        return kdarn;
    }

    /**
     * Sets the value of the kdarn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDARN(String value) {
        this.kdarn = value;
    }

    /**
     * Gets the value of the kdnun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNUN() {
        return kdnun;
    }

    /**
     * Sets the value of the kdnun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNUN(String value) {
        this.kdnun = value;
    }

    /**
     * Gets the value of the kdnon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNON() {
        return kdnon;
    }

    /**
     * Sets the value of the kdnon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNON(String value) {
        this.kdnon = value;
    }

    /**
     * Gets the value of the kdaro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDARO() {
        return kdaro;
    }

    /**
     * Sets the value of the kdaro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDARO(String value) {
        this.kdaro = value;
    }

    /**
     * Gets the value of the kdnuo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNUO() {
        return kdnuo;
    }

    /**
     * Sets the value of the kdnuo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNUO(String value) {
        this.kdnuo = value;
    }

    /**
     * Gets the value of the kdnoo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNOO() {
        return kdnoo;
    }

    /**
     * Sets the value of the kdnoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNOO(String value) {
        this.kdnoo = value;
    }

    /**
     * Gets the value of the kdarp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDARP() {
        return kdarp;
    }

    /**
     * Sets the value of the kdarp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDARP(String value) {
        this.kdarp = value;
    }

    /**
     * Gets the value of the kdnup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNUP() {
        return kdnup;
    }

    /**
     * Sets the value of the kdnup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNUP(String value) {
        this.kdnup = value;
    }

    /**
     * Gets the value of the kdnop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNOP() {
        return kdnop;
    }

    /**
     * Sets the value of the kdnop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNOP(String value) {
        this.kdnop = value;
    }

    /**
     * Gets the value of the kdarq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDARQ() {
        return kdarq;
    }

    /**
     * Sets the value of the kdarq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDARQ(String value) {
        this.kdarq = value;
    }

    /**
     * Gets the value of the kdnuq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNUQ() {
        return kdnuq;
    }

    /**
     * Sets the value of the kdnuq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNUQ(String value) {
        this.kdnuq = value;
    }

    /**
     * Gets the value of the kdnoq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNOQ() {
        return kdnoq;
    }

    /**
     * Sets the value of the kdnoq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNOQ(String value) {
        this.kdnoq = value;
    }

    /**
     * Gets the value of the kdarr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDARR() {
        return kdarr;
    }

    /**
     * Sets the value of the kdarr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDARR(String value) {
        this.kdarr = value;
    }

    /**
     * Gets the value of the kdnur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNUR() {
        return kdnur;
    }

    /**
     * Sets the value of the kdnur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNUR(String value) {
        this.kdnur = value;
    }

    /**
     * Gets the value of the kdnor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNOR() {
        return kdnor;
    }

    /**
     * Sets the value of the kdnor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNOR(String value) {
        this.kdnor = value;
    }

    /**
     * Gets the value of the kdars property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDARS() {
        return kdars;
    }

    /**
     * Sets the value of the kdars property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDARS(String value) {
        this.kdars = value;
    }

    /**
     * Gets the value of the kdnus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNUS() {
        return kdnus;
    }

    /**
     * Sets the value of the kdnus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNUS(String value) {
        this.kdnus = value;
    }

    /**
     * Gets the value of the kdnos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNOS() {
        return kdnos;
    }

    /**
     * Sets the value of the kdnos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNOS(String value) {
        this.kdnos = value;
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
     * Gets the value of the kdnut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNUT() {
        return kdnut;
    }

    /**
     * Sets the value of the kdnut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNUT(String value) {
        this.kdnut = value;
    }

    /**
     * Gets the value of the kdnot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNOT() {
        return kdnot;
    }

    /**
     * Sets the value of the kdnot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNOT(String value) {
        this.kdnot = value;
    }

    /**
     * Gets the value of the kdaru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDARU() {
        return kdaru;
    }

    /**
     * Sets the value of the kdaru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDARU(String value) {
        this.kdaru = value;
    }

    /**
     * Gets the value of the kdnuu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNUU() {
        return kdnuu;
    }

    /**
     * Sets the value of the kdnuu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNUU(String value) {
        this.kdnuu = value;
    }

    /**
     * Gets the value of the kdnou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDNOU() {
        return kdnou;
    }

    /**
     * Sets the value of the kdnou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDNOU(String value) {
        this.kdnou = value;
    }

    /**
     * Gets the value of the artlz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARTLZ() {
        return artlz;
    }

    /**
     * Sets the value of the artlz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARTLZ(String value) {
        this.artlz = value;
    }

    /**
     * Gets the value of the dbabm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBABM() {
        return dbabm;
    }

    /**
     * Sets the value of the dbabm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBABM(String value) {
        this.dbabm = value;
    }

    /**
     * Gets the value of the aland property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALAND() {
        return aland;
    }

    /**
     * Sets the value of the aland property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALAND(String value) {
        this.aland = value;
    }

    /**
     * Gets the value of the kwbkb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKWBKB() {
        return kwbkb;
    }

    /**
     * Sets the value of the kwbkb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKWBKB(String value) {
        this.kwbkb = value;
    }

    /**
     * Gets the value of the kdfv1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFV1() {
        return kdfv1;
    }

    /**
     * Sets the value of the kdfv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFV1(String value) {
        this.kdfv1 = value;
    }

    /**
     * Gets the value of the kdfl1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFL1() {
        return kdfl1;
    }

    /**
     * Sets the value of the kdfl1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFL1(String value) {
        this.kdfl1 = value;
    }

    /**
     * Gets the value of the kdaa1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAA1() {
        return kdaa1;
    }

    /**
     * Sets the value of the kdaa1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAA1(String value) {
        this.kdaa1 = value;
    }

    /**
     * Gets the value of the kdak1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAK1() {
        return kdak1;
    }

    /**
     * Sets the value of the kdak1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAK1(String value) {
        this.kdak1 = value;
    }

    /**
     * Gets the value of the kdfv2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFV2() {
        return kdfv2;
    }

    /**
     * Sets the value of the kdfv2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFV2(String value) {
        this.kdfv2 = value;
    }

    /**
     * Gets the value of the kdfl2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFL2() {
        return kdfl2;
    }

    /**
     * Sets the value of the kdfl2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFL2(String value) {
        this.kdfl2 = value;
    }

    /**
     * Gets the value of the kdaa2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAA2() {
        return kdaa2;
    }

    /**
     * Sets the value of the kdaa2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAA2(String value) {
        this.kdaa2 = value;
    }

    /**
     * Gets the value of the kdak2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAK2() {
        return kdak2;
    }

    /**
     * Sets the value of the kdak2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAK2(String value) {
        this.kdak2 = value;
    }

    /**
     * Gets the value of the kdfv3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFV3() {
        return kdfv3;
    }

    /**
     * Sets the value of the kdfv3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFV3(String value) {
        this.kdfv3 = value;
    }

    /**
     * Gets the value of the kdfl3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFL3() {
        return kdfl3;
    }

    /**
     * Sets the value of the kdfl3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFL3(String value) {
        this.kdfl3 = value;
    }

    /**
     * Gets the value of the kdaa3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAA3() {
        return kdaa3;
    }

    /**
     * Sets the value of the kdaa3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAA3(String value) {
        this.kdaa3 = value;
    }

    /**
     * Gets the value of the kdak3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAK3() {
        return kdak3;
    }

    /**
     * Sets the value of the kdak3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAK3(String value) {
        this.kdak3 = value;
    }

    /**
     * Gets the value of the kdfv4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFV4() {
        return kdfv4;
    }

    /**
     * Sets the value of the kdfv4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFV4(String value) {
        this.kdfv4 = value;
    }

    /**
     * Gets the value of the kdfl4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFL4() {
        return kdfl4;
    }

    /**
     * Sets the value of the kdfl4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFL4(String value) {
        this.kdfl4 = value;
    }

    /**
     * Gets the value of the kdaa4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAA4() {
        return kdaa4;
    }

    /**
     * Sets the value of the kdaa4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAA4(String value) {
        this.kdaa4 = value;
    }

    /**
     * Gets the value of the kdak4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAK4() {
        return kdak4;
    }

    /**
     * Sets the value of the kdak4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAK4(String value) {
        this.kdak4 = value;
    }

    /**
     * Gets the value of the kdfv5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFV5() {
        return kdfv5;
    }

    /**
     * Sets the value of the kdfv5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFV5(String value) {
        this.kdfv5 = value;
    }

    /**
     * Gets the value of the kdfl5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFL5() {
        return kdfl5;
    }

    /**
     * Sets the value of the kdfl5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFL5(String value) {
        this.kdfl5 = value;
    }

    /**
     * Gets the value of the kdaa5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAA5() {
        return kdaa5;
    }

    /**
     * Sets the value of the kdaa5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAA5(String value) {
        this.kdaa5 = value;
    }

    /**
     * Gets the value of the kdak5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAK5() {
        return kdak5;
    }

    /**
     * Sets the value of the kdak5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAK5(String value) {
        this.kdak5 = value;
    }

    /**
     * Gets the value of the kdfv6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFV6() {
        return kdfv6;
    }

    /**
     * Sets the value of the kdfv6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFV6(String value) {
        this.kdfv6 = value;
    }

    /**
     * Gets the value of the kdfl6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFL6() {
        return kdfl6;
    }

    /**
     * Sets the value of the kdfl6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFL6(String value) {
        this.kdfl6 = value;
    }

    /**
     * Gets the value of the kdaa6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAA6() {
        return kdaa6;
    }

    /**
     * Sets the value of the kdaa6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAA6(String value) {
        this.kdaa6 = value;
    }

    /**
     * Gets the value of the kdak6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAK6() {
        return kdak6;
    }

    /**
     * Sets the value of the kdak6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAK6(String value) {
        this.kdak6 = value;
    }

    /**
     * Gets the value of the kdfv7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFV7() {
        return kdfv7;
    }

    /**
     * Sets the value of the kdfv7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFV7(String value) {
        this.kdfv7 = value;
    }

    /**
     * Gets the value of the kdfl7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFL7() {
        return kdfl7;
    }

    /**
     * Sets the value of the kdfl7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFL7(String value) {
        this.kdfl7 = value;
    }

    /**
     * Gets the value of the kdaa7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAA7() {
        return kdaa7;
    }

    /**
     * Sets the value of the kdaa7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAA7(String value) {
        this.kdaa7 = value;
    }

    /**
     * Gets the value of the kdak7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAK7() {
        return kdak7;
    }

    /**
     * Sets the value of the kdak7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAK7(String value) {
        this.kdak7 = value;
    }

    /**
     * Gets the value of the kdfv8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFV8() {
        return kdfv8;
    }

    /**
     * Sets the value of the kdfv8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFV8(String value) {
        this.kdfv8 = value;
    }

    /**
     * Gets the value of the kdfl8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFL8() {
        return kdfl8;
    }

    /**
     * Sets the value of the kdfl8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFL8(String value) {
        this.kdfl8 = value;
    }

    /**
     * Gets the value of the kdaa8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAA8() {
        return kdaa8;
    }

    /**
     * Sets the value of the kdaa8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAA8(String value) {
        this.kdaa8 = value;
    }

    /**
     * Gets the value of the kdak8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAK8() {
        return kdak8;
    }

    /**
     * Sets the value of the kdak8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAK8(String value) {
        this.kdak8 = value;
    }

    /**
     * Gets the value of the kdfv9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFV9() {
        return kdfv9;
    }

    /**
     * Sets the value of the kdfv9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFV9(String value) {
        this.kdfv9 = value;
    }

    /**
     * Gets the value of the kdfl9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFL9() {
        return kdfl9;
    }

    /**
     * Sets the value of the kdfl9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFL9(String value) {
        this.kdfl9 = value;
    }

    /**
     * Gets the value of the kdaa9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAA9() {
        return kdaa9;
    }

    /**
     * Sets the value of the kdaa9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAA9(String value) {
        this.kdaa9 = value;
    }

    /**
     * Gets the value of the kdak9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAK9() {
        return kdak9;
    }

    /**
     * Sets the value of the kdak9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAK9(String value) {
        this.kdak9 = value;
    }

    /**
     * Gets the value of the kdfva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFVA() {
        return kdfva;
    }

    /**
     * Sets the value of the kdfva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFVA(String value) {
        this.kdfva = value;
    }

    /**
     * Gets the value of the kdfla property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFLA() {
        return kdfla;
    }

    /**
     * Sets the value of the kdfla property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFLA(String value) {
        this.kdfla = value;
    }

    /**
     * Gets the value of the kdaaa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAAA() {
        return kdaaa;
    }

    /**
     * Sets the value of the kdaaa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAAA(String value) {
        this.kdaaa = value;
    }

    /**
     * Gets the value of the kdaka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAKA() {
        return kdaka;
    }

    /**
     * Sets the value of the kdaka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAKA(String value) {
        this.kdaka = value;
    }

    /**
     * Gets the value of the kdfvb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFVB() {
        return kdfvb;
    }

    /**
     * Sets the value of the kdfvb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFVB(String value) {
        this.kdfvb = value;
    }

    /**
     * Gets the value of the kdflb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFLB() {
        return kdflb;
    }

    /**
     * Sets the value of the kdflb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFLB(String value) {
        this.kdflb = value;
    }

    /**
     * Gets the value of the kdaab property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAAB() {
        return kdaab;
    }

    /**
     * Sets the value of the kdaab property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAAB(String value) {
        this.kdaab = value;
    }

    /**
     * Gets the value of the kdakb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAKB() {
        return kdakb;
    }

    /**
     * Sets the value of the kdakb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAKB(String value) {
        this.kdakb = value;
    }

    /**
     * Gets the value of the kdfvc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFVC() {
        return kdfvc;
    }

    /**
     * Sets the value of the kdfvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFVC(String value) {
        this.kdfvc = value;
    }

    /**
     * Gets the value of the kdflc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFLC() {
        return kdflc;
    }

    /**
     * Sets the value of the kdflc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFLC(String value) {
        this.kdflc = value;
    }

    /**
     * Gets the value of the kdaac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAAC() {
        return kdaac;
    }

    /**
     * Sets the value of the kdaac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAAC(String value) {
        this.kdaac = value;
    }

    /**
     * Gets the value of the kdakc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAKC() {
        return kdakc;
    }

    /**
     * Sets the value of the kdakc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAKC(String value) {
        this.kdakc = value;
    }

    /**
     * Gets the value of the kdfvd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFVD() {
        return kdfvd;
    }

    /**
     * Sets the value of the kdfvd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFVD(String value) {
        this.kdfvd = value;
    }

    /**
     * Gets the value of the kdfld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFLD() {
        return kdfld;
    }

    /**
     * Sets the value of the kdfld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFLD(String value) {
        this.kdfld = value;
    }

    /**
     * Gets the value of the kdaad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAAD() {
        return kdaad;
    }

    /**
     * Sets the value of the kdaad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAAD(String value) {
        this.kdaad = value;
    }

    /**
     * Gets the value of the kdakd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAKD() {
        return kdakd;
    }

    /**
     * Sets the value of the kdakd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAKD(String value) {
        this.kdakd = value;
    }

    /**
     * Gets the value of the kdfve property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFVE() {
        return kdfve;
    }

    /**
     * Sets the value of the kdfve property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFVE(String value) {
        this.kdfve = value;
    }

    /**
     * Gets the value of the kdfle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFLE() {
        return kdfle;
    }

    /**
     * Sets the value of the kdfle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFLE(String value) {
        this.kdfle = value;
    }

    /**
     * Gets the value of the kdaae property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAAE() {
        return kdaae;
    }

    /**
     * Sets the value of the kdaae property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAAE(String value) {
        this.kdaae = value;
    }

    /**
     * Gets the value of the kdake property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAKE() {
        return kdake;
    }

    /**
     * Sets the value of the kdake property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAKE(String value) {
        this.kdake = value;
    }

    /**
     * Gets the value of the kdfvf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFVF() {
        return kdfvf;
    }

    /**
     * Sets the value of the kdfvf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFVF(String value) {
        this.kdfvf = value;
    }

    /**
     * Gets the value of the kdflf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFLF() {
        return kdflf;
    }

    /**
     * Sets the value of the kdflf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFLF(String value) {
        this.kdflf = value;
    }

    /**
     * Gets the value of the kdaaf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAAF() {
        return kdaaf;
    }

    /**
     * Sets the value of the kdaaf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAAF(String value) {
        this.kdaaf = value;
    }

    /**
     * Gets the value of the kdakf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAKF() {
        return kdakf;
    }

    /**
     * Sets the value of the kdakf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAKF(String value) {
        this.kdakf = value;
    }

    /**
     * Gets the value of the kdfvg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFVG() {
        return kdfvg;
    }

    /**
     * Sets the value of the kdfvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFVG(String value) {
        this.kdfvg = value;
    }

    /**
     * Gets the value of the kdflg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFLG() {
        return kdflg;
    }

    /**
     * Sets the value of the kdflg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFLG(String value) {
        this.kdflg = value;
    }

    /**
     * Gets the value of the kdaag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAAG() {
        return kdaag;
    }

    /**
     * Sets the value of the kdaag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAAG(String value) {
        this.kdaag = value;
    }

    /**
     * Gets the value of the kdakg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAKG() {
        return kdakg;
    }

    /**
     * Sets the value of the kdakg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAKG(String value) {
        this.kdakg = value;
    }

    /**
     * Gets the value of the kdfvh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFVH() {
        return kdfvh;
    }

    /**
     * Sets the value of the kdfvh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFVH(String value) {
        this.kdfvh = value;
    }

    /**
     * Gets the value of the kdflh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFLH() {
        return kdflh;
    }

    /**
     * Sets the value of the kdflh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFLH(String value) {
        this.kdflh = value;
    }

    /**
     * Gets the value of the kdaah property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAAH() {
        return kdaah;
    }

    /**
     * Sets the value of the kdaah property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAAH(String value) {
        this.kdaah = value;
    }

    /**
     * Gets the value of the kdakh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAKH() {
        return kdakh;
    }

    /**
     * Sets the value of the kdakh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAKH(String value) {
        this.kdakh = value;
    }

    /**
     * Gets the value of the kdfvi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFVI() {
        return kdfvi;
    }

    /**
     * Sets the value of the kdfvi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFVI(String value) {
        this.kdfvi = value;
    }

    /**
     * Gets the value of the kdfli property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFLI() {
        return kdfli;
    }

    /**
     * Sets the value of the kdfli property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFLI(String value) {
        this.kdfli = value;
    }

    /**
     * Gets the value of the kdaai property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAAI() {
        return kdaai;
    }

    /**
     * Sets the value of the kdaai property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAAI(String value) {
        this.kdaai = value;
    }

    /**
     * Gets the value of the kdaki property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAKI() {
        return kdaki;
    }

    /**
     * Sets the value of the kdaki property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAKI(String value) {
        this.kdaki = value;
    }

    /**
     * Gets the value of the kdfvj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFVJ() {
        return kdfvj;
    }

    /**
     * Sets the value of the kdfvj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFVJ(String value) {
        this.kdfvj = value;
    }

    /**
     * Gets the value of the kdflj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFLJ() {
        return kdflj;
    }

    /**
     * Sets the value of the kdflj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFLJ(String value) {
        this.kdflj = value;
    }

    /**
     * Gets the value of the kdaaj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAAJ() {
        return kdaaj;
    }

    /**
     * Sets the value of the kdaaj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAAJ(String value) {
        this.kdaaj = value;
    }

    /**
     * Gets the value of the kdakj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAKJ() {
        return kdakj;
    }

    /**
     * Sets the value of the kdakj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAKJ(String value) {
        this.kdakj = value;
    }

    /**
     * Gets the value of the kdfvk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFVK() {
        return kdfvk;
    }

    /**
     * Sets the value of the kdfvk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFVK(String value) {
        this.kdfvk = value;
    }

    /**
     * Gets the value of the kdflk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFLK() {
        return kdflk;
    }

    /**
     * Sets the value of the kdflk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFLK(String value) {
        this.kdflk = value;
    }

    /**
     * Gets the value of the kdaak property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAAK() {
        return kdaak;
    }

    /**
     * Sets the value of the kdaak property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAAK(String value) {
        this.kdaak = value;
    }

    /**
     * Gets the value of the kdakk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAKK() {
        return kdakk;
    }

    /**
     * Sets the value of the kdakk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAKK(String value) {
        this.kdakk = value;
    }

    /**
     * Gets the value of the kdfvl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFVL() {
        return kdfvl;
    }

    /**
     * Sets the value of the kdfvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFVL(String value) {
        this.kdfvl = value;
    }

    /**
     * Gets the value of the kdfll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFLL() {
        return kdfll;
    }

    /**
     * Sets the value of the kdfll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFLL(String value) {
        this.kdfll = value;
    }

    /**
     * Gets the value of the kdaal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAAL() {
        return kdaal;
    }

    /**
     * Sets the value of the kdaal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAAL(String value) {
        this.kdaal = value;
    }

    /**
     * Gets the value of the kdakl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAKL() {
        return kdakl;
    }

    /**
     * Sets the value of the kdakl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAKL(String value) {
        this.kdakl = value;
    }

    /**
     * Gets the value of the kdfvm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFVM() {
        return kdfvm;
    }

    /**
     * Sets the value of the kdfvm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFVM(String value) {
        this.kdfvm = value;
    }

    /**
     * Gets the value of the kdflm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFLM() {
        return kdflm;
    }

    /**
     * Sets the value of the kdflm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFLM(String value) {
        this.kdflm = value;
    }

    /**
     * Gets the value of the kdaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAAM() {
        return kdaam;
    }

    /**
     * Sets the value of the kdaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAAM(String value) {
        this.kdaam = value;
    }

    /**
     * Gets the value of the kdakm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAKM() {
        return kdakm;
    }

    /**
     * Sets the value of the kdakm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAKM(String value) {
        this.kdakm = value;
    }

    /**
     * Gets the value of the kdfvn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFVN() {
        return kdfvn;
    }

    /**
     * Sets the value of the kdfvn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFVN(String value) {
        this.kdfvn = value;
    }

    /**
     * Gets the value of the kdfln property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFLN() {
        return kdfln;
    }

    /**
     * Sets the value of the kdfln property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFLN(String value) {
        this.kdfln = value;
    }

    /**
     * Gets the value of the kdaan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAAN() {
        return kdaan;
    }

    /**
     * Sets the value of the kdaan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAAN(String value) {
        this.kdaan = value;
    }

    /**
     * Gets the value of the kdakn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAKN() {
        return kdakn;
    }

    /**
     * Sets the value of the kdakn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAKN(String value) {
        this.kdakn = value;
    }

    /**
     * Gets the value of the kdfvo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFVO() {
        return kdfvo;
    }

    /**
     * Sets the value of the kdfvo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFVO(String value) {
        this.kdfvo = value;
    }

    /**
     * Gets the value of the kdflo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFLO() {
        return kdflo;
    }

    /**
     * Sets the value of the kdflo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFLO(String value) {
        this.kdflo = value;
    }

    /**
     * Gets the value of the kdaao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAAO() {
        return kdaao;
    }

    /**
     * Sets the value of the kdaao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAAO(String value) {
        this.kdaao = value;
    }

    /**
     * Gets the value of the kdako property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAKO() {
        return kdako;
    }

    /**
     * Sets the value of the kdako property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAKO(String value) {
        this.kdako = value;
    }

    /**
     * Gets the value of the kdfvp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFVP() {
        return kdfvp;
    }

    /**
     * Sets the value of the kdfvp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFVP(String value) {
        this.kdfvp = value;
    }

    /**
     * Gets the value of the kdflp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFLP() {
        return kdflp;
    }

    /**
     * Sets the value of the kdflp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFLP(String value) {
        this.kdflp = value;
    }

    /**
     * Gets the value of the kdaap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAAP() {
        return kdaap;
    }

    /**
     * Sets the value of the kdaap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAAP(String value) {
        this.kdaap = value;
    }

    /**
     * Gets the value of the kdakp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAKP() {
        return kdakp;
    }

    /**
     * Sets the value of the kdakp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAKP(String value) {
        this.kdakp = value;
    }

    /**
     * Gets the value of the kdfvq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFVQ() {
        return kdfvq;
    }

    /**
     * Sets the value of the kdfvq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFVQ(String value) {
        this.kdfvq = value;
    }

    /**
     * Gets the value of the kdflq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFLQ() {
        return kdflq;
    }

    /**
     * Sets the value of the kdflq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFLQ(String value) {
        this.kdflq = value;
    }

    /**
     * Gets the value of the kdaaq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAAQ() {
        return kdaaq;
    }

    /**
     * Sets the value of the kdaaq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAAQ(String value) {
        this.kdaaq = value;
    }

    /**
     * Gets the value of the kdakq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAKQ() {
        return kdakq;
    }

    /**
     * Sets the value of the kdakq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAKQ(String value) {
        this.kdakq = value;
    }

    /**
     * Gets the value of the kdfvr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFVR() {
        return kdfvr;
    }

    /**
     * Sets the value of the kdfvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFVR(String value) {
        this.kdfvr = value;
    }

    /**
     * Gets the value of the kdflr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFLR() {
        return kdflr;
    }

    /**
     * Sets the value of the kdflr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFLR(String value) {
        this.kdflr = value;
    }

    /**
     * Gets the value of the kdaar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAAR() {
        return kdaar;
    }

    /**
     * Sets the value of the kdaar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAAR(String value) {
        this.kdaar = value;
    }

    /**
     * Gets the value of the kdakr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAKR() {
        return kdakr;
    }

    /**
     * Sets the value of the kdakr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAKR(String value) {
        this.kdakr = value;
    }

    /**
     * Gets the value of the kdfvs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFVS() {
        return kdfvs;
    }

    /**
     * Sets the value of the kdfvs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFVS(String value) {
        this.kdfvs = value;
    }

    /**
     * Gets the value of the kdfls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFLS() {
        return kdfls;
    }

    /**
     * Sets the value of the kdfls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFLS(String value) {
        this.kdfls = value;
    }

    /**
     * Gets the value of the kdaas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAAS() {
        return kdaas;
    }

    /**
     * Sets the value of the kdaas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAAS(String value) {
        this.kdaas = value;
    }

    /**
     * Gets the value of the kdaks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAKS() {
        return kdaks;
    }

    /**
     * Sets the value of the kdaks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAKS(String value) {
        this.kdaks = value;
    }

    /**
     * Gets the value of the kdfvt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFVT() {
        return kdfvt;
    }

    /**
     * Sets the value of the kdfvt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFVT(String value) {
        this.kdfvt = value;
    }

    /**
     * Gets the value of the kdflt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFLT() {
        return kdflt;
    }

    /**
     * Sets the value of the kdflt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFLT(String value) {
        this.kdflt = value;
    }

    /**
     * Gets the value of the kdaat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAAT() {
        return kdaat;
    }

    /**
     * Sets the value of the kdaat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAAT(String value) {
        this.kdaat = value;
    }

    /**
     * Gets the value of the kdakt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAKT() {
        return kdakt;
    }

    /**
     * Sets the value of the kdakt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAKT(String value) {
        this.kdakt = value;
    }

    /**
     * Gets the value of the kdfvu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFVU() {
        return kdfvu;
    }

    /**
     * Sets the value of the kdfvu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFVU(String value) {
        this.kdfvu = value;
    }

    /**
     * Gets the value of the kdflu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDFLU() {
        return kdflu;
    }

    /**
     * Sets the value of the kdflu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDFLU(String value) {
        this.kdflu = value;
    }

    /**
     * Gets the value of the kdaau property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAAU() {
        return kdaau;
    }

    /**
     * Sets the value of the kdaau property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAAU(String value) {
        this.kdaau = value;
    }

    /**
     * Gets the value of the kdaku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAKU() {
        return kdaku;
    }

    /**
     * Sets the value of the kdaku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAKU(String value) {
        this.kdaku = value;
    }

    /**
     * Gets the value of the e1031 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE1031() {
        return e1031;
    }

    /**
     * Sets the value of the e1031 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE1031(String value) {
        this.e1031 = value;
    }

    /**
     * Gets the value of the faboph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFABOPH() {
        return faboph;
    }

    /**
     * Sets the value of the faboph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFABOPH(String value) {
        this.faboph = value;
    }

    /**
     * Gets the value of the stp35P property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTP35P() {
        return stp35P;
    }

    /**
     * Sets the value of the stp35P property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTP35P(String value) {
        this.stp35P = value;
    }

    /**
     * Gets the value of the fbp35P property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFBP35P() {
        return fbp35P;
    }

    /**
     * Sets the value of the fbp35P property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFBP35P(String value) {
        this.fbp35P = value;
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
