
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
 *         &lt;element name="KDZW1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDWW1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDWAO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDZKS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NVERZ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BDRPR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INHPR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BDRWG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INHBS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DATSF" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BMETH" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EXSV1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EXSV2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EXSV3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EXSV4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EXSV5" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SVGRP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SVDAY" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SVMET" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZKVGP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PKLAS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZKVNR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MBVCD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UPKOW" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ARBGK" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DATAG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JGKRT" minOccurs="0"&gt;
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
 *         &lt;element name="NOMPR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WGBNP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INCVZ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IDCVZ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FACVZ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SIRHE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SIBEG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SIEND" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EXREE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SIEMA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="REPOR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EXSJR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LCBCD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LCBBD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EXSV6" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EXSV7" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CTTYP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CTEDT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CTWRT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CTSBY" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CTRRS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CTANH" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
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
    "kdzw1",
    "kdww1",
    "kdwao",
    "kdzks",
    "nverz",
    "bdrpr",
    "inhpr",
    "bdrwg",
    "inhbs",
    "datsf",
    "bmeth",
    "exsv1",
    "exsv2",
    "exsv3",
    "exsv4",
    "exsv5",
    "svgrp",
    "svday",
    "svmet",
    "zkvgp",
    "pklas",
    "zkvnr",
    "mbvcd",
    "upkow",
    "arbgk",
    "datag",
    "jgkrt",
    "grpvl",
    "nompr",
    "wgbnp",
    "incvz",
    "idcvz",
    "facvz",
    "sirhe",
    "sibeg",
    "siend",
    "exree",
    "siema",
    "repor",
    "exsjr",
    "lcbcd",
    "lcbbd",
    "exsv6",
    "exsv7",
    "cttyp",
    "ctedt",
    "ctwrt",
    "ctsby",
    "ctrrs",
    "ctanh"
})
public class E1P0059 {

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
    @XmlElement(name = "KDZW1")
    protected String kdzw1;
    @XmlElement(name = "KDWW1")
    protected String kdww1;
    @XmlElement(name = "KDWAO")
    protected String kdwao;
    @XmlElement(name = "KDZKS")
    protected String kdzks;
    @XmlElement(name = "NVERZ")
    protected String nverz;
    @XmlElement(name = "BDRPR")
    protected String bdrpr;
    @XmlElement(name = "INHPR")
    protected String inhpr;
    @XmlElement(name = "BDRWG")
    protected String bdrwg;
    @XmlElement(name = "INHBS")
    protected String inhbs;
    @XmlElement(name = "DATSF")
    protected String datsf;
    @XmlElement(name = "BMETH")
    protected String bmeth;
    @XmlElement(name = "EXSV1")
    protected String exsv1;
    @XmlElement(name = "EXSV2")
    protected String exsv2;
    @XmlElement(name = "EXSV3")
    protected String exsv3;
    @XmlElement(name = "EXSV4")
    protected String exsv4;
    @XmlElement(name = "EXSV5")
    protected String exsv5;
    @XmlElement(name = "SVGRP")
    protected String svgrp;
    @XmlElement(name = "SVDAY")
    protected String svday;
    @XmlElement(name = "SVMET")
    protected String svmet;
    @XmlElement(name = "ZKVGP")
    protected String zkvgp;
    @XmlElement(name = "PKLAS")
    protected String pklas;
    @XmlElement(name = "ZKVNR")
    protected String zkvnr;
    @XmlElement(name = "MBVCD")
    protected String mbvcd;
    @XmlElement(name = "UPKOW")
    protected String upkow;
    @XmlElement(name = "ARBGK")
    protected String arbgk;
    @XmlElement(name = "DATAG")
    protected String datag;
    @XmlElement(name = "JGKRT")
    protected String jgkrt;
    @XmlElement(name = "GRPVL")
    protected String grpvl;
    @XmlElement(name = "NOMPR")
    protected String nompr;
    @XmlElement(name = "WGBNP")
    protected String wgbnp;
    @XmlElement(name = "INCVZ")
    protected String incvz;
    @XmlElement(name = "IDCVZ")
    protected String idcvz;
    @XmlElement(name = "FACVZ")
    protected String facvz;
    @XmlElement(name = "SIRHE")
    protected String sirhe;
    @XmlElement(name = "SIBEG")
    protected String sibeg;
    @XmlElement(name = "SIEND")
    protected String siend;
    @XmlElement(name = "EXREE")
    protected String exree;
    @XmlElement(name = "SIEMA")
    protected String siema;
    @XmlElement(name = "REPOR")
    protected String repor;
    @XmlElement(name = "EXSJR")
    protected String exsjr;
    @XmlElement(name = "LCBCD")
    protected String lcbcd;
    @XmlElement(name = "LCBBD")
    protected String lcbbd;
    @XmlElement(name = "EXSV6")
    protected String exsv6;
    @XmlElement(name = "EXSV7")
    protected String exsv7;
    @XmlElement(name = "CTTYP")
    protected String cttyp;
    @XmlElement(name = "CTEDT")
    protected String ctedt;
    @XmlElement(name = "CTWRT")
    protected String ctwrt;
    @XmlElement(name = "CTSBY")
    protected String ctsby;
    @XmlElement(name = "CTRRS")
    protected String ctrrs;
    @XmlElement(name = "CTANH")
    protected String ctanh;
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
     * Gets the value of the kdzw1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDZW1() {
        return kdzw1;
    }

    /**
     * Sets the value of the kdzw1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDZW1(String value) {
        this.kdzw1 = value;
    }

    /**
     * Gets the value of the kdww1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDWW1() {
        return kdww1;
    }

    /**
     * Sets the value of the kdww1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDWW1(String value) {
        this.kdww1 = value;
    }

    /**
     * Gets the value of the kdwao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDWAO() {
        return kdwao;
    }

    /**
     * Sets the value of the kdwao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDWAO(String value) {
        this.kdwao = value;
    }

    /**
     * Gets the value of the kdzks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDZKS() {
        return kdzks;
    }

    /**
     * Sets the value of the kdzks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDZKS(String value) {
        this.kdzks = value;
    }

    /**
     * Gets the value of the nverz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNVERZ() {
        return nverz;
    }

    /**
     * Sets the value of the nverz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNVERZ(String value) {
        this.nverz = value;
    }

    /**
     * Gets the value of the bdrpr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBDRPR() {
        return bdrpr;
    }

    /**
     * Sets the value of the bdrpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBDRPR(String value) {
        this.bdrpr = value;
    }

    /**
     * Gets the value of the inhpr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINHPR() {
        return inhpr;
    }

    /**
     * Sets the value of the inhpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINHPR(String value) {
        this.inhpr = value;
    }

    /**
     * Gets the value of the bdrwg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBDRWG() {
        return bdrwg;
    }

    /**
     * Sets the value of the bdrwg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBDRWG(String value) {
        this.bdrwg = value;
    }

    /**
     * Gets the value of the inhbs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINHBS() {
        return inhbs;
    }

    /**
     * Sets the value of the inhbs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINHBS(String value) {
        this.inhbs = value;
    }

    /**
     * Gets the value of the datsf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATSF() {
        return datsf;
    }

    /**
     * Sets the value of the datsf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATSF(String value) {
        this.datsf = value;
    }

    /**
     * Gets the value of the bmeth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBMETH() {
        return bmeth;
    }

    /**
     * Sets the value of the bmeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBMETH(String value) {
        this.bmeth = value;
    }

    /**
     * Gets the value of the exsv1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXSV1() {
        return exsv1;
    }

    /**
     * Sets the value of the exsv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXSV1(String value) {
        this.exsv1 = value;
    }

    /**
     * Gets the value of the exsv2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXSV2() {
        return exsv2;
    }

    /**
     * Sets the value of the exsv2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXSV2(String value) {
        this.exsv2 = value;
    }

    /**
     * Gets the value of the exsv3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXSV3() {
        return exsv3;
    }

    /**
     * Sets the value of the exsv3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXSV3(String value) {
        this.exsv3 = value;
    }

    /**
     * Gets the value of the exsv4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXSV4() {
        return exsv4;
    }

    /**
     * Sets the value of the exsv4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXSV4(String value) {
        this.exsv4 = value;
    }

    /**
     * Gets the value of the exsv5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXSV5() {
        return exsv5;
    }

    /**
     * Sets the value of the exsv5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXSV5(String value) {
        this.exsv5 = value;
    }

    /**
     * Gets the value of the svgrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSVGRP() {
        return svgrp;
    }

    /**
     * Sets the value of the svgrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSVGRP(String value) {
        this.svgrp = value;
    }

    /**
     * Gets the value of the svday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSVDAY() {
        return svday;
    }

    /**
     * Sets the value of the svday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSVDAY(String value) {
        this.svday = value;
    }

    /**
     * Gets the value of the svmet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSVMET() {
        return svmet;
    }

    /**
     * Sets the value of the svmet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSVMET(String value) {
        this.svmet = value;
    }

    /**
     * Gets the value of the zkvgp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZKVGP() {
        return zkvgp;
    }

    /**
     * Sets the value of the zkvgp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZKVGP(String value) {
        this.zkvgp = value;
    }

    /**
     * Gets the value of the pklas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPKLAS() {
        return pklas;
    }

    /**
     * Sets the value of the pklas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPKLAS(String value) {
        this.pklas = value;
    }

    /**
     * Gets the value of the zkvnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZKVNR() {
        return zkvnr;
    }

    /**
     * Sets the value of the zkvnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZKVNR(String value) {
        this.zkvnr = value;
    }

    /**
     * Gets the value of the mbvcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMBVCD() {
        return mbvcd;
    }

    /**
     * Sets the value of the mbvcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMBVCD(String value) {
        this.mbvcd = value;
    }

    /**
     * Gets the value of the upkow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPKOW() {
        return upkow;
    }

    /**
     * Sets the value of the upkow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPKOW(String value) {
        this.upkow = value;
    }

    /**
     * Gets the value of the arbgk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARBGK() {
        return arbgk;
    }

    /**
     * Sets the value of the arbgk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARBGK(String value) {
        this.arbgk = value;
    }

    /**
     * Gets the value of the datag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAG() {
        return datag;
    }

    /**
     * Sets the value of the datag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAG(String value) {
        this.datag = value;
    }

    /**
     * Gets the value of the jgkrt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJGKRT() {
        return jgkrt;
    }

    /**
     * Sets the value of the jgkrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJGKRT(String value) {
        this.jgkrt = value;
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
     * Gets the value of the nompr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMPR() {
        return nompr;
    }

    /**
     * Sets the value of the nompr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMPR(String value) {
        this.nompr = value;
    }

    /**
     * Gets the value of the wgbnp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWGBNP() {
        return wgbnp;
    }

    /**
     * Sets the value of the wgbnp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWGBNP(String value) {
        this.wgbnp = value;
    }

    /**
     * Gets the value of the incvz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINCVZ() {
        return incvz;
    }

    /**
     * Sets the value of the incvz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINCVZ(String value) {
        this.incvz = value;
    }

    /**
     * Gets the value of the idcvz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDCVZ() {
        return idcvz;
    }

    /**
     * Sets the value of the idcvz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDCVZ(String value) {
        this.idcvz = value;
    }

    /**
     * Gets the value of the facvz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFACVZ() {
        return facvz;
    }

    /**
     * Sets the value of the facvz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFACVZ(String value) {
        this.facvz = value;
    }

    /**
     * Gets the value of the sirhe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIRHE() {
        return sirhe;
    }

    /**
     * Sets the value of the sirhe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIRHE(String value) {
        this.sirhe = value;
    }

    /**
     * Gets the value of the sibeg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIBEG() {
        return sibeg;
    }

    /**
     * Sets the value of the sibeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIBEG(String value) {
        this.sibeg = value;
    }

    /**
     * Gets the value of the siend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIEND() {
        return siend;
    }

    /**
     * Sets the value of the siend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIEND(String value) {
        this.siend = value;
    }

    /**
     * Gets the value of the exree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXREE() {
        return exree;
    }

    /**
     * Sets the value of the exree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXREE(String value) {
        this.exree = value;
    }

    /**
     * Gets the value of the siema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIEMA() {
        return siema;
    }

    /**
     * Sets the value of the siema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIEMA(String value) {
        this.siema = value;
    }

    /**
     * Gets the value of the repor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREPOR() {
        return repor;
    }

    /**
     * Sets the value of the repor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREPOR(String value) {
        this.repor = value;
    }

    /**
     * Gets the value of the exsjr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXSJR() {
        return exsjr;
    }

    /**
     * Sets the value of the exsjr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXSJR(String value) {
        this.exsjr = value;
    }

    /**
     * Gets the value of the lcbcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLCBCD() {
        return lcbcd;
    }

    /**
     * Sets the value of the lcbcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLCBCD(String value) {
        this.lcbcd = value;
    }

    /**
     * Gets the value of the lcbbd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLCBBD() {
        return lcbbd;
    }

    /**
     * Sets the value of the lcbbd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLCBBD(String value) {
        this.lcbbd = value;
    }

    /**
     * Gets the value of the exsv6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXSV6() {
        return exsv6;
    }

    /**
     * Sets the value of the exsv6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXSV6(String value) {
        this.exsv6 = value;
    }

    /**
     * Gets the value of the exsv7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXSV7() {
        return exsv7;
    }

    /**
     * Sets the value of the exsv7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXSV7(String value) {
        this.exsv7 = value;
    }

    /**
     * Gets the value of the cttyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTTYP() {
        return cttyp;
    }

    /**
     * Sets the value of the cttyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTTYP(String value) {
        this.cttyp = value;
    }

    /**
     * Gets the value of the ctedt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTEDT() {
        return ctedt;
    }

    /**
     * Sets the value of the ctedt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTEDT(String value) {
        this.ctedt = value;
    }

    /**
     * Gets the value of the ctwrt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTWRT() {
        return ctwrt;
    }

    /**
     * Sets the value of the ctwrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTWRT(String value) {
        this.ctwrt = value;
    }

    /**
     * Gets the value of the ctsby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTSBY() {
        return ctsby;
    }

    /**
     * Sets the value of the ctsby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTSBY(String value) {
        this.ctsby = value;
    }

    /**
     * Gets the value of the ctrrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTRRS() {
        return ctrrs;
    }

    /**
     * Sets the value of the ctrrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTRRS(String value) {
        this.ctrrs = value;
    }

    /**
     * Gets the value of the ctanh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTANH() {
        return ctanh;
    }

    /**
     * Sets the value of the ctanh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTANH(String value) {
        this.ctanh = value;
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
