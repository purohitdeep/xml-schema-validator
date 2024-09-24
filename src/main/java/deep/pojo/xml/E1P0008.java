
package deep.pojo.xml;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element name="TRFAR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TRFGB" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TRFGR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TRFST" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="STVOR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ORZST" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PARTN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
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
 *         &lt;element name="VGLTA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VGLGB" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VGLGR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VGLST" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VGLSV" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BSGRD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DIVGV" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
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
 *         &lt;element name="FALGK" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FALGR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
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
 *         &lt;element name="IND01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
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
 *         &lt;element name="CPIND" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA21" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET21" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ21" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN21" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPK21" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA22" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET22" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ22" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN22" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPK22" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA23" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET23" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ23" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN23" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPK23" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA24" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET24" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ24" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN24" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPK24" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGA25" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BET25" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZ25" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN25" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPK25" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="E1Q0008" maxOccurs="999999" minOccurs="0"&gt;
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
 *                   &lt;element name="LGA26" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BET26" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ANZ26" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="9"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="EIN26" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OPK26" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LGA27" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BET27" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ANZ27" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="9"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="EIN27" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OPK27" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LGA28" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BET28" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ANZ28" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="9"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="EIN28" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OPK28" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LGA29" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BET29" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ANZ29" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="9"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="EIN29" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OPK29" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LGA30" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BET30" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ANZ30" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="9"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="EIN30" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OPK30" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LGA31" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BET31" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ANZ31" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="9"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="EIN31" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OPK31" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LGA32" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BET32" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ANZ32" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="9"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="EIN32" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OPK32" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LGA33" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BET33" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ANZ33" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="9"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="EIN33" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OPK33" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LGA34" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BET34" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ANZ34" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="9"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="EIN34" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OPK34" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LGA35" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BET35" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ANZ35" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="9"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="EIN35" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OPK35" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LGA36" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BET36" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ANZ36" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="9"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="EIN36" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OPK36" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LGA37" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BET37" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ANZ37" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="9"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="EIN37" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OPK37" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LGA38" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BET38" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ANZ38" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="9"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="EIN38" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OPK38" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LGA39" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BET39" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ANZ39" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="9"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="EIN39" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OPK39" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LGA40" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BET40" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ANZ40" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="9"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="EIN40" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OPK40" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IND21" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IND22" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IND23" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IND24" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IND25" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IND26" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IND27" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IND28" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IND29" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IND30" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IND31" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IND32" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IND33" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IND34" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IND35" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IND36" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IND37" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IND38" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IND39" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IND40" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FLAGA" minOccurs="0"&gt;
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
    "trfar",
    "trfgb",
    "trfgr",
    "trfst",
    "stvor",
    "orzst",
    "partn",
    "waers",
    "vglta",
    "vglgb",
    "vglgr",
    "vglst",
    "vglsv",
    "bsgrd",
    "divgv",
    "ansal",
    "falgk",
    "falgr",
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
    "ind01",
    "ind02",
    "ind03",
    "ind04",
    "ind05",
    "ind06",
    "ind07",
    "ind08",
    "ind09",
    "ind10",
    "ind11",
    "ind12",
    "ind13",
    "ind14",
    "ind15",
    "ind16",
    "ind17",
    "ind18",
    "ind19",
    "ind20",
    "ancur",
    "cpind",
    "lga21",
    "bet21",
    "anz21",
    "ein21",
    "opk21",
    "lga22",
    "bet22",
    "anz22",
    "ein22",
    "opk22",
    "lga23",
    "bet23",
    "anz23",
    "ein23",
    "opk23",
    "lga24",
    "bet24",
    "anz24",
    "ein24",
    "opk24",
    "lga25",
    "bet25",
    "anz25",
    "ein25",
    "opk25",
    "e1Q0008"
})
public class E1P0008 {

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
    @XmlElement(name = "TRFAR")
    protected String trfar;
    @XmlElement(name = "TRFGB")
    protected String trfgb;
    @XmlElement(name = "TRFGR")
    protected String trfgr;
    @XmlElement(name = "TRFST")
    protected String trfst;
    @XmlElement(name = "STVOR")
    protected String stvor;
    @XmlElement(name = "ORZST")
    protected String orzst;
    @XmlElement(name = "PARTN")
    protected String partn;
    @XmlElement(name = "WAERS")
    protected String waers;
    @XmlElement(name = "VGLTA")
    protected String vglta;
    @XmlElement(name = "VGLGB")
    protected String vglgb;
    @XmlElement(name = "VGLGR")
    protected String vglgr;
    @XmlElement(name = "VGLST")
    protected String vglst;
    @XmlElement(name = "VGLSV")
    protected String vglsv;
    @XmlElement(name = "BSGRD")
    protected String bsgrd;
    @XmlElement(name = "DIVGV")
    protected String divgv;
    @XmlElement(name = "ANSAL")
    protected String ansal;
    @XmlElement(name = "FALGK")
    protected String falgk;
    @XmlElement(name = "FALGR")
    protected String falgr;
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
    @XmlElement(name = "IND01")
    protected String ind01;
    @XmlElement(name = "IND02")
    protected String ind02;
    @XmlElement(name = "IND03")
    protected String ind03;
    @XmlElement(name = "IND04")
    protected String ind04;
    @XmlElement(name = "IND05")
    protected String ind05;
    @XmlElement(name = "IND06")
    protected String ind06;
    @XmlElement(name = "IND07")
    protected String ind07;
    @XmlElement(name = "IND08")
    protected String ind08;
    @XmlElement(name = "IND09")
    protected String ind09;
    @XmlElement(name = "IND10")
    protected String ind10;
    @XmlElement(name = "IND11")
    protected String ind11;
    @XmlElement(name = "IND12")
    protected String ind12;
    @XmlElement(name = "IND13")
    protected String ind13;
    @XmlElement(name = "IND14")
    protected String ind14;
    @XmlElement(name = "IND15")
    protected String ind15;
    @XmlElement(name = "IND16")
    protected String ind16;
    @XmlElement(name = "IND17")
    protected String ind17;
    @XmlElement(name = "IND18")
    protected String ind18;
    @XmlElement(name = "IND19")
    protected String ind19;
    @XmlElement(name = "IND20")
    protected String ind20;
    @XmlElement(name = "ANCUR")
    protected String ancur;
    @XmlElement(name = "CPIND")
    protected String cpind;
    @XmlElement(name = "LGA21")
    protected String lga21;
    @XmlElement(name = "BET21")
    protected String bet21;
    @XmlElement(name = "ANZ21")
    protected String anz21;
    @XmlElement(name = "EIN21")
    protected String ein21;
    @XmlElement(name = "OPK21")
    protected String opk21;
    @XmlElement(name = "LGA22")
    protected String lga22;
    @XmlElement(name = "BET22")
    protected String bet22;
    @XmlElement(name = "ANZ22")
    protected String anz22;
    @XmlElement(name = "EIN22")
    protected String ein22;
    @XmlElement(name = "OPK22")
    protected String opk22;
    @XmlElement(name = "LGA23")
    protected String lga23;
    @XmlElement(name = "BET23")
    protected String bet23;
    @XmlElement(name = "ANZ23")
    protected String anz23;
    @XmlElement(name = "EIN23")
    protected String ein23;
    @XmlElement(name = "OPK23")
    protected String opk23;
    @XmlElement(name = "LGA24")
    protected String lga24;
    @XmlElement(name = "BET24")
    protected String bet24;
    @XmlElement(name = "ANZ24")
    protected String anz24;
    @XmlElement(name = "EIN24")
    protected String ein24;
    @XmlElement(name = "OPK24")
    protected String opk24;
    @XmlElement(name = "LGA25")
    protected String lga25;
    @XmlElement(name = "BET25")
    protected String bet25;
    @XmlElement(name = "ANZ25")
    protected String anz25;
    @XmlElement(name = "EIN25")
    protected String ein25;
    @XmlElement(name = "OPK25")
    protected String opk25;
    @XmlElement(name = "E1Q0008")
    protected List<E1Q0008> e1Q0008;
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
     * Gets the value of the trfar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRFAR() {
        return trfar;
    }

    /**
     * Sets the value of the trfar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRFAR(String value) {
        this.trfar = value;
    }

    /**
     * Gets the value of the trfgb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRFGB() {
        return trfgb;
    }

    /**
     * Sets the value of the trfgb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRFGB(String value) {
        this.trfgb = value;
    }

    /**
     * Gets the value of the trfgr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRFGR() {
        return trfgr;
    }

    /**
     * Sets the value of the trfgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRFGR(String value) {
        this.trfgr = value;
    }

    /**
     * Gets the value of the trfst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRFST() {
        return trfst;
    }

    /**
     * Sets the value of the trfst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRFST(String value) {
        this.trfst = value;
    }

    /**
     * Gets the value of the stvor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTVOR() {
        return stvor;
    }

    /**
     * Sets the value of the stvor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTVOR(String value) {
        this.stvor = value;
    }

    /**
     * Gets the value of the orzst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORZST() {
        return orzst;
    }

    /**
     * Sets the value of the orzst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORZST(String value) {
        this.orzst = value;
    }

    /**
     * Gets the value of the partn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARTN() {
        return partn;
    }

    /**
     * Sets the value of the partn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARTN(String value) {
        this.partn = value;
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
     * Gets the value of the vglta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVGLTA() {
        return vglta;
    }

    /**
     * Sets the value of the vglta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVGLTA(String value) {
        this.vglta = value;
    }

    /**
     * Gets the value of the vglgb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVGLGB() {
        return vglgb;
    }

    /**
     * Sets the value of the vglgb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVGLGB(String value) {
        this.vglgb = value;
    }

    /**
     * Gets the value of the vglgr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVGLGR() {
        return vglgr;
    }

    /**
     * Sets the value of the vglgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVGLGR(String value) {
        this.vglgr = value;
    }

    /**
     * Gets the value of the vglst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVGLST() {
        return vglst;
    }

    /**
     * Sets the value of the vglst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVGLST(String value) {
        this.vglst = value;
    }

    /**
     * Gets the value of the vglsv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVGLSV() {
        return vglsv;
    }

    /**
     * Sets the value of the vglsv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVGLSV(String value) {
        this.vglsv = value;
    }

    /**
     * Gets the value of the bsgrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSGRD() {
        return bsgrd;
    }

    /**
     * Sets the value of the bsgrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSGRD(String value) {
        this.bsgrd = value;
    }

    /**
     * Gets the value of the divgv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIVGV() {
        return divgv;
    }

    /**
     * Sets the value of the divgv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIVGV(String value) {
        this.divgv = value;
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
     * Gets the value of the falgk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFALGK() {
        return falgk;
    }

    /**
     * Sets the value of the falgk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFALGK(String value) {
        this.falgk = value;
    }

    /**
     * Gets the value of the falgr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFALGR() {
        return falgr;
    }

    /**
     * Sets the value of the falgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFALGR(String value) {
        this.falgr = value;
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
     * Gets the value of the ind01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND01() {
        return ind01;
    }

    /**
     * Sets the value of the ind01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND01(String value) {
        this.ind01 = value;
    }

    /**
     * Gets the value of the ind02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND02() {
        return ind02;
    }

    /**
     * Sets the value of the ind02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND02(String value) {
        this.ind02 = value;
    }

    /**
     * Gets the value of the ind03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND03() {
        return ind03;
    }

    /**
     * Sets the value of the ind03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND03(String value) {
        this.ind03 = value;
    }

    /**
     * Gets the value of the ind04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND04() {
        return ind04;
    }

    /**
     * Sets the value of the ind04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND04(String value) {
        this.ind04 = value;
    }

    /**
     * Gets the value of the ind05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND05() {
        return ind05;
    }

    /**
     * Sets the value of the ind05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND05(String value) {
        this.ind05 = value;
    }

    /**
     * Gets the value of the ind06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND06() {
        return ind06;
    }

    /**
     * Sets the value of the ind06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND06(String value) {
        this.ind06 = value;
    }

    /**
     * Gets the value of the ind07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND07() {
        return ind07;
    }

    /**
     * Sets the value of the ind07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND07(String value) {
        this.ind07 = value;
    }

    /**
     * Gets the value of the ind08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND08() {
        return ind08;
    }

    /**
     * Sets the value of the ind08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND08(String value) {
        this.ind08 = value;
    }

    /**
     * Gets the value of the ind09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND09() {
        return ind09;
    }

    /**
     * Sets the value of the ind09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND09(String value) {
        this.ind09 = value;
    }

    /**
     * Gets the value of the ind10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND10() {
        return ind10;
    }

    /**
     * Sets the value of the ind10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND10(String value) {
        this.ind10 = value;
    }

    /**
     * Gets the value of the ind11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND11() {
        return ind11;
    }

    /**
     * Sets the value of the ind11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND11(String value) {
        this.ind11 = value;
    }

    /**
     * Gets the value of the ind12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND12() {
        return ind12;
    }

    /**
     * Sets the value of the ind12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND12(String value) {
        this.ind12 = value;
    }

    /**
     * Gets the value of the ind13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND13() {
        return ind13;
    }

    /**
     * Sets the value of the ind13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND13(String value) {
        this.ind13 = value;
    }

    /**
     * Gets the value of the ind14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND14() {
        return ind14;
    }

    /**
     * Sets the value of the ind14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND14(String value) {
        this.ind14 = value;
    }

    /**
     * Gets the value of the ind15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND15() {
        return ind15;
    }

    /**
     * Sets the value of the ind15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND15(String value) {
        this.ind15 = value;
    }

    /**
     * Gets the value of the ind16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND16() {
        return ind16;
    }

    /**
     * Sets the value of the ind16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND16(String value) {
        this.ind16 = value;
    }

    /**
     * Gets the value of the ind17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND17() {
        return ind17;
    }

    /**
     * Sets the value of the ind17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND17(String value) {
        this.ind17 = value;
    }

    /**
     * Gets the value of the ind18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND18() {
        return ind18;
    }

    /**
     * Sets the value of the ind18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND18(String value) {
        this.ind18 = value;
    }

    /**
     * Gets the value of the ind19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND19() {
        return ind19;
    }

    /**
     * Sets the value of the ind19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND19(String value) {
        this.ind19 = value;
    }

    /**
     * Gets the value of the ind20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND20() {
        return ind20;
    }

    /**
     * Sets the value of the ind20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND20(String value) {
        this.ind20 = value;
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
     * Gets the value of the cpind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPIND() {
        return cpind;
    }

    /**
     * Sets the value of the cpind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPIND(String value) {
        this.cpind = value;
    }

    /**
     * Gets the value of the lga21 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA21() {
        return lga21;
    }

    /**
     * Sets the value of the lga21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA21(String value) {
        this.lga21 = value;
    }

    /**
     * Gets the value of the bet21 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET21() {
        return bet21;
    }

    /**
     * Sets the value of the bet21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET21(String value) {
        this.bet21 = value;
    }

    /**
     * Gets the value of the anz21 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ21() {
        return anz21;
    }

    /**
     * Sets the value of the anz21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ21(String value) {
        this.anz21 = value;
    }

    /**
     * Gets the value of the ein21 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN21() {
        return ein21;
    }

    /**
     * Sets the value of the ein21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN21(String value) {
        this.ein21 = value;
    }

    /**
     * Gets the value of the opk21 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPK21() {
        return opk21;
    }

    /**
     * Sets the value of the opk21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPK21(String value) {
        this.opk21 = value;
    }

    /**
     * Gets the value of the lga22 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA22() {
        return lga22;
    }

    /**
     * Sets the value of the lga22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA22(String value) {
        this.lga22 = value;
    }

    /**
     * Gets the value of the bet22 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET22() {
        return bet22;
    }

    /**
     * Sets the value of the bet22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET22(String value) {
        this.bet22 = value;
    }

    /**
     * Gets the value of the anz22 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ22() {
        return anz22;
    }

    /**
     * Sets the value of the anz22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ22(String value) {
        this.anz22 = value;
    }

    /**
     * Gets the value of the ein22 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN22() {
        return ein22;
    }

    /**
     * Sets the value of the ein22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN22(String value) {
        this.ein22 = value;
    }

    /**
     * Gets the value of the opk22 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPK22() {
        return opk22;
    }

    /**
     * Sets the value of the opk22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPK22(String value) {
        this.opk22 = value;
    }

    /**
     * Gets the value of the lga23 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA23() {
        return lga23;
    }

    /**
     * Sets the value of the lga23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA23(String value) {
        this.lga23 = value;
    }

    /**
     * Gets the value of the bet23 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET23() {
        return bet23;
    }

    /**
     * Sets the value of the bet23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET23(String value) {
        this.bet23 = value;
    }

    /**
     * Gets the value of the anz23 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ23() {
        return anz23;
    }

    /**
     * Sets the value of the anz23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ23(String value) {
        this.anz23 = value;
    }

    /**
     * Gets the value of the ein23 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN23() {
        return ein23;
    }

    /**
     * Sets the value of the ein23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN23(String value) {
        this.ein23 = value;
    }

    /**
     * Gets the value of the opk23 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPK23() {
        return opk23;
    }

    /**
     * Sets the value of the opk23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPK23(String value) {
        this.opk23 = value;
    }

    /**
     * Gets the value of the lga24 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA24() {
        return lga24;
    }

    /**
     * Sets the value of the lga24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA24(String value) {
        this.lga24 = value;
    }

    /**
     * Gets the value of the bet24 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET24() {
        return bet24;
    }

    /**
     * Sets the value of the bet24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET24(String value) {
        this.bet24 = value;
    }

    /**
     * Gets the value of the anz24 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ24() {
        return anz24;
    }

    /**
     * Sets the value of the anz24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ24(String value) {
        this.anz24 = value;
    }

    /**
     * Gets the value of the ein24 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN24() {
        return ein24;
    }

    /**
     * Sets the value of the ein24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN24(String value) {
        this.ein24 = value;
    }

    /**
     * Gets the value of the opk24 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPK24() {
        return opk24;
    }

    /**
     * Sets the value of the opk24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPK24(String value) {
        this.opk24 = value;
    }

    /**
     * Gets the value of the lga25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGA25() {
        return lga25;
    }

    /**
     * Sets the value of the lga25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGA25(String value) {
        this.lga25 = value;
    }

    /**
     * Gets the value of the bet25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBET25() {
        return bet25;
    }

    /**
     * Sets the value of the bet25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBET25(String value) {
        this.bet25 = value;
    }

    /**
     * Gets the value of the anz25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZ25() {
        return anz25;
    }

    /**
     * Sets the value of the anz25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZ25(String value) {
        this.anz25 = value;
    }

    /**
     * Gets the value of the ein25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN25() {
        return ein25;
    }

    /**
     * Sets the value of the ein25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN25(String value) {
        this.ein25 = value;
    }

    /**
     * Gets the value of the opk25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPK25() {
        return opk25;
    }

    /**
     * Sets the value of the opk25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPK25(String value) {
        this.opk25 = value;
    }

    /**
     * Gets the value of the e1Q0008 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1Q0008 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1Q0008().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link E1Q0008 }
     * 
     * 
     */
    public List<E1Q0008> getE1Q0008() {
        if (e1Q0008 == null) {
            e1Q0008 = new ArrayList<E1Q0008>();
        }
        return this.e1Q0008;
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
