
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
 *         &lt;element name="LANGU" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU001" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED01001" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED02001" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED03001" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED04001" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU002" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED01002" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED02002" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED03002" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED04002" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU003" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED01003" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED02003" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED03003" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED04003" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU004" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED01004" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED02004" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED03004" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED04004" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU005" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED01005" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED02005" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED03005" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED04005" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU006" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED01006" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED02006" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED03006" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED04006" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU007" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED01007" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED02007" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED03007" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED04007" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU008" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED01008" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED02008" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED03008" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED04008" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU009" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED01009" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED02009" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED03009" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED04009" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU010" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED01010" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED02010" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED03010" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED04010" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU011" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED01011" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED02011" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED03011" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED04011" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU012" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED01012" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED02012" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED03012" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED04012" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU013" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED01013" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED02013" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED03013" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED04013" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU014" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED01014" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED02014" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED03014" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED04014" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU015" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED01015" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED02015" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED03015" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED04015" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU016" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED01016" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED02016" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED03016" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED04016" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU017" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED01017" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED02017" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED03017" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED04017" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU018" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED01018" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED02018" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED03018" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED04018" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU019" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED01019" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED02019" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED03019" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED04019" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU020" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED01020" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED02020" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED03020" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED04020" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU021" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED01021" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED02021" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED03021" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED04021" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU022" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED01022" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED02022" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED03022" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED04022" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU023" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED01023" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED02023" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED03023" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED04023" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU024" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED01024" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED02024" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED03024" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED04024" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU025" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED01025" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED02025" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED03025" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED04025" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU026" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED01026" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED02026" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED03026" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED04026" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU001_ISO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU002_ISO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU003_ISO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU004_ISO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU005_ISO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU006_ISO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU007_ISO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU008_ISO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU009_ISO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU010_ISO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU011_ISO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU012_ISO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU013_ISO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU014_ISO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU015_ISO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU016_ISO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU017_ISO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU018_ISO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU019_ISO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU020_ISO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU021_ISO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU022_ISO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU023_ISO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU024_ISO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU025_ISO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LANGU026_ISO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
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
    "langu",
    "bed01",
    "bed02",
    "bed03",
    "bed04",
    "langu001",
    "bed01001",
    "bed02001",
    "bed03001",
    "bed04001",
    "langu002",
    "bed01002",
    "bed02002",
    "bed03002",
    "bed04002",
    "langu003",
    "bed01003",
    "bed02003",
    "bed03003",
    "bed04003",
    "langu004",
    "bed01004",
    "bed02004",
    "bed03004",
    "bed04004",
    "langu005",
    "bed01005",
    "bed02005",
    "bed03005",
    "bed04005",
    "langu006",
    "bed01006",
    "bed02006",
    "bed03006",
    "bed04006",
    "langu007",
    "bed01007",
    "bed02007",
    "bed03007",
    "bed04007",
    "langu008",
    "bed01008",
    "bed02008",
    "bed03008",
    "bed04008",
    "langu009",
    "bed01009",
    "bed02009",
    "bed03009",
    "bed04009",
    "langu010",
    "bed01010",
    "bed02010",
    "bed03010",
    "bed04010",
    "langu011",
    "bed01011",
    "bed02011",
    "bed03011",
    "bed04011",
    "langu012",
    "bed01012",
    "bed02012",
    "bed03012",
    "bed04012",
    "langu013",
    "bed01013",
    "bed02013",
    "bed03013",
    "bed04013",
    "langu014",
    "bed01014",
    "bed02014",
    "bed03014",
    "bed04014",
    "langu015",
    "bed01015",
    "bed02015",
    "bed03015",
    "bed04015",
    "langu016",
    "bed01016",
    "bed02016",
    "bed03016",
    "bed04016",
    "langu017",
    "bed01017",
    "bed02017",
    "bed03017",
    "bed04017",
    "langu018",
    "bed01018",
    "bed02018",
    "bed03018",
    "bed04018",
    "langu019",
    "bed01019",
    "bed02019",
    "bed03019",
    "bed04019",
    "langu020",
    "bed01020",
    "bed02020",
    "bed03020",
    "bed04020",
    "langu021",
    "bed01021",
    "bed02021",
    "bed03021",
    "bed04021",
    "langu022",
    "bed01022",
    "bed02022",
    "bed03022",
    "bed04022",
    "langu023",
    "bed01023",
    "bed02023",
    "bed03023",
    "bed04023",
    "langu024",
    "bed01024",
    "bed02024",
    "bed03024",
    "bed04024",
    "langu025",
    "bed01025",
    "bed02025",
    "bed03025",
    "bed04025",
    "langu026",
    "bed01026",
    "bed02026",
    "bed03026",
    "bed04026",
    "langu001ISO",
    "langu002ISO",
    "langu003ISO",
    "langu004ISO",
    "langu005ISO",
    "langu006ISO",
    "langu007ISO",
    "langu008ISO",
    "langu009ISO",
    "langu010ISO",
    "langu011ISO",
    "langu012ISO",
    "langu013ISO",
    "langu014ISO",
    "langu015ISO",
    "langu016ISO",
    "langu017ISO",
    "langu018ISO",
    "langu019ISO",
    "langu020ISO",
    "langu021ISO",
    "langu022ISO",
    "langu023ISO",
    "langu024ISO",
    "langu025ISO",
    "langu026ISO"
})
public class E1P1020 {

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
    @XmlElement(name = "LANGU")
    protected String langu;
    @XmlElement(name = "BED01")
    protected String bed01;
    @XmlElement(name = "BED02")
    protected String bed02;
    @XmlElement(name = "BED03")
    protected String bed03;
    @XmlElement(name = "BED04")
    protected String bed04;
    @XmlElement(name = "LANGU001")
    protected String langu001;
    @XmlElement(name = "BED01001")
    protected String bed01001;
    @XmlElement(name = "BED02001")
    protected String bed02001;
    @XmlElement(name = "BED03001")
    protected String bed03001;
    @XmlElement(name = "BED04001")
    protected String bed04001;
    @XmlElement(name = "LANGU002")
    protected String langu002;
    @XmlElement(name = "BED01002")
    protected String bed01002;
    @XmlElement(name = "BED02002")
    protected String bed02002;
    @XmlElement(name = "BED03002")
    protected String bed03002;
    @XmlElement(name = "BED04002")
    protected String bed04002;
    @XmlElement(name = "LANGU003")
    protected String langu003;
    @XmlElement(name = "BED01003")
    protected String bed01003;
    @XmlElement(name = "BED02003")
    protected String bed02003;
    @XmlElement(name = "BED03003")
    protected String bed03003;
    @XmlElement(name = "BED04003")
    protected String bed04003;
    @XmlElement(name = "LANGU004")
    protected String langu004;
    @XmlElement(name = "BED01004")
    protected String bed01004;
    @XmlElement(name = "BED02004")
    protected String bed02004;
    @XmlElement(name = "BED03004")
    protected String bed03004;
    @XmlElement(name = "BED04004")
    protected String bed04004;
    @XmlElement(name = "LANGU005")
    protected String langu005;
    @XmlElement(name = "BED01005")
    protected String bed01005;
    @XmlElement(name = "BED02005")
    protected String bed02005;
    @XmlElement(name = "BED03005")
    protected String bed03005;
    @XmlElement(name = "BED04005")
    protected String bed04005;
    @XmlElement(name = "LANGU006")
    protected String langu006;
    @XmlElement(name = "BED01006")
    protected String bed01006;
    @XmlElement(name = "BED02006")
    protected String bed02006;
    @XmlElement(name = "BED03006")
    protected String bed03006;
    @XmlElement(name = "BED04006")
    protected String bed04006;
    @XmlElement(name = "LANGU007")
    protected String langu007;
    @XmlElement(name = "BED01007")
    protected String bed01007;
    @XmlElement(name = "BED02007")
    protected String bed02007;
    @XmlElement(name = "BED03007")
    protected String bed03007;
    @XmlElement(name = "BED04007")
    protected String bed04007;
    @XmlElement(name = "LANGU008")
    protected String langu008;
    @XmlElement(name = "BED01008")
    protected String bed01008;
    @XmlElement(name = "BED02008")
    protected String bed02008;
    @XmlElement(name = "BED03008")
    protected String bed03008;
    @XmlElement(name = "BED04008")
    protected String bed04008;
    @XmlElement(name = "LANGU009")
    protected String langu009;
    @XmlElement(name = "BED01009")
    protected String bed01009;
    @XmlElement(name = "BED02009")
    protected String bed02009;
    @XmlElement(name = "BED03009")
    protected String bed03009;
    @XmlElement(name = "BED04009")
    protected String bed04009;
    @XmlElement(name = "LANGU010")
    protected String langu010;
    @XmlElement(name = "BED01010")
    protected String bed01010;
    @XmlElement(name = "BED02010")
    protected String bed02010;
    @XmlElement(name = "BED03010")
    protected String bed03010;
    @XmlElement(name = "BED04010")
    protected String bed04010;
    @XmlElement(name = "LANGU011")
    protected String langu011;
    @XmlElement(name = "BED01011")
    protected String bed01011;
    @XmlElement(name = "BED02011")
    protected String bed02011;
    @XmlElement(name = "BED03011")
    protected String bed03011;
    @XmlElement(name = "BED04011")
    protected String bed04011;
    @XmlElement(name = "LANGU012")
    protected String langu012;
    @XmlElement(name = "BED01012")
    protected String bed01012;
    @XmlElement(name = "BED02012")
    protected String bed02012;
    @XmlElement(name = "BED03012")
    protected String bed03012;
    @XmlElement(name = "BED04012")
    protected String bed04012;
    @XmlElement(name = "LANGU013")
    protected String langu013;
    @XmlElement(name = "BED01013")
    protected String bed01013;
    @XmlElement(name = "BED02013")
    protected String bed02013;
    @XmlElement(name = "BED03013")
    protected String bed03013;
    @XmlElement(name = "BED04013")
    protected String bed04013;
    @XmlElement(name = "LANGU014")
    protected String langu014;
    @XmlElement(name = "BED01014")
    protected String bed01014;
    @XmlElement(name = "BED02014")
    protected String bed02014;
    @XmlElement(name = "BED03014")
    protected String bed03014;
    @XmlElement(name = "BED04014")
    protected String bed04014;
    @XmlElement(name = "LANGU015")
    protected String langu015;
    @XmlElement(name = "BED01015")
    protected String bed01015;
    @XmlElement(name = "BED02015")
    protected String bed02015;
    @XmlElement(name = "BED03015")
    protected String bed03015;
    @XmlElement(name = "BED04015")
    protected String bed04015;
    @XmlElement(name = "LANGU016")
    protected String langu016;
    @XmlElement(name = "BED01016")
    protected String bed01016;
    @XmlElement(name = "BED02016")
    protected String bed02016;
    @XmlElement(name = "BED03016")
    protected String bed03016;
    @XmlElement(name = "BED04016")
    protected String bed04016;
    @XmlElement(name = "LANGU017")
    protected String langu017;
    @XmlElement(name = "BED01017")
    protected String bed01017;
    @XmlElement(name = "BED02017")
    protected String bed02017;
    @XmlElement(name = "BED03017")
    protected String bed03017;
    @XmlElement(name = "BED04017")
    protected String bed04017;
    @XmlElement(name = "LANGU018")
    protected String langu018;
    @XmlElement(name = "BED01018")
    protected String bed01018;
    @XmlElement(name = "BED02018")
    protected String bed02018;
    @XmlElement(name = "BED03018")
    protected String bed03018;
    @XmlElement(name = "BED04018")
    protected String bed04018;
    @XmlElement(name = "LANGU019")
    protected String langu019;
    @XmlElement(name = "BED01019")
    protected String bed01019;
    @XmlElement(name = "BED02019")
    protected String bed02019;
    @XmlElement(name = "BED03019")
    protected String bed03019;
    @XmlElement(name = "BED04019")
    protected String bed04019;
    @XmlElement(name = "LANGU020")
    protected String langu020;
    @XmlElement(name = "BED01020")
    protected String bed01020;
    @XmlElement(name = "BED02020")
    protected String bed02020;
    @XmlElement(name = "BED03020")
    protected String bed03020;
    @XmlElement(name = "BED04020")
    protected String bed04020;
    @XmlElement(name = "LANGU021")
    protected String langu021;
    @XmlElement(name = "BED01021")
    protected String bed01021;
    @XmlElement(name = "BED02021")
    protected String bed02021;
    @XmlElement(name = "BED03021")
    protected String bed03021;
    @XmlElement(name = "BED04021")
    protected String bed04021;
    @XmlElement(name = "LANGU022")
    protected String langu022;
    @XmlElement(name = "BED01022")
    protected String bed01022;
    @XmlElement(name = "BED02022")
    protected String bed02022;
    @XmlElement(name = "BED03022")
    protected String bed03022;
    @XmlElement(name = "BED04022")
    protected String bed04022;
    @XmlElement(name = "LANGU023")
    protected String langu023;
    @XmlElement(name = "BED01023")
    protected String bed01023;
    @XmlElement(name = "BED02023")
    protected String bed02023;
    @XmlElement(name = "BED03023")
    protected String bed03023;
    @XmlElement(name = "BED04023")
    protected String bed04023;
    @XmlElement(name = "LANGU024")
    protected String langu024;
    @XmlElement(name = "BED01024")
    protected String bed01024;
    @XmlElement(name = "BED02024")
    protected String bed02024;
    @XmlElement(name = "BED03024")
    protected String bed03024;
    @XmlElement(name = "BED04024")
    protected String bed04024;
    @XmlElement(name = "LANGU025")
    protected String langu025;
    @XmlElement(name = "BED01025")
    protected String bed01025;
    @XmlElement(name = "BED02025")
    protected String bed02025;
    @XmlElement(name = "BED03025")
    protected String bed03025;
    @XmlElement(name = "BED04025")
    protected String bed04025;
    @XmlElement(name = "LANGU026")
    protected String langu026;
    @XmlElement(name = "BED01026")
    protected String bed01026;
    @XmlElement(name = "BED02026")
    protected String bed02026;
    @XmlElement(name = "BED03026")
    protected String bed03026;
    @XmlElement(name = "BED04026")
    protected String bed04026;
    @XmlElement(name = "LANGU001_ISO")
    protected String langu001ISO;
    @XmlElement(name = "LANGU002_ISO")
    protected String langu002ISO;
    @XmlElement(name = "LANGU003_ISO")
    protected String langu003ISO;
    @XmlElement(name = "LANGU004_ISO")
    protected String langu004ISO;
    @XmlElement(name = "LANGU005_ISO")
    protected String langu005ISO;
    @XmlElement(name = "LANGU006_ISO")
    protected String langu006ISO;
    @XmlElement(name = "LANGU007_ISO")
    protected String langu007ISO;
    @XmlElement(name = "LANGU008_ISO")
    protected String langu008ISO;
    @XmlElement(name = "LANGU009_ISO")
    protected String langu009ISO;
    @XmlElement(name = "LANGU010_ISO")
    protected String langu010ISO;
    @XmlElement(name = "LANGU011_ISO")
    protected String langu011ISO;
    @XmlElement(name = "LANGU012_ISO")
    protected String langu012ISO;
    @XmlElement(name = "LANGU013_ISO")
    protected String langu013ISO;
    @XmlElement(name = "LANGU014_ISO")
    protected String langu014ISO;
    @XmlElement(name = "LANGU015_ISO")
    protected String langu015ISO;
    @XmlElement(name = "LANGU016_ISO")
    protected String langu016ISO;
    @XmlElement(name = "LANGU017_ISO")
    protected String langu017ISO;
    @XmlElement(name = "LANGU018_ISO")
    protected String langu018ISO;
    @XmlElement(name = "LANGU019_ISO")
    protected String langu019ISO;
    @XmlElement(name = "LANGU020_ISO")
    protected String langu020ISO;
    @XmlElement(name = "LANGU021_ISO")
    protected String langu021ISO;
    @XmlElement(name = "LANGU022_ISO")
    protected String langu022ISO;
    @XmlElement(name = "LANGU023_ISO")
    protected String langu023ISO;
    @XmlElement(name = "LANGU024_ISO")
    protected String langu024ISO;
    @XmlElement(name = "LANGU025_ISO")
    protected String langu025ISO;
    @XmlElement(name = "LANGU026_ISO")
    protected String langu026ISO;
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
     * Gets the value of the langu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU() {
        return langu;
    }

    /**
     * Sets the value of the langu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU(String value) {
        this.langu = value;
    }

    /**
     * Gets the value of the bed01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED01() {
        return bed01;
    }

    /**
     * Sets the value of the bed01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED01(String value) {
        this.bed01 = value;
    }

    /**
     * Gets the value of the bed02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED02() {
        return bed02;
    }

    /**
     * Sets the value of the bed02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED02(String value) {
        this.bed02 = value;
    }

    /**
     * Gets the value of the bed03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED03() {
        return bed03;
    }

    /**
     * Sets the value of the bed03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED03(String value) {
        this.bed03 = value;
    }

    /**
     * Gets the value of the bed04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED04() {
        return bed04;
    }

    /**
     * Sets the value of the bed04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED04(String value) {
        this.bed04 = value;
    }

    /**
     * Gets the value of the langu001 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU001() {
        return langu001;
    }

    /**
     * Sets the value of the langu001 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU001(String value) {
        this.langu001 = value;
    }

    /**
     * Gets the value of the bed01001 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED01001() {
        return bed01001;
    }

    /**
     * Sets the value of the bed01001 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED01001(String value) {
        this.bed01001 = value;
    }

    /**
     * Gets the value of the bed02001 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED02001() {
        return bed02001;
    }

    /**
     * Sets the value of the bed02001 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED02001(String value) {
        this.bed02001 = value;
    }

    /**
     * Gets the value of the bed03001 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED03001() {
        return bed03001;
    }

    /**
     * Sets the value of the bed03001 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED03001(String value) {
        this.bed03001 = value;
    }

    /**
     * Gets the value of the bed04001 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED04001() {
        return bed04001;
    }

    /**
     * Sets the value of the bed04001 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED04001(String value) {
        this.bed04001 = value;
    }

    /**
     * Gets the value of the langu002 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU002() {
        return langu002;
    }

    /**
     * Sets the value of the langu002 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU002(String value) {
        this.langu002 = value;
    }

    /**
     * Gets the value of the bed01002 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED01002() {
        return bed01002;
    }

    /**
     * Sets the value of the bed01002 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED01002(String value) {
        this.bed01002 = value;
    }

    /**
     * Gets the value of the bed02002 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED02002() {
        return bed02002;
    }

    /**
     * Sets the value of the bed02002 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED02002(String value) {
        this.bed02002 = value;
    }

    /**
     * Gets the value of the bed03002 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED03002() {
        return bed03002;
    }

    /**
     * Sets the value of the bed03002 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED03002(String value) {
        this.bed03002 = value;
    }

    /**
     * Gets the value of the bed04002 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED04002() {
        return bed04002;
    }

    /**
     * Sets the value of the bed04002 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED04002(String value) {
        this.bed04002 = value;
    }

    /**
     * Gets the value of the langu003 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU003() {
        return langu003;
    }

    /**
     * Sets the value of the langu003 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU003(String value) {
        this.langu003 = value;
    }

    /**
     * Gets the value of the bed01003 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED01003() {
        return bed01003;
    }

    /**
     * Sets the value of the bed01003 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED01003(String value) {
        this.bed01003 = value;
    }

    /**
     * Gets the value of the bed02003 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED02003() {
        return bed02003;
    }

    /**
     * Sets the value of the bed02003 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED02003(String value) {
        this.bed02003 = value;
    }

    /**
     * Gets the value of the bed03003 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED03003() {
        return bed03003;
    }

    /**
     * Sets the value of the bed03003 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED03003(String value) {
        this.bed03003 = value;
    }

    /**
     * Gets the value of the bed04003 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED04003() {
        return bed04003;
    }

    /**
     * Sets the value of the bed04003 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED04003(String value) {
        this.bed04003 = value;
    }

    /**
     * Gets the value of the langu004 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU004() {
        return langu004;
    }

    /**
     * Sets the value of the langu004 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU004(String value) {
        this.langu004 = value;
    }

    /**
     * Gets the value of the bed01004 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED01004() {
        return bed01004;
    }

    /**
     * Sets the value of the bed01004 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED01004(String value) {
        this.bed01004 = value;
    }

    /**
     * Gets the value of the bed02004 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED02004() {
        return bed02004;
    }

    /**
     * Sets the value of the bed02004 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED02004(String value) {
        this.bed02004 = value;
    }

    /**
     * Gets the value of the bed03004 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED03004() {
        return bed03004;
    }

    /**
     * Sets the value of the bed03004 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED03004(String value) {
        this.bed03004 = value;
    }

    /**
     * Gets the value of the bed04004 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED04004() {
        return bed04004;
    }

    /**
     * Sets the value of the bed04004 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED04004(String value) {
        this.bed04004 = value;
    }

    /**
     * Gets the value of the langu005 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU005() {
        return langu005;
    }

    /**
     * Sets the value of the langu005 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU005(String value) {
        this.langu005 = value;
    }

    /**
     * Gets the value of the bed01005 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED01005() {
        return bed01005;
    }

    /**
     * Sets the value of the bed01005 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED01005(String value) {
        this.bed01005 = value;
    }

    /**
     * Gets the value of the bed02005 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED02005() {
        return bed02005;
    }

    /**
     * Sets the value of the bed02005 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED02005(String value) {
        this.bed02005 = value;
    }

    /**
     * Gets the value of the bed03005 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED03005() {
        return bed03005;
    }

    /**
     * Sets the value of the bed03005 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED03005(String value) {
        this.bed03005 = value;
    }

    /**
     * Gets the value of the bed04005 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED04005() {
        return bed04005;
    }

    /**
     * Sets the value of the bed04005 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED04005(String value) {
        this.bed04005 = value;
    }

    /**
     * Gets the value of the langu006 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU006() {
        return langu006;
    }

    /**
     * Sets the value of the langu006 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU006(String value) {
        this.langu006 = value;
    }

    /**
     * Gets the value of the bed01006 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED01006() {
        return bed01006;
    }

    /**
     * Sets the value of the bed01006 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED01006(String value) {
        this.bed01006 = value;
    }

    /**
     * Gets the value of the bed02006 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED02006() {
        return bed02006;
    }

    /**
     * Sets the value of the bed02006 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED02006(String value) {
        this.bed02006 = value;
    }

    /**
     * Gets the value of the bed03006 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED03006() {
        return bed03006;
    }

    /**
     * Sets the value of the bed03006 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED03006(String value) {
        this.bed03006 = value;
    }

    /**
     * Gets the value of the bed04006 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED04006() {
        return bed04006;
    }

    /**
     * Sets the value of the bed04006 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED04006(String value) {
        this.bed04006 = value;
    }

    /**
     * Gets the value of the langu007 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU007() {
        return langu007;
    }

    /**
     * Sets the value of the langu007 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU007(String value) {
        this.langu007 = value;
    }

    /**
     * Gets the value of the bed01007 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED01007() {
        return bed01007;
    }

    /**
     * Sets the value of the bed01007 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED01007(String value) {
        this.bed01007 = value;
    }

    /**
     * Gets the value of the bed02007 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED02007() {
        return bed02007;
    }

    /**
     * Sets the value of the bed02007 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED02007(String value) {
        this.bed02007 = value;
    }

    /**
     * Gets the value of the bed03007 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED03007() {
        return bed03007;
    }

    /**
     * Sets the value of the bed03007 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED03007(String value) {
        this.bed03007 = value;
    }

    /**
     * Gets the value of the bed04007 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED04007() {
        return bed04007;
    }

    /**
     * Sets the value of the bed04007 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED04007(String value) {
        this.bed04007 = value;
    }

    /**
     * Gets the value of the langu008 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU008() {
        return langu008;
    }

    /**
     * Sets the value of the langu008 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU008(String value) {
        this.langu008 = value;
    }

    /**
     * Gets the value of the bed01008 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED01008() {
        return bed01008;
    }

    /**
     * Sets the value of the bed01008 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED01008(String value) {
        this.bed01008 = value;
    }

    /**
     * Gets the value of the bed02008 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED02008() {
        return bed02008;
    }

    /**
     * Sets the value of the bed02008 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED02008(String value) {
        this.bed02008 = value;
    }

    /**
     * Gets the value of the bed03008 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED03008() {
        return bed03008;
    }

    /**
     * Sets the value of the bed03008 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED03008(String value) {
        this.bed03008 = value;
    }

    /**
     * Gets the value of the bed04008 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED04008() {
        return bed04008;
    }

    /**
     * Sets the value of the bed04008 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED04008(String value) {
        this.bed04008 = value;
    }

    /**
     * Gets the value of the langu009 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU009() {
        return langu009;
    }

    /**
     * Sets the value of the langu009 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU009(String value) {
        this.langu009 = value;
    }

    /**
     * Gets the value of the bed01009 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED01009() {
        return bed01009;
    }

    /**
     * Sets the value of the bed01009 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED01009(String value) {
        this.bed01009 = value;
    }

    /**
     * Gets the value of the bed02009 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED02009() {
        return bed02009;
    }

    /**
     * Sets the value of the bed02009 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED02009(String value) {
        this.bed02009 = value;
    }

    /**
     * Gets the value of the bed03009 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED03009() {
        return bed03009;
    }

    /**
     * Sets the value of the bed03009 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED03009(String value) {
        this.bed03009 = value;
    }

    /**
     * Gets the value of the bed04009 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED04009() {
        return bed04009;
    }

    /**
     * Sets the value of the bed04009 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED04009(String value) {
        this.bed04009 = value;
    }

    /**
     * Gets the value of the langu010 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU010() {
        return langu010;
    }

    /**
     * Sets the value of the langu010 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU010(String value) {
        this.langu010 = value;
    }

    /**
     * Gets the value of the bed01010 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED01010() {
        return bed01010;
    }

    /**
     * Sets the value of the bed01010 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED01010(String value) {
        this.bed01010 = value;
    }

    /**
     * Gets the value of the bed02010 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED02010() {
        return bed02010;
    }

    /**
     * Sets the value of the bed02010 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED02010(String value) {
        this.bed02010 = value;
    }

    /**
     * Gets the value of the bed03010 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED03010() {
        return bed03010;
    }

    /**
     * Sets the value of the bed03010 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED03010(String value) {
        this.bed03010 = value;
    }

    /**
     * Gets the value of the bed04010 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED04010() {
        return bed04010;
    }

    /**
     * Sets the value of the bed04010 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED04010(String value) {
        this.bed04010 = value;
    }

    /**
     * Gets the value of the langu011 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU011() {
        return langu011;
    }

    /**
     * Sets the value of the langu011 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU011(String value) {
        this.langu011 = value;
    }

    /**
     * Gets the value of the bed01011 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED01011() {
        return bed01011;
    }

    /**
     * Sets the value of the bed01011 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED01011(String value) {
        this.bed01011 = value;
    }

    /**
     * Gets the value of the bed02011 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED02011() {
        return bed02011;
    }

    /**
     * Sets the value of the bed02011 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED02011(String value) {
        this.bed02011 = value;
    }

    /**
     * Gets the value of the bed03011 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED03011() {
        return bed03011;
    }

    /**
     * Sets the value of the bed03011 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED03011(String value) {
        this.bed03011 = value;
    }

    /**
     * Gets the value of the bed04011 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED04011() {
        return bed04011;
    }

    /**
     * Sets the value of the bed04011 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED04011(String value) {
        this.bed04011 = value;
    }

    /**
     * Gets the value of the langu012 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU012() {
        return langu012;
    }

    /**
     * Sets the value of the langu012 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU012(String value) {
        this.langu012 = value;
    }

    /**
     * Gets the value of the bed01012 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED01012() {
        return bed01012;
    }

    /**
     * Sets the value of the bed01012 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED01012(String value) {
        this.bed01012 = value;
    }

    /**
     * Gets the value of the bed02012 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED02012() {
        return bed02012;
    }

    /**
     * Sets the value of the bed02012 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED02012(String value) {
        this.bed02012 = value;
    }

    /**
     * Gets the value of the bed03012 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED03012() {
        return bed03012;
    }

    /**
     * Sets the value of the bed03012 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED03012(String value) {
        this.bed03012 = value;
    }

    /**
     * Gets the value of the bed04012 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED04012() {
        return bed04012;
    }

    /**
     * Sets the value of the bed04012 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED04012(String value) {
        this.bed04012 = value;
    }

    /**
     * Gets the value of the langu013 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU013() {
        return langu013;
    }

    /**
     * Sets the value of the langu013 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU013(String value) {
        this.langu013 = value;
    }

    /**
     * Gets the value of the bed01013 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED01013() {
        return bed01013;
    }

    /**
     * Sets the value of the bed01013 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED01013(String value) {
        this.bed01013 = value;
    }

    /**
     * Gets the value of the bed02013 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED02013() {
        return bed02013;
    }

    /**
     * Sets the value of the bed02013 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED02013(String value) {
        this.bed02013 = value;
    }

    /**
     * Gets the value of the bed03013 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED03013() {
        return bed03013;
    }

    /**
     * Sets the value of the bed03013 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED03013(String value) {
        this.bed03013 = value;
    }

    /**
     * Gets the value of the bed04013 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED04013() {
        return bed04013;
    }

    /**
     * Sets the value of the bed04013 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED04013(String value) {
        this.bed04013 = value;
    }

    /**
     * Gets the value of the langu014 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU014() {
        return langu014;
    }

    /**
     * Sets the value of the langu014 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU014(String value) {
        this.langu014 = value;
    }

    /**
     * Gets the value of the bed01014 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED01014() {
        return bed01014;
    }

    /**
     * Sets the value of the bed01014 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED01014(String value) {
        this.bed01014 = value;
    }

    /**
     * Gets the value of the bed02014 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED02014() {
        return bed02014;
    }

    /**
     * Sets the value of the bed02014 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED02014(String value) {
        this.bed02014 = value;
    }

    /**
     * Gets the value of the bed03014 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED03014() {
        return bed03014;
    }

    /**
     * Sets the value of the bed03014 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED03014(String value) {
        this.bed03014 = value;
    }

    /**
     * Gets the value of the bed04014 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED04014() {
        return bed04014;
    }

    /**
     * Sets the value of the bed04014 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED04014(String value) {
        this.bed04014 = value;
    }

    /**
     * Gets the value of the langu015 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU015() {
        return langu015;
    }

    /**
     * Sets the value of the langu015 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU015(String value) {
        this.langu015 = value;
    }

    /**
     * Gets the value of the bed01015 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED01015() {
        return bed01015;
    }

    /**
     * Sets the value of the bed01015 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED01015(String value) {
        this.bed01015 = value;
    }

    /**
     * Gets the value of the bed02015 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED02015() {
        return bed02015;
    }

    /**
     * Sets the value of the bed02015 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED02015(String value) {
        this.bed02015 = value;
    }

    /**
     * Gets the value of the bed03015 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED03015() {
        return bed03015;
    }

    /**
     * Sets the value of the bed03015 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED03015(String value) {
        this.bed03015 = value;
    }

    /**
     * Gets the value of the bed04015 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED04015() {
        return bed04015;
    }

    /**
     * Sets the value of the bed04015 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED04015(String value) {
        this.bed04015 = value;
    }

    /**
     * Gets the value of the langu016 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU016() {
        return langu016;
    }

    /**
     * Sets the value of the langu016 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU016(String value) {
        this.langu016 = value;
    }

    /**
     * Gets the value of the bed01016 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED01016() {
        return bed01016;
    }

    /**
     * Sets the value of the bed01016 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED01016(String value) {
        this.bed01016 = value;
    }

    /**
     * Gets the value of the bed02016 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED02016() {
        return bed02016;
    }

    /**
     * Sets the value of the bed02016 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED02016(String value) {
        this.bed02016 = value;
    }

    /**
     * Gets the value of the bed03016 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED03016() {
        return bed03016;
    }

    /**
     * Sets the value of the bed03016 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED03016(String value) {
        this.bed03016 = value;
    }

    /**
     * Gets the value of the bed04016 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED04016() {
        return bed04016;
    }

    /**
     * Sets the value of the bed04016 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED04016(String value) {
        this.bed04016 = value;
    }

    /**
     * Gets the value of the langu017 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU017() {
        return langu017;
    }

    /**
     * Sets the value of the langu017 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU017(String value) {
        this.langu017 = value;
    }

    /**
     * Gets the value of the bed01017 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED01017() {
        return bed01017;
    }

    /**
     * Sets the value of the bed01017 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED01017(String value) {
        this.bed01017 = value;
    }

    /**
     * Gets the value of the bed02017 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED02017() {
        return bed02017;
    }

    /**
     * Sets the value of the bed02017 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED02017(String value) {
        this.bed02017 = value;
    }

    /**
     * Gets the value of the bed03017 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED03017() {
        return bed03017;
    }

    /**
     * Sets the value of the bed03017 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED03017(String value) {
        this.bed03017 = value;
    }

    /**
     * Gets the value of the bed04017 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED04017() {
        return bed04017;
    }

    /**
     * Sets the value of the bed04017 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED04017(String value) {
        this.bed04017 = value;
    }

    /**
     * Gets the value of the langu018 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU018() {
        return langu018;
    }

    /**
     * Sets the value of the langu018 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU018(String value) {
        this.langu018 = value;
    }

    /**
     * Gets the value of the bed01018 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED01018() {
        return bed01018;
    }

    /**
     * Sets the value of the bed01018 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED01018(String value) {
        this.bed01018 = value;
    }

    /**
     * Gets the value of the bed02018 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED02018() {
        return bed02018;
    }

    /**
     * Sets the value of the bed02018 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED02018(String value) {
        this.bed02018 = value;
    }

    /**
     * Gets the value of the bed03018 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED03018() {
        return bed03018;
    }

    /**
     * Sets the value of the bed03018 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED03018(String value) {
        this.bed03018 = value;
    }

    /**
     * Gets the value of the bed04018 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED04018() {
        return bed04018;
    }

    /**
     * Sets the value of the bed04018 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED04018(String value) {
        this.bed04018 = value;
    }

    /**
     * Gets the value of the langu019 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU019() {
        return langu019;
    }

    /**
     * Sets the value of the langu019 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU019(String value) {
        this.langu019 = value;
    }

    /**
     * Gets the value of the bed01019 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED01019() {
        return bed01019;
    }

    /**
     * Sets the value of the bed01019 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED01019(String value) {
        this.bed01019 = value;
    }

    /**
     * Gets the value of the bed02019 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED02019() {
        return bed02019;
    }

    /**
     * Sets the value of the bed02019 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED02019(String value) {
        this.bed02019 = value;
    }

    /**
     * Gets the value of the bed03019 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED03019() {
        return bed03019;
    }

    /**
     * Sets the value of the bed03019 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED03019(String value) {
        this.bed03019 = value;
    }

    /**
     * Gets the value of the bed04019 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED04019() {
        return bed04019;
    }

    /**
     * Sets the value of the bed04019 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED04019(String value) {
        this.bed04019 = value;
    }

    /**
     * Gets the value of the langu020 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU020() {
        return langu020;
    }

    /**
     * Sets the value of the langu020 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU020(String value) {
        this.langu020 = value;
    }

    /**
     * Gets the value of the bed01020 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED01020() {
        return bed01020;
    }

    /**
     * Sets the value of the bed01020 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED01020(String value) {
        this.bed01020 = value;
    }

    /**
     * Gets the value of the bed02020 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED02020() {
        return bed02020;
    }

    /**
     * Sets the value of the bed02020 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED02020(String value) {
        this.bed02020 = value;
    }

    /**
     * Gets the value of the bed03020 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED03020() {
        return bed03020;
    }

    /**
     * Sets the value of the bed03020 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED03020(String value) {
        this.bed03020 = value;
    }

    /**
     * Gets the value of the bed04020 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED04020() {
        return bed04020;
    }

    /**
     * Sets the value of the bed04020 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED04020(String value) {
        this.bed04020 = value;
    }

    /**
     * Gets the value of the langu021 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU021() {
        return langu021;
    }

    /**
     * Sets the value of the langu021 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU021(String value) {
        this.langu021 = value;
    }

    /**
     * Gets the value of the bed01021 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED01021() {
        return bed01021;
    }

    /**
     * Sets the value of the bed01021 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED01021(String value) {
        this.bed01021 = value;
    }

    /**
     * Gets the value of the bed02021 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED02021() {
        return bed02021;
    }

    /**
     * Sets the value of the bed02021 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED02021(String value) {
        this.bed02021 = value;
    }

    /**
     * Gets the value of the bed03021 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED03021() {
        return bed03021;
    }

    /**
     * Sets the value of the bed03021 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED03021(String value) {
        this.bed03021 = value;
    }

    /**
     * Gets the value of the bed04021 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED04021() {
        return bed04021;
    }

    /**
     * Sets the value of the bed04021 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED04021(String value) {
        this.bed04021 = value;
    }

    /**
     * Gets the value of the langu022 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU022() {
        return langu022;
    }

    /**
     * Sets the value of the langu022 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU022(String value) {
        this.langu022 = value;
    }

    /**
     * Gets the value of the bed01022 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED01022() {
        return bed01022;
    }

    /**
     * Sets the value of the bed01022 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED01022(String value) {
        this.bed01022 = value;
    }

    /**
     * Gets the value of the bed02022 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED02022() {
        return bed02022;
    }

    /**
     * Sets the value of the bed02022 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED02022(String value) {
        this.bed02022 = value;
    }

    /**
     * Gets the value of the bed03022 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED03022() {
        return bed03022;
    }

    /**
     * Sets the value of the bed03022 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED03022(String value) {
        this.bed03022 = value;
    }

    /**
     * Gets the value of the bed04022 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED04022() {
        return bed04022;
    }

    /**
     * Sets the value of the bed04022 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED04022(String value) {
        this.bed04022 = value;
    }

    /**
     * Gets the value of the langu023 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU023() {
        return langu023;
    }

    /**
     * Sets the value of the langu023 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU023(String value) {
        this.langu023 = value;
    }

    /**
     * Gets the value of the bed01023 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED01023() {
        return bed01023;
    }

    /**
     * Sets the value of the bed01023 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED01023(String value) {
        this.bed01023 = value;
    }

    /**
     * Gets the value of the bed02023 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED02023() {
        return bed02023;
    }

    /**
     * Sets the value of the bed02023 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED02023(String value) {
        this.bed02023 = value;
    }

    /**
     * Gets the value of the bed03023 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED03023() {
        return bed03023;
    }

    /**
     * Sets the value of the bed03023 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED03023(String value) {
        this.bed03023 = value;
    }

    /**
     * Gets the value of the bed04023 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED04023() {
        return bed04023;
    }

    /**
     * Sets the value of the bed04023 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED04023(String value) {
        this.bed04023 = value;
    }

    /**
     * Gets the value of the langu024 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU024() {
        return langu024;
    }

    /**
     * Sets the value of the langu024 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU024(String value) {
        this.langu024 = value;
    }

    /**
     * Gets the value of the bed01024 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED01024() {
        return bed01024;
    }

    /**
     * Sets the value of the bed01024 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED01024(String value) {
        this.bed01024 = value;
    }

    /**
     * Gets the value of the bed02024 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED02024() {
        return bed02024;
    }

    /**
     * Sets the value of the bed02024 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED02024(String value) {
        this.bed02024 = value;
    }

    /**
     * Gets the value of the bed03024 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED03024() {
        return bed03024;
    }

    /**
     * Sets the value of the bed03024 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED03024(String value) {
        this.bed03024 = value;
    }

    /**
     * Gets the value of the bed04024 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED04024() {
        return bed04024;
    }

    /**
     * Sets the value of the bed04024 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED04024(String value) {
        this.bed04024 = value;
    }

    /**
     * Gets the value of the langu025 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU025() {
        return langu025;
    }

    /**
     * Sets the value of the langu025 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU025(String value) {
        this.langu025 = value;
    }

    /**
     * Gets the value of the bed01025 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED01025() {
        return bed01025;
    }

    /**
     * Sets the value of the bed01025 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED01025(String value) {
        this.bed01025 = value;
    }

    /**
     * Gets the value of the bed02025 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED02025() {
        return bed02025;
    }

    /**
     * Sets the value of the bed02025 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED02025(String value) {
        this.bed02025 = value;
    }

    /**
     * Gets the value of the bed03025 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED03025() {
        return bed03025;
    }

    /**
     * Sets the value of the bed03025 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED03025(String value) {
        this.bed03025 = value;
    }

    /**
     * Gets the value of the bed04025 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED04025() {
        return bed04025;
    }

    /**
     * Sets the value of the bed04025 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED04025(String value) {
        this.bed04025 = value;
    }

    /**
     * Gets the value of the langu026 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU026() {
        return langu026;
    }

    /**
     * Sets the value of the langu026 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU026(String value) {
        this.langu026 = value;
    }

    /**
     * Gets the value of the bed01026 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED01026() {
        return bed01026;
    }

    /**
     * Sets the value of the bed01026 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED01026(String value) {
        this.bed01026 = value;
    }

    /**
     * Gets the value of the bed02026 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED02026() {
        return bed02026;
    }

    /**
     * Sets the value of the bed02026 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED02026(String value) {
        this.bed02026 = value;
    }

    /**
     * Gets the value of the bed03026 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED03026() {
        return bed03026;
    }

    /**
     * Sets the value of the bed03026 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED03026(String value) {
        this.bed03026 = value;
    }

    /**
     * Gets the value of the bed04026 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBED04026() {
        return bed04026;
    }

    /**
     * Sets the value of the bed04026 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBED04026(String value) {
        this.bed04026 = value;
    }

    /**
     * Gets the value of the langu001ISO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU001ISO() {
        return langu001ISO;
    }

    /**
     * Sets the value of the langu001ISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU001ISO(String value) {
        this.langu001ISO = value;
    }

    /**
     * Gets the value of the langu002ISO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU002ISO() {
        return langu002ISO;
    }

    /**
     * Sets the value of the langu002ISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU002ISO(String value) {
        this.langu002ISO = value;
    }

    /**
     * Gets the value of the langu003ISO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU003ISO() {
        return langu003ISO;
    }

    /**
     * Sets the value of the langu003ISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU003ISO(String value) {
        this.langu003ISO = value;
    }

    /**
     * Gets the value of the langu004ISO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU004ISO() {
        return langu004ISO;
    }

    /**
     * Sets the value of the langu004ISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU004ISO(String value) {
        this.langu004ISO = value;
    }

    /**
     * Gets the value of the langu005ISO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU005ISO() {
        return langu005ISO;
    }

    /**
     * Sets the value of the langu005ISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU005ISO(String value) {
        this.langu005ISO = value;
    }

    /**
     * Gets the value of the langu006ISO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU006ISO() {
        return langu006ISO;
    }

    /**
     * Sets the value of the langu006ISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU006ISO(String value) {
        this.langu006ISO = value;
    }

    /**
     * Gets the value of the langu007ISO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU007ISO() {
        return langu007ISO;
    }

    /**
     * Sets the value of the langu007ISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU007ISO(String value) {
        this.langu007ISO = value;
    }

    /**
     * Gets the value of the langu008ISO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU008ISO() {
        return langu008ISO;
    }

    /**
     * Sets the value of the langu008ISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU008ISO(String value) {
        this.langu008ISO = value;
    }

    /**
     * Gets the value of the langu009ISO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU009ISO() {
        return langu009ISO;
    }

    /**
     * Sets the value of the langu009ISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU009ISO(String value) {
        this.langu009ISO = value;
    }

    /**
     * Gets the value of the langu010ISO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU010ISO() {
        return langu010ISO;
    }

    /**
     * Sets the value of the langu010ISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU010ISO(String value) {
        this.langu010ISO = value;
    }

    /**
     * Gets the value of the langu011ISO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU011ISO() {
        return langu011ISO;
    }

    /**
     * Sets the value of the langu011ISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU011ISO(String value) {
        this.langu011ISO = value;
    }

    /**
     * Gets the value of the langu012ISO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU012ISO() {
        return langu012ISO;
    }

    /**
     * Sets the value of the langu012ISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU012ISO(String value) {
        this.langu012ISO = value;
    }

    /**
     * Gets the value of the langu013ISO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU013ISO() {
        return langu013ISO;
    }

    /**
     * Sets the value of the langu013ISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU013ISO(String value) {
        this.langu013ISO = value;
    }

    /**
     * Gets the value of the langu014ISO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU014ISO() {
        return langu014ISO;
    }

    /**
     * Sets the value of the langu014ISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU014ISO(String value) {
        this.langu014ISO = value;
    }

    /**
     * Gets the value of the langu015ISO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU015ISO() {
        return langu015ISO;
    }

    /**
     * Sets the value of the langu015ISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU015ISO(String value) {
        this.langu015ISO = value;
    }

    /**
     * Gets the value of the langu016ISO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU016ISO() {
        return langu016ISO;
    }

    /**
     * Sets the value of the langu016ISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU016ISO(String value) {
        this.langu016ISO = value;
    }

    /**
     * Gets the value of the langu017ISO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU017ISO() {
        return langu017ISO;
    }

    /**
     * Sets the value of the langu017ISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU017ISO(String value) {
        this.langu017ISO = value;
    }

    /**
     * Gets the value of the langu018ISO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU018ISO() {
        return langu018ISO;
    }

    /**
     * Sets the value of the langu018ISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU018ISO(String value) {
        this.langu018ISO = value;
    }

    /**
     * Gets the value of the langu019ISO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU019ISO() {
        return langu019ISO;
    }

    /**
     * Sets the value of the langu019ISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU019ISO(String value) {
        this.langu019ISO = value;
    }

    /**
     * Gets the value of the langu020ISO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU020ISO() {
        return langu020ISO;
    }

    /**
     * Sets the value of the langu020ISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU020ISO(String value) {
        this.langu020ISO = value;
    }

    /**
     * Gets the value of the langu021ISO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU021ISO() {
        return langu021ISO;
    }

    /**
     * Sets the value of the langu021ISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU021ISO(String value) {
        this.langu021ISO = value;
    }

    /**
     * Gets the value of the langu022ISO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU022ISO() {
        return langu022ISO;
    }

    /**
     * Sets the value of the langu022ISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU022ISO(String value) {
        this.langu022ISO = value;
    }

    /**
     * Gets the value of the langu023ISO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU023ISO() {
        return langu023ISO;
    }

    /**
     * Sets the value of the langu023ISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU023ISO(String value) {
        this.langu023ISO = value;
    }

    /**
     * Gets the value of the langu024ISO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU024ISO() {
        return langu024ISO;
    }

    /**
     * Sets the value of the langu024ISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU024ISO(String value) {
        this.langu024ISO = value;
    }

    /**
     * Gets the value of the langu025ISO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU025ISO() {
        return langu025ISO;
    }

    /**
     * Sets the value of the langu025ISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU025ISO(String value) {
        this.langu025ISO = value;
    }

    /**
     * Gets the value of the langu026ISO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGU026ISO() {
        return langu026ISO;
    }

    /**
     * Sets the value of the langu026ISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGU026ISO(String value) {
        this.langu026ISO = value;
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
