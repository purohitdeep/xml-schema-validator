
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
 *         &lt;element name="RSIGN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RELAT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
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
 *         &lt;element name="SCLAS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SOBID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="45"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PROZT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MANZL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BUDAT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INTEX" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KKOST" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KWAER" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KOKRS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KOSTL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZDATA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BELNR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CAATR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PREVSCLAS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PREVSOBID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="45"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EVENT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="STATUS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="REFDOCNO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="REFDOCITEM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DOCUMENTDATE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="POSTINGDATE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DOCUNAME" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CREDITBELNR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CREDITSTATUS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SCOSTCENTER" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RECEIVEORDER" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RSALESORDER" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RSALESITEM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ACTIVITYTYPE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QUANTITY" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="17"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNIT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SOLD_TO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BILL_TO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PAYER" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SHIP_TO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NET_PRICE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="19"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TAX_PRICE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="19"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PURCH_ORDER" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CC_TYPE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CC_NUMBER" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CC_VALID_TO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CC_NAME" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RWBSELEMENT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="24"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PAY_STATUS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CC_NUMBER_CHECK" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CC_AUTH_STATUS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="REFDOCSEQNR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
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
    "rsign",
    "relat",
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
    "sclas",
    "sobid",
    "prozt",
    "manzl",
    "budat",
    "intex",
    "kkost",
    "kwaer",
    "kokrs",
    "kostl",
    "zdata",
    "belnr",
    "caatr",
    "prevsclas",
    "prevsobid",
    "event",
    "status",
    "refdocno",
    "refdocitem",
    "documentdate",
    "postingdate",
    "docuname",
    "creditbelnr",
    "creditstatus",
    "scostcenter",
    "receiveorder",
    "rsalesorder",
    "rsalesitem",
    "activitytype",
    "quantity",
    "unit",
    "soldto",
    "billto",
    "payer",
    "shipto",
    "netprice",
    "taxprice",
    "purchorder",
    "cctype",
    "ccnumber",
    "ccvalidto",
    "ccname",
    "rwbselement",
    "paystatus",
    "ccnumbercheck",
    "ccauthstatus",
    "refdocseqnr"
})
public class E1PAD25 {

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
    @XmlElement(name = "RSIGN")
    protected String rsign;
    @XmlElement(name = "RELAT")
    protected String relat;
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
    @XmlElement(name = "SCLAS")
    protected String sclas;
    @XmlElement(name = "SOBID")
    protected String sobid;
    @XmlElement(name = "PROZT")
    protected String prozt;
    @XmlElement(name = "MANZL")
    protected String manzl;
    @XmlElement(name = "BUDAT")
    protected String budat;
    @XmlElement(name = "INTEX")
    protected String intex;
    @XmlElement(name = "KKOST")
    protected String kkost;
    @XmlElement(name = "KWAER")
    protected String kwaer;
    @XmlElement(name = "KOKRS")
    protected String kokrs;
    @XmlElement(name = "KOSTL")
    protected String kostl;
    @XmlElement(name = "ZDATA")
    protected String zdata;
    @XmlElement(name = "BELNR")
    protected String belnr;
    @XmlElement(name = "CAATR")
    protected String caatr;
    @XmlElement(name = "PREVSCLAS")
    protected String prevsclas;
    @XmlElement(name = "PREVSOBID")
    protected String prevsobid;
    @XmlElement(name = "EVENT")
    protected String event;
    @XmlElement(name = "STATUS")
    protected String status;
    @XmlElement(name = "REFDOCNO")
    protected String refdocno;
    @XmlElement(name = "REFDOCITEM")
    protected String refdocitem;
    @XmlElement(name = "DOCUMENTDATE")
    protected String documentdate;
    @XmlElement(name = "POSTINGDATE")
    protected String postingdate;
    @XmlElement(name = "DOCUNAME")
    protected String docuname;
    @XmlElement(name = "CREDITBELNR")
    protected String creditbelnr;
    @XmlElement(name = "CREDITSTATUS")
    protected String creditstatus;
    @XmlElement(name = "SCOSTCENTER")
    protected String scostcenter;
    @XmlElement(name = "RECEIVEORDER")
    protected String receiveorder;
    @XmlElement(name = "RSALESORDER")
    protected String rsalesorder;
    @XmlElement(name = "RSALESITEM")
    protected String rsalesitem;
    @XmlElement(name = "ACTIVITYTYPE")
    protected String activitytype;
    @XmlElement(name = "QUANTITY")
    protected String quantity;
    @XmlElement(name = "UNIT")
    protected String unit;
    @XmlElement(name = "SOLD_TO")
    protected String soldto;
    @XmlElement(name = "BILL_TO")
    protected String billto;
    @XmlElement(name = "PAYER")
    protected String payer;
    @XmlElement(name = "SHIP_TO")
    protected String shipto;
    @XmlElement(name = "NET_PRICE")
    protected String netprice;
    @XmlElement(name = "TAX_PRICE")
    protected String taxprice;
    @XmlElement(name = "PURCH_ORDER")
    protected String purchorder;
    @XmlElement(name = "CC_TYPE")
    protected String cctype;
    @XmlElement(name = "CC_NUMBER")
    protected String ccnumber;
    @XmlElement(name = "CC_VALID_TO")
    protected String ccvalidto;
    @XmlElement(name = "CC_NAME")
    protected String ccname;
    @XmlElement(name = "RWBSELEMENT")
    protected String rwbselement;
    @XmlElement(name = "PAY_STATUS")
    protected String paystatus;
    @XmlElement(name = "CC_NUMBER_CHECK")
    protected String ccnumbercheck;
    @XmlElement(name = "CC_AUTH_STATUS")
    protected String ccauthstatus;
    @XmlElement(name = "REFDOCSEQNR")
    protected String refdocseqnr;
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
     * Gets the value of the rsign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSIGN() {
        return rsign;
    }

    /**
     * Sets the value of the rsign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSIGN(String value) {
        this.rsign = value;
    }

    /**
     * Gets the value of the relat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRELAT() {
        return relat;
    }

    /**
     * Sets the value of the relat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRELAT(String value) {
        this.relat = value;
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
     * Gets the value of the sclas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCLAS() {
        return sclas;
    }

    /**
     * Sets the value of the sclas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCLAS(String value) {
        this.sclas = value;
    }

    /**
     * Gets the value of the sobid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOBID() {
        return sobid;
    }

    /**
     * Sets the value of the sobid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOBID(String value) {
        this.sobid = value;
    }

    /**
     * Gets the value of the prozt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROZT() {
        return prozt;
    }

    /**
     * Sets the value of the prozt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROZT(String value) {
        this.prozt = value;
    }

    /**
     * Gets the value of the manzl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMANZL() {
        return manzl;
    }

    /**
     * Sets the value of the manzl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMANZL(String value) {
        this.manzl = value;
    }

    /**
     * Gets the value of the budat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUDAT() {
        return budat;
    }

    /**
     * Sets the value of the budat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUDAT(String value) {
        this.budat = value;
    }

    /**
     * Gets the value of the intex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTEX() {
        return intex;
    }

    /**
     * Sets the value of the intex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTEX(String value) {
        this.intex = value;
    }

    /**
     * Gets the value of the kkost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKKOST() {
        return kkost;
    }

    /**
     * Sets the value of the kkost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKKOST(String value) {
        this.kkost = value;
    }

    /**
     * Gets the value of the kwaer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKWAER() {
        return kwaer;
    }

    /**
     * Sets the value of the kwaer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKWAER(String value) {
        this.kwaer = value;
    }

    /**
     * Gets the value of the kokrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOKRS() {
        return kokrs;
    }

    /**
     * Sets the value of the kokrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOKRS(String value) {
        this.kokrs = value;
    }

    /**
     * Gets the value of the kostl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOSTL() {
        return kostl;
    }

    /**
     * Sets the value of the kostl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOSTL(String value) {
        this.kostl = value;
    }

    /**
     * Gets the value of the zdata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZDATA() {
        return zdata;
    }

    /**
     * Sets the value of the zdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZDATA(String value) {
        this.zdata = value;
    }

    /**
     * Gets the value of the belnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBELNR() {
        return belnr;
    }

    /**
     * Sets the value of the belnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBELNR(String value) {
        this.belnr = value;
    }

    /**
     * Gets the value of the caatr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAATR() {
        return caatr;
    }

    /**
     * Sets the value of the caatr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAATR(String value) {
        this.caatr = value;
    }

    /**
     * Gets the value of the prevsclas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPREVSCLAS() {
        return prevsclas;
    }

    /**
     * Sets the value of the prevsclas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPREVSCLAS(String value) {
        this.prevsclas = value;
    }

    /**
     * Gets the value of the prevsobid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPREVSOBID() {
        return prevsobid;
    }

    /**
     * Sets the value of the prevsobid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPREVSOBID(String value) {
        this.prevsobid = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEVENT() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEVENT(String value) {
        this.event = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the refdocno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFDOCNO() {
        return refdocno;
    }

    /**
     * Sets the value of the refdocno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFDOCNO(String value) {
        this.refdocno = value;
    }

    /**
     * Gets the value of the refdocitem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFDOCITEM() {
        return refdocitem;
    }

    /**
     * Sets the value of the refdocitem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFDOCITEM(String value) {
        this.refdocitem = value;
    }

    /**
     * Gets the value of the documentdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCUMENTDATE() {
        return documentdate;
    }

    /**
     * Sets the value of the documentdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCUMENTDATE(String value) {
        this.documentdate = value;
    }

    /**
     * Gets the value of the postingdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSTINGDATE() {
        return postingdate;
    }

    /**
     * Sets the value of the postingdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSTINGDATE(String value) {
        this.postingdate = value;
    }

    /**
     * Gets the value of the docuname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCUNAME() {
        return docuname;
    }

    /**
     * Sets the value of the docuname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCUNAME(String value) {
        this.docuname = value;
    }

    /**
     * Gets the value of the creditbelnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREDITBELNR() {
        return creditbelnr;
    }

    /**
     * Sets the value of the creditbelnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREDITBELNR(String value) {
        this.creditbelnr = value;
    }

    /**
     * Gets the value of the creditstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREDITSTATUS() {
        return creditstatus;
    }

    /**
     * Sets the value of the creditstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREDITSTATUS(String value) {
        this.creditstatus = value;
    }

    /**
     * Gets the value of the scostcenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCOSTCENTER() {
        return scostcenter;
    }

    /**
     * Sets the value of the scostcenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCOSTCENTER(String value) {
        this.scostcenter = value;
    }

    /**
     * Gets the value of the receiveorder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECEIVEORDER() {
        return receiveorder;
    }

    /**
     * Sets the value of the receiveorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECEIVEORDER(String value) {
        this.receiveorder = value;
    }

    /**
     * Gets the value of the rsalesorder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSALESORDER() {
        return rsalesorder;
    }

    /**
     * Sets the value of the rsalesorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSALESORDER(String value) {
        this.rsalesorder = value;
    }

    /**
     * Gets the value of the rsalesitem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSALESITEM() {
        return rsalesitem;
    }

    /**
     * Sets the value of the rsalesitem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSALESITEM(String value) {
        this.rsalesitem = value;
    }

    /**
     * Gets the value of the activitytype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTIVITYTYPE() {
        return activitytype;
    }

    /**
     * Sets the value of the activitytype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTIVITYTYPE(String value) {
        this.activitytype = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQUANTITY() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQUANTITY(String value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNIT() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNIT(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the soldto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOLDTO() {
        return soldto;
    }

    /**
     * Sets the value of the soldto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOLDTO(String value) {
        this.soldto = value;
    }

    /**
     * Gets the value of the billto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBILLTO() {
        return billto;
    }

    /**
     * Sets the value of the billto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBILLTO(String value) {
        this.billto = value;
    }

    /**
     * Gets the value of the payer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYER() {
        return payer;
    }

    /**
     * Sets the value of the payer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYER(String value) {
        this.payer = value;
    }

    /**
     * Gets the value of the shipto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHIPTO() {
        return shipto;
    }

    /**
     * Sets the value of the shipto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHIPTO(String value) {
        this.shipto = value;
    }

    /**
     * Gets the value of the netprice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNETPRICE() {
        return netprice;
    }

    /**
     * Sets the value of the netprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNETPRICE(String value) {
        this.netprice = value;
    }

    /**
     * Gets the value of the taxprice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAXPRICE() {
        return taxprice;
    }

    /**
     * Sets the value of the taxprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAXPRICE(String value) {
        this.taxprice = value;
    }

    /**
     * Gets the value of the purchorder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPURCHORDER() {
        return purchorder;
    }

    /**
     * Sets the value of the purchorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPURCHORDER(String value) {
        this.purchorder = value;
    }

    /**
     * Gets the value of the cctype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCTYPE() {
        return cctype;
    }

    /**
     * Sets the value of the cctype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCTYPE(String value) {
        this.cctype = value;
    }

    /**
     * Gets the value of the ccnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCNUMBER() {
        return ccnumber;
    }

    /**
     * Sets the value of the ccnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCNUMBER(String value) {
        this.ccnumber = value;
    }

    /**
     * Gets the value of the ccvalidto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCVALIDTO() {
        return ccvalidto;
    }

    /**
     * Sets the value of the ccvalidto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCVALIDTO(String value) {
        this.ccvalidto = value;
    }

    /**
     * Gets the value of the ccname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCNAME() {
        return ccname;
    }

    /**
     * Sets the value of the ccname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCNAME(String value) {
        this.ccname = value;
    }

    /**
     * Gets the value of the rwbselement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRWBSELEMENT() {
        return rwbselement;
    }

    /**
     * Sets the value of the rwbselement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRWBSELEMENT(String value) {
        this.rwbselement = value;
    }

    /**
     * Gets the value of the paystatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYSTATUS() {
        return paystatus;
    }

    /**
     * Sets the value of the paystatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYSTATUS(String value) {
        this.paystatus = value;
    }

    /**
     * Gets the value of the ccnumbercheck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCNUMBERCHECK() {
        return ccnumbercheck;
    }

    /**
     * Sets the value of the ccnumbercheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCNUMBERCHECK(String value) {
        this.ccnumbercheck = value;
    }

    /**
     * Gets the value of the ccauthstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCAUTHSTATUS() {
        return ccauthstatus;
    }

    /**
     * Sets the value of the ccauthstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCAUTHSTATUS(String value) {
        this.ccauthstatus = value;
    }

    /**
     * Gets the value of the refdocseqnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFDOCSEQNR() {
        return refdocseqnr;
    }

    /**
     * Sets the value of the refdocseqnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFDOCSEQNR(String value) {
        this.refdocseqnr = value;
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
