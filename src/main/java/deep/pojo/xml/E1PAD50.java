
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
 *         &lt;element name="RSIGN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RELAT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
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
 *         &lt;element name="SCLAS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SOBID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="45"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PROZT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EVATY" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT00" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT21" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT22" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT23" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT24" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT25" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT26" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT27" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT28" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT29" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT30" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT31" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT32" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT33" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT34" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT35" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT36" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT37" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT38" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT39" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT40" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT41" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT42" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT43" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT44" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT45" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT46" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT47" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT48" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT49" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT50" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT51" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT52" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT53" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT54" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT55" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT56" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT57" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT58" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT59" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT60" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT61" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT62" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT63" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT64" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT65" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT66" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT67" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT68" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT69" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT70" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT71" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT72" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT73" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT74" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRT75" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="2"/&gt;
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
    "rsign",
    "relat",
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
    "sclas",
    "sobid",
    "prozt",
    "evaty",
    "crt00",
    "crt01",
    "crt02",
    "crt03",
    "crt04",
    "crt05",
    "crt06",
    "crt07",
    "crt08",
    "crt09",
    "crt10",
    "crt11",
    "crt12",
    "crt13",
    "crt14",
    "crt15",
    "crt16",
    "crt17",
    "crt18",
    "crt19",
    "crt20",
    "crt21",
    "crt22",
    "crt23",
    "crt24",
    "crt25",
    "crt26",
    "crt27",
    "crt28",
    "crt29",
    "crt30",
    "crt31",
    "crt32",
    "crt33",
    "crt34",
    "crt35",
    "crt36",
    "crt37",
    "crt38",
    "crt39",
    "crt40",
    "crt41",
    "crt42",
    "crt43",
    "crt44",
    "crt45",
    "crt46",
    "crt47",
    "crt48",
    "crt49",
    "crt50",
    "crt51",
    "crt52",
    "crt53",
    "crt54",
    "crt55",
    "crt56",
    "crt57",
    "crt58",
    "crt59",
    "crt60",
    "crt61",
    "crt62",
    "crt63",
    "crt64",
    "crt65",
    "crt66",
    "crt67",
    "crt68",
    "crt69",
    "crt70",
    "crt71",
    "crt72",
    "crt73",
    "crt74",
    "crt75"
})
public class E1PAD50 {

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
    @XmlElement(name = "RSIGN")
    protected String rsign;
    @XmlElement(name = "RELAT")
    protected String relat;
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
    @XmlElement(name = "SCLAS")
    protected String sclas;
    @XmlElement(name = "SOBID")
    protected String sobid;
    @XmlElement(name = "PROZT")
    protected String prozt;
    @XmlElement(name = "EVATY")
    protected String evaty;
    @XmlElement(name = "CRT00")
    protected String crt00;
    @XmlElement(name = "CRT01")
    protected String crt01;
    @XmlElement(name = "CRT02")
    protected String crt02;
    @XmlElement(name = "CRT03")
    protected String crt03;
    @XmlElement(name = "CRT04")
    protected String crt04;
    @XmlElement(name = "CRT05")
    protected String crt05;
    @XmlElement(name = "CRT06")
    protected String crt06;
    @XmlElement(name = "CRT07")
    protected String crt07;
    @XmlElement(name = "CRT08")
    protected String crt08;
    @XmlElement(name = "CRT09")
    protected String crt09;
    @XmlElement(name = "CRT10")
    protected String crt10;
    @XmlElement(name = "CRT11")
    protected String crt11;
    @XmlElement(name = "CRT12")
    protected String crt12;
    @XmlElement(name = "CRT13")
    protected String crt13;
    @XmlElement(name = "CRT14")
    protected String crt14;
    @XmlElement(name = "CRT15")
    protected String crt15;
    @XmlElement(name = "CRT16")
    protected String crt16;
    @XmlElement(name = "CRT17")
    protected String crt17;
    @XmlElement(name = "CRT18")
    protected String crt18;
    @XmlElement(name = "CRT19")
    protected String crt19;
    @XmlElement(name = "CRT20")
    protected String crt20;
    @XmlElement(name = "CRT21")
    protected String crt21;
    @XmlElement(name = "CRT22")
    protected String crt22;
    @XmlElement(name = "CRT23")
    protected String crt23;
    @XmlElement(name = "CRT24")
    protected String crt24;
    @XmlElement(name = "CRT25")
    protected String crt25;
    @XmlElement(name = "CRT26")
    protected String crt26;
    @XmlElement(name = "CRT27")
    protected String crt27;
    @XmlElement(name = "CRT28")
    protected String crt28;
    @XmlElement(name = "CRT29")
    protected String crt29;
    @XmlElement(name = "CRT30")
    protected String crt30;
    @XmlElement(name = "CRT31")
    protected String crt31;
    @XmlElement(name = "CRT32")
    protected String crt32;
    @XmlElement(name = "CRT33")
    protected String crt33;
    @XmlElement(name = "CRT34")
    protected String crt34;
    @XmlElement(name = "CRT35")
    protected String crt35;
    @XmlElement(name = "CRT36")
    protected String crt36;
    @XmlElement(name = "CRT37")
    protected String crt37;
    @XmlElement(name = "CRT38")
    protected String crt38;
    @XmlElement(name = "CRT39")
    protected String crt39;
    @XmlElement(name = "CRT40")
    protected String crt40;
    @XmlElement(name = "CRT41")
    protected String crt41;
    @XmlElement(name = "CRT42")
    protected String crt42;
    @XmlElement(name = "CRT43")
    protected String crt43;
    @XmlElement(name = "CRT44")
    protected String crt44;
    @XmlElement(name = "CRT45")
    protected String crt45;
    @XmlElement(name = "CRT46")
    protected String crt46;
    @XmlElement(name = "CRT47")
    protected String crt47;
    @XmlElement(name = "CRT48")
    protected String crt48;
    @XmlElement(name = "CRT49")
    protected String crt49;
    @XmlElement(name = "CRT50")
    protected String crt50;
    @XmlElement(name = "CRT51")
    protected String crt51;
    @XmlElement(name = "CRT52")
    protected String crt52;
    @XmlElement(name = "CRT53")
    protected String crt53;
    @XmlElement(name = "CRT54")
    protected String crt54;
    @XmlElement(name = "CRT55")
    protected String crt55;
    @XmlElement(name = "CRT56")
    protected String crt56;
    @XmlElement(name = "CRT57")
    protected String crt57;
    @XmlElement(name = "CRT58")
    protected String crt58;
    @XmlElement(name = "CRT59")
    protected String crt59;
    @XmlElement(name = "CRT60")
    protected String crt60;
    @XmlElement(name = "CRT61")
    protected String crt61;
    @XmlElement(name = "CRT62")
    protected String crt62;
    @XmlElement(name = "CRT63")
    protected String crt63;
    @XmlElement(name = "CRT64")
    protected String crt64;
    @XmlElement(name = "CRT65")
    protected String crt65;
    @XmlElement(name = "CRT66")
    protected String crt66;
    @XmlElement(name = "CRT67")
    protected String crt67;
    @XmlElement(name = "CRT68")
    protected String crt68;
    @XmlElement(name = "CRT69")
    protected String crt69;
    @XmlElement(name = "CRT70")
    protected String crt70;
    @XmlElement(name = "CRT71")
    protected String crt71;
    @XmlElement(name = "CRT72")
    protected String crt72;
    @XmlElement(name = "CRT73")
    protected String crt73;
    @XmlElement(name = "CRT74")
    protected String crt74;
    @XmlElement(name = "CRT75")
    protected String crt75;
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
     * Gets the value of the rsign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSIGN() {
        return rsign;
    }

    /**
     * Sets the value of the rsign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSIGN(String value) {
        this.rsign = value;
    }

    /**
     * Gets the value of the relat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRELAT() {
        return relat;
    }

    /**
     * Sets the value of the relat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRELAT(String value) {
        this.relat = value;
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
     * Gets the value of the sclas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCLAS() {
        return sclas;
    }

    /**
     * Sets the value of the sclas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCLAS(String value) {
        this.sclas = value;
    }

    /**
     * Gets the value of the sobid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOBID() {
        return sobid;
    }

    /**
     * Sets the value of the sobid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOBID(String value) {
        this.sobid = value;
    }

    /**
     * Gets the value of the prozt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROZT() {
        return prozt;
    }

    /**
     * Sets the value of the prozt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROZT(String value) {
        this.prozt = value;
    }

    /**
     * Gets the value of the evaty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEVATY() {
        return evaty;
    }

    /**
     * Sets the value of the evaty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEVATY(String value) {
        this.evaty = value;
    }

    /**
     * Gets the value of the crt00 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT00() {
        return crt00;
    }

    /**
     * Sets the value of the crt00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT00(String value) {
        this.crt00 = value;
    }

    /**
     * Gets the value of the crt01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT01() {
        return crt01;
    }

    /**
     * Sets the value of the crt01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT01(String value) {
        this.crt01 = value;
    }

    /**
     * Gets the value of the crt02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT02() {
        return crt02;
    }

    /**
     * Sets the value of the crt02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT02(String value) {
        this.crt02 = value;
    }

    /**
     * Gets the value of the crt03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT03() {
        return crt03;
    }

    /**
     * Sets the value of the crt03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT03(String value) {
        this.crt03 = value;
    }

    /**
     * Gets the value of the crt04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT04() {
        return crt04;
    }

    /**
     * Sets the value of the crt04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT04(String value) {
        this.crt04 = value;
    }

    /**
     * Gets the value of the crt05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT05() {
        return crt05;
    }

    /**
     * Sets the value of the crt05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT05(String value) {
        this.crt05 = value;
    }

    /**
     * Gets the value of the crt06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT06() {
        return crt06;
    }

    /**
     * Sets the value of the crt06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT06(String value) {
        this.crt06 = value;
    }

    /**
     * Gets the value of the crt07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT07() {
        return crt07;
    }

    /**
     * Sets the value of the crt07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT07(String value) {
        this.crt07 = value;
    }

    /**
     * Gets the value of the crt08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT08() {
        return crt08;
    }

    /**
     * Sets the value of the crt08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT08(String value) {
        this.crt08 = value;
    }

    /**
     * Gets the value of the crt09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT09() {
        return crt09;
    }

    /**
     * Sets the value of the crt09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT09(String value) {
        this.crt09 = value;
    }

    /**
     * Gets the value of the crt10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT10() {
        return crt10;
    }

    /**
     * Sets the value of the crt10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT10(String value) {
        this.crt10 = value;
    }

    /**
     * Gets the value of the crt11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT11() {
        return crt11;
    }

    /**
     * Sets the value of the crt11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT11(String value) {
        this.crt11 = value;
    }

    /**
     * Gets the value of the crt12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT12() {
        return crt12;
    }

    /**
     * Sets the value of the crt12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT12(String value) {
        this.crt12 = value;
    }

    /**
     * Gets the value of the crt13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT13() {
        return crt13;
    }

    /**
     * Sets the value of the crt13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT13(String value) {
        this.crt13 = value;
    }

    /**
     * Gets the value of the crt14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT14() {
        return crt14;
    }

    /**
     * Sets the value of the crt14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT14(String value) {
        this.crt14 = value;
    }

    /**
     * Gets the value of the crt15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT15() {
        return crt15;
    }

    /**
     * Sets the value of the crt15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT15(String value) {
        this.crt15 = value;
    }

    /**
     * Gets the value of the crt16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT16() {
        return crt16;
    }

    /**
     * Sets the value of the crt16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT16(String value) {
        this.crt16 = value;
    }

    /**
     * Gets the value of the crt17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT17() {
        return crt17;
    }

    /**
     * Sets the value of the crt17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT17(String value) {
        this.crt17 = value;
    }

    /**
     * Gets the value of the crt18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT18() {
        return crt18;
    }

    /**
     * Sets the value of the crt18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT18(String value) {
        this.crt18 = value;
    }

    /**
     * Gets the value of the crt19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT19() {
        return crt19;
    }

    /**
     * Sets the value of the crt19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT19(String value) {
        this.crt19 = value;
    }

    /**
     * Gets the value of the crt20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT20() {
        return crt20;
    }

    /**
     * Sets the value of the crt20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT20(String value) {
        this.crt20 = value;
    }

    /**
     * Gets the value of the crt21 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT21() {
        return crt21;
    }

    /**
     * Sets the value of the crt21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT21(String value) {
        this.crt21 = value;
    }

    /**
     * Gets the value of the crt22 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT22() {
        return crt22;
    }

    /**
     * Sets the value of the crt22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT22(String value) {
        this.crt22 = value;
    }

    /**
     * Gets the value of the crt23 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT23() {
        return crt23;
    }

    /**
     * Sets the value of the crt23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT23(String value) {
        this.crt23 = value;
    }

    /**
     * Gets the value of the crt24 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT24() {
        return crt24;
    }

    /**
     * Sets the value of the crt24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT24(String value) {
        this.crt24 = value;
    }

    /**
     * Gets the value of the crt25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT25() {
        return crt25;
    }

    /**
     * Sets the value of the crt25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT25(String value) {
        this.crt25 = value;
    }

    /**
     * Gets the value of the crt26 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT26() {
        return crt26;
    }

    /**
     * Sets the value of the crt26 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT26(String value) {
        this.crt26 = value;
    }

    /**
     * Gets the value of the crt27 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT27() {
        return crt27;
    }

    /**
     * Sets the value of the crt27 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT27(String value) {
        this.crt27 = value;
    }

    /**
     * Gets the value of the crt28 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT28() {
        return crt28;
    }

    /**
     * Sets the value of the crt28 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT28(String value) {
        this.crt28 = value;
    }

    /**
     * Gets the value of the crt29 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT29() {
        return crt29;
    }

    /**
     * Sets the value of the crt29 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT29(String value) {
        this.crt29 = value;
    }

    /**
     * Gets the value of the crt30 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT30() {
        return crt30;
    }

    /**
     * Sets the value of the crt30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT30(String value) {
        this.crt30 = value;
    }

    /**
     * Gets the value of the crt31 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT31() {
        return crt31;
    }

    /**
     * Sets the value of the crt31 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT31(String value) {
        this.crt31 = value;
    }

    /**
     * Gets the value of the crt32 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT32() {
        return crt32;
    }

    /**
     * Sets the value of the crt32 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT32(String value) {
        this.crt32 = value;
    }

    /**
     * Gets the value of the crt33 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT33() {
        return crt33;
    }

    /**
     * Sets the value of the crt33 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT33(String value) {
        this.crt33 = value;
    }

    /**
     * Gets the value of the crt34 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT34() {
        return crt34;
    }

    /**
     * Sets the value of the crt34 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT34(String value) {
        this.crt34 = value;
    }

    /**
     * Gets the value of the crt35 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT35() {
        return crt35;
    }

    /**
     * Sets the value of the crt35 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT35(String value) {
        this.crt35 = value;
    }

    /**
     * Gets the value of the crt36 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT36() {
        return crt36;
    }

    /**
     * Sets the value of the crt36 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT36(String value) {
        this.crt36 = value;
    }

    /**
     * Gets the value of the crt37 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT37() {
        return crt37;
    }

    /**
     * Sets the value of the crt37 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT37(String value) {
        this.crt37 = value;
    }

    /**
     * Gets the value of the crt38 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT38() {
        return crt38;
    }

    /**
     * Sets the value of the crt38 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT38(String value) {
        this.crt38 = value;
    }

    /**
     * Gets the value of the crt39 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT39() {
        return crt39;
    }

    /**
     * Sets the value of the crt39 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT39(String value) {
        this.crt39 = value;
    }

    /**
     * Gets the value of the crt40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT40() {
        return crt40;
    }

    /**
     * Sets the value of the crt40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT40(String value) {
        this.crt40 = value;
    }

    /**
     * Gets the value of the crt41 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT41() {
        return crt41;
    }

    /**
     * Sets the value of the crt41 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT41(String value) {
        this.crt41 = value;
    }

    /**
     * Gets the value of the crt42 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT42() {
        return crt42;
    }

    /**
     * Sets the value of the crt42 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT42(String value) {
        this.crt42 = value;
    }

    /**
     * Gets the value of the crt43 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT43() {
        return crt43;
    }

    /**
     * Sets the value of the crt43 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT43(String value) {
        this.crt43 = value;
    }

    /**
     * Gets the value of the crt44 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT44() {
        return crt44;
    }

    /**
     * Sets the value of the crt44 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT44(String value) {
        this.crt44 = value;
    }

    /**
     * Gets the value of the crt45 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT45() {
        return crt45;
    }

    /**
     * Sets the value of the crt45 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT45(String value) {
        this.crt45 = value;
    }

    /**
     * Gets the value of the crt46 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT46() {
        return crt46;
    }

    /**
     * Sets the value of the crt46 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT46(String value) {
        this.crt46 = value;
    }

    /**
     * Gets the value of the crt47 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT47() {
        return crt47;
    }

    /**
     * Sets the value of the crt47 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT47(String value) {
        this.crt47 = value;
    }

    /**
     * Gets the value of the crt48 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT48() {
        return crt48;
    }

    /**
     * Sets the value of the crt48 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT48(String value) {
        this.crt48 = value;
    }

    /**
     * Gets the value of the crt49 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT49() {
        return crt49;
    }

    /**
     * Sets the value of the crt49 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT49(String value) {
        this.crt49 = value;
    }

    /**
     * Gets the value of the crt50 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT50() {
        return crt50;
    }

    /**
     * Sets the value of the crt50 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT50(String value) {
        this.crt50 = value;
    }

    /**
     * Gets the value of the crt51 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT51() {
        return crt51;
    }

    /**
     * Sets the value of the crt51 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT51(String value) {
        this.crt51 = value;
    }

    /**
     * Gets the value of the crt52 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT52() {
        return crt52;
    }

    /**
     * Sets the value of the crt52 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT52(String value) {
        this.crt52 = value;
    }

    /**
     * Gets the value of the crt53 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT53() {
        return crt53;
    }

    /**
     * Sets the value of the crt53 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT53(String value) {
        this.crt53 = value;
    }

    /**
     * Gets the value of the crt54 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT54() {
        return crt54;
    }

    /**
     * Sets the value of the crt54 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT54(String value) {
        this.crt54 = value;
    }

    /**
     * Gets the value of the crt55 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT55() {
        return crt55;
    }

    /**
     * Sets the value of the crt55 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT55(String value) {
        this.crt55 = value;
    }

    /**
     * Gets the value of the crt56 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT56() {
        return crt56;
    }

    /**
     * Sets the value of the crt56 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT56(String value) {
        this.crt56 = value;
    }

    /**
     * Gets the value of the crt57 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT57() {
        return crt57;
    }

    /**
     * Sets the value of the crt57 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT57(String value) {
        this.crt57 = value;
    }

    /**
     * Gets the value of the crt58 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT58() {
        return crt58;
    }

    /**
     * Sets the value of the crt58 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT58(String value) {
        this.crt58 = value;
    }

    /**
     * Gets the value of the crt59 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT59() {
        return crt59;
    }

    /**
     * Sets the value of the crt59 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT59(String value) {
        this.crt59 = value;
    }

    /**
     * Gets the value of the crt60 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT60() {
        return crt60;
    }

    /**
     * Sets the value of the crt60 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT60(String value) {
        this.crt60 = value;
    }

    /**
     * Gets the value of the crt61 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT61() {
        return crt61;
    }

    /**
     * Sets the value of the crt61 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT61(String value) {
        this.crt61 = value;
    }

    /**
     * Gets the value of the crt62 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT62() {
        return crt62;
    }

    /**
     * Sets the value of the crt62 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT62(String value) {
        this.crt62 = value;
    }

    /**
     * Gets the value of the crt63 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT63() {
        return crt63;
    }

    /**
     * Sets the value of the crt63 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT63(String value) {
        this.crt63 = value;
    }

    /**
     * Gets the value of the crt64 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT64() {
        return crt64;
    }

    /**
     * Sets the value of the crt64 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT64(String value) {
        this.crt64 = value;
    }

    /**
     * Gets the value of the crt65 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT65() {
        return crt65;
    }

    /**
     * Sets the value of the crt65 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT65(String value) {
        this.crt65 = value;
    }

    /**
     * Gets the value of the crt66 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT66() {
        return crt66;
    }

    /**
     * Sets the value of the crt66 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT66(String value) {
        this.crt66 = value;
    }

    /**
     * Gets the value of the crt67 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT67() {
        return crt67;
    }

    /**
     * Sets the value of the crt67 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT67(String value) {
        this.crt67 = value;
    }

    /**
     * Gets the value of the crt68 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT68() {
        return crt68;
    }

    /**
     * Sets the value of the crt68 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT68(String value) {
        this.crt68 = value;
    }

    /**
     * Gets the value of the crt69 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT69() {
        return crt69;
    }

    /**
     * Sets the value of the crt69 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT69(String value) {
        this.crt69 = value;
    }

    /**
     * Gets the value of the crt70 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT70() {
        return crt70;
    }

    /**
     * Sets the value of the crt70 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT70(String value) {
        this.crt70 = value;
    }

    /**
     * Gets the value of the crt71 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT71() {
        return crt71;
    }

    /**
     * Sets the value of the crt71 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT71(String value) {
        this.crt71 = value;
    }

    /**
     * Gets the value of the crt72 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT72() {
        return crt72;
    }

    /**
     * Sets the value of the crt72 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT72(String value) {
        this.crt72 = value;
    }

    /**
     * Gets the value of the crt73 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT73() {
        return crt73;
    }

    /**
     * Sets the value of the crt73 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT73(String value) {
        this.crt73 = value;
    }

    /**
     * Gets the value of the crt74 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT74() {
        return crt74;
    }

    /**
     * Sets the value of the crt74 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT74(String value) {
        this.crt74 = value;
    }

    /**
     * Gets the value of the crt75 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRT75() {
        return crt75;
    }

    /**
     * Sets the value of the crt75 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRT75(String value) {
        this.crt75 = value;
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
