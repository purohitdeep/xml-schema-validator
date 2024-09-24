
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
 *               &lt;maxLength value="11"/&gt;
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
 *               &lt;maxLength value="11"/&gt;
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
 *               &lt;maxLength value="11"/&gt;
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
 *               &lt;maxLength value="11"/&gt;
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
 *               &lt;maxLength value="11"/&gt;
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
 *               &lt;maxLength value="11"/&gt;
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
 *               &lt;maxLength value="11"/&gt;
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
 *               &lt;maxLength value="11"/&gt;
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
 *               &lt;maxLength value="11"/&gt;
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
 *               &lt;maxLength value="11"/&gt;
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
 *               &lt;maxLength value="11"/&gt;
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
 *               &lt;maxLength value="11"/&gt;
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
 *               &lt;maxLength value="11"/&gt;
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
 *               &lt;maxLength value="11"/&gt;
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
 *               &lt;maxLength value="11"/&gt;
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
 *               &lt;maxLength value="11"/&gt;
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
 *               &lt;maxLength value="11"/&gt;
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
 *               &lt;maxLength value="11"/&gt;
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
 *               &lt;maxLength value="11"/&gt;
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
 *               &lt;maxLength value="11"/&gt;
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
 *         &lt;element name="AQUDT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HSDED" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCC01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCT01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CPR01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CNF01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCC02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCT02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CPR02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CNF02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCC03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCT03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CPR03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CNF03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCC04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCT04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CPR04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CNF04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCC05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCT05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CPR05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CNF05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CLTOT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PCC01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PCT01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PPR01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PNF01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSD01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PCC02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PCT02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PPR02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PNF02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSD02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PCC03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PCT03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PPR03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PNF03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSD03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PCC04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PCT04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PPR04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PNF04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSD04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PCC05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PCT05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PPR05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PNF05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LCT02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PSD05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LPR02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PPTOT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LNF02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LCC03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LCC01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LCT03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LCT01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LPR03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LPR01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LNF03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LNF01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LCC04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LCC02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LCT04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LPR04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LNF04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LCC05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LCT05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LPR05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LNF05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LATOT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SCC01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SCT01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SPR01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SNF01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SCC02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SCT02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SPR02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SNF02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SCC03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="E1Q0146" minOccurs="0"&gt;
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
 *                   &lt;element name="SCT03" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SPR03" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SNF03" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="9"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SCC04" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SCT04" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SPR04" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SNF04" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="9"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SCC05" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SCT05" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SPR05" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SNF05" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="9"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SATOT" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SPIID" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SPINC" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="WAERS" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="5"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CCN01" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CCN02" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CCN03" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CCN04" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CCN05" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CCN06" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CCN07" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CCN08" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CCN09" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CCN10" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CCN11" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CCN12" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CCN13" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CCN14" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CCN15" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CCC06" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CCC07" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CCC08" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CCC09" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CCC10" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CCC11" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CCC12" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CCC13" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CCC14" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CCC15" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CCT06" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CCT07" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CCT08" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CCT09" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CCT10" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CCT11" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CCT12" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CCT13" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CCT14" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CCT15" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CPR06" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CPR07" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CPR08" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CPR09" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CPR10" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CPR11" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CPR12" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CPR13" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CPR14" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CPR15" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CNF06" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="9"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CNF07" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="9"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CNF08" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="9"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CNF09" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="9"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CNF10" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="9"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CNF11" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="9"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CNF12" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="9"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CNF13" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="9"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CNF14" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="9"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CNF15" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="9"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PCN01" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PCN02" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PCN03" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PCN04" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PCN05" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LCN01" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LCN02" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LCN03" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LCN04" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LCN05" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LRM01" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LRM02" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LRM03" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LRM04" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LRM05" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SCN01" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SCN02" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SCN03" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SCN04" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SCN05" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SRM01" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SRM02" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SRM03" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SRM04" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SRM05" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
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
 *                   &lt;element name="CTP01" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CTP02" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CTP03" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CTP04" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CTP05" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CTP06" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CTP07" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CTP08" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CTP09" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CTP10" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CTP11" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CTP12" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CTP13" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CTP14" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CTP15" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PTP01" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PTP02" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PTP03" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PTP04" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PTP05" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NLTOT" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NPTOT" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NCC01" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NCT01" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NPR01" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NCN01" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NNF01" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="9"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NCC02" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NCT02" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NPR02" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NCN02" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NNF02" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="9"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NCC03" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NCT03" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NPR03" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NCN03" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NNF03" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="9"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NCC04" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NCT04" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NPR04" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NCN04" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="18"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NCC05" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NCT05" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NPR05" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
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
    "aqudt",
    "hsded",
    "ccc01",
    "cct01",
    "cpr01",
    "cnf01",
    "ccc02",
    "cct02",
    "cpr02",
    "cnf02",
    "ccc03",
    "cct03",
    "cpr03",
    "cnf03",
    "ccc04",
    "cct04",
    "cpr04",
    "cnf04",
    "ccc05",
    "cct05",
    "cpr05",
    "cnf05",
    "cltot",
    "pcc01",
    "pct01",
    "ppr01",
    "pnf01",
    "psd01",
    "pcc02",
    "pct02",
    "ppr02",
    "pnf02",
    "psd02",
    "pcc03",
    "pct03",
    "ppr03",
    "pnf03",
    "psd03",
    "pcc04",
    "pct04",
    "ppr04",
    "pnf04",
    "psd04",
    "pcc05",
    "pct05",
    "ppr05",
    "pnf05",
    "lct02",
    "psd05",
    "lpr02",
    "pptot",
    "lnf02",
    "lcc03",
    "lcc01",
    "lct03",
    "lct01",
    "lpr03",
    "lpr01",
    "lnf03",
    "lnf01",
    "lcc04",
    "lcc02",
    "lct04",
    "lpr04",
    "lnf04",
    "lcc05",
    "lct05",
    "lpr05",
    "lnf05",
    "latot",
    "scc01",
    "sct01",
    "spr01",
    "snf01",
    "scc02",
    "sct02",
    "spr02",
    "snf02",
    "scc03",
    "e1Q0146"
})
public class E1P0146 {

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
    @XmlElement(name = "AQUDT")
    protected String aqudt;
    @XmlElement(name = "HSDED")
    protected String hsded;
    @XmlElement(name = "CCC01")
    protected String ccc01;
    @XmlElement(name = "CCT01")
    protected String cct01;
    @XmlElement(name = "CPR01")
    protected String cpr01;
    @XmlElement(name = "CNF01")
    protected String cnf01;
    @XmlElement(name = "CCC02")
    protected String ccc02;
    @XmlElement(name = "CCT02")
    protected String cct02;
    @XmlElement(name = "CPR02")
    protected String cpr02;
    @XmlElement(name = "CNF02")
    protected String cnf02;
    @XmlElement(name = "CCC03")
    protected String ccc03;
    @XmlElement(name = "CCT03")
    protected String cct03;
    @XmlElement(name = "CPR03")
    protected String cpr03;
    @XmlElement(name = "CNF03")
    protected String cnf03;
    @XmlElement(name = "CCC04")
    protected String ccc04;
    @XmlElement(name = "CCT04")
    protected String cct04;
    @XmlElement(name = "CPR04")
    protected String cpr04;
    @XmlElement(name = "CNF04")
    protected String cnf04;
    @XmlElement(name = "CCC05")
    protected String ccc05;
    @XmlElement(name = "CCT05")
    protected String cct05;
    @XmlElement(name = "CPR05")
    protected String cpr05;
    @XmlElement(name = "CNF05")
    protected String cnf05;
    @XmlElement(name = "CLTOT")
    protected String cltot;
    @XmlElement(name = "PCC01")
    protected String pcc01;
    @XmlElement(name = "PCT01")
    protected String pct01;
    @XmlElement(name = "PPR01")
    protected String ppr01;
    @XmlElement(name = "PNF01")
    protected String pnf01;
    @XmlElement(name = "PSD01")
    protected String psd01;
    @XmlElement(name = "PCC02")
    protected String pcc02;
    @XmlElement(name = "PCT02")
    protected String pct02;
    @XmlElement(name = "PPR02")
    protected String ppr02;
    @XmlElement(name = "PNF02")
    protected String pnf02;
    @XmlElement(name = "PSD02")
    protected String psd02;
    @XmlElement(name = "PCC03")
    protected String pcc03;
    @XmlElement(name = "PCT03")
    protected String pct03;
    @XmlElement(name = "PPR03")
    protected String ppr03;
    @XmlElement(name = "PNF03")
    protected String pnf03;
    @XmlElement(name = "PSD03")
    protected String psd03;
    @XmlElement(name = "PCC04")
    protected String pcc04;
    @XmlElement(name = "PCT04")
    protected String pct04;
    @XmlElement(name = "PPR04")
    protected String ppr04;
    @XmlElement(name = "PNF04")
    protected String pnf04;
    @XmlElement(name = "PSD04")
    protected String psd04;
    @XmlElement(name = "PCC05")
    protected String pcc05;
    @XmlElement(name = "PCT05")
    protected String pct05;
    @XmlElement(name = "PPR05")
    protected String ppr05;
    @XmlElement(name = "PNF05")
    protected String pnf05;
    @XmlElement(name = "LCT02")
    protected String lct02;
    @XmlElement(name = "PSD05")
    protected String psd05;
    @XmlElement(name = "LPR02")
    protected String lpr02;
    @XmlElement(name = "PPTOT")
    protected String pptot;
    @XmlElement(name = "LNF02")
    protected String lnf02;
    @XmlElement(name = "LCC03")
    protected String lcc03;
    @XmlElement(name = "LCC01")
    protected String lcc01;
    @XmlElement(name = "LCT03")
    protected String lct03;
    @XmlElement(name = "LCT01")
    protected String lct01;
    @XmlElement(name = "LPR03")
    protected String lpr03;
    @XmlElement(name = "LPR01")
    protected String lpr01;
    @XmlElement(name = "LNF03")
    protected String lnf03;
    @XmlElement(name = "LNF01")
    protected String lnf01;
    @XmlElement(name = "LCC04")
    protected String lcc04;
    @XmlElement(name = "LCC02")
    protected String lcc02;
    @XmlElement(name = "LCT04")
    protected String lct04;
    @XmlElement(name = "LPR04")
    protected String lpr04;
    @XmlElement(name = "LNF04")
    protected String lnf04;
    @XmlElement(name = "LCC05")
    protected String lcc05;
    @XmlElement(name = "LCT05")
    protected String lct05;
    @XmlElement(name = "LPR05")
    protected String lpr05;
    @XmlElement(name = "LNF05")
    protected String lnf05;
    @XmlElement(name = "LATOT")
    protected String latot;
    @XmlElement(name = "SCC01")
    protected String scc01;
    @XmlElement(name = "SCT01")
    protected String sct01;
    @XmlElement(name = "SPR01")
    protected String spr01;
    @XmlElement(name = "SNF01")
    protected String snf01;
    @XmlElement(name = "SCC02")
    protected String scc02;
    @XmlElement(name = "SCT02")
    protected String sct02;
    @XmlElement(name = "SPR02")
    protected String spr02;
    @XmlElement(name = "SNF02")
    protected String snf02;
    @XmlElement(name = "SCC03")
    protected String scc03;
    @XmlElement(name = "E1Q0146")
    protected E1Q0146 e1Q0146;
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
     * Gets the value of the aqudt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAQUDT() {
        return aqudt;
    }

    /**
     * Sets the value of the aqudt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAQUDT(String value) {
        this.aqudt = value;
    }

    /**
     * Gets the value of the hsded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHSDED() {
        return hsded;
    }

    /**
     * Sets the value of the hsded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHSDED(String value) {
        this.hsded = value;
    }

    /**
     * Gets the value of the ccc01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCC01() {
        return ccc01;
    }

    /**
     * Sets the value of the ccc01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCC01(String value) {
        this.ccc01 = value;
    }

    /**
     * Gets the value of the cct01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCT01() {
        return cct01;
    }

    /**
     * Sets the value of the cct01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCT01(String value) {
        this.cct01 = value;
    }

    /**
     * Gets the value of the cpr01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPR01() {
        return cpr01;
    }

    /**
     * Sets the value of the cpr01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPR01(String value) {
        this.cpr01 = value;
    }

    /**
     * Gets the value of the cnf01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNF01() {
        return cnf01;
    }

    /**
     * Sets the value of the cnf01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNF01(String value) {
        this.cnf01 = value;
    }

    /**
     * Gets the value of the ccc02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCC02() {
        return ccc02;
    }

    /**
     * Sets the value of the ccc02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCC02(String value) {
        this.ccc02 = value;
    }

    /**
     * Gets the value of the cct02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCT02() {
        return cct02;
    }

    /**
     * Sets the value of the cct02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCT02(String value) {
        this.cct02 = value;
    }

    /**
     * Gets the value of the cpr02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPR02() {
        return cpr02;
    }

    /**
     * Sets the value of the cpr02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPR02(String value) {
        this.cpr02 = value;
    }

    /**
     * Gets the value of the cnf02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNF02() {
        return cnf02;
    }

    /**
     * Sets the value of the cnf02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNF02(String value) {
        this.cnf02 = value;
    }

    /**
     * Gets the value of the ccc03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCC03() {
        return ccc03;
    }

    /**
     * Sets the value of the ccc03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCC03(String value) {
        this.ccc03 = value;
    }

    /**
     * Gets the value of the cct03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCT03() {
        return cct03;
    }

    /**
     * Sets the value of the cct03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCT03(String value) {
        this.cct03 = value;
    }

    /**
     * Gets the value of the cpr03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPR03() {
        return cpr03;
    }

    /**
     * Sets the value of the cpr03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPR03(String value) {
        this.cpr03 = value;
    }

    /**
     * Gets the value of the cnf03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNF03() {
        return cnf03;
    }

    /**
     * Sets the value of the cnf03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNF03(String value) {
        this.cnf03 = value;
    }

    /**
     * Gets the value of the ccc04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCC04() {
        return ccc04;
    }

    /**
     * Sets the value of the ccc04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCC04(String value) {
        this.ccc04 = value;
    }

    /**
     * Gets the value of the cct04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCT04() {
        return cct04;
    }

    /**
     * Sets the value of the cct04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCT04(String value) {
        this.cct04 = value;
    }

    /**
     * Gets the value of the cpr04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPR04() {
        return cpr04;
    }

    /**
     * Sets the value of the cpr04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPR04(String value) {
        this.cpr04 = value;
    }

    /**
     * Gets the value of the cnf04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNF04() {
        return cnf04;
    }

    /**
     * Sets the value of the cnf04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNF04(String value) {
        this.cnf04 = value;
    }

    /**
     * Gets the value of the ccc05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCC05() {
        return ccc05;
    }

    /**
     * Sets the value of the ccc05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCC05(String value) {
        this.ccc05 = value;
    }

    /**
     * Gets the value of the cct05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCT05() {
        return cct05;
    }

    /**
     * Sets the value of the cct05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCT05(String value) {
        this.cct05 = value;
    }

    /**
     * Gets the value of the cpr05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPR05() {
        return cpr05;
    }

    /**
     * Sets the value of the cpr05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPR05(String value) {
        this.cpr05 = value;
    }

    /**
     * Gets the value of the cnf05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNF05() {
        return cnf05;
    }

    /**
     * Sets the value of the cnf05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNF05(String value) {
        this.cnf05 = value;
    }

    /**
     * Gets the value of the cltot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLTOT() {
        return cltot;
    }

    /**
     * Sets the value of the cltot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLTOT(String value) {
        this.cltot = value;
    }

    /**
     * Gets the value of the pcc01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCC01() {
        return pcc01;
    }

    /**
     * Sets the value of the pcc01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCC01(String value) {
        this.pcc01 = value;
    }

    /**
     * Gets the value of the pct01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCT01() {
        return pct01;
    }

    /**
     * Sets the value of the pct01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCT01(String value) {
        this.pct01 = value;
    }

    /**
     * Gets the value of the ppr01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPR01() {
        return ppr01;
    }

    /**
     * Sets the value of the ppr01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPR01(String value) {
        this.ppr01 = value;
    }

    /**
     * Gets the value of the pnf01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNF01() {
        return pnf01;
    }

    /**
     * Sets the value of the pnf01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNF01(String value) {
        this.pnf01 = value;
    }

    /**
     * Gets the value of the psd01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSD01() {
        return psd01;
    }

    /**
     * Sets the value of the psd01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSD01(String value) {
        this.psd01 = value;
    }

    /**
     * Gets the value of the pcc02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCC02() {
        return pcc02;
    }

    /**
     * Sets the value of the pcc02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCC02(String value) {
        this.pcc02 = value;
    }

    /**
     * Gets the value of the pct02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCT02() {
        return pct02;
    }

    /**
     * Sets the value of the pct02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCT02(String value) {
        this.pct02 = value;
    }

    /**
     * Gets the value of the ppr02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPR02() {
        return ppr02;
    }

    /**
     * Sets the value of the ppr02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPR02(String value) {
        this.ppr02 = value;
    }

    /**
     * Gets the value of the pnf02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNF02() {
        return pnf02;
    }

    /**
     * Sets the value of the pnf02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNF02(String value) {
        this.pnf02 = value;
    }

    /**
     * Gets the value of the psd02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSD02() {
        return psd02;
    }

    /**
     * Sets the value of the psd02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSD02(String value) {
        this.psd02 = value;
    }

    /**
     * Gets the value of the pcc03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCC03() {
        return pcc03;
    }

    /**
     * Sets the value of the pcc03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCC03(String value) {
        this.pcc03 = value;
    }

    /**
     * Gets the value of the pct03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCT03() {
        return pct03;
    }

    /**
     * Sets the value of the pct03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCT03(String value) {
        this.pct03 = value;
    }

    /**
     * Gets the value of the ppr03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPR03() {
        return ppr03;
    }

    /**
     * Sets the value of the ppr03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPR03(String value) {
        this.ppr03 = value;
    }

    /**
     * Gets the value of the pnf03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNF03() {
        return pnf03;
    }

    /**
     * Sets the value of the pnf03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNF03(String value) {
        this.pnf03 = value;
    }

    /**
     * Gets the value of the psd03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSD03() {
        return psd03;
    }

    /**
     * Sets the value of the psd03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSD03(String value) {
        this.psd03 = value;
    }

    /**
     * Gets the value of the pcc04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCC04() {
        return pcc04;
    }

    /**
     * Sets the value of the pcc04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCC04(String value) {
        this.pcc04 = value;
    }

    /**
     * Gets the value of the pct04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCT04() {
        return pct04;
    }

    /**
     * Sets the value of the pct04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCT04(String value) {
        this.pct04 = value;
    }

    /**
     * Gets the value of the ppr04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPR04() {
        return ppr04;
    }

    /**
     * Sets the value of the ppr04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPR04(String value) {
        this.ppr04 = value;
    }

    /**
     * Gets the value of the pnf04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNF04() {
        return pnf04;
    }

    /**
     * Sets the value of the pnf04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNF04(String value) {
        this.pnf04 = value;
    }

    /**
     * Gets the value of the psd04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSD04() {
        return psd04;
    }

    /**
     * Sets the value of the psd04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSD04(String value) {
        this.psd04 = value;
    }

    /**
     * Gets the value of the pcc05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCC05() {
        return pcc05;
    }

    /**
     * Sets the value of the pcc05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCC05(String value) {
        this.pcc05 = value;
    }

    /**
     * Gets the value of the pct05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCT05() {
        return pct05;
    }

    /**
     * Sets the value of the pct05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCT05(String value) {
        this.pct05 = value;
    }

    /**
     * Gets the value of the ppr05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPR05() {
        return ppr05;
    }

    /**
     * Sets the value of the ppr05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPR05(String value) {
        this.ppr05 = value;
    }

    /**
     * Gets the value of the pnf05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNF05() {
        return pnf05;
    }

    /**
     * Sets the value of the pnf05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNF05(String value) {
        this.pnf05 = value;
    }

    /**
     * Gets the value of the lct02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLCT02() {
        return lct02;
    }

    /**
     * Sets the value of the lct02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLCT02(String value) {
        this.lct02 = value;
    }

    /**
     * Gets the value of the psd05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSD05() {
        return psd05;
    }

    /**
     * Sets the value of the psd05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSD05(String value) {
        this.psd05 = value;
    }

    /**
     * Gets the value of the lpr02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLPR02() {
        return lpr02;
    }

    /**
     * Sets the value of the lpr02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLPR02(String value) {
        this.lpr02 = value;
    }

    /**
     * Gets the value of the pptot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPTOT() {
        return pptot;
    }

    /**
     * Sets the value of the pptot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPTOT(String value) {
        this.pptot = value;
    }

    /**
     * Gets the value of the lnf02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLNF02() {
        return lnf02;
    }

    /**
     * Sets the value of the lnf02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLNF02(String value) {
        this.lnf02 = value;
    }

    /**
     * Gets the value of the lcc03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLCC03() {
        return lcc03;
    }

    /**
     * Sets the value of the lcc03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLCC03(String value) {
        this.lcc03 = value;
    }

    /**
     * Gets the value of the lcc01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLCC01() {
        return lcc01;
    }

    /**
     * Sets the value of the lcc01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLCC01(String value) {
        this.lcc01 = value;
    }

    /**
     * Gets the value of the lct03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLCT03() {
        return lct03;
    }

    /**
     * Sets the value of the lct03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLCT03(String value) {
        this.lct03 = value;
    }

    /**
     * Gets the value of the lct01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLCT01() {
        return lct01;
    }

    /**
     * Sets the value of the lct01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLCT01(String value) {
        this.lct01 = value;
    }

    /**
     * Gets the value of the lpr03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLPR03() {
        return lpr03;
    }

    /**
     * Sets the value of the lpr03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLPR03(String value) {
        this.lpr03 = value;
    }

    /**
     * Gets the value of the lpr01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLPR01() {
        return lpr01;
    }

    /**
     * Sets the value of the lpr01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLPR01(String value) {
        this.lpr01 = value;
    }

    /**
     * Gets the value of the lnf03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLNF03() {
        return lnf03;
    }

    /**
     * Sets the value of the lnf03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLNF03(String value) {
        this.lnf03 = value;
    }

    /**
     * Gets the value of the lnf01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLNF01() {
        return lnf01;
    }

    /**
     * Sets the value of the lnf01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLNF01(String value) {
        this.lnf01 = value;
    }

    /**
     * Gets the value of the lcc04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLCC04() {
        return lcc04;
    }

    /**
     * Sets the value of the lcc04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLCC04(String value) {
        this.lcc04 = value;
    }

    /**
     * Gets the value of the lcc02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLCC02() {
        return lcc02;
    }

    /**
     * Sets the value of the lcc02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLCC02(String value) {
        this.lcc02 = value;
    }

    /**
     * Gets the value of the lct04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLCT04() {
        return lct04;
    }

    /**
     * Sets the value of the lct04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLCT04(String value) {
        this.lct04 = value;
    }

    /**
     * Gets the value of the lpr04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLPR04() {
        return lpr04;
    }

    /**
     * Sets the value of the lpr04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLPR04(String value) {
        this.lpr04 = value;
    }

    /**
     * Gets the value of the lnf04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLNF04() {
        return lnf04;
    }

    /**
     * Sets the value of the lnf04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLNF04(String value) {
        this.lnf04 = value;
    }

    /**
     * Gets the value of the lcc05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLCC05() {
        return lcc05;
    }

    /**
     * Sets the value of the lcc05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLCC05(String value) {
        this.lcc05 = value;
    }

    /**
     * Gets the value of the lct05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLCT05() {
        return lct05;
    }

    /**
     * Sets the value of the lct05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLCT05(String value) {
        this.lct05 = value;
    }

    /**
     * Gets the value of the lpr05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLPR05() {
        return lpr05;
    }

    /**
     * Sets the value of the lpr05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLPR05(String value) {
        this.lpr05 = value;
    }

    /**
     * Gets the value of the lnf05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLNF05() {
        return lnf05;
    }

    /**
     * Sets the value of the lnf05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLNF05(String value) {
        this.lnf05 = value;
    }

    /**
     * Gets the value of the latot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLATOT() {
        return latot;
    }

    /**
     * Sets the value of the latot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLATOT(String value) {
        this.latot = value;
    }

    /**
     * Gets the value of the scc01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCC01() {
        return scc01;
    }

    /**
     * Sets the value of the scc01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCC01(String value) {
        this.scc01 = value;
    }

    /**
     * Gets the value of the sct01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCT01() {
        return sct01;
    }

    /**
     * Sets the value of the sct01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCT01(String value) {
        this.sct01 = value;
    }

    /**
     * Gets the value of the spr01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPR01() {
        return spr01;
    }

    /**
     * Sets the value of the spr01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPR01(String value) {
        this.spr01 = value;
    }

    /**
     * Gets the value of the snf01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNF01() {
        return snf01;
    }

    /**
     * Sets the value of the snf01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNF01(String value) {
        this.snf01 = value;
    }

    /**
     * Gets the value of the scc02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCC02() {
        return scc02;
    }

    /**
     * Sets the value of the scc02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCC02(String value) {
        this.scc02 = value;
    }

    /**
     * Gets the value of the sct02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCT02() {
        return sct02;
    }

    /**
     * Sets the value of the sct02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCT02(String value) {
        this.sct02 = value;
    }

    /**
     * Gets the value of the spr02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPR02() {
        return spr02;
    }

    /**
     * Sets the value of the spr02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPR02(String value) {
        this.spr02 = value;
    }

    /**
     * Gets the value of the snf02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNF02() {
        return snf02;
    }

    /**
     * Sets the value of the snf02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNF02(String value) {
        this.snf02 = value;
    }

    /**
     * Gets the value of the scc03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCC03() {
        return scc03;
    }

    /**
     * Sets the value of the scc03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCC03(String value) {
        this.scc03 = value;
    }

    /**
     * Gets the value of the e1Q0146 property.
     * 
     * @return
     *     possible object is
     *     {@link E1Q0146 }
     *     
     */
    public E1Q0146 getE1Q0146() {
        return e1Q0146;
    }

    /**
     * Sets the value of the e1Q0146 property.
     * 
     * @param value
     *     allowed object is
     *     {@link E1Q0146 }
     *     
     */
    public void setE1Q0146(E1Q0146 value) {
        this.e1Q0146 = value;
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
