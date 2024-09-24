
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
 *         &lt;element name="SART0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SVAEN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
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
 *         &lt;element name="ADAT0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RDAT0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
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
 *         &lt;element name="GEGC0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GEGT0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VWVC0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VWVT0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BETL0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LVDA0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LBDA0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ABEZ0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BETR0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SBZC0" minOccurs="0"&gt;
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
 *         &lt;element name="SBZB0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MALU0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BGMA0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BKFZ0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPLZ0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BORT0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
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
 *         &lt;element name="AGRD0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SAGR0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
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
 *         &lt;element name="TAGE0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="62"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="E1LJ0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NSGA0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NSGE0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AECD0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="90"/&gt;
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
 *         &lt;element name="ERTG0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MVEND0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AABG0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MVBEG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GEGC0_BVA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GEGT0_BVA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AGRD0_BVA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SAGR0_BVA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANGR0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANGT0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VOPE0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ARBK0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AMTBG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="REFN0" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
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
    "sart0",
    "svaen",
    "statu",
    "adat0",
    "rdat0",
    "taet0",
    "gegc0",
    "gegt0",
    "vwvc0",
    "vwvt0",
    "betl0",
    "lvda0",
    "lbda0",
    "abez0",
    "betr0",
    "sbzc0",
    "sbzt0",
    "sbzb0",
    "malu0",
    "bgma0",
    "bkfz0",
    "bplz0",
    "bort0",
    "ebsv0",
    "agrd0",
    "sagr0",
    "keab0",
    "kebi0",
    "uaab0",
    "uabi0",
    "tage0",
    "e1LJ0",
    "nsga0",
    "nsge0",
    "aecd0",
    "grpvl",
    "ertg0",
    "mvend0",
    "aabg0",
    "mvbeg",
    "gegc0BVA",
    "gegt0BVA",
    "agrd0BVA",
    "sagr0BVA",
    "angr0",
    "angt0",
    "vope0",
    "arbk0",
    "amtbg",
    "refn0"
})
public class E1P0367 {

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
    @XmlElement(name = "SVAEN")
    protected String svaen;
    @XmlElement(name = "STATU")
    protected String statu;
    @XmlElement(name = "ADAT0")
    protected String adat0;
    @XmlElement(name = "RDAT0")
    protected String rdat0;
    @XmlElement(name = "TAET0")
    protected String taet0;
    @XmlElement(name = "GEGC0")
    protected String gegc0;
    @XmlElement(name = "GEGT0")
    protected String gegt0;
    @XmlElement(name = "VWVC0")
    protected String vwvc0;
    @XmlElement(name = "VWVT0")
    protected String vwvt0;
    @XmlElement(name = "BETL0")
    protected String betl0;
    @XmlElement(name = "LVDA0")
    protected String lvda0;
    @XmlElement(name = "LBDA0")
    protected String lbda0;
    @XmlElement(name = "ABEZ0")
    protected String abez0;
    @XmlElement(name = "BETR0")
    protected String betr0;
    @XmlElement(name = "SBZC0")
    protected String sbzc0;
    @XmlElement(name = "SBZT0")
    protected String sbzt0;
    @XmlElement(name = "SBZB0")
    protected String sbzb0;
    @XmlElement(name = "MALU0")
    protected String malu0;
    @XmlElement(name = "BGMA0")
    protected String bgma0;
    @XmlElement(name = "BKFZ0")
    protected String bkfz0;
    @XmlElement(name = "BPLZ0")
    protected String bplz0;
    @XmlElement(name = "BORT0")
    protected String bort0;
    @XmlElement(name = "EBSV0")
    protected String ebsv0;
    @XmlElement(name = "AGRD0")
    protected String agrd0;
    @XmlElement(name = "SAGR0")
    protected String sagr0;
    @XmlElement(name = "KEAB0")
    protected String keab0;
    @XmlElement(name = "KEBI0")
    protected String kebi0;
    @XmlElement(name = "UAAB0")
    protected String uaab0;
    @XmlElement(name = "UABI0")
    protected String uabi0;
    @XmlElement(name = "TAGE0")
    protected String tage0;
    @XmlElement(name = "E1LJ0")
    protected String e1LJ0;
    @XmlElement(name = "NSGA0")
    protected String nsga0;
    @XmlElement(name = "NSGE0")
    protected String nsge0;
    @XmlElement(name = "AECD0")
    protected String aecd0;
    @XmlElement(name = "GRPVL")
    protected String grpvl;
    @XmlElement(name = "ERTG0")
    protected String ertg0;
    @XmlElement(name = "MVEND0")
    protected String mvend0;
    @XmlElement(name = "AABG0")
    protected String aabg0;
    @XmlElement(name = "MVBEG")
    protected String mvbeg;
    @XmlElement(name = "GEGC0_BVA")
    protected String gegc0BVA;
    @XmlElement(name = "GEGT0_BVA")
    protected String gegt0BVA;
    @XmlElement(name = "AGRD0_BVA")
    protected String agrd0BVA;
    @XmlElement(name = "SAGR0_BVA")
    protected String sagr0BVA;
    @XmlElement(name = "ANGR0")
    protected String angr0;
    @XmlElement(name = "ANGT0")
    protected String angt0;
    @XmlElement(name = "VOPE0")
    protected String vope0;
    @XmlElement(name = "ARBK0")
    protected String arbk0;
    @XmlElement(name = "AMTBG")
    protected String amtbg;
    @XmlElement(name = "REFN0")
    protected String refn0;
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
     * Gets the value of the svaen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSVAEN() {
        return svaen;
    }

    /**
     * Sets the value of the svaen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSVAEN(String value) {
        this.svaen = value;
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
     * Gets the value of the adat0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADAT0() {
        return adat0;
    }

    /**
     * Sets the value of the adat0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADAT0(String value) {
        this.adat0 = value;
    }

    /**
     * Gets the value of the rdat0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRDAT0() {
        return rdat0;
    }

    /**
     * Sets the value of the rdat0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRDAT0(String value) {
        this.rdat0 = value;
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
     * Gets the value of the gegc0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGEGC0() {
        return gegc0;
    }

    /**
     * Sets the value of the gegc0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGEGC0(String value) {
        this.gegc0 = value;
    }

    /**
     * Gets the value of the gegt0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGEGT0() {
        return gegt0;
    }

    /**
     * Sets the value of the gegt0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGEGT0(String value) {
        this.gegt0 = value;
    }

    /**
     * Gets the value of the vwvc0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVWVC0() {
        return vwvc0;
    }

    /**
     * Sets the value of the vwvc0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVWVC0(String value) {
        this.vwvc0 = value;
    }

    /**
     * Gets the value of the vwvt0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVWVT0() {
        return vwvt0;
    }

    /**
     * Sets the value of the vwvt0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVWVT0(String value) {
        this.vwvt0 = value;
    }

    /**
     * Gets the value of the betl0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBETL0() {
        return betl0;
    }

    /**
     * Sets the value of the betl0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBETL0(String value) {
        this.betl0 = value;
    }

    /**
     * Gets the value of the lvda0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLVDA0() {
        return lvda0;
    }

    /**
     * Sets the value of the lvda0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLVDA0(String value) {
        this.lvda0 = value;
    }

    /**
     * Gets the value of the lbda0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLBDA0() {
        return lbda0;
    }

    /**
     * Sets the value of the lbda0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLBDA0(String value) {
        this.lbda0 = value;
    }

    /**
     * Gets the value of the abez0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABEZ0() {
        return abez0;
    }

    /**
     * Sets the value of the abez0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABEZ0(String value) {
        this.abez0 = value;
    }

    /**
     * Gets the value of the betr0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBETR0() {
        return betr0;
    }

    /**
     * Sets the value of the betr0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBETR0(String value) {
        this.betr0 = value;
    }

    /**
     * Gets the value of the sbzc0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBZC0() {
        return sbzc0;
    }

    /**
     * Sets the value of the sbzc0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBZC0(String value) {
        this.sbzc0 = value;
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
     * Gets the value of the sbzb0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBZB0() {
        return sbzb0;
    }

    /**
     * Sets the value of the sbzb0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBZB0(String value) {
        this.sbzb0 = value;
    }

    /**
     * Gets the value of the malu0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMALU0() {
        return malu0;
    }

    /**
     * Sets the value of the malu0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMALU0(String value) {
        this.malu0 = value;
    }

    /**
     * Gets the value of the bgma0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBGMA0() {
        return bgma0;
    }

    /**
     * Sets the value of the bgma0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBGMA0(String value) {
        this.bgma0 = value;
    }

    /**
     * Gets the value of the bkfz0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBKFZ0() {
        return bkfz0;
    }

    /**
     * Sets the value of the bkfz0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBKFZ0(String value) {
        this.bkfz0 = value;
    }

    /**
     * Gets the value of the bplz0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPLZ0() {
        return bplz0;
    }

    /**
     * Sets the value of the bplz0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPLZ0(String value) {
        this.bplz0 = value;
    }

    /**
     * Gets the value of the bort0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBORT0() {
        return bort0;
    }

    /**
     * Sets the value of the bort0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBORT0(String value) {
        this.bort0 = value;
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
     * Gets the value of the sagr0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAGR0() {
        return sagr0;
    }

    /**
     * Sets the value of the sagr0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAGR0(String value) {
        this.sagr0 = value;
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
     * Gets the value of the tage0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAGE0() {
        return tage0;
    }

    /**
     * Sets the value of the tage0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAGE0(String value) {
        this.tage0 = value;
    }

    /**
     * Gets the value of the e1LJ0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE1LJ0() {
        return e1LJ0;
    }

    /**
     * Sets the value of the e1LJ0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE1LJ0(String value) {
        this.e1LJ0 = value;
    }

    /**
     * Gets the value of the nsga0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNSGA0() {
        return nsga0;
    }

    /**
     * Sets the value of the nsga0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNSGA0(String value) {
        this.nsga0 = value;
    }

    /**
     * Gets the value of the nsge0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNSGE0() {
        return nsge0;
    }

    /**
     * Sets the value of the nsge0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNSGE0(String value) {
        this.nsge0 = value;
    }

    /**
     * Gets the value of the aecd0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAECD0() {
        return aecd0;
    }

    /**
     * Sets the value of the aecd0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAECD0(String value) {
        this.aecd0 = value;
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
     * Gets the value of the ertg0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERTG0() {
        return ertg0;
    }

    /**
     * Sets the value of the ertg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERTG0(String value) {
        this.ertg0 = value;
    }

    /**
     * Gets the value of the mvend0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMVEND0() {
        return mvend0;
    }

    /**
     * Sets the value of the mvend0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMVEND0(String value) {
        this.mvend0 = value;
    }

    /**
     * Gets the value of the aabg0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAABG0() {
        return aabg0;
    }

    /**
     * Sets the value of the aabg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAABG0(String value) {
        this.aabg0 = value;
    }

    /**
     * Gets the value of the mvbeg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMVBEG() {
        return mvbeg;
    }

    /**
     * Sets the value of the mvbeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMVBEG(String value) {
        this.mvbeg = value;
    }

    /**
     * Gets the value of the gegc0BVA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGEGC0BVA() {
        return gegc0BVA;
    }

    /**
     * Sets the value of the gegc0BVA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGEGC0BVA(String value) {
        this.gegc0BVA = value;
    }

    /**
     * Gets the value of the gegt0BVA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGEGT0BVA() {
        return gegt0BVA;
    }

    /**
     * Sets the value of the gegt0BVA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGEGT0BVA(String value) {
        this.gegt0BVA = value;
    }

    /**
     * Gets the value of the agrd0BVA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGRD0BVA() {
        return agrd0BVA;
    }

    /**
     * Sets the value of the agrd0BVA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGRD0BVA(String value) {
        this.agrd0BVA = value;
    }

    /**
     * Gets the value of the sagr0BVA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAGR0BVA() {
        return sagr0BVA;
    }

    /**
     * Sets the value of the sagr0BVA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAGR0BVA(String value) {
        this.sagr0BVA = value;
    }

    /**
     * Gets the value of the angr0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANGR0() {
        return angr0;
    }

    /**
     * Sets the value of the angr0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANGR0(String value) {
        this.angr0 = value;
    }

    /**
     * Gets the value of the angt0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANGT0() {
        return angt0;
    }

    /**
     * Sets the value of the angt0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANGT0(String value) {
        this.angt0 = value;
    }

    /**
     * Gets the value of the vope0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOPE0() {
        return vope0;
    }

    /**
     * Sets the value of the vope0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOPE0(String value) {
        this.vope0 = value;
    }

    /**
     * Gets the value of the arbk0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARBK0() {
        return arbk0;
    }

    /**
     * Sets the value of the arbk0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARBK0(String value) {
        this.arbk0 = value;
    }

    /**
     * Gets the value of the amtbg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMTBG() {
        return amtbg;
    }

    /**
     * Sets the value of the amtbg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMTBG(String value) {
        this.amtbg = value;
    }

    /**
     * Gets the value of the refn0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFN0() {
        return refn0;
    }

    /**
     * Sets the value of the refn0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFN0(String value) {
        this.refn0 = value;
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
