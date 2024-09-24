
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
 *         &lt;element name="DAR01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAT01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAR02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAT02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAR03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAT03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAR04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAT04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAR05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAT05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAR06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAT06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAR07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAT07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAR08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAT08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAR09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAT09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAR10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAT10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAR11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAT11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAR12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAT12" minOccurs="0"&gt;
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
 *         &lt;element name="DAR13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAT13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAR14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAT14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAR15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAT15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAR16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAT16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAR17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAT17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAR18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAT18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAR19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAT19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAR20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAT20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAR21" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAT21" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAR22" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAT22" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAR23" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAT23" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAR24" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAT24" minOccurs="0"&gt;
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
    "dar01",
    "dat01",
    "dar02",
    "dat02",
    "dar03",
    "dat03",
    "dar04",
    "dat04",
    "dar05",
    "dat05",
    "dar06",
    "dat06",
    "dar07",
    "dat07",
    "dar08",
    "dat08",
    "dar09",
    "dat09",
    "dar10",
    "dat10",
    "dar11",
    "dat11",
    "dar12",
    "dat12",
    "grpvl",
    "dar13",
    "dat13",
    "dar14",
    "dat14",
    "dar15",
    "dat15",
    "dar16",
    "dat16",
    "dar17",
    "dat17",
    "dar18",
    "dat18",
    "dar19",
    "dat19",
    "dar20",
    "dat20",
    "dar21",
    "dat21",
    "dar22",
    "dat22",
    "dar23",
    "dat23",
    "dar24",
    "dat24"
})
public class E1P0041 {

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
    @XmlElement(name = "DAR01")
    protected String dar01;
    @XmlElement(name = "DAT01")
    protected String dat01;
    @XmlElement(name = "DAR02")
    protected String dar02;
    @XmlElement(name = "DAT02")
    protected String dat02;
    @XmlElement(name = "DAR03")
    protected String dar03;
    @XmlElement(name = "DAT03")
    protected String dat03;
    @XmlElement(name = "DAR04")
    protected String dar04;
    @XmlElement(name = "DAT04")
    protected String dat04;
    @XmlElement(name = "DAR05")
    protected String dar05;
    @XmlElement(name = "DAT05")
    protected String dat05;
    @XmlElement(name = "DAR06")
    protected String dar06;
    @XmlElement(name = "DAT06")
    protected String dat06;
    @XmlElement(name = "DAR07")
    protected String dar07;
    @XmlElement(name = "DAT07")
    protected String dat07;
    @XmlElement(name = "DAR08")
    protected String dar08;
    @XmlElement(name = "DAT08")
    protected String dat08;
    @XmlElement(name = "DAR09")
    protected String dar09;
    @XmlElement(name = "DAT09")
    protected String dat09;
    @XmlElement(name = "DAR10")
    protected String dar10;
    @XmlElement(name = "DAT10")
    protected String dat10;
    @XmlElement(name = "DAR11")
    protected String dar11;
    @XmlElement(name = "DAT11")
    protected String dat11;
    @XmlElement(name = "DAR12")
    protected String dar12;
    @XmlElement(name = "DAT12")
    protected String dat12;
    @XmlElement(name = "GRPVL")
    protected String grpvl;
    @XmlElement(name = "DAR13")
    protected String dar13;
    @XmlElement(name = "DAT13")
    protected String dat13;
    @XmlElement(name = "DAR14")
    protected String dar14;
    @XmlElement(name = "DAT14")
    protected String dat14;
    @XmlElement(name = "DAR15")
    protected String dar15;
    @XmlElement(name = "DAT15")
    protected String dat15;
    @XmlElement(name = "DAR16")
    protected String dar16;
    @XmlElement(name = "DAT16")
    protected String dat16;
    @XmlElement(name = "DAR17")
    protected String dar17;
    @XmlElement(name = "DAT17")
    protected String dat17;
    @XmlElement(name = "DAR18")
    protected String dar18;
    @XmlElement(name = "DAT18")
    protected String dat18;
    @XmlElement(name = "DAR19")
    protected String dar19;
    @XmlElement(name = "DAT19")
    protected String dat19;
    @XmlElement(name = "DAR20")
    protected String dar20;
    @XmlElement(name = "DAT20")
    protected String dat20;
    @XmlElement(name = "DAR21")
    protected String dar21;
    @XmlElement(name = "DAT21")
    protected String dat21;
    @XmlElement(name = "DAR22")
    protected String dar22;
    @XmlElement(name = "DAT22")
    protected String dat22;
    @XmlElement(name = "DAR23")
    protected String dar23;
    @XmlElement(name = "DAT23")
    protected String dat23;
    @XmlElement(name = "DAR24")
    protected String dar24;
    @XmlElement(name = "DAT24")
    protected String dat24;
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
     * Gets the value of the dar01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAR01() {
        return dar01;
    }

    /**
     * Sets the value of the dar01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAR01(String value) {
        this.dar01 = value;
    }

    /**
     * Gets the value of the dat01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAT01() {
        return dat01;
    }

    /**
     * Sets the value of the dat01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAT01(String value) {
        this.dat01 = value;
    }

    /**
     * Gets the value of the dar02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAR02() {
        return dar02;
    }

    /**
     * Sets the value of the dar02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAR02(String value) {
        this.dar02 = value;
    }

    /**
     * Gets the value of the dat02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAT02() {
        return dat02;
    }

    /**
     * Sets the value of the dat02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAT02(String value) {
        this.dat02 = value;
    }

    /**
     * Gets the value of the dar03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAR03() {
        return dar03;
    }

    /**
     * Sets the value of the dar03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAR03(String value) {
        this.dar03 = value;
    }

    /**
     * Gets the value of the dat03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAT03() {
        return dat03;
    }

    /**
     * Sets the value of the dat03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAT03(String value) {
        this.dat03 = value;
    }

    /**
     * Gets the value of the dar04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAR04() {
        return dar04;
    }

    /**
     * Sets the value of the dar04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAR04(String value) {
        this.dar04 = value;
    }

    /**
     * Gets the value of the dat04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAT04() {
        return dat04;
    }

    /**
     * Sets the value of the dat04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAT04(String value) {
        this.dat04 = value;
    }

    /**
     * Gets the value of the dar05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAR05() {
        return dar05;
    }

    /**
     * Sets the value of the dar05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAR05(String value) {
        this.dar05 = value;
    }

    /**
     * Gets the value of the dat05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAT05() {
        return dat05;
    }

    /**
     * Sets the value of the dat05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAT05(String value) {
        this.dat05 = value;
    }

    /**
     * Gets the value of the dar06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAR06() {
        return dar06;
    }

    /**
     * Sets the value of the dar06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAR06(String value) {
        this.dar06 = value;
    }

    /**
     * Gets the value of the dat06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAT06() {
        return dat06;
    }

    /**
     * Sets the value of the dat06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAT06(String value) {
        this.dat06 = value;
    }

    /**
     * Gets the value of the dar07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAR07() {
        return dar07;
    }

    /**
     * Sets the value of the dar07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAR07(String value) {
        this.dar07 = value;
    }

    /**
     * Gets the value of the dat07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAT07() {
        return dat07;
    }

    /**
     * Sets the value of the dat07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAT07(String value) {
        this.dat07 = value;
    }

    /**
     * Gets the value of the dar08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAR08() {
        return dar08;
    }

    /**
     * Sets the value of the dar08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAR08(String value) {
        this.dar08 = value;
    }

    /**
     * Gets the value of the dat08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAT08() {
        return dat08;
    }

    /**
     * Sets the value of the dat08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAT08(String value) {
        this.dat08 = value;
    }

    /**
     * Gets the value of the dar09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAR09() {
        return dar09;
    }

    /**
     * Sets the value of the dar09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAR09(String value) {
        this.dar09 = value;
    }

    /**
     * Gets the value of the dat09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAT09() {
        return dat09;
    }

    /**
     * Sets the value of the dat09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAT09(String value) {
        this.dat09 = value;
    }

    /**
     * Gets the value of the dar10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAR10() {
        return dar10;
    }

    /**
     * Sets the value of the dar10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAR10(String value) {
        this.dar10 = value;
    }

    /**
     * Gets the value of the dat10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAT10() {
        return dat10;
    }

    /**
     * Sets the value of the dat10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAT10(String value) {
        this.dat10 = value;
    }

    /**
     * Gets the value of the dar11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAR11() {
        return dar11;
    }

    /**
     * Sets the value of the dar11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAR11(String value) {
        this.dar11 = value;
    }

    /**
     * Gets the value of the dat11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAT11() {
        return dat11;
    }

    /**
     * Sets the value of the dat11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAT11(String value) {
        this.dat11 = value;
    }

    /**
     * Gets the value of the dar12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAR12() {
        return dar12;
    }

    /**
     * Sets the value of the dar12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAR12(String value) {
        this.dar12 = value;
    }

    /**
     * Gets the value of the dat12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAT12() {
        return dat12;
    }

    /**
     * Sets the value of the dat12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAT12(String value) {
        this.dat12 = value;
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
     * Gets the value of the dar13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAR13() {
        return dar13;
    }

    /**
     * Sets the value of the dar13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAR13(String value) {
        this.dar13 = value;
    }

    /**
     * Gets the value of the dat13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAT13() {
        return dat13;
    }

    /**
     * Sets the value of the dat13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAT13(String value) {
        this.dat13 = value;
    }

    /**
     * Gets the value of the dar14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAR14() {
        return dar14;
    }

    /**
     * Sets the value of the dar14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAR14(String value) {
        this.dar14 = value;
    }

    /**
     * Gets the value of the dat14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAT14() {
        return dat14;
    }

    /**
     * Sets the value of the dat14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAT14(String value) {
        this.dat14 = value;
    }

    /**
     * Gets the value of the dar15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAR15() {
        return dar15;
    }

    /**
     * Sets the value of the dar15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAR15(String value) {
        this.dar15 = value;
    }

    /**
     * Gets the value of the dat15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAT15() {
        return dat15;
    }

    /**
     * Sets the value of the dat15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAT15(String value) {
        this.dat15 = value;
    }

    /**
     * Gets the value of the dar16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAR16() {
        return dar16;
    }

    /**
     * Sets the value of the dar16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAR16(String value) {
        this.dar16 = value;
    }

    /**
     * Gets the value of the dat16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAT16() {
        return dat16;
    }

    /**
     * Sets the value of the dat16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAT16(String value) {
        this.dat16 = value;
    }

    /**
     * Gets the value of the dar17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAR17() {
        return dar17;
    }

    /**
     * Sets the value of the dar17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAR17(String value) {
        this.dar17 = value;
    }

    /**
     * Gets the value of the dat17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAT17() {
        return dat17;
    }

    /**
     * Sets the value of the dat17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAT17(String value) {
        this.dat17 = value;
    }

    /**
     * Gets the value of the dar18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAR18() {
        return dar18;
    }

    /**
     * Sets the value of the dar18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAR18(String value) {
        this.dar18 = value;
    }

    /**
     * Gets the value of the dat18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAT18() {
        return dat18;
    }

    /**
     * Sets the value of the dat18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAT18(String value) {
        this.dat18 = value;
    }

    /**
     * Gets the value of the dar19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAR19() {
        return dar19;
    }

    /**
     * Sets the value of the dar19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAR19(String value) {
        this.dar19 = value;
    }

    /**
     * Gets the value of the dat19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAT19() {
        return dat19;
    }

    /**
     * Sets the value of the dat19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAT19(String value) {
        this.dat19 = value;
    }

    /**
     * Gets the value of the dar20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAR20() {
        return dar20;
    }

    /**
     * Sets the value of the dar20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAR20(String value) {
        this.dar20 = value;
    }

    /**
     * Gets the value of the dat20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAT20() {
        return dat20;
    }

    /**
     * Sets the value of the dat20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAT20(String value) {
        this.dat20 = value;
    }

    /**
     * Gets the value of the dar21 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAR21() {
        return dar21;
    }

    /**
     * Sets the value of the dar21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAR21(String value) {
        this.dar21 = value;
    }

    /**
     * Gets the value of the dat21 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAT21() {
        return dat21;
    }

    /**
     * Sets the value of the dat21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAT21(String value) {
        this.dat21 = value;
    }

    /**
     * Gets the value of the dar22 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAR22() {
        return dar22;
    }

    /**
     * Sets the value of the dar22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAR22(String value) {
        this.dar22 = value;
    }

    /**
     * Gets the value of the dat22 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAT22() {
        return dat22;
    }

    /**
     * Sets the value of the dat22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAT22(String value) {
        this.dat22 = value;
    }

    /**
     * Gets the value of the dar23 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAR23() {
        return dar23;
    }

    /**
     * Sets the value of the dar23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAR23(String value) {
        this.dar23 = value;
    }

    /**
     * Gets the value of the dat23 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAT23() {
        return dat23;
    }

    /**
     * Sets the value of the dat23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAT23(String value) {
        this.dat23 = value;
    }

    /**
     * Gets the value of the dar24 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAR24() {
        return dar24;
    }

    /**
     * Sets the value of the dar24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAR24(String value) {
        this.dar24 = value;
    }

    /**
     * Gets the value of the dat24 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAT24() {
        return dat24;
    }

    /**
     * Sets the value of the dat24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAT24(String value) {
        this.dat24 = value;
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
