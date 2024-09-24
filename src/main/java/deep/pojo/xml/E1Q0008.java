
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
 *         &lt;element name="LGA26" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET26" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ26" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN26" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPK26" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA27" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET27" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ27" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN27" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPK27" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA28" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET28" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ28" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN28" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPK28" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA29" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET29" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ29" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN29" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPK29" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA30" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET30" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ30" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN30" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPK30" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA31" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET31" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ31" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN31" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPK31" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA32" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET32" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ32" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN32" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPK32" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA33" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET33" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ33" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN33" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPK33" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA34" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET34" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ34" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN34" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPK34" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA35" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET35" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ35" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN35" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPK35" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA36" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET36" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ36" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN36" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPK36" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA37" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET37" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ37" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN37" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPK37" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA38" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET38" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ38" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN38" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPK38" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA39" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET39" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ39" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN39" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPK39" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA40" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET40" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ40" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN40" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPK40" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND21" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND22" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND23" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND24" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND25" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND26" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND27" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND28" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND29" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND30" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND31" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND32" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND33" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND34" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND35" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND36" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND37" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND38" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND39" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND40" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FLAGA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
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
    "lga26",
    "bet26",
    "anz26",
    "ein26",
    "opk26",
    "lga27",
    "bet27",
    "anz27",
    "ein27",
    "opk27",
    "lga28",
    "bet28",
    "anz28",
    "ein28",
    "opk28",
    "lga29",
    "bet29",
    "anz29",
    "ein29",
    "opk29",
    "lga30",
    "bet30",
    "anz30",
    "ein30",
    "opk30",
    "lga31",
    "bet31",
    "anz31",
    "ein31",
    "opk31",
    "lga32",
    "bet32",
    "anz32",
    "ein32",
    "opk32",
    "lga33",
    "bet33",
    "anz33",
    "ein33",
    "opk33",
    "lga34",
    "bet34",
    "anz34",
    "ein34",
    "opk34",
    "lga35",
    "bet35",
    "anz35",
    "ein35",
    "opk35",
    "lga36",
    "bet36",
    "anz36",
    "ein36",
    "opk36",
    "lga37",
    "bet37",
    "anz37",
    "ein37",
    "opk37",
    "lga38",
    "bet38",
    "anz38",
    "ein38",
    "opk38",
    "lga39",
    "bet39",
    "anz39",
    "ein39",
    "opk39",
    "lga40",
    "bet40",
    "anz40",
    "ein40",
    "opk40",
    "ind21",
    "ind22",
    "ind23",
    "ind24",
    "ind25",
    "ind26",
    "ind27",
    "ind28",
    "ind29",
    "ind30",
    "ind31",
    "ind32",
    "ind33",
    "ind34",
    "ind35",
    "ind36",
    "ind37",
    "ind38",
    "ind39",
    "ind40",
    "flaga",
    "grpvl"
})
public class E1Q0008 {

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
    @XmlElement(name = "LGA26")
    protected String lga26;
    @XmlElement(name = "BET26")
    protected String bet26;
    @XmlElement(name = "ANZ26")
    protected String anz26;
    @XmlElement(name = "EIN26")
    protected String ein26;
    @XmlElement(name = "OPK26")
    protected String opk26;
    @XmlElement(name = "LGA27")
    protected String lga27;
    @XmlElement(name = "BET27")
    protected String bet27;
    @XmlElement(name = "ANZ27")
    protected String anz27;
    @XmlElement(name = "EIN27")
    protected String ein27;
    @XmlElement(name = "OPK27")
    protected String opk27;
    @XmlElement(name = "LGA28")
    protected String lga28;
    @XmlElement(name = "BET28")
    protected String bet28;
    @XmlElement(name = "ANZ28")
    protected String anz28;
    @XmlElement(name = "EIN28")
    protected String ein28;
    @XmlElement(name = "OPK28")
    protected String opk28;
    @XmlElement(name = "LGA29")
    protected String lga29;
    @XmlElement(name = "BET29")
    protected String bet29;
    @XmlElement(name = "ANZ29")
    protected String anz29;
    @XmlElement(name = "EIN29")
    protected String ein29;
    @XmlElement(name = "OPK29")
    protected String opk29;
    @XmlElement(name = "LGA30")
    protected String lga30;
    @XmlElement(name = "BET30")
    protected String bet30;
    @XmlElement(name = "ANZ30")
    protected String anz30;
    @XmlElement(name = "EIN30")
    protected String ein30;
    @XmlElement(name = "OPK30")
    protected String opk30;
    @XmlElement(name = "LGA31")
    protected String lga31;
    @XmlElement(name = "BET31")
    protected String bet31;
    @XmlElement(name = "ANZ31")
    protected String anz31;
    @XmlElement(name = "EIN31")
    protected String ein31;
    @XmlElement(name = "OPK31")
    protected String opk31;
    @XmlElement(name = "LGA32")
    protected String lga32;
    @XmlElement(name = "BET32")
    protected String bet32;
    @XmlElement(name = "ANZ32")
    protected String anz32;
    @XmlElement(name = "EIN32")
    protected String ein32;
    @XmlElement(name = "OPK32")
    protected String opk32;
    @XmlElement(name = "LGA33")
    protected String lga33;
    @XmlElement(name = "BET33")
    protected String bet33;
    @XmlElement(name = "ANZ33")
    protected String anz33;
    @XmlElement(name = "EIN33")
    protected String ein33;
    @XmlElement(name = "OPK33")
    protected String opk33;
    @XmlElement(name = "LGA34")
    protected String lga34;
    @XmlElement(name = "BET34")
    protected String bet34;
    @XmlElement(name = "ANZ34")
    protected String anz34;
    @XmlElement(name = "EIN34")
    protected String ein34;
    @XmlElement(name = "OPK34")
    protected String opk34;
    @XmlElement(name = "LGA35")
    protected String lga35;
    @XmlElement(name = "BET35")
    protected String bet35;
    @XmlElement(name = "ANZ35")
    protected String anz35;
    @XmlElement(name = "EIN35")
    protected String ein35;
    @XmlElement(name = "OPK35")
    protected String opk35;
    @XmlElement(name = "LGA36")
    protected String lga36;
    @XmlElement(name = "BET36")
    protected String bet36;
    @XmlElement(name = "ANZ36")
    protected String anz36;
    @XmlElement(name = "EIN36")
    protected String ein36;
    @XmlElement(name = "OPK36")
    protected String opk36;
    @XmlElement(name = "LGA37")
    protected String lga37;
    @XmlElement(name = "BET37")
    protected String bet37;
    @XmlElement(name = "ANZ37")
    protected String anz37;
    @XmlElement(name = "EIN37")
    protected String ein37;
    @XmlElement(name = "OPK37")
    protected String opk37;
    @XmlElement(name = "LGA38")
    protected String lga38;
    @XmlElement(name = "BET38")
    protected String bet38;
    @XmlElement(name = "ANZ38")
    protected String anz38;
    @XmlElement(name = "EIN38")
    protected String ein38;
    @XmlElement(name = "OPK38")
    protected String opk38;
    @XmlElement(name = "LGA39")
    protected String lga39;
    @XmlElement(name = "BET39")
    protected String bet39;
    @XmlElement(name = "ANZ39")
    protected String anz39;
    @XmlElement(name = "EIN39")
    protected String ein39;
    @XmlElement(name = "OPK39")
    protected String opk39;
    @XmlElement(name = "LGA40")
    protected String lga40;
    @XmlElement(name = "BET40")
    protected String bet40;
    @XmlElement(name = "ANZ40")
    protected String anz40;
    @XmlElement(name = "EIN40")
    protected String ein40;
    @XmlElement(name = "OPK40")
    protected String opk40;
    @XmlElement(name = "IND21")
    protected String ind21;
    @XmlElement(name = "IND22")
    protected String ind22;
    @XmlElement(name = "IND23")
    protected String ind23;
    @XmlElement(name = "IND24")
    protected String ind24;
    @XmlElement(name = "IND25")
    protected String ind25;
    @XmlElement(name = "IND26")
    protected String ind26;
    @XmlElement(name = "IND27")
    protected String ind27;
    @XmlElement(name = "IND28")
    protected String ind28;
    @XmlElement(name = "IND29")
    protected String ind29;
    @XmlElement(name = "IND30")
    protected String ind30;
    @XmlElement(name = "IND31")
    protected String ind31;
    @XmlElement(name = "IND32")
    protected String ind32;
    @XmlElement(name = "IND33")
    protected String ind33;
    @XmlElement(name = "IND34")
    protected String ind34;
    @XmlElement(name = "IND35")
    protected String ind35;
    @XmlElement(name = "IND36")
    protected String ind36;
    @XmlElement(name = "IND37")
    protected String ind37;
    @XmlElement(name = "IND38")
    protected String ind38;
    @XmlElement(name = "IND39")
    protected String ind39;
    @XmlElement(name = "IND40")
    protected String ind40;
    @XmlElement(name = "FLAGA")
    protected String flaga;
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
     * Gets the value of the lga26 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA26() {
        return lga26;
    }

    /**
     * Sets the value of the lga26 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA26(String value) {
        this.lga26 = value;
    }

    /**
     * Gets the value of the bet26 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET26() {
        return bet26;
    }

    /**
     * Sets the value of the bet26 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET26(String value) {
        this.bet26 = value;
    }

    /**
     * Gets the value of the anz26 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ26() {
        return anz26;
    }

    /**
     * Sets the value of the anz26 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ26(String value) {
        this.anz26 = value;
    }

    /**
     * Gets the value of the ein26 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN26() {
        return ein26;
    }

    /**
     * Sets the value of the ein26 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN26(String value) {
        this.ein26 = value;
    }

    /**
     * Gets the value of the opk26 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPK26() {
        return opk26;
    }

    /**
     * Sets the value of the opk26 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPK26(String value) {
        this.opk26 = value;
    }

    /**
     * Gets the value of the lga27 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA27() {
        return lga27;
    }

    /**
     * Sets the value of the lga27 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA27(String value) {
        this.lga27 = value;
    }

    /**
     * Gets the value of the bet27 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET27() {
        return bet27;
    }

    /**
     * Sets the value of the bet27 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET27(String value) {
        this.bet27 = value;
    }

    /**
     * Gets the value of the anz27 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ27() {
        return anz27;
    }

    /**
     * Sets the value of the anz27 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ27(String value) {
        this.anz27 = value;
    }

    /**
     * Gets the value of the ein27 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN27() {
        return ein27;
    }

    /**
     * Sets the value of the ein27 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN27(String value) {
        this.ein27 = value;
    }

    /**
     * Gets the value of the opk27 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPK27() {
        return opk27;
    }

    /**
     * Sets the value of the opk27 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPK27(String value) {
        this.opk27 = value;
    }

    /**
     * Gets the value of the lga28 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA28() {
        return lga28;
    }

    /**
     * Sets the value of the lga28 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA28(String value) {
        this.lga28 = value;
    }

    /**
     * Gets the value of the bet28 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET28() {
        return bet28;
    }

    /**
     * Sets the value of the bet28 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET28(String value) {
        this.bet28 = value;
    }

    /**
     * Gets the value of the anz28 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ28() {
        return anz28;
    }

    /**
     * Sets the value of the anz28 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ28(String value) {
        this.anz28 = value;
    }

    /**
     * Gets the value of the ein28 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN28() {
        return ein28;
    }

    /**
     * Sets the value of the ein28 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN28(String value) {
        this.ein28 = value;
    }

    /**
     * Gets the value of the opk28 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPK28() {
        return opk28;
    }

    /**
     * Sets the value of the opk28 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPK28(String value) {
        this.opk28 = value;
    }

    /**
     * Gets the value of the lga29 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA29() {
        return lga29;
    }

    /**
     * Sets the value of the lga29 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA29(String value) {
        this.lga29 = value;
    }

    /**
     * Gets the value of the bet29 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET29() {
        return bet29;
    }

    /**
     * Sets the value of the bet29 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET29(String value) {
        this.bet29 = value;
    }

    /**
     * Gets the value of the anz29 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ29() {
        return anz29;
    }

    /**
     * Sets the value of the anz29 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ29(String value) {
        this.anz29 = value;
    }

    /**
     * Gets the value of the ein29 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN29() {
        return ein29;
    }

    /**
     * Sets the value of the ein29 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN29(String value) {
        this.ein29 = value;
    }

    /**
     * Gets the value of the opk29 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPK29() {
        return opk29;
    }

    /**
     * Sets the value of the opk29 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPK29(String value) {
        this.opk29 = value;
    }

    /**
     * Gets the value of the lga30 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA30() {
        return lga30;
    }

    /**
     * Sets the value of the lga30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA30(String value) {
        this.lga30 = value;
    }

    /**
     * Gets the value of the bet30 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET30() {
        return bet30;
    }

    /**
     * Sets the value of the bet30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET30(String value) {
        this.bet30 = value;
    }

    /**
     * Gets the value of the anz30 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ30() {
        return anz30;
    }

    /**
     * Sets the value of the anz30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ30(String value) {
        this.anz30 = value;
    }

    /**
     * Gets the value of the ein30 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN30() {
        return ein30;
    }

    /**
     * Sets the value of the ein30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN30(String value) {
        this.ein30 = value;
    }

    /**
     * Gets the value of the opk30 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPK30() {
        return opk30;
    }

    /**
     * Sets the value of the opk30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPK30(String value) {
        this.opk30 = value;
    }

    /**
     * Gets the value of the lga31 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA31() {
        return lga31;
    }

    /**
     * Sets the value of the lga31 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA31(String value) {
        this.lga31 = value;
    }

    /**
     * Gets the value of the bet31 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET31() {
        return bet31;
    }

    /**
     * Sets the value of the bet31 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET31(String value) {
        this.bet31 = value;
    }

    /**
     * Gets the value of the anz31 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ31() {
        return anz31;
    }

    /**
     * Sets the value of the anz31 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ31(String value) {
        this.anz31 = value;
    }

    /**
     * Gets the value of the ein31 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN31() {
        return ein31;
    }

    /**
     * Sets the value of the ein31 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN31(String value) {
        this.ein31 = value;
    }

    /**
     * Gets the value of the opk31 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPK31() {
        return opk31;
    }

    /**
     * Sets the value of the opk31 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPK31(String value) {
        this.opk31 = value;
    }

    /**
     * Gets the value of the lga32 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA32() {
        return lga32;
    }

    /**
     * Sets the value of the lga32 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA32(String value) {
        this.lga32 = value;
    }

    /**
     * Gets the value of the bet32 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET32() {
        return bet32;
    }

    /**
     * Sets the value of the bet32 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET32(String value) {
        this.bet32 = value;
    }

    /**
     * Gets the value of the anz32 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ32() {
        return anz32;
    }

    /**
     * Sets the value of the anz32 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ32(String value) {
        this.anz32 = value;
    }

    /**
     * Gets the value of the ein32 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN32() {
        return ein32;
    }

    /**
     * Sets the value of the ein32 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN32(String value) {
        this.ein32 = value;
    }

    /**
     * Gets the value of the opk32 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPK32() {
        return opk32;
    }

    /**
     * Sets the value of the opk32 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPK32(String value) {
        this.opk32 = value;
    }

    /**
     * Gets the value of the lga33 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA33() {
        return lga33;
    }

    /**
     * Sets the value of the lga33 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA33(String value) {
        this.lga33 = value;
    }

    /**
     * Gets the value of the bet33 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET33() {
        return bet33;
    }

    /**
     * Sets the value of the bet33 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET33(String value) {
        this.bet33 = value;
    }

    /**
     * Gets the value of the anz33 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ33() {
        return anz33;
    }

    /**
     * Sets the value of the anz33 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ33(String value) {
        this.anz33 = value;
    }

    /**
     * Gets the value of the ein33 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN33() {
        return ein33;
    }

    /**
     * Sets the value of the ein33 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN33(String value) {
        this.ein33 = value;
    }

    /**
     * Gets the value of the opk33 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPK33() {
        return opk33;
    }

    /**
     * Sets the value of the opk33 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPK33(String value) {
        this.opk33 = value;
    }

    /**
     * Gets the value of the lga34 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA34() {
        return lga34;
    }

    /**
     * Sets the value of the lga34 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA34(String value) {
        this.lga34 = value;
    }

    /**
     * Gets the value of the bet34 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET34() {
        return bet34;
    }

    /**
     * Sets the value of the bet34 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET34(String value) {
        this.bet34 = value;
    }

    /**
     * Gets the value of the anz34 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ34() {
        return anz34;
    }

    /**
     * Sets the value of the anz34 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ34(String value) {
        this.anz34 = value;
    }

    /**
     * Gets the value of the ein34 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN34() {
        return ein34;
    }

    /**
     * Sets the value of the ein34 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN34(String value) {
        this.ein34 = value;
    }

    /**
     * Gets the value of the opk34 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPK34() {
        return opk34;
    }

    /**
     * Sets the value of the opk34 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPK34(String value) {
        this.opk34 = value;
    }

    /**
     * Gets the value of the lga35 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA35() {
        return lga35;
    }

    /**
     * Sets the value of the lga35 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA35(String value) {
        this.lga35 = value;
    }

    /**
     * Gets the value of the bet35 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET35() {
        return bet35;
    }

    /**
     * Sets the value of the bet35 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET35(String value) {
        this.bet35 = value;
    }

    /**
     * Gets the value of the anz35 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ35() {
        return anz35;
    }

    /**
     * Sets the value of the anz35 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ35(String value) {
        this.anz35 = value;
    }

    /**
     * Gets the value of the ein35 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN35() {
        return ein35;
    }

    /**
     * Sets the value of the ein35 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN35(String value) {
        this.ein35 = value;
    }

    /**
     * Gets the value of the opk35 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPK35() {
        return opk35;
    }

    /**
     * Sets the value of the opk35 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPK35(String value) {
        this.opk35 = value;
    }

    /**
     * Gets the value of the lga36 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA36() {
        return lga36;
    }

    /**
     * Sets the value of the lga36 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA36(String value) {
        this.lga36 = value;
    }

    /**
     * Gets the value of the bet36 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET36() {
        return bet36;
    }

    /**
     * Sets the value of the bet36 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET36(String value) {
        this.bet36 = value;
    }

    /**
     * Gets the value of the anz36 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ36() {
        return anz36;
    }

    /**
     * Sets the value of the anz36 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ36(String value) {
        this.anz36 = value;
    }

    /**
     * Gets the value of the ein36 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN36() {
        return ein36;
    }

    /**
     * Sets the value of the ein36 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN36(String value) {
        this.ein36 = value;
    }

    /**
     * Gets the value of the opk36 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPK36() {
        return opk36;
    }

    /**
     * Sets the value of the opk36 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPK36(String value) {
        this.opk36 = value;
    }

    /**
     * Gets the value of the lga37 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA37() {
        return lga37;
    }

    /**
     * Sets the value of the lga37 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA37(String value) {
        this.lga37 = value;
    }

    /**
     * Gets the value of the bet37 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET37() {
        return bet37;
    }

    /**
     * Sets the value of the bet37 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET37(String value) {
        this.bet37 = value;
    }

    /**
     * Gets the value of the anz37 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ37() {
        return anz37;
    }

    /**
     * Sets the value of the anz37 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ37(String value) {
        this.anz37 = value;
    }

    /**
     * Gets the value of the ein37 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN37() {
        return ein37;
    }

    /**
     * Sets the value of the ein37 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN37(String value) {
        this.ein37 = value;
    }

    /**
     * Gets the value of the opk37 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPK37() {
        return opk37;
    }

    /**
     * Sets the value of the opk37 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPK37(String value) {
        this.opk37 = value;
    }

    /**
     * Gets the value of the lga38 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA38() {
        return lga38;
    }

    /**
     * Sets the value of the lga38 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA38(String value) {
        this.lga38 = value;
    }

    /**
     * Gets the value of the bet38 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET38() {
        return bet38;
    }

    /**
     * Sets the value of the bet38 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET38(String value) {
        this.bet38 = value;
    }

    /**
     * Gets the value of the anz38 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ38() {
        return anz38;
    }

    /**
     * Sets the value of the anz38 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ38(String value) {
        this.anz38 = value;
    }

    /**
     * Gets the value of the ein38 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN38() {
        return ein38;
    }

    /**
     * Sets the value of the ein38 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN38(String value) {
        this.ein38 = value;
    }

    /**
     * Gets the value of the opk38 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPK38() {
        return opk38;
    }

    /**
     * Sets the value of the opk38 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPK38(String value) {
        this.opk38 = value;
    }

    /**
     * Gets the value of the lga39 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA39() {
        return lga39;
    }

    /**
     * Sets the value of the lga39 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA39(String value) {
        this.lga39 = value;
    }

    /**
     * Gets the value of the bet39 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET39() {
        return bet39;
    }

    /**
     * Sets the value of the bet39 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET39(String value) {
        this.bet39 = value;
    }

    /**
     * Gets the value of the anz39 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ39() {
        return anz39;
    }

    /**
     * Sets the value of the anz39 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ39(String value) {
        this.anz39 = value;
    }

    /**
     * Gets the value of the ein39 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN39() {
        return ein39;
    }

    /**
     * Sets the value of the ein39 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN39(String value) {
        this.ein39 = value;
    }

    /**
     * Gets the value of the opk39 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPK39() {
        return opk39;
    }

    /**
     * Sets the value of the opk39 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPK39(String value) {
        this.opk39 = value;
    }

    /**
     * Gets the value of the lga40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA40() {
        return lga40;
    }

    /**
     * Sets the value of the lga40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA40(String value) {
        this.lga40 = value;
    }

    /**
     * Gets the value of the bet40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET40() {
        return bet40;
    }

    /**
     * Sets the value of the bet40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET40(String value) {
        this.bet40 = value;
    }

    /**
     * Gets the value of the anz40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ40() {
        return anz40;
    }

    /**
     * Sets the value of the anz40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ40(String value) {
        this.anz40 = value;
    }

    /**
     * Gets the value of the ein40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN40() {
        return ein40;
    }

    /**
     * Sets the value of the ein40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN40(String value) {
        this.ein40 = value;
    }

    /**
     * Gets the value of the opk40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPK40() {
        return opk40;
    }

    /**
     * Sets the value of the opk40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPK40(String value) {
        this.opk40 = value;
    }

    /**
     * Gets the value of the ind21 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND21() {
        return ind21;
    }

    /**
     * Sets the value of the ind21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND21(String value) {
        this.ind21 = value;
    }

    /**
     * Gets the value of the ind22 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND22() {
        return ind22;
    }

    /**
     * Sets the value of the ind22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND22(String value) {
        this.ind22 = value;
    }

    /**
     * Gets the value of the ind23 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND23() {
        return ind23;
    }

    /**
     * Sets the value of the ind23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND23(String value) {
        this.ind23 = value;
    }

    /**
     * Gets the value of the ind24 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND24() {
        return ind24;
    }

    /**
     * Sets the value of the ind24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND24(String value) {
        this.ind24 = value;
    }

    /**
     * Gets the value of the ind25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND25() {
        return ind25;
    }

    /**
     * Sets the value of the ind25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND25(String value) {
        this.ind25 = value;
    }

    /**
     * Gets the value of the ind26 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND26() {
        return ind26;
    }

    /**
     * Sets the value of the ind26 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND26(String value) {
        this.ind26 = value;
    }

    /**
     * Gets the value of the ind27 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND27() {
        return ind27;
    }

    /**
     * Sets the value of the ind27 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND27(String value) {
        this.ind27 = value;
    }

    /**
     * Gets the value of the ind28 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND28() {
        return ind28;
    }

    /**
     * Sets the value of the ind28 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND28(String value) {
        this.ind28 = value;
    }

    /**
     * Gets the value of the ind29 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND29() {
        return ind29;
    }

    /**
     * Sets the value of the ind29 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND29(String value) {
        this.ind29 = value;
    }

    /**
     * Gets the value of the ind30 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND30() {
        return ind30;
    }

    /**
     * Sets the value of the ind30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND30(String value) {
        this.ind30 = value;
    }

    /**
     * Gets the value of the ind31 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND31() {
        return ind31;
    }

    /**
     * Sets the value of the ind31 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND31(String value) {
        this.ind31 = value;
    }

    /**
     * Gets the value of the ind32 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND32() {
        return ind32;
    }

    /**
     * Sets the value of the ind32 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND32(String value) {
        this.ind32 = value;
    }

    /**
     * Gets the value of the ind33 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND33() {
        return ind33;
    }

    /**
     * Sets the value of the ind33 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND33(String value) {
        this.ind33 = value;
    }

    /**
     * Gets the value of the ind34 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND34() {
        return ind34;
    }

    /**
     * Sets the value of the ind34 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND34(String value) {
        this.ind34 = value;
    }

    /**
     * Gets the value of the ind35 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND35() {
        return ind35;
    }

    /**
     * Sets the value of the ind35 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND35(String value) {
        this.ind35 = value;
    }

    /**
     * Gets the value of the ind36 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND36() {
        return ind36;
    }

    /**
     * Sets the value of the ind36 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND36(String value) {
        this.ind36 = value;
    }

    /**
     * Gets the value of the ind37 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND37() {
        return ind37;
    }

    /**
     * Sets the value of the ind37 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND37(String value) {
        this.ind37 = value;
    }

    /**
     * Gets the value of the ind38 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND38() {
        return ind38;
    }

    /**
     * Sets the value of the ind38 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND38(String value) {
        this.ind38 = value;
    }

    /**
     * Gets the value of the ind39 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND39() {
        return ind39;
    }

    /**
     * Sets the value of the ind39 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND39(String value) {
        this.ind39 = value;
    }

    /**
     * Gets the value of the ind40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND40() {
        return ind40;
    }

    /**
     * Sets the value of the ind40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND40(String value) {
        this.ind40 = value;
    }

    /**
     * Gets the value of the flaga property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGA() {
        return flaga;
    }

    /**
     * Sets the value of the flaga property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGA(String value) {
        this.flaga = value;
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
