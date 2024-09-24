
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
 *         &lt;element name="UNBEV" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GRUND" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNBS0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNBS1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNBS2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNBS3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNBS4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNBS5" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNBS6" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNBS7" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNBS8" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNBS9" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNBN0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNBN1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNBN2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNBN3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNBN4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNBN5" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNBN6" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNBN7" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNBN8" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNBN9" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNBU0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="13"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNBU1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="13"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNBU2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="13"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNBU3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="13"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNBU4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="13"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNBU5" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="13"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNBU6" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="13"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNBU7" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="13"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNBU8" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="13"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNBU9" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="13"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNBE0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="13"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNBE1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="13"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNBE2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="13"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNBE3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="13"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNBE4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="13"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNBE5" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="13"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNBE6" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="13"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNBE7" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="13"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNBE8" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="13"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNBE9" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="13"/&gt;
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
    "unbev",
    "grund",
    "unbs0",
    "unbs1",
    "unbs2",
    "unbs3",
    "unbs4",
    "unbs5",
    "unbs6",
    "unbs7",
    "unbs8",
    "unbs9",
    "unbn0",
    "unbn1",
    "unbn2",
    "unbn3",
    "unbn4",
    "unbn5",
    "unbn6",
    "unbn7",
    "unbn8",
    "unbn9",
    "unbu0",
    "unbu1",
    "unbu2",
    "unbu3",
    "unbu4",
    "unbu5",
    "unbu6",
    "unbu7",
    "unbu8",
    "unbu9",
    "unbe0",
    "unbe1",
    "unbe2",
    "unbe3",
    "unbe4",
    "unbe5",
    "unbe6",
    "unbe7",
    "unbe8",
    "unbe9",
    "grpvl"
})
public class E1P0134 {

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
    @XmlElement(name = "UNBEV")
    protected String unbev;
    @XmlElement(name = "GRUND")
    protected String grund;
    @XmlElement(name = "UNBS0")
    protected String unbs0;
    @XmlElement(name = "UNBS1")
    protected String unbs1;
    @XmlElement(name = "UNBS2")
    protected String unbs2;
    @XmlElement(name = "UNBS3")
    protected String unbs3;
    @XmlElement(name = "UNBS4")
    protected String unbs4;
    @XmlElement(name = "UNBS5")
    protected String unbs5;
    @XmlElement(name = "UNBS6")
    protected String unbs6;
    @XmlElement(name = "UNBS7")
    protected String unbs7;
    @XmlElement(name = "UNBS8")
    protected String unbs8;
    @XmlElement(name = "UNBS9")
    protected String unbs9;
    @XmlElement(name = "UNBN0")
    protected String unbn0;
    @XmlElement(name = "UNBN1")
    protected String unbn1;
    @XmlElement(name = "UNBN2")
    protected String unbn2;
    @XmlElement(name = "UNBN3")
    protected String unbn3;
    @XmlElement(name = "UNBN4")
    protected String unbn4;
    @XmlElement(name = "UNBN5")
    protected String unbn5;
    @XmlElement(name = "UNBN6")
    protected String unbn6;
    @XmlElement(name = "UNBN7")
    protected String unbn7;
    @XmlElement(name = "UNBN8")
    protected String unbn8;
    @XmlElement(name = "UNBN9")
    protected String unbn9;
    @XmlElement(name = "UNBU0")
    protected String unbu0;
    @XmlElement(name = "UNBU1")
    protected String unbu1;
    @XmlElement(name = "UNBU2")
    protected String unbu2;
    @XmlElement(name = "UNBU3")
    protected String unbu3;
    @XmlElement(name = "UNBU4")
    protected String unbu4;
    @XmlElement(name = "UNBU5")
    protected String unbu5;
    @XmlElement(name = "UNBU6")
    protected String unbu6;
    @XmlElement(name = "UNBU7")
    protected String unbu7;
    @XmlElement(name = "UNBU8")
    protected String unbu8;
    @XmlElement(name = "UNBU9")
    protected String unbu9;
    @XmlElement(name = "UNBE0")
    protected String unbe0;
    @XmlElement(name = "UNBE1")
    protected String unbe1;
    @XmlElement(name = "UNBE2")
    protected String unbe2;
    @XmlElement(name = "UNBE3")
    protected String unbe3;
    @XmlElement(name = "UNBE4")
    protected String unbe4;
    @XmlElement(name = "UNBE5")
    protected String unbe5;
    @XmlElement(name = "UNBE6")
    protected String unbe6;
    @XmlElement(name = "UNBE7")
    protected String unbe7;
    @XmlElement(name = "UNBE8")
    protected String unbe8;
    @XmlElement(name = "UNBE9")
    protected String unbe9;
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
     * Gets the value of the unbev property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBEV() {
        return unbev;
    }

    /**
     * Sets the value of the unbev property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBEV(String value) {
        this.unbev = value;
    }

    /**
     * Gets the value of the grund property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRUND() {
        return grund;
    }

    /**
     * Sets the value of the grund property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRUND(String value) {
        this.grund = value;
    }

    /**
     * Gets the value of the unbs0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBS0() {
        return unbs0;
    }

    /**
     * Sets the value of the unbs0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBS0(String value) {
        this.unbs0 = value;
    }

    /**
     * Gets the value of the unbs1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBS1() {
        return unbs1;
    }

    /**
     * Sets the value of the unbs1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBS1(String value) {
        this.unbs1 = value;
    }

    /**
     * Gets the value of the unbs2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBS2() {
        return unbs2;
    }

    /**
     * Sets the value of the unbs2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBS2(String value) {
        this.unbs2 = value;
    }

    /**
     * Gets the value of the unbs3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBS3() {
        return unbs3;
    }

    /**
     * Sets the value of the unbs3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBS3(String value) {
        this.unbs3 = value;
    }

    /**
     * Gets the value of the unbs4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBS4() {
        return unbs4;
    }

    /**
     * Sets the value of the unbs4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBS4(String value) {
        this.unbs4 = value;
    }

    /**
     * Gets the value of the unbs5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBS5() {
        return unbs5;
    }

    /**
     * Sets the value of the unbs5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBS5(String value) {
        this.unbs5 = value;
    }

    /**
     * Gets the value of the unbs6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBS6() {
        return unbs6;
    }

    /**
     * Sets the value of the unbs6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBS6(String value) {
        this.unbs6 = value;
    }

    /**
     * Gets the value of the unbs7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBS7() {
        return unbs7;
    }

    /**
     * Sets the value of the unbs7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBS7(String value) {
        this.unbs7 = value;
    }

    /**
     * Gets the value of the unbs8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBS8() {
        return unbs8;
    }

    /**
     * Sets the value of the unbs8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBS8(String value) {
        this.unbs8 = value;
    }

    /**
     * Gets the value of the unbs9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBS9() {
        return unbs9;
    }

    /**
     * Sets the value of the unbs9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBS9(String value) {
        this.unbs9 = value;
    }

    /**
     * Gets the value of the unbn0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBN0() {
        return unbn0;
    }

    /**
     * Sets the value of the unbn0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBN0(String value) {
        this.unbn0 = value;
    }

    /**
     * Gets the value of the unbn1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBN1() {
        return unbn1;
    }

    /**
     * Sets the value of the unbn1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBN1(String value) {
        this.unbn1 = value;
    }

    /**
     * Gets the value of the unbn2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBN2() {
        return unbn2;
    }

    /**
     * Sets the value of the unbn2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBN2(String value) {
        this.unbn2 = value;
    }

    /**
     * Gets the value of the unbn3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBN3() {
        return unbn3;
    }

    /**
     * Sets the value of the unbn3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBN3(String value) {
        this.unbn3 = value;
    }

    /**
     * Gets the value of the unbn4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBN4() {
        return unbn4;
    }

    /**
     * Sets the value of the unbn4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBN4(String value) {
        this.unbn4 = value;
    }

    /**
     * Gets the value of the unbn5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBN5() {
        return unbn5;
    }

    /**
     * Sets the value of the unbn5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBN5(String value) {
        this.unbn5 = value;
    }

    /**
     * Gets the value of the unbn6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBN6() {
        return unbn6;
    }

    /**
     * Sets the value of the unbn6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBN6(String value) {
        this.unbn6 = value;
    }

    /**
     * Gets the value of the unbn7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBN7() {
        return unbn7;
    }

    /**
     * Sets the value of the unbn7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBN7(String value) {
        this.unbn7 = value;
    }

    /**
     * Gets the value of the unbn8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBN8() {
        return unbn8;
    }

    /**
     * Sets the value of the unbn8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBN8(String value) {
        this.unbn8 = value;
    }

    /**
     * Gets the value of the unbn9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBN9() {
        return unbn9;
    }

    /**
     * Sets the value of the unbn9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBN9(String value) {
        this.unbn9 = value;
    }

    /**
     * Gets the value of the unbu0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBU0() {
        return unbu0;
    }

    /**
     * Sets the value of the unbu0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBU0(String value) {
        this.unbu0 = value;
    }

    /**
     * Gets the value of the unbu1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBU1() {
        return unbu1;
    }

    /**
     * Sets the value of the unbu1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBU1(String value) {
        this.unbu1 = value;
    }

    /**
     * Gets the value of the unbu2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBU2() {
        return unbu2;
    }

    /**
     * Sets the value of the unbu2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBU2(String value) {
        this.unbu2 = value;
    }

    /**
     * Gets the value of the unbu3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBU3() {
        return unbu3;
    }

    /**
     * Sets the value of the unbu3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBU3(String value) {
        this.unbu3 = value;
    }

    /**
     * Gets the value of the unbu4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBU4() {
        return unbu4;
    }

    /**
     * Sets the value of the unbu4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBU4(String value) {
        this.unbu4 = value;
    }

    /**
     * Gets the value of the unbu5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBU5() {
        return unbu5;
    }

    /**
     * Sets the value of the unbu5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBU5(String value) {
        this.unbu5 = value;
    }

    /**
     * Gets the value of the unbu6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBU6() {
        return unbu6;
    }

    /**
     * Sets the value of the unbu6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBU6(String value) {
        this.unbu6 = value;
    }

    /**
     * Gets the value of the unbu7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBU7() {
        return unbu7;
    }

    /**
     * Sets the value of the unbu7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBU7(String value) {
        this.unbu7 = value;
    }

    /**
     * Gets the value of the unbu8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBU8() {
        return unbu8;
    }

    /**
     * Sets the value of the unbu8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBU8(String value) {
        this.unbu8 = value;
    }

    /**
     * Gets the value of the unbu9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBU9() {
        return unbu9;
    }

    /**
     * Sets the value of the unbu9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBU9(String value) {
        this.unbu9 = value;
    }

    /**
     * Gets the value of the unbe0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBE0() {
        return unbe0;
    }

    /**
     * Sets the value of the unbe0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBE0(String value) {
        this.unbe0 = value;
    }

    /**
     * Gets the value of the unbe1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBE1() {
        return unbe1;
    }

    /**
     * Sets the value of the unbe1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBE1(String value) {
        this.unbe1 = value;
    }

    /**
     * Gets the value of the unbe2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBE2() {
        return unbe2;
    }

    /**
     * Sets the value of the unbe2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBE2(String value) {
        this.unbe2 = value;
    }

    /**
     * Gets the value of the unbe3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBE3() {
        return unbe3;
    }

    /**
     * Sets the value of the unbe3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBE3(String value) {
        this.unbe3 = value;
    }

    /**
     * Gets the value of the unbe4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBE4() {
        return unbe4;
    }

    /**
     * Sets the value of the unbe4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBE4(String value) {
        this.unbe4 = value;
    }

    /**
     * Gets the value of the unbe5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBE5() {
        return unbe5;
    }

    /**
     * Sets the value of the unbe5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBE5(String value) {
        this.unbe5 = value;
    }

    /**
     * Gets the value of the unbe6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBE6() {
        return unbe6;
    }

    /**
     * Sets the value of the unbe6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBE6(String value) {
        this.unbe6 = value;
    }

    /**
     * Gets the value of the unbe7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBE7() {
        return unbe7;
    }

    /**
     * Sets the value of the unbe7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBE7(String value) {
        this.unbe7 = value;
    }

    /**
     * Gets the value of the unbe8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBE8() {
        return unbe8;
    }

    /**
     * Sets the value of the unbe8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBE8(String value) {
        this.unbe8 = value;
    }

    /**
     * Gets the value of the unbe9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNBE9() {
        return unbe9;
    }

    /**
     * Sets the value of the unbe9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNBE9(String value) {
        this.unbe9 = value;
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
