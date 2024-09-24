
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
 *         &lt;element name="KNDNR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KINO1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DPW_1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AARD1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PLKO1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KOOP1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KOWN1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KINO2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DPW_2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AARD2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PLKO2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KOOP2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KOWN2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KINO3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DPW_3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AARD3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PLKO3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KOOP3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KOWN3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KINO4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DPW_4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AARD4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PLKO4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KOOP4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KOWN4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KINO5" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DPW_5" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AARD5" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PLKO5" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KOOP5" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KOWN5" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KINO6" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DPW_6" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AARD6" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PLKO6" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KOOP6" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KOWN6" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KINO7" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DPW_7" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AARD7" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PLKO7" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KOOP7" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KOWN7" minOccurs="0"&gt;
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
 *         &lt;element name="EHDGN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EHBDR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NUCOS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ERCOM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PACOM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CPCOM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
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
    "kndnr",
    "kino1",
    "dpw1",
    "aard1",
    "plko1",
    "koop1",
    "kown1",
    "kino2",
    "dpw2",
    "aard2",
    "plko2",
    "koop2",
    "kown2",
    "kino3",
    "dpw3",
    "aard3",
    "plko3",
    "koop3",
    "kown3",
    "kino4",
    "dpw4",
    "aard4",
    "plko4",
    "koop4",
    "kown4",
    "kino5",
    "dpw5",
    "aard5",
    "plko5",
    "koop5",
    "kown5",
    "kino6",
    "dpw6",
    "aard6",
    "plko6",
    "koop6",
    "kown6",
    "kino7",
    "dpw7",
    "aard7",
    "plko7",
    "koop7",
    "kown7",
    "grpvl",
    "ehdgn",
    "ehbdr",
    "nucos",
    "ercom",
    "pacom",
    "cpcom"
})
public class E1P0525 {

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
    @XmlElement(name = "KNDNR")
    protected String kndnr;
    @XmlElement(name = "KINO1")
    protected String kino1;
    @XmlElement(name = "DPW_1")
    protected String dpw1;
    @XmlElement(name = "AARD1")
    protected String aard1;
    @XmlElement(name = "PLKO1")
    protected String plko1;
    @XmlElement(name = "KOOP1")
    protected String koop1;
    @XmlElement(name = "KOWN1")
    protected String kown1;
    @XmlElement(name = "KINO2")
    protected String kino2;
    @XmlElement(name = "DPW_2")
    protected String dpw2;
    @XmlElement(name = "AARD2")
    protected String aard2;
    @XmlElement(name = "PLKO2")
    protected String plko2;
    @XmlElement(name = "KOOP2")
    protected String koop2;
    @XmlElement(name = "KOWN2")
    protected String kown2;
    @XmlElement(name = "KINO3")
    protected String kino3;
    @XmlElement(name = "DPW_3")
    protected String dpw3;
    @XmlElement(name = "AARD3")
    protected String aard3;
    @XmlElement(name = "PLKO3")
    protected String plko3;
    @XmlElement(name = "KOOP3")
    protected String koop3;
    @XmlElement(name = "KOWN3")
    protected String kown3;
    @XmlElement(name = "KINO4")
    protected String kino4;
    @XmlElement(name = "DPW_4")
    protected String dpw4;
    @XmlElement(name = "AARD4")
    protected String aard4;
    @XmlElement(name = "PLKO4")
    protected String plko4;
    @XmlElement(name = "KOOP4")
    protected String koop4;
    @XmlElement(name = "KOWN4")
    protected String kown4;
    @XmlElement(name = "KINO5")
    protected String kino5;
    @XmlElement(name = "DPW_5")
    protected String dpw5;
    @XmlElement(name = "AARD5")
    protected String aard5;
    @XmlElement(name = "PLKO5")
    protected String plko5;
    @XmlElement(name = "KOOP5")
    protected String koop5;
    @XmlElement(name = "KOWN5")
    protected String kown5;
    @XmlElement(name = "KINO6")
    protected String kino6;
    @XmlElement(name = "DPW_6")
    protected String dpw6;
    @XmlElement(name = "AARD6")
    protected String aard6;
    @XmlElement(name = "PLKO6")
    protected String plko6;
    @XmlElement(name = "KOOP6")
    protected String koop6;
    @XmlElement(name = "KOWN6")
    protected String kown6;
    @XmlElement(name = "KINO7")
    protected String kino7;
    @XmlElement(name = "DPW_7")
    protected String dpw7;
    @XmlElement(name = "AARD7")
    protected String aard7;
    @XmlElement(name = "PLKO7")
    protected String plko7;
    @XmlElement(name = "KOOP7")
    protected String koop7;
    @XmlElement(name = "KOWN7")
    protected String kown7;
    @XmlElement(name = "GRPVL")
    protected String grpvl;
    @XmlElement(name = "EHDGN")
    protected String ehdgn;
    @XmlElement(name = "EHBDR")
    protected String ehbdr;
    @XmlElement(name = "NUCOS")
    protected String nucos;
    @XmlElement(name = "ERCOM")
    protected String ercom;
    @XmlElement(name = "PACOM")
    protected String pacom;
    @XmlElement(name = "CPCOM")
    protected String cpcom;
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
     * Gets the value of the kndnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKNDNR() {
        return kndnr;
    }

    /**
     * Sets the value of the kndnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKNDNR(String value) {
        this.kndnr = value;
    }

    /**
     * Gets the value of the kino1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKINO1() {
        return kino1;
    }

    /**
     * Sets the value of the kino1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKINO1(String value) {
        this.kino1 = value;
    }

    /**
     * Gets the value of the dpw1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPW1() {
        return dpw1;
    }

    /**
     * Sets the value of the dpw1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPW1(String value) {
        this.dpw1 = value;
    }

    /**
     * Gets the value of the aard1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAARD1() {
        return aard1;
    }

    /**
     * Sets the value of the aard1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAARD1(String value) {
        this.aard1 = value;
    }

    /**
     * Gets the value of the plko1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLKO1() {
        return plko1;
    }

    /**
     * Sets the value of the plko1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLKO1(String value) {
        this.plko1 = value;
    }

    /**
     * Gets the value of the koop1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOOP1() {
        return koop1;
    }

    /**
     * Sets the value of the koop1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOOP1(String value) {
        this.koop1 = value;
    }

    /**
     * Gets the value of the kown1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOWN1() {
        return kown1;
    }

    /**
     * Sets the value of the kown1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOWN1(String value) {
        this.kown1 = value;
    }

    /**
     * Gets the value of the kino2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKINO2() {
        return kino2;
    }

    /**
     * Sets the value of the kino2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKINO2(String value) {
        this.kino2 = value;
    }

    /**
     * Gets the value of the dpw2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPW2() {
        return dpw2;
    }

    /**
     * Sets the value of the dpw2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPW2(String value) {
        this.dpw2 = value;
    }

    /**
     * Gets the value of the aard2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAARD2() {
        return aard2;
    }

    /**
     * Sets the value of the aard2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAARD2(String value) {
        this.aard2 = value;
    }

    /**
     * Gets the value of the plko2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLKO2() {
        return plko2;
    }

    /**
     * Sets the value of the plko2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLKO2(String value) {
        this.plko2 = value;
    }

    /**
     * Gets the value of the koop2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOOP2() {
        return koop2;
    }

    /**
     * Sets the value of the koop2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOOP2(String value) {
        this.koop2 = value;
    }

    /**
     * Gets the value of the kown2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOWN2() {
        return kown2;
    }

    /**
     * Sets the value of the kown2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOWN2(String value) {
        this.kown2 = value;
    }

    /**
     * Gets the value of the kino3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKINO3() {
        return kino3;
    }

    /**
     * Sets the value of the kino3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKINO3(String value) {
        this.kino3 = value;
    }

    /**
     * Gets the value of the dpw3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPW3() {
        return dpw3;
    }

    /**
     * Sets the value of the dpw3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPW3(String value) {
        this.dpw3 = value;
    }

    /**
     * Gets the value of the aard3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAARD3() {
        return aard3;
    }

    /**
     * Sets the value of the aard3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAARD3(String value) {
        this.aard3 = value;
    }

    /**
     * Gets the value of the plko3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLKO3() {
        return plko3;
    }

    /**
     * Sets the value of the plko3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLKO3(String value) {
        this.plko3 = value;
    }

    /**
     * Gets the value of the koop3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOOP3() {
        return koop3;
    }

    /**
     * Sets the value of the koop3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOOP3(String value) {
        this.koop3 = value;
    }

    /**
     * Gets the value of the kown3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOWN3() {
        return kown3;
    }

    /**
     * Sets the value of the kown3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOWN3(String value) {
        this.kown3 = value;
    }

    /**
     * Gets the value of the kino4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKINO4() {
        return kino4;
    }

    /**
     * Sets the value of the kino4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKINO4(String value) {
        this.kino4 = value;
    }

    /**
     * Gets the value of the dpw4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPW4() {
        return dpw4;
    }

    /**
     * Sets the value of the dpw4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPW4(String value) {
        this.dpw4 = value;
    }

    /**
     * Gets the value of the aard4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAARD4() {
        return aard4;
    }

    /**
     * Sets the value of the aard4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAARD4(String value) {
        this.aard4 = value;
    }

    /**
     * Gets the value of the plko4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLKO4() {
        return plko4;
    }

    /**
     * Sets the value of the plko4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLKO4(String value) {
        this.plko4 = value;
    }

    /**
     * Gets the value of the koop4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOOP4() {
        return koop4;
    }

    /**
     * Sets the value of the koop4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOOP4(String value) {
        this.koop4 = value;
    }

    /**
     * Gets the value of the kown4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOWN4() {
        return kown4;
    }

    /**
     * Sets the value of the kown4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOWN4(String value) {
        this.kown4 = value;
    }

    /**
     * Gets the value of the kino5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKINO5() {
        return kino5;
    }

    /**
     * Sets the value of the kino5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKINO5(String value) {
        this.kino5 = value;
    }

    /**
     * Gets the value of the dpw5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPW5() {
        return dpw5;
    }

    /**
     * Sets the value of the dpw5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPW5(String value) {
        this.dpw5 = value;
    }

    /**
     * Gets the value of the aard5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAARD5() {
        return aard5;
    }

    /**
     * Sets the value of the aard5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAARD5(String value) {
        this.aard5 = value;
    }

    /**
     * Gets the value of the plko5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLKO5() {
        return plko5;
    }

    /**
     * Sets the value of the plko5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLKO5(String value) {
        this.plko5 = value;
    }

    /**
     * Gets the value of the koop5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOOP5() {
        return koop5;
    }

    /**
     * Sets the value of the koop5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOOP5(String value) {
        this.koop5 = value;
    }

    /**
     * Gets the value of the kown5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOWN5() {
        return kown5;
    }

    /**
     * Sets the value of the kown5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOWN5(String value) {
        this.kown5 = value;
    }

    /**
     * Gets the value of the kino6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKINO6() {
        return kino6;
    }

    /**
     * Sets the value of the kino6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKINO6(String value) {
        this.kino6 = value;
    }

    /**
     * Gets the value of the dpw6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPW6() {
        return dpw6;
    }

    /**
     * Sets the value of the dpw6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPW6(String value) {
        this.dpw6 = value;
    }

    /**
     * Gets the value of the aard6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAARD6() {
        return aard6;
    }

    /**
     * Sets the value of the aard6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAARD6(String value) {
        this.aard6 = value;
    }

    /**
     * Gets the value of the plko6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLKO6() {
        return plko6;
    }

    /**
     * Sets the value of the plko6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLKO6(String value) {
        this.plko6 = value;
    }

    /**
     * Gets the value of the koop6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOOP6() {
        return koop6;
    }

    /**
     * Sets the value of the koop6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOOP6(String value) {
        this.koop6 = value;
    }

    /**
     * Gets the value of the kown6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOWN6() {
        return kown6;
    }

    /**
     * Sets the value of the kown6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOWN6(String value) {
        this.kown6 = value;
    }

    /**
     * Gets the value of the kino7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKINO7() {
        return kino7;
    }

    /**
     * Sets the value of the kino7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKINO7(String value) {
        this.kino7 = value;
    }

    /**
     * Gets the value of the dpw7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPW7() {
        return dpw7;
    }

    /**
     * Sets the value of the dpw7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPW7(String value) {
        this.dpw7 = value;
    }

    /**
     * Gets the value of the aard7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAARD7() {
        return aard7;
    }

    /**
     * Sets the value of the aard7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAARD7(String value) {
        this.aard7 = value;
    }

    /**
     * Gets the value of the plko7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLKO7() {
        return plko7;
    }

    /**
     * Sets the value of the plko7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLKO7(String value) {
        this.plko7 = value;
    }

    /**
     * Gets the value of the koop7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOOP7() {
        return koop7;
    }

    /**
     * Sets the value of the koop7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOOP7(String value) {
        this.koop7 = value;
    }

    /**
     * Gets the value of the kown7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOWN7() {
        return kown7;
    }

    /**
     * Sets the value of the kown7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOWN7(String value) {
        this.kown7 = value;
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
     * Gets the value of the ehdgn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEHDGN() {
        return ehdgn;
    }

    /**
     * Sets the value of the ehdgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEHDGN(String value) {
        this.ehdgn = value;
    }

    /**
     * Gets the value of the ehbdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEHBDR() {
        return ehbdr;
    }

    /**
     * Sets the value of the ehbdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEHBDR(String value) {
        this.ehbdr = value;
    }

    /**
     * Gets the value of the nucos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUCOS() {
        return nucos;
    }

    /**
     * Sets the value of the nucos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUCOS(String value) {
        this.nucos = value;
    }

    /**
     * Gets the value of the ercom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERCOM() {
        return ercom;
    }

    /**
     * Sets the value of the ercom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERCOM(String value) {
        this.ercom = value;
    }

    /**
     * Gets the value of the pacom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPACOM() {
        return pacom;
    }

    /**
     * Sets the value of the pacom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPACOM(String value) {
        this.pacom = value;
    }

    /**
     * Gets the value of the cpcom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPCOM() {
        return cpcom;
    }

    /**
     * Sets the value of the cpcom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPCOM(String value) {
        this.cpcom = value;
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
