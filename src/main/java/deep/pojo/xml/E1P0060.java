
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
 *         &lt;element name="SOFIN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KDLHF" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BGLST" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TABEL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TIJDV" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TARGR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INKKD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JAARL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JRLOT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BYZTR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MACHT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BEPBT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BAFTD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BAFTB" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BTARD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BTART" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BLTBD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SPEC1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SPEC2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SPEC3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SPEC4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SPEC5" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AUSNA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GEMBZ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ONKST" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ATRFG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AKLHF" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CDFIS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CDVDR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OTHOG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AFBBT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VERSI" minOccurs="0"&gt;
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
 *         &lt;element name="PWNBD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NOTHK" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NWRKB" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ED30P" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AL30P" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CH30P" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INDTI" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BEGTI" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RETDA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FISCO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AL30P2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
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
    "sofin",
    "kdlhf",
    "bglst",
    "tabel",
    "tijdv",
    "targr",
    "inkkd",
    "jaarl",
    "jrlot",
    "byztr",
    "macht",
    "bepbt",
    "baftd",
    "baftb",
    "btard",
    "btart",
    "bltbd",
    "spec1",
    "spec2",
    "spec3",
    "spec4",
    "spec5",
    "ausna",
    "gembz",
    "onkst",
    "atrfg",
    "aklhf",
    "cdfis",
    "cdvdr",
    "othog",
    "afbbt",
    "versi",
    "grpvl",
    "pwnbd",
    "nothk",
    "nwrkb",
    "ed30P",
    "al30P",
    "ch30P",
    "indti",
    "begti",
    "retda",
    "fisco",
    "al30P2"
})
public class E1P0060 {

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
    @XmlElement(name = "SOFIN")
    protected String sofin;
    @XmlElement(name = "KDLHF")
    protected String kdlhf;
    @XmlElement(name = "BGLST")
    protected String bglst;
    @XmlElement(name = "TABEL")
    protected String tabel;
    @XmlElement(name = "TIJDV")
    protected String tijdv;
    @XmlElement(name = "TARGR")
    protected String targr;
    @XmlElement(name = "INKKD")
    protected String inkkd;
    @XmlElement(name = "JAARL")
    protected String jaarl;
    @XmlElement(name = "JRLOT")
    protected String jrlot;
    @XmlElement(name = "BYZTR")
    protected String byztr;
    @XmlElement(name = "MACHT")
    protected String macht;
    @XmlElement(name = "BEPBT")
    protected String bepbt;
    @XmlElement(name = "BAFTD")
    protected String baftd;
    @XmlElement(name = "BAFTB")
    protected String baftb;
    @XmlElement(name = "BTARD")
    protected String btard;
    @XmlElement(name = "BTART")
    protected String btart;
    @XmlElement(name = "BLTBD")
    protected String bltbd;
    @XmlElement(name = "SPEC1")
    protected String spec1;
    @XmlElement(name = "SPEC2")
    protected String spec2;
    @XmlElement(name = "SPEC3")
    protected String spec3;
    @XmlElement(name = "SPEC4")
    protected String spec4;
    @XmlElement(name = "SPEC5")
    protected String spec5;
    @XmlElement(name = "AUSNA")
    protected String ausna;
    @XmlElement(name = "GEMBZ")
    protected String gembz;
    @XmlElement(name = "ONKST")
    protected String onkst;
    @XmlElement(name = "ATRFG")
    protected String atrfg;
    @XmlElement(name = "AKLHF")
    protected String aklhf;
    @XmlElement(name = "CDFIS")
    protected String cdfis;
    @XmlElement(name = "CDVDR")
    protected String cdvdr;
    @XmlElement(name = "OTHOG")
    protected String othog;
    @XmlElement(name = "AFBBT")
    protected String afbbt;
    @XmlElement(name = "VERSI")
    protected String versi;
    @XmlElement(name = "GRPVL")
    protected String grpvl;
    @XmlElement(name = "PWNBD")
    protected String pwnbd;
    @XmlElement(name = "NOTHK")
    protected String nothk;
    @XmlElement(name = "NWRKB")
    protected String nwrkb;
    @XmlElement(name = "ED30P")
    protected String ed30P;
    @XmlElement(name = "AL30P")
    protected String al30P;
    @XmlElement(name = "CH30P")
    protected String ch30P;
    @XmlElement(name = "INDTI")
    protected String indti;
    @XmlElement(name = "BEGTI")
    protected String begti;
    @XmlElement(name = "RETDA")
    protected String retda;
    @XmlElement(name = "FISCO")
    protected String fisco;
    @XmlElement(name = "AL30P2")
    protected String al30P2;
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
     * Gets the value of the sofin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOFIN() {
        return sofin;
    }

    /**
     * Sets the value of the sofin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOFIN(String value) {
        this.sofin = value;
    }

    /**
     * Gets the value of the kdlhf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDLHF() {
        return kdlhf;
    }

    /**
     * Sets the value of the kdlhf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDLHF(String value) {
        this.kdlhf = value;
    }

    /**
     * Gets the value of the bglst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBGLST() {
        return bglst;
    }

    /**
     * Sets the value of the bglst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBGLST(String value) {
        this.bglst = value;
    }

    /**
     * Gets the value of the tabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTABEL() {
        return tabel;
    }

    /**
     * Sets the value of the tabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTABEL(String value) {
        this.tabel = value;
    }

    /**
     * Gets the value of the tijdv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIJDV() {
        return tijdv;
    }

    /**
     * Sets the value of the tijdv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIJDV(String value) {
        this.tijdv = value;
    }

    /**
     * Gets the value of the targr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTARGR() {
        return targr;
    }

    /**
     * Sets the value of the targr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTARGR(String value) {
        this.targr = value;
    }

    /**
     * Gets the value of the inkkd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINKKD() {
        return inkkd;
    }

    /**
     * Sets the value of the inkkd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINKKD(String value) {
        this.inkkd = value;
    }

    /**
     * Gets the value of the jaarl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJAARL() {
        return jaarl;
    }

    /**
     * Sets the value of the jaarl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJAARL(String value) {
        this.jaarl = value;
    }

    /**
     * Gets the value of the jrlot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJRLOT() {
        return jrlot;
    }

    /**
     * Sets the value of the jrlot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJRLOT(String value) {
        this.jrlot = value;
    }

    /**
     * Gets the value of the byztr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBYZTR() {
        return byztr;
    }

    /**
     * Sets the value of the byztr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBYZTR(String value) {
        this.byztr = value;
    }

    /**
     * Gets the value of the macht property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMACHT() {
        return macht;
    }

    /**
     * Sets the value of the macht property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMACHT(String value) {
        this.macht = value;
    }

    /**
     * Gets the value of the bepbt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEPBT() {
        return bepbt;
    }

    /**
     * Sets the value of the bepbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBEPBT(String value) {
        this.bepbt = value;
    }

    /**
     * Gets the value of the baftd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBAFTD() {
        return baftd;
    }

    /**
     * Sets the value of the baftd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBAFTD(String value) {
        this.baftd = value;
    }

    /**
     * Gets the value of the baftb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBAFTB() {
        return baftb;
    }

    /**
     * Sets the value of the baftb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBAFTB(String value) {
        this.baftb = value;
    }

    /**
     * Gets the value of the btard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBTARD() {
        return btard;
    }

    /**
     * Sets the value of the btard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBTARD(String value) {
        this.btard = value;
    }

    /**
     * Gets the value of the btart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBTART() {
        return btart;
    }

    /**
     * Sets the value of the btart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBTART(String value) {
        this.btart = value;
    }

    /**
     * Gets the value of the bltbd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBLTBD() {
        return bltbd;
    }

    /**
     * Sets the value of the bltbd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBLTBD(String value) {
        this.bltbd = value;
    }

    /**
     * Gets the value of the spec1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPEC1() {
        return spec1;
    }

    /**
     * Sets the value of the spec1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPEC1(String value) {
        this.spec1 = value;
    }

    /**
     * Gets the value of the spec2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPEC2() {
        return spec2;
    }

    /**
     * Sets the value of the spec2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPEC2(String value) {
        this.spec2 = value;
    }

    /**
     * Gets the value of the spec3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPEC3() {
        return spec3;
    }

    /**
     * Sets the value of the spec3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPEC3(String value) {
        this.spec3 = value;
    }

    /**
     * Gets the value of the spec4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPEC4() {
        return spec4;
    }

    /**
     * Sets the value of the spec4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPEC4(String value) {
        this.spec4 = value;
    }

    /**
     * Gets the value of the spec5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPEC5() {
        return spec5;
    }

    /**
     * Sets the value of the spec5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPEC5(String value) {
        this.spec5 = value;
    }

    /**
     * Gets the value of the ausna property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUSNA() {
        return ausna;
    }

    /**
     * Sets the value of the ausna property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUSNA(String value) {
        this.ausna = value;
    }

    /**
     * Gets the value of the gembz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGEMBZ() {
        return gembz;
    }

    /**
     * Sets the value of the gembz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGEMBZ(String value) {
        this.gembz = value;
    }

    /**
     * Gets the value of the onkst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONKST() {
        return onkst;
    }

    /**
     * Sets the value of the onkst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONKST(String value) {
        this.onkst = value;
    }

    /**
     * Gets the value of the atrfg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATRFG() {
        return atrfg;
    }

    /**
     * Sets the value of the atrfg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATRFG(String value) {
        this.atrfg = value;
    }

    /**
     * Gets the value of the aklhf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAKLHF() {
        return aklhf;
    }

    /**
     * Sets the value of the aklhf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAKLHF(String value) {
        this.aklhf = value;
    }

    /**
     * Gets the value of the cdfis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDFIS() {
        return cdfis;
    }

    /**
     * Sets the value of the cdfis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDFIS(String value) {
        this.cdfis = value;
    }

    /**
     * Gets the value of the cdvdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDVDR() {
        return cdvdr;
    }

    /**
     * Sets the value of the cdvdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDVDR(String value) {
        this.cdvdr = value;
    }

    /**
     * Gets the value of the othog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTHOG() {
        return othog;
    }

    /**
     * Sets the value of the othog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTHOG(String value) {
        this.othog = value;
    }

    /**
     * Gets the value of the afbbt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAFBBT() {
        return afbbt;
    }

    /**
     * Sets the value of the afbbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAFBBT(String value) {
        this.afbbt = value;
    }

    /**
     * Gets the value of the versi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVERSI() {
        return versi;
    }

    /**
     * Sets the value of the versi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVERSI(String value) {
        this.versi = value;
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
     * Gets the value of the pwnbd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPWNBD() {
        return pwnbd;
    }

    /**
     * Sets the value of the pwnbd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPWNBD(String value) {
        this.pwnbd = value;
    }

    /**
     * Gets the value of the nothk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOTHK() {
        return nothk;
    }

    /**
     * Sets the value of the nothk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOTHK(String value) {
        this.nothk = value;
    }

    /**
     * Gets the value of the nwrkb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNWRKB() {
        return nwrkb;
    }

    /**
     * Sets the value of the nwrkb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNWRKB(String value) {
        this.nwrkb = value;
    }

    /**
     * Gets the value of the ed30P property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getED30P() {
        return ed30P;
    }

    /**
     * Sets the value of the ed30P property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setED30P(String value) {
        this.ed30P = value;
    }

    /**
     * Gets the value of the al30P property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAL30P() {
        return al30P;
    }

    /**
     * Sets the value of the al30P property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAL30P(String value) {
        this.al30P = value;
    }

    /**
     * Gets the value of the ch30P property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCH30P() {
        return ch30P;
    }

    /**
     * Sets the value of the ch30P property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCH30P(String value) {
        this.ch30P = value;
    }

    /**
     * Gets the value of the indti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDTI() {
        return indti;
    }

    /**
     * Sets the value of the indti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDTI(String value) {
        this.indti = value;
    }

    /**
     * Gets the value of the begti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEGTI() {
        return begti;
    }

    /**
     * Sets the value of the begti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBEGTI(String value) {
        this.begti = value;
    }

    /**
     * Gets the value of the retda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRETDA() {
        return retda;
    }

    /**
     * Sets the value of the retda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRETDA(String value) {
        this.retda = value;
    }

    /**
     * Gets the value of the fisco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFISCO() {
        return fisco;
    }

    /**
     * Sets the value of the fisco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFISCO(String value) {
        this.fisco = value;
    }

    /**
     * Gets the value of the al30P2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAL30P2() {
        return al30P2;
    }

    /**
     * Sets the value of the al30P2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAL30P2(String value) {
        this.al30P2 = value;
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
