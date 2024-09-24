
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
 *         &lt;element name="EXDAT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LXDAT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RESUL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DIANR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SBJ01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JNF01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NMF01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTF01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WTF01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SBJ02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JNF02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NMF02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTF02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WTF02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SBJ03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JNF03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NMF03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTF03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WTF03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SBJ04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JNF04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NMF04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTF04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WTF04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SBJ05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JNF05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NMF05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTF05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WTF05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SBJ06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JNF06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NMF06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTF06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WTF06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SBJ07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JNF07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NMF07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTF07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WTF07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SBJ08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JNF08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NMF08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTF08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WTF08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SBJ09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JNF09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NMF09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTF09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WTF09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SBJ10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JNF10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NMF10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTF10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WTF10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SBJ11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JNF11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NMF11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTF11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WTF11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SBJ12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JNF12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NMF12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTF12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WTF12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SBJ13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JNF13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NMF13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTF13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WTF13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SBJ14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JNF14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NMF14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTF14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WTF14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SBJ15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JNF15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NMF15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTF15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WTF15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SBJ16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JNF16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NMF16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTF16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WTF16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SBJ17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JNF17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NMF17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTF17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WTF17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SBJ18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JNF18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NMF18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTF18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WTF18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SBJ19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JNF19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NMF19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTF19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WTF19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SBJ20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JNF20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NMF20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTF20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WTF20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SBJ21" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JNF21" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NMF21" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTF21" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WTF21" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SBJ22" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JNF22" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NMF22" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTF22" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WTF22" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SBJ23" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JNF23" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NMF23" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTF23" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WTF23" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SBJ24" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JNF24" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NMF24" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTF24" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WTF24" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SBJ25" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JNF25" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NMF25" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTF25" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WTF25" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SBJ26" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JNF26" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NMF26" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTF26" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WTF26" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SBJ27" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JNF27" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NMF27" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTF27" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WTF27" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SBJ28" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JNF28" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NMF28" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DTF28" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WTF28" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="E1Q0028" minOccurs="0"&gt;
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
 *                   &lt;element name="SBJ29" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="JNF29" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NMF29" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="11"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="DTF29" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="WTF29" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SBJ30" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="JNF30" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NMF30" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="11"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="DTF30" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="WTF30" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="EXTYP" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
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
    "exdat",
    "lxdat",
    "resul",
    "dianr",
    "sbj01",
    "jnf01",
    "nmf01",
    "dtf01",
    "wtf01",
    "sbj02",
    "jnf02",
    "nmf02",
    "dtf02",
    "wtf02",
    "sbj03",
    "jnf03",
    "nmf03",
    "dtf03",
    "wtf03",
    "sbj04",
    "jnf04",
    "nmf04",
    "dtf04",
    "wtf04",
    "sbj05",
    "jnf05",
    "nmf05",
    "dtf05",
    "wtf05",
    "sbj06",
    "jnf06",
    "nmf06",
    "dtf06",
    "wtf06",
    "sbj07",
    "jnf07",
    "nmf07",
    "dtf07",
    "wtf07",
    "sbj08",
    "jnf08",
    "nmf08",
    "dtf08",
    "wtf08",
    "sbj09",
    "jnf09",
    "nmf09",
    "dtf09",
    "wtf09",
    "sbj10",
    "jnf10",
    "nmf10",
    "dtf10",
    "wtf10",
    "sbj11",
    "jnf11",
    "nmf11",
    "dtf11",
    "wtf11",
    "sbj12",
    "jnf12",
    "nmf12",
    "dtf12",
    "wtf12",
    "sbj13",
    "jnf13",
    "nmf13",
    "dtf13",
    "wtf13",
    "sbj14",
    "jnf14",
    "nmf14",
    "dtf14",
    "wtf14",
    "sbj15",
    "jnf15",
    "nmf15",
    "dtf15",
    "wtf15",
    "sbj16",
    "jnf16",
    "nmf16",
    "dtf16",
    "wtf16",
    "sbj17",
    "jnf17",
    "nmf17",
    "dtf17",
    "wtf17",
    "sbj18",
    "jnf18",
    "nmf18",
    "dtf18",
    "wtf18",
    "sbj19",
    "jnf19",
    "nmf19",
    "dtf19",
    "wtf19",
    "sbj20",
    "jnf20",
    "nmf20",
    "dtf20",
    "wtf20",
    "sbj21",
    "jnf21",
    "nmf21",
    "dtf21",
    "wtf21",
    "sbj22",
    "jnf22",
    "nmf22",
    "dtf22",
    "wtf22",
    "sbj23",
    "jnf23",
    "nmf23",
    "dtf23",
    "wtf23",
    "sbj24",
    "jnf24",
    "nmf24",
    "dtf24",
    "wtf24",
    "sbj25",
    "jnf25",
    "nmf25",
    "dtf25",
    "wtf25",
    "sbj26",
    "jnf26",
    "nmf26",
    "dtf26",
    "wtf26",
    "sbj27",
    "jnf27",
    "nmf27",
    "dtf27",
    "wtf27",
    "sbj28",
    "jnf28",
    "nmf28",
    "dtf28",
    "wtf28",
    "e1Q0028"
})
public class E1P0028 {

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
    @XmlElement(name = "EXDAT")
    protected String exdat;
    @XmlElement(name = "LXDAT")
    protected String lxdat;
    @XmlElement(name = "RESUL")
    protected String resul;
    @XmlElement(name = "DIANR")
    protected String dianr;
    @XmlElement(name = "SBJ01")
    protected String sbj01;
    @XmlElement(name = "JNF01")
    protected String jnf01;
    @XmlElement(name = "NMF01")
    protected String nmf01;
    @XmlElement(name = "DTF01")
    protected String dtf01;
    @XmlElement(name = "WTF01")
    protected String wtf01;
    @XmlElement(name = "SBJ02")
    protected String sbj02;
    @XmlElement(name = "JNF02")
    protected String jnf02;
    @XmlElement(name = "NMF02")
    protected String nmf02;
    @XmlElement(name = "DTF02")
    protected String dtf02;
    @XmlElement(name = "WTF02")
    protected String wtf02;
    @XmlElement(name = "SBJ03")
    protected String sbj03;
    @XmlElement(name = "JNF03")
    protected String jnf03;
    @XmlElement(name = "NMF03")
    protected String nmf03;
    @XmlElement(name = "DTF03")
    protected String dtf03;
    @XmlElement(name = "WTF03")
    protected String wtf03;
    @XmlElement(name = "SBJ04")
    protected String sbj04;
    @XmlElement(name = "JNF04")
    protected String jnf04;
    @XmlElement(name = "NMF04")
    protected String nmf04;
    @XmlElement(name = "DTF04")
    protected String dtf04;
    @XmlElement(name = "WTF04")
    protected String wtf04;
    @XmlElement(name = "SBJ05")
    protected String sbj05;
    @XmlElement(name = "JNF05")
    protected String jnf05;
    @XmlElement(name = "NMF05")
    protected String nmf05;
    @XmlElement(name = "DTF05")
    protected String dtf05;
    @XmlElement(name = "WTF05")
    protected String wtf05;
    @XmlElement(name = "SBJ06")
    protected String sbj06;
    @XmlElement(name = "JNF06")
    protected String jnf06;
    @XmlElement(name = "NMF06")
    protected String nmf06;
    @XmlElement(name = "DTF06")
    protected String dtf06;
    @XmlElement(name = "WTF06")
    protected String wtf06;
    @XmlElement(name = "SBJ07")
    protected String sbj07;
    @XmlElement(name = "JNF07")
    protected String jnf07;
    @XmlElement(name = "NMF07")
    protected String nmf07;
    @XmlElement(name = "DTF07")
    protected String dtf07;
    @XmlElement(name = "WTF07")
    protected String wtf07;
    @XmlElement(name = "SBJ08")
    protected String sbj08;
    @XmlElement(name = "JNF08")
    protected String jnf08;
    @XmlElement(name = "NMF08")
    protected String nmf08;
    @XmlElement(name = "DTF08")
    protected String dtf08;
    @XmlElement(name = "WTF08")
    protected String wtf08;
    @XmlElement(name = "SBJ09")
    protected String sbj09;
    @XmlElement(name = "JNF09")
    protected String jnf09;
    @XmlElement(name = "NMF09")
    protected String nmf09;
    @XmlElement(name = "DTF09")
    protected String dtf09;
    @XmlElement(name = "WTF09")
    protected String wtf09;
    @XmlElement(name = "SBJ10")
    protected String sbj10;
    @XmlElement(name = "JNF10")
    protected String jnf10;
    @XmlElement(name = "NMF10")
    protected String nmf10;
    @XmlElement(name = "DTF10")
    protected String dtf10;
    @XmlElement(name = "WTF10")
    protected String wtf10;
    @XmlElement(name = "SBJ11")
    protected String sbj11;
    @XmlElement(name = "JNF11")
    protected String jnf11;
    @XmlElement(name = "NMF11")
    protected String nmf11;
    @XmlElement(name = "DTF11")
    protected String dtf11;
    @XmlElement(name = "WTF11")
    protected String wtf11;
    @XmlElement(name = "SBJ12")
    protected String sbj12;
    @XmlElement(name = "JNF12")
    protected String jnf12;
    @XmlElement(name = "NMF12")
    protected String nmf12;
    @XmlElement(name = "DTF12")
    protected String dtf12;
    @XmlElement(name = "WTF12")
    protected String wtf12;
    @XmlElement(name = "SBJ13")
    protected String sbj13;
    @XmlElement(name = "JNF13")
    protected String jnf13;
    @XmlElement(name = "NMF13")
    protected String nmf13;
    @XmlElement(name = "DTF13")
    protected String dtf13;
    @XmlElement(name = "WTF13")
    protected String wtf13;
    @XmlElement(name = "SBJ14")
    protected String sbj14;
    @XmlElement(name = "JNF14")
    protected String jnf14;
    @XmlElement(name = "NMF14")
    protected String nmf14;
    @XmlElement(name = "DTF14")
    protected String dtf14;
    @XmlElement(name = "WTF14")
    protected String wtf14;
    @XmlElement(name = "SBJ15")
    protected String sbj15;
    @XmlElement(name = "JNF15")
    protected String jnf15;
    @XmlElement(name = "NMF15")
    protected String nmf15;
    @XmlElement(name = "DTF15")
    protected String dtf15;
    @XmlElement(name = "WTF15")
    protected String wtf15;
    @XmlElement(name = "SBJ16")
    protected String sbj16;
    @XmlElement(name = "JNF16")
    protected String jnf16;
    @XmlElement(name = "NMF16")
    protected String nmf16;
    @XmlElement(name = "DTF16")
    protected String dtf16;
    @XmlElement(name = "WTF16")
    protected String wtf16;
    @XmlElement(name = "SBJ17")
    protected String sbj17;
    @XmlElement(name = "JNF17")
    protected String jnf17;
    @XmlElement(name = "NMF17")
    protected String nmf17;
    @XmlElement(name = "DTF17")
    protected String dtf17;
    @XmlElement(name = "WTF17")
    protected String wtf17;
    @XmlElement(name = "SBJ18")
    protected String sbj18;
    @XmlElement(name = "JNF18")
    protected String jnf18;
    @XmlElement(name = "NMF18")
    protected String nmf18;
    @XmlElement(name = "DTF18")
    protected String dtf18;
    @XmlElement(name = "WTF18")
    protected String wtf18;
    @XmlElement(name = "SBJ19")
    protected String sbj19;
    @XmlElement(name = "JNF19")
    protected String jnf19;
    @XmlElement(name = "NMF19")
    protected String nmf19;
    @XmlElement(name = "DTF19")
    protected String dtf19;
    @XmlElement(name = "WTF19")
    protected String wtf19;
    @XmlElement(name = "SBJ20")
    protected String sbj20;
    @XmlElement(name = "JNF20")
    protected String jnf20;
    @XmlElement(name = "NMF20")
    protected String nmf20;
    @XmlElement(name = "DTF20")
    protected String dtf20;
    @XmlElement(name = "WTF20")
    protected String wtf20;
    @XmlElement(name = "SBJ21")
    protected String sbj21;
    @XmlElement(name = "JNF21")
    protected String jnf21;
    @XmlElement(name = "NMF21")
    protected String nmf21;
    @XmlElement(name = "DTF21")
    protected String dtf21;
    @XmlElement(name = "WTF21")
    protected String wtf21;
    @XmlElement(name = "SBJ22")
    protected String sbj22;
    @XmlElement(name = "JNF22")
    protected String jnf22;
    @XmlElement(name = "NMF22")
    protected String nmf22;
    @XmlElement(name = "DTF22")
    protected String dtf22;
    @XmlElement(name = "WTF22")
    protected String wtf22;
    @XmlElement(name = "SBJ23")
    protected String sbj23;
    @XmlElement(name = "JNF23")
    protected String jnf23;
    @XmlElement(name = "NMF23")
    protected String nmf23;
    @XmlElement(name = "DTF23")
    protected String dtf23;
    @XmlElement(name = "WTF23")
    protected String wtf23;
    @XmlElement(name = "SBJ24")
    protected String sbj24;
    @XmlElement(name = "JNF24")
    protected String jnf24;
    @XmlElement(name = "NMF24")
    protected String nmf24;
    @XmlElement(name = "DTF24")
    protected String dtf24;
    @XmlElement(name = "WTF24")
    protected String wtf24;
    @XmlElement(name = "SBJ25")
    protected String sbj25;
    @XmlElement(name = "JNF25")
    protected String jnf25;
    @XmlElement(name = "NMF25")
    protected String nmf25;
    @XmlElement(name = "DTF25")
    protected String dtf25;
    @XmlElement(name = "WTF25")
    protected String wtf25;
    @XmlElement(name = "SBJ26")
    protected String sbj26;
    @XmlElement(name = "JNF26")
    protected String jnf26;
    @XmlElement(name = "NMF26")
    protected String nmf26;
    @XmlElement(name = "DTF26")
    protected String dtf26;
    @XmlElement(name = "WTF26")
    protected String wtf26;
    @XmlElement(name = "SBJ27")
    protected String sbj27;
    @XmlElement(name = "JNF27")
    protected String jnf27;
    @XmlElement(name = "NMF27")
    protected String nmf27;
    @XmlElement(name = "DTF27")
    protected String dtf27;
    @XmlElement(name = "WTF27")
    protected String wtf27;
    @XmlElement(name = "SBJ28")
    protected String sbj28;
    @XmlElement(name = "JNF28")
    protected String jnf28;
    @XmlElement(name = "NMF28")
    protected String nmf28;
    @XmlElement(name = "DTF28")
    protected String dtf28;
    @XmlElement(name = "WTF28")
    protected String wtf28;
    @XmlElement(name = "E1Q0028")
    protected E1Q0028 e1Q0028;
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
     * Gets the value of the exdat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXDAT() {
        return exdat;
    }

    /**
     * Sets the value of the exdat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXDAT(String value) {
        this.exdat = value;
    }

    /**
     * Gets the value of the lxdat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLXDAT() {
        return lxdat;
    }

    /**
     * Sets the value of the lxdat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLXDAT(String value) {
        this.lxdat = value;
    }

    /**
     * Gets the value of the resul property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESUL() {
        return resul;
    }

    /**
     * Sets the value of the resul property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESUL(String value) {
        this.resul = value;
    }

    /**
     * Gets the value of the dianr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIANR() {
        return dianr;
    }

    /**
     * Sets the value of the dianr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIANR(String value) {
        this.dianr = value;
    }

    /**
     * Gets the value of the sbj01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBJ01() {
        return sbj01;
    }

    /**
     * Sets the value of the sbj01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBJ01(String value) {
        this.sbj01 = value;
    }

    /**
     * Gets the value of the jnf01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJNF01() {
        return jnf01;
    }

    /**
     * Sets the value of the jnf01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJNF01(String value) {
        this.jnf01 = value;
    }

    /**
     * Gets the value of the nmf01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMF01() {
        return nmf01;
    }

    /**
     * Sets the value of the nmf01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMF01(String value) {
        this.nmf01 = value;
    }

    /**
     * Gets the value of the dtf01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTF01() {
        return dtf01;
    }

    /**
     * Sets the value of the dtf01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTF01(String value) {
        this.dtf01 = value;
    }

    /**
     * Gets the value of the wtf01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWTF01() {
        return wtf01;
    }

    /**
     * Sets the value of the wtf01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWTF01(String value) {
        this.wtf01 = value;
    }

    /**
     * Gets the value of the sbj02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBJ02() {
        return sbj02;
    }

    /**
     * Sets the value of the sbj02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBJ02(String value) {
        this.sbj02 = value;
    }

    /**
     * Gets the value of the jnf02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJNF02() {
        return jnf02;
    }

    /**
     * Sets the value of the jnf02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJNF02(String value) {
        this.jnf02 = value;
    }

    /**
     * Gets the value of the nmf02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMF02() {
        return nmf02;
    }

    /**
     * Sets the value of the nmf02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMF02(String value) {
        this.nmf02 = value;
    }

    /**
     * Gets the value of the dtf02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTF02() {
        return dtf02;
    }

    /**
     * Sets the value of the dtf02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTF02(String value) {
        this.dtf02 = value;
    }

    /**
     * Gets the value of the wtf02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWTF02() {
        return wtf02;
    }

    /**
     * Sets the value of the wtf02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWTF02(String value) {
        this.wtf02 = value;
    }

    /**
     * Gets the value of the sbj03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBJ03() {
        return sbj03;
    }

    /**
     * Sets the value of the sbj03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBJ03(String value) {
        this.sbj03 = value;
    }

    /**
     * Gets the value of the jnf03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJNF03() {
        return jnf03;
    }

    /**
     * Sets the value of the jnf03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJNF03(String value) {
        this.jnf03 = value;
    }

    /**
     * Gets the value of the nmf03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMF03() {
        return nmf03;
    }

    /**
     * Sets the value of the nmf03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMF03(String value) {
        this.nmf03 = value;
    }

    /**
     * Gets the value of the dtf03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTF03() {
        return dtf03;
    }

    /**
     * Sets the value of the dtf03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTF03(String value) {
        this.dtf03 = value;
    }

    /**
     * Gets the value of the wtf03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWTF03() {
        return wtf03;
    }

    /**
     * Sets the value of the wtf03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWTF03(String value) {
        this.wtf03 = value;
    }

    /**
     * Gets the value of the sbj04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBJ04() {
        return sbj04;
    }

    /**
     * Sets the value of the sbj04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBJ04(String value) {
        this.sbj04 = value;
    }

    /**
     * Gets the value of the jnf04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJNF04() {
        return jnf04;
    }

    /**
     * Sets the value of the jnf04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJNF04(String value) {
        this.jnf04 = value;
    }

    /**
     * Gets the value of the nmf04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMF04() {
        return nmf04;
    }

    /**
     * Sets the value of the nmf04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMF04(String value) {
        this.nmf04 = value;
    }

    /**
     * Gets the value of the dtf04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTF04() {
        return dtf04;
    }

    /**
     * Sets the value of the dtf04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTF04(String value) {
        this.dtf04 = value;
    }

    /**
     * Gets the value of the wtf04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWTF04() {
        return wtf04;
    }

    /**
     * Sets the value of the wtf04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWTF04(String value) {
        this.wtf04 = value;
    }

    /**
     * Gets the value of the sbj05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBJ05() {
        return sbj05;
    }

    /**
     * Sets the value of the sbj05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBJ05(String value) {
        this.sbj05 = value;
    }

    /**
     * Gets the value of the jnf05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJNF05() {
        return jnf05;
    }

    /**
     * Sets the value of the jnf05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJNF05(String value) {
        this.jnf05 = value;
    }

    /**
     * Gets the value of the nmf05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMF05() {
        return nmf05;
    }

    /**
     * Sets the value of the nmf05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMF05(String value) {
        this.nmf05 = value;
    }

    /**
     * Gets the value of the dtf05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTF05() {
        return dtf05;
    }

    /**
     * Sets the value of the dtf05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTF05(String value) {
        this.dtf05 = value;
    }

    /**
     * Gets the value of the wtf05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWTF05() {
        return wtf05;
    }

    /**
     * Sets the value of the wtf05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWTF05(String value) {
        this.wtf05 = value;
    }

    /**
     * Gets the value of the sbj06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBJ06() {
        return sbj06;
    }

    /**
     * Sets the value of the sbj06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBJ06(String value) {
        this.sbj06 = value;
    }

    /**
     * Gets the value of the jnf06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJNF06() {
        return jnf06;
    }

    /**
     * Sets the value of the jnf06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJNF06(String value) {
        this.jnf06 = value;
    }

    /**
     * Gets the value of the nmf06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMF06() {
        return nmf06;
    }

    /**
     * Sets the value of the nmf06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMF06(String value) {
        this.nmf06 = value;
    }

    /**
     * Gets the value of the dtf06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTF06() {
        return dtf06;
    }

    /**
     * Sets the value of the dtf06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTF06(String value) {
        this.dtf06 = value;
    }

    /**
     * Gets the value of the wtf06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWTF06() {
        return wtf06;
    }

    /**
     * Sets the value of the wtf06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWTF06(String value) {
        this.wtf06 = value;
    }

    /**
     * Gets the value of the sbj07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBJ07() {
        return sbj07;
    }

    /**
     * Sets the value of the sbj07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBJ07(String value) {
        this.sbj07 = value;
    }

    /**
     * Gets the value of the jnf07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJNF07() {
        return jnf07;
    }

    /**
     * Sets the value of the jnf07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJNF07(String value) {
        this.jnf07 = value;
    }

    /**
     * Gets the value of the nmf07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMF07() {
        return nmf07;
    }

    /**
     * Sets the value of the nmf07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMF07(String value) {
        this.nmf07 = value;
    }

    /**
     * Gets the value of the dtf07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTF07() {
        return dtf07;
    }

    /**
     * Sets the value of the dtf07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTF07(String value) {
        this.dtf07 = value;
    }

    /**
     * Gets the value of the wtf07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWTF07() {
        return wtf07;
    }

    /**
     * Sets the value of the wtf07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWTF07(String value) {
        this.wtf07 = value;
    }

    /**
     * Gets the value of the sbj08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBJ08() {
        return sbj08;
    }

    /**
     * Sets the value of the sbj08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBJ08(String value) {
        this.sbj08 = value;
    }

    /**
     * Gets the value of the jnf08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJNF08() {
        return jnf08;
    }

    /**
     * Sets the value of the jnf08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJNF08(String value) {
        this.jnf08 = value;
    }

    /**
     * Gets the value of the nmf08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMF08() {
        return nmf08;
    }

    /**
     * Sets the value of the nmf08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMF08(String value) {
        this.nmf08 = value;
    }

    /**
     * Gets the value of the dtf08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTF08() {
        return dtf08;
    }

    /**
     * Sets the value of the dtf08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTF08(String value) {
        this.dtf08 = value;
    }

    /**
     * Gets the value of the wtf08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWTF08() {
        return wtf08;
    }

    /**
     * Sets the value of the wtf08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWTF08(String value) {
        this.wtf08 = value;
    }

    /**
     * Gets the value of the sbj09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBJ09() {
        return sbj09;
    }

    /**
     * Sets the value of the sbj09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBJ09(String value) {
        this.sbj09 = value;
    }

    /**
     * Gets the value of the jnf09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJNF09() {
        return jnf09;
    }

    /**
     * Sets the value of the jnf09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJNF09(String value) {
        this.jnf09 = value;
    }

    /**
     * Gets the value of the nmf09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMF09() {
        return nmf09;
    }

    /**
     * Sets the value of the nmf09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMF09(String value) {
        this.nmf09 = value;
    }

    /**
     * Gets the value of the dtf09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTF09() {
        return dtf09;
    }

    /**
     * Sets the value of the dtf09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTF09(String value) {
        this.dtf09 = value;
    }

    /**
     * Gets the value of the wtf09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWTF09() {
        return wtf09;
    }

    /**
     * Sets the value of the wtf09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWTF09(String value) {
        this.wtf09 = value;
    }

    /**
     * Gets the value of the sbj10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBJ10() {
        return sbj10;
    }

    /**
     * Sets the value of the sbj10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBJ10(String value) {
        this.sbj10 = value;
    }

    /**
     * Gets the value of the jnf10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJNF10() {
        return jnf10;
    }

    /**
     * Sets the value of the jnf10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJNF10(String value) {
        this.jnf10 = value;
    }

    /**
     * Gets the value of the nmf10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMF10() {
        return nmf10;
    }

    /**
     * Sets the value of the nmf10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMF10(String value) {
        this.nmf10 = value;
    }

    /**
     * Gets the value of the dtf10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTF10() {
        return dtf10;
    }

    /**
     * Sets the value of the dtf10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTF10(String value) {
        this.dtf10 = value;
    }

    /**
     * Gets the value of the wtf10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWTF10() {
        return wtf10;
    }

    /**
     * Sets the value of the wtf10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWTF10(String value) {
        this.wtf10 = value;
    }

    /**
     * Gets the value of the sbj11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBJ11() {
        return sbj11;
    }

    /**
     * Sets the value of the sbj11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBJ11(String value) {
        this.sbj11 = value;
    }

    /**
     * Gets the value of the jnf11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJNF11() {
        return jnf11;
    }

    /**
     * Sets the value of the jnf11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJNF11(String value) {
        this.jnf11 = value;
    }

    /**
     * Gets the value of the nmf11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMF11() {
        return nmf11;
    }

    /**
     * Sets the value of the nmf11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMF11(String value) {
        this.nmf11 = value;
    }

    /**
     * Gets the value of the dtf11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTF11() {
        return dtf11;
    }

    /**
     * Sets the value of the dtf11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTF11(String value) {
        this.dtf11 = value;
    }

    /**
     * Gets the value of the wtf11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWTF11() {
        return wtf11;
    }

    /**
     * Sets the value of the wtf11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWTF11(String value) {
        this.wtf11 = value;
    }

    /**
     * Gets the value of the sbj12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBJ12() {
        return sbj12;
    }

    /**
     * Sets the value of the sbj12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBJ12(String value) {
        this.sbj12 = value;
    }

    /**
     * Gets the value of the jnf12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJNF12() {
        return jnf12;
    }

    /**
     * Sets the value of the jnf12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJNF12(String value) {
        this.jnf12 = value;
    }

    /**
     * Gets the value of the nmf12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMF12() {
        return nmf12;
    }

    /**
     * Sets the value of the nmf12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMF12(String value) {
        this.nmf12 = value;
    }

    /**
     * Gets the value of the dtf12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTF12() {
        return dtf12;
    }

    /**
     * Sets the value of the dtf12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTF12(String value) {
        this.dtf12 = value;
    }

    /**
     * Gets the value of the wtf12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWTF12() {
        return wtf12;
    }

    /**
     * Sets the value of the wtf12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWTF12(String value) {
        this.wtf12 = value;
    }

    /**
     * Gets the value of the sbj13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBJ13() {
        return sbj13;
    }

    /**
     * Sets the value of the sbj13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBJ13(String value) {
        this.sbj13 = value;
    }

    /**
     * Gets the value of the jnf13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJNF13() {
        return jnf13;
    }

    /**
     * Sets the value of the jnf13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJNF13(String value) {
        this.jnf13 = value;
    }

    /**
     * Gets the value of the nmf13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMF13() {
        return nmf13;
    }

    /**
     * Sets the value of the nmf13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMF13(String value) {
        this.nmf13 = value;
    }

    /**
     * Gets the value of the dtf13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTF13() {
        return dtf13;
    }

    /**
     * Sets the value of the dtf13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTF13(String value) {
        this.dtf13 = value;
    }

    /**
     * Gets the value of the wtf13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWTF13() {
        return wtf13;
    }

    /**
     * Sets the value of the wtf13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWTF13(String value) {
        this.wtf13 = value;
    }

    /**
     * Gets the value of the sbj14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBJ14() {
        return sbj14;
    }

    /**
     * Sets the value of the sbj14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBJ14(String value) {
        this.sbj14 = value;
    }

    /**
     * Gets the value of the jnf14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJNF14() {
        return jnf14;
    }

    /**
     * Sets the value of the jnf14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJNF14(String value) {
        this.jnf14 = value;
    }

    /**
     * Gets the value of the nmf14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMF14() {
        return nmf14;
    }

    /**
     * Sets the value of the nmf14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMF14(String value) {
        this.nmf14 = value;
    }

    /**
     * Gets the value of the dtf14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTF14() {
        return dtf14;
    }

    /**
     * Sets the value of the dtf14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTF14(String value) {
        this.dtf14 = value;
    }

    /**
     * Gets the value of the wtf14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWTF14() {
        return wtf14;
    }

    /**
     * Sets the value of the wtf14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWTF14(String value) {
        this.wtf14 = value;
    }

    /**
     * Gets the value of the sbj15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBJ15() {
        return sbj15;
    }

    /**
     * Sets the value of the sbj15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBJ15(String value) {
        this.sbj15 = value;
    }

    /**
     * Gets the value of the jnf15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJNF15() {
        return jnf15;
    }

    /**
     * Sets the value of the jnf15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJNF15(String value) {
        this.jnf15 = value;
    }

    /**
     * Gets the value of the nmf15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMF15() {
        return nmf15;
    }

    /**
     * Sets the value of the nmf15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMF15(String value) {
        this.nmf15 = value;
    }

    /**
     * Gets the value of the dtf15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTF15() {
        return dtf15;
    }

    /**
     * Sets the value of the dtf15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTF15(String value) {
        this.dtf15 = value;
    }

    /**
     * Gets the value of the wtf15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWTF15() {
        return wtf15;
    }

    /**
     * Sets the value of the wtf15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWTF15(String value) {
        this.wtf15 = value;
    }

    /**
     * Gets the value of the sbj16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBJ16() {
        return sbj16;
    }

    /**
     * Sets the value of the sbj16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBJ16(String value) {
        this.sbj16 = value;
    }

    /**
     * Gets the value of the jnf16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJNF16() {
        return jnf16;
    }

    /**
     * Sets the value of the jnf16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJNF16(String value) {
        this.jnf16 = value;
    }

    /**
     * Gets the value of the nmf16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMF16() {
        return nmf16;
    }

    /**
     * Sets the value of the nmf16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMF16(String value) {
        this.nmf16 = value;
    }

    /**
     * Gets the value of the dtf16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTF16() {
        return dtf16;
    }

    /**
     * Sets the value of the dtf16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTF16(String value) {
        this.dtf16 = value;
    }

    /**
     * Gets the value of the wtf16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWTF16() {
        return wtf16;
    }

    /**
     * Sets the value of the wtf16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWTF16(String value) {
        this.wtf16 = value;
    }

    /**
     * Gets the value of the sbj17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBJ17() {
        return sbj17;
    }

    /**
     * Sets the value of the sbj17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBJ17(String value) {
        this.sbj17 = value;
    }

    /**
     * Gets the value of the jnf17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJNF17() {
        return jnf17;
    }

    /**
     * Sets the value of the jnf17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJNF17(String value) {
        this.jnf17 = value;
    }

    /**
     * Gets the value of the nmf17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMF17() {
        return nmf17;
    }

    /**
     * Sets the value of the nmf17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMF17(String value) {
        this.nmf17 = value;
    }

    /**
     * Gets the value of the dtf17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTF17() {
        return dtf17;
    }

    /**
     * Sets the value of the dtf17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTF17(String value) {
        this.dtf17 = value;
    }

    /**
     * Gets the value of the wtf17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWTF17() {
        return wtf17;
    }

    /**
     * Sets the value of the wtf17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWTF17(String value) {
        this.wtf17 = value;
    }

    /**
     * Gets the value of the sbj18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBJ18() {
        return sbj18;
    }

    /**
     * Sets the value of the sbj18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBJ18(String value) {
        this.sbj18 = value;
    }

    /**
     * Gets the value of the jnf18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJNF18() {
        return jnf18;
    }

    /**
     * Sets the value of the jnf18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJNF18(String value) {
        this.jnf18 = value;
    }

    /**
     * Gets the value of the nmf18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMF18() {
        return nmf18;
    }

    /**
     * Sets the value of the nmf18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMF18(String value) {
        this.nmf18 = value;
    }

    /**
     * Gets the value of the dtf18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTF18() {
        return dtf18;
    }

    /**
     * Sets the value of the dtf18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTF18(String value) {
        this.dtf18 = value;
    }

    /**
     * Gets the value of the wtf18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWTF18() {
        return wtf18;
    }

    /**
     * Sets the value of the wtf18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWTF18(String value) {
        this.wtf18 = value;
    }

    /**
     * Gets the value of the sbj19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBJ19() {
        return sbj19;
    }

    /**
     * Sets the value of the sbj19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBJ19(String value) {
        this.sbj19 = value;
    }

    /**
     * Gets the value of the jnf19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJNF19() {
        return jnf19;
    }

    /**
     * Sets the value of the jnf19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJNF19(String value) {
        this.jnf19 = value;
    }

    /**
     * Gets the value of the nmf19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMF19() {
        return nmf19;
    }

    /**
     * Sets the value of the nmf19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMF19(String value) {
        this.nmf19 = value;
    }

    /**
     * Gets the value of the dtf19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTF19() {
        return dtf19;
    }

    /**
     * Sets the value of the dtf19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTF19(String value) {
        this.dtf19 = value;
    }

    /**
     * Gets the value of the wtf19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWTF19() {
        return wtf19;
    }

    /**
     * Sets the value of the wtf19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWTF19(String value) {
        this.wtf19 = value;
    }

    /**
     * Gets the value of the sbj20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBJ20() {
        return sbj20;
    }

    /**
     * Sets the value of the sbj20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBJ20(String value) {
        this.sbj20 = value;
    }

    /**
     * Gets the value of the jnf20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJNF20() {
        return jnf20;
    }

    /**
     * Sets the value of the jnf20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJNF20(String value) {
        this.jnf20 = value;
    }

    /**
     * Gets the value of the nmf20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMF20() {
        return nmf20;
    }

    /**
     * Sets the value of the nmf20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMF20(String value) {
        this.nmf20 = value;
    }

    /**
     * Gets the value of the dtf20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTF20() {
        return dtf20;
    }

    /**
     * Sets the value of the dtf20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTF20(String value) {
        this.dtf20 = value;
    }

    /**
     * Gets the value of the wtf20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWTF20() {
        return wtf20;
    }

    /**
     * Sets the value of the wtf20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWTF20(String value) {
        this.wtf20 = value;
    }

    /**
     * Gets the value of the sbj21 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBJ21() {
        return sbj21;
    }

    /**
     * Sets the value of the sbj21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBJ21(String value) {
        this.sbj21 = value;
    }

    /**
     * Gets the value of the jnf21 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJNF21() {
        return jnf21;
    }

    /**
     * Sets the value of the jnf21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJNF21(String value) {
        this.jnf21 = value;
    }

    /**
     * Gets the value of the nmf21 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMF21() {
        return nmf21;
    }

    /**
     * Sets the value of the nmf21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMF21(String value) {
        this.nmf21 = value;
    }

    /**
     * Gets the value of the dtf21 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTF21() {
        return dtf21;
    }

    /**
     * Sets the value of the dtf21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTF21(String value) {
        this.dtf21 = value;
    }

    /**
     * Gets the value of the wtf21 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWTF21() {
        return wtf21;
    }

    /**
     * Sets the value of the wtf21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWTF21(String value) {
        this.wtf21 = value;
    }

    /**
     * Gets the value of the sbj22 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBJ22() {
        return sbj22;
    }

    /**
     * Sets the value of the sbj22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBJ22(String value) {
        this.sbj22 = value;
    }

    /**
     * Gets the value of the jnf22 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJNF22() {
        return jnf22;
    }

    /**
     * Sets the value of the jnf22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJNF22(String value) {
        this.jnf22 = value;
    }

    /**
     * Gets the value of the nmf22 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMF22() {
        return nmf22;
    }

    /**
     * Sets the value of the nmf22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMF22(String value) {
        this.nmf22 = value;
    }

    /**
     * Gets the value of the dtf22 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTF22() {
        return dtf22;
    }

    /**
     * Sets the value of the dtf22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTF22(String value) {
        this.dtf22 = value;
    }

    /**
     * Gets the value of the wtf22 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWTF22() {
        return wtf22;
    }

    /**
     * Sets the value of the wtf22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWTF22(String value) {
        this.wtf22 = value;
    }

    /**
     * Gets the value of the sbj23 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBJ23() {
        return sbj23;
    }

    /**
     * Sets the value of the sbj23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBJ23(String value) {
        this.sbj23 = value;
    }

    /**
     * Gets the value of the jnf23 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJNF23() {
        return jnf23;
    }

    /**
     * Sets the value of the jnf23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJNF23(String value) {
        this.jnf23 = value;
    }

    /**
     * Gets the value of the nmf23 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMF23() {
        return nmf23;
    }

    /**
     * Sets the value of the nmf23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMF23(String value) {
        this.nmf23 = value;
    }

    /**
     * Gets the value of the dtf23 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTF23() {
        return dtf23;
    }

    /**
     * Sets the value of the dtf23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTF23(String value) {
        this.dtf23 = value;
    }

    /**
     * Gets the value of the wtf23 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWTF23() {
        return wtf23;
    }

    /**
     * Sets the value of the wtf23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWTF23(String value) {
        this.wtf23 = value;
    }

    /**
     * Gets the value of the sbj24 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBJ24() {
        return sbj24;
    }

    /**
     * Sets the value of the sbj24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBJ24(String value) {
        this.sbj24 = value;
    }

    /**
     * Gets the value of the jnf24 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJNF24() {
        return jnf24;
    }

    /**
     * Sets the value of the jnf24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJNF24(String value) {
        this.jnf24 = value;
    }

    /**
     * Gets the value of the nmf24 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMF24() {
        return nmf24;
    }

    /**
     * Sets the value of the nmf24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMF24(String value) {
        this.nmf24 = value;
    }

    /**
     * Gets the value of the dtf24 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTF24() {
        return dtf24;
    }

    /**
     * Sets the value of the dtf24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTF24(String value) {
        this.dtf24 = value;
    }

    /**
     * Gets the value of the wtf24 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWTF24() {
        return wtf24;
    }

    /**
     * Sets the value of the wtf24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWTF24(String value) {
        this.wtf24 = value;
    }

    /**
     * Gets the value of the sbj25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBJ25() {
        return sbj25;
    }

    /**
     * Sets the value of the sbj25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBJ25(String value) {
        this.sbj25 = value;
    }

    /**
     * Gets the value of the jnf25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJNF25() {
        return jnf25;
    }

    /**
     * Sets the value of the jnf25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJNF25(String value) {
        this.jnf25 = value;
    }

    /**
     * Gets the value of the nmf25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMF25() {
        return nmf25;
    }

    /**
     * Sets the value of the nmf25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMF25(String value) {
        this.nmf25 = value;
    }

    /**
     * Gets the value of the dtf25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTF25() {
        return dtf25;
    }

    /**
     * Sets the value of the dtf25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTF25(String value) {
        this.dtf25 = value;
    }

    /**
     * Gets the value of the wtf25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWTF25() {
        return wtf25;
    }

    /**
     * Sets the value of the wtf25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWTF25(String value) {
        this.wtf25 = value;
    }

    /**
     * Gets the value of the sbj26 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBJ26() {
        return sbj26;
    }

    /**
     * Sets the value of the sbj26 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBJ26(String value) {
        this.sbj26 = value;
    }

    /**
     * Gets the value of the jnf26 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJNF26() {
        return jnf26;
    }

    /**
     * Sets the value of the jnf26 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJNF26(String value) {
        this.jnf26 = value;
    }

    /**
     * Gets the value of the nmf26 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMF26() {
        return nmf26;
    }

    /**
     * Sets the value of the nmf26 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMF26(String value) {
        this.nmf26 = value;
    }

    /**
     * Gets the value of the dtf26 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTF26() {
        return dtf26;
    }

    /**
     * Sets the value of the dtf26 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTF26(String value) {
        this.dtf26 = value;
    }

    /**
     * Gets the value of the wtf26 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWTF26() {
        return wtf26;
    }

    /**
     * Sets the value of the wtf26 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWTF26(String value) {
        this.wtf26 = value;
    }

    /**
     * Gets the value of the sbj27 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBJ27() {
        return sbj27;
    }

    /**
     * Sets the value of the sbj27 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBJ27(String value) {
        this.sbj27 = value;
    }

    /**
     * Gets the value of the jnf27 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJNF27() {
        return jnf27;
    }

    /**
     * Sets the value of the jnf27 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJNF27(String value) {
        this.jnf27 = value;
    }

    /**
     * Gets the value of the nmf27 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMF27() {
        return nmf27;
    }

    /**
     * Sets the value of the nmf27 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMF27(String value) {
        this.nmf27 = value;
    }

    /**
     * Gets the value of the dtf27 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTF27() {
        return dtf27;
    }

    /**
     * Sets the value of the dtf27 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTF27(String value) {
        this.dtf27 = value;
    }

    /**
     * Gets the value of the wtf27 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWTF27() {
        return wtf27;
    }

    /**
     * Sets the value of the wtf27 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWTF27(String value) {
        this.wtf27 = value;
    }

    /**
     * Gets the value of the sbj28 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBJ28() {
        return sbj28;
    }

    /**
     * Sets the value of the sbj28 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBJ28(String value) {
        this.sbj28 = value;
    }

    /**
     * Gets the value of the jnf28 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJNF28() {
        return jnf28;
    }

    /**
     * Sets the value of the jnf28 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJNF28(String value) {
        this.jnf28 = value;
    }

    /**
     * Gets the value of the nmf28 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMF28() {
        return nmf28;
    }

    /**
     * Sets the value of the nmf28 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMF28(String value) {
        this.nmf28 = value;
    }

    /**
     * Gets the value of the dtf28 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTF28() {
        return dtf28;
    }

    /**
     * Sets the value of the dtf28 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTF28(String value) {
        this.dtf28 = value;
    }

    /**
     * Gets the value of the wtf28 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWTF28() {
        return wtf28;
    }

    /**
     * Sets the value of the wtf28 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWTF28(String value) {
        this.wtf28 = value;
    }

    /**
     * Gets the value of the e1Q0028 property.
     * 
     * @return
     *     possible object is
     *     {@link E1Q0028 }
     *     
     */
    public E1Q0028 getE1Q0028() {
        return e1Q0028;
    }

    /**
     * Sets the value of the e1Q0028 property.
     * 
     * @param value
     *     allowed object is
     *     {@link E1Q0028 }
     *     
     */
    public void setE1Q0028(E1Q0028 value) {
        this.e1Q0028 = value;
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
