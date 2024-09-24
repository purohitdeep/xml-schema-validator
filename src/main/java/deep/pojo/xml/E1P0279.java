
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
 *         &lt;element name="KASSE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
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
 *         &lt;element name="VAE01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VTY01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VTY02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VTY03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VTY04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VTY05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VTY06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VTY07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VTY08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VTY09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VTY10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VTY11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VTY12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VTY13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VTY14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VTY15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VTY16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VTY17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VTY18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VTY19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VTY20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE01_470" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM01_470" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE02_470" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM02_470" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE03_470" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM03_470" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE04_470" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM04_470" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE05_470" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM05_470" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE06_470" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM06_470" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE07_470" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM07_470" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE08_470" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM08_470" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE09_470" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM09_470" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE10_470" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="E1Q0279" minOccurs="0"&gt;
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
 *                   &lt;element name="VAM10_470" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VAE11_470" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VAM11_470" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VAE12_470" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VAM12_470" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VAE13_470" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VAM13_470" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VAE14_470" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VAM14_470" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VAE15_470" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VAM15_470" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VAE16_470" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VAM16_470" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VAE17_470" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VAM17_470" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VAE18_470" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VAM18_470" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VAE19_470" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VAM19_470" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VAE20_470" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VAM20_470" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VAE21" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VAM21" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VAE22" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VAM22" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VAE23" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VAM23" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VAE24" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VAM24" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VAE25" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VAM25" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VAE26" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VAM26" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VAE27" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VAM27" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VAE28" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VAM28" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VAE29" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VAM29" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VAE30" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VAM30" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VTY21" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VTY22" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VTY23" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VTY24" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VTY25" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VTY26" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VTY27" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VTY28" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VTY29" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VTY30" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
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
    "kasse",
    "waers",
    "vae01",
    "vam01",
    "vty01",
    "vae02",
    "vam02",
    "vty02",
    "vae03",
    "vam03",
    "vty03",
    "vae04",
    "vam04",
    "vty04",
    "vae05",
    "vam05",
    "vty05",
    "vae06",
    "vam06",
    "vty06",
    "vae07",
    "vam07",
    "vty07",
    "vae08",
    "vam08",
    "vty08",
    "vae09",
    "vam09",
    "vty09",
    "vae10",
    "vam10",
    "vty10",
    "vae11",
    "vam11",
    "vty11",
    "vae12",
    "vam12",
    "vty12",
    "vae13",
    "vam13",
    "vty13",
    "vae14",
    "vam14",
    "vty14",
    "vae15",
    "vam15",
    "vty15",
    "vae16",
    "vam16",
    "vty16",
    "vae17",
    "vam17",
    "vty17",
    "vae18",
    "vam18",
    "vty18",
    "vae19",
    "vam19",
    "vty19",
    "vae20",
    "vam20",
    "vty20",
    "vae01470",
    "vam01470",
    "vae02470",
    "vam02470",
    "vae03470",
    "vam03470",
    "vae04470",
    "vam04470",
    "vae05470",
    "vam05470",
    "vae06470",
    "vam06470",
    "vae07470",
    "vam07470",
    "vae08470",
    "vam08470",
    "vae09470",
    "vam09470",
    "vae10470",
    "e1Q0279"
})
public class E1P0279 {

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
    @XmlElement(name = "KASSE")
    protected String kasse;
    @XmlElement(name = "WAERS")
    protected String waers;
    @XmlElement(name = "VAE01")
    protected String vae01;
    @XmlElement(name = "VAM01")
    protected String vam01;
    @XmlElement(name = "VTY01")
    protected String vty01;
    @XmlElement(name = "VAE02")
    protected String vae02;
    @XmlElement(name = "VAM02")
    protected String vam02;
    @XmlElement(name = "VTY02")
    protected String vty02;
    @XmlElement(name = "VAE03")
    protected String vae03;
    @XmlElement(name = "VAM03")
    protected String vam03;
    @XmlElement(name = "VTY03")
    protected String vty03;
    @XmlElement(name = "VAE04")
    protected String vae04;
    @XmlElement(name = "VAM04")
    protected String vam04;
    @XmlElement(name = "VTY04")
    protected String vty04;
    @XmlElement(name = "VAE05")
    protected String vae05;
    @XmlElement(name = "VAM05")
    protected String vam05;
    @XmlElement(name = "VTY05")
    protected String vty05;
    @XmlElement(name = "VAE06")
    protected String vae06;
    @XmlElement(name = "VAM06")
    protected String vam06;
    @XmlElement(name = "VTY06")
    protected String vty06;
    @XmlElement(name = "VAE07")
    protected String vae07;
    @XmlElement(name = "VAM07")
    protected String vam07;
    @XmlElement(name = "VTY07")
    protected String vty07;
    @XmlElement(name = "VAE08")
    protected String vae08;
    @XmlElement(name = "VAM08")
    protected String vam08;
    @XmlElement(name = "VTY08")
    protected String vty08;
    @XmlElement(name = "VAE09")
    protected String vae09;
    @XmlElement(name = "VAM09")
    protected String vam09;
    @XmlElement(name = "VTY09")
    protected String vty09;
    @XmlElement(name = "VAE10")
    protected String vae10;
    @XmlElement(name = "VAM10")
    protected String vam10;
    @XmlElement(name = "VTY10")
    protected String vty10;
    @XmlElement(name = "VAE11")
    protected String vae11;
    @XmlElement(name = "VAM11")
    protected String vam11;
    @XmlElement(name = "VTY11")
    protected String vty11;
    @XmlElement(name = "VAE12")
    protected String vae12;
    @XmlElement(name = "VAM12")
    protected String vam12;
    @XmlElement(name = "VTY12")
    protected String vty12;
    @XmlElement(name = "VAE13")
    protected String vae13;
    @XmlElement(name = "VAM13")
    protected String vam13;
    @XmlElement(name = "VTY13")
    protected String vty13;
    @XmlElement(name = "VAE14")
    protected String vae14;
    @XmlElement(name = "VAM14")
    protected String vam14;
    @XmlElement(name = "VTY14")
    protected String vty14;
    @XmlElement(name = "VAE15")
    protected String vae15;
    @XmlElement(name = "VAM15")
    protected String vam15;
    @XmlElement(name = "VTY15")
    protected String vty15;
    @XmlElement(name = "VAE16")
    protected String vae16;
    @XmlElement(name = "VAM16")
    protected String vam16;
    @XmlElement(name = "VTY16")
    protected String vty16;
    @XmlElement(name = "VAE17")
    protected String vae17;
    @XmlElement(name = "VAM17")
    protected String vam17;
    @XmlElement(name = "VTY17")
    protected String vty17;
    @XmlElement(name = "VAE18")
    protected String vae18;
    @XmlElement(name = "VAM18")
    protected String vam18;
    @XmlElement(name = "VTY18")
    protected String vty18;
    @XmlElement(name = "VAE19")
    protected String vae19;
    @XmlElement(name = "VAM19")
    protected String vam19;
    @XmlElement(name = "VTY19")
    protected String vty19;
    @XmlElement(name = "VAE20")
    protected String vae20;
    @XmlElement(name = "VAM20")
    protected String vam20;
    @XmlElement(name = "VTY20")
    protected String vty20;
    @XmlElement(name = "VAE01_470")
    protected String vae01470;
    @XmlElement(name = "VAM01_470")
    protected String vam01470;
    @XmlElement(name = "VAE02_470")
    protected String vae02470;
    @XmlElement(name = "VAM02_470")
    protected String vam02470;
    @XmlElement(name = "VAE03_470")
    protected String vae03470;
    @XmlElement(name = "VAM03_470")
    protected String vam03470;
    @XmlElement(name = "VAE04_470")
    protected String vae04470;
    @XmlElement(name = "VAM04_470")
    protected String vam04470;
    @XmlElement(name = "VAE05_470")
    protected String vae05470;
    @XmlElement(name = "VAM05_470")
    protected String vam05470;
    @XmlElement(name = "VAE06_470")
    protected String vae06470;
    @XmlElement(name = "VAM06_470")
    protected String vam06470;
    @XmlElement(name = "VAE07_470")
    protected String vae07470;
    @XmlElement(name = "VAM07_470")
    protected String vam07470;
    @XmlElement(name = "VAE08_470")
    protected String vae08470;
    @XmlElement(name = "VAM08_470")
    protected String vam08470;
    @XmlElement(name = "VAE09_470")
    protected String vae09470;
    @XmlElement(name = "VAM09_470")
    protected String vam09470;
    @XmlElement(name = "VAE10_470")
    protected String vae10470;
    @XmlElement(name = "E1Q0279")
    protected E1Q0279 e1Q0279;
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
     * Gets the value of the kasse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKASSE() {
        return kasse;
    }

    /**
     * Sets the value of the kasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKASSE(String value) {
        this.kasse = value;
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
     * Gets the value of the vae01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE01() {
        return vae01;
    }

    /**
     * Sets the value of the vae01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE01(String value) {
        this.vae01 = value;
    }

    /**
     * Gets the value of the vam01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM01() {
        return vam01;
    }

    /**
     * Sets the value of the vam01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM01(String value) {
        this.vam01 = value;
    }

    /**
     * Gets the value of the vty01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTY01() {
        return vty01;
    }

    /**
     * Sets the value of the vty01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTY01(String value) {
        this.vty01 = value;
    }

    /**
     * Gets the value of the vae02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE02() {
        return vae02;
    }

    /**
     * Sets the value of the vae02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE02(String value) {
        this.vae02 = value;
    }

    /**
     * Gets the value of the vam02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM02() {
        return vam02;
    }

    /**
     * Sets the value of the vam02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM02(String value) {
        this.vam02 = value;
    }

    /**
     * Gets the value of the vty02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTY02() {
        return vty02;
    }

    /**
     * Sets the value of the vty02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTY02(String value) {
        this.vty02 = value;
    }

    /**
     * Gets the value of the vae03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE03() {
        return vae03;
    }

    /**
     * Sets the value of the vae03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE03(String value) {
        this.vae03 = value;
    }

    /**
     * Gets the value of the vam03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM03() {
        return vam03;
    }

    /**
     * Sets the value of the vam03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM03(String value) {
        this.vam03 = value;
    }

    /**
     * Gets the value of the vty03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTY03() {
        return vty03;
    }

    /**
     * Sets the value of the vty03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTY03(String value) {
        this.vty03 = value;
    }

    /**
     * Gets the value of the vae04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE04() {
        return vae04;
    }

    /**
     * Sets the value of the vae04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE04(String value) {
        this.vae04 = value;
    }

    /**
     * Gets the value of the vam04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM04() {
        return vam04;
    }

    /**
     * Sets the value of the vam04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM04(String value) {
        this.vam04 = value;
    }

    /**
     * Gets the value of the vty04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTY04() {
        return vty04;
    }

    /**
     * Sets the value of the vty04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTY04(String value) {
        this.vty04 = value;
    }

    /**
     * Gets the value of the vae05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE05() {
        return vae05;
    }

    /**
     * Sets the value of the vae05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE05(String value) {
        this.vae05 = value;
    }

    /**
     * Gets the value of the vam05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM05() {
        return vam05;
    }

    /**
     * Sets the value of the vam05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM05(String value) {
        this.vam05 = value;
    }

    /**
     * Gets the value of the vty05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTY05() {
        return vty05;
    }

    /**
     * Sets the value of the vty05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTY05(String value) {
        this.vty05 = value;
    }

    /**
     * Gets the value of the vae06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE06() {
        return vae06;
    }

    /**
     * Sets the value of the vae06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE06(String value) {
        this.vae06 = value;
    }

    /**
     * Gets the value of the vam06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM06() {
        return vam06;
    }

    /**
     * Sets the value of the vam06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM06(String value) {
        this.vam06 = value;
    }

    /**
     * Gets the value of the vty06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTY06() {
        return vty06;
    }

    /**
     * Sets the value of the vty06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTY06(String value) {
        this.vty06 = value;
    }

    /**
     * Gets the value of the vae07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE07() {
        return vae07;
    }

    /**
     * Sets the value of the vae07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE07(String value) {
        this.vae07 = value;
    }

    /**
     * Gets the value of the vam07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM07() {
        return vam07;
    }

    /**
     * Sets the value of the vam07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM07(String value) {
        this.vam07 = value;
    }

    /**
     * Gets the value of the vty07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTY07() {
        return vty07;
    }

    /**
     * Sets the value of the vty07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTY07(String value) {
        this.vty07 = value;
    }

    /**
     * Gets the value of the vae08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE08() {
        return vae08;
    }

    /**
     * Sets the value of the vae08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE08(String value) {
        this.vae08 = value;
    }

    /**
     * Gets the value of the vam08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM08() {
        return vam08;
    }

    /**
     * Sets the value of the vam08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM08(String value) {
        this.vam08 = value;
    }

    /**
     * Gets the value of the vty08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTY08() {
        return vty08;
    }

    /**
     * Sets the value of the vty08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTY08(String value) {
        this.vty08 = value;
    }

    /**
     * Gets the value of the vae09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE09() {
        return vae09;
    }

    /**
     * Sets the value of the vae09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE09(String value) {
        this.vae09 = value;
    }

    /**
     * Gets the value of the vam09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM09() {
        return vam09;
    }

    /**
     * Sets the value of the vam09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM09(String value) {
        this.vam09 = value;
    }

    /**
     * Gets the value of the vty09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTY09() {
        return vty09;
    }

    /**
     * Sets the value of the vty09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTY09(String value) {
        this.vty09 = value;
    }

    /**
     * Gets the value of the vae10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE10() {
        return vae10;
    }

    /**
     * Sets the value of the vae10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE10(String value) {
        this.vae10 = value;
    }

    /**
     * Gets the value of the vam10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM10() {
        return vam10;
    }

    /**
     * Sets the value of the vam10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM10(String value) {
        this.vam10 = value;
    }

    /**
     * Gets the value of the vty10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTY10() {
        return vty10;
    }

    /**
     * Sets the value of the vty10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTY10(String value) {
        this.vty10 = value;
    }

    /**
     * Gets the value of the vae11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE11() {
        return vae11;
    }

    /**
     * Sets the value of the vae11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE11(String value) {
        this.vae11 = value;
    }

    /**
     * Gets the value of the vam11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM11() {
        return vam11;
    }

    /**
     * Sets the value of the vam11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM11(String value) {
        this.vam11 = value;
    }

    /**
     * Gets the value of the vty11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTY11() {
        return vty11;
    }

    /**
     * Sets the value of the vty11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTY11(String value) {
        this.vty11 = value;
    }

    /**
     * Gets the value of the vae12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE12() {
        return vae12;
    }

    /**
     * Sets the value of the vae12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE12(String value) {
        this.vae12 = value;
    }

    /**
     * Gets the value of the vam12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM12() {
        return vam12;
    }

    /**
     * Sets the value of the vam12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM12(String value) {
        this.vam12 = value;
    }

    /**
     * Gets the value of the vty12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTY12() {
        return vty12;
    }

    /**
     * Sets the value of the vty12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTY12(String value) {
        this.vty12 = value;
    }

    /**
     * Gets the value of the vae13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE13() {
        return vae13;
    }

    /**
     * Sets the value of the vae13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE13(String value) {
        this.vae13 = value;
    }

    /**
     * Gets the value of the vam13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM13() {
        return vam13;
    }

    /**
     * Sets the value of the vam13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM13(String value) {
        this.vam13 = value;
    }

    /**
     * Gets the value of the vty13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTY13() {
        return vty13;
    }

    /**
     * Sets the value of the vty13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTY13(String value) {
        this.vty13 = value;
    }

    /**
     * Gets the value of the vae14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE14() {
        return vae14;
    }

    /**
     * Sets the value of the vae14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE14(String value) {
        this.vae14 = value;
    }

    /**
     * Gets the value of the vam14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM14() {
        return vam14;
    }

    /**
     * Sets the value of the vam14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM14(String value) {
        this.vam14 = value;
    }

    /**
     * Gets the value of the vty14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTY14() {
        return vty14;
    }

    /**
     * Sets the value of the vty14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTY14(String value) {
        this.vty14 = value;
    }

    /**
     * Gets the value of the vae15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE15() {
        return vae15;
    }

    /**
     * Sets the value of the vae15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE15(String value) {
        this.vae15 = value;
    }

    /**
     * Gets the value of the vam15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM15() {
        return vam15;
    }

    /**
     * Sets the value of the vam15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM15(String value) {
        this.vam15 = value;
    }

    /**
     * Gets the value of the vty15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTY15() {
        return vty15;
    }

    /**
     * Sets the value of the vty15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTY15(String value) {
        this.vty15 = value;
    }

    /**
     * Gets the value of the vae16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE16() {
        return vae16;
    }

    /**
     * Sets the value of the vae16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE16(String value) {
        this.vae16 = value;
    }

    /**
     * Gets the value of the vam16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM16() {
        return vam16;
    }

    /**
     * Sets the value of the vam16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM16(String value) {
        this.vam16 = value;
    }

    /**
     * Gets the value of the vty16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTY16() {
        return vty16;
    }

    /**
     * Sets the value of the vty16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTY16(String value) {
        this.vty16 = value;
    }

    /**
     * Gets the value of the vae17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE17() {
        return vae17;
    }

    /**
     * Sets the value of the vae17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE17(String value) {
        this.vae17 = value;
    }

    /**
     * Gets the value of the vam17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM17() {
        return vam17;
    }

    /**
     * Sets the value of the vam17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM17(String value) {
        this.vam17 = value;
    }

    /**
     * Gets the value of the vty17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTY17() {
        return vty17;
    }

    /**
     * Sets the value of the vty17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTY17(String value) {
        this.vty17 = value;
    }

    /**
     * Gets the value of the vae18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE18() {
        return vae18;
    }

    /**
     * Sets the value of the vae18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE18(String value) {
        this.vae18 = value;
    }

    /**
     * Gets the value of the vam18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM18() {
        return vam18;
    }

    /**
     * Sets the value of the vam18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM18(String value) {
        this.vam18 = value;
    }

    /**
     * Gets the value of the vty18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTY18() {
        return vty18;
    }

    /**
     * Sets the value of the vty18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTY18(String value) {
        this.vty18 = value;
    }

    /**
     * Gets the value of the vae19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE19() {
        return vae19;
    }

    /**
     * Sets the value of the vae19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE19(String value) {
        this.vae19 = value;
    }

    /**
     * Gets the value of the vam19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM19() {
        return vam19;
    }

    /**
     * Sets the value of the vam19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM19(String value) {
        this.vam19 = value;
    }

    /**
     * Gets the value of the vty19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTY19() {
        return vty19;
    }

    /**
     * Sets the value of the vty19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTY19(String value) {
        this.vty19 = value;
    }

    /**
     * Gets the value of the vae20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE20() {
        return vae20;
    }

    /**
     * Sets the value of the vae20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE20(String value) {
        this.vae20 = value;
    }

    /**
     * Gets the value of the vam20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM20() {
        return vam20;
    }

    /**
     * Sets the value of the vam20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM20(String value) {
        this.vam20 = value;
    }

    /**
     * Gets the value of the vty20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTY20() {
        return vty20;
    }

    /**
     * Sets the value of the vty20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTY20(String value) {
        this.vty20 = value;
    }

    /**
     * Gets the value of the vae01470 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE01470() {
        return vae01470;
    }

    /**
     * Sets the value of the vae01470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE01470(String value) {
        this.vae01470 = value;
    }

    /**
     * Gets the value of the vam01470 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM01470() {
        return vam01470;
    }

    /**
     * Sets the value of the vam01470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM01470(String value) {
        this.vam01470 = value;
    }

    /**
     * Gets the value of the vae02470 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE02470() {
        return vae02470;
    }

    /**
     * Sets the value of the vae02470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE02470(String value) {
        this.vae02470 = value;
    }

    /**
     * Gets the value of the vam02470 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM02470() {
        return vam02470;
    }

    /**
     * Sets the value of the vam02470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM02470(String value) {
        this.vam02470 = value;
    }

    /**
     * Gets the value of the vae03470 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE03470() {
        return vae03470;
    }

    /**
     * Sets the value of the vae03470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE03470(String value) {
        this.vae03470 = value;
    }

    /**
     * Gets the value of the vam03470 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM03470() {
        return vam03470;
    }

    /**
     * Sets the value of the vam03470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM03470(String value) {
        this.vam03470 = value;
    }

    /**
     * Gets the value of the vae04470 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE04470() {
        return vae04470;
    }

    /**
     * Sets the value of the vae04470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE04470(String value) {
        this.vae04470 = value;
    }

    /**
     * Gets the value of the vam04470 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM04470() {
        return vam04470;
    }

    /**
     * Sets the value of the vam04470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM04470(String value) {
        this.vam04470 = value;
    }

    /**
     * Gets the value of the vae05470 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE05470() {
        return vae05470;
    }

    /**
     * Sets the value of the vae05470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE05470(String value) {
        this.vae05470 = value;
    }

    /**
     * Gets the value of the vam05470 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM05470() {
        return vam05470;
    }

    /**
     * Sets the value of the vam05470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM05470(String value) {
        this.vam05470 = value;
    }

    /**
     * Gets the value of the vae06470 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE06470() {
        return vae06470;
    }

    /**
     * Sets the value of the vae06470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE06470(String value) {
        this.vae06470 = value;
    }

    /**
     * Gets the value of the vam06470 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM06470() {
        return vam06470;
    }

    /**
     * Sets the value of the vam06470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM06470(String value) {
        this.vam06470 = value;
    }

    /**
     * Gets the value of the vae07470 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE07470() {
        return vae07470;
    }

    /**
     * Sets the value of the vae07470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE07470(String value) {
        this.vae07470 = value;
    }

    /**
     * Gets the value of the vam07470 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM07470() {
        return vam07470;
    }

    /**
     * Sets the value of the vam07470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM07470(String value) {
        this.vam07470 = value;
    }

    /**
     * Gets the value of the vae08470 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE08470() {
        return vae08470;
    }

    /**
     * Sets the value of the vae08470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE08470(String value) {
        this.vae08470 = value;
    }

    /**
     * Gets the value of the vam08470 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM08470() {
        return vam08470;
    }

    /**
     * Sets the value of the vam08470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM08470(String value) {
        this.vam08470 = value;
    }

    /**
     * Gets the value of the vae09470 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE09470() {
        return vae09470;
    }

    /**
     * Sets the value of the vae09470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE09470(String value) {
        this.vae09470 = value;
    }

    /**
     * Gets the value of the vam09470 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM09470() {
        return vam09470;
    }

    /**
     * Sets the value of the vam09470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM09470(String value) {
        this.vam09470 = value;
    }

    /**
     * Gets the value of the vae10470 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE10470() {
        return vae10470;
    }

    /**
     * Sets the value of the vae10470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE10470(String value) {
        this.vae10470 = value;
    }

    /**
     * Gets the value of the e1Q0279 property.
     * 
     * @return
     *     possible object is
     *     {@link E1Q0279 }
     *     
     */
    public E1Q0279 getE1Q0279() {
        return e1Q0279;
    }

    /**
     * Sets the value of the e1Q0279 property.
     * 
     * @param value
     *     allowed object is
     *     {@link E1Q0279 }
     *     
     */
    public void setE1Q0279(E1Q0279 value) {
        this.e1Q0279 = value;
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
