
package deep.pojo.xml;

import javax.xml.bind.annotation.*;


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
 *         &lt;element name="ANSAL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="17"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANCUR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADRTE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WAER1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPK01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPK02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPK03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPK04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPK05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPK06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPK07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPK08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPK09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPK10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPK11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPK12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPK13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPK14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPK15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPK16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPK17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPK18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPK19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPK20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WAER2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGR01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BER01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANH01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIH01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPE01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGR02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BER02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANH02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIH02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPE02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGR03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BER03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANH03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIH03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPE03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGR04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BER04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANH04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIH04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPE04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGR05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BER05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANH05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIH05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPE05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGR06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BER06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANH06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIH06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPE06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGR07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BER07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANH07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIH07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPE07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGR08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BER08" minOccurs="0"&gt;
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
 *         &lt;element name="E1Q0560" minOccurs="0"&gt;
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
 *                   &lt;element name="ANH08" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="9"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="EIH08" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OPE08" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LGR09" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BER09" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ANH09" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="9"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="EIH09" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OPE09" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LGR10" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BER10" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ANH10" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="9"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="EIH10" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OPE10" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IND01" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IND02" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IND03" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IND04" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IND05" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IND06" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IND07" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IND08" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IND09" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IND10" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IND11" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IND12" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IND13" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IND14" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IND15" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IND16" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IND17" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IND18" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IND19" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IND20" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="INB01" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="INB02" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="INB03" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="INB04" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="INB05" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="INB06" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="INB07" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="INB08" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="INB09" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="INB10" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PYCLS" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
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
    "ansal",
    "ancur",
    "adrte",
    "waer1",
    "lga01",
    "bet01",
    "anz01",
    "ein01",
    "opk01",
    "lga02",
    "bet02",
    "anz02",
    "ein02",
    "opk02",
    "lga03",
    "bet03",
    "anz03",
    "ein03",
    "opk03",
    "lga04",
    "bet04",
    "anz04",
    "ein04",
    "opk04",
    "lga05",
    "bet05",
    "anz05",
    "ein05",
    "opk05",
    "lga06",
    "bet06",
    "anz06",
    "ein06",
    "opk06",
    "lga07",
    "bet07",
    "anz07",
    "ein07",
    "opk07",
    "lga08",
    "bet08",
    "anz08",
    "ein08",
    "opk08",
    "lga09",
    "bet09",
    "anz09",
    "ein09",
    "opk09",
    "lga10",
    "bet10",
    "anz10",
    "ein10",
    "opk10",
    "lga11",
    "bet11",
    "anz11",
    "ein11",
    "opk11",
    "lga12",
    "bet12",
    "anz12",
    "ein12",
    "opk12",
    "lga13",
    "bet13",
    "anz13",
    "ein13",
    "opk13",
    "lga14",
    "bet14",
    "anz14",
    "ein14",
    "opk14",
    "lga15",
    "bet15",
    "anz15",
    "ein15",
    "opk15",
    "lga16",
    "bet16",
    "anz16",
    "ein16",
    "opk16",
    "lga17",
    "bet17",
    "anz17",
    "ein17",
    "opk17",
    "lga18",
    "bet18",
    "anz18",
    "ein18",
    "opk18",
    "lga19",
    "bet19",
    "anz19",
    "ein19",
    "opk19",
    "lga20",
    "bet20",
    "anz20",
    "ein20",
    "opk20",
    "waer2",
    "lgr01",
    "ber01",
    "anh01",
    "eih01",
    "ope01",
    "lgr02",
    "ber02",
    "anh02",
    "eih02",
    "ope02",
    "lgr03",
    "ber03",
    "anh03",
    "eih03",
    "ope03",
    "lgr04",
    "ber04",
    "anh04",
    "eih04",
    "ope04",
    "lgr05",
    "ber05",
    "anh05",
    "eih05",
    "ope05",
    "lgr06",
    "ber06",
    "anh06",
    "eih06",
    "ope06",
    "lgr07",
    "ber07",
    "anh07",
    "eih07",
    "ope07",
    "lgr08",
    "ber08",
    "grpvl",
    "e1Q0560"
})
public class E1P0560 {

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
    @XmlElement(name = "ANSAL")
    protected String ansal;
    @XmlElement(name = "ANCUR")
    protected String ancur;
    @XmlElement(name = "ADRTE")
    protected String adrte;
    @XmlElement(name = "WAER1")
    protected String waer1;
    @XmlElement(name = "LGA01")
    protected String lga01;
    @XmlElement(name = "BET01")
    protected String bet01;
    @XmlElement(name = "ANZ01")
    protected String anz01;
    @XmlElement(name = "EIN01")
    protected String ein01;
    @XmlElement(name = "OPK01")
    protected String opk01;
    @XmlElement(name = "LGA02")
    protected String lga02;
    @XmlElement(name = "BET02")
    protected String bet02;
    @XmlElement(name = "ANZ02")
    protected String anz02;
    @XmlElement(name = "EIN02")
    protected String ein02;
    @XmlElement(name = "OPK02")
    protected String opk02;
    @XmlElement(name = "LGA03")
    protected String lga03;
    @XmlElement(name = "BET03")
    protected String bet03;
    @XmlElement(name = "ANZ03")
    protected String anz03;
    @XmlElement(name = "EIN03")
    protected String ein03;
    @XmlElement(name = "OPK03")
    protected String opk03;
    @XmlElement(name = "LGA04")
    protected String lga04;
    @XmlElement(name = "BET04")
    protected String bet04;
    @XmlElement(name = "ANZ04")
    protected String anz04;
    @XmlElement(name = "EIN04")
    protected String ein04;
    @XmlElement(name = "OPK04")
    protected String opk04;
    @XmlElement(name = "LGA05")
    protected String lga05;
    @XmlElement(name = "BET05")
    protected String bet05;
    @XmlElement(name = "ANZ05")
    protected String anz05;
    @XmlElement(name = "EIN05")
    protected String ein05;
    @XmlElement(name = "OPK05")
    protected String opk05;
    @XmlElement(name = "LGA06")
    protected String lga06;
    @XmlElement(name = "BET06")
    protected String bet06;
    @XmlElement(name = "ANZ06")
    protected String anz06;
    @XmlElement(name = "EIN06")
    protected String ein06;
    @XmlElement(name = "OPK06")
    protected String opk06;
    @XmlElement(name = "LGA07")
    protected String lga07;
    @XmlElement(name = "BET07")
    protected String bet07;
    @XmlElement(name = "ANZ07")
    protected String anz07;
    @XmlElement(name = "EIN07")
    protected String ein07;
    @XmlElement(name = "OPK07")
    protected String opk07;
    @XmlElement(name = "LGA08")
    protected String lga08;
    @XmlElement(name = "BET08")
    protected String bet08;
    @XmlElement(name = "ANZ08")
    protected String anz08;
    @XmlElement(name = "EIN08")
    protected String ein08;
    @XmlElement(name = "OPK08")
    protected String opk08;
    @XmlElement(name = "LGA09")
    protected String lga09;
    @XmlElement(name = "BET09")
    protected String bet09;
    @XmlElement(name = "ANZ09")
    protected String anz09;
    @XmlElement(name = "EIN09")
    protected String ein09;
    @XmlElement(name = "OPK09")
    protected String opk09;
    @XmlElement(name = "LGA10")
    protected String lga10;
    @XmlElement(name = "BET10")
    protected String bet10;
    @XmlElement(name = "ANZ10")
    protected String anz10;
    @XmlElement(name = "EIN10")
    protected String ein10;
    @XmlElement(name = "OPK10")
    protected String opk10;
    @XmlElement(name = "LGA11")
    protected String lga11;
    @XmlElement(name = "BET11")
    protected String bet11;
    @XmlElement(name = "ANZ11")
    protected String anz11;
    @XmlElement(name = "EIN11")
    protected String ein11;
    @XmlElement(name = "OPK11")
    protected String opk11;
    @XmlElement(name = "LGA12")
    protected String lga12;
    @XmlElement(name = "BET12")
    protected String bet12;
    @XmlElement(name = "ANZ12")
    protected String anz12;
    @XmlElement(name = "EIN12")
    protected String ein12;
    @XmlElement(name = "OPK12")
    protected String opk12;
    @XmlElement(name = "LGA13")
    protected String lga13;
    @XmlElement(name = "BET13")
    protected String bet13;
    @XmlElement(name = "ANZ13")
    protected String anz13;
    @XmlElement(name = "EIN13")
    protected String ein13;
    @XmlElement(name = "OPK13")
    protected String opk13;
    @XmlElement(name = "LGA14")
    protected String lga14;
    @XmlElement(name = "BET14")
    protected String bet14;
    @XmlElement(name = "ANZ14")
    protected String anz14;
    @XmlElement(name = "EIN14")
    protected String ein14;
    @XmlElement(name = "OPK14")
    protected String opk14;
    @XmlElement(name = "LGA15")
    protected String lga15;
    @XmlElement(name = "BET15")
    protected String bet15;
    @XmlElement(name = "ANZ15")
    protected String anz15;
    @XmlElement(name = "EIN15")
    protected String ein15;
    @XmlElement(name = "OPK15")
    protected String opk15;
    @XmlElement(name = "LGA16")
    protected String lga16;
    @XmlElement(name = "BET16")
    protected String bet16;
    @XmlElement(name = "ANZ16")
    protected String anz16;
    @XmlElement(name = "EIN16")
    protected String ein16;
    @XmlElement(name = "OPK16")
    protected String opk16;
    @XmlElement(name = "LGA17")
    protected String lga17;
    @XmlElement(name = "BET17")
    protected String bet17;
    @XmlElement(name = "ANZ17")
    protected String anz17;
    @XmlElement(name = "EIN17")
    protected String ein17;
    @XmlElement(name = "OPK17")
    protected String opk17;
    @XmlElement(name = "LGA18")
    protected String lga18;
    @XmlElement(name = "BET18")
    protected String bet18;
    @XmlElement(name = "ANZ18")
    protected String anz18;
    @XmlElement(name = "EIN18")
    protected String ein18;
    @XmlElement(name = "OPK18")
    protected String opk18;
    @XmlElement(name = "LGA19")
    protected String lga19;
    @XmlElement(name = "BET19")
    protected String bet19;
    @XmlElement(name = "ANZ19")
    protected String anz19;
    @XmlElement(name = "EIN19")
    protected String ein19;
    @XmlElement(name = "OPK19")
    protected String opk19;
    @XmlElement(name = "LGA20")
    protected String lga20;
    @XmlElement(name = "BET20")
    protected String bet20;
    @XmlElement(name = "ANZ20")
    protected String anz20;
    @XmlElement(name = "EIN20")
    protected String ein20;
    @XmlElement(name = "OPK20")
    protected String opk20;
    @XmlElement(name = "WAER2")
    protected String waer2;
    @XmlElement(name = "LGR01")
    protected String lgr01;
    @XmlElement(name = "BER01")
    protected String ber01;
    @XmlElement(name = "ANH01")
    protected String anh01;
    @XmlElement(name = "EIH01")
    protected String eih01;
    @XmlElement(name = "OPE01")
    protected String ope01;
    @XmlElement(name = "LGR02")
    protected String lgr02;
    @XmlElement(name = "BER02")
    protected String ber02;
    @XmlElement(name = "ANH02")
    protected String anh02;
    @XmlElement(name = "EIH02")
    protected String eih02;
    @XmlElement(name = "OPE02")
    protected String ope02;
    @XmlElement(name = "LGR03")
    protected String lgr03;
    @XmlElement(name = "BER03")
    protected String ber03;
    @XmlElement(name = "ANH03")
    protected String anh03;
    @XmlElement(name = "EIH03")
    protected String eih03;
    @XmlElement(name = "OPE03")
    protected String ope03;
    @XmlElement(name = "LGR04")
    protected String lgr04;
    @XmlElement(name = "BER04")
    protected String ber04;
    @XmlElement(name = "ANH04")
    protected String anh04;
    @XmlElement(name = "EIH04")
    protected String eih04;
    @XmlElement(name = "OPE04")
    protected String ope04;
    @XmlElement(name = "LGR05")
    protected String lgr05;
    @XmlElement(name = "BER05")
    protected String ber05;
    @XmlElement(name = "ANH05")
    protected String anh05;
    @XmlElement(name = "EIH05")
    protected String eih05;
    @XmlElement(name = "OPE05")
    protected String ope05;
    @XmlElement(name = "LGR06")
    protected String lgr06;
    @XmlElement(name = "BER06")
    protected String ber06;
    @XmlElement(name = "ANH06")
    protected String anh06;
    @XmlElement(name = "EIH06")
    protected String eih06;
    @XmlElement(name = "OPE06")
    protected String ope06;
    @XmlElement(name = "LGR07")
    protected String lgr07;
    @XmlElement(name = "BER07")
    protected String ber07;
    @XmlElement(name = "ANH07")
    protected String anh07;
    @XmlElement(name = "EIH07")
    protected String eih07;
    @XmlElement(name = "OPE07")
    protected String ope07;
    @XmlElement(name = "LGR08")
    protected String lgr08;
    @XmlElement(name = "BER08")
    protected String ber08;
    @XmlElement(name = "GRPVL")
    protected String grpvl;
    @XmlElement(name = "E1Q0560")
    protected E1Q0560 e1Q0560;
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
     * Gets the value of the ansal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANSAL() {
        return ansal;
    }

    /**
     * Sets the value of the ansal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANSAL(String value) {
        this.ansal = value;
    }

    /**
     * Gets the value of the ancur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANCUR() {
        return ancur;
    }

    /**
     * Sets the value of the ancur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANCUR(String value) {
        this.ancur = value;
    }

    /**
     * Gets the value of the adrte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADRTE() {
        return adrte;
    }

    /**
     * Sets the value of the adrte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADRTE(String value) {
        this.adrte = value;
    }

    /**
     * Gets the value of the waer1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAER1() {
        return waer1;
    }

    /**
     * Sets the value of the waer1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAER1(String value) {
        this.waer1 = value;
    }

    /**
     * Gets the value of the lga01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA01() {
        return lga01;
    }

    /**
     * Sets the value of the lga01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA01(String value) {
        this.lga01 = value;
    }

    /**
     * Gets the value of the bet01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET01() {
        return bet01;
    }

    /**
     * Sets the value of the bet01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET01(String value) {
        this.bet01 = value;
    }

    /**
     * Gets the value of the anz01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ01() {
        return anz01;
    }

    /**
     * Sets the value of the anz01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ01(String value) {
        this.anz01 = value;
    }

    /**
     * Gets the value of the ein01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN01() {
        return ein01;
    }

    /**
     * Sets the value of the ein01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN01(String value) {
        this.ein01 = value;
    }

    /**
     * Gets the value of the opk01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPK01() {
        return opk01;
    }

    /**
     * Sets the value of the opk01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPK01(String value) {
        this.opk01 = value;
    }

    /**
     * Gets the value of the lga02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA02() {
        return lga02;
    }

    /**
     * Sets the value of the lga02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA02(String value) {
        this.lga02 = value;
    }

    /**
     * Gets the value of the bet02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET02() {
        return bet02;
    }

    /**
     * Sets the value of the bet02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET02(String value) {
        this.bet02 = value;
    }

    /**
     * Gets the value of the anz02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ02() {
        return anz02;
    }

    /**
     * Sets the value of the anz02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ02(String value) {
        this.anz02 = value;
    }

    /**
     * Gets the value of the ein02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN02() {
        return ein02;
    }

    /**
     * Sets the value of the ein02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN02(String value) {
        this.ein02 = value;
    }

    /**
     * Gets the value of the opk02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPK02() {
        return opk02;
    }

    /**
     * Sets the value of the opk02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPK02(String value) {
        this.opk02 = value;
    }

    /**
     * Gets the value of the lga03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA03() {
        return lga03;
    }

    /**
     * Sets the value of the lga03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA03(String value) {
        this.lga03 = value;
    }

    /**
     * Gets the value of the bet03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET03() {
        return bet03;
    }

    /**
     * Sets the value of the bet03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET03(String value) {
        this.bet03 = value;
    }

    /**
     * Gets the value of the anz03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ03() {
        return anz03;
    }

    /**
     * Sets the value of the anz03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ03(String value) {
        this.anz03 = value;
    }

    /**
     * Gets the value of the ein03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN03() {
        return ein03;
    }

    /**
     * Sets the value of the ein03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN03(String value) {
        this.ein03 = value;
    }

    /**
     * Gets the value of the opk03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPK03() {
        return opk03;
    }

    /**
     * Sets the value of the opk03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPK03(String value) {
        this.opk03 = value;
    }

    /**
     * Gets the value of the lga04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA04() {
        return lga04;
    }

    /**
     * Sets the value of the lga04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA04(String value) {
        this.lga04 = value;
    }

    /**
     * Gets the value of the bet04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET04() {
        return bet04;
    }

    /**
     * Sets the value of the bet04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET04(String value) {
        this.bet04 = value;
    }

    /**
     * Gets the value of the anz04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ04() {
        return anz04;
    }

    /**
     * Sets the value of the anz04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ04(String value) {
        this.anz04 = value;
    }

    /**
     * Gets the value of the ein04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN04() {
        return ein04;
    }

    /**
     * Sets the value of the ein04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN04(String value) {
        this.ein04 = value;
    }

    /**
     * Gets the value of the opk04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPK04() {
        return opk04;
    }

    /**
     * Sets the value of the opk04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPK04(String value) {
        this.opk04 = value;
    }

    /**
     * Gets the value of the lga05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA05() {
        return lga05;
    }

    /**
     * Sets the value of the lga05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA05(String value) {
        this.lga05 = value;
    }

    /**
     * Gets the value of the bet05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET05() {
        return bet05;
    }

    /**
     * Sets the value of the bet05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET05(String value) {
        this.bet05 = value;
    }

    /**
     * Gets the value of the anz05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ05() {
        return anz05;
    }

    /**
     * Sets the value of the anz05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ05(String value) {
        this.anz05 = value;
    }

    /**
     * Gets the value of the ein05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN05() {
        return ein05;
    }

    /**
     * Sets the value of the ein05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN05(String value) {
        this.ein05 = value;
    }

    /**
     * Gets the value of the opk05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPK05() {
        return opk05;
    }

    /**
     * Sets the value of the opk05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPK05(String value) {
        this.opk05 = value;
    }

    /**
     * Gets the value of the lga06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA06() {
        return lga06;
    }

    /**
     * Sets the value of the lga06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA06(String value) {
        this.lga06 = value;
    }

    /**
     * Gets the value of the bet06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET06() {
        return bet06;
    }

    /**
     * Sets the value of the bet06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET06(String value) {
        this.bet06 = value;
    }

    /**
     * Gets the value of the anz06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ06() {
        return anz06;
    }

    /**
     * Sets the value of the anz06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ06(String value) {
        this.anz06 = value;
    }

    /**
     * Gets the value of the ein06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN06() {
        return ein06;
    }

    /**
     * Sets the value of the ein06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN06(String value) {
        this.ein06 = value;
    }

    /**
     * Gets the value of the opk06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPK06() {
        return opk06;
    }

    /**
     * Sets the value of the opk06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPK06(String value) {
        this.opk06 = value;
    }

    /**
     * Gets the value of the lga07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA07() {
        return lga07;
    }

    /**
     * Sets the value of the lga07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA07(String value) {
        this.lga07 = value;
    }

    /**
     * Gets the value of the bet07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET07() {
        return bet07;
    }

    /**
     * Sets the value of the bet07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET07(String value) {
        this.bet07 = value;
    }

    /**
     * Gets the value of the anz07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ07() {
        return anz07;
    }

    /**
     * Sets the value of the anz07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ07(String value) {
        this.anz07 = value;
    }

    /**
     * Gets the value of the ein07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN07() {
        return ein07;
    }

    /**
     * Sets the value of the ein07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN07(String value) {
        this.ein07 = value;
    }

    /**
     * Gets the value of the opk07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPK07() {
        return opk07;
    }

    /**
     * Sets the value of the opk07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPK07(String value) {
        this.opk07 = value;
    }

    /**
     * Gets the value of the lga08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA08() {
        return lga08;
    }

    /**
     * Sets the value of the lga08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA08(String value) {
        this.lga08 = value;
    }

    /**
     * Gets the value of the bet08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET08() {
        return bet08;
    }

    /**
     * Sets the value of the bet08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET08(String value) {
        this.bet08 = value;
    }

    /**
     * Gets the value of the anz08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ08() {
        return anz08;
    }

    /**
     * Sets the value of the anz08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ08(String value) {
        this.anz08 = value;
    }

    /**
     * Gets the value of the ein08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN08() {
        return ein08;
    }

    /**
     * Sets the value of the ein08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN08(String value) {
        this.ein08 = value;
    }

    /**
     * Gets the value of the opk08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPK08() {
        return opk08;
    }

    /**
     * Sets the value of the opk08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPK08(String value) {
        this.opk08 = value;
    }

    /**
     * Gets the value of the lga09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA09() {
        return lga09;
    }

    /**
     * Sets the value of the lga09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA09(String value) {
        this.lga09 = value;
    }

    /**
     * Gets the value of the bet09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET09() {
        return bet09;
    }

    /**
     * Sets the value of the bet09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET09(String value) {
        this.bet09 = value;
    }

    /**
     * Gets the value of the anz09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ09() {
        return anz09;
    }

    /**
     * Sets the value of the anz09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ09(String value) {
        this.anz09 = value;
    }

    /**
     * Gets the value of the ein09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN09() {
        return ein09;
    }

    /**
     * Sets the value of the ein09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN09(String value) {
        this.ein09 = value;
    }

    /**
     * Gets the value of the opk09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPK09() {
        return opk09;
    }

    /**
     * Sets the value of the opk09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPK09(String value) {
        this.opk09 = value;
    }

    /**
     * Gets the value of the lga10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA10() {
        return lga10;
    }

    /**
     * Sets the value of the lga10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA10(String value) {
        this.lga10 = value;
    }

    /**
     * Gets the value of the bet10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET10() {
        return bet10;
    }

    /**
     * Sets the value of the bet10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET10(String value) {
        this.bet10 = value;
    }

    /**
     * Gets the value of the anz10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ10() {
        return anz10;
    }

    /**
     * Sets the value of the anz10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ10(String value) {
        this.anz10 = value;
    }

    /**
     * Gets the value of the ein10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN10() {
        return ein10;
    }

    /**
     * Sets the value of the ein10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN10(String value) {
        this.ein10 = value;
    }

    /**
     * Gets the value of the opk10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPK10() {
        return opk10;
    }

    /**
     * Sets the value of the opk10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPK10(String value) {
        this.opk10 = value;
    }

    /**
     * Gets the value of the lga11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA11() {
        return lga11;
    }

    /**
     * Sets the value of the lga11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA11(String value) {
        this.lga11 = value;
    }

    /**
     * Gets the value of the bet11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET11() {
        return bet11;
    }

    /**
     * Sets the value of the bet11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET11(String value) {
        this.bet11 = value;
    }

    /**
     * Gets the value of the anz11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ11() {
        return anz11;
    }

    /**
     * Sets the value of the anz11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ11(String value) {
        this.anz11 = value;
    }

    /**
     * Gets the value of the ein11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN11() {
        return ein11;
    }

    /**
     * Sets the value of the ein11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN11(String value) {
        this.ein11 = value;
    }

    /**
     * Gets the value of the opk11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPK11() {
        return opk11;
    }

    /**
     * Sets the value of the opk11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPK11(String value) {
        this.opk11 = value;
    }

    /**
     * Gets the value of the lga12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA12() {
        return lga12;
    }

    /**
     * Sets the value of the lga12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA12(String value) {
        this.lga12 = value;
    }

    /**
     * Gets the value of the bet12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET12() {
        return bet12;
    }

    /**
     * Sets the value of the bet12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET12(String value) {
        this.bet12 = value;
    }

    /**
     * Gets the value of the anz12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ12() {
        return anz12;
    }

    /**
     * Sets the value of the anz12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ12(String value) {
        this.anz12 = value;
    }

    /**
     * Gets the value of the ein12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN12() {
        return ein12;
    }

    /**
     * Sets the value of the ein12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN12(String value) {
        this.ein12 = value;
    }

    /**
     * Gets the value of the opk12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPK12() {
        return opk12;
    }

    /**
     * Sets the value of the opk12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPK12(String value) {
        this.opk12 = value;
    }

    /**
     * Gets the value of the lga13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA13() {
        return lga13;
    }

    /**
     * Sets the value of the lga13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA13(String value) {
        this.lga13 = value;
    }

    /**
     * Gets the value of the bet13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET13() {
        return bet13;
    }

    /**
     * Sets the value of the bet13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET13(String value) {
        this.bet13 = value;
    }

    /**
     * Gets the value of the anz13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ13() {
        return anz13;
    }

    /**
     * Sets the value of the anz13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ13(String value) {
        this.anz13 = value;
    }

    /**
     * Gets the value of the ein13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN13() {
        return ein13;
    }

    /**
     * Sets the value of the ein13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN13(String value) {
        this.ein13 = value;
    }

    /**
     * Gets the value of the opk13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPK13() {
        return opk13;
    }

    /**
     * Sets the value of the opk13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPK13(String value) {
        this.opk13 = value;
    }

    /**
     * Gets the value of the lga14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA14() {
        return lga14;
    }

    /**
     * Sets the value of the lga14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA14(String value) {
        this.lga14 = value;
    }

    /**
     * Gets the value of the bet14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET14() {
        return bet14;
    }

    /**
     * Sets the value of the bet14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET14(String value) {
        this.bet14 = value;
    }

    /**
     * Gets the value of the anz14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ14() {
        return anz14;
    }

    /**
     * Sets the value of the anz14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ14(String value) {
        this.anz14 = value;
    }

    /**
     * Gets the value of the ein14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN14() {
        return ein14;
    }

    /**
     * Sets the value of the ein14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN14(String value) {
        this.ein14 = value;
    }

    /**
     * Gets the value of the opk14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPK14() {
        return opk14;
    }

    /**
     * Sets the value of the opk14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPK14(String value) {
        this.opk14 = value;
    }

    /**
     * Gets the value of the lga15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA15() {
        return lga15;
    }

    /**
     * Sets the value of the lga15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA15(String value) {
        this.lga15 = value;
    }

    /**
     * Gets the value of the bet15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET15() {
        return bet15;
    }

    /**
     * Sets the value of the bet15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET15(String value) {
        this.bet15 = value;
    }

    /**
     * Gets the value of the anz15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ15() {
        return anz15;
    }

    /**
     * Sets the value of the anz15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ15(String value) {
        this.anz15 = value;
    }

    /**
     * Gets the value of the ein15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN15() {
        return ein15;
    }

    /**
     * Sets the value of the ein15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN15(String value) {
        this.ein15 = value;
    }

    /**
     * Gets the value of the opk15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPK15() {
        return opk15;
    }

    /**
     * Sets the value of the opk15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPK15(String value) {
        this.opk15 = value;
    }

    /**
     * Gets the value of the lga16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA16() {
        return lga16;
    }

    /**
     * Sets the value of the lga16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA16(String value) {
        this.lga16 = value;
    }

    /**
     * Gets the value of the bet16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET16() {
        return bet16;
    }

    /**
     * Sets the value of the bet16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET16(String value) {
        this.bet16 = value;
    }

    /**
     * Gets the value of the anz16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ16() {
        return anz16;
    }

    /**
     * Sets the value of the anz16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ16(String value) {
        this.anz16 = value;
    }

    /**
     * Gets the value of the ein16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN16() {
        return ein16;
    }

    /**
     * Sets the value of the ein16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN16(String value) {
        this.ein16 = value;
    }

    /**
     * Gets the value of the opk16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPK16() {
        return opk16;
    }

    /**
     * Sets the value of the opk16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPK16(String value) {
        this.opk16 = value;
    }

    /**
     * Gets the value of the lga17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA17() {
        return lga17;
    }

    /**
     * Sets the value of the lga17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA17(String value) {
        this.lga17 = value;
    }

    /**
     * Gets the value of the bet17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET17() {
        return bet17;
    }

    /**
     * Sets the value of the bet17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET17(String value) {
        this.bet17 = value;
    }

    /**
     * Gets the value of the anz17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ17() {
        return anz17;
    }

    /**
     * Sets the value of the anz17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ17(String value) {
        this.anz17 = value;
    }

    /**
     * Gets the value of the ein17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN17() {
        return ein17;
    }

    /**
     * Sets the value of the ein17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN17(String value) {
        this.ein17 = value;
    }

    /**
     * Gets the value of the opk17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPK17() {
        return opk17;
    }

    /**
     * Sets the value of the opk17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPK17(String value) {
        this.opk17 = value;
    }

    /**
     * Gets the value of the lga18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA18() {
        return lga18;
    }

    /**
     * Sets the value of the lga18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA18(String value) {
        this.lga18 = value;
    }

    /**
     * Gets the value of the bet18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET18() {
        return bet18;
    }

    /**
     * Sets the value of the bet18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET18(String value) {
        this.bet18 = value;
    }

    /**
     * Gets the value of the anz18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ18() {
        return anz18;
    }

    /**
     * Sets the value of the anz18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ18(String value) {
        this.anz18 = value;
    }

    /**
     * Gets the value of the ein18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN18() {
        return ein18;
    }

    /**
     * Sets the value of the ein18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN18(String value) {
        this.ein18 = value;
    }

    /**
     * Gets the value of the opk18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPK18() {
        return opk18;
    }

    /**
     * Sets the value of the opk18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPK18(String value) {
        this.opk18 = value;
    }

    /**
     * Gets the value of the lga19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA19() {
        return lga19;
    }

    /**
     * Sets the value of the lga19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA19(String value) {
        this.lga19 = value;
    }

    /**
     * Gets the value of the bet19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET19() {
        return bet19;
    }

    /**
     * Sets the value of the bet19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET19(String value) {
        this.bet19 = value;
    }

    /**
     * Gets the value of the anz19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ19() {
        return anz19;
    }

    /**
     * Sets the value of the anz19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ19(String value) {
        this.anz19 = value;
    }

    /**
     * Gets the value of the ein19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN19() {
        return ein19;
    }

    /**
     * Sets the value of the ein19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN19(String value) {
        this.ein19 = value;
    }

    /**
     * Gets the value of the opk19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPK19() {
        return opk19;
    }

    /**
     * Sets the value of the opk19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPK19(String value) {
        this.opk19 = value;
    }

    /**
     * Gets the value of the lga20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA20() {
        return lga20;
    }

    /**
     * Sets the value of the lga20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA20(String value) {
        this.lga20 = value;
    }

    /**
     * Gets the value of the bet20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET20() {
        return bet20;
    }

    /**
     * Sets the value of the bet20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET20(String value) {
        this.bet20 = value;
    }

    /**
     * Gets the value of the anz20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ20() {
        return anz20;
    }

    /**
     * Sets the value of the anz20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ20(String value) {
        this.anz20 = value;
    }

    /**
     * Gets the value of the ein20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN20() {
        return ein20;
    }

    /**
     * Sets the value of the ein20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN20(String value) {
        this.ein20 = value;
    }

    /**
     * Gets the value of the opk20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPK20() {
        return opk20;
    }

    /**
     * Sets the value of the opk20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPK20(String value) {
        this.opk20 = value;
    }

    /**
     * Gets the value of the waer2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAER2() {
        return waer2;
    }

    /**
     * Sets the value of the waer2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAER2(String value) {
        this.waer2 = value;
    }

    /**
     * Gets the value of the lgr01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGR01() {
        return lgr01;
    }

    /**
     * Sets the value of the lgr01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGR01(String value) {
        this.lgr01 = value;
    }

    /**
     * Gets the value of the ber01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBER01() {
        return ber01;
    }

    /**
     * Sets the value of the ber01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBER01(String value) {
        this.ber01 = value;
    }

    /**
     * Gets the value of the anh01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANH01() {
        return anh01;
    }

    /**
     * Sets the value of the anh01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANH01(String value) {
        this.anh01 = value;
    }

    /**
     * Gets the value of the eih01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIH01() {
        return eih01;
    }

    /**
     * Sets the value of the eih01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIH01(String value) {
        this.eih01 = value;
    }

    /**
     * Gets the value of the ope01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPE01() {
        return ope01;
    }

    /**
     * Sets the value of the ope01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPE01(String value) {
        this.ope01 = value;
    }

    /**
     * Gets the value of the lgr02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGR02() {
        return lgr02;
    }

    /**
     * Sets the value of the lgr02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGR02(String value) {
        this.lgr02 = value;
    }

    /**
     * Gets the value of the ber02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBER02() {
        return ber02;
    }

    /**
     * Sets the value of the ber02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBER02(String value) {
        this.ber02 = value;
    }

    /**
     * Gets the value of the anh02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANH02() {
        return anh02;
    }

    /**
     * Sets the value of the anh02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANH02(String value) {
        this.anh02 = value;
    }

    /**
     * Gets the value of the eih02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIH02() {
        return eih02;
    }

    /**
     * Sets the value of the eih02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIH02(String value) {
        this.eih02 = value;
    }

    /**
     * Gets the value of the ope02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPE02() {
        return ope02;
    }

    /**
     * Sets the value of the ope02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPE02(String value) {
        this.ope02 = value;
    }

    /**
     * Gets the value of the lgr03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGR03() {
        return lgr03;
    }

    /**
     * Sets the value of the lgr03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGR03(String value) {
        this.lgr03 = value;
    }

    /**
     * Gets the value of the ber03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBER03() {
        return ber03;
    }

    /**
     * Sets the value of the ber03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBER03(String value) {
        this.ber03 = value;
    }

    /**
     * Gets the value of the anh03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANH03() {
        return anh03;
    }

    /**
     * Sets the value of the anh03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANH03(String value) {
        this.anh03 = value;
    }

    /**
     * Gets the value of the eih03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIH03() {
        return eih03;
    }

    /**
     * Sets the value of the eih03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIH03(String value) {
        this.eih03 = value;
    }

    /**
     * Gets the value of the ope03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPE03() {
        return ope03;
    }

    /**
     * Sets the value of the ope03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPE03(String value) {
        this.ope03 = value;
    }

    /**
     * Gets the value of the lgr04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGR04() {
        return lgr04;
    }

    /**
     * Sets the value of the lgr04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGR04(String value) {
        this.lgr04 = value;
    }

    /**
     * Gets the value of the ber04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBER04() {
        return ber04;
    }

    /**
     * Sets the value of the ber04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBER04(String value) {
        this.ber04 = value;
    }

    /**
     * Gets the value of the anh04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANH04() {
        return anh04;
    }

    /**
     * Sets the value of the anh04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANH04(String value) {
        this.anh04 = value;
    }

    /**
     * Gets the value of the eih04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIH04() {
        return eih04;
    }

    /**
     * Sets the value of the eih04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIH04(String value) {
        this.eih04 = value;
    }

    /**
     * Gets the value of the ope04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPE04() {
        return ope04;
    }

    /**
     * Sets the value of the ope04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPE04(String value) {
        this.ope04 = value;
    }

    /**
     * Gets the value of the lgr05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGR05() {
        return lgr05;
    }

    /**
     * Sets the value of the lgr05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGR05(String value) {
        this.lgr05 = value;
    }

    /**
     * Gets the value of the ber05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBER05() {
        return ber05;
    }

    /**
     * Sets the value of the ber05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBER05(String value) {
        this.ber05 = value;
    }

    /**
     * Gets the value of the anh05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANH05() {
        return anh05;
    }

    /**
     * Sets the value of the anh05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANH05(String value) {
        this.anh05 = value;
    }

    /**
     * Gets the value of the eih05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIH05() {
        return eih05;
    }

    /**
     * Sets the value of the eih05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIH05(String value) {
        this.eih05 = value;
    }

    /**
     * Gets the value of the ope05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPE05() {
        return ope05;
    }

    /**
     * Sets the value of the ope05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPE05(String value) {
        this.ope05 = value;
    }

    /**
     * Gets the value of the lgr06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGR06() {
        return lgr06;
    }

    /**
     * Sets the value of the lgr06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGR06(String value) {
        this.lgr06 = value;
    }

    /**
     * Gets the value of the ber06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBER06() {
        return ber06;
    }

    /**
     * Sets the value of the ber06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBER06(String value) {
        this.ber06 = value;
    }

    /**
     * Gets the value of the anh06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANH06() {
        return anh06;
    }

    /**
     * Sets the value of the anh06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANH06(String value) {
        this.anh06 = value;
    }

    /**
     * Gets the value of the eih06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIH06() {
        return eih06;
    }

    /**
     * Sets the value of the eih06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIH06(String value) {
        this.eih06 = value;
    }

    /**
     * Gets the value of the ope06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPE06() {
        return ope06;
    }

    /**
     * Sets the value of the ope06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPE06(String value) {
        this.ope06 = value;
    }

    /**
     * Gets the value of the lgr07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGR07() {
        return lgr07;
    }

    /**
     * Sets the value of the lgr07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGR07(String value) {
        this.lgr07 = value;
    }

    /**
     * Gets the value of the ber07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBER07() {
        return ber07;
    }

    /**
     * Sets the value of the ber07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBER07(String value) {
        this.ber07 = value;
    }

    /**
     * Gets the value of the anh07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANH07() {
        return anh07;
    }

    /**
     * Sets the value of the anh07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANH07(String value) {
        this.anh07 = value;
    }

    /**
     * Gets the value of the eih07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIH07() {
        return eih07;
    }

    /**
     * Sets the value of the eih07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIH07(String value) {
        this.eih07 = value;
    }

    /**
     * Gets the value of the ope07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPE07() {
        return ope07;
    }

    /**
     * Sets the value of the ope07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPE07(String value) {
        this.ope07 = value;
    }

    /**
     * Gets the value of the lgr08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGR08() {
        return lgr08;
    }

    /**
     * Sets the value of the lgr08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGR08(String value) {
        this.lgr08 = value;
    }

    /**
     * Gets the value of the ber08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBER08() {
        return ber08;
    }

    /**
     * Sets the value of the ber08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBER08(String value) {
        this.ber08 = value;
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
     * Gets the value of the e1Q0560 property.
     * 
     * @return
     *     possible object is
     *     {@link E1Q0560 }
     *     
     */
    public E1Q0560 getE1Q0560() {
        return e1Q0560;
    }

    /**
     * Sets the value of the e1Q0560 property.
     * 
     * @param value
     *     allowed object is
     *     {@link E1Q0560 }
     *     
     */
    public void setE1Q0560(E1Q0560 value) {
        this.e1Q0560 = value;
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
