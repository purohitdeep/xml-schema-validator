
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
 *         &lt;element name="STAFZ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="STAKN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="STANR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="STAAG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AUSAN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KNR01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FNR01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FBB01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KNR02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FNR02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FBB02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KNR03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FNR03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FBB03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KNR04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FNR04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FBB04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KNR05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FNR05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FBB05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KNR06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FNR06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FBB06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KNR07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FNR07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FBB07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KNR08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FNR08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FBB08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KNR09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FNR09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FBB09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KNR10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FNR10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FBB10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KNR11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FNR11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FBB11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KNR12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FNR12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FBB12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KNR13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FNR13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FBB13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KNR14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FNR14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FBB14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KNR15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FNR15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FBB15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KNR16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FNR16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FBB16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KNR17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FNR17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FBB17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KNR18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FNR18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FBB18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KNR19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FNR19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FBB19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KNR20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FNR20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FBB20" minOccurs="0"&gt;
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
 *         &lt;element name="FBBEE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
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
    "stafz",
    "stakn",
    "stanr",
    "staag",
    "ausan",
    "knr01",
    "fnr01",
    "fbb01",
    "knr02",
    "fnr02",
    "fbb02",
    "knr03",
    "fnr03",
    "fbb03",
    "knr04",
    "fnr04",
    "fbb04",
    "knr05",
    "fnr05",
    "fbb05",
    "knr06",
    "fnr06",
    "fbb06",
    "knr07",
    "fnr07",
    "fbb07",
    "knr08",
    "fnr08",
    "fbb08",
    "knr09",
    "fnr09",
    "fbb09",
    "knr10",
    "fnr10",
    "fbb10",
    "knr11",
    "fnr11",
    "fbb11",
    "knr12",
    "fnr12",
    "fbb12",
    "knr13",
    "fnr13",
    "fbb13",
    "knr14",
    "fnr14",
    "fbb14",
    "knr15",
    "fnr15",
    "fbb15",
    "knr16",
    "fnr16",
    "fbb16",
    "knr17",
    "fnr17",
    "fbb17",
    "knr18",
    "fnr18",
    "fbb18",
    "knr19",
    "fnr19",
    "fbb19",
    "knr20",
    "fnr20",
    "fbb20",
    "grpvl",
    "fbbee"
})
public class E1P0043 {

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
    @XmlElement(name = "STAFZ")
    protected String stafz;
    @XmlElement(name = "STAKN")
    protected String stakn;
    @XmlElement(name = "STANR")
    protected String stanr;
    @XmlElement(name = "STAAG")
    protected String staag;
    @XmlElement(name = "AUSAN")
    protected String ausan;
    @XmlElement(name = "KNR01")
    protected String knr01;
    @XmlElement(name = "FNR01")
    protected String fnr01;
    @XmlElement(name = "FBB01")
    protected String fbb01;
    @XmlElement(name = "KNR02")
    protected String knr02;
    @XmlElement(name = "FNR02")
    protected String fnr02;
    @XmlElement(name = "FBB02")
    protected String fbb02;
    @XmlElement(name = "KNR03")
    protected String knr03;
    @XmlElement(name = "FNR03")
    protected String fnr03;
    @XmlElement(name = "FBB03")
    protected String fbb03;
    @XmlElement(name = "KNR04")
    protected String knr04;
    @XmlElement(name = "FNR04")
    protected String fnr04;
    @XmlElement(name = "FBB04")
    protected String fbb04;
    @XmlElement(name = "KNR05")
    protected String knr05;
    @XmlElement(name = "FNR05")
    protected String fnr05;
    @XmlElement(name = "FBB05")
    protected String fbb05;
    @XmlElement(name = "KNR06")
    protected String knr06;
    @XmlElement(name = "FNR06")
    protected String fnr06;
    @XmlElement(name = "FBB06")
    protected String fbb06;
    @XmlElement(name = "KNR07")
    protected String knr07;
    @XmlElement(name = "FNR07")
    protected String fnr07;
    @XmlElement(name = "FBB07")
    protected String fbb07;
    @XmlElement(name = "KNR08")
    protected String knr08;
    @XmlElement(name = "FNR08")
    protected String fnr08;
    @XmlElement(name = "FBB08")
    protected String fbb08;
    @XmlElement(name = "KNR09")
    protected String knr09;
    @XmlElement(name = "FNR09")
    protected String fnr09;
    @XmlElement(name = "FBB09")
    protected String fbb09;
    @XmlElement(name = "KNR10")
    protected String knr10;
    @XmlElement(name = "FNR10")
    protected String fnr10;
    @XmlElement(name = "FBB10")
    protected String fbb10;
    @XmlElement(name = "KNR11")
    protected String knr11;
    @XmlElement(name = "FNR11")
    protected String fnr11;
    @XmlElement(name = "FBB11")
    protected String fbb11;
    @XmlElement(name = "KNR12")
    protected String knr12;
    @XmlElement(name = "FNR12")
    protected String fnr12;
    @XmlElement(name = "FBB12")
    protected String fbb12;
    @XmlElement(name = "KNR13")
    protected String knr13;
    @XmlElement(name = "FNR13")
    protected String fnr13;
    @XmlElement(name = "FBB13")
    protected String fbb13;
    @XmlElement(name = "KNR14")
    protected String knr14;
    @XmlElement(name = "FNR14")
    protected String fnr14;
    @XmlElement(name = "FBB14")
    protected String fbb14;
    @XmlElement(name = "KNR15")
    protected String knr15;
    @XmlElement(name = "FNR15")
    protected String fnr15;
    @XmlElement(name = "FBB15")
    protected String fbb15;
    @XmlElement(name = "KNR16")
    protected String knr16;
    @XmlElement(name = "FNR16")
    protected String fnr16;
    @XmlElement(name = "FBB16")
    protected String fbb16;
    @XmlElement(name = "KNR17")
    protected String knr17;
    @XmlElement(name = "FNR17")
    protected String fnr17;
    @XmlElement(name = "FBB17")
    protected String fbb17;
    @XmlElement(name = "KNR18")
    protected String knr18;
    @XmlElement(name = "FNR18")
    protected String fnr18;
    @XmlElement(name = "FBB18")
    protected String fbb18;
    @XmlElement(name = "KNR19")
    protected String knr19;
    @XmlElement(name = "FNR19")
    protected String fnr19;
    @XmlElement(name = "FBB19")
    protected String fbb19;
    @XmlElement(name = "KNR20")
    protected String knr20;
    @XmlElement(name = "FNR20")
    protected String fnr20;
    @XmlElement(name = "FBB20")
    protected String fbb20;
    @XmlElement(name = "GRPVL")
    protected String grpvl;
    @XmlElement(name = "FBBEE")
    protected String fbbee;
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
     * Gets the value of the stafz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTAFZ() {
        return stafz;
    }

    /**
     * Sets the value of the stafz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTAFZ(String value) {
        this.stafz = value;
    }

    /**
     * Gets the value of the stakn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTAKN() {
        return stakn;
    }

    /**
     * Sets the value of the stakn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTAKN(String value) {
        this.stakn = value;
    }

    /**
     * Gets the value of the stanr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTANR() {
        return stanr;
    }

    /**
     * Sets the value of the stanr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTANR(String value) {
        this.stanr = value;
    }

    /**
     * Gets the value of the staag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTAAG() {
        return staag;
    }

    /**
     * Sets the value of the staag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTAAG(String value) {
        this.staag = value;
    }

    /**
     * Gets the value of the ausan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUSAN() {
        return ausan;
    }

    /**
     * Sets the value of the ausan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUSAN(String value) {
        this.ausan = value;
    }

    /**
     * Gets the value of the knr01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKNR01() {
        return knr01;
    }

    /**
     * Sets the value of the knr01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKNR01(String value) {
        this.knr01 = value;
    }

    /**
     * Gets the value of the fnr01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNR01() {
        return fnr01;
    }

    /**
     * Sets the value of the fnr01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNR01(String value) {
        this.fnr01 = value;
    }

    /**
     * Gets the value of the fbb01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFBB01() {
        return fbb01;
    }

    /**
     * Sets the value of the fbb01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFBB01(String value) {
        this.fbb01 = value;
    }

    /**
     * Gets the value of the knr02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKNR02() {
        return knr02;
    }

    /**
     * Sets the value of the knr02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKNR02(String value) {
        this.knr02 = value;
    }

    /**
     * Gets the value of the fnr02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNR02() {
        return fnr02;
    }

    /**
     * Sets the value of the fnr02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNR02(String value) {
        this.fnr02 = value;
    }

    /**
     * Gets the value of the fbb02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFBB02() {
        return fbb02;
    }

    /**
     * Sets the value of the fbb02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFBB02(String value) {
        this.fbb02 = value;
    }

    /**
     * Gets the value of the knr03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKNR03() {
        return knr03;
    }

    /**
     * Sets the value of the knr03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKNR03(String value) {
        this.knr03 = value;
    }

    /**
     * Gets the value of the fnr03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNR03() {
        return fnr03;
    }

    /**
     * Sets the value of the fnr03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNR03(String value) {
        this.fnr03 = value;
    }

    /**
     * Gets the value of the fbb03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFBB03() {
        return fbb03;
    }

    /**
     * Sets the value of the fbb03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFBB03(String value) {
        this.fbb03 = value;
    }

    /**
     * Gets the value of the knr04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKNR04() {
        return knr04;
    }

    /**
     * Sets the value of the knr04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKNR04(String value) {
        this.knr04 = value;
    }

    /**
     * Gets the value of the fnr04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNR04() {
        return fnr04;
    }

    /**
     * Sets the value of the fnr04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNR04(String value) {
        this.fnr04 = value;
    }

    /**
     * Gets the value of the fbb04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFBB04() {
        return fbb04;
    }

    /**
     * Sets the value of the fbb04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFBB04(String value) {
        this.fbb04 = value;
    }

    /**
     * Gets the value of the knr05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKNR05() {
        return knr05;
    }

    /**
     * Sets the value of the knr05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKNR05(String value) {
        this.knr05 = value;
    }

    /**
     * Gets the value of the fnr05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNR05() {
        return fnr05;
    }

    /**
     * Sets the value of the fnr05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNR05(String value) {
        this.fnr05 = value;
    }

    /**
     * Gets the value of the fbb05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFBB05() {
        return fbb05;
    }

    /**
     * Sets the value of the fbb05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFBB05(String value) {
        this.fbb05 = value;
    }

    /**
     * Gets the value of the knr06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKNR06() {
        return knr06;
    }

    /**
     * Sets the value of the knr06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKNR06(String value) {
        this.knr06 = value;
    }

    /**
     * Gets the value of the fnr06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNR06() {
        return fnr06;
    }

    /**
     * Sets the value of the fnr06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNR06(String value) {
        this.fnr06 = value;
    }

    /**
     * Gets the value of the fbb06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFBB06() {
        return fbb06;
    }

    /**
     * Sets the value of the fbb06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFBB06(String value) {
        this.fbb06 = value;
    }

    /**
     * Gets the value of the knr07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKNR07() {
        return knr07;
    }

    /**
     * Sets the value of the knr07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKNR07(String value) {
        this.knr07 = value;
    }

    /**
     * Gets the value of the fnr07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNR07() {
        return fnr07;
    }

    /**
     * Sets the value of the fnr07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNR07(String value) {
        this.fnr07 = value;
    }

    /**
     * Gets the value of the fbb07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFBB07() {
        return fbb07;
    }

    /**
     * Sets the value of the fbb07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFBB07(String value) {
        this.fbb07 = value;
    }

    /**
     * Gets the value of the knr08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKNR08() {
        return knr08;
    }

    /**
     * Sets the value of the knr08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKNR08(String value) {
        this.knr08 = value;
    }

    /**
     * Gets the value of the fnr08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNR08() {
        return fnr08;
    }

    /**
     * Sets the value of the fnr08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNR08(String value) {
        this.fnr08 = value;
    }

    /**
     * Gets the value of the fbb08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFBB08() {
        return fbb08;
    }

    /**
     * Sets the value of the fbb08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFBB08(String value) {
        this.fbb08 = value;
    }

    /**
     * Gets the value of the knr09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKNR09() {
        return knr09;
    }

    /**
     * Sets the value of the knr09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKNR09(String value) {
        this.knr09 = value;
    }

    /**
     * Gets the value of the fnr09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNR09() {
        return fnr09;
    }

    /**
     * Sets the value of the fnr09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNR09(String value) {
        this.fnr09 = value;
    }

    /**
     * Gets the value of the fbb09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFBB09() {
        return fbb09;
    }

    /**
     * Sets the value of the fbb09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFBB09(String value) {
        this.fbb09 = value;
    }

    /**
     * Gets the value of the knr10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKNR10() {
        return knr10;
    }

    /**
     * Sets the value of the knr10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKNR10(String value) {
        this.knr10 = value;
    }

    /**
     * Gets the value of the fnr10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNR10() {
        return fnr10;
    }

    /**
     * Sets the value of the fnr10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNR10(String value) {
        this.fnr10 = value;
    }

    /**
     * Gets the value of the fbb10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFBB10() {
        return fbb10;
    }

    /**
     * Sets the value of the fbb10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFBB10(String value) {
        this.fbb10 = value;
    }

    /**
     * Gets the value of the knr11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKNR11() {
        return knr11;
    }

    /**
     * Sets the value of the knr11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKNR11(String value) {
        this.knr11 = value;
    }

    /**
     * Gets the value of the fnr11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNR11() {
        return fnr11;
    }

    /**
     * Sets the value of the fnr11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNR11(String value) {
        this.fnr11 = value;
    }

    /**
     * Gets the value of the fbb11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFBB11() {
        return fbb11;
    }

    /**
     * Sets the value of the fbb11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFBB11(String value) {
        this.fbb11 = value;
    }

    /**
     * Gets the value of the knr12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKNR12() {
        return knr12;
    }

    /**
     * Sets the value of the knr12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKNR12(String value) {
        this.knr12 = value;
    }

    /**
     * Gets the value of the fnr12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNR12() {
        return fnr12;
    }

    /**
     * Sets the value of the fnr12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNR12(String value) {
        this.fnr12 = value;
    }

    /**
     * Gets the value of the fbb12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFBB12() {
        return fbb12;
    }

    /**
     * Sets the value of the fbb12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFBB12(String value) {
        this.fbb12 = value;
    }

    /**
     * Gets the value of the knr13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKNR13() {
        return knr13;
    }

    /**
     * Sets the value of the knr13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKNR13(String value) {
        this.knr13 = value;
    }

    /**
     * Gets the value of the fnr13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNR13() {
        return fnr13;
    }

    /**
     * Sets the value of the fnr13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNR13(String value) {
        this.fnr13 = value;
    }

    /**
     * Gets the value of the fbb13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFBB13() {
        return fbb13;
    }

    /**
     * Sets the value of the fbb13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFBB13(String value) {
        this.fbb13 = value;
    }

    /**
     * Gets the value of the knr14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKNR14() {
        return knr14;
    }

    /**
     * Sets the value of the knr14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKNR14(String value) {
        this.knr14 = value;
    }

    /**
     * Gets the value of the fnr14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNR14() {
        return fnr14;
    }

    /**
     * Sets the value of the fnr14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNR14(String value) {
        this.fnr14 = value;
    }

    /**
     * Gets the value of the fbb14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFBB14() {
        return fbb14;
    }

    /**
     * Sets the value of the fbb14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFBB14(String value) {
        this.fbb14 = value;
    }

    /**
     * Gets the value of the knr15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKNR15() {
        return knr15;
    }

    /**
     * Sets the value of the knr15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKNR15(String value) {
        this.knr15 = value;
    }

    /**
     * Gets the value of the fnr15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNR15() {
        return fnr15;
    }

    /**
     * Sets the value of the fnr15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNR15(String value) {
        this.fnr15 = value;
    }

    /**
     * Gets the value of the fbb15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFBB15() {
        return fbb15;
    }

    /**
     * Sets the value of the fbb15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFBB15(String value) {
        this.fbb15 = value;
    }

    /**
     * Gets the value of the knr16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKNR16() {
        return knr16;
    }

    /**
     * Sets the value of the knr16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKNR16(String value) {
        this.knr16 = value;
    }

    /**
     * Gets the value of the fnr16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNR16() {
        return fnr16;
    }

    /**
     * Sets the value of the fnr16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNR16(String value) {
        this.fnr16 = value;
    }

    /**
     * Gets the value of the fbb16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFBB16() {
        return fbb16;
    }

    /**
     * Sets the value of the fbb16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFBB16(String value) {
        this.fbb16 = value;
    }

    /**
     * Gets the value of the knr17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKNR17() {
        return knr17;
    }

    /**
     * Sets the value of the knr17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKNR17(String value) {
        this.knr17 = value;
    }

    /**
     * Gets the value of the fnr17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNR17() {
        return fnr17;
    }

    /**
     * Sets the value of the fnr17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNR17(String value) {
        this.fnr17 = value;
    }

    /**
     * Gets the value of the fbb17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFBB17() {
        return fbb17;
    }

    /**
     * Sets the value of the fbb17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFBB17(String value) {
        this.fbb17 = value;
    }

    /**
     * Gets the value of the knr18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKNR18() {
        return knr18;
    }

    /**
     * Sets the value of the knr18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKNR18(String value) {
        this.knr18 = value;
    }

    /**
     * Gets the value of the fnr18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNR18() {
        return fnr18;
    }

    /**
     * Sets the value of the fnr18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNR18(String value) {
        this.fnr18 = value;
    }

    /**
     * Gets the value of the fbb18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFBB18() {
        return fbb18;
    }

    /**
     * Sets the value of the fbb18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFBB18(String value) {
        this.fbb18 = value;
    }

    /**
     * Gets the value of the knr19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKNR19() {
        return knr19;
    }

    /**
     * Sets the value of the knr19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKNR19(String value) {
        this.knr19 = value;
    }

    /**
     * Gets the value of the fnr19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNR19() {
        return fnr19;
    }

    /**
     * Sets the value of the fnr19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNR19(String value) {
        this.fnr19 = value;
    }

    /**
     * Gets the value of the fbb19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFBB19() {
        return fbb19;
    }

    /**
     * Sets the value of the fbb19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFBB19(String value) {
        this.fbb19 = value;
    }

    /**
     * Gets the value of the knr20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKNR20() {
        return knr20;
    }

    /**
     * Sets the value of the knr20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKNR20(String value) {
        this.knr20 = value;
    }

    /**
     * Gets the value of the fnr20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNR20() {
        return fnr20;
    }

    /**
     * Sets the value of the fnr20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNR20(String value) {
        this.fnr20 = value;
    }

    /**
     * Gets the value of the fbb20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFBB20() {
        return fbb20;
    }

    /**
     * Sets the value of the fbb20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFBB20(String value) {
        this.fbb20 = value;
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
     * Gets the value of the fbbee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFBBEE() {
        return fbbee;
    }

    /**
     * Sets the value of the fbbee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFBBEE(String value) {
        this.fbbee = value;
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
