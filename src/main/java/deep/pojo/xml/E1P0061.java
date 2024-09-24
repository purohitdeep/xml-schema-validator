
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
 *         &lt;element name="NATSS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EPIGR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GRCOT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BERKT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TICON" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DICON" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HOCON" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NRHIJ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NRHMI" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PEPFI" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PETPC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PENSS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="13"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PESOC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SOILT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SOASV" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EPIG2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INDRE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FERED" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INDFN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NOMAT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PLNSS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PPCG2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PPAT1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PPAT2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PCILT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PCMAT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EXESS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CUOAD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CODES" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FEINI" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INDSU" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RELAB" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NUSST" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CAUSU" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PLPOR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="METOD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RACIN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ALUMB" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="REDJB" minOccurs="0"&gt;
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
 *         &lt;element name="METO2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FERE2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RELEV" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RESOL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RESO2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PLPDE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="COLTR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MREIN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AUTTR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AUTVI" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NISSE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
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
    "natss",
    "epigr",
    "grcot",
    "berkt",
    "ticon",
    "dicon",
    "hocon",
    "nrhij",
    "nrhmi",
    "pepfi",
    "petpc",
    "penss",
    "pesoc",
    "soilt",
    "soasv",
    "epig2",
    "indre",
    "fered",
    "indfn",
    "nomat",
    "plnss",
    "ppcg2",
    "ppat1",
    "ppat2",
    "pcilt",
    "pcmat",
    "exess",
    "cuoad",
    "codes",
    "feini",
    "indsu",
    "relab",
    "nusst",
    "causu",
    "plpor",
    "metod",
    "racin",
    "alumb",
    "redjb",
    "grpvl",
    "meto2",
    "fere2",
    "relev",
    "resol",
    "reso2",
    "plpde",
    "coltr",
    "mrein",
    "auttr",
    "autvi",
    "nisse"
})
public class E1P0061 {

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
    @XmlElement(name = "NATSS")
    protected String natss;
    @XmlElement(name = "EPIGR")
    protected String epigr;
    @XmlElement(name = "GRCOT")
    protected String grcot;
    @XmlElement(name = "BERKT")
    protected String berkt;
    @XmlElement(name = "TICON")
    protected String ticon;
    @XmlElement(name = "DICON")
    protected String dicon;
    @XmlElement(name = "HOCON")
    protected String hocon;
    @XmlElement(name = "NRHIJ")
    protected String nrhij;
    @XmlElement(name = "NRHMI")
    protected String nrhmi;
    @XmlElement(name = "PEPFI")
    protected String pepfi;
    @XmlElement(name = "PETPC")
    protected String petpc;
    @XmlElement(name = "PENSS")
    protected String penss;
    @XmlElement(name = "PESOC")
    protected String pesoc;
    @XmlElement(name = "SOILT")
    protected String soilt;
    @XmlElement(name = "SOASV")
    protected String soasv;
    @XmlElement(name = "EPIG2")
    protected String epig2;
    @XmlElement(name = "INDRE")
    protected String indre;
    @XmlElement(name = "FERED")
    protected String fered;
    @XmlElement(name = "INDFN")
    protected String indfn;
    @XmlElement(name = "NOMAT")
    protected String nomat;
    @XmlElement(name = "PLNSS")
    protected String plnss;
    @XmlElement(name = "PPCG2")
    protected String ppcg2;
    @XmlElement(name = "PPAT1")
    protected String ppat1;
    @XmlElement(name = "PPAT2")
    protected String ppat2;
    @XmlElement(name = "PCILT")
    protected String pcilt;
    @XmlElement(name = "PCMAT")
    protected String pcmat;
    @XmlElement(name = "EXESS")
    protected String exess;
    @XmlElement(name = "CUOAD")
    protected String cuoad;
    @XmlElement(name = "CODES")
    protected String codes;
    @XmlElement(name = "FEINI")
    protected String feini;
    @XmlElement(name = "INDSU")
    protected String indsu;
    @XmlElement(name = "RELAB")
    protected String relab;
    @XmlElement(name = "NUSST")
    protected String nusst;
    @XmlElement(name = "CAUSU")
    protected String causu;
    @XmlElement(name = "PLPOR")
    protected String plpor;
    @XmlElement(name = "METOD")
    protected String metod;
    @XmlElement(name = "RACIN")
    protected String racin;
    @XmlElement(name = "ALUMB")
    protected String alumb;
    @XmlElement(name = "REDJB")
    protected String redjb;
    @XmlElement(name = "GRPVL")
    protected String grpvl;
    @XmlElement(name = "METO2")
    protected String meto2;
    @XmlElement(name = "FERE2")
    protected String fere2;
    @XmlElement(name = "RELEV")
    protected String relev;
    @XmlElement(name = "RESOL")
    protected String resol;
    @XmlElement(name = "RESO2")
    protected String reso2;
    @XmlElement(name = "PLPDE")
    protected String plpde;
    @XmlElement(name = "COLTR")
    protected String coltr;
    @XmlElement(name = "MREIN")
    protected String mrein;
    @XmlElement(name = "AUTTR")
    protected String auttr;
    @XmlElement(name = "AUTVI")
    protected String autvi;
    @XmlElement(name = "NISSE")
    protected String nisse;
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
     * Gets the value of the natss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNATSS() {
        return natss;
    }

    /**
     * Sets the value of the natss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNATSS(String value) {
        this.natss = value;
    }

    /**
     * Gets the value of the epigr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEPIGR() {
        return epigr;
    }

    /**
     * Sets the value of the epigr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEPIGR(String value) {
        this.epigr = value;
    }

    /**
     * Gets the value of the grcot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRCOT() {
        return grcot;
    }

    /**
     * Sets the value of the grcot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRCOT(String value) {
        this.grcot = value;
    }

    /**
     * Gets the value of the berkt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBERKT() {
        return berkt;
    }

    /**
     * Sets the value of the berkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBERKT(String value) {
        this.berkt = value;
    }

    /**
     * Gets the value of the ticon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTICON() {
        return ticon;
    }

    /**
     * Sets the value of the ticon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTICON(String value) {
        this.ticon = value;
    }

    /**
     * Gets the value of the dicon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDICON() {
        return dicon;
    }

    /**
     * Sets the value of the dicon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDICON(String value) {
        this.dicon = value;
    }

    /**
     * Gets the value of the hocon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOCON() {
        return hocon;
    }

    /**
     * Sets the value of the hocon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOCON(String value) {
        this.hocon = value;
    }

    /**
     * Gets the value of the nrhij property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRHIJ() {
        return nrhij;
    }

    /**
     * Sets the value of the nrhij property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRHIJ(String value) {
        this.nrhij = value;
    }

    /**
     * Gets the value of the nrhmi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRHMI() {
        return nrhmi;
    }

    /**
     * Sets the value of the nrhmi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRHMI(String value) {
        this.nrhmi = value;
    }

    /**
     * Gets the value of the pepfi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPEPFI() {
        return pepfi;
    }

    /**
     * Sets the value of the pepfi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPEPFI(String value) {
        this.pepfi = value;
    }

    /**
     * Gets the value of the petpc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPETPC() {
        return petpc;
    }

    /**
     * Sets the value of the petpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPETPC(String value) {
        this.petpc = value;
    }

    /**
     * Gets the value of the penss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPENSS() {
        return penss;
    }

    /**
     * Sets the value of the penss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPENSS(String value) {
        this.penss = value;
    }

    /**
     * Gets the value of the pesoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPESOC() {
        return pesoc;
    }

    /**
     * Sets the value of the pesoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPESOC(String value) {
        this.pesoc = value;
    }

    /**
     * Gets the value of the soilt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOILT() {
        return soilt;
    }

    /**
     * Sets the value of the soilt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOILT(String value) {
        this.soilt = value;
    }

    /**
     * Gets the value of the soasv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOASV() {
        return soasv;
    }

    /**
     * Sets the value of the soasv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOASV(String value) {
        this.soasv = value;
    }

    /**
     * Gets the value of the epig2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEPIG2() {
        return epig2;
    }

    /**
     * Sets the value of the epig2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEPIG2(String value) {
        this.epig2 = value;
    }

    /**
     * Gets the value of the indre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDRE() {
        return indre;
    }

    /**
     * Sets the value of the indre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDRE(String value) {
        this.indre = value;
    }

    /**
     * Gets the value of the fered property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFERED() {
        return fered;
    }

    /**
     * Sets the value of the fered property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFERED(String value) {
        this.fered = value;
    }

    /**
     * Gets the value of the indfn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDFN() {
        return indfn;
    }

    /**
     * Sets the value of the indfn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDFN(String value) {
        this.indfn = value;
    }

    /**
     * Gets the value of the nomat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMAT() {
        return nomat;
    }

    /**
     * Sets the value of the nomat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMAT(String value) {
        this.nomat = value;
    }

    /**
     * Gets the value of the plnss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLNSS() {
        return plnss;
    }

    /**
     * Sets the value of the plnss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLNSS(String value) {
        this.plnss = value;
    }

    /**
     * Gets the value of the ppcg2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPCG2() {
        return ppcg2;
    }

    /**
     * Sets the value of the ppcg2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPCG2(String value) {
        this.ppcg2 = value;
    }

    /**
     * Gets the value of the ppat1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPAT1() {
        return ppat1;
    }

    /**
     * Sets the value of the ppat1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPAT1(String value) {
        this.ppat1 = value;
    }

    /**
     * Gets the value of the ppat2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPAT2() {
        return ppat2;
    }

    /**
     * Sets the value of the ppat2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPAT2(String value) {
        this.ppat2 = value;
    }

    /**
     * Gets the value of the pcilt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCILT() {
        return pcilt;
    }

    /**
     * Sets the value of the pcilt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCILT(String value) {
        this.pcilt = value;
    }

    /**
     * Gets the value of the pcmat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCMAT() {
        return pcmat;
    }

    /**
     * Sets the value of the pcmat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCMAT(String value) {
        this.pcmat = value;
    }

    /**
     * Gets the value of the exess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXESS() {
        return exess;
    }

    /**
     * Sets the value of the exess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXESS(String value) {
        this.exess = value;
    }

    /**
     * Gets the value of the cuoad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUOAD() {
        return cuoad;
    }

    /**
     * Sets the value of the cuoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUOAD(String value) {
        this.cuoad = value;
    }

    /**
     * Gets the value of the codes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODES() {
        return codes;
    }

    /**
     * Sets the value of the codes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODES(String value) {
        this.codes = value;
    }

    /**
     * Gets the value of the feini property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFEINI() {
        return feini;
    }

    /**
     * Sets the value of the feini property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFEINI(String value) {
        this.feini = value;
    }

    /**
     * Gets the value of the indsu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDSU() {
        return indsu;
    }

    /**
     * Sets the value of the indsu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDSU(String value) {
        this.indsu = value;
    }

    /**
     * Gets the value of the relab property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRELAB() {
        return relab;
    }

    /**
     * Sets the value of the relab property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRELAB(String value) {
        this.relab = value;
    }

    /**
     * Gets the value of the nusst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUSST() {
        return nusst;
    }

    /**
     * Sets the value of the nusst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUSST(String value) {
        this.nusst = value;
    }

    /**
     * Gets the value of the causu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAUSU() {
        return causu;
    }

    /**
     * Sets the value of the causu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAUSU(String value) {
        this.causu = value;
    }

    /**
     * Gets the value of the plpor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLPOR() {
        return plpor;
    }

    /**
     * Sets the value of the plpor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLPOR(String value) {
        this.plpor = value;
    }

    /**
     * Gets the value of the metod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMETOD() {
        return metod;
    }

    /**
     * Sets the value of the metod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMETOD(String value) {
        this.metod = value;
    }

    /**
     * Gets the value of the racin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRACIN() {
        return racin;
    }

    /**
     * Sets the value of the racin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRACIN(String value) {
        this.racin = value;
    }

    /**
     * Gets the value of the alumb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALUMB() {
        return alumb;
    }

    /**
     * Sets the value of the alumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALUMB(String value) {
        this.alumb = value;
    }

    /**
     * Gets the value of the redjb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREDJB() {
        return redjb;
    }

    /**
     * Sets the value of the redjb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREDJB(String value) {
        this.redjb = value;
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
     * Gets the value of the meto2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMETO2() {
        return meto2;
    }

    /**
     * Sets the value of the meto2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMETO2(String value) {
        this.meto2 = value;
    }

    /**
     * Gets the value of the fere2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFERE2() {
        return fere2;
    }

    /**
     * Sets the value of the fere2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFERE2(String value) {
        this.fere2 = value;
    }

    /**
     * Gets the value of the relev property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRELEV() {
        return relev;
    }

    /**
     * Sets the value of the relev property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRELEV(String value) {
        this.relev = value;
    }

    /**
     * Gets the value of the resol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESOL() {
        return resol;
    }

    /**
     * Sets the value of the resol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESOL(String value) {
        this.resol = value;
    }

    /**
     * Gets the value of the reso2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESO2() {
        return reso2;
    }

    /**
     * Sets the value of the reso2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESO2(String value) {
        this.reso2 = value;
    }

    /**
     * Gets the value of the plpde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLPDE() {
        return plpde;
    }

    /**
     * Sets the value of the plpde property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLPDE(String value) {
        this.plpde = value;
    }

    /**
     * Gets the value of the coltr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOLTR() {
        return coltr;
    }

    /**
     * Sets the value of the coltr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOLTR(String value) {
        this.coltr = value;
    }

    /**
     * Gets the value of the mrein property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMREIN() {
        return mrein;
    }

    /**
     * Sets the value of the mrein property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMREIN(String value) {
        this.mrein = value;
    }

    /**
     * Gets the value of the auttr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTTR() {
        return auttr;
    }

    /**
     * Sets the value of the auttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTTR(String value) {
        this.auttr = value;
    }

    /**
     * Gets the value of the autvi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTVI() {
        return autvi;
    }

    /**
     * Sets the value of the autvi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTVI(String value) {
        this.autvi = value;
    }

    /**
     * Gets the value of the nisse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNISSE() {
        return nisse;
    }

    /**
     * Sets the value of the nisse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNISSE(String value) {
        this.nisse = value;
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
