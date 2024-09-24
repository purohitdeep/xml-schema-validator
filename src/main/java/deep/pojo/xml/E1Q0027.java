
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
 *         &lt;element name="AUF08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AUF09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AUF10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AUF11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AUF12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AUF13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AUF14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AUF15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AUF16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AUF17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AUF18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AUF19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AUF20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AUF21" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AUF22" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AUF23" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AUF24" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AUF25" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSP01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="24"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSP02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="24"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSP03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="24"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSP04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="24"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSP05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="24"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSP06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="24"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSP07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="24"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSP08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="24"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSP09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="24"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSP10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="24"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSP11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="24"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSP12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="24"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSP13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="24"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSP14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="24"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSP15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="24"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSP16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="24"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSP17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="24"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSP18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="24"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSP19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="24"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSP20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="24"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSP21" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="24"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSP22" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="24"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSP23" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="24"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSP24" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="24"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSP25" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="24"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FKBER01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GRANT01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FKBER02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GRANT02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FKBER03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GRANT03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FKBER04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GRANT04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="E1R0027" minOccurs="0"&gt;
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
 *                   &lt;element name="FKBER05" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="16"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="GRANT05" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="20"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FKBER06" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="16"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="GRANT06" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="20"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FKBER07" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="16"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="GRANT07" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="20"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FKBER08" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="16"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="GRANT08" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="20"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FKBER09" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="16"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="GRANT09" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="20"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FKBER10" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="16"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="GRANT10" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="20"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FKBER11" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="16"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="GRANT11" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="20"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FKBER12" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="16"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="GRANT12" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="20"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FCT09" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="16"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FCD09" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FCT10" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="16"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FCD10" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FCT11" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="16"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FCD11" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FCT12" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="16"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FCD12" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
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
 *                   &lt;element name="SGM01" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SGM02" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SGM03" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SGM04" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SGM05" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SGM06" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SGM07" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SGM08" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SGM09" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SGM10" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SGM11" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SGM12" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BUDGET_PD01" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BUDGET_PD02" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BUDGET_PD03" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BUDGET_PD04" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BUDGET_PD05" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BUDGET_PD06" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BUDGET_PD07" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BUDGET_PD08" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BUDGET_PD09" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BUDGET_PD10" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BUDGET_PD11" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BUDGET_PD12" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
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
    "auf08",
    "auf09",
    "auf10",
    "auf11",
    "auf12",
    "auf13",
    "auf14",
    "auf15",
    "auf16",
    "auf17",
    "auf18",
    "auf19",
    "auf20",
    "auf21",
    "auf22",
    "auf23",
    "auf24",
    "auf25",
    "psp01",
    "psp02",
    "psp03",
    "psp04",
    "psp05",
    "psp06",
    "psp07",
    "psp08",
    "psp09",
    "psp10",
    "psp11",
    "psp12",
    "psp13",
    "psp14",
    "psp15",
    "psp16",
    "psp17",
    "psp18",
    "psp19",
    "psp20",
    "psp21",
    "psp22",
    "psp23",
    "psp24",
    "psp25",
    "fkber01",
    "grant01",
    "fkber02",
    "grant02",
    "fkber03",
    "grant03",
    "fkber04",
    "grant04",
    "e1R0027"
})
public class E1Q0027 {

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
    @XmlElement(name = "AUF08")
    protected String auf08;
    @XmlElement(name = "AUF09")
    protected String auf09;
    @XmlElement(name = "AUF10")
    protected String auf10;
    @XmlElement(name = "AUF11")
    protected String auf11;
    @XmlElement(name = "AUF12")
    protected String auf12;
    @XmlElement(name = "AUF13")
    protected String auf13;
    @XmlElement(name = "AUF14")
    protected String auf14;
    @XmlElement(name = "AUF15")
    protected String auf15;
    @XmlElement(name = "AUF16")
    protected String auf16;
    @XmlElement(name = "AUF17")
    protected String auf17;
    @XmlElement(name = "AUF18")
    protected String auf18;
    @XmlElement(name = "AUF19")
    protected String auf19;
    @XmlElement(name = "AUF20")
    protected String auf20;
    @XmlElement(name = "AUF21")
    protected String auf21;
    @XmlElement(name = "AUF22")
    protected String auf22;
    @XmlElement(name = "AUF23")
    protected String auf23;
    @XmlElement(name = "AUF24")
    protected String auf24;
    @XmlElement(name = "AUF25")
    protected String auf25;
    @XmlElement(name = "PSP01")
    protected String psp01;
    @XmlElement(name = "PSP02")
    protected String psp02;
    @XmlElement(name = "PSP03")
    protected String psp03;
    @XmlElement(name = "PSP04")
    protected String psp04;
    @XmlElement(name = "PSP05")
    protected String psp05;
    @XmlElement(name = "PSP06")
    protected String psp06;
    @XmlElement(name = "PSP07")
    protected String psp07;
    @XmlElement(name = "PSP08")
    protected String psp08;
    @XmlElement(name = "PSP09")
    protected String psp09;
    @XmlElement(name = "PSP10")
    protected String psp10;
    @XmlElement(name = "PSP11")
    protected String psp11;
    @XmlElement(name = "PSP12")
    protected String psp12;
    @XmlElement(name = "PSP13")
    protected String psp13;
    @XmlElement(name = "PSP14")
    protected String psp14;
    @XmlElement(name = "PSP15")
    protected String psp15;
    @XmlElement(name = "PSP16")
    protected String psp16;
    @XmlElement(name = "PSP17")
    protected String psp17;
    @XmlElement(name = "PSP18")
    protected String psp18;
    @XmlElement(name = "PSP19")
    protected String psp19;
    @XmlElement(name = "PSP20")
    protected String psp20;
    @XmlElement(name = "PSP21")
    protected String psp21;
    @XmlElement(name = "PSP22")
    protected String psp22;
    @XmlElement(name = "PSP23")
    protected String psp23;
    @XmlElement(name = "PSP24")
    protected String psp24;
    @XmlElement(name = "PSP25")
    protected String psp25;
    @XmlElement(name = "FKBER01")
    protected String fkber01;
    @XmlElement(name = "GRANT01")
    protected String grant01;
    @XmlElement(name = "FKBER02")
    protected String fkber02;
    @XmlElement(name = "GRANT02")
    protected String grant02;
    @XmlElement(name = "FKBER03")
    protected String fkber03;
    @XmlElement(name = "GRANT03")
    protected String grant03;
    @XmlElement(name = "FKBER04")
    protected String fkber04;
    @XmlElement(name = "GRANT04")
    protected String grant04;
    @XmlElement(name = "E1R0027")
    protected E1R0027 e1R0027;
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
     * Gets the value of the auf08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUF08() {
        return auf08;
    }

    /**
     * Sets the value of the auf08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUF08(String value) {
        this.auf08 = value;
    }

    /**
     * Gets the value of the auf09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUF09() {
        return auf09;
    }

    /**
     * Sets the value of the auf09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUF09(String value) {
        this.auf09 = value;
    }

    /**
     * Gets the value of the auf10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUF10() {
        return auf10;
    }

    /**
     * Sets the value of the auf10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUF10(String value) {
        this.auf10 = value;
    }

    /**
     * Gets the value of the auf11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUF11() {
        return auf11;
    }

    /**
     * Sets the value of the auf11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUF11(String value) {
        this.auf11 = value;
    }

    /**
     * Gets the value of the auf12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUF12() {
        return auf12;
    }

    /**
     * Sets the value of the auf12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUF12(String value) {
        this.auf12 = value;
    }

    /**
     * Gets the value of the auf13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUF13() {
        return auf13;
    }

    /**
     * Sets the value of the auf13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUF13(String value) {
        this.auf13 = value;
    }

    /**
     * Gets the value of the auf14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUF14() {
        return auf14;
    }

    /**
     * Sets the value of the auf14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUF14(String value) {
        this.auf14 = value;
    }

    /**
     * Gets the value of the auf15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUF15() {
        return auf15;
    }

    /**
     * Sets the value of the auf15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUF15(String value) {
        this.auf15 = value;
    }

    /**
     * Gets the value of the auf16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUF16() {
        return auf16;
    }

    /**
     * Sets the value of the auf16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUF16(String value) {
        this.auf16 = value;
    }

    /**
     * Gets the value of the auf17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUF17() {
        return auf17;
    }

    /**
     * Sets the value of the auf17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUF17(String value) {
        this.auf17 = value;
    }

    /**
     * Gets the value of the auf18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUF18() {
        return auf18;
    }

    /**
     * Sets the value of the auf18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUF18(String value) {
        this.auf18 = value;
    }

    /**
     * Gets the value of the auf19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUF19() {
        return auf19;
    }

    /**
     * Sets the value of the auf19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUF19(String value) {
        this.auf19 = value;
    }

    /**
     * Gets the value of the auf20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUF20() {
        return auf20;
    }

    /**
     * Sets the value of the auf20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUF20(String value) {
        this.auf20 = value;
    }

    /**
     * Gets the value of the auf21 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUF21() {
        return auf21;
    }

    /**
     * Sets the value of the auf21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUF21(String value) {
        this.auf21 = value;
    }

    /**
     * Gets the value of the auf22 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUF22() {
        return auf22;
    }

    /**
     * Sets the value of the auf22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUF22(String value) {
        this.auf22 = value;
    }

    /**
     * Gets the value of the auf23 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUF23() {
        return auf23;
    }

    /**
     * Sets the value of the auf23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUF23(String value) {
        this.auf23 = value;
    }

    /**
     * Gets the value of the auf24 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUF24() {
        return auf24;
    }

    /**
     * Sets the value of the auf24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUF24(String value) {
        this.auf24 = value;
    }

    /**
     * Gets the value of the auf25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUF25() {
        return auf25;
    }

    /**
     * Sets the value of the auf25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUF25(String value) {
        this.auf25 = value;
    }

    /**
     * Gets the value of the psp01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSP01() {
        return psp01;
    }

    /**
     * Sets the value of the psp01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSP01(String value) {
        this.psp01 = value;
    }

    /**
     * Gets the value of the psp02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSP02() {
        return psp02;
    }

    /**
     * Sets the value of the psp02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSP02(String value) {
        this.psp02 = value;
    }

    /**
     * Gets the value of the psp03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSP03() {
        return psp03;
    }

    /**
     * Sets the value of the psp03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSP03(String value) {
        this.psp03 = value;
    }

    /**
     * Gets the value of the psp04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSP04() {
        return psp04;
    }

    /**
     * Sets the value of the psp04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSP04(String value) {
        this.psp04 = value;
    }

    /**
     * Gets the value of the psp05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSP05() {
        return psp05;
    }

    /**
     * Sets the value of the psp05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSP05(String value) {
        this.psp05 = value;
    }

    /**
     * Gets the value of the psp06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSP06() {
        return psp06;
    }

    /**
     * Sets the value of the psp06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSP06(String value) {
        this.psp06 = value;
    }

    /**
     * Gets the value of the psp07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSP07() {
        return psp07;
    }

    /**
     * Sets the value of the psp07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSP07(String value) {
        this.psp07 = value;
    }

    /**
     * Gets the value of the psp08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSP08() {
        return psp08;
    }

    /**
     * Sets the value of the psp08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSP08(String value) {
        this.psp08 = value;
    }

    /**
     * Gets the value of the psp09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSP09() {
        return psp09;
    }

    /**
     * Sets the value of the psp09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSP09(String value) {
        this.psp09 = value;
    }

    /**
     * Gets the value of the psp10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSP10() {
        return psp10;
    }

    /**
     * Sets the value of the psp10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSP10(String value) {
        this.psp10 = value;
    }

    /**
     * Gets the value of the psp11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSP11() {
        return psp11;
    }

    /**
     * Sets the value of the psp11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSP11(String value) {
        this.psp11 = value;
    }

    /**
     * Gets the value of the psp12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSP12() {
        return psp12;
    }

    /**
     * Sets the value of the psp12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSP12(String value) {
        this.psp12 = value;
    }

    /**
     * Gets the value of the psp13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSP13() {
        return psp13;
    }

    /**
     * Sets the value of the psp13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSP13(String value) {
        this.psp13 = value;
    }

    /**
     * Gets the value of the psp14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSP14() {
        return psp14;
    }

    /**
     * Sets the value of the psp14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSP14(String value) {
        this.psp14 = value;
    }

    /**
     * Gets the value of the psp15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSP15() {
        return psp15;
    }

    /**
     * Sets the value of the psp15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSP15(String value) {
        this.psp15 = value;
    }

    /**
     * Gets the value of the psp16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSP16() {
        return psp16;
    }

    /**
     * Sets the value of the psp16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSP16(String value) {
        this.psp16 = value;
    }

    /**
     * Gets the value of the psp17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSP17() {
        return psp17;
    }

    /**
     * Sets the value of the psp17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSP17(String value) {
        this.psp17 = value;
    }

    /**
     * Gets the value of the psp18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSP18() {
        return psp18;
    }

    /**
     * Sets the value of the psp18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSP18(String value) {
        this.psp18 = value;
    }

    /**
     * Gets the value of the psp19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSP19() {
        return psp19;
    }

    /**
     * Sets the value of the psp19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSP19(String value) {
        this.psp19 = value;
    }

    /**
     * Gets the value of the psp20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSP20() {
        return psp20;
    }

    /**
     * Sets the value of the psp20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSP20(String value) {
        this.psp20 = value;
    }

    /**
     * Gets the value of the psp21 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSP21() {
        return psp21;
    }

    /**
     * Sets the value of the psp21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSP21(String value) {
        this.psp21 = value;
    }

    /**
     * Gets the value of the psp22 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSP22() {
        return psp22;
    }

    /**
     * Sets the value of the psp22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSP22(String value) {
        this.psp22 = value;
    }

    /**
     * Gets the value of the psp23 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSP23() {
        return psp23;
    }

    /**
     * Sets the value of the psp23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSP23(String value) {
        this.psp23 = value;
    }

    /**
     * Gets the value of the psp24 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSP24() {
        return psp24;
    }

    /**
     * Sets the value of the psp24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSP24(String value) {
        this.psp24 = value;
    }

    /**
     * Gets the value of the psp25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSP25() {
        return psp25;
    }

    /**
     * Sets the value of the psp25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSP25(String value) {
        this.psp25 = value;
    }

    /**
     * Gets the value of the fkber01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFKBER01() {
        return fkber01;
    }

    /**
     * Sets the value of the fkber01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFKBER01(String value) {
        this.fkber01 = value;
    }

    /**
     * Gets the value of the grant01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRANT01() {
        return grant01;
    }

    /**
     * Sets the value of the grant01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRANT01(String value) {
        this.grant01 = value;
    }

    /**
     * Gets the value of the fkber02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFKBER02() {
        return fkber02;
    }

    /**
     * Sets the value of the fkber02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFKBER02(String value) {
        this.fkber02 = value;
    }

    /**
     * Gets the value of the grant02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRANT02() {
        return grant02;
    }

    /**
     * Sets the value of the grant02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRANT02(String value) {
        this.grant02 = value;
    }

    /**
     * Gets the value of the fkber03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFKBER03() {
        return fkber03;
    }

    /**
     * Sets the value of the fkber03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFKBER03(String value) {
        this.fkber03 = value;
    }

    /**
     * Gets the value of the grant03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRANT03() {
        return grant03;
    }

    /**
     * Sets the value of the grant03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRANT03(String value) {
        this.grant03 = value;
    }

    /**
     * Gets the value of the fkber04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFKBER04() {
        return fkber04;
    }

    /**
     * Sets the value of the fkber04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFKBER04(String value) {
        this.fkber04 = value;
    }

    /**
     * Gets the value of the grant04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRANT04() {
        return grant04;
    }

    /**
     * Sets the value of the grant04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRANT04(String value) {
        this.grant04 = value;
    }

    /**
     * Gets the value of the e1R0027 property.
     * 
     * @return
     *     possible object is
     *     {@link E1R0027 }
     *     
     */
    public E1R0027 getE1R0027() {
        return e1R0027;
    }

    /**
     * Sets the value of the e1R0027 property.
     * 
     * @param value
     *     allowed object is
     *     {@link E1R0027 }
     *     
     */
    public void setE1R0027(E1R0027 value) {
        this.e1R0027 = value;
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
