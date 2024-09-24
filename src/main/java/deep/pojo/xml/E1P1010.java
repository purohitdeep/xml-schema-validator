
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
 *         &lt;element name="HILFM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM001" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM002" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM003" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM004" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM005" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM006" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM007" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM008" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM009" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM010" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM011" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM012" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM013" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM014" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM015" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM016" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM017" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM018" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM019" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM020" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM021" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM022" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM023" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM024" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM025" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM026" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM027" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM028" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM029" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM030" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM031" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM032" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM033" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM034" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM035" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM036" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM037" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM038" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM039" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM040" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM041" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM042" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM043" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM044" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM045" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM046" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM047" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM048" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM049" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM050" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM051" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM052" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM053" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM054" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM055" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM056" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM057" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM058" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM059" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM060" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM061" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM062" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM063" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM064" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM065" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM066" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM067" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM068" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM069" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM070" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM071" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM072" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM073" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM074" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM075" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM076" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM077" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM078" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM079" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM080" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM081" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HILFM082" minOccurs="0"&gt;
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
    "hilfm",
    "hilfm001",
    "hilfm002",
    "hilfm003",
    "hilfm004",
    "hilfm005",
    "hilfm006",
    "hilfm007",
    "hilfm008",
    "hilfm009",
    "hilfm010",
    "hilfm011",
    "hilfm012",
    "hilfm013",
    "hilfm014",
    "hilfm015",
    "hilfm016",
    "hilfm017",
    "hilfm018",
    "hilfm019",
    "hilfm020",
    "hilfm021",
    "hilfm022",
    "hilfm023",
    "hilfm024",
    "hilfm025",
    "hilfm026",
    "hilfm027",
    "hilfm028",
    "hilfm029",
    "hilfm030",
    "hilfm031",
    "hilfm032",
    "hilfm033",
    "hilfm034",
    "hilfm035",
    "hilfm036",
    "hilfm037",
    "hilfm038",
    "hilfm039",
    "hilfm040",
    "hilfm041",
    "hilfm042",
    "hilfm043",
    "hilfm044",
    "hilfm045",
    "hilfm046",
    "hilfm047",
    "hilfm048",
    "hilfm049",
    "hilfm050",
    "hilfm051",
    "hilfm052",
    "hilfm053",
    "hilfm054",
    "hilfm055",
    "hilfm056",
    "hilfm057",
    "hilfm058",
    "hilfm059",
    "hilfm060",
    "hilfm061",
    "hilfm062",
    "hilfm063",
    "hilfm064",
    "hilfm065",
    "hilfm066",
    "hilfm067",
    "hilfm068",
    "hilfm069",
    "hilfm070",
    "hilfm071",
    "hilfm072",
    "hilfm073",
    "hilfm074",
    "hilfm075",
    "hilfm076",
    "hilfm077",
    "hilfm078",
    "hilfm079",
    "hilfm080",
    "hilfm081",
    "hilfm082"
})
public class E1P1010 {

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
    @XmlElement(name = "HILFM")
    protected String hilfm;
    @XmlElement(name = "HILFM001")
    protected String hilfm001;
    @XmlElement(name = "HILFM002")
    protected String hilfm002;
    @XmlElement(name = "HILFM003")
    protected String hilfm003;
    @XmlElement(name = "HILFM004")
    protected String hilfm004;
    @XmlElement(name = "HILFM005")
    protected String hilfm005;
    @XmlElement(name = "HILFM006")
    protected String hilfm006;
    @XmlElement(name = "HILFM007")
    protected String hilfm007;
    @XmlElement(name = "HILFM008")
    protected String hilfm008;
    @XmlElement(name = "HILFM009")
    protected String hilfm009;
    @XmlElement(name = "HILFM010")
    protected String hilfm010;
    @XmlElement(name = "HILFM011")
    protected String hilfm011;
    @XmlElement(name = "HILFM012")
    protected String hilfm012;
    @XmlElement(name = "HILFM013")
    protected String hilfm013;
    @XmlElement(name = "HILFM014")
    protected String hilfm014;
    @XmlElement(name = "HILFM015")
    protected String hilfm015;
    @XmlElement(name = "HILFM016")
    protected String hilfm016;
    @XmlElement(name = "HILFM017")
    protected String hilfm017;
    @XmlElement(name = "HILFM018")
    protected String hilfm018;
    @XmlElement(name = "HILFM019")
    protected String hilfm019;
    @XmlElement(name = "HILFM020")
    protected String hilfm020;
    @XmlElement(name = "HILFM021")
    protected String hilfm021;
    @XmlElement(name = "HILFM022")
    protected String hilfm022;
    @XmlElement(name = "HILFM023")
    protected String hilfm023;
    @XmlElement(name = "HILFM024")
    protected String hilfm024;
    @XmlElement(name = "HILFM025")
    protected String hilfm025;
    @XmlElement(name = "HILFM026")
    protected String hilfm026;
    @XmlElement(name = "HILFM027")
    protected String hilfm027;
    @XmlElement(name = "HILFM028")
    protected String hilfm028;
    @XmlElement(name = "HILFM029")
    protected String hilfm029;
    @XmlElement(name = "HILFM030")
    protected String hilfm030;
    @XmlElement(name = "HILFM031")
    protected String hilfm031;
    @XmlElement(name = "HILFM032")
    protected String hilfm032;
    @XmlElement(name = "HILFM033")
    protected String hilfm033;
    @XmlElement(name = "HILFM034")
    protected String hilfm034;
    @XmlElement(name = "HILFM035")
    protected String hilfm035;
    @XmlElement(name = "HILFM036")
    protected String hilfm036;
    @XmlElement(name = "HILFM037")
    protected String hilfm037;
    @XmlElement(name = "HILFM038")
    protected String hilfm038;
    @XmlElement(name = "HILFM039")
    protected String hilfm039;
    @XmlElement(name = "HILFM040")
    protected String hilfm040;
    @XmlElement(name = "HILFM041")
    protected String hilfm041;
    @XmlElement(name = "HILFM042")
    protected String hilfm042;
    @XmlElement(name = "HILFM043")
    protected String hilfm043;
    @XmlElement(name = "HILFM044")
    protected String hilfm044;
    @XmlElement(name = "HILFM045")
    protected String hilfm045;
    @XmlElement(name = "HILFM046")
    protected String hilfm046;
    @XmlElement(name = "HILFM047")
    protected String hilfm047;
    @XmlElement(name = "HILFM048")
    protected String hilfm048;
    @XmlElement(name = "HILFM049")
    protected String hilfm049;
    @XmlElement(name = "HILFM050")
    protected String hilfm050;
    @XmlElement(name = "HILFM051")
    protected String hilfm051;
    @XmlElement(name = "HILFM052")
    protected String hilfm052;
    @XmlElement(name = "HILFM053")
    protected String hilfm053;
    @XmlElement(name = "HILFM054")
    protected String hilfm054;
    @XmlElement(name = "HILFM055")
    protected String hilfm055;
    @XmlElement(name = "HILFM056")
    protected String hilfm056;
    @XmlElement(name = "HILFM057")
    protected String hilfm057;
    @XmlElement(name = "HILFM058")
    protected String hilfm058;
    @XmlElement(name = "HILFM059")
    protected String hilfm059;
    @XmlElement(name = "HILFM060")
    protected String hilfm060;
    @XmlElement(name = "HILFM061")
    protected String hilfm061;
    @XmlElement(name = "HILFM062")
    protected String hilfm062;
    @XmlElement(name = "HILFM063")
    protected String hilfm063;
    @XmlElement(name = "HILFM064")
    protected String hilfm064;
    @XmlElement(name = "HILFM065")
    protected String hilfm065;
    @XmlElement(name = "HILFM066")
    protected String hilfm066;
    @XmlElement(name = "HILFM067")
    protected String hilfm067;
    @XmlElement(name = "HILFM068")
    protected String hilfm068;
    @XmlElement(name = "HILFM069")
    protected String hilfm069;
    @XmlElement(name = "HILFM070")
    protected String hilfm070;
    @XmlElement(name = "HILFM071")
    protected String hilfm071;
    @XmlElement(name = "HILFM072")
    protected String hilfm072;
    @XmlElement(name = "HILFM073")
    protected String hilfm073;
    @XmlElement(name = "HILFM074")
    protected String hilfm074;
    @XmlElement(name = "HILFM075")
    protected String hilfm075;
    @XmlElement(name = "HILFM076")
    protected String hilfm076;
    @XmlElement(name = "HILFM077")
    protected String hilfm077;
    @XmlElement(name = "HILFM078")
    protected String hilfm078;
    @XmlElement(name = "HILFM079")
    protected String hilfm079;
    @XmlElement(name = "HILFM080")
    protected String hilfm080;
    @XmlElement(name = "HILFM081")
    protected String hilfm081;
    @XmlElement(name = "HILFM082")
    protected String hilfm082;
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
     * Gets the value of the hilfm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM() {
        return hilfm;
    }

    /**
     * Sets the value of the hilfm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM(String value) {
        this.hilfm = value;
    }

    /**
     * Gets the value of the hilfm001 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM001() {
        return hilfm001;
    }

    /**
     * Sets the value of the hilfm001 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM001(String value) {
        this.hilfm001 = value;
    }

    /**
     * Gets the value of the hilfm002 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM002() {
        return hilfm002;
    }

    /**
     * Sets the value of the hilfm002 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM002(String value) {
        this.hilfm002 = value;
    }

    /**
     * Gets the value of the hilfm003 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM003() {
        return hilfm003;
    }

    /**
     * Sets the value of the hilfm003 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM003(String value) {
        this.hilfm003 = value;
    }

    /**
     * Gets the value of the hilfm004 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM004() {
        return hilfm004;
    }

    /**
     * Sets the value of the hilfm004 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM004(String value) {
        this.hilfm004 = value;
    }

    /**
     * Gets the value of the hilfm005 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM005() {
        return hilfm005;
    }

    /**
     * Sets the value of the hilfm005 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM005(String value) {
        this.hilfm005 = value;
    }

    /**
     * Gets the value of the hilfm006 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM006() {
        return hilfm006;
    }

    /**
     * Sets the value of the hilfm006 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM006(String value) {
        this.hilfm006 = value;
    }

    /**
     * Gets the value of the hilfm007 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM007() {
        return hilfm007;
    }

    /**
     * Sets the value of the hilfm007 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM007(String value) {
        this.hilfm007 = value;
    }

    /**
     * Gets the value of the hilfm008 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM008() {
        return hilfm008;
    }

    /**
     * Sets the value of the hilfm008 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM008(String value) {
        this.hilfm008 = value;
    }

    /**
     * Gets the value of the hilfm009 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM009() {
        return hilfm009;
    }

    /**
     * Sets the value of the hilfm009 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM009(String value) {
        this.hilfm009 = value;
    }

    /**
     * Gets the value of the hilfm010 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM010() {
        return hilfm010;
    }

    /**
     * Sets the value of the hilfm010 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM010(String value) {
        this.hilfm010 = value;
    }

    /**
     * Gets the value of the hilfm011 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM011() {
        return hilfm011;
    }

    /**
     * Sets the value of the hilfm011 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM011(String value) {
        this.hilfm011 = value;
    }

    /**
     * Gets the value of the hilfm012 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM012() {
        return hilfm012;
    }

    /**
     * Sets the value of the hilfm012 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM012(String value) {
        this.hilfm012 = value;
    }

    /**
     * Gets the value of the hilfm013 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM013() {
        return hilfm013;
    }

    /**
     * Sets the value of the hilfm013 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM013(String value) {
        this.hilfm013 = value;
    }

    /**
     * Gets the value of the hilfm014 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM014() {
        return hilfm014;
    }

    /**
     * Sets the value of the hilfm014 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM014(String value) {
        this.hilfm014 = value;
    }

    /**
     * Gets the value of the hilfm015 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM015() {
        return hilfm015;
    }

    /**
     * Sets the value of the hilfm015 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM015(String value) {
        this.hilfm015 = value;
    }

    /**
     * Gets the value of the hilfm016 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM016() {
        return hilfm016;
    }

    /**
     * Sets the value of the hilfm016 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM016(String value) {
        this.hilfm016 = value;
    }

    /**
     * Gets the value of the hilfm017 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM017() {
        return hilfm017;
    }

    /**
     * Sets the value of the hilfm017 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM017(String value) {
        this.hilfm017 = value;
    }

    /**
     * Gets the value of the hilfm018 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM018() {
        return hilfm018;
    }

    /**
     * Sets the value of the hilfm018 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM018(String value) {
        this.hilfm018 = value;
    }

    /**
     * Gets the value of the hilfm019 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM019() {
        return hilfm019;
    }

    /**
     * Sets the value of the hilfm019 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM019(String value) {
        this.hilfm019 = value;
    }

    /**
     * Gets the value of the hilfm020 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM020() {
        return hilfm020;
    }

    /**
     * Sets the value of the hilfm020 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM020(String value) {
        this.hilfm020 = value;
    }

    /**
     * Gets the value of the hilfm021 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM021() {
        return hilfm021;
    }

    /**
     * Sets the value of the hilfm021 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM021(String value) {
        this.hilfm021 = value;
    }

    /**
     * Gets the value of the hilfm022 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM022() {
        return hilfm022;
    }

    /**
     * Sets the value of the hilfm022 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM022(String value) {
        this.hilfm022 = value;
    }

    /**
     * Gets the value of the hilfm023 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM023() {
        return hilfm023;
    }

    /**
     * Sets the value of the hilfm023 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM023(String value) {
        this.hilfm023 = value;
    }

    /**
     * Gets the value of the hilfm024 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM024() {
        return hilfm024;
    }

    /**
     * Sets the value of the hilfm024 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM024(String value) {
        this.hilfm024 = value;
    }

    /**
     * Gets the value of the hilfm025 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM025() {
        return hilfm025;
    }

    /**
     * Sets the value of the hilfm025 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM025(String value) {
        this.hilfm025 = value;
    }

    /**
     * Gets the value of the hilfm026 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM026() {
        return hilfm026;
    }

    /**
     * Sets the value of the hilfm026 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM026(String value) {
        this.hilfm026 = value;
    }

    /**
     * Gets the value of the hilfm027 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM027() {
        return hilfm027;
    }

    /**
     * Sets the value of the hilfm027 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM027(String value) {
        this.hilfm027 = value;
    }

    /**
     * Gets the value of the hilfm028 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM028() {
        return hilfm028;
    }

    /**
     * Sets the value of the hilfm028 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM028(String value) {
        this.hilfm028 = value;
    }

    /**
     * Gets the value of the hilfm029 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM029() {
        return hilfm029;
    }

    /**
     * Sets the value of the hilfm029 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM029(String value) {
        this.hilfm029 = value;
    }

    /**
     * Gets the value of the hilfm030 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM030() {
        return hilfm030;
    }

    /**
     * Sets the value of the hilfm030 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM030(String value) {
        this.hilfm030 = value;
    }

    /**
     * Gets the value of the hilfm031 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM031() {
        return hilfm031;
    }

    /**
     * Sets the value of the hilfm031 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM031(String value) {
        this.hilfm031 = value;
    }

    /**
     * Gets the value of the hilfm032 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM032() {
        return hilfm032;
    }

    /**
     * Sets the value of the hilfm032 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM032(String value) {
        this.hilfm032 = value;
    }

    /**
     * Gets the value of the hilfm033 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM033() {
        return hilfm033;
    }

    /**
     * Sets the value of the hilfm033 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM033(String value) {
        this.hilfm033 = value;
    }

    /**
     * Gets the value of the hilfm034 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM034() {
        return hilfm034;
    }

    /**
     * Sets the value of the hilfm034 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM034(String value) {
        this.hilfm034 = value;
    }

    /**
     * Gets the value of the hilfm035 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM035() {
        return hilfm035;
    }

    /**
     * Sets the value of the hilfm035 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM035(String value) {
        this.hilfm035 = value;
    }

    /**
     * Gets the value of the hilfm036 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM036() {
        return hilfm036;
    }

    /**
     * Sets the value of the hilfm036 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM036(String value) {
        this.hilfm036 = value;
    }

    /**
     * Gets the value of the hilfm037 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM037() {
        return hilfm037;
    }

    /**
     * Sets the value of the hilfm037 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM037(String value) {
        this.hilfm037 = value;
    }

    /**
     * Gets the value of the hilfm038 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM038() {
        return hilfm038;
    }

    /**
     * Sets the value of the hilfm038 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM038(String value) {
        this.hilfm038 = value;
    }

    /**
     * Gets the value of the hilfm039 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM039() {
        return hilfm039;
    }

    /**
     * Sets the value of the hilfm039 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM039(String value) {
        this.hilfm039 = value;
    }

    /**
     * Gets the value of the hilfm040 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM040() {
        return hilfm040;
    }

    /**
     * Sets the value of the hilfm040 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM040(String value) {
        this.hilfm040 = value;
    }

    /**
     * Gets the value of the hilfm041 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM041() {
        return hilfm041;
    }

    /**
     * Sets the value of the hilfm041 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM041(String value) {
        this.hilfm041 = value;
    }

    /**
     * Gets the value of the hilfm042 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM042() {
        return hilfm042;
    }

    /**
     * Sets the value of the hilfm042 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM042(String value) {
        this.hilfm042 = value;
    }

    /**
     * Gets the value of the hilfm043 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM043() {
        return hilfm043;
    }

    /**
     * Sets the value of the hilfm043 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM043(String value) {
        this.hilfm043 = value;
    }

    /**
     * Gets the value of the hilfm044 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM044() {
        return hilfm044;
    }

    /**
     * Sets the value of the hilfm044 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM044(String value) {
        this.hilfm044 = value;
    }

    /**
     * Gets the value of the hilfm045 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM045() {
        return hilfm045;
    }

    /**
     * Sets the value of the hilfm045 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM045(String value) {
        this.hilfm045 = value;
    }

    /**
     * Gets the value of the hilfm046 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM046() {
        return hilfm046;
    }

    /**
     * Sets the value of the hilfm046 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM046(String value) {
        this.hilfm046 = value;
    }

    /**
     * Gets the value of the hilfm047 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM047() {
        return hilfm047;
    }

    /**
     * Sets the value of the hilfm047 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM047(String value) {
        this.hilfm047 = value;
    }

    /**
     * Gets the value of the hilfm048 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM048() {
        return hilfm048;
    }

    /**
     * Sets the value of the hilfm048 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM048(String value) {
        this.hilfm048 = value;
    }

    /**
     * Gets the value of the hilfm049 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM049() {
        return hilfm049;
    }

    /**
     * Sets the value of the hilfm049 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM049(String value) {
        this.hilfm049 = value;
    }

    /**
     * Gets the value of the hilfm050 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM050() {
        return hilfm050;
    }

    /**
     * Sets the value of the hilfm050 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM050(String value) {
        this.hilfm050 = value;
    }

    /**
     * Gets the value of the hilfm051 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM051() {
        return hilfm051;
    }

    /**
     * Sets the value of the hilfm051 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM051(String value) {
        this.hilfm051 = value;
    }

    /**
     * Gets the value of the hilfm052 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM052() {
        return hilfm052;
    }

    /**
     * Sets the value of the hilfm052 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM052(String value) {
        this.hilfm052 = value;
    }

    /**
     * Gets the value of the hilfm053 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM053() {
        return hilfm053;
    }

    /**
     * Sets the value of the hilfm053 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM053(String value) {
        this.hilfm053 = value;
    }

    /**
     * Gets the value of the hilfm054 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM054() {
        return hilfm054;
    }

    /**
     * Sets the value of the hilfm054 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM054(String value) {
        this.hilfm054 = value;
    }

    /**
     * Gets the value of the hilfm055 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM055() {
        return hilfm055;
    }

    /**
     * Sets the value of the hilfm055 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM055(String value) {
        this.hilfm055 = value;
    }

    /**
     * Gets the value of the hilfm056 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM056() {
        return hilfm056;
    }

    /**
     * Sets the value of the hilfm056 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM056(String value) {
        this.hilfm056 = value;
    }

    /**
     * Gets the value of the hilfm057 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM057() {
        return hilfm057;
    }

    /**
     * Sets the value of the hilfm057 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM057(String value) {
        this.hilfm057 = value;
    }

    /**
     * Gets the value of the hilfm058 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM058() {
        return hilfm058;
    }

    /**
     * Sets the value of the hilfm058 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM058(String value) {
        this.hilfm058 = value;
    }

    /**
     * Gets the value of the hilfm059 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM059() {
        return hilfm059;
    }

    /**
     * Sets the value of the hilfm059 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM059(String value) {
        this.hilfm059 = value;
    }

    /**
     * Gets the value of the hilfm060 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM060() {
        return hilfm060;
    }

    /**
     * Sets the value of the hilfm060 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM060(String value) {
        this.hilfm060 = value;
    }

    /**
     * Gets the value of the hilfm061 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM061() {
        return hilfm061;
    }

    /**
     * Sets the value of the hilfm061 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM061(String value) {
        this.hilfm061 = value;
    }

    /**
     * Gets the value of the hilfm062 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM062() {
        return hilfm062;
    }

    /**
     * Sets the value of the hilfm062 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM062(String value) {
        this.hilfm062 = value;
    }

    /**
     * Gets the value of the hilfm063 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM063() {
        return hilfm063;
    }

    /**
     * Sets the value of the hilfm063 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM063(String value) {
        this.hilfm063 = value;
    }

    /**
     * Gets the value of the hilfm064 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM064() {
        return hilfm064;
    }

    /**
     * Sets the value of the hilfm064 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM064(String value) {
        this.hilfm064 = value;
    }

    /**
     * Gets the value of the hilfm065 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM065() {
        return hilfm065;
    }

    /**
     * Sets the value of the hilfm065 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM065(String value) {
        this.hilfm065 = value;
    }

    /**
     * Gets the value of the hilfm066 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM066() {
        return hilfm066;
    }

    /**
     * Sets the value of the hilfm066 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM066(String value) {
        this.hilfm066 = value;
    }

    /**
     * Gets the value of the hilfm067 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM067() {
        return hilfm067;
    }

    /**
     * Sets the value of the hilfm067 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM067(String value) {
        this.hilfm067 = value;
    }

    /**
     * Gets the value of the hilfm068 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM068() {
        return hilfm068;
    }

    /**
     * Sets the value of the hilfm068 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM068(String value) {
        this.hilfm068 = value;
    }

    /**
     * Gets the value of the hilfm069 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM069() {
        return hilfm069;
    }

    /**
     * Sets the value of the hilfm069 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM069(String value) {
        this.hilfm069 = value;
    }

    /**
     * Gets the value of the hilfm070 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM070() {
        return hilfm070;
    }

    /**
     * Sets the value of the hilfm070 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM070(String value) {
        this.hilfm070 = value;
    }

    /**
     * Gets the value of the hilfm071 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM071() {
        return hilfm071;
    }

    /**
     * Sets the value of the hilfm071 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM071(String value) {
        this.hilfm071 = value;
    }

    /**
     * Gets the value of the hilfm072 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM072() {
        return hilfm072;
    }

    /**
     * Sets the value of the hilfm072 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM072(String value) {
        this.hilfm072 = value;
    }

    /**
     * Gets the value of the hilfm073 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM073() {
        return hilfm073;
    }

    /**
     * Sets the value of the hilfm073 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM073(String value) {
        this.hilfm073 = value;
    }

    /**
     * Gets the value of the hilfm074 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM074() {
        return hilfm074;
    }

    /**
     * Sets the value of the hilfm074 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM074(String value) {
        this.hilfm074 = value;
    }

    /**
     * Gets the value of the hilfm075 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM075() {
        return hilfm075;
    }

    /**
     * Sets the value of the hilfm075 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM075(String value) {
        this.hilfm075 = value;
    }

    /**
     * Gets the value of the hilfm076 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM076() {
        return hilfm076;
    }

    /**
     * Sets the value of the hilfm076 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM076(String value) {
        this.hilfm076 = value;
    }

    /**
     * Gets the value of the hilfm077 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM077() {
        return hilfm077;
    }

    /**
     * Sets the value of the hilfm077 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM077(String value) {
        this.hilfm077 = value;
    }

    /**
     * Gets the value of the hilfm078 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM078() {
        return hilfm078;
    }

    /**
     * Sets the value of the hilfm078 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM078(String value) {
        this.hilfm078 = value;
    }

    /**
     * Gets the value of the hilfm079 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM079() {
        return hilfm079;
    }

    /**
     * Sets the value of the hilfm079 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM079(String value) {
        this.hilfm079 = value;
    }

    /**
     * Gets the value of the hilfm080 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM080() {
        return hilfm080;
    }

    /**
     * Sets the value of the hilfm080 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM080(String value) {
        this.hilfm080 = value;
    }

    /**
     * Gets the value of the hilfm081 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM081() {
        return hilfm081;
    }

    /**
     * Sets the value of the hilfm081 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM081(String value) {
        this.hilfm081 = value;
    }

    /**
     * Gets the value of the hilfm082 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHILFM082() {
        return hilfm082;
    }

    /**
     * Sets the value of the hilfm082 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHILFM082(String value) {
        this.hilfm082 = value;
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
