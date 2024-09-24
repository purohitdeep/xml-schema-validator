
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
 *         &lt;element name="ANSSA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
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
 *         &lt;element name="STRAS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ORT01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ORT02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSTLZ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LAND1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TELNR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="14"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ENTKM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WKWNG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BUSRT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LOCAT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="STATE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HSNMR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="POSTA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="STRDS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ENTK2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="COM01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NUM01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="COM02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NUM02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="COM03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NUM03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="COM04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NUM04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="COM05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NUM05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="COM06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NUM06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INDRL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="COUNC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RCTVC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OR2KK" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CONKK" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="24"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OR1KK" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RAILW" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="1"/&gt;
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
 *         &lt;element name="STRAS_40" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="60"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ORT01_40" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ORT02_40" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LOCAT_40" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADR03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADR04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HSNMR_40" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="POSTA_40" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BLDNG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FLOOR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OR2KK_45" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CONKK_45" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OR1KK_45" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
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
    "anssa",
    "name2",
    "stras",
    "ort01",
    "ort02",
    "pstlz",
    "land1",
    "telnr",
    "entkm",
    "wkwng",
    "busrt",
    "locat",
    "state",
    "hsnmr",
    "posta",
    "strds",
    "entk2",
    "com01",
    "num01",
    "com02",
    "num02",
    "com03",
    "num03",
    "com04",
    "num04",
    "com05",
    "num05",
    "com06",
    "num06",
    "indrl",
    "counc",
    "rctvc",
    "or2KK",
    "conkk",
    "or1KK",
    "railw",
    "name240",
    "stras40",
    "ort0140",
    "ort0240",
    "locat40",
    "adr03",
    "adr04",
    "hsnmr40",
    "posta40",
    "bldng",
    "floor",
    "or2KK45",
    "conkk45",
    "or1KK45",
    "grpvl"
})
public class E1P0006 {

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
    @XmlElement(name = "ANSSA")
    protected String anssa;
    @XmlElement(name = "NAME2")
    protected String name2;
    @XmlElement(name = "STRAS")
    protected String stras;
    @XmlElement(name = "ORT01")
    protected String ort01;
    @XmlElement(name = "ORT02")
    protected String ort02;
    @XmlElement(name = "PSTLZ")
    protected String pstlz;
    @XmlElement(name = "LAND1")
    protected String land1;
    @XmlElement(name = "TELNR")
    protected String telnr;
    @XmlElement(name = "ENTKM")
    protected String entkm;
    @XmlElement(name = "WKWNG")
    protected String wkwng;
    @XmlElement(name = "BUSRT")
    protected String busrt;
    @XmlElement(name = "LOCAT")
    protected String locat;
    @XmlElement(name = "STATE")
    protected String state;
    @XmlElement(name = "HSNMR")
    protected String hsnmr;
    @XmlElement(name = "POSTA")
    protected String posta;
    @XmlElement(name = "STRDS")
    protected String strds;
    @XmlElement(name = "ENTK2")
    protected String entk2;
    @XmlElement(name = "COM01")
    protected String com01;
    @XmlElement(name = "NUM01")
    protected String num01;
    @XmlElement(name = "COM02")
    protected String com02;
    @XmlElement(name = "NUM02")
    protected String num02;
    @XmlElement(name = "COM03")
    protected String com03;
    @XmlElement(name = "NUM03")
    protected String num03;
    @XmlElement(name = "COM04")
    protected String com04;
    @XmlElement(name = "NUM04")
    protected String num04;
    @XmlElement(name = "COM05")
    protected String com05;
    @XmlElement(name = "NUM05")
    protected String num05;
    @XmlElement(name = "COM06")
    protected String com06;
    @XmlElement(name = "NUM06")
    protected String num06;
    @XmlElement(name = "INDRL")
    protected String indrl;
    @XmlElement(name = "COUNC")
    protected String counc;
    @XmlElement(name = "RCTVC")
    protected String rctvc;
    @XmlElement(name = "OR2KK")
    protected String or2KK;
    @XmlElement(name = "CONKK")
    protected String conkk;
    @XmlElement(name = "OR1KK")
    protected String or1KK;
    @XmlElement(name = "RAILW")
    protected String railw;
    @XmlElement(name = "NAME2_40")
    protected String name240;
    @XmlElement(name = "STRAS_40")
    protected String stras40;
    @XmlElement(name = "ORT01_40")
    protected String ort0140;
    @XmlElement(name = "ORT02_40")
    protected String ort0240;
    @XmlElement(name = "LOCAT_40")
    protected String locat40;
    @XmlElement(name = "ADR03")
    protected String adr03;
    @XmlElement(name = "ADR04")
    protected String adr04;
    @XmlElement(name = "HSNMR_40")
    protected String hsnmr40;
    @XmlElement(name = "POSTA_40")
    protected String posta40;
    @XmlElement(name = "BLDNG")
    protected String bldng;
    @XmlElement(name = "FLOOR")
    protected String floor;
    @XmlElement(name = "OR2KK_45")
    protected String or2KK45;
    @XmlElement(name = "CONKK_45")
    protected String conkk45;
    @XmlElement(name = "OR1KK_45")
    protected String or1KK45;
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
     * Gets the value of the anssa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANSSA() {
        return anssa;
    }

    /**
     * Sets the value of the anssa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANSSA(String value) {
        this.anssa = value;
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
     * Gets the value of the stras property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTRAS() {
        return stras;
    }

    /**
     * Sets the value of the stras property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTRAS(String value) {
        this.stras = value;
    }

    /**
     * Gets the value of the ort01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORT01() {
        return ort01;
    }

    /**
     * Sets the value of the ort01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORT01(String value) {
        this.ort01 = value;
    }

    /**
     * Gets the value of the ort02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORT02() {
        return ort02;
    }

    /**
     * Sets the value of the ort02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORT02(String value) {
        this.ort02 = value;
    }

    /**
     * Gets the value of the pstlz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSTLZ() {
        return pstlz;
    }

    /**
     * Sets the value of the pstlz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSTLZ(String value) {
        this.pstlz = value;
    }

    /**
     * Gets the value of the land1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLAND1() {
        return land1;
    }

    /**
     * Sets the value of the land1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLAND1(String value) {
        this.land1 = value;
    }

    /**
     * Gets the value of the telnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELNR() {
        return telnr;
    }

    /**
     * Sets the value of the telnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTELNR(String value) {
        this.telnr = value;
    }

    /**
     * Gets the value of the entkm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENTKM() {
        return entkm;
    }

    /**
     * Sets the value of the entkm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENTKM(String value) {
        this.entkm = value;
    }

    /**
     * Gets the value of the wkwng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWKWNG() {
        return wkwng;
    }

    /**
     * Sets the value of the wkwng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWKWNG(String value) {
        this.wkwng = value;
    }

    /**
     * Gets the value of the busrt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUSRT() {
        return busrt;
    }

    /**
     * Sets the value of the busrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUSRT(String value) {
        this.busrt = value;
    }

    /**
     * Gets the value of the locat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCAT() {
        return locat;
    }

    /**
     * Sets the value of the locat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCAT(String value) {
        this.locat = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATE() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATE(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the hsnmr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHSNMR() {
        return hsnmr;
    }

    /**
     * Sets the value of the hsnmr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHSNMR(String value) {
        this.hsnmr = value;
    }

    /**
     * Gets the value of the posta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSTA() {
        return posta;
    }

    /**
     * Sets the value of the posta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSTA(String value) {
        this.posta = value;
    }

    /**
     * Gets the value of the strds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTRDS() {
        return strds;
    }

    /**
     * Sets the value of the strds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTRDS(String value) {
        this.strds = value;
    }

    /**
     * Gets the value of the entk2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENTK2() {
        return entk2;
    }

    /**
     * Sets the value of the entk2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENTK2(String value) {
        this.entk2 = value;
    }

    /**
     * Gets the value of the com01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOM01() {
        return com01;
    }

    /**
     * Sets the value of the com01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOM01(String value) {
        this.com01 = value;
    }

    /**
     * Gets the value of the num01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUM01() {
        return num01;
    }

    /**
     * Sets the value of the num01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUM01(String value) {
        this.num01 = value;
    }

    /**
     * Gets the value of the com02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOM02() {
        return com02;
    }

    /**
     * Sets the value of the com02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOM02(String value) {
        this.com02 = value;
    }

    /**
     * Gets the value of the num02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUM02() {
        return num02;
    }

    /**
     * Sets the value of the num02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUM02(String value) {
        this.num02 = value;
    }

    /**
     * Gets the value of the com03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOM03() {
        return com03;
    }

    /**
     * Sets the value of the com03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOM03(String value) {
        this.com03 = value;
    }

    /**
     * Gets the value of the num03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUM03() {
        return num03;
    }

    /**
     * Sets the value of the num03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUM03(String value) {
        this.num03 = value;
    }

    /**
     * Gets the value of the com04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOM04() {
        return com04;
    }

    /**
     * Sets the value of the com04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOM04(String value) {
        this.com04 = value;
    }

    /**
     * Gets the value of the num04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUM04() {
        return num04;
    }

    /**
     * Sets the value of the num04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUM04(String value) {
        this.num04 = value;
    }

    /**
     * Gets the value of the com05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOM05() {
        return com05;
    }

    /**
     * Sets the value of the com05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOM05(String value) {
        this.com05 = value;
    }

    /**
     * Gets the value of the num05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUM05() {
        return num05;
    }

    /**
     * Sets the value of the num05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUM05(String value) {
        this.num05 = value;
    }

    /**
     * Gets the value of the com06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOM06() {
        return com06;
    }

    /**
     * Sets the value of the com06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOM06(String value) {
        this.com06 = value;
    }

    /**
     * Gets the value of the num06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUM06() {
        return num06;
    }

    /**
     * Sets the value of the num06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUM06(String value) {
        this.num06 = value;
    }

    /**
     * Gets the value of the indrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDRL() {
        return indrl;
    }

    /**
     * Sets the value of the indrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDRL(String value) {
        this.indrl = value;
    }

    /**
     * Gets the value of the counc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUNC() {
        return counc;
    }

    /**
     * Sets the value of the counc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUNC(String value) {
        this.counc = value;
    }

    /**
     * Gets the value of the rctvc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCTVC() {
        return rctvc;
    }

    /**
     * Sets the value of the rctvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCTVC(String value) {
        this.rctvc = value;
    }

    /**
     * Gets the value of the or2KK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOR2KK() {
        return or2KK;
    }

    /**
     * Sets the value of the or2KK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOR2KK(String value) {
        this.or2KK = value;
    }

    /**
     * Gets the value of the conkk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONKK() {
        return conkk;
    }

    /**
     * Sets the value of the conkk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONKK(String value) {
        this.conkk = value;
    }

    /**
     * Gets the value of the or1KK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOR1KK() {
        return or1KK;
    }

    /**
     * Sets the value of the or1KK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOR1KK(String value) {
        this.or1KK = value;
    }

    /**
     * Gets the value of the railw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRAILW() {
        return railw;
    }

    /**
     * Sets the value of the railw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRAILW(String value) {
        this.railw = value;
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
     * Gets the value of the stras40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTRAS40() {
        return stras40;
    }

    /**
     * Sets the value of the stras40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTRAS40(String value) {
        this.stras40 = value;
    }

    /**
     * Gets the value of the ort0140 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORT0140() {
        return ort0140;
    }

    /**
     * Sets the value of the ort0140 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORT0140(String value) {
        this.ort0140 = value;
    }

    /**
     * Gets the value of the ort0240 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORT0240() {
        return ort0240;
    }

    /**
     * Sets the value of the ort0240 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORT0240(String value) {
        this.ort0240 = value;
    }

    /**
     * Gets the value of the locat40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCAT40() {
        return locat40;
    }

    /**
     * Sets the value of the locat40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCAT40(String value) {
        this.locat40 = value;
    }

    /**
     * Gets the value of the adr03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADR03() {
        return adr03;
    }

    /**
     * Sets the value of the adr03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADR03(String value) {
        this.adr03 = value;
    }

    /**
     * Gets the value of the adr04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADR04() {
        return adr04;
    }

    /**
     * Sets the value of the adr04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADR04(String value) {
        this.adr04 = value;
    }

    /**
     * Gets the value of the hsnmr40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHSNMR40() {
        return hsnmr40;
    }

    /**
     * Sets the value of the hsnmr40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHSNMR40(String value) {
        this.hsnmr40 = value;
    }

    /**
     * Gets the value of the posta40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSTA40() {
        return posta40;
    }

    /**
     * Sets the value of the posta40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSTA40(String value) {
        this.posta40 = value;
    }

    /**
     * Gets the value of the bldng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBLDNG() {
        return bldng;
    }

    /**
     * Sets the value of the bldng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBLDNG(String value) {
        this.bldng = value;
    }

    /**
     * Gets the value of the floor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLOOR() {
        return floor;
    }

    /**
     * Sets the value of the floor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLOOR(String value) {
        this.floor = value;
    }

    /**
     * Gets the value of the or2KK45 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOR2KK45() {
        return or2KK45;
    }

    /**
     * Sets the value of the or2KK45 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOR2KK45(String value) {
        this.or2KK45 = value;
    }

    /**
     * Gets the value of the conkk45 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONKK45() {
        return conkk45;
    }

    /**
     * Sets the value of the conkk45 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONKK45(String value) {
        this.conkk45 = value;
    }

    /**
     * Gets the value of the or1KK45 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOR1KK45() {
        return or1KK45;
    }

    /**
     * Sets the value of the or1KK45 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOR1KK45(String value) {
        this.or1KK45 = value;
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
