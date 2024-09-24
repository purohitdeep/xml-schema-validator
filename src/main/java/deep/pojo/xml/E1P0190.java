
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
 *         &lt;element name="VORAG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BTRNR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZVKAS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPE01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPE02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPE03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPE04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPE05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPE06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPE07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPE08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPE09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPE10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPE11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPE12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPE13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPE14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPE15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPE16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPE17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPE18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPE19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPE20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET20" minOccurs="0"&gt;
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
    "vorag",
    "btrnr",
    "zvkas",
    "lga01",
    "anz01",
    "bpe01",
    "bet01",
    "lga02",
    "anz02",
    "bpe02",
    "bet02",
    "lga03",
    "anz03",
    "bpe03",
    "bet03",
    "lga04",
    "anz04",
    "bpe04",
    "bet04",
    "lga05",
    "anz05",
    "bpe05",
    "bet05",
    "lga06",
    "anz06",
    "bpe06",
    "bet06",
    "lga07",
    "anz07",
    "bpe07",
    "bet07",
    "lga08",
    "anz08",
    "bpe08",
    "bet08",
    "lga09",
    "anz09",
    "bpe09",
    "bet09",
    "lga10",
    "anz10",
    "bpe10",
    "bet10",
    "lga11",
    "anz11",
    "bpe11",
    "bet11",
    "lga12",
    "anz12",
    "bpe12",
    "bet12",
    "lga13",
    "anz13",
    "bpe13",
    "bet13",
    "lga14",
    "anz14",
    "bpe14",
    "bet14",
    "lga15",
    "anz15",
    "bpe15",
    "bet15",
    "lga16",
    "anz16",
    "bpe16",
    "bet16",
    "lga17",
    "anz17",
    "bpe17",
    "bet17",
    "lga18",
    "anz18",
    "bpe18",
    "bet18",
    "lga19",
    "anz19",
    "bpe19",
    "bet19",
    "lga20",
    "anz20",
    "bpe20",
    "bet20",
    "grpvl"
})
public class E1P0190 {

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
    @XmlElement(name = "VORAG")
    protected String vorag;
    @XmlElement(name = "BTRNR")
    protected String btrnr;
    @XmlElement(name = "ZVKAS")
    protected String zvkas;
    @XmlElement(name = "LGA01")
    protected String lga01;
    @XmlElement(name = "ANZ01")
    protected String anz01;
    @XmlElement(name = "BPE01")
    protected String bpe01;
    @XmlElement(name = "BET01")
    protected String bet01;
    @XmlElement(name = "LGA02")
    protected String lga02;
    @XmlElement(name = "ANZ02")
    protected String anz02;
    @XmlElement(name = "BPE02")
    protected String bpe02;
    @XmlElement(name = "BET02")
    protected String bet02;
    @XmlElement(name = "LGA03")
    protected String lga03;
    @XmlElement(name = "ANZ03")
    protected String anz03;
    @XmlElement(name = "BPE03")
    protected String bpe03;
    @XmlElement(name = "BET03")
    protected String bet03;
    @XmlElement(name = "LGA04")
    protected String lga04;
    @XmlElement(name = "ANZ04")
    protected String anz04;
    @XmlElement(name = "BPE04")
    protected String bpe04;
    @XmlElement(name = "BET04")
    protected String bet04;
    @XmlElement(name = "LGA05")
    protected String lga05;
    @XmlElement(name = "ANZ05")
    protected String anz05;
    @XmlElement(name = "BPE05")
    protected String bpe05;
    @XmlElement(name = "BET05")
    protected String bet05;
    @XmlElement(name = "LGA06")
    protected String lga06;
    @XmlElement(name = "ANZ06")
    protected String anz06;
    @XmlElement(name = "BPE06")
    protected String bpe06;
    @XmlElement(name = "BET06")
    protected String bet06;
    @XmlElement(name = "LGA07")
    protected String lga07;
    @XmlElement(name = "ANZ07")
    protected String anz07;
    @XmlElement(name = "BPE07")
    protected String bpe07;
    @XmlElement(name = "BET07")
    protected String bet07;
    @XmlElement(name = "LGA08")
    protected String lga08;
    @XmlElement(name = "ANZ08")
    protected String anz08;
    @XmlElement(name = "BPE08")
    protected String bpe08;
    @XmlElement(name = "BET08")
    protected String bet08;
    @XmlElement(name = "LGA09")
    protected String lga09;
    @XmlElement(name = "ANZ09")
    protected String anz09;
    @XmlElement(name = "BPE09")
    protected String bpe09;
    @XmlElement(name = "BET09")
    protected String bet09;
    @XmlElement(name = "LGA10")
    protected String lga10;
    @XmlElement(name = "ANZ10")
    protected String anz10;
    @XmlElement(name = "BPE10")
    protected String bpe10;
    @XmlElement(name = "BET10")
    protected String bet10;
    @XmlElement(name = "LGA11")
    protected String lga11;
    @XmlElement(name = "ANZ11")
    protected String anz11;
    @XmlElement(name = "BPE11")
    protected String bpe11;
    @XmlElement(name = "BET11")
    protected String bet11;
    @XmlElement(name = "LGA12")
    protected String lga12;
    @XmlElement(name = "ANZ12")
    protected String anz12;
    @XmlElement(name = "BPE12")
    protected String bpe12;
    @XmlElement(name = "BET12")
    protected String bet12;
    @XmlElement(name = "LGA13")
    protected String lga13;
    @XmlElement(name = "ANZ13")
    protected String anz13;
    @XmlElement(name = "BPE13")
    protected String bpe13;
    @XmlElement(name = "BET13")
    protected String bet13;
    @XmlElement(name = "LGA14")
    protected String lga14;
    @XmlElement(name = "ANZ14")
    protected String anz14;
    @XmlElement(name = "BPE14")
    protected String bpe14;
    @XmlElement(name = "BET14")
    protected String bet14;
    @XmlElement(name = "LGA15")
    protected String lga15;
    @XmlElement(name = "ANZ15")
    protected String anz15;
    @XmlElement(name = "BPE15")
    protected String bpe15;
    @XmlElement(name = "BET15")
    protected String bet15;
    @XmlElement(name = "LGA16")
    protected String lga16;
    @XmlElement(name = "ANZ16")
    protected String anz16;
    @XmlElement(name = "BPE16")
    protected String bpe16;
    @XmlElement(name = "BET16")
    protected String bet16;
    @XmlElement(name = "LGA17")
    protected String lga17;
    @XmlElement(name = "ANZ17")
    protected String anz17;
    @XmlElement(name = "BPE17")
    protected String bpe17;
    @XmlElement(name = "BET17")
    protected String bet17;
    @XmlElement(name = "LGA18")
    protected String lga18;
    @XmlElement(name = "ANZ18")
    protected String anz18;
    @XmlElement(name = "BPE18")
    protected String bpe18;
    @XmlElement(name = "BET18")
    protected String bet18;
    @XmlElement(name = "LGA19")
    protected String lga19;
    @XmlElement(name = "ANZ19")
    protected String anz19;
    @XmlElement(name = "BPE19")
    protected String bpe19;
    @XmlElement(name = "BET19")
    protected String bet19;
    @XmlElement(name = "LGA20")
    protected String lga20;
    @XmlElement(name = "ANZ20")
    protected String anz20;
    @XmlElement(name = "BPE20")
    protected String bpe20;
    @XmlElement(name = "BET20")
    protected String bet20;
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
     * Gets the value of the vorag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVORAG() {
        return vorag;
    }

    /**
     * Sets the value of the vorag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVORAG(String value) {
        this.vorag = value;
    }

    /**
     * Gets the value of the btrnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBTRNR() {
        return btrnr;
    }

    /**
     * Sets the value of the btrnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBTRNR(String value) {
        this.btrnr = value;
    }

    /**
     * Gets the value of the zvkas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZVKAS() {
        return zvkas;
    }

    /**
     * Sets the value of the zvkas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZVKAS(String value) {
        this.zvkas = value;
    }

    /**
     * Gets the value of the lga01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA01() {
        return lga01;
    }

    /**
     * Sets the value of the lga01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA01(String value) {
        this.lga01 = value;
    }

    /**
     * Gets the value of the anz01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ01() {
        return anz01;
    }

    /**
     * Sets the value of the anz01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ01(String value) {
        this.anz01 = value;
    }

    /**
     * Gets the value of the bpe01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPE01() {
        return bpe01;
    }

    /**
     * Sets the value of the bpe01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPE01(String value) {
        this.bpe01 = value;
    }

    /**
     * Gets the value of the bet01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET01() {
        return bet01;
    }

    /**
     * Sets the value of the bet01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET01(String value) {
        this.bet01 = value;
    }

    /**
     * Gets the value of the lga02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA02() {
        return lga02;
    }

    /**
     * Sets the value of the lga02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA02(String value) {
        this.lga02 = value;
    }

    /**
     * Gets the value of the anz02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ02() {
        return anz02;
    }

    /**
     * Sets the value of the anz02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ02(String value) {
        this.anz02 = value;
    }

    /**
     * Gets the value of the bpe02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPE02() {
        return bpe02;
    }

    /**
     * Sets the value of the bpe02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPE02(String value) {
        this.bpe02 = value;
    }

    /**
     * Gets the value of the bet02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET02() {
        return bet02;
    }

    /**
     * Sets the value of the bet02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET02(String value) {
        this.bet02 = value;
    }

    /**
     * Gets the value of the lga03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA03() {
        return lga03;
    }

    /**
     * Sets the value of the lga03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA03(String value) {
        this.lga03 = value;
    }

    /**
     * Gets the value of the anz03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ03() {
        return anz03;
    }

    /**
     * Sets the value of the anz03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ03(String value) {
        this.anz03 = value;
    }

    /**
     * Gets the value of the bpe03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPE03() {
        return bpe03;
    }

    /**
     * Sets the value of the bpe03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPE03(String value) {
        this.bpe03 = value;
    }

    /**
     * Gets the value of the bet03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET03() {
        return bet03;
    }

    /**
     * Sets the value of the bet03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET03(String value) {
        this.bet03 = value;
    }

    /**
     * Gets the value of the lga04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA04() {
        return lga04;
    }

    /**
     * Sets the value of the lga04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA04(String value) {
        this.lga04 = value;
    }

    /**
     * Gets the value of the anz04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ04() {
        return anz04;
    }

    /**
     * Sets the value of the anz04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ04(String value) {
        this.anz04 = value;
    }

    /**
     * Gets the value of the bpe04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPE04() {
        return bpe04;
    }

    /**
     * Sets the value of the bpe04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPE04(String value) {
        this.bpe04 = value;
    }

    /**
     * Gets the value of the bet04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET04() {
        return bet04;
    }

    /**
     * Sets the value of the bet04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET04(String value) {
        this.bet04 = value;
    }

    /**
     * Gets the value of the lga05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA05() {
        return lga05;
    }

    /**
     * Sets the value of the lga05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA05(String value) {
        this.lga05 = value;
    }

    /**
     * Gets the value of the anz05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ05() {
        return anz05;
    }

    /**
     * Sets the value of the anz05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ05(String value) {
        this.anz05 = value;
    }

    /**
     * Gets the value of the bpe05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPE05() {
        return bpe05;
    }

    /**
     * Sets the value of the bpe05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPE05(String value) {
        this.bpe05 = value;
    }

    /**
     * Gets the value of the bet05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET05() {
        return bet05;
    }

    /**
     * Sets the value of the bet05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET05(String value) {
        this.bet05 = value;
    }

    /**
     * Gets the value of the lga06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA06() {
        return lga06;
    }

    /**
     * Sets the value of the lga06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA06(String value) {
        this.lga06 = value;
    }

    /**
     * Gets the value of the anz06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ06() {
        return anz06;
    }

    /**
     * Sets the value of the anz06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ06(String value) {
        this.anz06 = value;
    }

    /**
     * Gets the value of the bpe06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPE06() {
        return bpe06;
    }

    /**
     * Sets the value of the bpe06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPE06(String value) {
        this.bpe06 = value;
    }

    /**
     * Gets the value of the bet06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET06() {
        return bet06;
    }

    /**
     * Sets the value of the bet06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET06(String value) {
        this.bet06 = value;
    }

    /**
     * Gets the value of the lga07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA07() {
        return lga07;
    }

    /**
     * Sets the value of the lga07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA07(String value) {
        this.lga07 = value;
    }

    /**
     * Gets the value of the anz07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ07() {
        return anz07;
    }

    /**
     * Sets the value of the anz07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ07(String value) {
        this.anz07 = value;
    }

    /**
     * Gets the value of the bpe07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPE07() {
        return bpe07;
    }

    /**
     * Sets the value of the bpe07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPE07(String value) {
        this.bpe07 = value;
    }

    /**
     * Gets the value of the bet07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET07() {
        return bet07;
    }

    /**
     * Sets the value of the bet07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET07(String value) {
        this.bet07 = value;
    }

    /**
     * Gets the value of the lga08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA08() {
        return lga08;
    }

    /**
     * Sets the value of the lga08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA08(String value) {
        this.lga08 = value;
    }

    /**
     * Gets the value of the anz08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ08() {
        return anz08;
    }

    /**
     * Sets the value of the anz08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ08(String value) {
        this.anz08 = value;
    }

    /**
     * Gets the value of the bpe08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPE08() {
        return bpe08;
    }

    /**
     * Sets the value of the bpe08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPE08(String value) {
        this.bpe08 = value;
    }

    /**
     * Gets the value of the bet08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET08() {
        return bet08;
    }

    /**
     * Sets the value of the bet08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET08(String value) {
        this.bet08 = value;
    }

    /**
     * Gets the value of the lga09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA09() {
        return lga09;
    }

    /**
     * Sets the value of the lga09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA09(String value) {
        this.lga09 = value;
    }

    /**
     * Gets the value of the anz09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ09() {
        return anz09;
    }

    /**
     * Sets the value of the anz09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ09(String value) {
        this.anz09 = value;
    }

    /**
     * Gets the value of the bpe09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPE09() {
        return bpe09;
    }

    /**
     * Sets the value of the bpe09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPE09(String value) {
        this.bpe09 = value;
    }

    /**
     * Gets the value of the bet09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET09() {
        return bet09;
    }

    /**
     * Sets the value of the bet09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET09(String value) {
        this.bet09 = value;
    }

    /**
     * Gets the value of the lga10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA10() {
        return lga10;
    }

    /**
     * Sets the value of the lga10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA10(String value) {
        this.lga10 = value;
    }

    /**
     * Gets the value of the anz10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ10() {
        return anz10;
    }

    /**
     * Sets the value of the anz10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ10(String value) {
        this.anz10 = value;
    }

    /**
     * Gets the value of the bpe10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPE10() {
        return bpe10;
    }

    /**
     * Sets the value of the bpe10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPE10(String value) {
        this.bpe10 = value;
    }

    /**
     * Gets the value of the bet10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET10() {
        return bet10;
    }

    /**
     * Sets the value of the bet10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET10(String value) {
        this.bet10 = value;
    }

    /**
     * Gets the value of the lga11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA11() {
        return lga11;
    }

    /**
     * Sets the value of the lga11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA11(String value) {
        this.lga11 = value;
    }

    /**
     * Gets the value of the anz11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ11() {
        return anz11;
    }

    /**
     * Sets the value of the anz11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ11(String value) {
        this.anz11 = value;
    }

    /**
     * Gets the value of the bpe11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPE11() {
        return bpe11;
    }

    /**
     * Sets the value of the bpe11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPE11(String value) {
        this.bpe11 = value;
    }

    /**
     * Gets the value of the bet11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET11() {
        return bet11;
    }

    /**
     * Sets the value of the bet11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET11(String value) {
        this.bet11 = value;
    }

    /**
     * Gets the value of the lga12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA12() {
        return lga12;
    }

    /**
     * Sets the value of the lga12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA12(String value) {
        this.lga12 = value;
    }

    /**
     * Gets the value of the anz12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ12() {
        return anz12;
    }

    /**
     * Sets the value of the anz12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ12(String value) {
        this.anz12 = value;
    }

    /**
     * Gets the value of the bpe12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPE12() {
        return bpe12;
    }

    /**
     * Sets the value of the bpe12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPE12(String value) {
        this.bpe12 = value;
    }

    /**
     * Gets the value of the bet12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET12() {
        return bet12;
    }

    /**
     * Sets the value of the bet12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET12(String value) {
        this.bet12 = value;
    }

    /**
     * Gets the value of the lga13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA13() {
        return lga13;
    }

    /**
     * Sets the value of the lga13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA13(String value) {
        this.lga13 = value;
    }

    /**
     * Gets the value of the anz13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ13() {
        return anz13;
    }

    /**
     * Sets the value of the anz13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ13(String value) {
        this.anz13 = value;
    }

    /**
     * Gets the value of the bpe13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPE13() {
        return bpe13;
    }

    /**
     * Sets the value of the bpe13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPE13(String value) {
        this.bpe13 = value;
    }

    /**
     * Gets the value of the bet13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET13() {
        return bet13;
    }

    /**
     * Sets the value of the bet13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET13(String value) {
        this.bet13 = value;
    }

    /**
     * Gets the value of the lga14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA14() {
        return lga14;
    }

    /**
     * Sets the value of the lga14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA14(String value) {
        this.lga14 = value;
    }

    /**
     * Gets the value of the anz14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ14() {
        return anz14;
    }

    /**
     * Sets the value of the anz14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ14(String value) {
        this.anz14 = value;
    }

    /**
     * Gets the value of the bpe14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPE14() {
        return bpe14;
    }

    /**
     * Sets the value of the bpe14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPE14(String value) {
        this.bpe14 = value;
    }

    /**
     * Gets the value of the bet14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET14() {
        return bet14;
    }

    /**
     * Sets the value of the bet14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET14(String value) {
        this.bet14 = value;
    }

    /**
     * Gets the value of the lga15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA15() {
        return lga15;
    }

    /**
     * Sets the value of the lga15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA15(String value) {
        this.lga15 = value;
    }

    /**
     * Gets the value of the anz15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ15() {
        return anz15;
    }

    /**
     * Sets the value of the anz15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ15(String value) {
        this.anz15 = value;
    }

    /**
     * Gets the value of the bpe15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPE15() {
        return bpe15;
    }

    /**
     * Sets the value of the bpe15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPE15(String value) {
        this.bpe15 = value;
    }

    /**
     * Gets the value of the bet15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET15() {
        return bet15;
    }

    /**
     * Sets the value of the bet15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET15(String value) {
        this.bet15 = value;
    }

    /**
     * Gets the value of the lga16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA16() {
        return lga16;
    }

    /**
     * Sets the value of the lga16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA16(String value) {
        this.lga16 = value;
    }

    /**
     * Gets the value of the anz16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ16() {
        return anz16;
    }

    /**
     * Sets the value of the anz16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ16(String value) {
        this.anz16 = value;
    }

    /**
     * Gets the value of the bpe16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPE16() {
        return bpe16;
    }

    /**
     * Sets the value of the bpe16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPE16(String value) {
        this.bpe16 = value;
    }

    /**
     * Gets the value of the bet16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET16() {
        return bet16;
    }

    /**
     * Sets the value of the bet16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET16(String value) {
        this.bet16 = value;
    }

    /**
     * Gets the value of the lga17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA17() {
        return lga17;
    }

    /**
     * Sets the value of the lga17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA17(String value) {
        this.lga17 = value;
    }

    /**
     * Gets the value of the anz17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ17() {
        return anz17;
    }

    /**
     * Sets the value of the anz17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ17(String value) {
        this.anz17 = value;
    }

    /**
     * Gets the value of the bpe17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPE17() {
        return bpe17;
    }

    /**
     * Sets the value of the bpe17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPE17(String value) {
        this.bpe17 = value;
    }

    /**
     * Gets the value of the bet17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET17() {
        return bet17;
    }

    /**
     * Sets the value of the bet17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET17(String value) {
        this.bet17 = value;
    }

    /**
     * Gets the value of the lga18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA18() {
        return lga18;
    }

    /**
     * Sets the value of the lga18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA18(String value) {
        this.lga18 = value;
    }

    /**
     * Gets the value of the anz18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ18() {
        return anz18;
    }

    /**
     * Sets the value of the anz18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ18(String value) {
        this.anz18 = value;
    }

    /**
     * Gets the value of the bpe18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPE18() {
        return bpe18;
    }

    /**
     * Sets the value of the bpe18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPE18(String value) {
        this.bpe18 = value;
    }

    /**
     * Gets the value of the bet18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET18() {
        return bet18;
    }

    /**
     * Sets the value of the bet18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET18(String value) {
        this.bet18 = value;
    }

    /**
     * Gets the value of the lga19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA19() {
        return lga19;
    }

    /**
     * Sets the value of the lga19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA19(String value) {
        this.lga19 = value;
    }

    /**
     * Gets the value of the anz19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ19() {
        return anz19;
    }

    /**
     * Sets the value of the anz19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ19(String value) {
        this.anz19 = value;
    }

    /**
     * Gets the value of the bpe19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPE19() {
        return bpe19;
    }

    /**
     * Sets the value of the bpe19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPE19(String value) {
        this.bpe19 = value;
    }

    /**
     * Gets the value of the bet19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET19() {
        return bet19;
    }

    /**
     * Sets the value of the bet19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET19(String value) {
        this.bet19 = value;
    }

    /**
     * Gets the value of the lga20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA20() {
        return lga20;
    }

    /**
     * Sets the value of the lga20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA20(String value) {
        this.lga20 = value;
    }

    /**
     * Gets the value of the anz20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ20() {
        return anz20;
    }

    /**
     * Sets the value of the anz20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ20(String value) {
        this.anz20 = value;
    }

    /**
     * Gets the value of the bpe20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPE20() {
        return bpe20;
    }

    /**
     * Sets the value of the bpe20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPE20(String value) {
        this.bpe20 = value;
    }

    /**
     * Gets the value of the bet20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET20() {
        return bet20;
    }

    /**
     * Sets the value of the bet20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET20(String value) {
        this.bet20 = value;
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
