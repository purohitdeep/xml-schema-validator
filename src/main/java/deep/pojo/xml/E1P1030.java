
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
 *         &lt;element name="MANDT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PLVAR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OTYPE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OBJID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
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
 *         &lt;element name="ISTAT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRIOX" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
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
 *         &lt;element name="ENDDA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VARYF" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SEQNR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
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
 *         &lt;element name="REASN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
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
 *         &lt;element name="ITXNR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d+"/&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TEILN_TYP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BCHECK" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VCHECK" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KCHECK" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QCHECK" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QASSIGN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DELRKURS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INSRKTYP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="XDATA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TEILNTYP01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BCHECK01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VCHECK01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KCHECK01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QCHECK01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QASSIGN01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DELRKURS01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INSRKTYP01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="XDATA01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TEILNTYP02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BCHECK02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VCHECK02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KCHECK02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QCHECK02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QASSIGN02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DELRKURS02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INSRKTYP02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="XDATA02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TEILNTYP03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BCHECK03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VCHECK03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KCHECK03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QCHECK03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QASSIGN03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DELRKURS03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INSRKTYP03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="XDATA03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TEILNTYP04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BCHECK04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VCHECK04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KCHECK04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QCHECK04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QASSIGN04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DELRKURS04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INSRKTYP04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="XDATA04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TEILNTYP05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BCHECK05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VCHECK05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KCHECK05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QCHECK05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QASSIGN05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DELRKURS05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INSRKTYP05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="XDATA05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TEILNTYP06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BCHECK06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VCHECK06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KCHECK06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QCHECK06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QASSIGN06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DELRKURS06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INSRKTYP06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="XDATA06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TEILNTYP07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BCHECK07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VCHECK07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KCHECK07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QCHECK07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QASSIGN07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DELRKURS07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INSRKTYP07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="XDATA07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TEILNTYP08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BCHECK08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VCHECK08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KCHECK08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QCHECK08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QASSIGN08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DELRKURS08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INSRKTYP08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="XDATA08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TEILNTYP09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BCHECK09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VCHECK09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KCHECK09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QCHECK09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QASSIGN09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DELRKURS09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INSRKTYP09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="XDATA09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TEILNTYP10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BCHECK10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VCHECK10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KCHECK10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QCHECK10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QASSIGN10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DELRKURS10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INSRKTYP10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="XDATA10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TEILNTYP11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BCHECK11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VCHECK11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KCHECK11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QCHECK11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QASSIGN11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DELRKURS11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INSRKTYP11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="XDATA11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TEILNTYP12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BCHECK12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VCHECK12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KCHECK12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QCHECK12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QASSIGN12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DELRKURS12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INSRKTYP12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="XDATA12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TEILNTYP13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BCHECK13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VCHECK13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KCHECK13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QCHECK13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QASSIGN13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DELRKURS13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INSRKTYP13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="XDATA13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TEILNTYP14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BCHECK14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VCHECK14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KCHECK14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QCHECK14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QASSIGN14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DELRKURS14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INSRKTYP14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="XDATA14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TEILNTYP15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BCHECK15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VCHECK15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KCHECK15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QCHECK15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QASSIGN15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DELRKURS15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INSRKTYP15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="XDATA15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
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
    "mandt",
    "plvar",
    "otype",
    "objid",
    "infty",
    "subty",
    "istat",
    "priox",
    "begda",
    "endda",
    "varyf",
    "seqnr",
    "aedtm",
    "uname",
    "reasn",
    "histo",
    "itxnr",
    "teilntyp",
    "bcheck",
    "vcheck",
    "kcheck",
    "qcheck",
    "qassign",
    "delrkurs",
    "insrktyp",
    "xdata",
    "teilntyp01",
    "bcheck01",
    "vcheck01",
    "kcheck01",
    "qcheck01",
    "qassign01",
    "delrkurs01",
    "insrktyp01",
    "xdata01",
    "teilntyp02",
    "bcheck02",
    "vcheck02",
    "kcheck02",
    "qcheck02",
    "qassign02",
    "delrkurs02",
    "insrktyp02",
    "xdata02",
    "teilntyp03",
    "bcheck03",
    "vcheck03",
    "kcheck03",
    "qcheck03",
    "qassign03",
    "delrkurs03",
    "insrktyp03",
    "xdata03",
    "teilntyp04",
    "bcheck04",
    "vcheck04",
    "kcheck04",
    "qcheck04",
    "qassign04",
    "delrkurs04",
    "insrktyp04",
    "xdata04",
    "teilntyp05",
    "bcheck05",
    "vcheck05",
    "kcheck05",
    "qcheck05",
    "qassign05",
    "delrkurs05",
    "insrktyp05",
    "xdata05",
    "teilntyp06",
    "bcheck06",
    "vcheck06",
    "kcheck06",
    "qcheck06",
    "qassign06",
    "delrkurs06",
    "insrktyp06",
    "xdata06",
    "teilntyp07",
    "bcheck07",
    "vcheck07",
    "kcheck07",
    "qcheck07",
    "qassign07",
    "delrkurs07",
    "insrktyp07",
    "xdata07",
    "teilntyp08",
    "bcheck08",
    "vcheck08",
    "kcheck08",
    "qcheck08",
    "qassign08",
    "delrkurs08",
    "insrktyp08",
    "xdata08",
    "teilntyp09",
    "bcheck09",
    "vcheck09",
    "kcheck09",
    "qcheck09",
    "qassign09",
    "delrkurs09",
    "insrktyp09",
    "xdata09",
    "teilntyp10",
    "bcheck10",
    "vcheck10",
    "kcheck10",
    "qcheck10",
    "qassign10",
    "delrkurs10",
    "insrktyp10",
    "xdata10",
    "teilntyp11",
    "bcheck11",
    "vcheck11",
    "kcheck11",
    "qcheck11",
    "qassign11",
    "delrkurs11",
    "insrktyp11",
    "xdata11",
    "teilntyp12",
    "bcheck12",
    "vcheck12",
    "kcheck12",
    "qcheck12",
    "qassign12",
    "delrkurs12",
    "insrktyp12",
    "xdata12",
    "teilntyp13",
    "bcheck13",
    "vcheck13",
    "kcheck13",
    "qcheck13",
    "qassign13",
    "delrkurs13",
    "insrktyp13",
    "xdata13",
    "teilntyp14",
    "bcheck14",
    "vcheck14",
    "kcheck14",
    "qcheck14",
    "qassign14",
    "delrkurs14",
    "insrktyp14",
    "xdata14",
    "teilntyp15",
    "bcheck15",
    "vcheck15",
    "kcheck15",
    "qcheck15",
    "qassign15",
    "delrkurs15",
    "insrktyp15",
    "xdata15"
})
public class E1P1030 {

    @XmlElement(name = "MANDT")
    protected String mandt;
    @XmlElement(name = "PLVAR")
    protected String plvar;
    @XmlElement(name = "OTYPE")
    protected String otype;
    @XmlElement(name = "OBJID")
    protected String objid;
    @XmlElement(name = "INFTY")
    protected String infty;
    @XmlElement(name = "SUBTY")
    protected String subty;
    @XmlElement(name = "ISTAT")
    protected String istat;
    @XmlElement(name = "PRIOX")
    protected String priox;
    @XmlElement(name = "BEGDA")
    protected String begda;
    @XmlElement(name = "ENDDA")
    protected String endda;
    @XmlElement(name = "VARYF")
    protected String varyf;
    @XmlElement(name = "SEQNR")
    protected String seqnr;
    @XmlElement(name = "AEDTM")
    protected String aedtm;
    @XmlElement(name = "UNAME")
    protected String uname;
    @XmlElement(name = "REASN")
    protected String reasn;
    @XmlElement(name = "HISTO")
    protected String histo;
    @XmlElement(name = "ITXNR")
    protected String itxnr;
    @XmlElement(name = "TEILN_TYP")
    protected String teilntyp;
    @XmlElement(name = "BCHECK")
    protected String bcheck;
    @XmlElement(name = "VCHECK")
    protected String vcheck;
    @XmlElement(name = "KCHECK")
    protected String kcheck;
    @XmlElement(name = "QCHECK")
    protected String qcheck;
    @XmlElement(name = "QASSIGN")
    protected String qassign;
    @XmlElement(name = "DELRKURS")
    protected String delrkurs;
    @XmlElement(name = "INSRKTYP")
    protected String insrktyp;
    @XmlElement(name = "XDATA")
    protected String xdata;
    @XmlElement(name = "TEILNTYP01")
    protected String teilntyp01;
    @XmlElement(name = "BCHECK01")
    protected String bcheck01;
    @XmlElement(name = "VCHECK01")
    protected String vcheck01;
    @XmlElement(name = "KCHECK01")
    protected String kcheck01;
    @XmlElement(name = "QCHECK01")
    protected String qcheck01;
    @XmlElement(name = "QASSIGN01")
    protected String qassign01;
    @XmlElement(name = "DELRKURS01")
    protected String delrkurs01;
    @XmlElement(name = "INSRKTYP01")
    protected String insrktyp01;
    @XmlElement(name = "XDATA01")
    protected String xdata01;
    @XmlElement(name = "TEILNTYP02")
    protected String teilntyp02;
    @XmlElement(name = "BCHECK02")
    protected String bcheck02;
    @XmlElement(name = "VCHECK02")
    protected String vcheck02;
    @XmlElement(name = "KCHECK02")
    protected String kcheck02;
    @XmlElement(name = "QCHECK02")
    protected String qcheck02;
    @XmlElement(name = "QASSIGN02")
    protected String qassign02;
    @XmlElement(name = "DELRKURS02")
    protected String delrkurs02;
    @XmlElement(name = "INSRKTYP02")
    protected String insrktyp02;
    @XmlElement(name = "XDATA02")
    protected String xdata02;
    @XmlElement(name = "TEILNTYP03")
    protected String teilntyp03;
    @XmlElement(name = "BCHECK03")
    protected String bcheck03;
    @XmlElement(name = "VCHECK03")
    protected String vcheck03;
    @XmlElement(name = "KCHECK03")
    protected String kcheck03;
    @XmlElement(name = "QCHECK03")
    protected String qcheck03;
    @XmlElement(name = "QASSIGN03")
    protected String qassign03;
    @XmlElement(name = "DELRKURS03")
    protected String delrkurs03;
    @XmlElement(name = "INSRKTYP03")
    protected String insrktyp03;
    @XmlElement(name = "XDATA03")
    protected String xdata03;
    @XmlElement(name = "TEILNTYP04")
    protected String teilntyp04;
    @XmlElement(name = "BCHECK04")
    protected String bcheck04;
    @XmlElement(name = "VCHECK04")
    protected String vcheck04;
    @XmlElement(name = "KCHECK04")
    protected String kcheck04;
    @XmlElement(name = "QCHECK04")
    protected String qcheck04;
    @XmlElement(name = "QASSIGN04")
    protected String qassign04;
    @XmlElement(name = "DELRKURS04")
    protected String delrkurs04;
    @XmlElement(name = "INSRKTYP04")
    protected String insrktyp04;
    @XmlElement(name = "XDATA04")
    protected String xdata04;
    @XmlElement(name = "TEILNTYP05")
    protected String teilntyp05;
    @XmlElement(name = "BCHECK05")
    protected String bcheck05;
    @XmlElement(name = "VCHECK05")
    protected String vcheck05;
    @XmlElement(name = "KCHECK05")
    protected String kcheck05;
    @XmlElement(name = "QCHECK05")
    protected String qcheck05;
    @XmlElement(name = "QASSIGN05")
    protected String qassign05;
    @XmlElement(name = "DELRKURS05")
    protected String delrkurs05;
    @XmlElement(name = "INSRKTYP05")
    protected String insrktyp05;
    @XmlElement(name = "XDATA05")
    protected String xdata05;
    @XmlElement(name = "TEILNTYP06")
    protected String teilntyp06;
    @XmlElement(name = "BCHECK06")
    protected String bcheck06;
    @XmlElement(name = "VCHECK06")
    protected String vcheck06;
    @XmlElement(name = "KCHECK06")
    protected String kcheck06;
    @XmlElement(name = "QCHECK06")
    protected String qcheck06;
    @XmlElement(name = "QASSIGN06")
    protected String qassign06;
    @XmlElement(name = "DELRKURS06")
    protected String delrkurs06;
    @XmlElement(name = "INSRKTYP06")
    protected String insrktyp06;
    @XmlElement(name = "XDATA06")
    protected String xdata06;
    @XmlElement(name = "TEILNTYP07")
    protected String teilntyp07;
    @XmlElement(name = "BCHECK07")
    protected String bcheck07;
    @XmlElement(name = "VCHECK07")
    protected String vcheck07;
    @XmlElement(name = "KCHECK07")
    protected String kcheck07;
    @XmlElement(name = "QCHECK07")
    protected String qcheck07;
    @XmlElement(name = "QASSIGN07")
    protected String qassign07;
    @XmlElement(name = "DELRKURS07")
    protected String delrkurs07;
    @XmlElement(name = "INSRKTYP07")
    protected String insrktyp07;
    @XmlElement(name = "XDATA07")
    protected String xdata07;
    @XmlElement(name = "TEILNTYP08")
    protected String teilntyp08;
    @XmlElement(name = "BCHECK08")
    protected String bcheck08;
    @XmlElement(name = "VCHECK08")
    protected String vcheck08;
    @XmlElement(name = "KCHECK08")
    protected String kcheck08;
    @XmlElement(name = "QCHECK08")
    protected String qcheck08;
    @XmlElement(name = "QASSIGN08")
    protected String qassign08;
    @XmlElement(name = "DELRKURS08")
    protected String delrkurs08;
    @XmlElement(name = "INSRKTYP08")
    protected String insrktyp08;
    @XmlElement(name = "XDATA08")
    protected String xdata08;
    @XmlElement(name = "TEILNTYP09")
    protected String teilntyp09;
    @XmlElement(name = "BCHECK09")
    protected String bcheck09;
    @XmlElement(name = "VCHECK09")
    protected String vcheck09;
    @XmlElement(name = "KCHECK09")
    protected String kcheck09;
    @XmlElement(name = "QCHECK09")
    protected String qcheck09;
    @XmlElement(name = "QASSIGN09")
    protected String qassign09;
    @XmlElement(name = "DELRKURS09")
    protected String delrkurs09;
    @XmlElement(name = "INSRKTYP09")
    protected String insrktyp09;
    @XmlElement(name = "XDATA09")
    protected String xdata09;
    @XmlElement(name = "TEILNTYP10")
    protected String teilntyp10;
    @XmlElement(name = "BCHECK10")
    protected String bcheck10;
    @XmlElement(name = "VCHECK10")
    protected String vcheck10;
    @XmlElement(name = "KCHECK10")
    protected String kcheck10;
    @XmlElement(name = "QCHECK10")
    protected String qcheck10;
    @XmlElement(name = "QASSIGN10")
    protected String qassign10;
    @XmlElement(name = "DELRKURS10")
    protected String delrkurs10;
    @XmlElement(name = "INSRKTYP10")
    protected String insrktyp10;
    @XmlElement(name = "XDATA10")
    protected String xdata10;
    @XmlElement(name = "TEILNTYP11")
    protected String teilntyp11;
    @XmlElement(name = "BCHECK11")
    protected String bcheck11;
    @XmlElement(name = "VCHECK11")
    protected String vcheck11;
    @XmlElement(name = "KCHECK11")
    protected String kcheck11;
    @XmlElement(name = "QCHECK11")
    protected String qcheck11;
    @XmlElement(name = "QASSIGN11")
    protected String qassign11;
    @XmlElement(name = "DELRKURS11")
    protected String delrkurs11;
    @XmlElement(name = "INSRKTYP11")
    protected String insrktyp11;
    @XmlElement(name = "XDATA11")
    protected String xdata11;
    @XmlElement(name = "TEILNTYP12")
    protected String teilntyp12;
    @XmlElement(name = "BCHECK12")
    protected String bcheck12;
    @XmlElement(name = "VCHECK12")
    protected String vcheck12;
    @XmlElement(name = "KCHECK12")
    protected String kcheck12;
    @XmlElement(name = "QCHECK12")
    protected String qcheck12;
    @XmlElement(name = "QASSIGN12")
    protected String qassign12;
    @XmlElement(name = "DELRKURS12")
    protected String delrkurs12;
    @XmlElement(name = "INSRKTYP12")
    protected String insrktyp12;
    @XmlElement(name = "XDATA12")
    protected String xdata12;
    @XmlElement(name = "TEILNTYP13")
    protected String teilntyp13;
    @XmlElement(name = "BCHECK13")
    protected String bcheck13;
    @XmlElement(name = "VCHECK13")
    protected String vcheck13;
    @XmlElement(name = "KCHECK13")
    protected String kcheck13;
    @XmlElement(name = "QCHECK13")
    protected String qcheck13;
    @XmlElement(name = "QASSIGN13")
    protected String qassign13;
    @XmlElement(name = "DELRKURS13")
    protected String delrkurs13;
    @XmlElement(name = "INSRKTYP13")
    protected String insrktyp13;
    @XmlElement(name = "XDATA13")
    protected String xdata13;
    @XmlElement(name = "TEILNTYP14")
    protected String teilntyp14;
    @XmlElement(name = "BCHECK14")
    protected String bcheck14;
    @XmlElement(name = "VCHECK14")
    protected String vcheck14;
    @XmlElement(name = "KCHECK14")
    protected String kcheck14;
    @XmlElement(name = "QCHECK14")
    protected String qcheck14;
    @XmlElement(name = "QASSIGN14")
    protected String qassign14;
    @XmlElement(name = "DELRKURS14")
    protected String delrkurs14;
    @XmlElement(name = "INSRKTYP14")
    protected String insrktyp14;
    @XmlElement(name = "XDATA14")
    protected String xdata14;
    @XmlElement(name = "TEILNTYP15")
    protected String teilntyp15;
    @XmlElement(name = "BCHECK15")
    protected String bcheck15;
    @XmlElement(name = "VCHECK15")
    protected String vcheck15;
    @XmlElement(name = "KCHECK15")
    protected String kcheck15;
    @XmlElement(name = "QCHECK15")
    protected String qcheck15;
    @XmlElement(name = "QASSIGN15")
    protected String qassign15;
    @XmlElement(name = "DELRKURS15")
    protected String delrkurs15;
    @XmlElement(name = "INSRKTYP15")
    protected String insrktyp15;
    @XmlElement(name = "XDATA15")
    protected String xdata15;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Gets the value of the mandt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMANDT() {
        return mandt;
    }

    /**
     * Sets the value of the mandt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMANDT(String value) {
        this.mandt = value;
    }

    /**
     * Gets the value of the plvar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLVAR() {
        return plvar;
    }

    /**
     * Sets the value of the plvar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLVAR(String value) {
        this.plvar = value;
    }

    /**
     * Gets the value of the otype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTYPE() {
        return otype;
    }

    /**
     * Sets the value of the otype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTYPE(String value) {
        this.otype = value;
    }

    /**
     * Gets the value of the objid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBJID() {
        return objid;
    }

    /**
     * Sets the value of the objid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBJID(String value) {
        this.objid = value;
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
     * Gets the value of the istat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISTAT() {
        return istat;
    }

    /**
     * Sets the value of the istat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISTAT(String value) {
        this.istat = value;
    }

    /**
     * Gets the value of the priox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRIOX() {
        return priox;
    }

    /**
     * Sets the value of the priox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRIOX(String value) {
        this.priox = value;
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
     * Gets the value of the varyf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVARYF() {
        return varyf;
    }

    /**
     * Sets the value of the varyf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVARYF(String value) {
        this.varyf = value;
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
     * Gets the value of the reasn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREASN() {
        return reasn;
    }

    /**
     * Sets the value of the reasn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREASN(String value) {
        this.reasn = value;
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
     * Gets the value of the itxnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITXNR() {
        return itxnr;
    }

    /**
     * Sets the value of the itxnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITXNR(String value) {
        this.itxnr = value;
    }

    /**
     * Gets the value of the teilntyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEILNTYP() {
        return teilntyp;
    }

    /**
     * Sets the value of the teilntyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEILNTYP(String value) {
        this.teilntyp = value;
    }

    /**
     * Gets the value of the bcheck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCHECK() {
        return bcheck;
    }

    /**
     * Sets the value of the bcheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCHECK(String value) {
        this.bcheck = value;
    }

    /**
     * Gets the value of the vcheck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCHECK() {
        return vcheck;
    }

    /**
     * Sets the value of the vcheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCHECK(String value) {
        this.vcheck = value;
    }

    /**
     * Gets the value of the kcheck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKCHECK() {
        return kcheck;
    }

    /**
     * Sets the value of the kcheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKCHECK(String value) {
        this.kcheck = value;
    }

    /**
     * Gets the value of the qcheck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQCHECK() {
        return qcheck;
    }

    /**
     * Sets the value of the qcheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQCHECK(String value) {
        this.qcheck = value;
    }

    /**
     * Gets the value of the qassign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQASSIGN() {
        return qassign;
    }

    /**
     * Sets the value of the qassign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQASSIGN(String value) {
        this.qassign = value;
    }

    /**
     * Gets the value of the delrkurs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELRKURS() {
        return delrkurs;
    }

    /**
     * Sets the value of the delrkurs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELRKURS(String value) {
        this.delrkurs = value;
    }

    /**
     * Gets the value of the insrktyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSRKTYP() {
        return insrktyp;
    }

    /**
     * Sets the value of the insrktyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSRKTYP(String value) {
        this.insrktyp = value;
    }

    /**
     * Gets the value of the xdata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXDATA() {
        return xdata;
    }

    /**
     * Sets the value of the xdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXDATA(String value) {
        this.xdata = value;
    }

    /**
     * Gets the value of the teilntyp01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEILNTYP01() {
        return teilntyp01;
    }

    /**
     * Sets the value of the teilntyp01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEILNTYP01(String value) {
        this.teilntyp01 = value;
    }

    /**
     * Gets the value of the bcheck01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCHECK01() {
        return bcheck01;
    }

    /**
     * Sets the value of the bcheck01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCHECK01(String value) {
        this.bcheck01 = value;
    }

    /**
     * Gets the value of the vcheck01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCHECK01() {
        return vcheck01;
    }

    /**
     * Sets the value of the vcheck01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCHECK01(String value) {
        this.vcheck01 = value;
    }

    /**
     * Gets the value of the kcheck01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKCHECK01() {
        return kcheck01;
    }

    /**
     * Sets the value of the kcheck01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKCHECK01(String value) {
        this.kcheck01 = value;
    }

    /**
     * Gets the value of the qcheck01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQCHECK01() {
        return qcheck01;
    }

    /**
     * Sets the value of the qcheck01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQCHECK01(String value) {
        this.qcheck01 = value;
    }

    /**
     * Gets the value of the qassign01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQASSIGN01() {
        return qassign01;
    }

    /**
     * Sets the value of the qassign01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQASSIGN01(String value) {
        this.qassign01 = value;
    }

    /**
     * Gets the value of the delrkurs01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELRKURS01() {
        return delrkurs01;
    }

    /**
     * Sets the value of the delrkurs01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELRKURS01(String value) {
        this.delrkurs01 = value;
    }

    /**
     * Gets the value of the insrktyp01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSRKTYP01() {
        return insrktyp01;
    }

    /**
     * Sets the value of the insrktyp01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSRKTYP01(String value) {
        this.insrktyp01 = value;
    }

    /**
     * Gets the value of the xdata01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXDATA01() {
        return xdata01;
    }

    /**
     * Sets the value of the xdata01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXDATA01(String value) {
        this.xdata01 = value;
    }

    /**
     * Gets the value of the teilntyp02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEILNTYP02() {
        return teilntyp02;
    }

    /**
     * Sets the value of the teilntyp02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEILNTYP02(String value) {
        this.teilntyp02 = value;
    }

    /**
     * Gets the value of the bcheck02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCHECK02() {
        return bcheck02;
    }

    /**
     * Sets the value of the bcheck02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCHECK02(String value) {
        this.bcheck02 = value;
    }

    /**
     * Gets the value of the vcheck02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCHECK02() {
        return vcheck02;
    }

    /**
     * Sets the value of the vcheck02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCHECK02(String value) {
        this.vcheck02 = value;
    }

    /**
     * Gets the value of the kcheck02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKCHECK02() {
        return kcheck02;
    }

    /**
     * Sets the value of the kcheck02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKCHECK02(String value) {
        this.kcheck02 = value;
    }

    /**
     * Gets the value of the qcheck02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQCHECK02() {
        return qcheck02;
    }

    /**
     * Sets the value of the qcheck02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQCHECK02(String value) {
        this.qcheck02 = value;
    }

    /**
     * Gets the value of the qassign02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQASSIGN02() {
        return qassign02;
    }

    /**
     * Sets the value of the qassign02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQASSIGN02(String value) {
        this.qassign02 = value;
    }

    /**
     * Gets the value of the delrkurs02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELRKURS02() {
        return delrkurs02;
    }

    /**
     * Sets the value of the delrkurs02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELRKURS02(String value) {
        this.delrkurs02 = value;
    }

    /**
     * Gets the value of the insrktyp02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSRKTYP02() {
        return insrktyp02;
    }

    /**
     * Sets the value of the insrktyp02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSRKTYP02(String value) {
        this.insrktyp02 = value;
    }

    /**
     * Gets the value of the xdata02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXDATA02() {
        return xdata02;
    }

    /**
     * Sets the value of the xdata02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXDATA02(String value) {
        this.xdata02 = value;
    }

    /**
     * Gets the value of the teilntyp03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEILNTYP03() {
        return teilntyp03;
    }

    /**
     * Sets the value of the teilntyp03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEILNTYP03(String value) {
        this.teilntyp03 = value;
    }

    /**
     * Gets the value of the bcheck03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCHECK03() {
        return bcheck03;
    }

    /**
     * Sets the value of the bcheck03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCHECK03(String value) {
        this.bcheck03 = value;
    }

    /**
     * Gets the value of the vcheck03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCHECK03() {
        return vcheck03;
    }

    /**
     * Sets the value of the vcheck03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCHECK03(String value) {
        this.vcheck03 = value;
    }

    /**
     * Gets the value of the kcheck03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKCHECK03() {
        return kcheck03;
    }

    /**
     * Sets the value of the kcheck03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKCHECK03(String value) {
        this.kcheck03 = value;
    }

    /**
     * Gets the value of the qcheck03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQCHECK03() {
        return qcheck03;
    }

    /**
     * Sets the value of the qcheck03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQCHECK03(String value) {
        this.qcheck03 = value;
    }

    /**
     * Gets the value of the qassign03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQASSIGN03() {
        return qassign03;
    }

    /**
     * Sets the value of the qassign03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQASSIGN03(String value) {
        this.qassign03 = value;
    }

    /**
     * Gets the value of the delrkurs03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELRKURS03() {
        return delrkurs03;
    }

    /**
     * Sets the value of the delrkurs03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELRKURS03(String value) {
        this.delrkurs03 = value;
    }

    /**
     * Gets the value of the insrktyp03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSRKTYP03() {
        return insrktyp03;
    }

    /**
     * Sets the value of the insrktyp03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSRKTYP03(String value) {
        this.insrktyp03 = value;
    }

    /**
     * Gets the value of the xdata03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXDATA03() {
        return xdata03;
    }

    /**
     * Sets the value of the xdata03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXDATA03(String value) {
        this.xdata03 = value;
    }

    /**
     * Gets the value of the teilntyp04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEILNTYP04() {
        return teilntyp04;
    }

    /**
     * Sets the value of the teilntyp04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEILNTYP04(String value) {
        this.teilntyp04 = value;
    }

    /**
     * Gets the value of the bcheck04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCHECK04() {
        return bcheck04;
    }

    /**
     * Sets the value of the bcheck04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCHECK04(String value) {
        this.bcheck04 = value;
    }

    /**
     * Gets the value of the vcheck04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCHECK04() {
        return vcheck04;
    }

    /**
     * Sets the value of the vcheck04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCHECK04(String value) {
        this.vcheck04 = value;
    }

    /**
     * Gets the value of the kcheck04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKCHECK04() {
        return kcheck04;
    }

    /**
     * Sets the value of the kcheck04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKCHECK04(String value) {
        this.kcheck04 = value;
    }

    /**
     * Gets the value of the qcheck04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQCHECK04() {
        return qcheck04;
    }

    /**
     * Sets the value of the qcheck04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQCHECK04(String value) {
        this.qcheck04 = value;
    }

    /**
     * Gets the value of the qassign04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQASSIGN04() {
        return qassign04;
    }

    /**
     * Sets the value of the qassign04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQASSIGN04(String value) {
        this.qassign04 = value;
    }

    /**
     * Gets the value of the delrkurs04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELRKURS04() {
        return delrkurs04;
    }

    /**
     * Sets the value of the delrkurs04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELRKURS04(String value) {
        this.delrkurs04 = value;
    }

    /**
     * Gets the value of the insrktyp04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSRKTYP04() {
        return insrktyp04;
    }

    /**
     * Sets the value of the insrktyp04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSRKTYP04(String value) {
        this.insrktyp04 = value;
    }

    /**
     * Gets the value of the xdata04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXDATA04() {
        return xdata04;
    }

    /**
     * Sets the value of the xdata04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXDATA04(String value) {
        this.xdata04 = value;
    }

    /**
     * Gets the value of the teilntyp05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEILNTYP05() {
        return teilntyp05;
    }

    /**
     * Sets the value of the teilntyp05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEILNTYP05(String value) {
        this.teilntyp05 = value;
    }

    /**
     * Gets the value of the bcheck05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCHECK05() {
        return bcheck05;
    }

    /**
     * Sets the value of the bcheck05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCHECK05(String value) {
        this.bcheck05 = value;
    }

    /**
     * Gets the value of the vcheck05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCHECK05() {
        return vcheck05;
    }

    /**
     * Sets the value of the vcheck05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCHECK05(String value) {
        this.vcheck05 = value;
    }

    /**
     * Gets the value of the kcheck05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKCHECK05() {
        return kcheck05;
    }

    /**
     * Sets the value of the kcheck05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKCHECK05(String value) {
        this.kcheck05 = value;
    }

    /**
     * Gets the value of the qcheck05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQCHECK05() {
        return qcheck05;
    }

    /**
     * Sets the value of the qcheck05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQCHECK05(String value) {
        this.qcheck05 = value;
    }

    /**
     * Gets the value of the qassign05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQASSIGN05() {
        return qassign05;
    }

    /**
     * Sets the value of the qassign05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQASSIGN05(String value) {
        this.qassign05 = value;
    }

    /**
     * Gets the value of the delrkurs05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELRKURS05() {
        return delrkurs05;
    }

    /**
     * Sets the value of the delrkurs05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELRKURS05(String value) {
        this.delrkurs05 = value;
    }

    /**
     * Gets the value of the insrktyp05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSRKTYP05() {
        return insrktyp05;
    }

    /**
     * Sets the value of the insrktyp05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSRKTYP05(String value) {
        this.insrktyp05 = value;
    }

    /**
     * Gets the value of the xdata05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXDATA05() {
        return xdata05;
    }

    /**
     * Sets the value of the xdata05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXDATA05(String value) {
        this.xdata05 = value;
    }

    /**
     * Gets the value of the teilntyp06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEILNTYP06() {
        return teilntyp06;
    }

    /**
     * Sets the value of the teilntyp06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEILNTYP06(String value) {
        this.teilntyp06 = value;
    }

    /**
     * Gets the value of the bcheck06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCHECK06() {
        return bcheck06;
    }

    /**
     * Sets the value of the bcheck06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCHECK06(String value) {
        this.bcheck06 = value;
    }

    /**
     * Gets the value of the vcheck06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCHECK06() {
        return vcheck06;
    }

    /**
     * Sets the value of the vcheck06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCHECK06(String value) {
        this.vcheck06 = value;
    }

    /**
     * Gets the value of the kcheck06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKCHECK06() {
        return kcheck06;
    }

    /**
     * Sets the value of the kcheck06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKCHECK06(String value) {
        this.kcheck06 = value;
    }

    /**
     * Gets the value of the qcheck06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQCHECK06() {
        return qcheck06;
    }

    /**
     * Sets the value of the qcheck06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQCHECK06(String value) {
        this.qcheck06 = value;
    }

    /**
     * Gets the value of the qassign06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQASSIGN06() {
        return qassign06;
    }

    /**
     * Sets the value of the qassign06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQASSIGN06(String value) {
        this.qassign06 = value;
    }

    /**
     * Gets the value of the delrkurs06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELRKURS06() {
        return delrkurs06;
    }

    /**
     * Sets the value of the delrkurs06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELRKURS06(String value) {
        this.delrkurs06 = value;
    }

    /**
     * Gets the value of the insrktyp06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSRKTYP06() {
        return insrktyp06;
    }

    /**
     * Sets the value of the insrktyp06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSRKTYP06(String value) {
        this.insrktyp06 = value;
    }

    /**
     * Gets the value of the xdata06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXDATA06() {
        return xdata06;
    }

    /**
     * Sets the value of the xdata06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXDATA06(String value) {
        this.xdata06 = value;
    }

    /**
     * Gets the value of the teilntyp07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEILNTYP07() {
        return teilntyp07;
    }

    /**
     * Sets the value of the teilntyp07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEILNTYP07(String value) {
        this.teilntyp07 = value;
    }

    /**
     * Gets the value of the bcheck07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCHECK07() {
        return bcheck07;
    }

    /**
     * Sets the value of the bcheck07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCHECK07(String value) {
        this.bcheck07 = value;
    }

    /**
     * Gets the value of the vcheck07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCHECK07() {
        return vcheck07;
    }

    /**
     * Sets the value of the vcheck07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCHECK07(String value) {
        this.vcheck07 = value;
    }

    /**
     * Gets the value of the kcheck07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKCHECK07() {
        return kcheck07;
    }

    /**
     * Sets the value of the kcheck07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKCHECK07(String value) {
        this.kcheck07 = value;
    }

    /**
     * Gets the value of the qcheck07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQCHECK07() {
        return qcheck07;
    }

    /**
     * Sets the value of the qcheck07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQCHECK07(String value) {
        this.qcheck07 = value;
    }

    /**
     * Gets the value of the qassign07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQASSIGN07() {
        return qassign07;
    }

    /**
     * Sets the value of the qassign07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQASSIGN07(String value) {
        this.qassign07 = value;
    }

    /**
     * Gets the value of the delrkurs07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELRKURS07() {
        return delrkurs07;
    }

    /**
     * Sets the value of the delrkurs07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELRKURS07(String value) {
        this.delrkurs07 = value;
    }

    /**
     * Gets the value of the insrktyp07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSRKTYP07() {
        return insrktyp07;
    }

    /**
     * Sets the value of the insrktyp07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSRKTYP07(String value) {
        this.insrktyp07 = value;
    }

    /**
     * Gets the value of the xdata07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXDATA07() {
        return xdata07;
    }

    /**
     * Sets the value of the xdata07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXDATA07(String value) {
        this.xdata07 = value;
    }

    /**
     * Gets the value of the teilntyp08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEILNTYP08() {
        return teilntyp08;
    }

    /**
     * Sets the value of the teilntyp08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEILNTYP08(String value) {
        this.teilntyp08 = value;
    }

    /**
     * Gets the value of the bcheck08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCHECK08() {
        return bcheck08;
    }

    /**
     * Sets the value of the bcheck08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCHECK08(String value) {
        this.bcheck08 = value;
    }

    /**
     * Gets the value of the vcheck08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCHECK08() {
        return vcheck08;
    }

    /**
     * Sets the value of the vcheck08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCHECK08(String value) {
        this.vcheck08 = value;
    }

    /**
     * Gets the value of the kcheck08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKCHECK08() {
        return kcheck08;
    }

    /**
     * Sets the value of the kcheck08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKCHECK08(String value) {
        this.kcheck08 = value;
    }

    /**
     * Gets the value of the qcheck08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQCHECK08() {
        return qcheck08;
    }

    /**
     * Sets the value of the qcheck08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQCHECK08(String value) {
        this.qcheck08 = value;
    }

    /**
     * Gets the value of the qassign08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQASSIGN08() {
        return qassign08;
    }

    /**
     * Sets the value of the qassign08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQASSIGN08(String value) {
        this.qassign08 = value;
    }

    /**
     * Gets the value of the delrkurs08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELRKURS08() {
        return delrkurs08;
    }

    /**
     * Sets the value of the delrkurs08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELRKURS08(String value) {
        this.delrkurs08 = value;
    }

    /**
     * Gets the value of the insrktyp08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSRKTYP08() {
        return insrktyp08;
    }

    /**
     * Sets the value of the insrktyp08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSRKTYP08(String value) {
        this.insrktyp08 = value;
    }

    /**
     * Gets the value of the xdata08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXDATA08() {
        return xdata08;
    }

    /**
     * Sets the value of the xdata08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXDATA08(String value) {
        this.xdata08 = value;
    }

    /**
     * Gets the value of the teilntyp09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEILNTYP09() {
        return teilntyp09;
    }

    /**
     * Sets the value of the teilntyp09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEILNTYP09(String value) {
        this.teilntyp09 = value;
    }

    /**
     * Gets the value of the bcheck09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCHECK09() {
        return bcheck09;
    }

    /**
     * Sets the value of the bcheck09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCHECK09(String value) {
        this.bcheck09 = value;
    }

    /**
     * Gets the value of the vcheck09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCHECK09() {
        return vcheck09;
    }

    /**
     * Sets the value of the vcheck09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCHECK09(String value) {
        this.vcheck09 = value;
    }

    /**
     * Gets the value of the kcheck09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKCHECK09() {
        return kcheck09;
    }

    /**
     * Sets the value of the kcheck09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKCHECK09(String value) {
        this.kcheck09 = value;
    }

    /**
     * Gets the value of the qcheck09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQCHECK09() {
        return qcheck09;
    }

    /**
     * Sets the value of the qcheck09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQCHECK09(String value) {
        this.qcheck09 = value;
    }

    /**
     * Gets the value of the qassign09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQASSIGN09() {
        return qassign09;
    }

    /**
     * Sets the value of the qassign09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQASSIGN09(String value) {
        this.qassign09 = value;
    }

    /**
     * Gets the value of the delrkurs09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELRKURS09() {
        return delrkurs09;
    }

    /**
     * Sets the value of the delrkurs09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELRKURS09(String value) {
        this.delrkurs09 = value;
    }

    /**
     * Gets the value of the insrktyp09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSRKTYP09() {
        return insrktyp09;
    }

    /**
     * Sets the value of the insrktyp09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSRKTYP09(String value) {
        this.insrktyp09 = value;
    }

    /**
     * Gets the value of the xdata09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXDATA09() {
        return xdata09;
    }

    /**
     * Sets the value of the xdata09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXDATA09(String value) {
        this.xdata09 = value;
    }

    /**
     * Gets the value of the teilntyp10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEILNTYP10() {
        return teilntyp10;
    }

    /**
     * Sets the value of the teilntyp10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEILNTYP10(String value) {
        this.teilntyp10 = value;
    }

    /**
     * Gets the value of the bcheck10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCHECK10() {
        return bcheck10;
    }

    /**
     * Sets the value of the bcheck10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCHECK10(String value) {
        this.bcheck10 = value;
    }

    /**
     * Gets the value of the vcheck10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCHECK10() {
        return vcheck10;
    }

    /**
     * Sets the value of the vcheck10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCHECK10(String value) {
        this.vcheck10 = value;
    }

    /**
     * Gets the value of the kcheck10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKCHECK10() {
        return kcheck10;
    }

    /**
     * Sets the value of the kcheck10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKCHECK10(String value) {
        this.kcheck10 = value;
    }

    /**
     * Gets the value of the qcheck10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQCHECK10() {
        return qcheck10;
    }

    /**
     * Sets the value of the qcheck10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQCHECK10(String value) {
        this.qcheck10 = value;
    }

    /**
     * Gets the value of the qassign10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQASSIGN10() {
        return qassign10;
    }

    /**
     * Sets the value of the qassign10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQASSIGN10(String value) {
        this.qassign10 = value;
    }

    /**
     * Gets the value of the delrkurs10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELRKURS10() {
        return delrkurs10;
    }

    /**
     * Sets the value of the delrkurs10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELRKURS10(String value) {
        this.delrkurs10 = value;
    }

    /**
     * Gets the value of the insrktyp10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSRKTYP10() {
        return insrktyp10;
    }

    /**
     * Sets the value of the insrktyp10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSRKTYP10(String value) {
        this.insrktyp10 = value;
    }

    /**
     * Gets the value of the xdata10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXDATA10() {
        return xdata10;
    }

    /**
     * Sets the value of the xdata10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXDATA10(String value) {
        this.xdata10 = value;
    }

    /**
     * Gets the value of the teilntyp11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEILNTYP11() {
        return teilntyp11;
    }

    /**
     * Sets the value of the teilntyp11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEILNTYP11(String value) {
        this.teilntyp11 = value;
    }

    /**
     * Gets the value of the bcheck11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCHECK11() {
        return bcheck11;
    }

    /**
     * Sets the value of the bcheck11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCHECK11(String value) {
        this.bcheck11 = value;
    }

    /**
     * Gets the value of the vcheck11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCHECK11() {
        return vcheck11;
    }

    /**
     * Sets the value of the vcheck11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCHECK11(String value) {
        this.vcheck11 = value;
    }

    /**
     * Gets the value of the kcheck11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKCHECK11() {
        return kcheck11;
    }

    /**
     * Sets the value of the kcheck11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKCHECK11(String value) {
        this.kcheck11 = value;
    }

    /**
     * Gets the value of the qcheck11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQCHECK11() {
        return qcheck11;
    }

    /**
     * Sets the value of the qcheck11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQCHECK11(String value) {
        this.qcheck11 = value;
    }

    /**
     * Gets the value of the qassign11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQASSIGN11() {
        return qassign11;
    }

    /**
     * Sets the value of the qassign11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQASSIGN11(String value) {
        this.qassign11 = value;
    }

    /**
     * Gets the value of the delrkurs11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELRKURS11() {
        return delrkurs11;
    }

    /**
     * Sets the value of the delrkurs11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELRKURS11(String value) {
        this.delrkurs11 = value;
    }

    /**
     * Gets the value of the insrktyp11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSRKTYP11() {
        return insrktyp11;
    }

    /**
     * Sets the value of the insrktyp11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSRKTYP11(String value) {
        this.insrktyp11 = value;
    }

    /**
     * Gets the value of the xdata11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXDATA11() {
        return xdata11;
    }

    /**
     * Sets the value of the xdata11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXDATA11(String value) {
        this.xdata11 = value;
    }

    /**
     * Gets the value of the teilntyp12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEILNTYP12() {
        return teilntyp12;
    }

    /**
     * Sets the value of the teilntyp12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEILNTYP12(String value) {
        this.teilntyp12 = value;
    }

    /**
     * Gets the value of the bcheck12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCHECK12() {
        return bcheck12;
    }

    /**
     * Sets the value of the bcheck12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCHECK12(String value) {
        this.bcheck12 = value;
    }

    /**
     * Gets the value of the vcheck12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCHECK12() {
        return vcheck12;
    }

    /**
     * Sets the value of the vcheck12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCHECK12(String value) {
        this.vcheck12 = value;
    }

    /**
     * Gets the value of the kcheck12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKCHECK12() {
        return kcheck12;
    }

    /**
     * Sets the value of the kcheck12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKCHECK12(String value) {
        this.kcheck12 = value;
    }

    /**
     * Gets the value of the qcheck12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQCHECK12() {
        return qcheck12;
    }

    /**
     * Sets the value of the qcheck12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQCHECK12(String value) {
        this.qcheck12 = value;
    }

    /**
     * Gets the value of the qassign12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQASSIGN12() {
        return qassign12;
    }

    /**
     * Sets the value of the qassign12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQASSIGN12(String value) {
        this.qassign12 = value;
    }

    /**
     * Gets the value of the delrkurs12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELRKURS12() {
        return delrkurs12;
    }

    /**
     * Sets the value of the delrkurs12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELRKURS12(String value) {
        this.delrkurs12 = value;
    }

    /**
     * Gets the value of the insrktyp12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSRKTYP12() {
        return insrktyp12;
    }

    /**
     * Sets the value of the insrktyp12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSRKTYP12(String value) {
        this.insrktyp12 = value;
    }

    /**
     * Gets the value of the xdata12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXDATA12() {
        return xdata12;
    }

    /**
     * Sets the value of the xdata12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXDATA12(String value) {
        this.xdata12 = value;
    }

    /**
     * Gets the value of the teilntyp13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEILNTYP13() {
        return teilntyp13;
    }

    /**
     * Sets the value of the teilntyp13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEILNTYP13(String value) {
        this.teilntyp13 = value;
    }

    /**
     * Gets the value of the bcheck13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCHECK13() {
        return bcheck13;
    }

    /**
     * Sets the value of the bcheck13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCHECK13(String value) {
        this.bcheck13 = value;
    }

    /**
     * Gets the value of the vcheck13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCHECK13() {
        return vcheck13;
    }

    /**
     * Sets the value of the vcheck13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCHECK13(String value) {
        this.vcheck13 = value;
    }

    /**
     * Gets the value of the kcheck13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKCHECK13() {
        return kcheck13;
    }

    /**
     * Sets the value of the kcheck13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKCHECK13(String value) {
        this.kcheck13 = value;
    }

    /**
     * Gets the value of the qcheck13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQCHECK13() {
        return qcheck13;
    }

    /**
     * Sets the value of the qcheck13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQCHECK13(String value) {
        this.qcheck13 = value;
    }

    /**
     * Gets the value of the qassign13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQASSIGN13() {
        return qassign13;
    }

    /**
     * Sets the value of the qassign13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQASSIGN13(String value) {
        this.qassign13 = value;
    }

    /**
     * Gets the value of the delrkurs13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELRKURS13() {
        return delrkurs13;
    }

    /**
     * Sets the value of the delrkurs13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELRKURS13(String value) {
        this.delrkurs13 = value;
    }

    /**
     * Gets the value of the insrktyp13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSRKTYP13() {
        return insrktyp13;
    }

    /**
     * Sets the value of the insrktyp13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSRKTYP13(String value) {
        this.insrktyp13 = value;
    }

    /**
     * Gets the value of the xdata13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXDATA13() {
        return xdata13;
    }

    /**
     * Sets the value of the xdata13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXDATA13(String value) {
        this.xdata13 = value;
    }

    /**
     * Gets the value of the teilntyp14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEILNTYP14() {
        return teilntyp14;
    }

    /**
     * Sets the value of the teilntyp14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEILNTYP14(String value) {
        this.teilntyp14 = value;
    }

    /**
     * Gets the value of the bcheck14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCHECK14() {
        return bcheck14;
    }

    /**
     * Sets the value of the bcheck14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCHECK14(String value) {
        this.bcheck14 = value;
    }

    /**
     * Gets the value of the vcheck14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCHECK14() {
        return vcheck14;
    }

    /**
     * Sets the value of the vcheck14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCHECK14(String value) {
        this.vcheck14 = value;
    }

    /**
     * Gets the value of the kcheck14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKCHECK14() {
        return kcheck14;
    }

    /**
     * Sets the value of the kcheck14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKCHECK14(String value) {
        this.kcheck14 = value;
    }

    /**
     * Gets the value of the qcheck14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQCHECK14() {
        return qcheck14;
    }

    /**
     * Sets the value of the qcheck14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQCHECK14(String value) {
        this.qcheck14 = value;
    }

    /**
     * Gets the value of the qassign14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQASSIGN14() {
        return qassign14;
    }

    /**
     * Sets the value of the qassign14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQASSIGN14(String value) {
        this.qassign14 = value;
    }

    /**
     * Gets the value of the delrkurs14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELRKURS14() {
        return delrkurs14;
    }

    /**
     * Sets the value of the delrkurs14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELRKURS14(String value) {
        this.delrkurs14 = value;
    }

    /**
     * Gets the value of the insrktyp14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSRKTYP14() {
        return insrktyp14;
    }

    /**
     * Sets the value of the insrktyp14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSRKTYP14(String value) {
        this.insrktyp14 = value;
    }

    /**
     * Gets the value of the xdata14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXDATA14() {
        return xdata14;
    }

    /**
     * Sets the value of the xdata14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXDATA14(String value) {
        this.xdata14 = value;
    }

    /**
     * Gets the value of the teilntyp15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEILNTYP15() {
        return teilntyp15;
    }

    /**
     * Sets the value of the teilntyp15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEILNTYP15(String value) {
        this.teilntyp15 = value;
    }

    /**
     * Gets the value of the bcheck15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCHECK15() {
        return bcheck15;
    }

    /**
     * Sets the value of the bcheck15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCHECK15(String value) {
        this.bcheck15 = value;
    }

    /**
     * Gets the value of the vcheck15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCHECK15() {
        return vcheck15;
    }

    /**
     * Sets the value of the vcheck15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCHECK15(String value) {
        this.vcheck15 = value;
    }

    /**
     * Gets the value of the kcheck15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKCHECK15() {
        return kcheck15;
    }

    /**
     * Sets the value of the kcheck15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKCHECK15(String value) {
        this.kcheck15 = value;
    }

    /**
     * Gets the value of the qcheck15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQCHECK15() {
        return qcheck15;
    }

    /**
     * Sets the value of the qcheck15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQCHECK15(String value) {
        this.qcheck15 = value;
    }

    /**
     * Gets the value of the qassign15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQASSIGN15() {
        return qassign15;
    }

    /**
     * Sets the value of the qassign15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQASSIGN15(String value) {
        this.qassign15 = value;
    }

    /**
     * Gets the value of the delrkurs15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELRKURS15() {
        return delrkurs15;
    }

    /**
     * Sets the value of the delrkurs15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELRKURS15(String value) {
        this.delrkurs15 = value;
    }

    /**
     * Gets the value of the insrktyp15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSRKTYP15() {
        return insrktyp15;
    }

    /**
     * Sets the value of the insrktyp15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSRKTYP15(String value) {
        this.insrktyp15 = value;
    }

    /**
     * Gets the value of the xdata15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXDATA15() {
        return xdata15;
    }

    /**
     * Sets the value of the xdata15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXDATA15(String value) {
        this.xdata15 = value;
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
