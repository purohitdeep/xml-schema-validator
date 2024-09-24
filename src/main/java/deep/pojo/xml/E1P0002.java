
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
 *         &lt;element name="INITS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NACHN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NAME2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VORNA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TITEL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TITL2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NAMZU" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VORSW" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VORS2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RUFNM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KNZNM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANRED" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GESCH" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GBDAT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GBLND" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GBDEP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GBORT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NATIO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NATI2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NATI3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SPRSL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KONFE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FAMST" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FAMDT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZKD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NACON" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PERMO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PERID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GBPAS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FNAMK" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="24"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LNAMK" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="24"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FNAMR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="24"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LNAMR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="24"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NABIK" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="24"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NABIR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="24"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NICKK" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="24"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NICKR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="24"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GBJHR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GBMON" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GBTAG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NCHMC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VNAMC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SPRSL_ISO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NACHN_40" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NAME2_40" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NACH2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VORNA_40" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CNAME_40" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RUFNM_40" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MIDNM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GBORT_40" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="E1Q0002" minOccurs="0"&gt;
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
 *                   &lt;element name="FNAMK_45" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="40"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LNAMK_45" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="40"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FNAMR_45" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="40"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LNAMR_45" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="40"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NABIK_45" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="40"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NABIR_45" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="40"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NICKK_45" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="40"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NICKR_45" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="40"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NAMZ2" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="GRPVL" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
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
    "inits",
    "nachn",
    "name2",
    "vorna",
    "titel",
    "titl2",
    "namzu",
    "vorsw",
    "vors2",
    "rufnm",
    "knznm",
    "anred",
    "gesch",
    "gbdat",
    "gblnd",
    "gbdep",
    "gbort",
    "natio",
    "nati2",
    "nati3",
    "sprsl",
    "konfe",
    "famst",
    "famdt",
    "anzkd",
    "nacon",
    "permo",
    "perid",
    "gbpas",
    "fnamk",
    "lnamk",
    "fnamr",
    "lnamr",
    "nabik",
    "nabir",
    "nickk",
    "nickr",
    "gbjhr",
    "gbmon",
    "gbtag",
    "nchmc",
    "vnamc",
    "sprsliso",
    "nachn40",
    "name240",
    "nach2",
    "vorna40",
    "cname40",
    "rufnm40",
    "midnm",
    "gbort40",
    "e1Q0002"
})
public class E1P0002 {

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
    @XmlElement(name = "INITS")
    protected String inits;
    @XmlElement(name = "NACHN")
    protected String nachn;
    @XmlElement(name = "NAME2")
    protected String name2;
    @XmlElement(name = "VORNA")
    protected String vorna;
    @XmlElement(name = "TITEL")
    protected String titel;
    @XmlElement(name = "TITL2")
    protected String titl2;
    @XmlElement(name = "NAMZU")
    protected String namzu;
    @XmlElement(name = "VORSW")
    protected String vorsw;
    @XmlElement(name = "VORS2")
    protected String vors2;
    @XmlElement(name = "RUFNM")
    protected String rufnm;
    @XmlElement(name = "KNZNM")
    protected String knznm;
    @XmlElement(name = "ANRED")
    protected String anred;
    @XmlElement(name = "GESCH")
    protected String gesch;
    @XmlElement(name = "GBDAT")
    protected String gbdat;
    @XmlElement(name = "GBLND")
    protected String gblnd;
    @XmlElement(name = "GBDEP")
    protected String gbdep;
    @XmlElement(name = "GBORT")
    protected String gbort;
    @XmlElement(name = "NATIO")
    protected String natio;
    @XmlElement(name = "NATI2")
    protected String nati2;
    @XmlElement(name = "NATI3")
    protected String nati3;
    @XmlElement(name = "SPRSL")
    protected String sprsl;
    @XmlElement(name = "KONFE")
    protected String konfe;
    @XmlElement(name = "FAMST")
    protected String famst;
    @XmlElement(name = "FAMDT")
    protected String famdt;
    @XmlElement(name = "ANZKD")
    protected String anzkd;
    @XmlElement(name = "NACON")
    protected String nacon;
    @XmlElement(name = "PERMO")
    protected String permo;
    @XmlElement(name = "PERID")
    protected String perid;
    @XmlElement(name = "GBPAS")
    protected String gbpas;
    @XmlElement(name = "FNAMK")
    protected String fnamk;
    @XmlElement(name = "LNAMK")
    protected String lnamk;
    @XmlElement(name = "FNAMR")
    protected String fnamr;
    @XmlElement(name = "LNAMR")
    protected String lnamr;
    @XmlElement(name = "NABIK")
    protected String nabik;
    @XmlElement(name = "NABIR")
    protected String nabir;
    @XmlElement(name = "NICKK")
    protected String nickk;
    @XmlElement(name = "NICKR")
    protected String nickr;
    @XmlElement(name = "GBJHR")
    protected String gbjhr;
    @XmlElement(name = "GBMON")
    protected String gbmon;
    @XmlElement(name = "GBTAG")
    protected String gbtag;
    @XmlElement(name = "NCHMC")
    protected String nchmc;
    @XmlElement(name = "VNAMC")
    protected String vnamc;
    @XmlElement(name = "SPRSL_ISO")
    protected String sprsliso;
    @XmlElement(name = "NACHN_40")
    protected String nachn40;
    @XmlElement(name = "NAME2_40")
    protected String name240;
    @XmlElement(name = "NACH2")
    protected String nach2;
    @XmlElement(name = "VORNA_40")
    protected String vorna40;
    @XmlElement(name = "CNAME_40")
    protected String cname40;
    @XmlElement(name = "RUFNM_40")
    protected String rufnm40;
    @XmlElement(name = "MIDNM")
    protected String midnm;
    @XmlElement(name = "GBORT_40")
    protected String gbort40;
    @XmlElement(name = "E1Q0002")
    protected E1Q0002 e1Q0002;
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
     * Gets the value of the inits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINITS() {
        return inits;
    }

    /**
     * Sets the value of the inits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINITS(String value) {
        this.inits = value;
    }

    /**
     * Gets the value of the nachn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNACHN() {
        return nachn;
    }

    /**
     * Sets the value of the nachn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNACHN(String value) {
        this.nachn = value;
    }

    /**
     * Gets the value of the name2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME2() {
        return name2;
    }

    /**
     * Sets the value of the name2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME2(String value) {
        this.name2 = value;
    }

    /**
     * Gets the value of the vorna property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVORNA() {
        return vorna;
    }

    /**
     * Sets the value of the vorna property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVORNA(String value) {
        this.vorna = value;
    }

    /**
     * Gets the value of the titel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITEL() {
        return titel;
    }

    /**
     * Sets the value of the titel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITEL(String value) {
        this.titel = value;
    }

    /**
     * Gets the value of the titl2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITL2() {
        return titl2;
    }

    /**
     * Sets the value of the titl2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITL2(String value) {
        this.titl2 = value;
    }

    /**
     * Gets the value of the namzu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAMZU() {
        return namzu;
    }

    /**
     * Sets the value of the namzu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAMZU(String value) {
        this.namzu = value;
    }

    /**
     * Gets the value of the vorsw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVORSW() {
        return vorsw;
    }

    /**
     * Sets the value of the vorsw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVORSW(String value) {
        this.vorsw = value;
    }

    /**
     * Gets the value of the vors2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVORS2() {
        return vors2;
    }

    /**
     * Sets the value of the vors2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVORS2(String value) {
        this.vors2 = value;
    }

    /**
     * Gets the value of the rufnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRUFNM() {
        return rufnm;
    }

    /**
     * Sets the value of the rufnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRUFNM(String value) {
        this.rufnm = value;
    }

    /**
     * Gets the value of the knznm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKNZNM() {
        return knznm;
    }

    /**
     * Sets the value of the knznm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKNZNM(String value) {
        this.knznm = value;
    }

    /**
     * Gets the value of the anred property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANRED() {
        return anred;
    }

    /**
     * Sets the value of the anred property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANRED(String value) {
        this.anred = value;
    }

    /**
     * Gets the value of the gesch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGESCH() {
        return gesch;
    }

    /**
     * Sets the value of the gesch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGESCH(String value) {
        this.gesch = value;
    }

    /**
     * Gets the value of the gbdat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGBDAT() {
        return gbdat;
    }

    /**
     * Sets the value of the gbdat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGBDAT(String value) {
        this.gbdat = value;
    }

    /**
     * Gets the value of the gblnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGBLND() {
        return gblnd;
    }

    /**
     * Sets the value of the gblnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGBLND(String value) {
        this.gblnd = value;
    }

    /**
     * Gets the value of the gbdep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGBDEP() {
        return gbdep;
    }

    /**
     * Sets the value of the gbdep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGBDEP(String value) {
        this.gbdep = value;
    }

    /**
     * Gets the value of the gbort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGBORT() {
        return gbort;
    }

    /**
     * Sets the value of the gbort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGBORT(String value) {
        this.gbort = value;
    }

    /**
     * Gets the value of the natio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNATIO() {
        return natio;
    }

    /**
     * Sets the value of the natio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNATIO(String value) {
        this.natio = value;
    }

    /**
     * Gets the value of the nati2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNATI2() {
        return nati2;
    }

    /**
     * Sets the value of the nati2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNATI2(String value) {
        this.nati2 = value;
    }

    /**
     * Gets the value of the nati3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNATI3() {
        return nati3;
    }

    /**
     * Sets the value of the nati3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNATI3(String value) {
        this.nati3 = value;
    }

    /**
     * Gets the value of the sprsl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPRSL() {
        return sprsl;
    }

    /**
     * Sets the value of the sprsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPRSL(String value) {
        this.sprsl = value;
    }

    /**
     * Gets the value of the konfe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKONFE() {
        return konfe;
    }

    /**
     * Sets the value of the konfe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKONFE(String value) {
        this.konfe = value;
    }

    /**
     * Gets the value of the famst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAMST() {
        return famst;
    }

    /**
     * Sets the value of the famst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAMST(String value) {
        this.famst = value;
    }

    /**
     * Gets the value of the famdt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAMDT() {
        return famdt;
    }

    /**
     * Sets the value of the famdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAMDT(String value) {
        this.famdt = value;
    }

    /**
     * Gets the value of the anzkd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZKD() {
        return anzkd;
    }

    /**
     * Sets the value of the anzkd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZKD(String value) {
        this.anzkd = value;
    }

    /**
     * Gets the value of the nacon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNACON() {
        return nacon;
    }

    /**
     * Sets the value of the nacon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNACON(String value) {
        this.nacon = value;
    }

    /**
     * Gets the value of the permo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERMO() {
        return permo;
    }

    /**
     * Sets the value of the permo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERMO(String value) {
        this.permo = value;
    }

    /**
     * Gets the value of the perid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERID() {
        return perid;
    }

    /**
     * Sets the value of the perid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERID(String value) {
        this.perid = value;
    }

    /**
     * Gets the value of the gbpas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGBPAS() {
        return gbpas;
    }

    /**
     * Sets the value of the gbpas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGBPAS(String value) {
        this.gbpas = value;
    }

    /**
     * Gets the value of the fnamk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNAMK() {
        return fnamk;
    }

    /**
     * Sets the value of the fnamk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNAMK(String value) {
        this.fnamk = value;
    }

    /**
     * Gets the value of the lnamk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLNAMK() {
        return lnamk;
    }

    /**
     * Sets the value of the lnamk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLNAMK(String value) {
        this.lnamk = value;
    }

    /**
     * Gets the value of the fnamr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNAMR() {
        return fnamr;
    }

    /**
     * Sets the value of the fnamr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNAMR(String value) {
        this.fnamr = value;
    }

    /**
     * Gets the value of the lnamr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLNAMR() {
        return lnamr;
    }

    /**
     * Sets the value of the lnamr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLNAMR(String value) {
        this.lnamr = value;
    }

    /**
     * Gets the value of the nabik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNABIK() {
        return nabik;
    }

    /**
     * Sets the value of the nabik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNABIK(String value) {
        this.nabik = value;
    }

    /**
     * Gets the value of the nabir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNABIR() {
        return nabir;
    }

    /**
     * Sets the value of the nabir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNABIR(String value) {
        this.nabir = value;
    }

    /**
     * Gets the value of the nickk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNICKK() {
        return nickk;
    }

    /**
     * Sets the value of the nickk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNICKK(String value) {
        this.nickk = value;
    }

    /**
     * Gets the value of the nickr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNICKR() {
        return nickr;
    }

    /**
     * Sets the value of the nickr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNICKR(String value) {
        this.nickr = value;
    }

    /**
     * Gets the value of the gbjhr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGBJHR() {
        return gbjhr;
    }

    /**
     * Sets the value of the gbjhr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGBJHR(String value) {
        this.gbjhr = value;
    }

    /**
     * Gets the value of the gbmon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGBMON() {
        return gbmon;
    }

    /**
     * Sets the value of the gbmon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGBMON(String value) {
        this.gbmon = value;
    }

    /**
     * Gets the value of the gbtag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGBTAG() {
        return gbtag;
    }

    /**
     * Sets the value of the gbtag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGBTAG(String value) {
        this.gbtag = value;
    }

    /**
     * Gets the value of the nchmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCHMC() {
        return nchmc;
    }

    /**
     * Sets the value of the nchmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCHMC(String value) {
        this.nchmc = value;
    }

    /**
     * Gets the value of the vnamc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVNAMC() {
        return vnamc;
    }

    /**
     * Sets the value of the vnamc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVNAMC(String value) {
        this.vnamc = value;
    }

    /**
     * Gets the value of the sprsliso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPRSLISO() {
        return sprsliso;
    }

    /**
     * Sets the value of the sprsliso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPRSLISO(String value) {
        this.sprsliso = value;
    }

    /**
     * Gets the value of the nachn40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNACHN40() {
        return nachn40;
    }

    /**
     * Sets the value of the nachn40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNACHN40(String value) {
        this.nachn40 = value;
    }

    /**
     * Gets the value of the name240 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME240() {
        return name240;
    }

    /**
     * Sets the value of the name240 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME240(String value) {
        this.name240 = value;
    }

    /**
     * Gets the value of the nach2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNACH2() {
        return nach2;
    }

    /**
     * Sets the value of the nach2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNACH2(String value) {
        this.nach2 = value;
    }

    /**
     * Gets the value of the vorna40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVORNA40() {
        return vorna40;
    }

    /**
     * Sets the value of the vorna40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVORNA40(String value) {
        this.vorna40 = value;
    }

    /**
     * Gets the value of the cname40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNAME40() {
        return cname40;
    }

    /**
     * Sets the value of the cname40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNAME40(String value) {
        this.cname40 = value;
    }

    /**
     * Gets the value of the rufnm40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRUFNM40() {
        return rufnm40;
    }

    /**
     * Sets the value of the rufnm40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRUFNM40(String value) {
        this.rufnm40 = value;
    }

    /**
     * Gets the value of the midnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIDNM() {
        return midnm;
    }

    /**
     * Sets the value of the midnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIDNM(String value) {
        this.midnm = value;
    }

    /**
     * Gets the value of the gbort40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGBORT40() {
        return gbort40;
    }

    /**
     * Sets the value of the gbort40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGBORT40(String value) {
        this.gbort40 = value;
    }

    /**
     * Gets the value of the e1Q0002 property.
     * 
     * @return
     *     possible object is
     *     {@link E1Q0002 }
     *     
     */
    public E1Q0002 getE1Q0002() {
        return e1Q0002;
    }

    /**
     * Sets the value of the e1Q0002 property.
     * 
     * @param value
     *     allowed object is
     *     {@link E1Q0002 }
     *     
     */
    public void setE1Q0002(E1Q0002 value) {
        this.e1Q0002 = value;
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
