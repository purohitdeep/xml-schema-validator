
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
 *         &lt;element name="PFDAT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PFSTA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PFEND" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAT3J" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GERBE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AKTZE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PFVOM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DRITT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AKTGL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GLFIR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="26"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GLABT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GLANR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GLTIT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GLVOR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GLNAM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GLSTR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GLLND" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GLPLZ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GLORT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GLTEL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KOKEY" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KOFIR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="26"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KOABT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KOANR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KOTIT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KOVOR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KONAM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KOSTR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KOLND" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KOPLZ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KOORT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KOTEL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PFWAE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GLKEY" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GBKEY" minOccurs="0"&gt;
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
 *         &lt;element name="PFLEG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VERTN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AKTZE2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AKTGL2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
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
    "pfdat",
    "pfsta",
    "pfend",
    "dat3J",
    "gerbe",
    "aktze",
    "pfvom",
    "dritt",
    "aktgl",
    "glfir",
    "glabt",
    "glanr",
    "gltit",
    "glvor",
    "glnam",
    "glstr",
    "gllnd",
    "glplz",
    "glort",
    "gltel",
    "kokey",
    "kofir",
    "koabt",
    "koanr",
    "kotit",
    "kovor",
    "konam",
    "kostr",
    "kolnd",
    "koplz",
    "koort",
    "kotel",
    "pfwae",
    "glkey",
    "gbkey",
    "grpvl",
    "pfleg",
    "vertn",
    "aktze2",
    "aktgl2"
})
public class E1P0131 {

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
    @XmlElement(name = "PFDAT")
    protected String pfdat;
    @XmlElement(name = "PFSTA")
    protected String pfsta;
    @XmlElement(name = "PFEND")
    protected String pfend;
    @XmlElement(name = "DAT3J")
    protected String dat3J;
    @XmlElement(name = "GERBE")
    protected String gerbe;
    @XmlElement(name = "AKTZE")
    protected String aktze;
    @XmlElement(name = "PFVOM")
    protected String pfvom;
    @XmlElement(name = "DRITT")
    protected String dritt;
    @XmlElement(name = "AKTGL")
    protected String aktgl;
    @XmlElement(name = "GLFIR")
    protected String glfir;
    @XmlElement(name = "GLABT")
    protected String glabt;
    @XmlElement(name = "GLANR")
    protected String glanr;
    @XmlElement(name = "GLTIT")
    protected String gltit;
    @XmlElement(name = "GLVOR")
    protected String glvor;
    @XmlElement(name = "GLNAM")
    protected String glnam;
    @XmlElement(name = "GLSTR")
    protected String glstr;
    @XmlElement(name = "GLLND")
    protected String gllnd;
    @XmlElement(name = "GLPLZ")
    protected String glplz;
    @XmlElement(name = "GLORT")
    protected String glort;
    @XmlElement(name = "GLTEL")
    protected String gltel;
    @XmlElement(name = "KOKEY")
    protected String kokey;
    @XmlElement(name = "KOFIR")
    protected String kofir;
    @XmlElement(name = "KOABT")
    protected String koabt;
    @XmlElement(name = "KOANR")
    protected String koanr;
    @XmlElement(name = "KOTIT")
    protected String kotit;
    @XmlElement(name = "KOVOR")
    protected String kovor;
    @XmlElement(name = "KONAM")
    protected String konam;
    @XmlElement(name = "KOSTR")
    protected String kostr;
    @XmlElement(name = "KOLND")
    protected String kolnd;
    @XmlElement(name = "KOPLZ")
    protected String koplz;
    @XmlElement(name = "KOORT")
    protected String koort;
    @XmlElement(name = "KOTEL")
    protected String kotel;
    @XmlElement(name = "PFWAE")
    protected String pfwae;
    @XmlElement(name = "GLKEY")
    protected String glkey;
    @XmlElement(name = "GBKEY")
    protected String gbkey;
    @XmlElement(name = "GRPVL")
    protected String grpvl;
    @XmlElement(name = "PFLEG")
    protected String pfleg;
    @XmlElement(name = "VERTN")
    protected String vertn;
    @XmlElement(name = "AKTZE2")
    protected String aktze2;
    @XmlElement(name = "AKTGL2")
    protected String aktgl2;
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
     * Gets the value of the pfdat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPFDAT() {
        return pfdat;
    }

    /**
     * Sets the value of the pfdat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPFDAT(String value) {
        this.pfdat = value;
    }

    /**
     * Gets the value of the pfsta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPFSTA() {
        return pfsta;
    }

    /**
     * Sets the value of the pfsta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPFSTA(String value) {
        this.pfsta = value;
    }

    /**
     * Gets the value of the pfend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPFEND() {
        return pfend;
    }

    /**
     * Sets the value of the pfend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPFEND(String value) {
        this.pfend = value;
    }

    /**
     * Gets the value of the dat3J property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAT3J() {
        return dat3J;
    }

    /**
     * Sets the value of the dat3J property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAT3J(String value) {
        this.dat3J = value;
    }

    /**
     * Gets the value of the gerbe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGERBE() {
        return gerbe;
    }

    /**
     * Sets the value of the gerbe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGERBE(String value) {
        this.gerbe = value;
    }

    /**
     * Gets the value of the aktze property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAKTZE() {
        return aktze;
    }

    /**
     * Sets the value of the aktze property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAKTZE(String value) {
        this.aktze = value;
    }

    /**
     * Gets the value of the pfvom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPFVOM() {
        return pfvom;
    }

    /**
     * Sets the value of the pfvom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPFVOM(String value) {
        this.pfvom = value;
    }

    /**
     * Gets the value of the dritt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRITT() {
        return dritt;
    }

    /**
     * Sets the value of the dritt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRITT(String value) {
        this.dritt = value;
    }

    /**
     * Gets the value of the aktgl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAKTGL() {
        return aktgl;
    }

    /**
     * Sets the value of the aktgl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAKTGL(String value) {
        this.aktgl = value;
    }

    /**
     * Gets the value of the glfir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLFIR() {
        return glfir;
    }

    /**
     * Sets the value of the glfir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLFIR(String value) {
        this.glfir = value;
    }

    /**
     * Gets the value of the glabt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLABT() {
        return glabt;
    }

    /**
     * Sets the value of the glabt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLABT(String value) {
        this.glabt = value;
    }

    /**
     * Gets the value of the glanr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLANR() {
        return glanr;
    }

    /**
     * Sets the value of the glanr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLANR(String value) {
        this.glanr = value;
    }

    /**
     * Gets the value of the gltit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLTIT() {
        return gltit;
    }

    /**
     * Sets the value of the gltit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLTIT(String value) {
        this.gltit = value;
    }

    /**
     * Gets the value of the glvor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLVOR() {
        return glvor;
    }

    /**
     * Sets the value of the glvor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLVOR(String value) {
        this.glvor = value;
    }

    /**
     * Gets the value of the glnam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLNAM() {
        return glnam;
    }

    /**
     * Sets the value of the glnam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLNAM(String value) {
        this.glnam = value;
    }

    /**
     * Gets the value of the glstr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLSTR() {
        return glstr;
    }

    /**
     * Sets the value of the glstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLSTR(String value) {
        this.glstr = value;
    }

    /**
     * Gets the value of the gllnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLLND() {
        return gllnd;
    }

    /**
     * Sets the value of the gllnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLLND(String value) {
        this.gllnd = value;
    }

    /**
     * Gets the value of the glplz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLPLZ() {
        return glplz;
    }

    /**
     * Sets the value of the glplz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLPLZ(String value) {
        this.glplz = value;
    }

    /**
     * Gets the value of the glort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLORT() {
        return glort;
    }

    /**
     * Sets the value of the glort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLORT(String value) {
        this.glort = value;
    }

    /**
     * Gets the value of the gltel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLTEL() {
        return gltel;
    }

    /**
     * Sets the value of the gltel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLTEL(String value) {
        this.gltel = value;
    }

    /**
     * Gets the value of the kokey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOKEY() {
        return kokey;
    }

    /**
     * Sets the value of the kokey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOKEY(String value) {
        this.kokey = value;
    }

    /**
     * Gets the value of the kofir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOFIR() {
        return kofir;
    }

    /**
     * Sets the value of the kofir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOFIR(String value) {
        this.kofir = value;
    }

    /**
     * Gets the value of the koabt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOABT() {
        return koabt;
    }

    /**
     * Sets the value of the koabt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOABT(String value) {
        this.koabt = value;
    }

    /**
     * Gets the value of the koanr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOANR() {
        return koanr;
    }

    /**
     * Sets the value of the koanr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOANR(String value) {
        this.koanr = value;
    }

    /**
     * Gets the value of the kotit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOTIT() {
        return kotit;
    }

    /**
     * Sets the value of the kotit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOTIT(String value) {
        this.kotit = value;
    }

    /**
     * Gets the value of the kovor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOVOR() {
        return kovor;
    }

    /**
     * Sets the value of the kovor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOVOR(String value) {
        this.kovor = value;
    }

    /**
     * Gets the value of the konam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKONAM() {
        return konam;
    }

    /**
     * Sets the value of the konam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKONAM(String value) {
        this.konam = value;
    }

    /**
     * Gets the value of the kostr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOSTR() {
        return kostr;
    }

    /**
     * Sets the value of the kostr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOSTR(String value) {
        this.kostr = value;
    }

    /**
     * Gets the value of the kolnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOLND() {
        return kolnd;
    }

    /**
     * Sets the value of the kolnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOLND(String value) {
        this.kolnd = value;
    }

    /**
     * Gets the value of the koplz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOPLZ() {
        return koplz;
    }

    /**
     * Sets the value of the koplz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOPLZ(String value) {
        this.koplz = value;
    }

    /**
     * Gets the value of the koort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOORT() {
        return koort;
    }

    /**
     * Sets the value of the koort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOORT(String value) {
        this.koort = value;
    }

    /**
     * Gets the value of the kotel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOTEL() {
        return kotel;
    }

    /**
     * Sets the value of the kotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOTEL(String value) {
        this.kotel = value;
    }

    /**
     * Gets the value of the pfwae property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPFWAE() {
        return pfwae;
    }

    /**
     * Sets the value of the pfwae property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPFWAE(String value) {
        this.pfwae = value;
    }

    /**
     * Gets the value of the glkey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLKEY() {
        return glkey;
    }

    /**
     * Sets the value of the glkey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLKEY(String value) {
        this.glkey = value;
    }

    /**
     * Gets the value of the gbkey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGBKEY() {
        return gbkey;
    }

    /**
     * Sets the value of the gbkey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGBKEY(String value) {
        this.gbkey = value;
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
     * Gets the value of the pfleg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPFLEG() {
        return pfleg;
    }

    /**
     * Sets the value of the pfleg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPFLEG(String value) {
        this.pfleg = value;
    }

    /**
     * Gets the value of the vertn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVERTN() {
        return vertn;
    }

    /**
     * Sets the value of the vertn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVERTN(String value) {
        this.vertn = value;
    }

    /**
     * Gets the value of the aktze2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAKTZE2() {
        return aktze2;
    }

    /**
     * Sets the value of the aktze2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAKTZE2(String value) {
        this.aktze2 = value;
    }

    /**
     * Gets the value of the aktgl2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAKTGL2() {
        return aktgl2;
    }

    /**
     * Sets the value of the aktgl2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAKTGL2(String value) {
        this.aktgl2 = value;
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
