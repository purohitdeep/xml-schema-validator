
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
 *         &lt;element name="BOPTI" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DEPCV" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="COORD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PROVI" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="POLNR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
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
 *         &lt;element name="EOGRP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EOIRQ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EOIPR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRETX" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CSTOV" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BNCST" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
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
 *         &lt;element name="CURRE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
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
    "barea",
    "pltyp",
    "bplan",
    "bengr",
    "bstat",
    "elidt",
    "eldto",
    "pardt",
    "bopti",
    "depcv",
    "coord",
    "provi",
    "polnr",
    "enrty",
    "event",
    "eogrp",
    "eoirq",
    "eoipr",
    "pretx",
    "cstov",
    "bncst",
    "perio",
    "curre",
    "dty01",
    "did01",
    "dty02",
    "did02",
    "dty03",
    "did03",
    "dty04",
    "did04",
    "dty05",
    "did05",
    "dty06",
    "did06",
    "dty07",
    "did07",
    "dty08",
    "did08",
    "dty09",
    "did09",
    "dty10",
    "did10",
    "dty11",
    "did11",
    "dty12",
    "did12",
    "dty13",
    "did13",
    "dty14",
    "did14",
    "dty15",
    "did15",
    "dty16",
    "did16",
    "dty17",
    "did17",
    "dty18",
    "did18",
    "dty19",
    "did19",
    "dty20",
    "did20",
    "grpvl"
})
public class E1P0167 {

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
    @XmlElement(name = "BOPTI")
    protected String bopti;
    @XmlElement(name = "DEPCV")
    protected String depcv;
    @XmlElement(name = "COORD")
    protected String coord;
    @XmlElement(name = "PROVI")
    protected String provi;
    @XmlElement(name = "POLNR")
    protected String polnr;
    @XmlElement(name = "ENRTY")
    protected String enrty;
    @XmlElement(name = "EVENT")
    protected String event;
    @XmlElement(name = "EOGRP")
    protected String eogrp;
    @XmlElement(name = "EOIRQ")
    protected String eoirq;
    @XmlElement(name = "EOIPR")
    protected String eoipr;
    @XmlElement(name = "PRETX")
    protected String pretx;
    @XmlElement(name = "CSTOV")
    protected String cstov;
    @XmlElement(name = "BNCST")
    protected String bncst;
    @XmlElement(name = "PERIO")
    protected String perio;
    @XmlElement(name = "CURRE")
    protected String curre;
    @XmlElement(name = "DTY01")
    protected String dty01;
    @XmlElement(name = "DID01")
    protected String did01;
    @XmlElement(name = "DTY02")
    protected String dty02;
    @XmlElement(name = "DID02")
    protected String did02;
    @XmlElement(name = "DTY03")
    protected String dty03;
    @XmlElement(name = "DID03")
    protected String did03;
    @XmlElement(name = "DTY04")
    protected String dty04;
    @XmlElement(name = "DID04")
    protected String did04;
    @XmlElement(name = "DTY05")
    protected String dty05;
    @XmlElement(name = "DID05")
    protected String did05;
    @XmlElement(name = "DTY06")
    protected String dty06;
    @XmlElement(name = "DID06")
    protected String did06;
    @XmlElement(name = "DTY07")
    protected String dty07;
    @XmlElement(name = "DID07")
    protected String did07;
    @XmlElement(name = "DTY08")
    protected String dty08;
    @XmlElement(name = "DID08")
    protected String did08;
    @XmlElement(name = "DTY09")
    protected String dty09;
    @XmlElement(name = "DID09")
    protected String did09;
    @XmlElement(name = "DTY10")
    protected String dty10;
    @XmlElement(name = "DID10")
    protected String did10;
    @XmlElement(name = "DTY11")
    protected String dty11;
    @XmlElement(name = "DID11")
    protected String did11;
    @XmlElement(name = "DTY12")
    protected String dty12;
    @XmlElement(name = "DID12")
    protected String did12;
    @XmlElement(name = "DTY13")
    protected String dty13;
    @XmlElement(name = "DID13")
    protected String did13;
    @XmlElement(name = "DTY14")
    protected String dty14;
    @XmlElement(name = "DID14")
    protected String did14;
    @XmlElement(name = "DTY15")
    protected String dty15;
    @XmlElement(name = "DID15")
    protected String did15;
    @XmlElement(name = "DTY16")
    protected String dty16;
    @XmlElement(name = "DID16")
    protected String did16;
    @XmlElement(name = "DTY17")
    protected String dty17;
    @XmlElement(name = "DID17")
    protected String did17;
    @XmlElement(name = "DTY18")
    protected String dty18;
    @XmlElement(name = "DID18")
    protected String did18;
    @XmlElement(name = "DTY19")
    protected String dty19;
    @XmlElement(name = "DID19")
    protected String did19;
    @XmlElement(name = "DTY20")
    protected String dty20;
    @XmlElement(name = "DID20")
    protected String did20;
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
     * Gets the value of the bopti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOPTI() {
        return bopti;
    }

    /**
     * Sets the value of the bopti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOPTI(String value) {
        this.bopti = value;
    }

    /**
     * Gets the value of the depcv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEPCV() {
        return depcv;
    }

    /**
     * Sets the value of the depcv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEPCV(String value) {
        this.depcv = value;
    }

    /**
     * Gets the value of the coord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOORD() {
        return coord;
    }

    /**
     * Sets the value of the coord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOORD(String value) {
        this.coord = value;
    }

    /**
     * Gets the value of the provi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROVI() {
        return provi;
    }

    /**
     * Sets the value of the provi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROVI(String value) {
        this.provi = value;
    }

    /**
     * Gets the value of the polnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOLNR() {
        return polnr;
    }

    /**
     * Sets the value of the polnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOLNR(String value) {
        this.polnr = value;
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
     * Gets the value of the eogrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEOGRP() {
        return eogrp;
    }

    /**
     * Sets the value of the eogrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEOGRP(String value) {
        this.eogrp = value;
    }

    /**
     * Gets the value of the eoirq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEOIRQ() {
        return eoirq;
    }

    /**
     * Sets the value of the eoirq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEOIRQ(String value) {
        this.eoirq = value;
    }

    /**
     * Gets the value of the eoipr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEOIPR() {
        return eoipr;
    }

    /**
     * Sets the value of the eoipr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEOIPR(String value) {
        this.eoipr = value;
    }

    /**
     * Gets the value of the pretx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRETX() {
        return pretx;
    }

    /**
     * Sets the value of the pretx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRETX(String value) {
        this.pretx = value;
    }

    /**
     * Gets the value of the cstov property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSTOV() {
        return cstov;
    }

    /**
     * Sets the value of the cstov property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSTOV(String value) {
        this.cstov = value;
    }

    /**
     * Gets the value of the bncst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBNCST() {
        return bncst;
    }

    /**
     * Sets the value of the bncst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBNCST(String value) {
        this.bncst = value;
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
