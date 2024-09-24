
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
 *         &lt;element name="MANDT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PLVAR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OTYPE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OBJID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
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
 *         &lt;element name="ISTAT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRIOX" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
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
 *         &lt;element name="ENDDA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VARYF" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SEQNR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
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
 *         &lt;element name="REASN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
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
 *         &lt;element name="ITXNR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KOBES" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRDIR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRICE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="17"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WAERS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BUNIT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BZGME" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KOBES001" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRDIR001" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRICE001" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="17"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WAERS001" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BUNIT001" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BZGME001" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KOBES002" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRDIR002" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRICE002" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="17"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WAERS002" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BUNIT002" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BZGME002" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KOBES003" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRDIR003" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRICE003" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="17"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WAERS003" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BUNIT003" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BZGME003" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KOBES004" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRDIR004" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRICE004" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="17"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WAERS004" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BUNIT004" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BZGME004" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KOBES005" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRDIR005" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRICE005" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="17"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WAERS005" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BUNIT005" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BZGME005" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KOBES006" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRDIR006" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRICE006" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="17"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WAERS006" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BUNIT006" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BZGME006" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KOBES007" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRDIR007" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRICE007" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="17"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WAERS007" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BUNIT007" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BZGME007" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KOBES008" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRDIR008" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRICE008" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="17"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WAERS008" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BUNIT008" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BZGME008" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
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
    "mandt",
    "plvar",
    "otype",
    "objid",
    "infty",
    "subty",
    "istat",
    "priox",
    "begda",
    "endda",
    "varyf",
    "seqnr",
    "aedtm",
    "uname",
    "reasn",
    "histo",
    "itxnr",
    "kobes",
    "prdir",
    "price",
    "waers",
    "bunit",
    "bzgme",
    "kobes001",
    "prdir001",
    "price001",
    "waers001",
    "bunit001",
    "bzgme001",
    "kobes002",
    "prdir002",
    "price002",
    "waers002",
    "bunit002",
    "bzgme002",
    "kobes003",
    "prdir003",
    "price003",
    "waers003",
    "bunit003",
    "bzgme003",
    "kobes004",
    "prdir004",
    "price004",
    "waers004",
    "bunit004",
    "bzgme004",
    "kobes005",
    "prdir005",
    "price005",
    "waers005",
    "bunit005",
    "bzgme005",
    "kobes006",
    "prdir006",
    "price006",
    "waers006",
    "bunit006",
    "bzgme006",
    "kobes007",
    "prdir007",
    "price007",
    "waers007",
    "bunit007",
    "bzgme007",
    "kobes008",
    "prdir008",
    "price008",
    "waers008",
    "bunit008",
    "bzgme008"
})
public class E1P1036 {

    @XmlElement(name = "MANDT")
    protected String mandt;
    @XmlElement(name = "PLVAR")
    protected String plvar;
    @XmlElement(name = "OTYPE")
    protected String otype;
    @XmlElement(name = "OBJID")
    protected String objid;
    @XmlElement(name = "INFTY")
    protected String infty;
    @XmlElement(name = "SUBTY")
    protected String subty;
    @XmlElement(name = "ISTAT")
    protected String istat;
    @XmlElement(name = "PRIOX")
    protected String priox;
    @XmlElement(name = "BEGDA")
    protected String begda;
    @XmlElement(name = "ENDDA")
    protected String endda;
    @XmlElement(name = "VARYF")
    protected String varyf;
    @XmlElement(name = "SEQNR")
    protected String seqnr;
    @XmlElement(name = "AEDTM")
    protected String aedtm;
    @XmlElement(name = "UNAME")
    protected String uname;
    @XmlElement(name = "REASN")
    protected String reasn;
    @XmlElement(name = "HISTO")
    protected String histo;
    @XmlElement(name = "ITXNR")
    protected String itxnr;
    @XmlElement(name = "KOBES")
    protected String kobes;
    @XmlElement(name = "PRDIR")
    protected String prdir;
    @XmlElement(name = "PRICE")
    protected String price;
    @XmlElement(name = "WAERS")
    protected String waers;
    @XmlElement(name = "BUNIT")
    protected String bunit;
    @XmlElement(name = "BZGME")
    protected String bzgme;
    @XmlElement(name = "KOBES001")
    protected String kobes001;
    @XmlElement(name = "PRDIR001")
    protected String prdir001;
    @XmlElement(name = "PRICE001")
    protected String price001;
    @XmlElement(name = "WAERS001")
    protected String waers001;
    @XmlElement(name = "BUNIT001")
    protected String bunit001;
    @XmlElement(name = "BZGME001")
    protected String bzgme001;
    @XmlElement(name = "KOBES002")
    protected String kobes002;
    @XmlElement(name = "PRDIR002")
    protected String prdir002;
    @XmlElement(name = "PRICE002")
    protected String price002;
    @XmlElement(name = "WAERS002")
    protected String waers002;
    @XmlElement(name = "BUNIT002")
    protected String bunit002;
    @XmlElement(name = "BZGME002")
    protected String bzgme002;
    @XmlElement(name = "KOBES003")
    protected String kobes003;
    @XmlElement(name = "PRDIR003")
    protected String prdir003;
    @XmlElement(name = "PRICE003")
    protected String price003;
    @XmlElement(name = "WAERS003")
    protected String waers003;
    @XmlElement(name = "BUNIT003")
    protected String bunit003;
    @XmlElement(name = "BZGME003")
    protected String bzgme003;
    @XmlElement(name = "KOBES004")
    protected String kobes004;
    @XmlElement(name = "PRDIR004")
    protected String prdir004;
    @XmlElement(name = "PRICE004")
    protected String price004;
    @XmlElement(name = "WAERS004")
    protected String waers004;
    @XmlElement(name = "BUNIT004")
    protected String bunit004;
    @XmlElement(name = "BZGME004")
    protected String bzgme004;
    @XmlElement(name = "KOBES005")
    protected String kobes005;
    @XmlElement(name = "PRDIR005")
    protected String prdir005;
    @XmlElement(name = "PRICE005")
    protected String price005;
    @XmlElement(name = "WAERS005")
    protected String waers005;
    @XmlElement(name = "BUNIT005")
    protected String bunit005;
    @XmlElement(name = "BZGME005")
    protected String bzgme005;
    @XmlElement(name = "KOBES006")
    protected String kobes006;
    @XmlElement(name = "PRDIR006")
    protected String prdir006;
    @XmlElement(name = "PRICE006")
    protected String price006;
    @XmlElement(name = "WAERS006")
    protected String waers006;
    @XmlElement(name = "BUNIT006")
    protected String bunit006;
    @XmlElement(name = "BZGME006")
    protected String bzgme006;
    @XmlElement(name = "KOBES007")
    protected String kobes007;
    @XmlElement(name = "PRDIR007")
    protected String prdir007;
    @XmlElement(name = "PRICE007")
    protected String price007;
    @XmlElement(name = "WAERS007")
    protected String waers007;
    @XmlElement(name = "BUNIT007")
    protected String bunit007;
    @XmlElement(name = "BZGME007")
    protected String bzgme007;
    @XmlElement(name = "KOBES008")
    protected String kobes008;
    @XmlElement(name = "PRDIR008")
    protected String prdir008;
    @XmlElement(name = "PRICE008")
    protected String price008;
    @XmlElement(name = "WAERS008")
    protected String waers008;
    @XmlElement(name = "BUNIT008")
    protected String bunit008;
    @XmlElement(name = "BZGME008")
    protected String bzgme008;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Gets the value of the mandt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMANDT() {
        return mandt;
    }

    /**
     * Sets the value of the mandt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMANDT(String value) {
        this.mandt = value;
    }

    /**
     * Gets the value of the plvar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLVAR() {
        return plvar;
    }

    /**
     * Sets the value of the plvar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLVAR(String value) {
        this.plvar = value;
    }

    /**
     * Gets the value of the otype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTYPE() {
        return otype;
    }

    /**
     * Sets the value of the otype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTYPE(String value) {
        this.otype = value;
    }

    /**
     * Gets the value of the objid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBJID() {
        return objid;
    }

    /**
     * Sets the value of the objid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBJID(String value) {
        this.objid = value;
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
     * Gets the value of the istat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISTAT() {
        return istat;
    }

    /**
     * Sets the value of the istat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISTAT(String value) {
        this.istat = value;
    }

    /**
     * Gets the value of the priox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRIOX() {
        return priox;
    }

    /**
     * Sets the value of the priox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRIOX(String value) {
        this.priox = value;
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
     * Gets the value of the varyf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVARYF() {
        return varyf;
    }

    /**
     * Sets the value of the varyf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVARYF(String value) {
        this.varyf = value;
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
     * Gets the value of the reasn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREASN() {
        return reasn;
    }

    /**
     * Sets the value of the reasn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREASN(String value) {
        this.reasn = value;
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
     * Gets the value of the itxnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITXNR() {
        return itxnr;
    }

    /**
     * Sets the value of the itxnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITXNR(String value) {
        this.itxnr = value;
    }

    /**
     * Gets the value of the kobes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOBES() {
        return kobes;
    }

    /**
     * Sets the value of the kobes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOBES(String value) {
        this.kobes = value;
    }

    /**
     * Gets the value of the prdir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRDIR() {
        return prdir;
    }

    /**
     * Sets the value of the prdir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRDIR(String value) {
        this.prdir = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRICE() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRICE(String value) {
        this.price = value;
    }

    /**
     * Gets the value of the waers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAERS() {
        return waers;
    }

    /**
     * Sets the value of the waers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAERS(String value) {
        this.waers = value;
    }

    /**
     * Gets the value of the bunit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUNIT() {
        return bunit;
    }

    /**
     * Sets the value of the bunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUNIT(String value) {
        this.bunit = value;
    }

    /**
     * Gets the value of the bzgme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBZGME() {
        return bzgme;
    }

    /**
     * Sets the value of the bzgme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBZGME(String value) {
        this.bzgme = value;
    }

    /**
     * Gets the value of the kobes001 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOBES001() {
        return kobes001;
    }

    /**
     * Sets the value of the kobes001 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOBES001(String value) {
        this.kobes001 = value;
    }

    /**
     * Gets the value of the prdir001 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRDIR001() {
        return prdir001;
    }

    /**
     * Sets the value of the prdir001 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRDIR001(String value) {
        this.prdir001 = value;
    }

    /**
     * Gets the value of the price001 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRICE001() {
        return price001;
    }

    /**
     * Sets the value of the price001 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRICE001(String value) {
        this.price001 = value;
    }

    /**
     * Gets the value of the waers001 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAERS001() {
        return waers001;
    }

    /**
     * Sets the value of the waers001 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAERS001(String value) {
        this.waers001 = value;
    }

    /**
     * Gets the value of the bunit001 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUNIT001() {
        return bunit001;
    }

    /**
     * Sets the value of the bunit001 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUNIT001(String value) {
        this.bunit001 = value;
    }

    /**
     * Gets the value of the bzgme001 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBZGME001() {
        return bzgme001;
    }

    /**
     * Sets the value of the bzgme001 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBZGME001(String value) {
        this.bzgme001 = value;
    }

    /**
     * Gets the value of the kobes002 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOBES002() {
        return kobes002;
    }

    /**
     * Sets the value of the kobes002 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOBES002(String value) {
        this.kobes002 = value;
    }

    /**
     * Gets the value of the prdir002 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRDIR002() {
        return prdir002;
    }

    /**
     * Sets the value of the prdir002 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRDIR002(String value) {
        this.prdir002 = value;
    }

    /**
     * Gets the value of the price002 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRICE002() {
        return price002;
    }

    /**
     * Sets the value of the price002 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRICE002(String value) {
        this.price002 = value;
    }

    /**
     * Gets the value of the waers002 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAERS002() {
        return waers002;
    }

    /**
     * Sets the value of the waers002 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAERS002(String value) {
        this.waers002 = value;
    }

    /**
     * Gets the value of the bunit002 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUNIT002() {
        return bunit002;
    }

    /**
     * Sets the value of the bunit002 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUNIT002(String value) {
        this.bunit002 = value;
    }

    /**
     * Gets the value of the bzgme002 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBZGME002() {
        return bzgme002;
    }

    /**
     * Sets the value of the bzgme002 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBZGME002(String value) {
        this.bzgme002 = value;
    }

    /**
     * Gets the value of the kobes003 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOBES003() {
        return kobes003;
    }

    /**
     * Sets the value of the kobes003 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOBES003(String value) {
        this.kobes003 = value;
    }

    /**
     * Gets the value of the prdir003 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRDIR003() {
        return prdir003;
    }

    /**
     * Sets the value of the prdir003 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRDIR003(String value) {
        this.prdir003 = value;
    }

    /**
     * Gets the value of the price003 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRICE003() {
        return price003;
    }

    /**
     * Sets the value of the price003 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRICE003(String value) {
        this.price003 = value;
    }

    /**
     * Gets the value of the waers003 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAERS003() {
        return waers003;
    }

    /**
     * Sets the value of the waers003 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAERS003(String value) {
        this.waers003 = value;
    }

    /**
     * Gets the value of the bunit003 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUNIT003() {
        return bunit003;
    }

    /**
     * Sets the value of the bunit003 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUNIT003(String value) {
        this.bunit003 = value;
    }

    /**
     * Gets the value of the bzgme003 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBZGME003() {
        return bzgme003;
    }

    /**
     * Sets the value of the bzgme003 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBZGME003(String value) {
        this.bzgme003 = value;
    }

    /**
     * Gets the value of the kobes004 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOBES004() {
        return kobes004;
    }

    /**
     * Sets the value of the kobes004 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOBES004(String value) {
        this.kobes004 = value;
    }

    /**
     * Gets the value of the prdir004 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRDIR004() {
        return prdir004;
    }

    /**
     * Sets the value of the prdir004 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRDIR004(String value) {
        this.prdir004 = value;
    }

    /**
     * Gets the value of the price004 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRICE004() {
        return price004;
    }

    /**
     * Sets the value of the price004 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRICE004(String value) {
        this.price004 = value;
    }

    /**
     * Gets the value of the waers004 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAERS004() {
        return waers004;
    }

    /**
     * Sets the value of the waers004 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAERS004(String value) {
        this.waers004 = value;
    }

    /**
     * Gets the value of the bunit004 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUNIT004() {
        return bunit004;
    }

    /**
     * Sets the value of the bunit004 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUNIT004(String value) {
        this.bunit004 = value;
    }

    /**
     * Gets the value of the bzgme004 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBZGME004() {
        return bzgme004;
    }

    /**
     * Sets the value of the bzgme004 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBZGME004(String value) {
        this.bzgme004 = value;
    }

    /**
     * Gets the value of the kobes005 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOBES005() {
        return kobes005;
    }

    /**
     * Sets the value of the kobes005 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOBES005(String value) {
        this.kobes005 = value;
    }

    /**
     * Gets the value of the prdir005 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRDIR005() {
        return prdir005;
    }

    /**
     * Sets the value of the prdir005 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRDIR005(String value) {
        this.prdir005 = value;
    }

    /**
     * Gets the value of the price005 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRICE005() {
        return price005;
    }

    /**
     * Sets the value of the price005 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRICE005(String value) {
        this.price005 = value;
    }

    /**
     * Gets the value of the waers005 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAERS005() {
        return waers005;
    }

    /**
     * Sets the value of the waers005 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAERS005(String value) {
        this.waers005 = value;
    }

    /**
     * Gets the value of the bunit005 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUNIT005() {
        return bunit005;
    }

    /**
     * Sets the value of the bunit005 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUNIT005(String value) {
        this.bunit005 = value;
    }

    /**
     * Gets the value of the bzgme005 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBZGME005() {
        return bzgme005;
    }

    /**
     * Sets the value of the bzgme005 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBZGME005(String value) {
        this.bzgme005 = value;
    }

    /**
     * Gets the value of the kobes006 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOBES006() {
        return kobes006;
    }

    /**
     * Sets the value of the kobes006 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOBES006(String value) {
        this.kobes006 = value;
    }

    /**
     * Gets the value of the prdir006 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRDIR006() {
        return prdir006;
    }

    /**
     * Sets the value of the prdir006 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRDIR006(String value) {
        this.prdir006 = value;
    }

    /**
     * Gets the value of the price006 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRICE006() {
        return price006;
    }

    /**
     * Sets the value of the price006 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRICE006(String value) {
        this.price006 = value;
    }

    /**
     * Gets the value of the waers006 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAERS006() {
        return waers006;
    }

    /**
     * Sets the value of the waers006 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAERS006(String value) {
        this.waers006 = value;
    }

    /**
     * Gets the value of the bunit006 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUNIT006() {
        return bunit006;
    }

    /**
     * Sets the value of the bunit006 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUNIT006(String value) {
        this.bunit006 = value;
    }

    /**
     * Gets the value of the bzgme006 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBZGME006() {
        return bzgme006;
    }

    /**
     * Sets the value of the bzgme006 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBZGME006(String value) {
        this.bzgme006 = value;
    }

    /**
     * Gets the value of the kobes007 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOBES007() {
        return kobes007;
    }

    /**
     * Sets the value of the kobes007 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOBES007(String value) {
        this.kobes007 = value;
    }

    /**
     * Gets the value of the prdir007 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRDIR007() {
        return prdir007;
    }

    /**
     * Sets the value of the prdir007 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRDIR007(String value) {
        this.prdir007 = value;
    }

    /**
     * Gets the value of the price007 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRICE007() {
        return price007;
    }

    /**
     * Sets the value of the price007 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRICE007(String value) {
        this.price007 = value;
    }

    /**
     * Gets the value of the waers007 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAERS007() {
        return waers007;
    }

    /**
     * Sets the value of the waers007 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAERS007(String value) {
        this.waers007 = value;
    }

    /**
     * Gets the value of the bunit007 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUNIT007() {
        return bunit007;
    }

    /**
     * Sets the value of the bunit007 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUNIT007(String value) {
        this.bunit007 = value;
    }

    /**
     * Gets the value of the bzgme007 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBZGME007() {
        return bzgme007;
    }

    /**
     * Sets the value of the bzgme007 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBZGME007(String value) {
        this.bzgme007 = value;
    }

    /**
     * Gets the value of the kobes008 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOBES008() {
        return kobes008;
    }

    /**
     * Sets the value of the kobes008 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOBES008(String value) {
        this.kobes008 = value;
    }

    /**
     * Gets the value of the prdir008 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRDIR008() {
        return prdir008;
    }

    /**
     * Sets the value of the prdir008 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRDIR008(String value) {
        this.prdir008 = value;
    }

    /**
     * Gets the value of the price008 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRICE008() {
        return price008;
    }

    /**
     * Sets the value of the price008 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRICE008(String value) {
        this.price008 = value;
    }

    /**
     * Gets the value of the waers008 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAERS008() {
        return waers008;
    }

    /**
     * Sets the value of the waers008 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAERS008(String value) {
        this.waers008 = value;
    }

    /**
     * Gets the value of the bunit008 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUNIT008() {
        return bunit008;
    }

    /**
     * Sets the value of the bunit008 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUNIT008(String value) {
        this.bunit008 = value;
    }

    /**
     * Gets the value of the bzgme008 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBZGME008() {
        return bzgme008;
    }

    /**
     * Sets the value of the bzgme008 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBZGME008(String value) {
        this.bzgme008 = value;
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
