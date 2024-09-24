
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
 *         &lt;element name="RSZSP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RSZNO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RSZKE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RSZCA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RSZKN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RSZFF" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RSZLM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RSZFS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RSZRR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RSZPN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RSZVW" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RSZGL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RSZBL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RSZNA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RSZWG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RSZLA" minOccurs="0"&gt;
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
 *         &lt;element name="EMPLP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APTYP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RETIR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RSKAC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MODRM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="REDST" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OSSIN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OREDD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ASSIN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CORIG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ALLCD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ALLST" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EERST" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MARBR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OLDRR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CAPEX" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RSZLA_ISO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="STYPE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NMEDT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSPCC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SEREX" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CARME" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SEXSD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TRASI" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PERSM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SECDT" minOccurs="0"&gt;
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
    "rszsp",
    "rszno",
    "rszke",
    "rszca",
    "rszkn",
    "rszff",
    "rszlm",
    "rszfs",
    "rszrr",
    "rszpn",
    "rszvw",
    "rszgl",
    "rszbl",
    "rszna",
    "rszwg",
    "rszla",
    "grpvl",
    "emplp",
    "aptyp",
    "retir",
    "rskac",
    "modrm",
    "redst",
    "ossin",
    "oredd",
    "assin",
    "corig",
    "allcd",
    "allst",
    "eerst",
    "marbr",
    "oldrr",
    "capex",
    "rszlaiso",
    "stype",
    "nmedt",
    "pspcc",
    "serex",
    "carme",
    "sexsd",
    "trasi",
    "persm",
    "secdt"
})
public class E1P0100 {

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
    @XmlElement(name = "RSZSP")
    protected String rszsp;
    @XmlElement(name = "RSZNO")
    protected String rszno;
    @XmlElement(name = "RSZKE")
    protected String rszke;
    @XmlElement(name = "RSZCA")
    protected String rszca;
    @XmlElement(name = "RSZKN")
    protected String rszkn;
    @XmlElement(name = "RSZFF")
    protected String rszff;
    @XmlElement(name = "RSZLM")
    protected String rszlm;
    @XmlElement(name = "RSZFS")
    protected String rszfs;
    @XmlElement(name = "RSZRR")
    protected String rszrr;
    @XmlElement(name = "RSZPN")
    protected String rszpn;
    @XmlElement(name = "RSZVW")
    protected String rszvw;
    @XmlElement(name = "RSZGL")
    protected String rszgl;
    @XmlElement(name = "RSZBL")
    protected String rszbl;
    @XmlElement(name = "RSZNA")
    protected String rszna;
    @XmlElement(name = "RSZWG")
    protected String rszwg;
    @XmlElement(name = "RSZLA")
    protected String rszla;
    @XmlElement(name = "GRPVL")
    protected String grpvl;
    @XmlElement(name = "EMPLP")
    protected String emplp;
    @XmlElement(name = "APTYP")
    protected String aptyp;
    @XmlElement(name = "RETIR")
    protected String retir;
    @XmlElement(name = "RSKAC")
    protected String rskac;
    @XmlElement(name = "MODRM")
    protected String modrm;
    @XmlElement(name = "REDST")
    protected String redst;
    @XmlElement(name = "OSSIN")
    protected String ossin;
    @XmlElement(name = "OREDD")
    protected String oredd;
    @XmlElement(name = "ASSIN")
    protected String assin;
    @XmlElement(name = "CORIG")
    protected String corig;
    @XmlElement(name = "ALLCD")
    protected String allcd;
    @XmlElement(name = "ALLST")
    protected String allst;
    @XmlElement(name = "EERST")
    protected String eerst;
    @XmlElement(name = "MARBR")
    protected String marbr;
    @XmlElement(name = "OLDRR")
    protected String oldrr;
    @XmlElement(name = "CAPEX")
    protected String capex;
    @XmlElement(name = "RSZLA_ISO")
    protected String rszlaiso;
    @XmlElement(name = "STYPE")
    protected String stype;
    @XmlElement(name = "NMEDT")
    protected String nmedt;
    @XmlElement(name = "PSPCC")
    protected String pspcc;
    @XmlElement(name = "SEREX")
    protected String serex;
    @XmlElement(name = "CARME")
    protected String carme;
    @XmlElement(name = "SEXSD")
    protected String sexsd;
    @XmlElement(name = "TRASI")
    protected String trasi;
    @XmlElement(name = "PERSM")
    protected String persm;
    @XmlElement(name = "SECDT")
    protected String secdt;
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
     * Gets the value of the rszsp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSZSP() {
        return rszsp;
    }

    /**
     * Sets the value of the rszsp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSZSP(String value) {
        this.rszsp = value;
    }

    /**
     * Gets the value of the rszno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSZNO() {
        return rszno;
    }

    /**
     * Sets the value of the rszno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSZNO(String value) {
        this.rszno = value;
    }

    /**
     * Gets the value of the rszke property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSZKE() {
        return rszke;
    }

    /**
     * Sets the value of the rszke property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSZKE(String value) {
        this.rszke = value;
    }

    /**
     * Gets the value of the rszca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSZCA() {
        return rszca;
    }

    /**
     * Sets the value of the rszca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSZCA(String value) {
        this.rszca = value;
    }

    /**
     * Gets the value of the rszkn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSZKN() {
        return rszkn;
    }

    /**
     * Sets the value of the rszkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSZKN(String value) {
        this.rszkn = value;
    }

    /**
     * Gets the value of the rszff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSZFF() {
        return rszff;
    }

    /**
     * Sets the value of the rszff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSZFF(String value) {
        this.rszff = value;
    }

    /**
     * Gets the value of the rszlm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSZLM() {
        return rszlm;
    }

    /**
     * Sets the value of the rszlm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSZLM(String value) {
        this.rszlm = value;
    }

    /**
     * Gets the value of the rszfs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSZFS() {
        return rszfs;
    }

    /**
     * Sets the value of the rszfs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSZFS(String value) {
        this.rszfs = value;
    }

    /**
     * Gets the value of the rszrr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSZRR() {
        return rszrr;
    }

    /**
     * Sets the value of the rszrr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSZRR(String value) {
        this.rszrr = value;
    }

    /**
     * Gets the value of the rszpn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSZPN() {
        return rszpn;
    }

    /**
     * Sets the value of the rszpn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSZPN(String value) {
        this.rszpn = value;
    }

    /**
     * Gets the value of the rszvw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSZVW() {
        return rszvw;
    }

    /**
     * Sets the value of the rszvw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSZVW(String value) {
        this.rszvw = value;
    }

    /**
     * Gets the value of the rszgl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSZGL() {
        return rszgl;
    }

    /**
     * Sets the value of the rszgl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSZGL(String value) {
        this.rszgl = value;
    }

    /**
     * Gets the value of the rszbl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSZBL() {
        return rszbl;
    }

    /**
     * Sets the value of the rszbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSZBL(String value) {
        this.rszbl = value;
    }

    /**
     * Gets the value of the rszna property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSZNA() {
        return rszna;
    }

    /**
     * Sets the value of the rszna property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSZNA(String value) {
        this.rszna = value;
    }

    /**
     * Gets the value of the rszwg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSZWG() {
        return rszwg;
    }

    /**
     * Sets the value of the rszwg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSZWG(String value) {
        this.rszwg = value;
    }

    /**
     * Gets the value of the rszla property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSZLA() {
        return rszla;
    }

    /**
     * Sets the value of the rszla property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSZLA(String value) {
        this.rszla = value;
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
     * Gets the value of the emplp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPLP() {
        return emplp;
    }

    /**
     * Sets the value of the emplp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPLP(String value) {
        this.emplp = value;
    }

    /**
     * Gets the value of the aptyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPTYP() {
        return aptyp;
    }

    /**
     * Sets the value of the aptyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPTYP(String value) {
        this.aptyp = value;
    }

    /**
     * Gets the value of the retir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRETIR() {
        return retir;
    }

    /**
     * Sets the value of the retir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRETIR(String value) {
        this.retir = value;
    }

    /**
     * Gets the value of the rskac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSKAC() {
        return rskac;
    }

    /**
     * Sets the value of the rskac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSKAC(String value) {
        this.rskac = value;
    }

    /**
     * Gets the value of the modrm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMODRM() {
        return modrm;
    }

    /**
     * Sets the value of the modrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMODRM(String value) {
        this.modrm = value;
    }

    /**
     * Gets the value of the redst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREDST() {
        return redst;
    }

    /**
     * Sets the value of the redst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREDST(String value) {
        this.redst = value;
    }

    /**
     * Gets the value of the ossin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOSSIN() {
        return ossin;
    }

    /**
     * Sets the value of the ossin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOSSIN(String value) {
        this.ossin = value;
    }

    /**
     * Gets the value of the oredd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOREDD() {
        return oredd;
    }

    /**
     * Sets the value of the oredd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOREDD(String value) {
        this.oredd = value;
    }

    /**
     * Gets the value of the assin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASSIN() {
        return assin;
    }

    /**
     * Sets the value of the assin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASSIN(String value) {
        this.assin = value;
    }

    /**
     * Gets the value of the corig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCORIG() {
        return corig;
    }

    /**
     * Sets the value of the corig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCORIG(String value) {
        this.corig = value;
    }

    /**
     * Gets the value of the allcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALLCD() {
        return allcd;
    }

    /**
     * Sets the value of the allcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALLCD(String value) {
        this.allcd = value;
    }

    /**
     * Gets the value of the allst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALLST() {
        return allst;
    }

    /**
     * Sets the value of the allst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALLST(String value) {
        this.allst = value;
    }

    /**
     * Gets the value of the eerst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEERST() {
        return eerst;
    }

    /**
     * Sets the value of the eerst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEERST(String value) {
        this.eerst = value;
    }

    /**
     * Gets the value of the marbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMARBR() {
        return marbr;
    }

    /**
     * Sets the value of the marbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMARBR(String value) {
        this.marbr = value;
    }

    /**
     * Gets the value of the oldrr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOLDRR() {
        return oldrr;
    }

    /**
     * Sets the value of the oldrr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOLDRR(String value) {
        this.oldrr = value;
    }

    /**
     * Gets the value of the capex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAPEX() {
        return capex;
    }

    /**
     * Sets the value of the capex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAPEX(String value) {
        this.capex = value;
    }

    /**
     * Gets the value of the rszlaiso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSZLAISO() {
        return rszlaiso;
    }

    /**
     * Sets the value of the rszlaiso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSZLAISO(String value) {
        this.rszlaiso = value;
    }

    /**
     * Gets the value of the stype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTYPE() {
        return stype;
    }

    /**
     * Sets the value of the stype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTYPE(String value) {
        this.stype = value;
    }

    /**
     * Gets the value of the nmedt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMEDT() {
        return nmedt;
    }

    /**
     * Sets the value of the nmedt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMEDT(String value) {
        this.nmedt = value;
    }

    /**
     * Gets the value of the pspcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSPCC() {
        return pspcc;
    }

    /**
     * Sets the value of the pspcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSPCC(String value) {
        this.pspcc = value;
    }

    /**
     * Gets the value of the serex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEREX() {
        return serex;
    }

    /**
     * Sets the value of the serex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEREX(String value) {
        this.serex = value;
    }

    /**
     * Gets the value of the carme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARME() {
        return carme;
    }

    /**
     * Sets the value of the carme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARME(String value) {
        this.carme = value;
    }

    /**
     * Gets the value of the sexsd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEXSD() {
        return sexsd;
    }

    /**
     * Sets the value of the sexsd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEXSD(String value) {
        this.sexsd = value;
    }

    /**
     * Gets the value of the trasi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRASI() {
        return trasi;
    }

    /**
     * Sets the value of the trasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRASI(String value) {
        this.trasi = value;
    }

    /**
     * Gets the value of the persm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERSM() {
        return persm;
    }

    /**
     * Sets the value of the persm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERSM(String value) {
        this.persm = value;
    }

    /**
     * Gets the value of the secdt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSECDT() {
        return secdt;
    }

    /**
     * Sets the value of the secdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSECDT(String value) {
        this.secdt = value;
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
