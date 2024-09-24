
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
 *         &lt;element name="VAM10_470" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE11_470" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM11_470" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE12_470" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM12_470" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE13_470" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM13_470" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE14_470" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM14_470" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE15_470" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM15_470" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE16_470" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM16_470" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE17_470" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM17_470" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE18_470" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM18_470" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE19_470" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM19_470" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE20_470" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM20_470" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE21" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM21" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE22" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM22" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE23" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM23" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE24" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM24" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE25" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM25" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE26" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM26" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE27" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM27" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE28" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM28" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE29" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM29" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAE30" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VAM30" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VTY21" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VTY22" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VTY23" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VTY24" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VTY25" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VTY26" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VTY27" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VTY28" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VTY29" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VTY30" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
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
    "vam10470",
    "vae11470",
    "vam11470",
    "vae12470",
    "vam12470",
    "vae13470",
    "vam13470",
    "vae14470",
    "vam14470",
    "vae15470",
    "vam15470",
    "vae16470",
    "vam16470",
    "vae17470",
    "vam17470",
    "vae18470",
    "vam18470",
    "vae19470",
    "vam19470",
    "vae20470",
    "vam20470",
    "vae21",
    "vam21",
    "vae22",
    "vam22",
    "vae23",
    "vam23",
    "vae24",
    "vam24",
    "vae25",
    "vam25",
    "vae26",
    "vam26",
    "vae27",
    "vam27",
    "vae28",
    "vam28",
    "vae29",
    "vam29",
    "vae30",
    "vam30",
    "vty21",
    "vty22",
    "vty23",
    "vty24",
    "vty25",
    "vty26",
    "vty27",
    "vty28",
    "vty29",
    "vty30",
    "grpvl"
})
public class E1Q0279 {

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
    @XmlElement(name = "VAM10_470")
    protected String vam10470;
    @XmlElement(name = "VAE11_470")
    protected String vae11470;
    @XmlElement(name = "VAM11_470")
    protected String vam11470;
    @XmlElement(name = "VAE12_470")
    protected String vae12470;
    @XmlElement(name = "VAM12_470")
    protected String vam12470;
    @XmlElement(name = "VAE13_470")
    protected String vae13470;
    @XmlElement(name = "VAM13_470")
    protected String vam13470;
    @XmlElement(name = "VAE14_470")
    protected String vae14470;
    @XmlElement(name = "VAM14_470")
    protected String vam14470;
    @XmlElement(name = "VAE15_470")
    protected String vae15470;
    @XmlElement(name = "VAM15_470")
    protected String vam15470;
    @XmlElement(name = "VAE16_470")
    protected String vae16470;
    @XmlElement(name = "VAM16_470")
    protected String vam16470;
    @XmlElement(name = "VAE17_470")
    protected String vae17470;
    @XmlElement(name = "VAM17_470")
    protected String vam17470;
    @XmlElement(name = "VAE18_470")
    protected String vae18470;
    @XmlElement(name = "VAM18_470")
    protected String vam18470;
    @XmlElement(name = "VAE19_470")
    protected String vae19470;
    @XmlElement(name = "VAM19_470")
    protected String vam19470;
    @XmlElement(name = "VAE20_470")
    protected String vae20470;
    @XmlElement(name = "VAM20_470")
    protected String vam20470;
    @XmlElement(name = "VAE21")
    protected String vae21;
    @XmlElement(name = "VAM21")
    protected String vam21;
    @XmlElement(name = "VAE22")
    protected String vae22;
    @XmlElement(name = "VAM22")
    protected String vam22;
    @XmlElement(name = "VAE23")
    protected String vae23;
    @XmlElement(name = "VAM23")
    protected String vam23;
    @XmlElement(name = "VAE24")
    protected String vae24;
    @XmlElement(name = "VAM24")
    protected String vam24;
    @XmlElement(name = "VAE25")
    protected String vae25;
    @XmlElement(name = "VAM25")
    protected String vam25;
    @XmlElement(name = "VAE26")
    protected String vae26;
    @XmlElement(name = "VAM26")
    protected String vam26;
    @XmlElement(name = "VAE27")
    protected String vae27;
    @XmlElement(name = "VAM27")
    protected String vam27;
    @XmlElement(name = "VAE28")
    protected String vae28;
    @XmlElement(name = "VAM28")
    protected String vam28;
    @XmlElement(name = "VAE29")
    protected String vae29;
    @XmlElement(name = "VAM29")
    protected String vam29;
    @XmlElement(name = "VAE30")
    protected String vae30;
    @XmlElement(name = "VAM30")
    protected String vam30;
    @XmlElement(name = "VTY21")
    protected String vty21;
    @XmlElement(name = "VTY22")
    protected String vty22;
    @XmlElement(name = "VTY23")
    protected String vty23;
    @XmlElement(name = "VTY24")
    protected String vty24;
    @XmlElement(name = "VTY25")
    protected String vty25;
    @XmlElement(name = "VTY26")
    protected String vty26;
    @XmlElement(name = "VTY27")
    protected String vty27;
    @XmlElement(name = "VTY28")
    protected String vty28;
    @XmlElement(name = "VTY29")
    protected String vty29;
    @XmlElement(name = "VTY30")
    protected String vty30;
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
     * Gets the value of the vam10470 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM10470() {
        return vam10470;
    }

    /**
     * Sets the value of the vam10470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM10470(String value) {
        this.vam10470 = value;
    }

    /**
     * Gets the value of the vae11470 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE11470() {
        return vae11470;
    }

    /**
     * Sets the value of the vae11470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE11470(String value) {
        this.vae11470 = value;
    }

    /**
     * Gets the value of the vam11470 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM11470() {
        return vam11470;
    }

    /**
     * Sets the value of the vam11470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM11470(String value) {
        this.vam11470 = value;
    }

    /**
     * Gets the value of the vae12470 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE12470() {
        return vae12470;
    }

    /**
     * Sets the value of the vae12470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE12470(String value) {
        this.vae12470 = value;
    }

    /**
     * Gets the value of the vam12470 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM12470() {
        return vam12470;
    }

    /**
     * Sets the value of the vam12470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM12470(String value) {
        this.vam12470 = value;
    }

    /**
     * Gets the value of the vae13470 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE13470() {
        return vae13470;
    }

    /**
     * Sets the value of the vae13470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE13470(String value) {
        this.vae13470 = value;
    }

    /**
     * Gets the value of the vam13470 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM13470() {
        return vam13470;
    }

    /**
     * Sets the value of the vam13470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM13470(String value) {
        this.vam13470 = value;
    }

    /**
     * Gets the value of the vae14470 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE14470() {
        return vae14470;
    }

    /**
     * Sets the value of the vae14470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE14470(String value) {
        this.vae14470 = value;
    }

    /**
     * Gets the value of the vam14470 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM14470() {
        return vam14470;
    }

    /**
     * Sets the value of the vam14470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM14470(String value) {
        this.vam14470 = value;
    }

    /**
     * Gets the value of the vae15470 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE15470() {
        return vae15470;
    }

    /**
     * Sets the value of the vae15470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE15470(String value) {
        this.vae15470 = value;
    }

    /**
     * Gets the value of the vam15470 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM15470() {
        return vam15470;
    }

    /**
     * Sets the value of the vam15470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM15470(String value) {
        this.vam15470 = value;
    }

    /**
     * Gets the value of the vae16470 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE16470() {
        return vae16470;
    }

    /**
     * Sets the value of the vae16470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE16470(String value) {
        this.vae16470 = value;
    }

    /**
     * Gets the value of the vam16470 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM16470() {
        return vam16470;
    }

    /**
     * Sets the value of the vam16470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM16470(String value) {
        this.vam16470 = value;
    }

    /**
     * Gets the value of the vae17470 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE17470() {
        return vae17470;
    }

    /**
     * Sets the value of the vae17470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE17470(String value) {
        this.vae17470 = value;
    }

    /**
     * Gets the value of the vam17470 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM17470() {
        return vam17470;
    }

    /**
     * Sets the value of the vam17470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM17470(String value) {
        this.vam17470 = value;
    }

    /**
     * Gets the value of the vae18470 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE18470() {
        return vae18470;
    }

    /**
     * Sets the value of the vae18470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE18470(String value) {
        this.vae18470 = value;
    }

    /**
     * Gets the value of the vam18470 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM18470() {
        return vam18470;
    }

    /**
     * Sets the value of the vam18470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM18470(String value) {
        this.vam18470 = value;
    }

    /**
     * Gets the value of the vae19470 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE19470() {
        return vae19470;
    }

    /**
     * Sets the value of the vae19470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE19470(String value) {
        this.vae19470 = value;
    }

    /**
     * Gets the value of the vam19470 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM19470() {
        return vam19470;
    }

    /**
     * Sets the value of the vam19470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM19470(String value) {
        this.vam19470 = value;
    }

    /**
     * Gets the value of the vae20470 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE20470() {
        return vae20470;
    }

    /**
     * Sets the value of the vae20470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE20470(String value) {
        this.vae20470 = value;
    }

    /**
     * Gets the value of the vam20470 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM20470() {
        return vam20470;
    }

    /**
     * Sets the value of the vam20470 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM20470(String value) {
        this.vam20470 = value;
    }

    /**
     * Gets the value of the vae21 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE21() {
        return vae21;
    }

    /**
     * Sets the value of the vae21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE21(String value) {
        this.vae21 = value;
    }

    /**
     * Gets the value of the vam21 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM21() {
        return vam21;
    }

    /**
     * Sets the value of the vam21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM21(String value) {
        this.vam21 = value;
    }

    /**
     * Gets the value of the vae22 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE22() {
        return vae22;
    }

    /**
     * Sets the value of the vae22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE22(String value) {
        this.vae22 = value;
    }

    /**
     * Gets the value of the vam22 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM22() {
        return vam22;
    }

    /**
     * Sets the value of the vam22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM22(String value) {
        this.vam22 = value;
    }

    /**
     * Gets the value of the vae23 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE23() {
        return vae23;
    }

    /**
     * Sets the value of the vae23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE23(String value) {
        this.vae23 = value;
    }

    /**
     * Gets the value of the vam23 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM23() {
        return vam23;
    }

    /**
     * Sets the value of the vam23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM23(String value) {
        this.vam23 = value;
    }

    /**
     * Gets the value of the vae24 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE24() {
        return vae24;
    }

    /**
     * Sets the value of the vae24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE24(String value) {
        this.vae24 = value;
    }

    /**
     * Gets the value of the vam24 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM24() {
        return vam24;
    }

    /**
     * Sets the value of the vam24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM24(String value) {
        this.vam24 = value;
    }

    /**
     * Gets the value of the vae25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE25() {
        return vae25;
    }

    /**
     * Sets the value of the vae25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE25(String value) {
        this.vae25 = value;
    }

    /**
     * Gets the value of the vam25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM25() {
        return vam25;
    }

    /**
     * Sets the value of the vam25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM25(String value) {
        this.vam25 = value;
    }

    /**
     * Gets the value of the vae26 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE26() {
        return vae26;
    }

    /**
     * Sets the value of the vae26 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE26(String value) {
        this.vae26 = value;
    }

    /**
     * Gets the value of the vam26 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM26() {
        return vam26;
    }

    /**
     * Sets the value of the vam26 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM26(String value) {
        this.vam26 = value;
    }

    /**
     * Gets the value of the vae27 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE27() {
        return vae27;
    }

    /**
     * Sets the value of the vae27 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE27(String value) {
        this.vae27 = value;
    }

    /**
     * Gets the value of the vam27 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM27() {
        return vam27;
    }

    /**
     * Sets the value of the vam27 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM27(String value) {
        this.vam27 = value;
    }

    /**
     * Gets the value of the vae28 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE28() {
        return vae28;
    }

    /**
     * Sets the value of the vae28 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE28(String value) {
        this.vae28 = value;
    }

    /**
     * Gets the value of the vam28 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM28() {
        return vam28;
    }

    /**
     * Sets the value of the vam28 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM28(String value) {
        this.vam28 = value;
    }

    /**
     * Gets the value of the vae29 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE29() {
        return vae29;
    }

    /**
     * Sets the value of the vae29 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE29(String value) {
        this.vae29 = value;
    }

    /**
     * Gets the value of the vam29 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM29() {
        return vam29;
    }

    /**
     * Sets the value of the vam29 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM29(String value) {
        this.vam29 = value;
    }

    /**
     * Gets the value of the vae30 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAE30() {
        return vae30;
    }

    /**
     * Sets the value of the vae30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAE30(String value) {
        this.vae30 = value;
    }

    /**
     * Gets the value of the vam30 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAM30() {
        return vam30;
    }

    /**
     * Sets the value of the vam30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAM30(String value) {
        this.vam30 = value;
    }

    /**
     * Gets the value of the vty21 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTY21() {
        return vty21;
    }

    /**
     * Sets the value of the vty21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTY21(String value) {
        this.vty21 = value;
    }

    /**
     * Gets the value of the vty22 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTY22() {
        return vty22;
    }

    /**
     * Sets the value of the vty22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTY22(String value) {
        this.vty22 = value;
    }

    /**
     * Gets the value of the vty23 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTY23() {
        return vty23;
    }

    /**
     * Sets the value of the vty23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTY23(String value) {
        this.vty23 = value;
    }

    /**
     * Gets the value of the vty24 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTY24() {
        return vty24;
    }

    /**
     * Sets the value of the vty24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTY24(String value) {
        this.vty24 = value;
    }

    /**
     * Gets the value of the vty25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTY25() {
        return vty25;
    }

    /**
     * Sets the value of the vty25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTY25(String value) {
        this.vty25 = value;
    }

    /**
     * Gets the value of the vty26 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTY26() {
        return vty26;
    }

    /**
     * Sets the value of the vty26 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTY26(String value) {
        this.vty26 = value;
    }

    /**
     * Gets the value of the vty27 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTY27() {
        return vty27;
    }

    /**
     * Sets the value of the vty27 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTY27(String value) {
        this.vty27 = value;
    }

    /**
     * Gets the value of the vty28 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTY28() {
        return vty28;
    }

    /**
     * Sets the value of the vty28 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTY28(String value) {
        this.vty28 = value;
    }

    /**
     * Gets the value of the vty29 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTY29() {
        return vty29;
    }

    /**
     * Sets the value of the vty29 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTY29(String value) {
        this.vty29 = value;
    }

    /**
     * Gets the value of the vty30 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTY30() {
        return vty30;
    }

    /**
     * Sets the value of the vty30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTY30(String value) {
        this.vty30 = value;
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
