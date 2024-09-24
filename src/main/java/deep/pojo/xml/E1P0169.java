
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
 *         &lt;element name="BAREA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PLTYP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPLAN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BENGR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BSTAT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ELIDT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ELDTO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PARDT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ENRTY" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EVENT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PERIO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EEAMT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EEPCT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EEUNT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PTAMT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PTPCT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PTUNT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSTTX" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ROLLO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BCAMT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BCPCT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BCUNT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPAMT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPPCT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPUNT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPTTX" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BROLL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SPADT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PAAMT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ACCTN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIFEL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="17"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ITS01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTY01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DID01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPT01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ITS02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTY02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DID02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPT02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ITS03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTY03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DID03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPT03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ITS04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTY04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DID04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPT04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ITS05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTY05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DID05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPT05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ITS06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTY06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DID06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPT06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ITS07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTY07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DID07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPT07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ITS08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTY08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DID08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPT08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ITS09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTY09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DID09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPT09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ITS10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTY10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DID10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPT10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ITS11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTY11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DID11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPT11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ITS12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTY12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DID12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPT12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ITS13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTY13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DID13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPT13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ITS14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTY14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DID14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPT14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ITS15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTY15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DID15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPT15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ITS16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTY16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DID16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPT16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ITS17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTY17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DID17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPT17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ITS18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTY18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DID18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPT18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ITS19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTY19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DID19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPT19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ITS20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTY20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DID20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPT20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CIS01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CTY01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CID01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CPT01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CIS02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CTY02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CID02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CPT02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CIS03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CTY03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CID03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CPT03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CIS04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CTY04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CID04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CPT04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CIS05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CTY05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CID05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CPT05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CIS06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CTY06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CID06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CPT06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CIS07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CTY07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CID07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CPT07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CIS08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CTY08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CID08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CPT08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CIS09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CTY09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CID09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CPT09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CIS10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CTY10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CID10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CPT10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CURRE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INV01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IPT01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IAM01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INV02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IPT02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IAM02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INV03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IPT03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IAM03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INV04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IPT04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IAM04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INV05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IPT05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IAM05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INV06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IPT06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IAM06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INV07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IPT07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IAM07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INV08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IPT08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IAM08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INV09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IPT09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IAM09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INV10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IPT10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IAM10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INV11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IPT11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IAM11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INV12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IPT12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IAM12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INV13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IPT13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IAM13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INV14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IPT14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IAM14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INV15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IPT15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IAM15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
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
 *         &lt;element name="E1Q0169" minOccurs="0"&gt;
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
 *                   &lt;element name="INV16" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IPT16" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IAM16" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="INV17" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IPT17" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IAM17" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="INV18" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IPT18" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IAM18" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="INV19" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IPT19" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IAM19" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="INV20" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IPT20" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IAM20" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="EEPCT" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="11"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PTPCT" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="11"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BPPCT" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="11"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BCPCT" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="11"/&gt;
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
    "barea",
    "pltyp",
    "bplan",
    "bengr",
    "bstat",
    "elidt",
    "eldto",
    "pardt",
    "enrty",
    "event",
    "perio",
    "eeamt",
    "eepct",
    "eeunt",
    "ptamt",
    "ptpct",
    "ptunt",
    "psttx",
    "rollo",
    "bcamt",
    "bcpct",
    "bcunt",
    "bpamt",
    "bppct",
    "bpunt",
    "bpttx",
    "broll",
    "spadt",
    "paamt",
    "acctn",
    "lifel",
    "its01",
    "dty01",
    "did01",
    "bpt01",
    "its02",
    "dty02",
    "did02",
    "bpt02",
    "its03",
    "dty03",
    "did03",
    "bpt03",
    "its04",
    "dty04",
    "did04",
    "bpt04",
    "its05",
    "dty05",
    "did05",
    "bpt05",
    "its06",
    "dty06",
    "did06",
    "bpt06",
    "its07",
    "dty07",
    "did07",
    "bpt07",
    "its08",
    "dty08",
    "did08",
    "bpt08",
    "its09",
    "dty09",
    "did09",
    "bpt09",
    "its10",
    "dty10",
    "did10",
    "bpt10",
    "its11",
    "dty11",
    "did11",
    "bpt11",
    "its12",
    "dty12",
    "did12",
    "bpt12",
    "its13",
    "dty13",
    "did13",
    "bpt13",
    "its14",
    "dty14",
    "did14",
    "bpt14",
    "its15",
    "dty15",
    "did15",
    "bpt15",
    "its16",
    "dty16",
    "did16",
    "bpt16",
    "its17",
    "dty17",
    "did17",
    "bpt17",
    "its18",
    "dty18",
    "did18",
    "bpt18",
    "its19",
    "dty19",
    "did19",
    "bpt19",
    "its20",
    "dty20",
    "did20",
    "bpt20",
    "cis01",
    "cty01",
    "cid01",
    "cpt01",
    "cis02",
    "cty02",
    "cid02",
    "cpt02",
    "cis03",
    "cty03",
    "cid03",
    "cpt03",
    "cis04",
    "cty04",
    "cid04",
    "cpt04",
    "cis05",
    "cty05",
    "cid05",
    "cpt05",
    "cis06",
    "cty06",
    "cid06",
    "cpt06",
    "cis07",
    "cty07",
    "cid07",
    "cpt07",
    "cis08",
    "cty08",
    "cid08",
    "cpt08",
    "cis09",
    "cty09",
    "cid09",
    "cpt09",
    "cis10",
    "cty10",
    "cid10",
    "cpt10",
    "curre",
    "inv01",
    "ipt01",
    "iam01",
    "inv02",
    "ipt02",
    "iam02",
    "inv03",
    "ipt03",
    "iam03",
    "inv04",
    "ipt04",
    "iam04",
    "inv05",
    "ipt05",
    "iam05",
    "inv06",
    "ipt06",
    "iam06",
    "inv07",
    "ipt07",
    "iam07",
    "inv08",
    "ipt08",
    "iam08",
    "inv09",
    "ipt09",
    "iam09",
    "inv10",
    "ipt10",
    "iam10",
    "inv11",
    "ipt11",
    "iam11",
    "inv12",
    "ipt12",
    "iam12",
    "inv13",
    "ipt13",
    "iam13",
    "inv14",
    "ipt14",
    "iam14",
    "inv15",
    "ipt15",
    "iam15",
    "grpvl",
    "e1Q0169"
})
public class E1P0169 {

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
    @XmlElement(name = "BAREA")
    protected String barea;
    @XmlElement(name = "PLTYP")
    protected String pltyp;
    @XmlElement(name = "BPLAN")
    protected String bplan;
    @XmlElement(name = "BENGR")
    protected String bengr;
    @XmlElement(name = "BSTAT")
    protected String bstat;
    @XmlElement(name = "ELIDT")
    protected String elidt;
    @XmlElement(name = "ELDTO")
    protected String eldto;
    @XmlElement(name = "PARDT")
    protected String pardt;
    @XmlElement(name = "ENRTY")
    protected String enrty;
    @XmlElement(name = "EVENT")
    protected String event;
    @XmlElement(name = "PERIO")
    protected String perio;
    @XmlElement(name = "EEAMT")
    protected String eeamt;
    @XmlElement(name = "EEPCT")
    protected String eepct;
    @XmlElement(name = "EEUNT")
    protected String eeunt;
    @XmlElement(name = "PTAMT")
    protected String ptamt;
    @XmlElement(name = "PTPCT")
    protected String ptpct;
    @XmlElement(name = "PTUNT")
    protected String ptunt;
    @XmlElement(name = "PSTTX")
    protected String psttx;
    @XmlElement(name = "ROLLO")
    protected String rollo;
    @XmlElement(name = "BCAMT")
    protected String bcamt;
    @XmlElement(name = "BCPCT")
    protected String bcpct;
    @XmlElement(name = "BCUNT")
    protected String bcunt;
    @XmlElement(name = "BPAMT")
    protected String bpamt;
    @XmlElement(name = "BPPCT")
    protected String bppct;
    @XmlElement(name = "BPUNT")
    protected String bpunt;
    @XmlElement(name = "BPTTX")
    protected String bpttx;
    @XmlElement(name = "BROLL")
    protected String broll;
    @XmlElement(name = "SPADT")
    protected String spadt;
    @XmlElement(name = "PAAMT")
    protected String paamt;
    @XmlElement(name = "ACCTN")
    protected String acctn;
    @XmlElement(name = "LIFEL")
    protected String lifel;
    @XmlElement(name = "ITS01")
    protected String its01;
    @XmlElement(name = "DTY01")
    protected String dty01;
    @XmlElement(name = "DID01")
    protected String did01;
    @XmlElement(name = "BPT01")
    protected String bpt01;
    @XmlElement(name = "ITS02")
    protected String its02;
    @XmlElement(name = "DTY02")
    protected String dty02;
    @XmlElement(name = "DID02")
    protected String did02;
    @XmlElement(name = "BPT02")
    protected String bpt02;
    @XmlElement(name = "ITS03")
    protected String its03;
    @XmlElement(name = "DTY03")
    protected String dty03;
    @XmlElement(name = "DID03")
    protected String did03;
    @XmlElement(name = "BPT03")
    protected String bpt03;
    @XmlElement(name = "ITS04")
    protected String its04;
    @XmlElement(name = "DTY04")
    protected String dty04;
    @XmlElement(name = "DID04")
    protected String did04;
    @XmlElement(name = "BPT04")
    protected String bpt04;
    @XmlElement(name = "ITS05")
    protected String its05;
    @XmlElement(name = "DTY05")
    protected String dty05;
    @XmlElement(name = "DID05")
    protected String did05;
    @XmlElement(name = "BPT05")
    protected String bpt05;
    @XmlElement(name = "ITS06")
    protected String its06;
    @XmlElement(name = "DTY06")
    protected String dty06;
    @XmlElement(name = "DID06")
    protected String did06;
    @XmlElement(name = "BPT06")
    protected String bpt06;
    @XmlElement(name = "ITS07")
    protected String its07;
    @XmlElement(name = "DTY07")
    protected String dty07;
    @XmlElement(name = "DID07")
    protected String did07;
    @XmlElement(name = "BPT07")
    protected String bpt07;
    @XmlElement(name = "ITS08")
    protected String its08;
    @XmlElement(name = "DTY08")
    protected String dty08;
    @XmlElement(name = "DID08")
    protected String did08;
    @XmlElement(name = "BPT08")
    protected String bpt08;
    @XmlElement(name = "ITS09")
    protected String its09;
    @XmlElement(name = "DTY09")
    protected String dty09;
    @XmlElement(name = "DID09")
    protected String did09;
    @XmlElement(name = "BPT09")
    protected String bpt09;
    @XmlElement(name = "ITS10")
    protected String its10;
    @XmlElement(name = "DTY10")
    protected String dty10;
    @XmlElement(name = "DID10")
    protected String did10;
    @XmlElement(name = "BPT10")
    protected String bpt10;
    @XmlElement(name = "ITS11")
    protected String its11;
    @XmlElement(name = "DTY11")
    protected String dty11;
    @XmlElement(name = "DID11")
    protected String did11;
    @XmlElement(name = "BPT11")
    protected String bpt11;
    @XmlElement(name = "ITS12")
    protected String its12;
    @XmlElement(name = "DTY12")
    protected String dty12;
    @XmlElement(name = "DID12")
    protected String did12;
    @XmlElement(name = "BPT12")
    protected String bpt12;
    @XmlElement(name = "ITS13")
    protected String its13;
    @XmlElement(name = "DTY13")
    protected String dty13;
    @XmlElement(name = "DID13")
    protected String did13;
    @XmlElement(name = "BPT13")
    protected String bpt13;
    @XmlElement(name = "ITS14")
    protected String its14;
    @XmlElement(name = "DTY14")
    protected String dty14;
    @XmlElement(name = "DID14")
    protected String did14;
    @XmlElement(name = "BPT14")
    protected String bpt14;
    @XmlElement(name = "ITS15")
    protected String its15;
    @XmlElement(name = "DTY15")
    protected String dty15;
    @XmlElement(name = "DID15")
    protected String did15;
    @XmlElement(name = "BPT15")
    protected String bpt15;
    @XmlElement(name = "ITS16")
    protected String its16;
    @XmlElement(name = "DTY16")
    protected String dty16;
    @XmlElement(name = "DID16")
    protected String did16;
    @XmlElement(name = "BPT16")
    protected String bpt16;
    @XmlElement(name = "ITS17")
    protected String its17;
    @XmlElement(name = "DTY17")
    protected String dty17;
    @XmlElement(name = "DID17")
    protected String did17;
    @XmlElement(name = "BPT17")
    protected String bpt17;
    @XmlElement(name = "ITS18")
    protected String its18;
    @XmlElement(name = "DTY18")
    protected String dty18;
    @XmlElement(name = "DID18")
    protected String did18;
    @XmlElement(name = "BPT18")
    protected String bpt18;
    @XmlElement(name = "ITS19")
    protected String its19;
    @XmlElement(name = "DTY19")
    protected String dty19;
    @XmlElement(name = "DID19")
    protected String did19;
    @XmlElement(name = "BPT19")
    protected String bpt19;
    @XmlElement(name = "ITS20")
    protected String its20;
    @XmlElement(name = "DTY20")
    protected String dty20;
    @XmlElement(name = "DID20")
    protected String did20;
    @XmlElement(name = "BPT20")
    protected String bpt20;
    @XmlElement(name = "CIS01")
    protected String cis01;
    @XmlElement(name = "CTY01")
    protected String cty01;
    @XmlElement(name = "CID01")
    protected String cid01;
    @XmlElement(name = "CPT01")
    protected String cpt01;
    @XmlElement(name = "CIS02")
    protected String cis02;
    @XmlElement(name = "CTY02")
    protected String cty02;
    @XmlElement(name = "CID02")
    protected String cid02;
    @XmlElement(name = "CPT02")
    protected String cpt02;
    @XmlElement(name = "CIS03")
    protected String cis03;
    @XmlElement(name = "CTY03")
    protected String cty03;
    @XmlElement(name = "CID03")
    protected String cid03;
    @XmlElement(name = "CPT03")
    protected String cpt03;
    @XmlElement(name = "CIS04")
    protected String cis04;
    @XmlElement(name = "CTY04")
    protected String cty04;
    @XmlElement(name = "CID04")
    protected String cid04;
    @XmlElement(name = "CPT04")
    protected String cpt04;
    @XmlElement(name = "CIS05")
    protected String cis05;
    @XmlElement(name = "CTY05")
    protected String cty05;
    @XmlElement(name = "CID05")
    protected String cid05;
    @XmlElement(name = "CPT05")
    protected String cpt05;
    @XmlElement(name = "CIS06")
    protected String cis06;
    @XmlElement(name = "CTY06")
    protected String cty06;
    @XmlElement(name = "CID06")
    protected String cid06;
    @XmlElement(name = "CPT06")
    protected String cpt06;
    @XmlElement(name = "CIS07")
    protected String cis07;
    @XmlElement(name = "CTY07")
    protected String cty07;
    @XmlElement(name = "CID07")
    protected String cid07;
    @XmlElement(name = "CPT07")
    protected String cpt07;
    @XmlElement(name = "CIS08")
    protected String cis08;
    @XmlElement(name = "CTY08")
    protected String cty08;
    @XmlElement(name = "CID08")
    protected String cid08;
    @XmlElement(name = "CPT08")
    protected String cpt08;
    @XmlElement(name = "CIS09")
    protected String cis09;
    @XmlElement(name = "CTY09")
    protected String cty09;
    @XmlElement(name = "CID09")
    protected String cid09;
    @XmlElement(name = "CPT09")
    protected String cpt09;
    @XmlElement(name = "CIS10")
    protected String cis10;
    @XmlElement(name = "CTY10")
    protected String cty10;
    @XmlElement(name = "CID10")
    protected String cid10;
    @XmlElement(name = "CPT10")
    protected String cpt10;
    @XmlElement(name = "CURRE")
    protected String curre;
    @XmlElement(name = "INV01")
    protected String inv01;
    @XmlElement(name = "IPT01")
    protected String ipt01;
    @XmlElement(name = "IAM01")
    protected String iam01;
    @XmlElement(name = "INV02")
    protected String inv02;
    @XmlElement(name = "IPT02")
    protected String ipt02;
    @XmlElement(name = "IAM02")
    protected String iam02;
    @XmlElement(name = "INV03")
    protected String inv03;
    @XmlElement(name = "IPT03")
    protected String ipt03;
    @XmlElement(name = "IAM03")
    protected String iam03;
    @XmlElement(name = "INV04")
    protected String inv04;
    @XmlElement(name = "IPT04")
    protected String ipt04;
    @XmlElement(name = "IAM04")
    protected String iam04;
    @XmlElement(name = "INV05")
    protected String inv05;
    @XmlElement(name = "IPT05")
    protected String ipt05;
    @XmlElement(name = "IAM05")
    protected String iam05;
    @XmlElement(name = "INV06")
    protected String inv06;
    @XmlElement(name = "IPT06")
    protected String ipt06;
    @XmlElement(name = "IAM06")
    protected String iam06;
    @XmlElement(name = "INV07")
    protected String inv07;
    @XmlElement(name = "IPT07")
    protected String ipt07;
    @XmlElement(name = "IAM07")
    protected String iam07;
    @XmlElement(name = "INV08")
    protected String inv08;
    @XmlElement(name = "IPT08")
    protected String ipt08;
    @XmlElement(name = "IAM08")
    protected String iam08;
    @XmlElement(name = "INV09")
    protected String inv09;
    @XmlElement(name = "IPT09")
    protected String ipt09;
    @XmlElement(name = "IAM09")
    protected String iam09;
    @XmlElement(name = "INV10")
    protected String inv10;
    @XmlElement(name = "IPT10")
    protected String ipt10;
    @XmlElement(name = "IAM10")
    protected String iam10;
    @XmlElement(name = "INV11")
    protected String inv11;
    @XmlElement(name = "IPT11")
    protected String ipt11;
    @XmlElement(name = "IAM11")
    protected String iam11;
    @XmlElement(name = "INV12")
    protected String inv12;
    @XmlElement(name = "IPT12")
    protected String ipt12;
    @XmlElement(name = "IAM12")
    protected String iam12;
    @XmlElement(name = "INV13")
    protected String inv13;
    @XmlElement(name = "IPT13")
    protected String ipt13;
    @XmlElement(name = "IAM13")
    protected String iam13;
    @XmlElement(name = "INV14")
    protected String inv14;
    @XmlElement(name = "IPT14")
    protected String ipt14;
    @XmlElement(name = "IAM14")
    protected String iam14;
    @XmlElement(name = "INV15")
    protected String inv15;
    @XmlElement(name = "IPT15")
    protected String ipt15;
    @XmlElement(name = "IAM15")
    protected String iam15;
    @XmlElement(name = "GRPVL")
    protected String grpvl;
    @XmlElement(name = "E1Q0169")
    protected E1Q0169 e1Q0169;
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
     * Gets the value of the barea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBAREA() {
        return barea;
    }

    /**
     * Sets the value of the barea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBAREA(String value) {
        this.barea = value;
    }

    /**
     * Gets the value of the pltyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLTYP() {
        return pltyp;
    }

    /**
     * Sets the value of the pltyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLTYP(String value) {
        this.pltyp = value;
    }

    /**
     * Gets the value of the bplan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPLAN() {
        return bplan;
    }

    /**
     * Sets the value of the bplan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPLAN(String value) {
        this.bplan = value;
    }

    /**
     * Gets the value of the bengr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBENGR() {
        return bengr;
    }

    /**
     * Sets the value of the bengr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBENGR(String value) {
        this.bengr = value;
    }

    /**
     * Gets the value of the bstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSTAT() {
        return bstat;
    }

    /**
     * Sets the value of the bstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSTAT(String value) {
        this.bstat = value;
    }

    /**
     * Gets the value of the elidt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELIDT() {
        return elidt;
    }

    /**
     * Sets the value of the elidt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELIDT(String value) {
        this.elidt = value;
    }

    /**
     * Gets the value of the eldto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELDTO() {
        return eldto;
    }

    /**
     * Sets the value of the eldto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELDTO(String value) {
        this.eldto = value;
    }

    /**
     * Gets the value of the pardt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARDT() {
        return pardt;
    }

    /**
     * Sets the value of the pardt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARDT(String value) {
        this.pardt = value;
    }

    /**
     * Gets the value of the enrty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENRTY() {
        return enrty;
    }

    /**
     * Sets the value of the enrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENRTY(String value) {
        this.enrty = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEVENT() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEVENT(String value) {
        this.event = value;
    }

    /**
     * Gets the value of the perio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERIO() {
        return perio;
    }

    /**
     * Sets the value of the perio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERIO(String value) {
        this.perio = value;
    }

    /**
     * Gets the value of the eeamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEEAMT() {
        return eeamt;
    }

    /**
     * Sets the value of the eeamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEEAMT(String value) {
        this.eeamt = value;
    }

    /**
     * Gets the value of the eepct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEEPCT() {
        return eepct;
    }

    /**
     * Sets the value of the eepct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEEPCT(String value) {
        this.eepct = value;
    }

    /**
     * Gets the value of the eeunt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEEUNT() {
        return eeunt;
    }

    /**
     * Sets the value of the eeunt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEEUNT(String value) {
        this.eeunt = value;
    }

    /**
     * Gets the value of the ptamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTAMT() {
        return ptamt;
    }

    /**
     * Sets the value of the ptamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTAMT(String value) {
        this.ptamt = value;
    }

    /**
     * Gets the value of the ptpct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTPCT() {
        return ptpct;
    }

    /**
     * Sets the value of the ptpct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTPCT(String value) {
        this.ptpct = value;
    }

    /**
     * Gets the value of the ptunt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTUNT() {
        return ptunt;
    }

    /**
     * Sets the value of the ptunt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTUNT(String value) {
        this.ptunt = value;
    }

    /**
     * Gets the value of the psttx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSTTX() {
        return psttx;
    }

    /**
     * Sets the value of the psttx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSTTX(String value) {
        this.psttx = value;
    }

    /**
     * Gets the value of the rollo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROLLO() {
        return rollo;
    }

    /**
     * Sets the value of the rollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROLLO(String value) {
        this.rollo = value;
    }

    /**
     * Gets the value of the bcamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCAMT() {
        return bcamt;
    }

    /**
     * Sets the value of the bcamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCAMT(String value) {
        this.bcamt = value;
    }

    /**
     * Gets the value of the bcpct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCPCT() {
        return bcpct;
    }

    /**
     * Sets the value of the bcpct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCPCT(String value) {
        this.bcpct = value;
    }

    /**
     * Gets the value of the bcunt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCUNT() {
        return bcunt;
    }

    /**
     * Sets the value of the bcunt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCUNT(String value) {
        this.bcunt = value;
    }

    /**
     * Gets the value of the bpamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPAMT() {
        return bpamt;
    }

    /**
     * Sets the value of the bpamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPAMT(String value) {
        this.bpamt = value;
    }

    /**
     * Gets the value of the bppct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPPCT() {
        return bppct;
    }

    /**
     * Sets the value of the bppct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPPCT(String value) {
        this.bppct = value;
    }

    /**
     * Gets the value of the bpunt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPUNT() {
        return bpunt;
    }

    /**
     * Sets the value of the bpunt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPUNT(String value) {
        this.bpunt = value;
    }

    /**
     * Gets the value of the bpttx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPTTX() {
        return bpttx;
    }

    /**
     * Sets the value of the bpttx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPTTX(String value) {
        this.bpttx = value;
    }

    /**
     * Gets the value of the broll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBROLL() {
        return broll;
    }

    /**
     * Sets the value of the broll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBROLL(String value) {
        this.broll = value;
    }

    /**
     * Gets the value of the spadt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPADT() {
        return spadt;
    }

    /**
     * Sets the value of the spadt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPADT(String value) {
        this.spadt = value;
    }

    /**
     * Gets the value of the paamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAAMT() {
        return paamt;
    }

    /**
     * Sets the value of the paamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAAMT(String value) {
        this.paamt = value;
    }

    /**
     * Gets the value of the acctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCTN() {
        return acctn;
    }

    /**
     * Sets the value of the acctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCTN(String value) {
        this.acctn = value;
    }

    /**
     * Gets the value of the lifel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIFEL() {
        return lifel;
    }

    /**
     * Sets the value of the lifel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIFEL(String value) {
        this.lifel = value;
    }

    /**
     * Gets the value of the its01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITS01() {
        return its01;
    }

    /**
     * Sets the value of the its01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITS01(String value) {
        this.its01 = value;
    }

    /**
     * Gets the value of the dty01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTY01() {
        return dty01;
    }

    /**
     * Sets the value of the dty01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTY01(String value) {
        this.dty01 = value;
    }

    /**
     * Gets the value of the did01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDID01() {
        return did01;
    }

    /**
     * Sets the value of the did01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDID01(String value) {
        this.did01 = value;
    }

    /**
     * Gets the value of the bpt01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPT01() {
        return bpt01;
    }

    /**
     * Sets the value of the bpt01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPT01(String value) {
        this.bpt01 = value;
    }

    /**
     * Gets the value of the its02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITS02() {
        return its02;
    }

    /**
     * Sets the value of the its02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITS02(String value) {
        this.its02 = value;
    }

    /**
     * Gets the value of the dty02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTY02() {
        return dty02;
    }

    /**
     * Sets the value of the dty02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTY02(String value) {
        this.dty02 = value;
    }

    /**
     * Gets the value of the did02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDID02() {
        return did02;
    }

    /**
     * Sets the value of the did02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDID02(String value) {
        this.did02 = value;
    }

    /**
     * Gets the value of the bpt02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPT02() {
        return bpt02;
    }

    /**
     * Sets the value of the bpt02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPT02(String value) {
        this.bpt02 = value;
    }

    /**
     * Gets the value of the its03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITS03() {
        return its03;
    }

    /**
     * Sets the value of the its03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITS03(String value) {
        this.its03 = value;
    }

    /**
     * Gets the value of the dty03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTY03() {
        return dty03;
    }

    /**
     * Sets the value of the dty03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTY03(String value) {
        this.dty03 = value;
    }

    /**
     * Gets the value of the did03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDID03() {
        return did03;
    }

    /**
     * Sets the value of the did03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDID03(String value) {
        this.did03 = value;
    }

    /**
     * Gets the value of the bpt03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPT03() {
        return bpt03;
    }

    /**
     * Sets the value of the bpt03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPT03(String value) {
        this.bpt03 = value;
    }

    /**
     * Gets the value of the its04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITS04() {
        return its04;
    }

    /**
     * Sets the value of the its04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITS04(String value) {
        this.its04 = value;
    }

    /**
     * Gets the value of the dty04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTY04() {
        return dty04;
    }

    /**
     * Sets the value of the dty04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTY04(String value) {
        this.dty04 = value;
    }

    /**
     * Gets the value of the did04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDID04() {
        return did04;
    }

    /**
     * Sets the value of the did04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDID04(String value) {
        this.did04 = value;
    }

    /**
     * Gets the value of the bpt04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPT04() {
        return bpt04;
    }

    /**
     * Sets the value of the bpt04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPT04(String value) {
        this.bpt04 = value;
    }

    /**
     * Gets the value of the its05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITS05() {
        return its05;
    }

    /**
     * Sets the value of the its05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITS05(String value) {
        this.its05 = value;
    }

    /**
     * Gets the value of the dty05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTY05() {
        return dty05;
    }

    /**
     * Sets the value of the dty05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTY05(String value) {
        this.dty05 = value;
    }

    /**
     * Gets the value of the did05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDID05() {
        return did05;
    }

    /**
     * Sets the value of the did05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDID05(String value) {
        this.did05 = value;
    }

    /**
     * Gets the value of the bpt05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPT05() {
        return bpt05;
    }

    /**
     * Sets the value of the bpt05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPT05(String value) {
        this.bpt05 = value;
    }

    /**
     * Gets the value of the its06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITS06() {
        return its06;
    }

    /**
     * Sets the value of the its06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITS06(String value) {
        this.its06 = value;
    }

    /**
     * Gets the value of the dty06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTY06() {
        return dty06;
    }

    /**
     * Sets the value of the dty06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTY06(String value) {
        this.dty06 = value;
    }

    /**
     * Gets the value of the did06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDID06() {
        return did06;
    }

    /**
     * Sets the value of the did06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDID06(String value) {
        this.did06 = value;
    }

    /**
     * Gets the value of the bpt06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPT06() {
        return bpt06;
    }

    /**
     * Sets the value of the bpt06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPT06(String value) {
        this.bpt06 = value;
    }

    /**
     * Gets the value of the its07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITS07() {
        return its07;
    }

    /**
     * Sets the value of the its07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITS07(String value) {
        this.its07 = value;
    }

    /**
     * Gets the value of the dty07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTY07() {
        return dty07;
    }

    /**
     * Sets the value of the dty07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTY07(String value) {
        this.dty07 = value;
    }

    /**
     * Gets the value of the did07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDID07() {
        return did07;
    }

    /**
     * Sets the value of the did07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDID07(String value) {
        this.did07 = value;
    }

    /**
     * Gets the value of the bpt07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPT07() {
        return bpt07;
    }

    /**
     * Sets the value of the bpt07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPT07(String value) {
        this.bpt07 = value;
    }

    /**
     * Gets the value of the its08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITS08() {
        return its08;
    }

    /**
     * Sets the value of the its08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITS08(String value) {
        this.its08 = value;
    }

    /**
     * Gets the value of the dty08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTY08() {
        return dty08;
    }

    /**
     * Sets the value of the dty08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTY08(String value) {
        this.dty08 = value;
    }

    /**
     * Gets the value of the did08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDID08() {
        return did08;
    }

    /**
     * Sets the value of the did08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDID08(String value) {
        this.did08 = value;
    }

    /**
     * Gets the value of the bpt08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPT08() {
        return bpt08;
    }

    /**
     * Sets the value of the bpt08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPT08(String value) {
        this.bpt08 = value;
    }

    /**
     * Gets the value of the its09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITS09() {
        return its09;
    }

    /**
     * Sets the value of the its09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITS09(String value) {
        this.its09 = value;
    }

    /**
     * Gets the value of the dty09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTY09() {
        return dty09;
    }

    /**
     * Sets the value of the dty09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTY09(String value) {
        this.dty09 = value;
    }

    /**
     * Gets the value of the did09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDID09() {
        return did09;
    }

    /**
     * Sets the value of the did09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDID09(String value) {
        this.did09 = value;
    }

    /**
     * Gets the value of the bpt09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPT09() {
        return bpt09;
    }

    /**
     * Sets the value of the bpt09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPT09(String value) {
        this.bpt09 = value;
    }

    /**
     * Gets the value of the its10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITS10() {
        return its10;
    }

    /**
     * Sets the value of the its10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITS10(String value) {
        this.its10 = value;
    }

    /**
     * Gets the value of the dty10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTY10() {
        return dty10;
    }

    /**
     * Sets the value of the dty10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTY10(String value) {
        this.dty10 = value;
    }

    /**
     * Gets the value of the did10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDID10() {
        return did10;
    }

    /**
     * Sets the value of the did10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDID10(String value) {
        this.did10 = value;
    }

    /**
     * Gets the value of the bpt10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPT10() {
        return bpt10;
    }

    /**
     * Sets the value of the bpt10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPT10(String value) {
        this.bpt10 = value;
    }

    /**
     * Gets the value of the its11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITS11() {
        return its11;
    }

    /**
     * Sets the value of the its11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITS11(String value) {
        this.its11 = value;
    }

    /**
     * Gets the value of the dty11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTY11() {
        return dty11;
    }

    /**
     * Sets the value of the dty11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTY11(String value) {
        this.dty11 = value;
    }

    /**
     * Gets the value of the did11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDID11() {
        return did11;
    }

    /**
     * Sets the value of the did11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDID11(String value) {
        this.did11 = value;
    }

    /**
     * Gets the value of the bpt11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPT11() {
        return bpt11;
    }

    /**
     * Sets the value of the bpt11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPT11(String value) {
        this.bpt11 = value;
    }

    /**
     * Gets the value of the its12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITS12() {
        return its12;
    }

    /**
     * Sets the value of the its12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITS12(String value) {
        this.its12 = value;
    }

    /**
     * Gets the value of the dty12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTY12() {
        return dty12;
    }

    /**
     * Sets the value of the dty12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTY12(String value) {
        this.dty12 = value;
    }

    /**
     * Gets the value of the did12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDID12() {
        return did12;
    }

    /**
     * Sets the value of the did12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDID12(String value) {
        this.did12 = value;
    }

    /**
     * Gets the value of the bpt12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPT12() {
        return bpt12;
    }

    /**
     * Sets the value of the bpt12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPT12(String value) {
        this.bpt12 = value;
    }

    /**
     * Gets the value of the its13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITS13() {
        return its13;
    }

    /**
     * Sets the value of the its13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITS13(String value) {
        this.its13 = value;
    }

    /**
     * Gets the value of the dty13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTY13() {
        return dty13;
    }

    /**
     * Sets the value of the dty13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTY13(String value) {
        this.dty13 = value;
    }

    /**
     * Gets the value of the did13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDID13() {
        return did13;
    }

    /**
     * Sets the value of the did13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDID13(String value) {
        this.did13 = value;
    }

    /**
     * Gets the value of the bpt13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPT13() {
        return bpt13;
    }

    /**
     * Sets the value of the bpt13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPT13(String value) {
        this.bpt13 = value;
    }

    /**
     * Gets the value of the its14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITS14() {
        return its14;
    }

    /**
     * Sets the value of the its14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITS14(String value) {
        this.its14 = value;
    }

    /**
     * Gets the value of the dty14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTY14() {
        return dty14;
    }

    /**
     * Sets the value of the dty14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTY14(String value) {
        this.dty14 = value;
    }

    /**
     * Gets the value of the did14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDID14() {
        return did14;
    }

    /**
     * Sets the value of the did14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDID14(String value) {
        this.did14 = value;
    }

    /**
     * Gets the value of the bpt14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPT14() {
        return bpt14;
    }

    /**
     * Sets the value of the bpt14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPT14(String value) {
        this.bpt14 = value;
    }

    /**
     * Gets the value of the its15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITS15() {
        return its15;
    }

    /**
     * Sets the value of the its15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITS15(String value) {
        this.its15 = value;
    }

    /**
     * Gets the value of the dty15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTY15() {
        return dty15;
    }

    /**
     * Sets the value of the dty15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTY15(String value) {
        this.dty15 = value;
    }

    /**
     * Gets the value of the did15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDID15() {
        return did15;
    }

    /**
     * Sets the value of the did15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDID15(String value) {
        this.did15 = value;
    }

    /**
     * Gets the value of the bpt15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPT15() {
        return bpt15;
    }

    /**
     * Sets the value of the bpt15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPT15(String value) {
        this.bpt15 = value;
    }

    /**
     * Gets the value of the its16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITS16() {
        return its16;
    }

    /**
     * Sets the value of the its16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITS16(String value) {
        this.its16 = value;
    }

    /**
     * Gets the value of the dty16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTY16() {
        return dty16;
    }

    /**
     * Sets the value of the dty16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTY16(String value) {
        this.dty16 = value;
    }

    /**
     * Gets the value of the did16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDID16() {
        return did16;
    }

    /**
     * Sets the value of the did16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDID16(String value) {
        this.did16 = value;
    }

    /**
     * Gets the value of the bpt16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPT16() {
        return bpt16;
    }

    /**
     * Sets the value of the bpt16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPT16(String value) {
        this.bpt16 = value;
    }

    /**
     * Gets the value of the its17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITS17() {
        return its17;
    }

    /**
     * Sets the value of the its17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITS17(String value) {
        this.its17 = value;
    }

    /**
     * Gets the value of the dty17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTY17() {
        return dty17;
    }

    /**
     * Sets the value of the dty17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTY17(String value) {
        this.dty17 = value;
    }

    /**
     * Gets the value of the did17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDID17() {
        return did17;
    }

    /**
     * Sets the value of the did17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDID17(String value) {
        this.did17 = value;
    }

    /**
     * Gets the value of the bpt17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPT17() {
        return bpt17;
    }

    /**
     * Sets the value of the bpt17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPT17(String value) {
        this.bpt17 = value;
    }

    /**
     * Gets the value of the its18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITS18() {
        return its18;
    }

    /**
     * Sets the value of the its18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITS18(String value) {
        this.its18 = value;
    }

    /**
     * Gets the value of the dty18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTY18() {
        return dty18;
    }

    /**
     * Sets the value of the dty18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTY18(String value) {
        this.dty18 = value;
    }

    /**
     * Gets the value of the did18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDID18() {
        return did18;
    }

    /**
     * Sets the value of the did18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDID18(String value) {
        this.did18 = value;
    }

    /**
     * Gets the value of the bpt18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPT18() {
        return bpt18;
    }

    /**
     * Sets the value of the bpt18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPT18(String value) {
        this.bpt18 = value;
    }

    /**
     * Gets the value of the its19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITS19() {
        return its19;
    }

    /**
     * Sets the value of the its19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITS19(String value) {
        this.its19 = value;
    }

    /**
     * Gets the value of the dty19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTY19() {
        return dty19;
    }

    /**
     * Sets the value of the dty19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTY19(String value) {
        this.dty19 = value;
    }

    /**
     * Gets the value of the did19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDID19() {
        return did19;
    }

    /**
     * Sets the value of the did19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDID19(String value) {
        this.did19 = value;
    }

    /**
     * Gets the value of the bpt19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPT19() {
        return bpt19;
    }

    /**
     * Sets the value of the bpt19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPT19(String value) {
        this.bpt19 = value;
    }

    /**
     * Gets the value of the its20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITS20() {
        return its20;
    }

    /**
     * Sets the value of the its20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITS20(String value) {
        this.its20 = value;
    }

    /**
     * Gets the value of the dty20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTY20() {
        return dty20;
    }

    /**
     * Sets the value of the dty20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTY20(String value) {
        this.dty20 = value;
    }

    /**
     * Gets the value of the did20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDID20() {
        return did20;
    }

    /**
     * Sets the value of the did20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDID20(String value) {
        this.did20 = value;
    }

    /**
     * Gets the value of the bpt20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPT20() {
        return bpt20;
    }

    /**
     * Sets the value of the bpt20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPT20(String value) {
        this.bpt20 = value;
    }

    /**
     * Gets the value of the cis01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIS01() {
        return cis01;
    }

    /**
     * Sets the value of the cis01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIS01(String value) {
        this.cis01 = value;
    }

    /**
     * Gets the value of the cty01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTY01() {
        return cty01;
    }

    /**
     * Sets the value of the cty01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTY01(String value) {
        this.cty01 = value;
    }

    /**
     * Gets the value of the cid01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCID01() {
        return cid01;
    }

    /**
     * Sets the value of the cid01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCID01(String value) {
        this.cid01 = value;
    }

    /**
     * Gets the value of the cpt01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPT01() {
        return cpt01;
    }

    /**
     * Sets the value of the cpt01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPT01(String value) {
        this.cpt01 = value;
    }

    /**
     * Gets the value of the cis02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIS02() {
        return cis02;
    }

    /**
     * Sets the value of the cis02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIS02(String value) {
        this.cis02 = value;
    }

    /**
     * Gets the value of the cty02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTY02() {
        return cty02;
    }

    /**
     * Sets the value of the cty02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTY02(String value) {
        this.cty02 = value;
    }

    /**
     * Gets the value of the cid02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCID02() {
        return cid02;
    }

    /**
     * Sets the value of the cid02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCID02(String value) {
        this.cid02 = value;
    }

    /**
     * Gets the value of the cpt02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPT02() {
        return cpt02;
    }

    /**
     * Sets the value of the cpt02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPT02(String value) {
        this.cpt02 = value;
    }

    /**
     * Gets the value of the cis03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIS03() {
        return cis03;
    }

    /**
     * Sets the value of the cis03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIS03(String value) {
        this.cis03 = value;
    }

    /**
     * Gets the value of the cty03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTY03() {
        return cty03;
    }

    /**
     * Sets the value of the cty03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTY03(String value) {
        this.cty03 = value;
    }

    /**
     * Gets the value of the cid03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCID03() {
        return cid03;
    }

    /**
     * Sets the value of the cid03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCID03(String value) {
        this.cid03 = value;
    }

    /**
     * Gets the value of the cpt03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPT03() {
        return cpt03;
    }

    /**
     * Sets the value of the cpt03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPT03(String value) {
        this.cpt03 = value;
    }

    /**
     * Gets the value of the cis04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIS04() {
        return cis04;
    }

    /**
     * Sets the value of the cis04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIS04(String value) {
        this.cis04 = value;
    }

    /**
     * Gets the value of the cty04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTY04() {
        return cty04;
    }

    /**
     * Sets the value of the cty04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTY04(String value) {
        this.cty04 = value;
    }

    /**
     * Gets the value of the cid04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCID04() {
        return cid04;
    }

    /**
     * Sets the value of the cid04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCID04(String value) {
        this.cid04 = value;
    }

    /**
     * Gets the value of the cpt04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPT04() {
        return cpt04;
    }

    /**
     * Sets the value of the cpt04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPT04(String value) {
        this.cpt04 = value;
    }

    /**
     * Gets the value of the cis05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIS05() {
        return cis05;
    }

    /**
     * Sets the value of the cis05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIS05(String value) {
        this.cis05 = value;
    }

    /**
     * Gets the value of the cty05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTY05() {
        return cty05;
    }

    /**
     * Sets the value of the cty05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTY05(String value) {
        this.cty05 = value;
    }

    /**
     * Gets the value of the cid05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCID05() {
        return cid05;
    }

    /**
     * Sets the value of the cid05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCID05(String value) {
        this.cid05 = value;
    }

    /**
     * Gets the value of the cpt05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPT05() {
        return cpt05;
    }

    /**
     * Sets the value of the cpt05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPT05(String value) {
        this.cpt05 = value;
    }

    /**
     * Gets the value of the cis06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIS06() {
        return cis06;
    }

    /**
     * Sets the value of the cis06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIS06(String value) {
        this.cis06 = value;
    }

    /**
     * Gets the value of the cty06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTY06() {
        return cty06;
    }

    /**
     * Sets the value of the cty06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTY06(String value) {
        this.cty06 = value;
    }

    /**
     * Gets the value of the cid06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCID06() {
        return cid06;
    }

    /**
     * Sets the value of the cid06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCID06(String value) {
        this.cid06 = value;
    }

    /**
     * Gets the value of the cpt06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPT06() {
        return cpt06;
    }

    /**
     * Sets the value of the cpt06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPT06(String value) {
        this.cpt06 = value;
    }

    /**
     * Gets the value of the cis07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIS07() {
        return cis07;
    }

    /**
     * Sets the value of the cis07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIS07(String value) {
        this.cis07 = value;
    }

    /**
     * Gets the value of the cty07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTY07() {
        return cty07;
    }

    /**
     * Sets the value of the cty07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTY07(String value) {
        this.cty07 = value;
    }

    /**
     * Gets the value of the cid07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCID07() {
        return cid07;
    }

    /**
     * Sets the value of the cid07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCID07(String value) {
        this.cid07 = value;
    }

    /**
     * Gets the value of the cpt07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPT07() {
        return cpt07;
    }

    /**
     * Sets the value of the cpt07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPT07(String value) {
        this.cpt07 = value;
    }

    /**
     * Gets the value of the cis08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIS08() {
        return cis08;
    }

    /**
     * Sets the value of the cis08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIS08(String value) {
        this.cis08 = value;
    }

    /**
     * Gets the value of the cty08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTY08() {
        return cty08;
    }

    /**
     * Sets the value of the cty08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTY08(String value) {
        this.cty08 = value;
    }

    /**
     * Gets the value of the cid08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCID08() {
        return cid08;
    }

    /**
     * Sets the value of the cid08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCID08(String value) {
        this.cid08 = value;
    }

    /**
     * Gets the value of the cpt08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPT08() {
        return cpt08;
    }

    /**
     * Sets the value of the cpt08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPT08(String value) {
        this.cpt08 = value;
    }

    /**
     * Gets the value of the cis09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIS09() {
        return cis09;
    }

    /**
     * Sets the value of the cis09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIS09(String value) {
        this.cis09 = value;
    }

    /**
     * Gets the value of the cty09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTY09() {
        return cty09;
    }

    /**
     * Sets the value of the cty09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTY09(String value) {
        this.cty09 = value;
    }

    /**
     * Gets the value of the cid09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCID09() {
        return cid09;
    }

    /**
     * Sets the value of the cid09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCID09(String value) {
        this.cid09 = value;
    }

    /**
     * Gets the value of the cpt09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPT09() {
        return cpt09;
    }

    /**
     * Sets the value of the cpt09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPT09(String value) {
        this.cpt09 = value;
    }

    /**
     * Gets the value of the cis10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIS10() {
        return cis10;
    }

    /**
     * Sets the value of the cis10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIS10(String value) {
        this.cis10 = value;
    }

    /**
     * Gets the value of the cty10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTY10() {
        return cty10;
    }

    /**
     * Sets the value of the cty10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTY10(String value) {
        this.cty10 = value;
    }

    /**
     * Gets the value of the cid10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCID10() {
        return cid10;
    }

    /**
     * Sets the value of the cid10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCID10(String value) {
        this.cid10 = value;
    }

    /**
     * Gets the value of the cpt10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPT10() {
        return cpt10;
    }

    /**
     * Sets the value of the cpt10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPT10(String value) {
        this.cpt10 = value;
    }

    /**
     * Gets the value of the curre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRE() {
        return curre;
    }

    /**
     * Sets the value of the curre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRE(String value) {
        this.curre = value;
    }

    /**
     * Gets the value of the inv01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINV01() {
        return inv01;
    }

    /**
     * Sets the value of the inv01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINV01(String value) {
        this.inv01 = value;
    }

    /**
     * Gets the value of the ipt01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPT01() {
        return ipt01;
    }

    /**
     * Sets the value of the ipt01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPT01(String value) {
        this.ipt01 = value;
    }

    /**
     * Gets the value of the iam01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIAM01() {
        return iam01;
    }

    /**
     * Sets the value of the iam01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIAM01(String value) {
        this.iam01 = value;
    }

    /**
     * Gets the value of the inv02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINV02() {
        return inv02;
    }

    /**
     * Sets the value of the inv02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINV02(String value) {
        this.inv02 = value;
    }

    /**
     * Gets the value of the ipt02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPT02() {
        return ipt02;
    }

    /**
     * Sets the value of the ipt02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPT02(String value) {
        this.ipt02 = value;
    }

    /**
     * Gets the value of the iam02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIAM02() {
        return iam02;
    }

    /**
     * Sets the value of the iam02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIAM02(String value) {
        this.iam02 = value;
    }

    /**
     * Gets the value of the inv03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINV03() {
        return inv03;
    }

    /**
     * Sets the value of the inv03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINV03(String value) {
        this.inv03 = value;
    }

    /**
     * Gets the value of the ipt03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPT03() {
        return ipt03;
    }

    /**
     * Sets the value of the ipt03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPT03(String value) {
        this.ipt03 = value;
    }

    /**
     * Gets the value of the iam03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIAM03() {
        return iam03;
    }

    /**
     * Sets the value of the iam03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIAM03(String value) {
        this.iam03 = value;
    }

    /**
     * Gets the value of the inv04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINV04() {
        return inv04;
    }

    /**
     * Sets the value of the inv04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINV04(String value) {
        this.inv04 = value;
    }

    /**
     * Gets the value of the ipt04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPT04() {
        return ipt04;
    }

    /**
     * Sets the value of the ipt04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPT04(String value) {
        this.ipt04 = value;
    }

    /**
     * Gets the value of the iam04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIAM04() {
        return iam04;
    }

    /**
     * Sets the value of the iam04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIAM04(String value) {
        this.iam04 = value;
    }

    /**
     * Gets the value of the inv05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINV05() {
        return inv05;
    }

    /**
     * Sets the value of the inv05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINV05(String value) {
        this.inv05 = value;
    }

    /**
     * Gets the value of the ipt05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPT05() {
        return ipt05;
    }

    /**
     * Sets the value of the ipt05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPT05(String value) {
        this.ipt05 = value;
    }

    /**
     * Gets the value of the iam05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIAM05() {
        return iam05;
    }

    /**
     * Sets the value of the iam05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIAM05(String value) {
        this.iam05 = value;
    }

    /**
     * Gets the value of the inv06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINV06() {
        return inv06;
    }

    /**
     * Sets the value of the inv06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINV06(String value) {
        this.inv06 = value;
    }

    /**
     * Gets the value of the ipt06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPT06() {
        return ipt06;
    }

    /**
     * Sets the value of the ipt06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPT06(String value) {
        this.ipt06 = value;
    }

    /**
     * Gets the value of the iam06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIAM06() {
        return iam06;
    }

    /**
     * Sets the value of the iam06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIAM06(String value) {
        this.iam06 = value;
    }

    /**
     * Gets the value of the inv07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINV07() {
        return inv07;
    }

    /**
     * Sets the value of the inv07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINV07(String value) {
        this.inv07 = value;
    }

    /**
     * Gets the value of the ipt07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPT07() {
        return ipt07;
    }

    /**
     * Sets the value of the ipt07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPT07(String value) {
        this.ipt07 = value;
    }

    /**
     * Gets the value of the iam07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIAM07() {
        return iam07;
    }

    /**
     * Sets the value of the iam07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIAM07(String value) {
        this.iam07 = value;
    }

    /**
     * Gets the value of the inv08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINV08() {
        return inv08;
    }

    /**
     * Sets the value of the inv08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINV08(String value) {
        this.inv08 = value;
    }

    /**
     * Gets the value of the ipt08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPT08() {
        return ipt08;
    }

    /**
     * Sets the value of the ipt08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPT08(String value) {
        this.ipt08 = value;
    }

    /**
     * Gets the value of the iam08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIAM08() {
        return iam08;
    }

    /**
     * Sets the value of the iam08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIAM08(String value) {
        this.iam08 = value;
    }

    /**
     * Gets the value of the inv09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINV09() {
        return inv09;
    }

    /**
     * Sets the value of the inv09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINV09(String value) {
        this.inv09 = value;
    }

    /**
     * Gets the value of the ipt09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPT09() {
        return ipt09;
    }

    /**
     * Sets the value of the ipt09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPT09(String value) {
        this.ipt09 = value;
    }

    /**
     * Gets the value of the iam09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIAM09() {
        return iam09;
    }

    /**
     * Sets the value of the iam09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIAM09(String value) {
        this.iam09 = value;
    }

    /**
     * Gets the value of the inv10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINV10() {
        return inv10;
    }

    /**
     * Sets the value of the inv10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINV10(String value) {
        this.inv10 = value;
    }

    /**
     * Gets the value of the ipt10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPT10() {
        return ipt10;
    }

    /**
     * Sets the value of the ipt10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPT10(String value) {
        this.ipt10 = value;
    }

    /**
     * Gets the value of the iam10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIAM10() {
        return iam10;
    }

    /**
     * Sets the value of the iam10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIAM10(String value) {
        this.iam10 = value;
    }

    /**
     * Gets the value of the inv11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINV11() {
        return inv11;
    }

    /**
     * Sets the value of the inv11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINV11(String value) {
        this.inv11 = value;
    }

    /**
     * Gets the value of the ipt11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPT11() {
        return ipt11;
    }

    /**
     * Sets the value of the ipt11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPT11(String value) {
        this.ipt11 = value;
    }

    /**
     * Gets the value of the iam11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIAM11() {
        return iam11;
    }

    /**
     * Sets the value of the iam11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIAM11(String value) {
        this.iam11 = value;
    }

    /**
     * Gets the value of the inv12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINV12() {
        return inv12;
    }

    /**
     * Sets the value of the inv12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINV12(String value) {
        this.inv12 = value;
    }

    /**
     * Gets the value of the ipt12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPT12() {
        return ipt12;
    }

    /**
     * Sets the value of the ipt12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPT12(String value) {
        this.ipt12 = value;
    }

    /**
     * Gets the value of the iam12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIAM12() {
        return iam12;
    }

    /**
     * Sets the value of the iam12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIAM12(String value) {
        this.iam12 = value;
    }

    /**
     * Gets the value of the inv13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINV13() {
        return inv13;
    }

    /**
     * Sets the value of the inv13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINV13(String value) {
        this.inv13 = value;
    }

    /**
     * Gets the value of the ipt13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPT13() {
        return ipt13;
    }

    /**
     * Sets the value of the ipt13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPT13(String value) {
        this.ipt13 = value;
    }

    /**
     * Gets the value of the iam13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIAM13() {
        return iam13;
    }

    /**
     * Sets the value of the iam13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIAM13(String value) {
        this.iam13 = value;
    }

    /**
     * Gets the value of the inv14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINV14() {
        return inv14;
    }

    /**
     * Sets the value of the inv14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINV14(String value) {
        this.inv14 = value;
    }

    /**
     * Gets the value of the ipt14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPT14() {
        return ipt14;
    }

    /**
     * Sets the value of the ipt14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPT14(String value) {
        this.ipt14 = value;
    }

    /**
     * Gets the value of the iam14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIAM14() {
        return iam14;
    }

    /**
     * Sets the value of the iam14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIAM14(String value) {
        this.iam14 = value;
    }

    /**
     * Gets the value of the inv15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINV15() {
        return inv15;
    }

    /**
     * Sets the value of the inv15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINV15(String value) {
        this.inv15 = value;
    }

    /**
     * Gets the value of the ipt15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPT15() {
        return ipt15;
    }

    /**
     * Sets the value of the ipt15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPT15(String value) {
        this.ipt15 = value;
    }

    /**
     * Gets the value of the iam15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIAM15() {
        return iam15;
    }

    /**
     * Sets the value of the iam15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIAM15(String value) {
        this.iam15 = value;
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
     * Gets the value of the e1Q0169 property.
     * 
     * @return
     *     possible object is
     *     {@link E1Q0169 }
     *     
     */
    public E1Q0169 getE1Q0169() {
        return e1Q0169;
    }

    /**
     * Sets the value of the e1Q0169 property.
     * 
     * @param value
     *     allowed object is
     *     {@link E1Q0169 }
     *     
     */
    public void setE1Q0169(E1Q0169 value) {
        this.e1Q0169 = value;
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
