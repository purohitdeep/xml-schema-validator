
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
 *         &lt;element name="APPTY" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APPID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EVNM1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EVDT1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EVNM2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EVDT2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EVNMF" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EVDTF" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSREG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DFGRP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSCHG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DFLVL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APRT1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APPT1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APRT2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APPT2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APRTF" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APPTF" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF0A" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD0A" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR0A" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP0A" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF0B" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD0B" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR0B" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP0B" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF0C" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD0C" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR0C" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP0C" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF0D" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD0D" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR0D" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP0D" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF0E" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD0E" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR0E" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP0E" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF0F" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD0F" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR0F" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP0F" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF21" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD21" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR21" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP21" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF22" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD22" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR22" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP22" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF23" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD23" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR23" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP23" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF24" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD24" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR24" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP24" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF25" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD25" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR25" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP25" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF26" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD26" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR26" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP26" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF27" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD27" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR27" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP27" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF28" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD28" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR28" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP28" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF29" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD29" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR29" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP29" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF30" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD30" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR30" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP30" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF31" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD31" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR31" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP31" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF32" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD32" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR32" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP32" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF33" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD33" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR33" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP33" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF34" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD34" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR34" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP34" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF35" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD35" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR35" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP35" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF36" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD36" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR36" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP36" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF37" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD37" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR37" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP37" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF38" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD38" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR38" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP38" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF39" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD39" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR39" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP39" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APF40" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APD40" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APR40" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="APP40" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KTRAT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
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
    "appty",
    "appid",
    "evnm1",
    "evdt1",
    "evnm2",
    "evdt2",
    "evnmf",
    "evdtf",
    "psreg",
    "dfgrp",
    "pschg",
    "dflvl",
    "aprt1",
    "appt1",
    "aprt2",
    "appt2",
    "aprtf",
    "apptf",
    "apf0A",
    "apd0A",
    "apr0A",
    "app0A",
    "apf0B",
    "apd0B",
    "apr0B",
    "app0B",
    "apf0C",
    "apd0C",
    "apr0C",
    "app0C",
    "apf0D",
    "apd0D",
    "apr0D",
    "app0D",
    "apf0E",
    "apd0E",
    "apr0E",
    "app0E",
    "apf0F",
    "apd0F",
    "apr0F",
    "app0F",
    "apf01",
    "apd01",
    "apr01",
    "app01",
    "apf02",
    "apd02",
    "apr02",
    "app02",
    "apf03",
    "apd03",
    "apr03",
    "app03",
    "apf04",
    "apd04",
    "apr04",
    "app04",
    "apf05",
    "apd05",
    "apr05",
    "app05",
    "apf06",
    "apd06",
    "apr06",
    "app06",
    "apf07",
    "apd07",
    "apr07",
    "app07",
    "apf08",
    "apd08",
    "apr08",
    "app08",
    "apf09",
    "apd09",
    "apr09",
    "app09",
    "apf10",
    "apd10",
    "apr10",
    "app10",
    "apf11",
    "apd11",
    "apr11",
    "app11",
    "apf12",
    "apd12",
    "apr12",
    "app12",
    "apf13",
    "apd13",
    "apr13",
    "app13",
    "apf14",
    "apd14",
    "apr14",
    "app14",
    "apf15",
    "apd15",
    "apr15",
    "app15",
    "apf16",
    "apd16",
    "apr16",
    "app16",
    "apf17",
    "apd17",
    "apr17",
    "app17",
    "apf18",
    "apd18",
    "apr18",
    "app18",
    "apf19",
    "apd19",
    "apr19",
    "app19",
    "apf20",
    "apd20",
    "apr20",
    "app20",
    "apf21",
    "apd21",
    "apr21",
    "app21",
    "apf22",
    "apd22",
    "apr22",
    "app22",
    "apf23",
    "apd23",
    "apr23",
    "app23",
    "apf24",
    "apd24",
    "apr24",
    "app24",
    "apf25",
    "apd25",
    "apr25",
    "app25",
    "apf26",
    "apd26",
    "apr26",
    "app26",
    "apf27",
    "apd27",
    "apr27",
    "app27",
    "apf28",
    "apd28",
    "apr28",
    "app28",
    "apf29",
    "apd29",
    "apr29",
    "app29",
    "apf30",
    "apd30",
    "apr30",
    "app30",
    "apf31",
    "apd31",
    "apr31",
    "app31",
    "apf32",
    "apd32",
    "apr32",
    "app32",
    "apf33",
    "apd33",
    "apr33",
    "app33",
    "apf34",
    "apd34",
    "apr34",
    "app34",
    "apf35",
    "apd35",
    "apr35",
    "app35",
    "apf36",
    "apd36",
    "apr36",
    "app36",
    "apf37",
    "apd37",
    "apr37",
    "app37",
    "apf38",
    "apd38",
    "apr38",
    "app38",
    "apf39",
    "apd39",
    "apr39",
    "app39",
    "apf40",
    "apd40",
    "apr40",
    "app40",
    "ktrat",
    "grpvl"
})
public class E1P0147 {

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
    @XmlElement(name = "APPTY")
    protected String appty;
    @XmlElement(name = "APPID")
    protected String appid;
    @XmlElement(name = "EVNM1")
    protected String evnm1;
    @XmlElement(name = "EVDT1")
    protected String evdt1;
    @XmlElement(name = "EVNM2")
    protected String evnm2;
    @XmlElement(name = "EVDT2")
    protected String evdt2;
    @XmlElement(name = "EVNMF")
    protected String evnmf;
    @XmlElement(name = "EVDTF")
    protected String evdtf;
    @XmlElement(name = "PSREG")
    protected String psreg;
    @XmlElement(name = "DFGRP")
    protected String dfgrp;
    @XmlElement(name = "PSCHG")
    protected String pschg;
    @XmlElement(name = "DFLVL")
    protected String dflvl;
    @XmlElement(name = "APRT1")
    protected String aprt1;
    @XmlElement(name = "APPT1")
    protected String appt1;
    @XmlElement(name = "APRT2")
    protected String aprt2;
    @XmlElement(name = "APPT2")
    protected String appt2;
    @XmlElement(name = "APRTF")
    protected String aprtf;
    @XmlElement(name = "APPTF")
    protected String apptf;
    @XmlElement(name = "APF0A")
    protected String apf0A;
    @XmlElement(name = "APD0A")
    protected String apd0A;
    @XmlElement(name = "APR0A")
    protected String apr0A;
    @XmlElement(name = "APP0A")
    protected String app0A;
    @XmlElement(name = "APF0B")
    protected String apf0B;
    @XmlElement(name = "APD0B")
    protected String apd0B;
    @XmlElement(name = "APR0B")
    protected String apr0B;
    @XmlElement(name = "APP0B")
    protected String app0B;
    @XmlElement(name = "APF0C")
    protected String apf0C;
    @XmlElement(name = "APD0C")
    protected String apd0C;
    @XmlElement(name = "APR0C")
    protected String apr0C;
    @XmlElement(name = "APP0C")
    protected String app0C;
    @XmlElement(name = "APF0D")
    protected String apf0D;
    @XmlElement(name = "APD0D")
    protected String apd0D;
    @XmlElement(name = "APR0D")
    protected String apr0D;
    @XmlElement(name = "APP0D")
    protected String app0D;
    @XmlElement(name = "APF0E")
    protected String apf0E;
    @XmlElement(name = "APD0E")
    protected String apd0E;
    @XmlElement(name = "APR0E")
    protected String apr0E;
    @XmlElement(name = "APP0E")
    protected String app0E;
    @XmlElement(name = "APF0F")
    protected String apf0F;
    @XmlElement(name = "APD0F")
    protected String apd0F;
    @XmlElement(name = "APR0F")
    protected String apr0F;
    @XmlElement(name = "APP0F")
    protected String app0F;
    @XmlElement(name = "APF01")
    protected String apf01;
    @XmlElement(name = "APD01")
    protected String apd01;
    @XmlElement(name = "APR01")
    protected String apr01;
    @XmlElement(name = "APP01")
    protected String app01;
    @XmlElement(name = "APF02")
    protected String apf02;
    @XmlElement(name = "APD02")
    protected String apd02;
    @XmlElement(name = "APR02")
    protected String apr02;
    @XmlElement(name = "APP02")
    protected String app02;
    @XmlElement(name = "APF03")
    protected String apf03;
    @XmlElement(name = "APD03")
    protected String apd03;
    @XmlElement(name = "APR03")
    protected String apr03;
    @XmlElement(name = "APP03")
    protected String app03;
    @XmlElement(name = "APF04")
    protected String apf04;
    @XmlElement(name = "APD04")
    protected String apd04;
    @XmlElement(name = "APR04")
    protected String apr04;
    @XmlElement(name = "APP04")
    protected String app04;
    @XmlElement(name = "APF05")
    protected String apf05;
    @XmlElement(name = "APD05")
    protected String apd05;
    @XmlElement(name = "APR05")
    protected String apr05;
    @XmlElement(name = "APP05")
    protected String app05;
    @XmlElement(name = "APF06")
    protected String apf06;
    @XmlElement(name = "APD06")
    protected String apd06;
    @XmlElement(name = "APR06")
    protected String apr06;
    @XmlElement(name = "APP06")
    protected String app06;
    @XmlElement(name = "APF07")
    protected String apf07;
    @XmlElement(name = "APD07")
    protected String apd07;
    @XmlElement(name = "APR07")
    protected String apr07;
    @XmlElement(name = "APP07")
    protected String app07;
    @XmlElement(name = "APF08")
    protected String apf08;
    @XmlElement(name = "APD08")
    protected String apd08;
    @XmlElement(name = "APR08")
    protected String apr08;
    @XmlElement(name = "APP08")
    protected String app08;
    @XmlElement(name = "APF09")
    protected String apf09;
    @XmlElement(name = "APD09")
    protected String apd09;
    @XmlElement(name = "APR09")
    protected String apr09;
    @XmlElement(name = "APP09")
    protected String app09;
    @XmlElement(name = "APF10")
    protected String apf10;
    @XmlElement(name = "APD10")
    protected String apd10;
    @XmlElement(name = "APR10")
    protected String apr10;
    @XmlElement(name = "APP10")
    protected String app10;
    @XmlElement(name = "APF11")
    protected String apf11;
    @XmlElement(name = "APD11")
    protected String apd11;
    @XmlElement(name = "APR11")
    protected String apr11;
    @XmlElement(name = "APP11")
    protected String app11;
    @XmlElement(name = "APF12")
    protected String apf12;
    @XmlElement(name = "APD12")
    protected String apd12;
    @XmlElement(name = "APR12")
    protected String apr12;
    @XmlElement(name = "APP12")
    protected String app12;
    @XmlElement(name = "APF13")
    protected String apf13;
    @XmlElement(name = "APD13")
    protected String apd13;
    @XmlElement(name = "APR13")
    protected String apr13;
    @XmlElement(name = "APP13")
    protected String app13;
    @XmlElement(name = "APF14")
    protected String apf14;
    @XmlElement(name = "APD14")
    protected String apd14;
    @XmlElement(name = "APR14")
    protected String apr14;
    @XmlElement(name = "APP14")
    protected String app14;
    @XmlElement(name = "APF15")
    protected String apf15;
    @XmlElement(name = "APD15")
    protected String apd15;
    @XmlElement(name = "APR15")
    protected String apr15;
    @XmlElement(name = "APP15")
    protected String app15;
    @XmlElement(name = "APF16")
    protected String apf16;
    @XmlElement(name = "APD16")
    protected String apd16;
    @XmlElement(name = "APR16")
    protected String apr16;
    @XmlElement(name = "APP16")
    protected String app16;
    @XmlElement(name = "APF17")
    protected String apf17;
    @XmlElement(name = "APD17")
    protected String apd17;
    @XmlElement(name = "APR17")
    protected String apr17;
    @XmlElement(name = "APP17")
    protected String app17;
    @XmlElement(name = "APF18")
    protected String apf18;
    @XmlElement(name = "APD18")
    protected String apd18;
    @XmlElement(name = "APR18")
    protected String apr18;
    @XmlElement(name = "APP18")
    protected String app18;
    @XmlElement(name = "APF19")
    protected String apf19;
    @XmlElement(name = "APD19")
    protected String apd19;
    @XmlElement(name = "APR19")
    protected String apr19;
    @XmlElement(name = "APP19")
    protected String app19;
    @XmlElement(name = "APF20")
    protected String apf20;
    @XmlElement(name = "APD20")
    protected String apd20;
    @XmlElement(name = "APR20")
    protected String apr20;
    @XmlElement(name = "APP20")
    protected String app20;
    @XmlElement(name = "APF21")
    protected String apf21;
    @XmlElement(name = "APD21")
    protected String apd21;
    @XmlElement(name = "APR21")
    protected String apr21;
    @XmlElement(name = "APP21")
    protected String app21;
    @XmlElement(name = "APF22")
    protected String apf22;
    @XmlElement(name = "APD22")
    protected String apd22;
    @XmlElement(name = "APR22")
    protected String apr22;
    @XmlElement(name = "APP22")
    protected String app22;
    @XmlElement(name = "APF23")
    protected String apf23;
    @XmlElement(name = "APD23")
    protected String apd23;
    @XmlElement(name = "APR23")
    protected String apr23;
    @XmlElement(name = "APP23")
    protected String app23;
    @XmlElement(name = "APF24")
    protected String apf24;
    @XmlElement(name = "APD24")
    protected String apd24;
    @XmlElement(name = "APR24")
    protected String apr24;
    @XmlElement(name = "APP24")
    protected String app24;
    @XmlElement(name = "APF25")
    protected String apf25;
    @XmlElement(name = "APD25")
    protected String apd25;
    @XmlElement(name = "APR25")
    protected String apr25;
    @XmlElement(name = "APP25")
    protected String app25;
    @XmlElement(name = "APF26")
    protected String apf26;
    @XmlElement(name = "APD26")
    protected String apd26;
    @XmlElement(name = "APR26")
    protected String apr26;
    @XmlElement(name = "APP26")
    protected String app26;
    @XmlElement(name = "APF27")
    protected String apf27;
    @XmlElement(name = "APD27")
    protected String apd27;
    @XmlElement(name = "APR27")
    protected String apr27;
    @XmlElement(name = "APP27")
    protected String app27;
    @XmlElement(name = "APF28")
    protected String apf28;
    @XmlElement(name = "APD28")
    protected String apd28;
    @XmlElement(name = "APR28")
    protected String apr28;
    @XmlElement(name = "APP28")
    protected String app28;
    @XmlElement(name = "APF29")
    protected String apf29;
    @XmlElement(name = "APD29")
    protected String apd29;
    @XmlElement(name = "APR29")
    protected String apr29;
    @XmlElement(name = "APP29")
    protected String app29;
    @XmlElement(name = "APF30")
    protected String apf30;
    @XmlElement(name = "APD30")
    protected String apd30;
    @XmlElement(name = "APR30")
    protected String apr30;
    @XmlElement(name = "APP30")
    protected String app30;
    @XmlElement(name = "APF31")
    protected String apf31;
    @XmlElement(name = "APD31")
    protected String apd31;
    @XmlElement(name = "APR31")
    protected String apr31;
    @XmlElement(name = "APP31")
    protected String app31;
    @XmlElement(name = "APF32")
    protected String apf32;
    @XmlElement(name = "APD32")
    protected String apd32;
    @XmlElement(name = "APR32")
    protected String apr32;
    @XmlElement(name = "APP32")
    protected String app32;
    @XmlElement(name = "APF33")
    protected String apf33;
    @XmlElement(name = "APD33")
    protected String apd33;
    @XmlElement(name = "APR33")
    protected String apr33;
    @XmlElement(name = "APP33")
    protected String app33;
    @XmlElement(name = "APF34")
    protected String apf34;
    @XmlElement(name = "APD34")
    protected String apd34;
    @XmlElement(name = "APR34")
    protected String apr34;
    @XmlElement(name = "APP34")
    protected String app34;
    @XmlElement(name = "APF35")
    protected String apf35;
    @XmlElement(name = "APD35")
    protected String apd35;
    @XmlElement(name = "APR35")
    protected String apr35;
    @XmlElement(name = "APP35")
    protected String app35;
    @XmlElement(name = "APF36")
    protected String apf36;
    @XmlElement(name = "APD36")
    protected String apd36;
    @XmlElement(name = "APR36")
    protected String apr36;
    @XmlElement(name = "APP36")
    protected String app36;
    @XmlElement(name = "APF37")
    protected String apf37;
    @XmlElement(name = "APD37")
    protected String apd37;
    @XmlElement(name = "APR37")
    protected String apr37;
    @XmlElement(name = "APP37")
    protected String app37;
    @XmlElement(name = "APF38")
    protected String apf38;
    @XmlElement(name = "APD38")
    protected String apd38;
    @XmlElement(name = "APR38")
    protected String apr38;
    @XmlElement(name = "APP38")
    protected String app38;
    @XmlElement(name = "APF39")
    protected String apf39;
    @XmlElement(name = "APD39")
    protected String apd39;
    @XmlElement(name = "APR39")
    protected String apr39;
    @XmlElement(name = "APP39")
    protected String app39;
    @XmlElement(name = "APF40")
    protected String apf40;
    @XmlElement(name = "APD40")
    protected String apd40;
    @XmlElement(name = "APR40")
    protected String apr40;
    @XmlElement(name = "APP40")
    protected String app40;
    @XmlElement(name = "KTRAT")
    protected String ktrat;
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
     * Gets the value of the appty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPTY() {
        return appty;
    }

    /**
     * Sets the value of the appty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPTY(String value) {
        this.appty = value;
    }

    /**
     * Gets the value of the appid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPID() {
        return appid;
    }

    /**
     * Sets the value of the appid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPID(String value) {
        this.appid = value;
    }

    /**
     * Gets the value of the evnm1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEVNM1() {
        return evnm1;
    }

    /**
     * Sets the value of the evnm1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEVNM1(String value) {
        this.evnm1 = value;
    }

    /**
     * Gets the value of the evdt1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEVDT1() {
        return evdt1;
    }

    /**
     * Sets the value of the evdt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEVDT1(String value) {
        this.evdt1 = value;
    }

    /**
     * Gets the value of the evnm2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEVNM2() {
        return evnm2;
    }

    /**
     * Sets the value of the evnm2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEVNM2(String value) {
        this.evnm2 = value;
    }

    /**
     * Gets the value of the evdt2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEVDT2() {
        return evdt2;
    }

    /**
     * Sets the value of the evdt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEVDT2(String value) {
        this.evdt2 = value;
    }

    /**
     * Gets the value of the evnmf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEVNMF() {
        return evnmf;
    }

    /**
     * Sets the value of the evnmf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEVNMF(String value) {
        this.evnmf = value;
    }

    /**
     * Gets the value of the evdtf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEVDTF() {
        return evdtf;
    }

    /**
     * Sets the value of the evdtf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEVDTF(String value) {
        this.evdtf = value;
    }

    /**
     * Gets the value of the psreg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSREG() {
        return psreg;
    }

    /**
     * Sets the value of the psreg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSREG(String value) {
        this.psreg = value;
    }

    /**
     * Gets the value of the dfgrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDFGRP() {
        return dfgrp;
    }

    /**
     * Sets the value of the dfgrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDFGRP(String value) {
        this.dfgrp = value;
    }

    /**
     * Gets the value of the pschg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSCHG() {
        return pschg;
    }

    /**
     * Sets the value of the pschg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSCHG(String value) {
        this.pschg = value;
    }

    /**
     * Gets the value of the dflvl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDFLVL() {
        return dflvl;
    }

    /**
     * Sets the value of the dflvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDFLVL(String value) {
        this.dflvl = value;
    }

    /**
     * Gets the value of the aprt1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPRT1() {
        return aprt1;
    }

    /**
     * Sets the value of the aprt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPRT1(String value) {
        this.aprt1 = value;
    }

    /**
     * Gets the value of the appt1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPT1() {
        return appt1;
    }

    /**
     * Sets the value of the appt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPT1(String value) {
        this.appt1 = value;
    }

    /**
     * Gets the value of the aprt2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPRT2() {
        return aprt2;
    }

    /**
     * Sets the value of the aprt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPRT2(String value) {
        this.aprt2 = value;
    }

    /**
     * Gets the value of the appt2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPT2() {
        return appt2;
    }

    /**
     * Sets the value of the appt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPT2(String value) {
        this.appt2 = value;
    }

    /**
     * Gets the value of the aprtf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPRTF() {
        return aprtf;
    }

    /**
     * Sets the value of the aprtf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPRTF(String value) {
        this.aprtf = value;
    }

    /**
     * Gets the value of the apptf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPTF() {
        return apptf;
    }

    /**
     * Sets the value of the apptf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPTF(String value) {
        this.apptf = value;
    }

    /**
     * Gets the value of the apf0A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF0A() {
        return apf0A;
    }

    /**
     * Sets the value of the apf0A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF0A(String value) {
        this.apf0A = value;
    }

    /**
     * Gets the value of the apd0A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD0A() {
        return apd0A;
    }

    /**
     * Sets the value of the apd0A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD0A(String value) {
        this.apd0A = value;
    }

    /**
     * Gets the value of the apr0A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR0A() {
        return apr0A;
    }

    /**
     * Sets the value of the apr0A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR0A(String value) {
        this.apr0A = value;
    }

    /**
     * Gets the value of the app0A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP0A() {
        return app0A;
    }

    /**
     * Sets the value of the app0A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP0A(String value) {
        this.app0A = value;
    }

    /**
     * Gets the value of the apf0B property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF0B() {
        return apf0B;
    }

    /**
     * Sets the value of the apf0B property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF0B(String value) {
        this.apf0B = value;
    }

    /**
     * Gets the value of the apd0B property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD0B() {
        return apd0B;
    }

    /**
     * Sets the value of the apd0B property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD0B(String value) {
        this.apd0B = value;
    }

    /**
     * Gets the value of the apr0B property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR0B() {
        return apr0B;
    }

    /**
     * Sets the value of the apr0B property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR0B(String value) {
        this.apr0B = value;
    }

    /**
     * Gets the value of the app0B property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP0B() {
        return app0B;
    }

    /**
     * Sets the value of the app0B property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP0B(String value) {
        this.app0B = value;
    }

    /**
     * Gets the value of the apf0C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF0C() {
        return apf0C;
    }

    /**
     * Sets the value of the apf0C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF0C(String value) {
        this.apf0C = value;
    }

    /**
     * Gets the value of the apd0C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD0C() {
        return apd0C;
    }

    /**
     * Sets the value of the apd0C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD0C(String value) {
        this.apd0C = value;
    }

    /**
     * Gets the value of the apr0C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR0C() {
        return apr0C;
    }

    /**
     * Sets the value of the apr0C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR0C(String value) {
        this.apr0C = value;
    }

    /**
     * Gets the value of the app0C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP0C() {
        return app0C;
    }

    /**
     * Sets the value of the app0C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP0C(String value) {
        this.app0C = value;
    }

    /**
     * Gets the value of the apf0D property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF0D() {
        return apf0D;
    }

    /**
     * Sets the value of the apf0D property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF0D(String value) {
        this.apf0D = value;
    }

    /**
     * Gets the value of the apd0D property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD0D() {
        return apd0D;
    }

    /**
     * Sets the value of the apd0D property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD0D(String value) {
        this.apd0D = value;
    }

    /**
     * Gets the value of the apr0D property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR0D() {
        return apr0D;
    }

    /**
     * Sets the value of the apr0D property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR0D(String value) {
        this.apr0D = value;
    }

    /**
     * Gets the value of the app0D property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP0D() {
        return app0D;
    }

    /**
     * Sets the value of the app0D property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP0D(String value) {
        this.app0D = value;
    }

    /**
     * Gets the value of the apf0E property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF0E() {
        return apf0E;
    }

    /**
     * Sets the value of the apf0E property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF0E(String value) {
        this.apf0E = value;
    }

    /**
     * Gets the value of the apd0E property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD0E() {
        return apd0E;
    }

    /**
     * Sets the value of the apd0E property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD0E(String value) {
        this.apd0E = value;
    }

    /**
     * Gets the value of the apr0E property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR0E() {
        return apr0E;
    }

    /**
     * Sets the value of the apr0E property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR0E(String value) {
        this.apr0E = value;
    }

    /**
     * Gets the value of the app0E property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP0E() {
        return app0E;
    }

    /**
     * Sets the value of the app0E property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP0E(String value) {
        this.app0E = value;
    }

    /**
     * Gets the value of the apf0F property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF0F() {
        return apf0F;
    }

    /**
     * Sets the value of the apf0F property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF0F(String value) {
        this.apf0F = value;
    }

    /**
     * Gets the value of the apd0F property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD0F() {
        return apd0F;
    }

    /**
     * Sets the value of the apd0F property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD0F(String value) {
        this.apd0F = value;
    }

    /**
     * Gets the value of the apr0F property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR0F() {
        return apr0F;
    }

    /**
     * Sets the value of the apr0F property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR0F(String value) {
        this.apr0F = value;
    }

    /**
     * Gets the value of the app0F property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP0F() {
        return app0F;
    }

    /**
     * Sets the value of the app0F property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP0F(String value) {
        this.app0F = value;
    }

    /**
     * Gets the value of the apf01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF01() {
        return apf01;
    }

    /**
     * Sets the value of the apf01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF01(String value) {
        this.apf01 = value;
    }

    /**
     * Gets the value of the apd01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD01() {
        return apd01;
    }

    /**
     * Sets the value of the apd01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD01(String value) {
        this.apd01 = value;
    }

    /**
     * Gets the value of the apr01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR01() {
        return apr01;
    }

    /**
     * Sets the value of the apr01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR01(String value) {
        this.apr01 = value;
    }

    /**
     * Gets the value of the app01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP01() {
        return app01;
    }

    /**
     * Sets the value of the app01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP01(String value) {
        this.app01 = value;
    }

    /**
     * Gets the value of the apf02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF02() {
        return apf02;
    }

    /**
     * Sets the value of the apf02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF02(String value) {
        this.apf02 = value;
    }

    /**
     * Gets the value of the apd02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD02() {
        return apd02;
    }

    /**
     * Sets the value of the apd02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD02(String value) {
        this.apd02 = value;
    }

    /**
     * Gets the value of the apr02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR02() {
        return apr02;
    }

    /**
     * Sets the value of the apr02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR02(String value) {
        this.apr02 = value;
    }

    /**
     * Gets the value of the app02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP02() {
        return app02;
    }

    /**
     * Sets the value of the app02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP02(String value) {
        this.app02 = value;
    }

    /**
     * Gets the value of the apf03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF03() {
        return apf03;
    }

    /**
     * Sets the value of the apf03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF03(String value) {
        this.apf03 = value;
    }

    /**
     * Gets the value of the apd03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD03() {
        return apd03;
    }

    /**
     * Sets the value of the apd03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD03(String value) {
        this.apd03 = value;
    }

    /**
     * Gets the value of the apr03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR03() {
        return apr03;
    }

    /**
     * Sets the value of the apr03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR03(String value) {
        this.apr03 = value;
    }

    /**
     * Gets the value of the app03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP03() {
        return app03;
    }

    /**
     * Sets the value of the app03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP03(String value) {
        this.app03 = value;
    }

    /**
     * Gets the value of the apf04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF04() {
        return apf04;
    }

    /**
     * Sets the value of the apf04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF04(String value) {
        this.apf04 = value;
    }

    /**
     * Gets the value of the apd04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD04() {
        return apd04;
    }

    /**
     * Sets the value of the apd04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD04(String value) {
        this.apd04 = value;
    }

    /**
     * Gets the value of the apr04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR04() {
        return apr04;
    }

    /**
     * Sets the value of the apr04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR04(String value) {
        this.apr04 = value;
    }

    /**
     * Gets the value of the app04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP04() {
        return app04;
    }

    /**
     * Sets the value of the app04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP04(String value) {
        this.app04 = value;
    }

    /**
     * Gets the value of the apf05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF05() {
        return apf05;
    }

    /**
     * Sets the value of the apf05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF05(String value) {
        this.apf05 = value;
    }

    /**
     * Gets the value of the apd05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD05() {
        return apd05;
    }

    /**
     * Sets the value of the apd05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD05(String value) {
        this.apd05 = value;
    }

    /**
     * Gets the value of the apr05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR05() {
        return apr05;
    }

    /**
     * Sets the value of the apr05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR05(String value) {
        this.apr05 = value;
    }

    /**
     * Gets the value of the app05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP05() {
        return app05;
    }

    /**
     * Sets the value of the app05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP05(String value) {
        this.app05 = value;
    }

    /**
     * Gets the value of the apf06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF06() {
        return apf06;
    }

    /**
     * Sets the value of the apf06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF06(String value) {
        this.apf06 = value;
    }

    /**
     * Gets the value of the apd06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD06() {
        return apd06;
    }

    /**
     * Sets the value of the apd06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD06(String value) {
        this.apd06 = value;
    }

    /**
     * Gets the value of the apr06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR06() {
        return apr06;
    }

    /**
     * Sets the value of the apr06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR06(String value) {
        this.apr06 = value;
    }

    /**
     * Gets the value of the app06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP06() {
        return app06;
    }

    /**
     * Sets the value of the app06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP06(String value) {
        this.app06 = value;
    }

    /**
     * Gets the value of the apf07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF07() {
        return apf07;
    }

    /**
     * Sets the value of the apf07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF07(String value) {
        this.apf07 = value;
    }

    /**
     * Gets the value of the apd07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD07() {
        return apd07;
    }

    /**
     * Sets the value of the apd07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD07(String value) {
        this.apd07 = value;
    }

    /**
     * Gets the value of the apr07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR07() {
        return apr07;
    }

    /**
     * Sets the value of the apr07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR07(String value) {
        this.apr07 = value;
    }

    /**
     * Gets the value of the app07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP07() {
        return app07;
    }

    /**
     * Sets the value of the app07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP07(String value) {
        this.app07 = value;
    }

    /**
     * Gets the value of the apf08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF08() {
        return apf08;
    }

    /**
     * Sets the value of the apf08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF08(String value) {
        this.apf08 = value;
    }

    /**
     * Gets the value of the apd08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD08() {
        return apd08;
    }

    /**
     * Sets the value of the apd08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD08(String value) {
        this.apd08 = value;
    }

    /**
     * Gets the value of the apr08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR08() {
        return apr08;
    }

    /**
     * Sets the value of the apr08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR08(String value) {
        this.apr08 = value;
    }

    /**
     * Gets the value of the app08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP08() {
        return app08;
    }

    /**
     * Sets the value of the app08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP08(String value) {
        this.app08 = value;
    }

    /**
     * Gets the value of the apf09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF09() {
        return apf09;
    }

    /**
     * Sets the value of the apf09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF09(String value) {
        this.apf09 = value;
    }

    /**
     * Gets the value of the apd09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD09() {
        return apd09;
    }

    /**
     * Sets the value of the apd09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD09(String value) {
        this.apd09 = value;
    }

    /**
     * Gets the value of the apr09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR09() {
        return apr09;
    }

    /**
     * Sets the value of the apr09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR09(String value) {
        this.apr09 = value;
    }

    /**
     * Gets the value of the app09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP09() {
        return app09;
    }

    /**
     * Sets the value of the app09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP09(String value) {
        this.app09 = value;
    }

    /**
     * Gets the value of the apf10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF10() {
        return apf10;
    }

    /**
     * Sets the value of the apf10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF10(String value) {
        this.apf10 = value;
    }

    /**
     * Gets the value of the apd10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD10() {
        return apd10;
    }

    /**
     * Sets the value of the apd10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD10(String value) {
        this.apd10 = value;
    }

    /**
     * Gets the value of the apr10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR10() {
        return apr10;
    }

    /**
     * Sets the value of the apr10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR10(String value) {
        this.apr10 = value;
    }

    /**
     * Gets the value of the app10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP10() {
        return app10;
    }

    /**
     * Sets the value of the app10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP10(String value) {
        this.app10 = value;
    }

    /**
     * Gets the value of the apf11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF11() {
        return apf11;
    }

    /**
     * Sets the value of the apf11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF11(String value) {
        this.apf11 = value;
    }

    /**
     * Gets the value of the apd11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD11() {
        return apd11;
    }

    /**
     * Sets the value of the apd11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD11(String value) {
        this.apd11 = value;
    }

    /**
     * Gets the value of the apr11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR11() {
        return apr11;
    }

    /**
     * Sets the value of the apr11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR11(String value) {
        this.apr11 = value;
    }

    /**
     * Gets the value of the app11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP11() {
        return app11;
    }

    /**
     * Sets the value of the app11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP11(String value) {
        this.app11 = value;
    }

    /**
     * Gets the value of the apf12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF12() {
        return apf12;
    }

    /**
     * Sets the value of the apf12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF12(String value) {
        this.apf12 = value;
    }

    /**
     * Gets the value of the apd12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD12() {
        return apd12;
    }

    /**
     * Sets the value of the apd12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD12(String value) {
        this.apd12 = value;
    }

    /**
     * Gets the value of the apr12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR12() {
        return apr12;
    }

    /**
     * Sets the value of the apr12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR12(String value) {
        this.apr12 = value;
    }

    /**
     * Gets the value of the app12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP12() {
        return app12;
    }

    /**
     * Sets the value of the app12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP12(String value) {
        this.app12 = value;
    }

    /**
     * Gets the value of the apf13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF13() {
        return apf13;
    }

    /**
     * Sets the value of the apf13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF13(String value) {
        this.apf13 = value;
    }

    /**
     * Gets the value of the apd13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD13() {
        return apd13;
    }

    /**
     * Sets the value of the apd13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD13(String value) {
        this.apd13 = value;
    }

    /**
     * Gets the value of the apr13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR13() {
        return apr13;
    }

    /**
     * Sets the value of the apr13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR13(String value) {
        this.apr13 = value;
    }

    /**
     * Gets the value of the app13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP13() {
        return app13;
    }

    /**
     * Sets the value of the app13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP13(String value) {
        this.app13 = value;
    }

    /**
     * Gets the value of the apf14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF14() {
        return apf14;
    }

    /**
     * Sets the value of the apf14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF14(String value) {
        this.apf14 = value;
    }

    /**
     * Gets the value of the apd14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD14() {
        return apd14;
    }

    /**
     * Sets the value of the apd14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD14(String value) {
        this.apd14 = value;
    }

    /**
     * Gets the value of the apr14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR14() {
        return apr14;
    }

    /**
     * Sets the value of the apr14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR14(String value) {
        this.apr14 = value;
    }

    /**
     * Gets the value of the app14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP14() {
        return app14;
    }

    /**
     * Sets the value of the app14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP14(String value) {
        this.app14 = value;
    }

    /**
     * Gets the value of the apf15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF15() {
        return apf15;
    }

    /**
     * Sets the value of the apf15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF15(String value) {
        this.apf15 = value;
    }

    /**
     * Gets the value of the apd15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD15() {
        return apd15;
    }

    /**
     * Sets the value of the apd15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD15(String value) {
        this.apd15 = value;
    }

    /**
     * Gets the value of the apr15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR15() {
        return apr15;
    }

    /**
     * Sets the value of the apr15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR15(String value) {
        this.apr15 = value;
    }

    /**
     * Gets the value of the app15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP15() {
        return app15;
    }

    /**
     * Sets the value of the app15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP15(String value) {
        this.app15 = value;
    }

    /**
     * Gets the value of the apf16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF16() {
        return apf16;
    }

    /**
     * Sets the value of the apf16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF16(String value) {
        this.apf16 = value;
    }

    /**
     * Gets the value of the apd16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD16() {
        return apd16;
    }

    /**
     * Sets the value of the apd16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD16(String value) {
        this.apd16 = value;
    }

    /**
     * Gets the value of the apr16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR16() {
        return apr16;
    }

    /**
     * Sets the value of the apr16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR16(String value) {
        this.apr16 = value;
    }

    /**
     * Gets the value of the app16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP16() {
        return app16;
    }

    /**
     * Sets the value of the app16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP16(String value) {
        this.app16 = value;
    }

    /**
     * Gets the value of the apf17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF17() {
        return apf17;
    }

    /**
     * Sets the value of the apf17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF17(String value) {
        this.apf17 = value;
    }

    /**
     * Gets the value of the apd17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD17() {
        return apd17;
    }

    /**
     * Sets the value of the apd17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD17(String value) {
        this.apd17 = value;
    }

    /**
     * Gets the value of the apr17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR17() {
        return apr17;
    }

    /**
     * Sets the value of the apr17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR17(String value) {
        this.apr17 = value;
    }

    /**
     * Gets the value of the app17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP17() {
        return app17;
    }

    /**
     * Sets the value of the app17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP17(String value) {
        this.app17 = value;
    }

    /**
     * Gets the value of the apf18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF18() {
        return apf18;
    }

    /**
     * Sets the value of the apf18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF18(String value) {
        this.apf18 = value;
    }

    /**
     * Gets the value of the apd18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD18() {
        return apd18;
    }

    /**
     * Sets the value of the apd18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD18(String value) {
        this.apd18 = value;
    }

    /**
     * Gets the value of the apr18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR18() {
        return apr18;
    }

    /**
     * Sets the value of the apr18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR18(String value) {
        this.apr18 = value;
    }

    /**
     * Gets the value of the app18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP18() {
        return app18;
    }

    /**
     * Sets the value of the app18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP18(String value) {
        this.app18 = value;
    }

    /**
     * Gets the value of the apf19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF19() {
        return apf19;
    }

    /**
     * Sets the value of the apf19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF19(String value) {
        this.apf19 = value;
    }

    /**
     * Gets the value of the apd19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD19() {
        return apd19;
    }

    /**
     * Sets the value of the apd19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD19(String value) {
        this.apd19 = value;
    }

    /**
     * Gets the value of the apr19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR19() {
        return apr19;
    }

    /**
     * Sets the value of the apr19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR19(String value) {
        this.apr19 = value;
    }

    /**
     * Gets the value of the app19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP19() {
        return app19;
    }

    /**
     * Sets the value of the app19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP19(String value) {
        this.app19 = value;
    }

    /**
     * Gets the value of the apf20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF20() {
        return apf20;
    }

    /**
     * Sets the value of the apf20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF20(String value) {
        this.apf20 = value;
    }

    /**
     * Gets the value of the apd20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD20() {
        return apd20;
    }

    /**
     * Sets the value of the apd20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD20(String value) {
        this.apd20 = value;
    }

    /**
     * Gets the value of the apr20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR20() {
        return apr20;
    }

    /**
     * Sets the value of the apr20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR20(String value) {
        this.apr20 = value;
    }

    /**
     * Gets the value of the app20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP20() {
        return app20;
    }

    /**
     * Sets the value of the app20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP20(String value) {
        this.app20 = value;
    }

    /**
     * Gets the value of the apf21 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF21() {
        return apf21;
    }

    /**
     * Sets the value of the apf21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF21(String value) {
        this.apf21 = value;
    }

    /**
     * Gets the value of the apd21 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD21() {
        return apd21;
    }

    /**
     * Sets the value of the apd21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD21(String value) {
        this.apd21 = value;
    }

    /**
     * Gets the value of the apr21 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR21() {
        return apr21;
    }

    /**
     * Sets the value of the apr21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR21(String value) {
        this.apr21 = value;
    }

    /**
     * Gets the value of the app21 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP21() {
        return app21;
    }

    /**
     * Sets the value of the app21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP21(String value) {
        this.app21 = value;
    }

    /**
     * Gets the value of the apf22 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF22() {
        return apf22;
    }

    /**
     * Sets the value of the apf22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF22(String value) {
        this.apf22 = value;
    }

    /**
     * Gets the value of the apd22 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD22() {
        return apd22;
    }

    /**
     * Sets the value of the apd22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD22(String value) {
        this.apd22 = value;
    }

    /**
     * Gets the value of the apr22 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR22() {
        return apr22;
    }

    /**
     * Sets the value of the apr22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR22(String value) {
        this.apr22 = value;
    }

    /**
     * Gets the value of the app22 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP22() {
        return app22;
    }

    /**
     * Sets the value of the app22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP22(String value) {
        this.app22 = value;
    }

    /**
     * Gets the value of the apf23 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF23() {
        return apf23;
    }

    /**
     * Sets the value of the apf23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF23(String value) {
        this.apf23 = value;
    }

    /**
     * Gets the value of the apd23 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD23() {
        return apd23;
    }

    /**
     * Sets the value of the apd23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD23(String value) {
        this.apd23 = value;
    }

    /**
     * Gets the value of the apr23 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR23() {
        return apr23;
    }

    /**
     * Sets the value of the apr23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR23(String value) {
        this.apr23 = value;
    }

    /**
     * Gets the value of the app23 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP23() {
        return app23;
    }

    /**
     * Sets the value of the app23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP23(String value) {
        this.app23 = value;
    }

    /**
     * Gets the value of the apf24 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF24() {
        return apf24;
    }

    /**
     * Sets the value of the apf24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF24(String value) {
        this.apf24 = value;
    }

    /**
     * Gets the value of the apd24 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD24() {
        return apd24;
    }

    /**
     * Sets the value of the apd24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD24(String value) {
        this.apd24 = value;
    }

    /**
     * Gets the value of the apr24 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR24() {
        return apr24;
    }

    /**
     * Sets the value of the apr24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR24(String value) {
        this.apr24 = value;
    }

    /**
     * Gets the value of the app24 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP24() {
        return app24;
    }

    /**
     * Sets the value of the app24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP24(String value) {
        this.app24 = value;
    }

    /**
     * Gets the value of the apf25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF25() {
        return apf25;
    }

    /**
     * Sets the value of the apf25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF25(String value) {
        this.apf25 = value;
    }

    /**
     * Gets the value of the apd25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD25() {
        return apd25;
    }

    /**
     * Sets the value of the apd25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD25(String value) {
        this.apd25 = value;
    }

    /**
     * Gets the value of the apr25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR25() {
        return apr25;
    }

    /**
     * Sets the value of the apr25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR25(String value) {
        this.apr25 = value;
    }

    /**
     * Gets the value of the app25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP25() {
        return app25;
    }

    /**
     * Sets the value of the app25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP25(String value) {
        this.app25 = value;
    }

    /**
     * Gets the value of the apf26 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF26() {
        return apf26;
    }

    /**
     * Sets the value of the apf26 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF26(String value) {
        this.apf26 = value;
    }

    /**
     * Gets the value of the apd26 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD26() {
        return apd26;
    }

    /**
     * Sets the value of the apd26 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD26(String value) {
        this.apd26 = value;
    }

    /**
     * Gets the value of the apr26 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR26() {
        return apr26;
    }

    /**
     * Sets the value of the apr26 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR26(String value) {
        this.apr26 = value;
    }

    /**
     * Gets the value of the app26 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP26() {
        return app26;
    }

    /**
     * Sets the value of the app26 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP26(String value) {
        this.app26 = value;
    }

    /**
     * Gets the value of the apf27 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF27() {
        return apf27;
    }

    /**
     * Sets the value of the apf27 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF27(String value) {
        this.apf27 = value;
    }

    /**
     * Gets the value of the apd27 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD27() {
        return apd27;
    }

    /**
     * Sets the value of the apd27 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD27(String value) {
        this.apd27 = value;
    }

    /**
     * Gets the value of the apr27 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR27() {
        return apr27;
    }

    /**
     * Sets the value of the apr27 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR27(String value) {
        this.apr27 = value;
    }

    /**
     * Gets the value of the app27 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP27() {
        return app27;
    }

    /**
     * Sets the value of the app27 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP27(String value) {
        this.app27 = value;
    }

    /**
     * Gets the value of the apf28 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF28() {
        return apf28;
    }

    /**
     * Sets the value of the apf28 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF28(String value) {
        this.apf28 = value;
    }

    /**
     * Gets the value of the apd28 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD28() {
        return apd28;
    }

    /**
     * Sets the value of the apd28 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD28(String value) {
        this.apd28 = value;
    }

    /**
     * Gets the value of the apr28 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR28() {
        return apr28;
    }

    /**
     * Sets the value of the apr28 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR28(String value) {
        this.apr28 = value;
    }

    /**
     * Gets the value of the app28 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP28() {
        return app28;
    }

    /**
     * Sets the value of the app28 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP28(String value) {
        this.app28 = value;
    }

    /**
     * Gets the value of the apf29 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF29() {
        return apf29;
    }

    /**
     * Sets the value of the apf29 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF29(String value) {
        this.apf29 = value;
    }

    /**
     * Gets the value of the apd29 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD29() {
        return apd29;
    }

    /**
     * Sets the value of the apd29 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD29(String value) {
        this.apd29 = value;
    }

    /**
     * Gets the value of the apr29 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR29() {
        return apr29;
    }

    /**
     * Sets the value of the apr29 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR29(String value) {
        this.apr29 = value;
    }

    /**
     * Gets the value of the app29 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP29() {
        return app29;
    }

    /**
     * Sets the value of the app29 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP29(String value) {
        this.app29 = value;
    }

    /**
     * Gets the value of the apf30 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF30() {
        return apf30;
    }

    /**
     * Sets the value of the apf30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF30(String value) {
        this.apf30 = value;
    }

    /**
     * Gets the value of the apd30 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD30() {
        return apd30;
    }

    /**
     * Sets the value of the apd30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD30(String value) {
        this.apd30 = value;
    }

    /**
     * Gets the value of the apr30 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR30() {
        return apr30;
    }

    /**
     * Sets the value of the apr30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR30(String value) {
        this.apr30 = value;
    }

    /**
     * Gets the value of the app30 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP30() {
        return app30;
    }

    /**
     * Sets the value of the app30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP30(String value) {
        this.app30 = value;
    }

    /**
     * Gets the value of the apf31 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF31() {
        return apf31;
    }

    /**
     * Sets the value of the apf31 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF31(String value) {
        this.apf31 = value;
    }

    /**
     * Gets the value of the apd31 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD31() {
        return apd31;
    }

    /**
     * Sets the value of the apd31 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD31(String value) {
        this.apd31 = value;
    }

    /**
     * Gets the value of the apr31 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR31() {
        return apr31;
    }

    /**
     * Sets the value of the apr31 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR31(String value) {
        this.apr31 = value;
    }

    /**
     * Gets the value of the app31 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP31() {
        return app31;
    }

    /**
     * Sets the value of the app31 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP31(String value) {
        this.app31 = value;
    }

    /**
     * Gets the value of the apf32 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF32() {
        return apf32;
    }

    /**
     * Sets the value of the apf32 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF32(String value) {
        this.apf32 = value;
    }

    /**
     * Gets the value of the apd32 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD32() {
        return apd32;
    }

    /**
     * Sets the value of the apd32 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD32(String value) {
        this.apd32 = value;
    }

    /**
     * Gets the value of the apr32 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR32() {
        return apr32;
    }

    /**
     * Sets the value of the apr32 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR32(String value) {
        this.apr32 = value;
    }

    /**
     * Gets the value of the app32 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP32() {
        return app32;
    }

    /**
     * Sets the value of the app32 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP32(String value) {
        this.app32 = value;
    }

    /**
     * Gets the value of the apf33 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF33() {
        return apf33;
    }

    /**
     * Sets the value of the apf33 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF33(String value) {
        this.apf33 = value;
    }

    /**
     * Gets the value of the apd33 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD33() {
        return apd33;
    }

    /**
     * Sets the value of the apd33 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD33(String value) {
        this.apd33 = value;
    }

    /**
     * Gets the value of the apr33 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR33() {
        return apr33;
    }

    /**
     * Sets the value of the apr33 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR33(String value) {
        this.apr33 = value;
    }

    /**
     * Gets the value of the app33 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP33() {
        return app33;
    }

    /**
     * Sets the value of the app33 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP33(String value) {
        this.app33 = value;
    }

    /**
     * Gets the value of the apf34 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF34() {
        return apf34;
    }

    /**
     * Sets the value of the apf34 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF34(String value) {
        this.apf34 = value;
    }

    /**
     * Gets the value of the apd34 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD34() {
        return apd34;
    }

    /**
     * Sets the value of the apd34 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD34(String value) {
        this.apd34 = value;
    }

    /**
     * Gets the value of the apr34 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR34() {
        return apr34;
    }

    /**
     * Sets the value of the apr34 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR34(String value) {
        this.apr34 = value;
    }

    /**
     * Gets the value of the app34 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP34() {
        return app34;
    }

    /**
     * Sets the value of the app34 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP34(String value) {
        this.app34 = value;
    }

    /**
     * Gets the value of the apf35 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF35() {
        return apf35;
    }

    /**
     * Sets the value of the apf35 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF35(String value) {
        this.apf35 = value;
    }

    /**
     * Gets the value of the apd35 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD35() {
        return apd35;
    }

    /**
     * Sets the value of the apd35 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD35(String value) {
        this.apd35 = value;
    }

    /**
     * Gets the value of the apr35 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR35() {
        return apr35;
    }

    /**
     * Sets the value of the apr35 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR35(String value) {
        this.apr35 = value;
    }

    /**
     * Gets the value of the app35 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP35() {
        return app35;
    }

    /**
     * Sets the value of the app35 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP35(String value) {
        this.app35 = value;
    }

    /**
     * Gets the value of the apf36 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF36() {
        return apf36;
    }

    /**
     * Sets the value of the apf36 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF36(String value) {
        this.apf36 = value;
    }

    /**
     * Gets the value of the apd36 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD36() {
        return apd36;
    }

    /**
     * Sets the value of the apd36 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD36(String value) {
        this.apd36 = value;
    }

    /**
     * Gets the value of the apr36 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR36() {
        return apr36;
    }

    /**
     * Sets the value of the apr36 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR36(String value) {
        this.apr36 = value;
    }

    /**
     * Gets the value of the app36 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP36() {
        return app36;
    }

    /**
     * Sets the value of the app36 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP36(String value) {
        this.app36 = value;
    }

    /**
     * Gets the value of the apf37 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF37() {
        return apf37;
    }

    /**
     * Sets the value of the apf37 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF37(String value) {
        this.apf37 = value;
    }

    /**
     * Gets the value of the apd37 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD37() {
        return apd37;
    }

    /**
     * Sets the value of the apd37 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD37(String value) {
        this.apd37 = value;
    }

    /**
     * Gets the value of the apr37 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR37() {
        return apr37;
    }

    /**
     * Sets the value of the apr37 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR37(String value) {
        this.apr37 = value;
    }

    /**
     * Gets the value of the app37 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP37() {
        return app37;
    }

    /**
     * Sets the value of the app37 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP37(String value) {
        this.app37 = value;
    }

    /**
     * Gets the value of the apf38 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF38() {
        return apf38;
    }

    /**
     * Sets the value of the apf38 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF38(String value) {
        this.apf38 = value;
    }

    /**
     * Gets the value of the apd38 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD38() {
        return apd38;
    }

    /**
     * Sets the value of the apd38 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD38(String value) {
        this.apd38 = value;
    }

    /**
     * Gets the value of the apr38 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR38() {
        return apr38;
    }

    /**
     * Sets the value of the apr38 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR38(String value) {
        this.apr38 = value;
    }

    /**
     * Gets the value of the app38 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP38() {
        return app38;
    }

    /**
     * Sets the value of the app38 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP38(String value) {
        this.app38 = value;
    }

    /**
     * Gets the value of the apf39 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF39() {
        return apf39;
    }

    /**
     * Sets the value of the apf39 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF39(String value) {
        this.apf39 = value;
    }

    /**
     * Gets the value of the apd39 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD39() {
        return apd39;
    }

    /**
     * Sets the value of the apd39 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD39(String value) {
        this.apd39 = value;
    }

    /**
     * Gets the value of the apr39 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR39() {
        return apr39;
    }

    /**
     * Sets the value of the apr39 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR39(String value) {
        this.apr39 = value;
    }

    /**
     * Gets the value of the app39 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP39() {
        return app39;
    }

    /**
     * Sets the value of the app39 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP39(String value) {
        this.app39 = value;
    }

    /**
     * Gets the value of the apf40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPF40() {
        return apf40;
    }

    /**
     * Sets the value of the apf40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPF40(String value) {
        this.apf40 = value;
    }

    /**
     * Gets the value of the apd40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPD40() {
        return apd40;
    }

    /**
     * Sets the value of the apd40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPD40(String value) {
        this.apd40 = value;
    }

    /**
     * Gets the value of the apr40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR40() {
        return apr40;
    }

    /**
     * Sets the value of the apr40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR40(String value) {
        this.apr40 = value;
    }

    /**
     * Gets the value of the app40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPP40() {
        return app40;
    }

    /**
     * Sets the value of the app40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPP40(String value) {
        this.app40 = value;
    }

    /**
     * Gets the value of the ktrat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKTRAT() {
        return ktrat;
    }

    /**
     * Sets the value of the ktrat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKTRAT(String value) {
        this.ktrat = value;
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
