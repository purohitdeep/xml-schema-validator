
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
 *         &lt;element name="SART0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VENT0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="STATU" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DGNR0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DGNA0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTEL0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ASVGR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AUSVA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AUSVL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AUSVG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GEBD0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FANA0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VONA0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="42"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AKGR0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WKFZ0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PLZL0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WORT0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="STRA0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BEAB0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KABE0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TAET0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BTAG0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TATU0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LTAG0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GRUN0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KZKU0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ARFT0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ARTX0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BLOE0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EBSV0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BKTN0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BBLZ0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BENT0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BVO10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BBI10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BBE10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BVO20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BBI20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BBE20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BVO30" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BBI30" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BBE30" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BVO40" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BBI40" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BBE40" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BSUM0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SZKZ0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SBTW0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SBZT0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="24"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KEAB0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KEBI0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UAAB0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UABI0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AEFZ0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JAGU0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TAGU0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TPR10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TVO10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TBI10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TPR20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TVO20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TBI20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PROV0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANV10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANB10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANV20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANB20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANV30" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANB30" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANV40" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANB40" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AGRD0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="URLV0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="URLB0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AVER0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AVON0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ABIS0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNV10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNB10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNV20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNB20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNV30" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNB30" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNV40" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNB40" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SZMO0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SZWO0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANGV0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AHEB0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AMEB0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WAHR0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AGRD2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VOAB0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VOBI0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FEAB0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FEBI0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN30" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIN40" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SZMO1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SZWO1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SBZW0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SBZE0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRAB0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="E1Q0526" maxOccurs="999999" minOccurs="0"&gt;
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
 *                   &lt;element name="ANV50" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ANB50" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ANV60" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ANB60" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="EIN50" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="EIN60" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="UNV50" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="UNB50" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="UNV60" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="UNB60" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="UNV70" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="UNB70" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="UNV80" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="UNB80" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
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
 *                   &lt;element name="DGNA01" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="70"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="DTEL01" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="50"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AVER2" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="11"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IBAN" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="34"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TITL2" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SBGB0" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LABTG0" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PLZL1" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="9"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="WORT1" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="40"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="STRA1" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="50"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BIC0" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="11"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="APF01" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="APF02" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="APF03" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="APF04" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="APF05" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="APF06" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="APF07" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="APF08" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="APF09" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="APF10" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ANV70" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ANB70" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ANV80" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ANB80" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ANV90" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ANB90" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ANVA0" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ANBA0" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="GEGC0" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="GEGT0" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="30"/&gt;
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
    "sart0",
    "vent0",
    "statu",
    "dgnr0",
    "dgna0",
    "dtel0",
    "asvgr",
    "ausva",
    "ausvl",
    "ausvg",
    "gebd0",
    "fana0",
    "vona0",
    "akgr0",
    "wkfz0",
    "plzl0",
    "wort0",
    "stra0",
    "beab0",
    "kabe0",
    "taet0",
    "btag0",
    "tatu0",
    "ltag0",
    "grun0",
    "kzku0",
    "arft0",
    "artx0",
    "bloe0",
    "ebsv0",
    "bktn0",
    "bblz0",
    "bent0",
    "bvo10",
    "bbi10",
    "bbe10",
    "bvo20",
    "bbi20",
    "bbe20",
    "bvo30",
    "bbi30",
    "bbe30",
    "bvo40",
    "bbi40",
    "bbe40",
    "bsum0",
    "szkz0",
    "sbtw0",
    "sbzt0",
    "keab0",
    "kebi0",
    "uaab0",
    "uabi0",
    "aefz0",
    "jagu0",
    "tagu0",
    "tpr10",
    "tvo10",
    "tbi10",
    "tpr20",
    "tvo20",
    "tbi20",
    "prov0",
    "anv10",
    "anb10",
    "anv20",
    "anb20",
    "anv30",
    "anb30",
    "anv40",
    "anb40",
    "agrd0",
    "urlv0",
    "urlb0",
    "aver0",
    "avon0",
    "abis0",
    "unv10",
    "unb10",
    "unv20",
    "unb20",
    "unv30",
    "unb30",
    "unv40",
    "unb40",
    "szmo0",
    "szwo0",
    "angv0",
    "aheb0",
    "ameb0",
    "wahr0",
    "agrd2",
    "voab0",
    "vobi0",
    "feab0",
    "febi0",
    "ein10",
    "ein20",
    "ein30",
    "ein40",
    "szmo1",
    "szwo1",
    "sbzw0",
    "sbze0",
    "prab0",
    "e1Q0526"
})
public class E1P0526 {

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
    @XmlElement(name = "SART0")
    protected String sart0;
    @XmlElement(name = "VENT0")
    protected String vent0;
    @XmlElement(name = "STATU")
    protected String statu;
    @XmlElement(name = "DGNR0")
    protected String dgnr0;
    @XmlElement(name = "DGNA0")
    protected String dgna0;
    @XmlElement(name = "DTEL0")
    protected String dtel0;
    @XmlElement(name = "ASVGR")
    protected String asvgr;
    @XmlElement(name = "AUSVA")
    protected String ausva;
    @XmlElement(name = "AUSVL")
    protected String ausvl;
    @XmlElement(name = "AUSVG")
    protected String ausvg;
    @XmlElement(name = "GEBD0")
    protected String gebd0;
    @XmlElement(name = "FANA0")
    protected String fana0;
    @XmlElement(name = "VONA0")
    protected String vona0;
    @XmlElement(name = "AKGR0")
    protected String akgr0;
    @XmlElement(name = "WKFZ0")
    protected String wkfz0;
    @XmlElement(name = "PLZL0")
    protected String plzl0;
    @XmlElement(name = "WORT0")
    protected String wort0;
    @XmlElement(name = "STRA0")
    protected String stra0;
    @XmlElement(name = "BEAB0")
    protected String beab0;
    @XmlElement(name = "KABE0")
    protected String kabe0;
    @XmlElement(name = "TAET0")
    protected String taet0;
    @XmlElement(name = "BTAG0")
    protected String btag0;
    @XmlElement(name = "TATU0")
    protected String tatu0;
    @XmlElement(name = "LTAG0")
    protected String ltag0;
    @XmlElement(name = "GRUN0")
    protected String grun0;
    @XmlElement(name = "KZKU0")
    protected String kzku0;
    @XmlElement(name = "ARFT0")
    protected String arft0;
    @XmlElement(name = "ARTX0")
    protected String artx0;
    @XmlElement(name = "BLOE0")
    protected String bloe0;
    @XmlElement(name = "EBSV0")
    protected String ebsv0;
    @XmlElement(name = "BKTN0")
    protected String bktn0;
    @XmlElement(name = "BBLZ0")
    protected String bblz0;
    @XmlElement(name = "BENT0")
    protected String bent0;
    @XmlElement(name = "BVO10")
    protected String bvo10;
    @XmlElement(name = "BBI10")
    protected String bbi10;
    @XmlElement(name = "BBE10")
    protected String bbe10;
    @XmlElement(name = "BVO20")
    protected String bvo20;
    @XmlElement(name = "BBI20")
    protected String bbi20;
    @XmlElement(name = "BBE20")
    protected String bbe20;
    @XmlElement(name = "BVO30")
    protected String bvo30;
    @XmlElement(name = "BBI30")
    protected String bbi30;
    @XmlElement(name = "BBE30")
    protected String bbe30;
    @XmlElement(name = "BVO40")
    protected String bvo40;
    @XmlElement(name = "BBI40")
    protected String bbi40;
    @XmlElement(name = "BBE40")
    protected String bbe40;
    @XmlElement(name = "BSUM0")
    protected String bsum0;
    @XmlElement(name = "SZKZ0")
    protected String szkz0;
    @XmlElement(name = "SBTW0")
    protected String sbtw0;
    @XmlElement(name = "SBZT0")
    protected String sbzt0;
    @XmlElement(name = "KEAB0")
    protected String keab0;
    @XmlElement(name = "KEBI0")
    protected String kebi0;
    @XmlElement(name = "UAAB0")
    protected String uaab0;
    @XmlElement(name = "UABI0")
    protected String uabi0;
    @XmlElement(name = "AEFZ0")
    protected String aefz0;
    @XmlElement(name = "JAGU0")
    protected String jagu0;
    @XmlElement(name = "TAGU0")
    protected String tagu0;
    @XmlElement(name = "TPR10")
    protected String tpr10;
    @XmlElement(name = "TVO10")
    protected String tvo10;
    @XmlElement(name = "TBI10")
    protected String tbi10;
    @XmlElement(name = "TPR20")
    protected String tpr20;
    @XmlElement(name = "TVO20")
    protected String tvo20;
    @XmlElement(name = "TBI20")
    protected String tbi20;
    @XmlElement(name = "PROV0")
    protected String prov0;
    @XmlElement(name = "ANV10")
    protected String anv10;
    @XmlElement(name = "ANB10")
    protected String anb10;
    @XmlElement(name = "ANV20")
    protected String anv20;
    @XmlElement(name = "ANB20")
    protected String anb20;
    @XmlElement(name = "ANV30")
    protected String anv30;
    @XmlElement(name = "ANB30")
    protected String anb30;
    @XmlElement(name = "ANV40")
    protected String anv40;
    @XmlElement(name = "ANB40")
    protected String anb40;
    @XmlElement(name = "AGRD0")
    protected String agrd0;
    @XmlElement(name = "URLV0")
    protected String urlv0;
    @XmlElement(name = "URLB0")
    protected String urlb0;
    @XmlElement(name = "AVER0")
    protected String aver0;
    @XmlElement(name = "AVON0")
    protected String avon0;
    @XmlElement(name = "ABIS0")
    protected String abis0;
    @XmlElement(name = "UNV10")
    protected String unv10;
    @XmlElement(name = "UNB10")
    protected String unb10;
    @XmlElement(name = "UNV20")
    protected String unv20;
    @XmlElement(name = "UNB20")
    protected String unb20;
    @XmlElement(name = "UNV30")
    protected String unv30;
    @XmlElement(name = "UNB30")
    protected String unb30;
    @XmlElement(name = "UNV40")
    protected String unv40;
    @XmlElement(name = "UNB40")
    protected String unb40;
    @XmlElement(name = "SZMO0")
    protected String szmo0;
    @XmlElement(name = "SZWO0")
    protected String szwo0;
    @XmlElement(name = "ANGV0")
    protected String angv0;
    @XmlElement(name = "AHEB0")
    protected String aheb0;
    @XmlElement(name = "AMEB0")
    protected String ameb0;
    @XmlElement(name = "WAHR0")
    protected String wahr0;
    @XmlElement(name = "AGRD2")
    protected String agrd2;
    @XmlElement(name = "VOAB0")
    protected String voab0;
    @XmlElement(name = "VOBI0")
    protected String vobi0;
    @XmlElement(name = "FEAB0")
    protected String feab0;
    @XmlElement(name = "FEBI0")
    protected String febi0;
    @XmlElement(name = "EIN10")
    protected String ein10;
    @XmlElement(name = "EIN20")
    protected String ein20;
    @XmlElement(name = "EIN30")
    protected String ein30;
    @XmlElement(name = "EIN40")
    protected String ein40;
    @XmlElement(name = "SZMO1")
    protected String szmo1;
    @XmlElement(name = "SZWO1")
    protected String szwo1;
    @XmlElement(name = "SBZW0")
    protected String sbzw0;
    @XmlElement(name = "SBZE0")
    protected String sbze0;
    @XmlElement(name = "PRAB0")
    protected String prab0;
    @XmlElement(name = "E1Q0526")
    protected List<E1Q0526> e1Q0526;
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
     * Gets the value of the sart0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSART0() {
        return sart0;
    }

    /**
     * Sets the value of the sart0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSART0(String value) {
        this.sart0 = value;
    }

    /**
     * Gets the value of the vent0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVENT0() {
        return vent0;
    }

    /**
     * Sets the value of the vent0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVENT0(String value) {
        this.vent0 = value;
    }

    /**
     * Gets the value of the statu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATU() {
        return statu;
    }

    /**
     * Sets the value of the statu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATU(String value) {
        this.statu = value;
    }

    /**
     * Gets the value of the dgnr0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDGNR0() {
        return dgnr0;
    }

    /**
     * Sets the value of the dgnr0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDGNR0(String value) {
        this.dgnr0 = value;
    }

    /**
     * Gets the value of the dgna0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDGNA0() {
        return dgna0;
    }

    /**
     * Sets the value of the dgna0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDGNA0(String value) {
        this.dgna0 = value;
    }

    /**
     * Gets the value of the dtel0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTEL0() {
        return dtel0;
    }

    /**
     * Sets the value of the dtel0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTEL0(String value) {
        this.dtel0 = value;
    }

    /**
     * Gets the value of the asvgr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASVGR() {
        return asvgr;
    }

    /**
     * Sets the value of the asvgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASVGR(String value) {
        this.asvgr = value;
    }

    /**
     * Gets the value of the ausva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUSVA() {
        return ausva;
    }

    /**
     * Sets the value of the ausva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUSVA(String value) {
        this.ausva = value;
    }

    /**
     * Gets the value of the ausvl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUSVL() {
        return ausvl;
    }

    /**
     * Sets the value of the ausvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUSVL(String value) {
        this.ausvl = value;
    }

    /**
     * Gets the value of the ausvg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUSVG() {
        return ausvg;
    }

    /**
     * Sets the value of the ausvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUSVG(String value) {
        this.ausvg = value;
    }

    /**
     * Gets the value of the gebd0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGEBD0() {
        return gebd0;
    }

    /**
     * Sets the value of the gebd0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGEBD0(String value) {
        this.gebd0 = value;
    }

    /**
     * Gets the value of the fana0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFANA0() {
        return fana0;
    }

    /**
     * Sets the value of the fana0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFANA0(String value) {
        this.fana0 = value;
    }

    /**
     * Gets the value of the vona0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVONA0() {
        return vona0;
    }

    /**
     * Sets the value of the vona0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVONA0(String value) {
        this.vona0 = value;
    }

    /**
     * Gets the value of the akgr0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAKGR0() {
        return akgr0;
    }

    /**
     * Sets the value of the akgr0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAKGR0(String value) {
        this.akgr0 = value;
    }

    /**
     * Gets the value of the wkfz0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWKFZ0() {
        return wkfz0;
    }

    /**
     * Sets the value of the wkfz0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWKFZ0(String value) {
        this.wkfz0 = value;
    }

    /**
     * Gets the value of the plzl0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLZL0() {
        return plzl0;
    }

    /**
     * Sets the value of the plzl0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLZL0(String value) {
        this.plzl0 = value;
    }

    /**
     * Gets the value of the wort0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWORT0() {
        return wort0;
    }

    /**
     * Sets the value of the wort0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWORT0(String value) {
        this.wort0 = value;
    }

    /**
     * Gets the value of the stra0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTRA0() {
        return stra0;
    }

    /**
     * Sets the value of the stra0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTRA0(String value) {
        this.stra0 = value;
    }

    /**
     * Gets the value of the beab0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEAB0() {
        return beab0;
    }

    /**
     * Sets the value of the beab0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBEAB0(String value) {
        this.beab0 = value;
    }

    /**
     * Gets the value of the kabe0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKABE0() {
        return kabe0;
    }

    /**
     * Sets the value of the kabe0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKABE0(String value) {
        this.kabe0 = value;
    }

    /**
     * Gets the value of the taet0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAET0() {
        return taet0;
    }

    /**
     * Sets the value of the taet0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAET0(String value) {
        this.taet0 = value;
    }

    /**
     * Gets the value of the btag0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBTAG0() {
        return btag0;
    }

    /**
     * Sets the value of the btag0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBTAG0(String value) {
        this.btag0 = value;
    }

    /**
     * Gets the value of the tatu0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTATU0() {
        return tatu0;
    }

    /**
     * Sets the value of the tatu0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTATU0(String value) {
        this.tatu0 = value;
    }

    /**
     * Gets the value of the ltag0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLTAG0() {
        return ltag0;
    }

    /**
     * Sets the value of the ltag0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLTAG0(String value) {
        this.ltag0 = value;
    }

    /**
     * Gets the value of the grun0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRUN0() {
        return grun0;
    }

    /**
     * Sets the value of the grun0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRUN0(String value) {
        this.grun0 = value;
    }

    /**
     * Gets the value of the kzku0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKZKU0() {
        return kzku0;
    }

    /**
     * Sets the value of the kzku0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKZKU0(String value) {
        this.kzku0 = value;
    }

    /**
     * Gets the value of the arft0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARFT0() {
        return arft0;
    }

    /**
     * Sets the value of the arft0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARFT0(String value) {
        this.arft0 = value;
    }

    /**
     * Gets the value of the artx0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARTX0() {
        return artx0;
    }

    /**
     * Sets the value of the artx0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARTX0(String value) {
        this.artx0 = value;
    }

    /**
     * Gets the value of the bloe0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBLOE0() {
        return bloe0;
    }

    /**
     * Sets the value of the bloe0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBLOE0(String value) {
        this.bloe0 = value;
    }

    /**
     * Gets the value of the ebsv0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEBSV0() {
        return ebsv0;
    }

    /**
     * Sets the value of the ebsv0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBSV0(String value) {
        this.ebsv0 = value;
    }

    /**
     * Gets the value of the bktn0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBKTN0() {
        return bktn0;
    }

    /**
     * Sets the value of the bktn0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBKTN0(String value) {
        this.bktn0 = value;
    }

    /**
     * Gets the value of the bblz0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBBLZ0() {
        return bblz0;
    }

    /**
     * Sets the value of the bblz0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBBLZ0(String value) {
        this.bblz0 = value;
    }

    /**
     * Gets the value of the bent0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBENT0() {
        return bent0;
    }

    /**
     * Sets the value of the bent0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBENT0(String value) {
        this.bent0 = value;
    }

    /**
     * Gets the value of the bvo10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBVO10() {
        return bvo10;
    }

    /**
     * Sets the value of the bvo10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBVO10(String value) {
        this.bvo10 = value;
    }

    /**
     * Gets the value of the bbi10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBBI10() {
        return bbi10;
    }

    /**
     * Sets the value of the bbi10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBBI10(String value) {
        this.bbi10 = value;
    }

    /**
     * Gets the value of the bbe10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBBE10() {
        return bbe10;
    }

    /**
     * Sets the value of the bbe10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBBE10(String value) {
        this.bbe10 = value;
    }

    /**
     * Gets the value of the bvo20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBVO20() {
        return bvo20;
    }

    /**
     * Sets the value of the bvo20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBVO20(String value) {
        this.bvo20 = value;
    }

    /**
     * Gets the value of the bbi20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBBI20() {
        return bbi20;
    }

    /**
     * Sets the value of the bbi20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBBI20(String value) {
        this.bbi20 = value;
    }

    /**
     * Gets the value of the bbe20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBBE20() {
        return bbe20;
    }

    /**
     * Sets the value of the bbe20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBBE20(String value) {
        this.bbe20 = value;
    }

    /**
     * Gets the value of the bvo30 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBVO30() {
        return bvo30;
    }

    /**
     * Sets the value of the bvo30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBVO30(String value) {
        this.bvo30 = value;
    }

    /**
     * Gets the value of the bbi30 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBBI30() {
        return bbi30;
    }

    /**
     * Sets the value of the bbi30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBBI30(String value) {
        this.bbi30 = value;
    }

    /**
     * Gets the value of the bbe30 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBBE30() {
        return bbe30;
    }

    /**
     * Sets the value of the bbe30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBBE30(String value) {
        this.bbe30 = value;
    }

    /**
     * Gets the value of the bvo40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBVO40() {
        return bvo40;
    }

    /**
     * Sets the value of the bvo40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBVO40(String value) {
        this.bvo40 = value;
    }

    /**
     * Gets the value of the bbi40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBBI40() {
        return bbi40;
    }

    /**
     * Sets the value of the bbi40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBBI40(String value) {
        this.bbi40 = value;
    }

    /**
     * Gets the value of the bbe40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBBE40() {
        return bbe40;
    }

    /**
     * Sets the value of the bbe40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBBE40(String value) {
        this.bbe40 = value;
    }

    /**
     * Gets the value of the bsum0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSUM0() {
        return bsum0;
    }

    /**
     * Sets the value of the bsum0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSUM0(String value) {
        this.bsum0 = value;
    }

    /**
     * Gets the value of the szkz0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSZKZ0() {
        return szkz0;
    }

    /**
     * Sets the value of the szkz0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSZKZ0(String value) {
        this.szkz0 = value;
    }

    /**
     * Gets the value of the sbtw0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBTW0() {
        return sbtw0;
    }

    /**
     * Sets the value of the sbtw0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBTW0(String value) {
        this.sbtw0 = value;
    }

    /**
     * Gets the value of the sbzt0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBZT0() {
        return sbzt0;
    }

    /**
     * Sets the value of the sbzt0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBZT0(String value) {
        this.sbzt0 = value;
    }

    /**
     * Gets the value of the keab0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKEAB0() {
        return keab0;
    }

    /**
     * Sets the value of the keab0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKEAB0(String value) {
        this.keab0 = value;
    }

    /**
     * Gets the value of the kebi0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKEBI0() {
        return kebi0;
    }

    /**
     * Sets the value of the kebi0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKEBI0(String value) {
        this.kebi0 = value;
    }

    /**
     * Gets the value of the uaab0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUAAB0() {
        return uaab0;
    }

    /**
     * Sets the value of the uaab0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUAAB0(String value) {
        this.uaab0 = value;
    }

    /**
     * Gets the value of the uabi0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUABI0() {
        return uabi0;
    }

    /**
     * Sets the value of the uabi0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUABI0(String value) {
        this.uabi0 = value;
    }

    /**
     * Gets the value of the aefz0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAEFZ0() {
        return aefz0;
    }

    /**
     * Sets the value of the aefz0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAEFZ0(String value) {
        this.aefz0 = value;
    }

    /**
     * Gets the value of the jagu0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJAGU0() {
        return jagu0;
    }

    /**
     * Sets the value of the jagu0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJAGU0(String value) {
        this.jagu0 = value;
    }

    /**
     * Gets the value of the tagu0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAGU0() {
        return tagu0;
    }

    /**
     * Sets the value of the tagu0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAGU0(String value) {
        this.tagu0 = value;
    }

    /**
     * Gets the value of the tpr10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTPR10() {
        return tpr10;
    }

    /**
     * Sets the value of the tpr10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTPR10(String value) {
        this.tpr10 = value;
    }

    /**
     * Gets the value of the tvo10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTVO10() {
        return tvo10;
    }

    /**
     * Sets the value of the tvo10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTVO10(String value) {
        this.tvo10 = value;
    }

    /**
     * Gets the value of the tbi10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTBI10() {
        return tbi10;
    }

    /**
     * Sets the value of the tbi10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTBI10(String value) {
        this.tbi10 = value;
    }

    /**
     * Gets the value of the tpr20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTPR20() {
        return tpr20;
    }

    /**
     * Sets the value of the tpr20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTPR20(String value) {
        this.tpr20 = value;
    }

    /**
     * Gets the value of the tvo20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTVO20() {
        return tvo20;
    }

    /**
     * Sets the value of the tvo20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTVO20(String value) {
        this.tvo20 = value;
    }

    /**
     * Gets the value of the tbi20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTBI20() {
        return tbi20;
    }

    /**
     * Sets the value of the tbi20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTBI20(String value) {
        this.tbi20 = value;
    }

    /**
     * Gets the value of the prov0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROV0() {
        return prov0;
    }

    /**
     * Sets the value of the prov0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROV0(String value) {
        this.prov0 = value;
    }

    /**
     * Gets the value of the anv10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANV10() {
        return anv10;
    }

    /**
     * Sets the value of the anv10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANV10(String value) {
        this.anv10 = value;
    }

    /**
     * Gets the value of the anb10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANB10() {
        return anb10;
    }

    /**
     * Sets the value of the anb10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANB10(String value) {
        this.anb10 = value;
    }

    /**
     * Gets the value of the anv20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANV20() {
        return anv20;
    }

    /**
     * Sets the value of the anv20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANV20(String value) {
        this.anv20 = value;
    }

    /**
     * Gets the value of the anb20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANB20() {
        return anb20;
    }

    /**
     * Sets the value of the anb20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANB20(String value) {
        this.anb20 = value;
    }

    /**
     * Gets the value of the anv30 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANV30() {
        return anv30;
    }

    /**
     * Sets the value of the anv30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANV30(String value) {
        this.anv30 = value;
    }

    /**
     * Gets the value of the anb30 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANB30() {
        return anb30;
    }

    /**
     * Sets the value of the anb30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANB30(String value) {
        this.anb30 = value;
    }

    /**
     * Gets the value of the anv40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANV40() {
        return anv40;
    }

    /**
     * Sets the value of the anv40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANV40(String value) {
        this.anv40 = value;
    }

    /**
     * Gets the value of the anb40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANB40() {
        return anb40;
    }

    /**
     * Sets the value of the anb40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANB40(String value) {
        this.anb40 = value;
    }

    /**
     * Gets the value of the agrd0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGRD0() {
        return agrd0;
    }

    /**
     * Sets the value of the agrd0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGRD0(String value) {
        this.agrd0 = value;
    }

    /**
     * Gets the value of the urlv0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLV0() {
        return urlv0;
    }

    /**
     * Sets the value of the urlv0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLV0(String value) {
        this.urlv0 = value;
    }

    /**
     * Gets the value of the urlb0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLB0() {
        return urlb0;
    }

    /**
     * Sets the value of the urlb0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLB0(String value) {
        this.urlb0 = value;
    }

    /**
     * Gets the value of the aver0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVER0() {
        return aver0;
    }

    /**
     * Sets the value of the aver0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVER0(String value) {
        this.aver0 = value;
    }

    /**
     * Gets the value of the avon0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVON0() {
        return avon0;
    }

    /**
     * Sets the value of the avon0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVON0(String value) {
        this.avon0 = value;
    }

    /**
     * Gets the value of the abis0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABIS0() {
        return abis0;
    }

    /**
     * Sets the value of the abis0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABIS0(String value) {
        this.abis0 = value;
    }

    /**
     * Gets the value of the unv10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNV10() {
        return unv10;
    }

    /**
     * Sets the value of the unv10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNV10(String value) {
        this.unv10 = value;
    }

    /**
     * Gets the value of the unb10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNB10() {
        return unb10;
    }

    /**
     * Sets the value of the unb10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNB10(String value) {
        this.unb10 = value;
    }

    /**
     * Gets the value of the unv20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNV20() {
        return unv20;
    }

    /**
     * Sets the value of the unv20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNV20(String value) {
        this.unv20 = value;
    }

    /**
     * Gets the value of the unb20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNB20() {
        return unb20;
    }

    /**
     * Sets the value of the unb20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNB20(String value) {
        this.unb20 = value;
    }

    /**
     * Gets the value of the unv30 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNV30() {
        return unv30;
    }

    /**
     * Sets the value of the unv30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNV30(String value) {
        this.unv30 = value;
    }

    /**
     * Gets the value of the unb30 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNB30() {
        return unb30;
    }

    /**
     * Sets the value of the unb30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNB30(String value) {
        this.unb30 = value;
    }

    /**
     * Gets the value of the unv40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNV40() {
        return unv40;
    }

    /**
     * Sets the value of the unv40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNV40(String value) {
        this.unv40 = value;
    }

    /**
     * Gets the value of the unb40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNB40() {
        return unb40;
    }

    /**
     * Sets the value of the unb40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNB40(String value) {
        this.unb40 = value;
    }

    /**
     * Gets the value of the szmo0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSZMO0() {
        return szmo0;
    }

    /**
     * Sets the value of the szmo0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSZMO0(String value) {
        this.szmo0 = value;
    }

    /**
     * Gets the value of the szwo0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSZWO0() {
        return szwo0;
    }

    /**
     * Sets the value of the szwo0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSZWO0(String value) {
        this.szwo0 = value;
    }

    /**
     * Gets the value of the angv0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANGV0() {
        return angv0;
    }

    /**
     * Sets the value of the angv0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANGV0(String value) {
        this.angv0 = value;
    }

    /**
     * Gets the value of the aheb0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAHEB0() {
        return aheb0;
    }

    /**
     * Sets the value of the aheb0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAHEB0(String value) {
        this.aheb0 = value;
    }

    /**
     * Gets the value of the ameb0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMEB0() {
        return ameb0;
    }

    /**
     * Sets the value of the ameb0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMEB0(String value) {
        this.ameb0 = value;
    }

    /**
     * Gets the value of the wahr0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAHR0() {
        return wahr0;
    }

    /**
     * Sets the value of the wahr0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAHR0(String value) {
        this.wahr0 = value;
    }

    /**
     * Gets the value of the agrd2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGRD2() {
        return agrd2;
    }

    /**
     * Sets the value of the agrd2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGRD2(String value) {
        this.agrd2 = value;
    }

    /**
     * Gets the value of the voab0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOAB0() {
        return voab0;
    }

    /**
     * Sets the value of the voab0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOAB0(String value) {
        this.voab0 = value;
    }

    /**
     * Gets the value of the vobi0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOBI0() {
        return vobi0;
    }

    /**
     * Sets the value of the vobi0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOBI0(String value) {
        this.vobi0 = value;
    }

    /**
     * Gets the value of the feab0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFEAB0() {
        return feab0;
    }

    /**
     * Sets the value of the feab0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFEAB0(String value) {
        this.feab0 = value;
    }

    /**
     * Gets the value of the febi0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFEBI0() {
        return febi0;
    }

    /**
     * Sets the value of the febi0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFEBI0(String value) {
        this.febi0 = value;
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
     * Gets the value of the szmo1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSZMO1() {
        return szmo1;
    }

    /**
     * Sets the value of the szmo1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSZMO1(String value) {
        this.szmo1 = value;
    }

    /**
     * Gets the value of the szwo1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSZWO1() {
        return szwo1;
    }

    /**
     * Sets the value of the szwo1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSZWO1(String value) {
        this.szwo1 = value;
    }

    /**
     * Gets the value of the sbzw0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBZW0() {
        return sbzw0;
    }

    /**
     * Sets the value of the sbzw0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBZW0(String value) {
        this.sbzw0 = value;
    }

    /**
     * Gets the value of the sbze0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBZE0() {
        return sbze0;
    }

    /**
     * Sets the value of the sbze0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBZE0(String value) {
        this.sbze0 = value;
    }

    /**
     * Gets the value of the prab0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRAB0() {
        return prab0;
    }

    /**
     * Sets the value of the prab0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRAB0(String value) {
        this.prab0 = value;
    }

    /**
     * Gets the value of the e1Q0526 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1Q0526 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1Q0526().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link E1Q0526 }
     * 
     * 
     */
    public List<E1Q0526> getE1Q0526() {
        if (e1Q0526 == null) {
            e1Q0526 = new ArrayList<E1Q0526>();
        }
        return this.e1Q0526;
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
