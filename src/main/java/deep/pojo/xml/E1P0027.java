
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
 *         &lt;element name="KSTAR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KBU01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KGB01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KST01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KPR01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KBU02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KGB02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KST02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KPR02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KBU03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KGB03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KST03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KPR03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KBU04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KGB04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KST04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KPR04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KBU05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KGB05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KST05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KPR05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KBU06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KGB06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KST06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KPR06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KBU07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KGB07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KST07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KPR07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KBU08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KGB08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KST08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KPR08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KBU09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KGB09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KST09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KPR09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KBU10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KGB10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KST10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KPR10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KBU11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KGB11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KST11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KPR11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KBU12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KGB12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KST12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KPR12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KBU13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KGB13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KST13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KPR13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KBU14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KGB14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KST14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KPR14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KBU15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KGB15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KST15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KPR15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KBU16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KGB16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KST16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KPR16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KBU17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KGB17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KST17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KPR17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KBU18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KGB18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KST18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KPR18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KBU19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KGB19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KST19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KPR19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KBU20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KGB20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KST20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KPR20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KBU21" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KGB21" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KST21" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KPR21" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KBU22" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KGB22" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KST22" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KPR22" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KBU23" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KGB23" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KST23" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KPR23" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KBU24" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KGB24" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KST24" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KPR24" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KBU25" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KGB25" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KST25" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KPR25" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FCT01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FCD01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FCT02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FCD02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FCT03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FCD03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FCT04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FCD04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FCT05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FCD05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FCT06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FCD06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FCT07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FCD07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FCT08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FCD08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AUF01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AUF02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AUF03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AUF04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AUF05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AUF06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AUF07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="E1Q0027" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PERNR" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="INFTY" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SUBTY" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OBJPS" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SPRPS" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ENDDA" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BEGDA" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SEQNR" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AUF08" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="12"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AUF09" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="12"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AUF10" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="12"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AUF11" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="12"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AUF12" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="12"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AUF13" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="12"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AUF14" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="12"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AUF15" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="12"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AUF16" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="12"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AUF17" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="12"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AUF18" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="12"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AUF19" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="12"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AUF20" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="12"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AUF21" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="12"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AUF22" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="12"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AUF23" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="12"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AUF24" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="12"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AUF25" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="12"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PSP01" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="24"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PSP02" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="24"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PSP03" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="24"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PSP04" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="24"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PSP05" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="24"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PSP06" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="24"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PSP07" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="24"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PSP08" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="24"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PSP09" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="24"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PSP10" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="24"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PSP11" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="24"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PSP12" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="24"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PSP13" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="24"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PSP14" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="24"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PSP15" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="24"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PSP16" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="24"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PSP17" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="24"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PSP18" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="24"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PSP19" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="24"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PSP20" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="24"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PSP21" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="24"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PSP22" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="24"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PSP23" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="24"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PSP24" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="24"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PSP25" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="24"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FKBER01" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="16"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="GRANT01" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="20"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FKBER02" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="16"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="GRANT02" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="20"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FKBER03" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="16"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="GRANT03" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="20"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FKBER04" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="16"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="GRANT04" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="20"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="E1R0027" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PERNR" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="8"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="INFTY" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="4"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="SUBTY" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="4"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="OBJPS" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="2"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="SPRPS" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="1"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ENDDA" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="8"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="BEGDA" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="8"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="SEQNR" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="3"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="FKBER05" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="16"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="GRANT05" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="20"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="FKBER06" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="16"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="GRANT06" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="20"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="FKBER07" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="16"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="GRANT07" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="20"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="FKBER08" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="16"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="GRANT08" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="20"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="FKBER09" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="16"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="GRANT09" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="20"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="FKBER10" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="16"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="GRANT10" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="20"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="FKBER11" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="16"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="GRANT11" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="20"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="FKBER12" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="16"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="GRANT12" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="20"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="FCT09" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="16"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="FCD09" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="FCT10" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="16"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="FCD10" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="FCT11" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="16"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="FCD11" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="FCT12" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="16"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="FCD12" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="GRPVL" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="4"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="SGM01" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="SGM02" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="SGM03" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="SGM04" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="SGM05" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="SGM06" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="SGM07" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="SGM08" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="SGM09" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="SGM10" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="SGM11" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="SGM12" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="BUDGET_PD01" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="BUDGET_PD02" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="BUDGET_PD03" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="BUDGET_PD04" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="BUDGET_PD05" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="BUDGET_PD06" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="BUDGET_PD07" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="BUDGET_PD08" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="BUDGET_PD09" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="BUDGET_PD10" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="BUDGET_PD11" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="BUDGET_PD12" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="SEGMENT" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="1"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="SEGMENT" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="1"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
    "kstar",
    "kbu01",
    "kgb01",
    "kst01",
    "kpr01",
    "kbu02",
    "kgb02",
    "kst02",
    "kpr02",
    "kbu03",
    "kgb03",
    "kst03",
    "kpr03",
    "kbu04",
    "kgb04",
    "kst04",
    "kpr04",
    "kbu05",
    "kgb05",
    "kst05",
    "kpr05",
    "kbu06",
    "kgb06",
    "kst06",
    "kpr06",
    "kbu07",
    "kgb07",
    "kst07",
    "kpr07",
    "kbu08",
    "kgb08",
    "kst08",
    "kpr08",
    "kbu09",
    "kgb09",
    "kst09",
    "kpr09",
    "kbu10",
    "kgb10",
    "kst10",
    "kpr10",
    "kbu11",
    "kgb11",
    "kst11",
    "kpr11",
    "kbu12",
    "kgb12",
    "kst12",
    "kpr12",
    "kbu13",
    "kgb13",
    "kst13",
    "kpr13",
    "kbu14",
    "kgb14",
    "kst14",
    "kpr14",
    "kbu15",
    "kgb15",
    "kst15",
    "kpr15",
    "kbu16",
    "kgb16",
    "kst16",
    "kpr16",
    "kbu17",
    "kgb17",
    "kst17",
    "kpr17",
    "kbu18",
    "kgb18",
    "kst18",
    "kpr18",
    "kbu19",
    "kgb19",
    "kst19",
    "kpr19",
    "kbu20",
    "kgb20",
    "kst20",
    "kpr20",
    "kbu21",
    "kgb21",
    "kst21",
    "kpr21",
    "kbu22",
    "kgb22",
    "kst22",
    "kpr22",
    "kbu23",
    "kgb23",
    "kst23",
    "kpr23",
    "kbu24",
    "kgb24",
    "kst24",
    "kpr24",
    "kbu25",
    "kgb25",
    "kst25",
    "kpr25",
    "fct01",
    "fcd01",
    "fct02",
    "fcd02",
    "fct03",
    "fcd03",
    "fct04",
    "fcd04",
    "fct05",
    "fcd05",
    "fct06",
    "fcd06",
    "fct07",
    "fcd07",
    "fct08",
    "fcd08",
    "auf01",
    "auf02",
    "auf03",
    "auf04",
    "auf05",
    "auf06",
    "auf07",
    "e1Q0027"
})
public class E1P0027 {

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
    @XmlElement(name = "KSTAR")
    protected String kstar;
    @XmlElement(name = "KBU01")
    protected String kbu01;
    @XmlElement(name = "KGB01")
    protected String kgb01;
    @XmlElement(name = "KST01")
    protected String kst01;
    @XmlElement(name = "KPR01")
    protected String kpr01;
    @XmlElement(name = "KBU02")
    protected String kbu02;
    @XmlElement(name = "KGB02")
    protected String kgb02;
    @XmlElement(name = "KST02")
    protected String kst02;
    @XmlElement(name = "KPR02")
    protected String kpr02;
    @XmlElement(name = "KBU03")
    protected String kbu03;
    @XmlElement(name = "KGB03")
    protected String kgb03;
    @XmlElement(name = "KST03")
    protected String kst03;
    @XmlElement(name = "KPR03")
    protected String kpr03;
    @XmlElement(name = "KBU04")
    protected String kbu04;
    @XmlElement(name = "KGB04")
    protected String kgb04;
    @XmlElement(name = "KST04")
    protected String kst04;
    @XmlElement(name = "KPR04")
    protected String kpr04;
    @XmlElement(name = "KBU05")
    protected String kbu05;
    @XmlElement(name = "KGB05")
    protected String kgb05;
    @XmlElement(name = "KST05")
    protected String kst05;
    @XmlElement(name = "KPR05")
    protected String kpr05;
    @XmlElement(name = "KBU06")
    protected String kbu06;
    @XmlElement(name = "KGB06")
    protected String kgb06;
    @XmlElement(name = "KST06")
    protected String kst06;
    @XmlElement(name = "KPR06")
    protected String kpr06;
    @XmlElement(name = "KBU07")
    protected String kbu07;
    @XmlElement(name = "KGB07")
    protected String kgb07;
    @XmlElement(name = "KST07")
    protected String kst07;
    @XmlElement(name = "KPR07")
    protected String kpr07;
    @XmlElement(name = "KBU08")
    protected String kbu08;
    @XmlElement(name = "KGB08")
    protected String kgb08;
    @XmlElement(name = "KST08")
    protected String kst08;
    @XmlElement(name = "KPR08")
    protected String kpr08;
    @XmlElement(name = "KBU09")
    protected String kbu09;
    @XmlElement(name = "KGB09")
    protected String kgb09;
    @XmlElement(name = "KST09")
    protected String kst09;
    @XmlElement(name = "KPR09")
    protected String kpr09;
    @XmlElement(name = "KBU10")
    protected String kbu10;
    @XmlElement(name = "KGB10")
    protected String kgb10;
    @XmlElement(name = "KST10")
    protected String kst10;
    @XmlElement(name = "KPR10")
    protected String kpr10;
    @XmlElement(name = "KBU11")
    protected String kbu11;
    @XmlElement(name = "KGB11")
    protected String kgb11;
    @XmlElement(name = "KST11")
    protected String kst11;
    @XmlElement(name = "KPR11")
    protected String kpr11;
    @XmlElement(name = "KBU12")
    protected String kbu12;
    @XmlElement(name = "KGB12")
    protected String kgb12;
    @XmlElement(name = "KST12")
    protected String kst12;
    @XmlElement(name = "KPR12")
    protected String kpr12;
    @XmlElement(name = "KBU13")
    protected String kbu13;
    @XmlElement(name = "KGB13")
    protected String kgb13;
    @XmlElement(name = "KST13")
    protected String kst13;
    @XmlElement(name = "KPR13")
    protected String kpr13;
    @XmlElement(name = "KBU14")
    protected String kbu14;
    @XmlElement(name = "KGB14")
    protected String kgb14;
    @XmlElement(name = "KST14")
    protected String kst14;
    @XmlElement(name = "KPR14")
    protected String kpr14;
    @XmlElement(name = "KBU15")
    protected String kbu15;
    @XmlElement(name = "KGB15")
    protected String kgb15;
    @XmlElement(name = "KST15")
    protected String kst15;
    @XmlElement(name = "KPR15")
    protected String kpr15;
    @XmlElement(name = "KBU16")
    protected String kbu16;
    @XmlElement(name = "KGB16")
    protected String kgb16;
    @XmlElement(name = "KST16")
    protected String kst16;
    @XmlElement(name = "KPR16")
    protected String kpr16;
    @XmlElement(name = "KBU17")
    protected String kbu17;
    @XmlElement(name = "KGB17")
    protected String kgb17;
    @XmlElement(name = "KST17")
    protected String kst17;
    @XmlElement(name = "KPR17")
    protected String kpr17;
    @XmlElement(name = "KBU18")
    protected String kbu18;
    @XmlElement(name = "KGB18")
    protected String kgb18;
    @XmlElement(name = "KST18")
    protected String kst18;
    @XmlElement(name = "KPR18")
    protected String kpr18;
    @XmlElement(name = "KBU19")
    protected String kbu19;
    @XmlElement(name = "KGB19")
    protected String kgb19;
    @XmlElement(name = "KST19")
    protected String kst19;
    @XmlElement(name = "KPR19")
    protected String kpr19;
    @XmlElement(name = "KBU20")
    protected String kbu20;
    @XmlElement(name = "KGB20")
    protected String kgb20;
    @XmlElement(name = "KST20")
    protected String kst20;
    @XmlElement(name = "KPR20")
    protected String kpr20;
    @XmlElement(name = "KBU21")
    protected String kbu21;
    @XmlElement(name = "KGB21")
    protected String kgb21;
    @XmlElement(name = "KST21")
    protected String kst21;
    @XmlElement(name = "KPR21")
    protected String kpr21;
    @XmlElement(name = "KBU22")
    protected String kbu22;
    @XmlElement(name = "KGB22")
    protected String kgb22;
    @XmlElement(name = "KST22")
    protected String kst22;
    @XmlElement(name = "KPR22")
    protected String kpr22;
    @XmlElement(name = "KBU23")
    protected String kbu23;
    @XmlElement(name = "KGB23")
    protected String kgb23;
    @XmlElement(name = "KST23")
    protected String kst23;
    @XmlElement(name = "KPR23")
    protected String kpr23;
    @XmlElement(name = "KBU24")
    protected String kbu24;
    @XmlElement(name = "KGB24")
    protected String kgb24;
    @XmlElement(name = "KST24")
    protected String kst24;
    @XmlElement(name = "KPR24")
    protected String kpr24;
    @XmlElement(name = "KBU25")
    protected String kbu25;
    @XmlElement(name = "KGB25")
    protected String kgb25;
    @XmlElement(name = "KST25")
    protected String kst25;
    @XmlElement(name = "KPR25")
    protected String kpr25;
    @XmlElement(name = "FCT01")
    protected String fct01;
    @XmlElement(name = "FCD01")
    protected String fcd01;
    @XmlElement(name = "FCT02")
    protected String fct02;
    @XmlElement(name = "FCD02")
    protected String fcd02;
    @XmlElement(name = "FCT03")
    protected String fct03;
    @XmlElement(name = "FCD03")
    protected String fcd03;
    @XmlElement(name = "FCT04")
    protected String fct04;
    @XmlElement(name = "FCD04")
    protected String fcd04;
    @XmlElement(name = "FCT05")
    protected String fct05;
    @XmlElement(name = "FCD05")
    protected String fcd05;
    @XmlElement(name = "FCT06")
    protected String fct06;
    @XmlElement(name = "FCD06")
    protected String fcd06;
    @XmlElement(name = "FCT07")
    protected String fct07;
    @XmlElement(name = "FCD07")
    protected String fcd07;
    @XmlElement(name = "FCT08")
    protected String fct08;
    @XmlElement(name = "FCD08")
    protected String fcd08;
    @XmlElement(name = "AUF01")
    protected String auf01;
    @XmlElement(name = "AUF02")
    protected String auf02;
    @XmlElement(name = "AUF03")
    protected String auf03;
    @XmlElement(name = "AUF04")
    protected String auf04;
    @XmlElement(name = "AUF05")
    protected String auf05;
    @XmlElement(name = "AUF06")
    protected String auf06;
    @XmlElement(name = "AUF07")
    protected String auf07;
    @XmlElement(name = "E1Q0027")
    protected E1Q0027 e1Q0027;
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
     * Gets the value of the kstar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKSTAR() {
        return kstar;
    }

    /**
     * Sets the value of the kstar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKSTAR(String value) {
        this.kstar = value;
    }

    /**
     * Gets the value of the kbu01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKBU01() {
        return kbu01;
    }

    /**
     * Sets the value of the kbu01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKBU01(String value) {
        this.kbu01 = value;
    }

    /**
     * Gets the value of the kgb01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKGB01() {
        return kgb01;
    }

    /**
     * Sets the value of the kgb01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKGB01(String value) {
        this.kgb01 = value;
    }

    /**
     * Gets the value of the kst01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKST01() {
        return kst01;
    }

    /**
     * Sets the value of the kst01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKST01(String value) {
        this.kst01 = value;
    }

    /**
     * Gets the value of the kpr01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPR01() {
        return kpr01;
    }

    /**
     * Sets the value of the kpr01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPR01(String value) {
        this.kpr01 = value;
    }

    /**
     * Gets the value of the kbu02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKBU02() {
        return kbu02;
    }

    /**
     * Sets the value of the kbu02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKBU02(String value) {
        this.kbu02 = value;
    }

    /**
     * Gets the value of the kgb02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKGB02() {
        return kgb02;
    }

    /**
     * Sets the value of the kgb02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKGB02(String value) {
        this.kgb02 = value;
    }

    /**
     * Gets the value of the kst02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKST02() {
        return kst02;
    }

    /**
     * Sets the value of the kst02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKST02(String value) {
        this.kst02 = value;
    }

    /**
     * Gets the value of the kpr02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPR02() {
        return kpr02;
    }

    /**
     * Sets the value of the kpr02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPR02(String value) {
        this.kpr02 = value;
    }

    /**
     * Gets the value of the kbu03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKBU03() {
        return kbu03;
    }

    /**
     * Sets the value of the kbu03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKBU03(String value) {
        this.kbu03 = value;
    }

    /**
     * Gets the value of the kgb03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKGB03() {
        return kgb03;
    }

    /**
     * Sets the value of the kgb03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKGB03(String value) {
        this.kgb03 = value;
    }

    /**
     * Gets the value of the kst03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKST03() {
        return kst03;
    }

    /**
     * Sets the value of the kst03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKST03(String value) {
        this.kst03 = value;
    }

    /**
     * Gets the value of the kpr03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPR03() {
        return kpr03;
    }

    /**
     * Sets the value of the kpr03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPR03(String value) {
        this.kpr03 = value;
    }

    /**
     * Gets the value of the kbu04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKBU04() {
        return kbu04;
    }

    /**
     * Sets the value of the kbu04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKBU04(String value) {
        this.kbu04 = value;
    }

    /**
     * Gets the value of the kgb04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKGB04() {
        return kgb04;
    }

    /**
     * Sets the value of the kgb04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKGB04(String value) {
        this.kgb04 = value;
    }

    /**
     * Gets the value of the kst04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKST04() {
        return kst04;
    }

    /**
     * Sets the value of the kst04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKST04(String value) {
        this.kst04 = value;
    }

    /**
     * Gets the value of the kpr04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPR04() {
        return kpr04;
    }

    /**
     * Sets the value of the kpr04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPR04(String value) {
        this.kpr04 = value;
    }

    /**
     * Gets the value of the kbu05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKBU05() {
        return kbu05;
    }

    /**
     * Sets the value of the kbu05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKBU05(String value) {
        this.kbu05 = value;
    }

    /**
     * Gets the value of the kgb05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKGB05() {
        return kgb05;
    }

    /**
     * Sets the value of the kgb05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKGB05(String value) {
        this.kgb05 = value;
    }

    /**
     * Gets the value of the kst05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKST05() {
        return kst05;
    }

    /**
     * Sets the value of the kst05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKST05(String value) {
        this.kst05 = value;
    }

    /**
     * Gets the value of the kpr05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPR05() {
        return kpr05;
    }

    /**
     * Sets the value of the kpr05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPR05(String value) {
        this.kpr05 = value;
    }

    /**
     * Gets the value of the kbu06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKBU06() {
        return kbu06;
    }

    /**
     * Sets the value of the kbu06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKBU06(String value) {
        this.kbu06 = value;
    }

    /**
     * Gets the value of the kgb06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKGB06() {
        return kgb06;
    }

    /**
     * Sets the value of the kgb06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKGB06(String value) {
        this.kgb06 = value;
    }

    /**
     * Gets the value of the kst06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKST06() {
        return kst06;
    }

    /**
     * Sets the value of the kst06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKST06(String value) {
        this.kst06 = value;
    }

    /**
     * Gets the value of the kpr06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPR06() {
        return kpr06;
    }

    /**
     * Sets the value of the kpr06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPR06(String value) {
        this.kpr06 = value;
    }

    /**
     * Gets the value of the kbu07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKBU07() {
        return kbu07;
    }

    /**
     * Sets the value of the kbu07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKBU07(String value) {
        this.kbu07 = value;
    }

    /**
     * Gets the value of the kgb07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKGB07() {
        return kgb07;
    }

    /**
     * Sets the value of the kgb07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKGB07(String value) {
        this.kgb07 = value;
    }

    /**
     * Gets the value of the kst07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKST07() {
        return kst07;
    }

    /**
     * Sets the value of the kst07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKST07(String value) {
        this.kst07 = value;
    }

    /**
     * Gets the value of the kpr07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPR07() {
        return kpr07;
    }

    /**
     * Sets the value of the kpr07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPR07(String value) {
        this.kpr07 = value;
    }

    /**
     * Gets the value of the kbu08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKBU08() {
        return kbu08;
    }

    /**
     * Sets the value of the kbu08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKBU08(String value) {
        this.kbu08 = value;
    }

    /**
     * Gets the value of the kgb08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKGB08() {
        return kgb08;
    }

    /**
     * Sets the value of the kgb08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKGB08(String value) {
        this.kgb08 = value;
    }

    /**
     * Gets the value of the kst08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKST08() {
        return kst08;
    }

    /**
     * Sets the value of the kst08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKST08(String value) {
        this.kst08 = value;
    }

    /**
     * Gets the value of the kpr08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPR08() {
        return kpr08;
    }

    /**
     * Sets the value of the kpr08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPR08(String value) {
        this.kpr08 = value;
    }

    /**
     * Gets the value of the kbu09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKBU09() {
        return kbu09;
    }

    /**
     * Sets the value of the kbu09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKBU09(String value) {
        this.kbu09 = value;
    }

    /**
     * Gets the value of the kgb09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKGB09() {
        return kgb09;
    }

    /**
     * Sets the value of the kgb09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKGB09(String value) {
        this.kgb09 = value;
    }

    /**
     * Gets the value of the kst09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKST09() {
        return kst09;
    }

    /**
     * Sets the value of the kst09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKST09(String value) {
        this.kst09 = value;
    }

    /**
     * Gets the value of the kpr09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPR09() {
        return kpr09;
    }

    /**
     * Sets the value of the kpr09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPR09(String value) {
        this.kpr09 = value;
    }

    /**
     * Gets the value of the kbu10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKBU10() {
        return kbu10;
    }

    /**
     * Sets the value of the kbu10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKBU10(String value) {
        this.kbu10 = value;
    }

    /**
     * Gets the value of the kgb10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKGB10() {
        return kgb10;
    }

    /**
     * Sets the value of the kgb10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKGB10(String value) {
        this.kgb10 = value;
    }

    /**
     * Gets the value of the kst10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKST10() {
        return kst10;
    }

    /**
     * Sets the value of the kst10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKST10(String value) {
        this.kst10 = value;
    }

    /**
     * Gets the value of the kpr10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPR10() {
        return kpr10;
    }

    /**
     * Sets the value of the kpr10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPR10(String value) {
        this.kpr10 = value;
    }

    /**
     * Gets the value of the kbu11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKBU11() {
        return kbu11;
    }

    /**
     * Sets the value of the kbu11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKBU11(String value) {
        this.kbu11 = value;
    }

    /**
     * Gets the value of the kgb11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKGB11() {
        return kgb11;
    }

    /**
     * Sets the value of the kgb11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKGB11(String value) {
        this.kgb11 = value;
    }

    /**
     * Gets the value of the kst11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKST11() {
        return kst11;
    }

    /**
     * Sets the value of the kst11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKST11(String value) {
        this.kst11 = value;
    }

    /**
     * Gets the value of the kpr11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPR11() {
        return kpr11;
    }

    /**
     * Sets the value of the kpr11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPR11(String value) {
        this.kpr11 = value;
    }

    /**
     * Gets the value of the kbu12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKBU12() {
        return kbu12;
    }

    /**
     * Sets the value of the kbu12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKBU12(String value) {
        this.kbu12 = value;
    }

    /**
     * Gets the value of the kgb12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKGB12() {
        return kgb12;
    }

    /**
     * Sets the value of the kgb12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKGB12(String value) {
        this.kgb12 = value;
    }

    /**
     * Gets the value of the kst12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKST12() {
        return kst12;
    }

    /**
     * Sets the value of the kst12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKST12(String value) {
        this.kst12 = value;
    }

    /**
     * Gets the value of the kpr12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPR12() {
        return kpr12;
    }

    /**
     * Sets the value of the kpr12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPR12(String value) {
        this.kpr12 = value;
    }

    /**
     * Gets the value of the kbu13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKBU13() {
        return kbu13;
    }

    /**
     * Sets the value of the kbu13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKBU13(String value) {
        this.kbu13 = value;
    }

    /**
     * Gets the value of the kgb13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKGB13() {
        return kgb13;
    }

    /**
     * Sets the value of the kgb13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKGB13(String value) {
        this.kgb13 = value;
    }

    /**
     * Gets the value of the kst13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKST13() {
        return kst13;
    }

    /**
     * Sets the value of the kst13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKST13(String value) {
        this.kst13 = value;
    }

    /**
     * Gets the value of the kpr13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPR13() {
        return kpr13;
    }

    /**
     * Sets the value of the kpr13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPR13(String value) {
        this.kpr13 = value;
    }

    /**
     * Gets the value of the kbu14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKBU14() {
        return kbu14;
    }

    /**
     * Sets the value of the kbu14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKBU14(String value) {
        this.kbu14 = value;
    }

    /**
     * Gets the value of the kgb14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKGB14() {
        return kgb14;
    }

    /**
     * Sets the value of the kgb14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKGB14(String value) {
        this.kgb14 = value;
    }

    /**
     * Gets the value of the kst14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKST14() {
        return kst14;
    }

    /**
     * Sets the value of the kst14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKST14(String value) {
        this.kst14 = value;
    }

    /**
     * Gets the value of the kpr14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPR14() {
        return kpr14;
    }

    /**
     * Sets the value of the kpr14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPR14(String value) {
        this.kpr14 = value;
    }

    /**
     * Gets the value of the kbu15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKBU15() {
        return kbu15;
    }

    /**
     * Sets the value of the kbu15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKBU15(String value) {
        this.kbu15 = value;
    }

    /**
     * Gets the value of the kgb15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKGB15() {
        return kgb15;
    }

    /**
     * Sets the value of the kgb15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKGB15(String value) {
        this.kgb15 = value;
    }

    /**
     * Gets the value of the kst15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKST15() {
        return kst15;
    }

    /**
     * Sets the value of the kst15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKST15(String value) {
        this.kst15 = value;
    }

    /**
     * Gets the value of the kpr15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPR15() {
        return kpr15;
    }

    /**
     * Sets the value of the kpr15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPR15(String value) {
        this.kpr15 = value;
    }

    /**
     * Gets the value of the kbu16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKBU16() {
        return kbu16;
    }

    /**
     * Sets the value of the kbu16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKBU16(String value) {
        this.kbu16 = value;
    }

    /**
     * Gets the value of the kgb16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKGB16() {
        return kgb16;
    }

    /**
     * Sets the value of the kgb16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKGB16(String value) {
        this.kgb16 = value;
    }

    /**
     * Gets the value of the kst16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKST16() {
        return kst16;
    }

    /**
     * Sets the value of the kst16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKST16(String value) {
        this.kst16 = value;
    }

    /**
     * Gets the value of the kpr16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPR16() {
        return kpr16;
    }

    /**
     * Sets the value of the kpr16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPR16(String value) {
        this.kpr16 = value;
    }

    /**
     * Gets the value of the kbu17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKBU17() {
        return kbu17;
    }

    /**
     * Sets the value of the kbu17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKBU17(String value) {
        this.kbu17 = value;
    }

    /**
     * Gets the value of the kgb17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKGB17() {
        return kgb17;
    }

    /**
     * Sets the value of the kgb17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKGB17(String value) {
        this.kgb17 = value;
    }

    /**
     * Gets the value of the kst17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKST17() {
        return kst17;
    }

    /**
     * Sets the value of the kst17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKST17(String value) {
        this.kst17 = value;
    }

    /**
     * Gets the value of the kpr17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPR17() {
        return kpr17;
    }

    /**
     * Sets the value of the kpr17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPR17(String value) {
        this.kpr17 = value;
    }

    /**
     * Gets the value of the kbu18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKBU18() {
        return kbu18;
    }

    /**
     * Sets the value of the kbu18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKBU18(String value) {
        this.kbu18 = value;
    }

    /**
     * Gets the value of the kgb18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKGB18() {
        return kgb18;
    }

    /**
     * Sets the value of the kgb18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKGB18(String value) {
        this.kgb18 = value;
    }

    /**
     * Gets the value of the kst18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKST18() {
        return kst18;
    }

    /**
     * Sets the value of the kst18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKST18(String value) {
        this.kst18 = value;
    }

    /**
     * Gets the value of the kpr18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPR18() {
        return kpr18;
    }

    /**
     * Sets the value of the kpr18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPR18(String value) {
        this.kpr18 = value;
    }

    /**
     * Gets the value of the kbu19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKBU19() {
        return kbu19;
    }

    /**
     * Sets the value of the kbu19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKBU19(String value) {
        this.kbu19 = value;
    }

    /**
     * Gets the value of the kgb19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKGB19() {
        return kgb19;
    }

    /**
     * Sets the value of the kgb19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKGB19(String value) {
        this.kgb19 = value;
    }

    /**
     * Gets the value of the kst19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKST19() {
        return kst19;
    }

    /**
     * Sets the value of the kst19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKST19(String value) {
        this.kst19 = value;
    }

    /**
     * Gets the value of the kpr19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPR19() {
        return kpr19;
    }

    /**
     * Sets the value of the kpr19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPR19(String value) {
        this.kpr19 = value;
    }

    /**
     * Gets the value of the kbu20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKBU20() {
        return kbu20;
    }

    /**
     * Sets the value of the kbu20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKBU20(String value) {
        this.kbu20 = value;
    }

    /**
     * Gets the value of the kgb20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKGB20() {
        return kgb20;
    }

    /**
     * Sets the value of the kgb20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKGB20(String value) {
        this.kgb20 = value;
    }

    /**
     * Gets the value of the kst20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKST20() {
        return kst20;
    }

    /**
     * Sets the value of the kst20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKST20(String value) {
        this.kst20 = value;
    }

    /**
     * Gets the value of the kpr20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPR20() {
        return kpr20;
    }

    /**
     * Sets the value of the kpr20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPR20(String value) {
        this.kpr20 = value;
    }

    /**
     * Gets the value of the kbu21 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKBU21() {
        return kbu21;
    }

    /**
     * Sets the value of the kbu21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKBU21(String value) {
        this.kbu21 = value;
    }

    /**
     * Gets the value of the kgb21 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKGB21() {
        return kgb21;
    }

    /**
     * Sets the value of the kgb21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKGB21(String value) {
        this.kgb21 = value;
    }

    /**
     * Gets the value of the kst21 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKST21() {
        return kst21;
    }

    /**
     * Sets the value of the kst21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKST21(String value) {
        this.kst21 = value;
    }

    /**
     * Gets the value of the kpr21 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPR21() {
        return kpr21;
    }

    /**
     * Sets the value of the kpr21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPR21(String value) {
        this.kpr21 = value;
    }

    /**
     * Gets the value of the kbu22 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKBU22() {
        return kbu22;
    }

    /**
     * Sets the value of the kbu22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKBU22(String value) {
        this.kbu22 = value;
    }

    /**
     * Gets the value of the kgb22 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKGB22() {
        return kgb22;
    }

    /**
     * Sets the value of the kgb22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKGB22(String value) {
        this.kgb22 = value;
    }

    /**
     * Gets the value of the kst22 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKST22() {
        return kst22;
    }

    /**
     * Sets the value of the kst22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKST22(String value) {
        this.kst22 = value;
    }

    /**
     * Gets the value of the kpr22 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPR22() {
        return kpr22;
    }

    /**
     * Sets the value of the kpr22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPR22(String value) {
        this.kpr22 = value;
    }

    /**
     * Gets the value of the kbu23 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKBU23() {
        return kbu23;
    }

    /**
     * Sets the value of the kbu23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKBU23(String value) {
        this.kbu23 = value;
    }

    /**
     * Gets the value of the kgb23 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKGB23() {
        return kgb23;
    }

    /**
     * Sets the value of the kgb23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKGB23(String value) {
        this.kgb23 = value;
    }

    /**
     * Gets the value of the kst23 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKST23() {
        return kst23;
    }

    /**
     * Sets the value of the kst23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKST23(String value) {
        this.kst23 = value;
    }

    /**
     * Gets the value of the kpr23 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPR23() {
        return kpr23;
    }

    /**
     * Sets the value of the kpr23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPR23(String value) {
        this.kpr23 = value;
    }

    /**
     * Gets the value of the kbu24 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKBU24() {
        return kbu24;
    }

    /**
     * Sets the value of the kbu24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKBU24(String value) {
        this.kbu24 = value;
    }

    /**
     * Gets the value of the kgb24 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKGB24() {
        return kgb24;
    }

    /**
     * Sets the value of the kgb24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKGB24(String value) {
        this.kgb24 = value;
    }

    /**
     * Gets the value of the kst24 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKST24() {
        return kst24;
    }

    /**
     * Sets the value of the kst24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKST24(String value) {
        this.kst24 = value;
    }

    /**
     * Gets the value of the kpr24 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPR24() {
        return kpr24;
    }

    /**
     * Sets the value of the kpr24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPR24(String value) {
        this.kpr24 = value;
    }

    /**
     * Gets the value of the kbu25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKBU25() {
        return kbu25;
    }

    /**
     * Sets the value of the kbu25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKBU25(String value) {
        this.kbu25 = value;
    }

    /**
     * Gets the value of the kgb25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKGB25() {
        return kgb25;
    }

    /**
     * Sets the value of the kgb25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKGB25(String value) {
        this.kgb25 = value;
    }

    /**
     * Gets the value of the kst25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKST25() {
        return kst25;
    }

    /**
     * Sets the value of the kst25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKST25(String value) {
        this.kst25 = value;
    }

    /**
     * Gets the value of the kpr25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPR25() {
        return kpr25;
    }

    /**
     * Sets the value of the kpr25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPR25(String value) {
        this.kpr25 = value;
    }

    /**
     * Gets the value of the fct01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCT01() {
        return fct01;
    }

    /**
     * Sets the value of the fct01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCT01(String value) {
        this.fct01 = value;
    }

    /**
     * Gets the value of the fcd01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCD01() {
        return fcd01;
    }

    /**
     * Sets the value of the fcd01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCD01(String value) {
        this.fcd01 = value;
    }

    /**
     * Gets the value of the fct02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCT02() {
        return fct02;
    }

    /**
     * Sets the value of the fct02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCT02(String value) {
        this.fct02 = value;
    }

    /**
     * Gets the value of the fcd02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCD02() {
        return fcd02;
    }

    /**
     * Sets the value of the fcd02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCD02(String value) {
        this.fcd02 = value;
    }

    /**
     * Gets the value of the fct03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCT03() {
        return fct03;
    }

    /**
     * Sets the value of the fct03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCT03(String value) {
        this.fct03 = value;
    }

    /**
     * Gets the value of the fcd03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCD03() {
        return fcd03;
    }

    /**
     * Sets the value of the fcd03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCD03(String value) {
        this.fcd03 = value;
    }

    /**
     * Gets the value of the fct04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCT04() {
        return fct04;
    }

    /**
     * Sets the value of the fct04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCT04(String value) {
        this.fct04 = value;
    }

    /**
     * Gets the value of the fcd04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCD04() {
        return fcd04;
    }

    /**
     * Sets the value of the fcd04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCD04(String value) {
        this.fcd04 = value;
    }

    /**
     * Gets the value of the fct05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCT05() {
        return fct05;
    }

    /**
     * Sets the value of the fct05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCT05(String value) {
        this.fct05 = value;
    }

    /**
     * Gets the value of the fcd05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCD05() {
        return fcd05;
    }

    /**
     * Sets the value of the fcd05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCD05(String value) {
        this.fcd05 = value;
    }

    /**
     * Gets the value of the fct06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCT06() {
        return fct06;
    }

    /**
     * Sets the value of the fct06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCT06(String value) {
        this.fct06 = value;
    }

    /**
     * Gets the value of the fcd06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCD06() {
        return fcd06;
    }

    /**
     * Sets the value of the fcd06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCD06(String value) {
        this.fcd06 = value;
    }

    /**
     * Gets the value of the fct07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCT07() {
        return fct07;
    }

    /**
     * Sets the value of the fct07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCT07(String value) {
        this.fct07 = value;
    }

    /**
     * Gets the value of the fcd07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCD07() {
        return fcd07;
    }

    /**
     * Sets the value of the fcd07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCD07(String value) {
        this.fcd07 = value;
    }

    /**
     * Gets the value of the fct08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCT08() {
        return fct08;
    }

    /**
     * Sets the value of the fct08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCT08(String value) {
        this.fct08 = value;
    }

    /**
     * Gets the value of the fcd08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCD08() {
        return fcd08;
    }

    /**
     * Sets the value of the fcd08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCD08(String value) {
        this.fcd08 = value;
    }

    /**
     * Gets the value of the auf01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUF01() {
        return auf01;
    }

    /**
     * Sets the value of the auf01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUF01(String value) {
        this.auf01 = value;
    }

    /**
     * Gets the value of the auf02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUF02() {
        return auf02;
    }

    /**
     * Sets the value of the auf02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUF02(String value) {
        this.auf02 = value;
    }

    /**
     * Gets the value of the auf03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUF03() {
        return auf03;
    }

    /**
     * Sets the value of the auf03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUF03(String value) {
        this.auf03 = value;
    }

    /**
     * Gets the value of the auf04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUF04() {
        return auf04;
    }

    /**
     * Sets the value of the auf04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUF04(String value) {
        this.auf04 = value;
    }

    /**
     * Gets the value of the auf05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUF05() {
        return auf05;
    }

    /**
     * Sets the value of the auf05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUF05(String value) {
        this.auf05 = value;
    }

    /**
     * Gets the value of the auf06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUF06() {
        return auf06;
    }

    /**
     * Sets the value of the auf06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUF06(String value) {
        this.auf06 = value;
    }

    /**
     * Gets the value of the auf07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUF07() {
        return auf07;
    }

    /**
     * Sets the value of the auf07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUF07(String value) {
        this.auf07 = value;
    }

    /**
     * Gets the value of the e1Q0027 property.
     * 
     * @return
     *     possible object is
     *     {@link E1Q0027 }
     *     
     */
    public E1Q0027 getE1Q0027() {
        return e1Q0027;
    }

    /**
     * Sets the value of the e1Q0027 property.
     * 
     * @param value
     *     allowed object is
     *     {@link E1Q0027 }
     *     
     */
    public void setE1Q0027(E1Q0027 value) {
        this.e1Q0027 = value;
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
