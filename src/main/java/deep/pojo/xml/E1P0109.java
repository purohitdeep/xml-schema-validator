
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
 *         &lt;element name="BEANC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BEAAN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BETIM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BEGWU" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
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
 *         &lt;element name="BEUWG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BECAO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BEGPC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BECNR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BEMCH" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BEGFB" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BEGGH" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BREGM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WOAHO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WPADR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BPSNS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ONSSAPLPSTFBI" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ONSSAPLSTF" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ONSSAPLSTPI" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="P12P_CA_SIT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CA_SIT" minOccurs="0"&gt;
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
 *         &lt;element name="DIMNR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DIC3C" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DIC3F" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WPADD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LOCUN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WRKPB" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PDNY1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PDNQ1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PDNV1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PDNY2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PDNQ2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PDNV2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PDNY3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PDNQ3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PDNV3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PDNY4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PDNQ4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PDNV4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PDNY5" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PDNQ5" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PDNV5" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DISPD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DISND" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NACEC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DISHW" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
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
    "beanc",
    "beaan",
    "betim",
    "begwu",
    "waers",
    "beuwg",
    "becao",
    "begpc",
    "becnr",
    "bemch",
    "begfb",
    "beggh",
    "bregm",
    "woaho",
    "wpadr",
    "bpsns",
    "onssaplpstfbi",
    "onssaplstf",
    "onssaplstpi",
    "p12PCASIT",
    "casit",
    "grpvl",
    "dimnr",
    "dic3C",
    "dic3F",
    "wpadd",
    "locun",
    "wrkpb",
    "pdny1",
    "pdnq1",
    "pdnv1",
    "pdny2",
    "pdnq2",
    "pdnv2",
    "pdny3",
    "pdnq3",
    "pdnv3",
    "pdny4",
    "pdnq4",
    "pdnv4",
    "pdny5",
    "pdnq5",
    "pdnv5",
    "dispd",
    "disnd",
    "nacec",
    "dishw"
})
public class E1P0109 {

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
    @XmlElement(name = "BEANC")
    protected String beanc;
    @XmlElement(name = "BEAAN")
    protected String beaan;
    @XmlElement(name = "BETIM")
    protected String betim;
    @XmlElement(name = "BEGWU")
    protected String begwu;
    @XmlElement(name = "WAERS")
    protected String waers;
    @XmlElement(name = "BEUWG")
    protected String beuwg;
    @XmlElement(name = "BECAO")
    protected String becao;
    @XmlElement(name = "BEGPC")
    protected String begpc;
    @XmlElement(name = "BECNR")
    protected String becnr;
    @XmlElement(name = "BEMCH")
    protected String bemch;
    @XmlElement(name = "BEGFB")
    protected String begfb;
    @XmlElement(name = "BEGGH")
    protected String beggh;
    @XmlElement(name = "BREGM")
    protected String bregm;
    @XmlElement(name = "WOAHO")
    protected String woaho;
    @XmlElement(name = "WPADR")
    protected String wpadr;
    @XmlElement(name = "BPSNS")
    protected String bpsns;
    @XmlElement(name = "ONSSAPLPSTFBI")
    protected String onssaplpstfbi;
    @XmlElement(name = "ONSSAPLSTF")
    protected String onssaplstf;
    @XmlElement(name = "ONSSAPLSTPI")
    protected String onssaplstpi;
    @XmlElement(name = "P12P_CA_SIT")
    protected String p12PCASIT;
    @XmlElement(name = "CA_SIT")
    protected String casit;
    @XmlElement(name = "GRPVL")
    protected String grpvl;
    @XmlElement(name = "DIMNR")
    protected String dimnr;
    @XmlElement(name = "DIC3C")
    protected String dic3C;
    @XmlElement(name = "DIC3F")
    protected String dic3F;
    @XmlElement(name = "WPADD")
    protected String wpadd;
    @XmlElement(name = "LOCUN")
    protected String locun;
    @XmlElement(name = "WRKPB")
    protected String wrkpb;
    @XmlElement(name = "PDNY1")
    protected String pdny1;
    @XmlElement(name = "PDNQ1")
    protected String pdnq1;
    @XmlElement(name = "PDNV1")
    protected String pdnv1;
    @XmlElement(name = "PDNY2")
    protected String pdny2;
    @XmlElement(name = "PDNQ2")
    protected String pdnq2;
    @XmlElement(name = "PDNV2")
    protected String pdnv2;
    @XmlElement(name = "PDNY3")
    protected String pdny3;
    @XmlElement(name = "PDNQ3")
    protected String pdnq3;
    @XmlElement(name = "PDNV3")
    protected String pdnv3;
    @XmlElement(name = "PDNY4")
    protected String pdny4;
    @XmlElement(name = "PDNQ4")
    protected String pdnq4;
    @XmlElement(name = "PDNV4")
    protected String pdnv4;
    @XmlElement(name = "PDNY5")
    protected String pdny5;
    @XmlElement(name = "PDNQ5")
    protected String pdnq5;
    @XmlElement(name = "PDNV5")
    protected String pdnv5;
    @XmlElement(name = "DISPD")
    protected String dispd;
    @XmlElement(name = "DISND")
    protected String disnd;
    @XmlElement(name = "NACEC")
    protected String nacec;
    @XmlElement(name = "DISHW")
    protected String dishw;
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
     * Gets the value of the beanc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEANC() {
        return beanc;
    }

    /**
     * Sets the value of the beanc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBEANC(String value) {
        this.beanc = value;
    }

    /**
     * Gets the value of the beaan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEAAN() {
        return beaan;
    }

    /**
     * Sets the value of the beaan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBEAAN(String value) {
        this.beaan = value;
    }

    /**
     * Gets the value of the betim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBETIM() {
        return betim;
    }

    /**
     * Sets the value of the betim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBETIM(String value) {
        this.betim = value;
    }

    /**
     * Gets the value of the begwu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEGWU() {
        return begwu;
    }

    /**
     * Sets the value of the begwu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBEGWU(String value) {
        this.begwu = value;
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
     * Gets the value of the beuwg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEUWG() {
        return beuwg;
    }

    /**
     * Sets the value of the beuwg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBEUWG(String value) {
        this.beuwg = value;
    }

    /**
     * Gets the value of the becao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBECAO() {
        return becao;
    }

    /**
     * Sets the value of the becao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBECAO(String value) {
        this.becao = value;
    }

    /**
     * Gets the value of the begpc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEGPC() {
        return begpc;
    }

    /**
     * Sets the value of the begpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBEGPC(String value) {
        this.begpc = value;
    }

    /**
     * Gets the value of the becnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBECNR() {
        return becnr;
    }

    /**
     * Sets the value of the becnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBECNR(String value) {
        this.becnr = value;
    }

    /**
     * Gets the value of the bemch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEMCH() {
        return bemch;
    }

    /**
     * Sets the value of the bemch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBEMCH(String value) {
        this.bemch = value;
    }

    /**
     * Gets the value of the begfb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEGFB() {
        return begfb;
    }

    /**
     * Sets the value of the begfb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBEGFB(String value) {
        this.begfb = value;
    }

    /**
     * Gets the value of the beggh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEGGH() {
        return beggh;
    }

    /**
     * Sets the value of the beggh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBEGGH(String value) {
        this.beggh = value;
    }

    /**
     * Gets the value of the bregm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBREGM() {
        return bregm;
    }

    /**
     * Sets the value of the bregm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBREGM(String value) {
        this.bregm = value;
    }

    /**
     * Gets the value of the woaho property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWOAHO() {
        return woaho;
    }

    /**
     * Sets the value of the woaho property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWOAHO(String value) {
        this.woaho = value;
    }

    /**
     * Gets the value of the wpadr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWPADR() {
        return wpadr;
    }

    /**
     * Sets the value of the wpadr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWPADR(String value) {
        this.wpadr = value;
    }

    /**
     * Gets the value of the bpsns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPSNS() {
        return bpsns;
    }

    /**
     * Sets the value of the bpsns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPSNS(String value) {
        this.bpsns = value;
    }

    /**
     * Gets the value of the onssaplpstfbi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONSSAPLPSTFBI() {
        return onssaplpstfbi;
    }

    /**
     * Sets the value of the onssaplpstfbi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONSSAPLPSTFBI(String value) {
        this.onssaplpstfbi = value;
    }

    /**
     * Gets the value of the onssaplstf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONSSAPLSTF() {
        return onssaplstf;
    }

    /**
     * Sets the value of the onssaplstf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONSSAPLSTF(String value) {
        this.onssaplstf = value;
    }

    /**
     * Gets the value of the onssaplstpi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONSSAPLSTPI() {
        return onssaplstpi;
    }

    /**
     * Sets the value of the onssaplstpi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONSSAPLSTPI(String value) {
        this.onssaplstpi = value;
    }

    /**
     * Gets the value of the p12PCASIT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getP12PCASIT() {
        return p12PCASIT;
    }

    /**
     * Sets the value of the p12PCASIT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setP12PCASIT(String value) {
        this.p12PCASIT = value;
    }

    /**
     * Gets the value of the casit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCASIT() {
        return casit;
    }

    /**
     * Sets the value of the casit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCASIT(String value) {
        this.casit = value;
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
     * Gets the value of the dimnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIMNR() {
        return dimnr;
    }

    /**
     * Sets the value of the dimnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIMNR(String value) {
        this.dimnr = value;
    }

    /**
     * Gets the value of the dic3C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIC3C() {
        return dic3C;
    }

    /**
     * Sets the value of the dic3C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIC3C(String value) {
        this.dic3C = value;
    }

    /**
     * Gets the value of the dic3F property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIC3F() {
        return dic3F;
    }

    /**
     * Sets the value of the dic3F property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIC3F(String value) {
        this.dic3F = value;
    }

    /**
     * Gets the value of the wpadd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWPADD() {
        return wpadd;
    }

    /**
     * Sets the value of the wpadd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWPADD(String value) {
        this.wpadd = value;
    }

    /**
     * Gets the value of the locun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCUN() {
        return locun;
    }

    /**
     * Sets the value of the locun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCUN(String value) {
        this.locun = value;
    }

    /**
     * Gets the value of the wrkpb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWRKPB() {
        return wrkpb;
    }

    /**
     * Sets the value of the wrkpb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWRKPB(String value) {
        this.wrkpb = value;
    }

    /**
     * Gets the value of the pdny1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDNY1() {
        return pdny1;
    }

    /**
     * Sets the value of the pdny1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDNY1(String value) {
        this.pdny1 = value;
    }

    /**
     * Gets the value of the pdnq1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDNQ1() {
        return pdnq1;
    }

    /**
     * Sets the value of the pdnq1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDNQ1(String value) {
        this.pdnq1 = value;
    }

    /**
     * Gets the value of the pdnv1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDNV1() {
        return pdnv1;
    }

    /**
     * Sets the value of the pdnv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDNV1(String value) {
        this.pdnv1 = value;
    }

    /**
     * Gets the value of the pdny2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDNY2() {
        return pdny2;
    }

    /**
     * Sets the value of the pdny2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDNY2(String value) {
        this.pdny2 = value;
    }

    /**
     * Gets the value of the pdnq2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDNQ2() {
        return pdnq2;
    }

    /**
     * Sets the value of the pdnq2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDNQ2(String value) {
        this.pdnq2 = value;
    }

    /**
     * Gets the value of the pdnv2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDNV2() {
        return pdnv2;
    }

    /**
     * Sets the value of the pdnv2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDNV2(String value) {
        this.pdnv2 = value;
    }

    /**
     * Gets the value of the pdny3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDNY3() {
        return pdny3;
    }

    /**
     * Sets the value of the pdny3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDNY3(String value) {
        this.pdny3 = value;
    }

    /**
     * Gets the value of the pdnq3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDNQ3() {
        return pdnq3;
    }

    /**
     * Sets the value of the pdnq3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDNQ3(String value) {
        this.pdnq3 = value;
    }

    /**
     * Gets the value of the pdnv3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDNV3() {
        return pdnv3;
    }

    /**
     * Sets the value of the pdnv3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDNV3(String value) {
        this.pdnv3 = value;
    }

    /**
     * Gets the value of the pdny4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDNY4() {
        return pdny4;
    }

    /**
     * Sets the value of the pdny4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDNY4(String value) {
        this.pdny4 = value;
    }

    /**
     * Gets the value of the pdnq4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDNQ4() {
        return pdnq4;
    }

    /**
     * Sets the value of the pdnq4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDNQ4(String value) {
        this.pdnq4 = value;
    }

    /**
     * Gets the value of the pdnv4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDNV4() {
        return pdnv4;
    }

    /**
     * Sets the value of the pdnv4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDNV4(String value) {
        this.pdnv4 = value;
    }

    /**
     * Gets the value of the pdny5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDNY5() {
        return pdny5;
    }

    /**
     * Sets the value of the pdny5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDNY5(String value) {
        this.pdny5 = value;
    }

    /**
     * Gets the value of the pdnq5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDNQ5() {
        return pdnq5;
    }

    /**
     * Sets the value of the pdnq5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDNQ5(String value) {
        this.pdnq5 = value;
    }

    /**
     * Gets the value of the pdnv5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDNV5() {
        return pdnv5;
    }

    /**
     * Sets the value of the pdnv5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDNV5(String value) {
        this.pdnv5 = value;
    }

    /**
     * Gets the value of the dispd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISPD() {
        return dispd;
    }

    /**
     * Sets the value of the dispd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISPD(String value) {
        this.dispd = value;
    }

    /**
     * Gets the value of the disnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISND() {
        return disnd;
    }

    /**
     * Sets the value of the disnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISND(String value) {
        this.disnd = value;
    }

    /**
     * Gets the value of the nacec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNACEC() {
        return nacec;
    }

    /**
     * Sets the value of the nacec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNACEC(String value) {
        this.nacec = value;
    }

    /**
     * Gets the value of the dishw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISHW() {
        return dishw;
    }

    /**
     * Sets the value of the dishw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISHW(String value) {
        this.dishw = value;
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
