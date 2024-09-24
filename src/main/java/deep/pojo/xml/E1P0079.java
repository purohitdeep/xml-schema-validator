
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
 *         &lt;element name="SVART" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BEZ01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KVB01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KVF01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZUS01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SEL01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BES01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SON01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZVB01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BEZ02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KVB02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KVF02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZUS02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SEL02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BES02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SON02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZVB02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BEZ03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KVB03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KVF03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZUS03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SEL03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BES03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SON03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZVB03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BEZ04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KVB04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KVF04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZUS04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SEL04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BES04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SON04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZVB04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BEZ05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KVB05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KVF05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZUS05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SEL05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BES05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SON05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZVB05" minOccurs="0"&gt;
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
    "svart",
    "bez01",
    "kvb01",
    "kvf01",
    "zus01",
    "sel01",
    "bes01",
    "son01",
    "zvb01",
    "bez02",
    "kvb02",
    "kvf02",
    "zus02",
    "sel02",
    "bes02",
    "son02",
    "zvb02",
    "bez03",
    "kvb03",
    "kvf03",
    "zus03",
    "sel03",
    "bes03",
    "son03",
    "zvb03",
    "bez04",
    "kvb04",
    "kvf04",
    "zus04",
    "sel04",
    "bes04",
    "son04",
    "zvb04",
    "bez05",
    "kvb05",
    "kvf05",
    "zus05",
    "sel05",
    "bes05",
    "son05",
    "zvb05",
    "grpvl"
})
public class E1P0079 {

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
    @XmlElement(name = "SVART")
    protected String svart;
    @XmlElement(name = "BEZ01")
    protected String bez01;
    @XmlElement(name = "KVB01")
    protected String kvb01;
    @XmlElement(name = "KVF01")
    protected String kvf01;
    @XmlElement(name = "ZUS01")
    protected String zus01;
    @XmlElement(name = "SEL01")
    protected String sel01;
    @XmlElement(name = "BES01")
    protected String bes01;
    @XmlElement(name = "SON01")
    protected String son01;
    @XmlElement(name = "ZVB01")
    protected String zvb01;
    @XmlElement(name = "BEZ02")
    protected String bez02;
    @XmlElement(name = "KVB02")
    protected String kvb02;
    @XmlElement(name = "KVF02")
    protected String kvf02;
    @XmlElement(name = "ZUS02")
    protected String zus02;
    @XmlElement(name = "SEL02")
    protected String sel02;
    @XmlElement(name = "BES02")
    protected String bes02;
    @XmlElement(name = "SON02")
    protected String son02;
    @XmlElement(name = "ZVB02")
    protected String zvb02;
    @XmlElement(name = "BEZ03")
    protected String bez03;
    @XmlElement(name = "KVB03")
    protected String kvb03;
    @XmlElement(name = "KVF03")
    protected String kvf03;
    @XmlElement(name = "ZUS03")
    protected String zus03;
    @XmlElement(name = "SEL03")
    protected String sel03;
    @XmlElement(name = "BES03")
    protected String bes03;
    @XmlElement(name = "SON03")
    protected String son03;
    @XmlElement(name = "ZVB03")
    protected String zvb03;
    @XmlElement(name = "BEZ04")
    protected String bez04;
    @XmlElement(name = "KVB04")
    protected String kvb04;
    @XmlElement(name = "KVF04")
    protected String kvf04;
    @XmlElement(name = "ZUS04")
    protected String zus04;
    @XmlElement(name = "SEL04")
    protected String sel04;
    @XmlElement(name = "BES04")
    protected String bes04;
    @XmlElement(name = "SON04")
    protected String son04;
    @XmlElement(name = "ZVB04")
    protected String zvb04;
    @XmlElement(name = "BEZ05")
    protected String bez05;
    @XmlElement(name = "KVB05")
    protected String kvb05;
    @XmlElement(name = "KVF05")
    protected String kvf05;
    @XmlElement(name = "ZUS05")
    protected String zus05;
    @XmlElement(name = "SEL05")
    protected String sel05;
    @XmlElement(name = "BES05")
    protected String bes05;
    @XmlElement(name = "SON05")
    protected String son05;
    @XmlElement(name = "ZVB05")
    protected String zvb05;
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
     * Gets the value of the svart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSVART() {
        return svart;
    }

    /**
     * Sets the value of the svart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSVART(String value) {
        this.svart = value;
    }

    /**
     * Gets the value of the bez01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEZ01() {
        return bez01;
    }

    /**
     * Sets the value of the bez01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBEZ01(String value) {
        this.bez01 = value;
    }

    /**
     * Gets the value of the kvb01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKVB01() {
        return kvb01;
    }

    /**
     * Sets the value of the kvb01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKVB01(String value) {
        this.kvb01 = value;
    }

    /**
     * Gets the value of the kvf01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKVF01() {
        return kvf01;
    }

    /**
     * Sets the value of the kvf01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKVF01(String value) {
        this.kvf01 = value;
    }

    /**
     * Gets the value of the zus01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZUS01() {
        return zus01;
    }

    /**
     * Sets the value of the zus01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZUS01(String value) {
        this.zus01 = value;
    }

    /**
     * Gets the value of the sel01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEL01() {
        return sel01;
    }

    /**
     * Sets the value of the sel01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEL01(String value) {
        this.sel01 = value;
    }

    /**
     * Gets the value of the bes01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBES01() {
        return bes01;
    }

    /**
     * Sets the value of the bes01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBES01(String value) {
        this.bes01 = value;
    }

    /**
     * Gets the value of the son01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSON01() {
        return son01;
    }

    /**
     * Sets the value of the son01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSON01(String value) {
        this.son01 = value;
    }

    /**
     * Gets the value of the zvb01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZVB01() {
        return zvb01;
    }

    /**
     * Sets the value of the zvb01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZVB01(String value) {
        this.zvb01 = value;
    }

    /**
     * Gets the value of the bez02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEZ02() {
        return bez02;
    }

    /**
     * Sets the value of the bez02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBEZ02(String value) {
        this.bez02 = value;
    }

    /**
     * Gets the value of the kvb02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKVB02() {
        return kvb02;
    }

    /**
     * Sets the value of the kvb02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKVB02(String value) {
        this.kvb02 = value;
    }

    /**
     * Gets the value of the kvf02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKVF02() {
        return kvf02;
    }

    /**
     * Sets the value of the kvf02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKVF02(String value) {
        this.kvf02 = value;
    }

    /**
     * Gets the value of the zus02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZUS02() {
        return zus02;
    }

    /**
     * Sets the value of the zus02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZUS02(String value) {
        this.zus02 = value;
    }

    /**
     * Gets the value of the sel02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEL02() {
        return sel02;
    }

    /**
     * Sets the value of the sel02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEL02(String value) {
        this.sel02 = value;
    }

    /**
     * Gets the value of the bes02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBES02() {
        return bes02;
    }

    /**
     * Sets the value of the bes02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBES02(String value) {
        this.bes02 = value;
    }

    /**
     * Gets the value of the son02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSON02() {
        return son02;
    }

    /**
     * Sets the value of the son02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSON02(String value) {
        this.son02 = value;
    }

    /**
     * Gets the value of the zvb02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZVB02() {
        return zvb02;
    }

    /**
     * Sets the value of the zvb02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZVB02(String value) {
        this.zvb02 = value;
    }

    /**
     * Gets the value of the bez03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEZ03() {
        return bez03;
    }

    /**
     * Sets the value of the bez03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBEZ03(String value) {
        this.bez03 = value;
    }

    /**
     * Gets the value of the kvb03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKVB03() {
        return kvb03;
    }

    /**
     * Sets the value of the kvb03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKVB03(String value) {
        this.kvb03 = value;
    }

    /**
     * Gets the value of the kvf03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKVF03() {
        return kvf03;
    }

    /**
     * Sets the value of the kvf03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKVF03(String value) {
        this.kvf03 = value;
    }

    /**
     * Gets the value of the zus03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZUS03() {
        return zus03;
    }

    /**
     * Sets the value of the zus03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZUS03(String value) {
        this.zus03 = value;
    }

    /**
     * Gets the value of the sel03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEL03() {
        return sel03;
    }

    /**
     * Sets the value of the sel03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEL03(String value) {
        this.sel03 = value;
    }

    /**
     * Gets the value of the bes03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBES03() {
        return bes03;
    }

    /**
     * Sets the value of the bes03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBES03(String value) {
        this.bes03 = value;
    }

    /**
     * Gets the value of the son03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSON03() {
        return son03;
    }

    /**
     * Sets the value of the son03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSON03(String value) {
        this.son03 = value;
    }

    /**
     * Gets the value of the zvb03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZVB03() {
        return zvb03;
    }

    /**
     * Sets the value of the zvb03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZVB03(String value) {
        this.zvb03 = value;
    }

    /**
     * Gets the value of the bez04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEZ04() {
        return bez04;
    }

    /**
     * Sets the value of the bez04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBEZ04(String value) {
        this.bez04 = value;
    }

    /**
     * Gets the value of the kvb04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKVB04() {
        return kvb04;
    }

    /**
     * Sets the value of the kvb04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKVB04(String value) {
        this.kvb04 = value;
    }

    /**
     * Gets the value of the kvf04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKVF04() {
        return kvf04;
    }

    /**
     * Sets the value of the kvf04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKVF04(String value) {
        this.kvf04 = value;
    }

    /**
     * Gets the value of the zus04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZUS04() {
        return zus04;
    }

    /**
     * Sets the value of the zus04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZUS04(String value) {
        this.zus04 = value;
    }

    /**
     * Gets the value of the sel04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEL04() {
        return sel04;
    }

    /**
     * Sets the value of the sel04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEL04(String value) {
        this.sel04 = value;
    }

    /**
     * Gets the value of the bes04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBES04() {
        return bes04;
    }

    /**
     * Sets the value of the bes04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBES04(String value) {
        this.bes04 = value;
    }

    /**
     * Gets the value of the son04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSON04() {
        return son04;
    }

    /**
     * Sets the value of the son04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSON04(String value) {
        this.son04 = value;
    }

    /**
     * Gets the value of the zvb04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZVB04() {
        return zvb04;
    }

    /**
     * Sets the value of the zvb04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZVB04(String value) {
        this.zvb04 = value;
    }

    /**
     * Gets the value of the bez05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEZ05() {
        return bez05;
    }

    /**
     * Sets the value of the bez05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBEZ05(String value) {
        this.bez05 = value;
    }

    /**
     * Gets the value of the kvb05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKVB05() {
        return kvb05;
    }

    /**
     * Sets the value of the kvb05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKVB05(String value) {
        this.kvb05 = value;
    }

    /**
     * Gets the value of the kvf05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKVF05() {
        return kvf05;
    }

    /**
     * Sets the value of the kvf05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKVF05(String value) {
        this.kvf05 = value;
    }

    /**
     * Gets the value of the zus05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZUS05() {
        return zus05;
    }

    /**
     * Sets the value of the zus05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZUS05(String value) {
        this.zus05 = value;
    }

    /**
     * Gets the value of the sel05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEL05() {
        return sel05;
    }

    /**
     * Sets the value of the sel05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEL05(String value) {
        this.sel05 = value;
    }

    /**
     * Gets the value of the bes05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBES05() {
        return bes05;
    }

    /**
     * Sets the value of the bes05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBES05(String value) {
        this.bes05 = value;
    }

    /**
     * Gets the value of the son05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSON05() {
        return son05;
    }

    /**
     * Sets the value of the son05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSON05(String value) {
        this.son05 = value;
    }

    /**
     * Gets the value of the zvb05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZVB05() {
        return zvb05;
    }

    /**
     * Sets the value of the zvb05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZVB05(String value) {
        this.zvb05 = value;
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
