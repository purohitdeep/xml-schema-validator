
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
 *         &lt;element name="UNART" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART001" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART002" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART003" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART004" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART005" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART006" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART007" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART008" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART009" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART010" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART011" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART012" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART013" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART014" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART015" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART016" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART017" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART018" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART019" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART020" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART021" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART022" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART023" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART024" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART025" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART026" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART027" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART028" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART029" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART030" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART031" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART032" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART033" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART034" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART035" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART036" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART037" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART038" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART039" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART040" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART041" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART042" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART043" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART044" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART045" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART046" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART047" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART048" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART049" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART050" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART051" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART052" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART053" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART054" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART055" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART056" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART057" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART058" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART059" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART060" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNART061" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
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
    "unart",
    "unart001",
    "unart002",
    "unart003",
    "unart004",
    "unart005",
    "unart006",
    "unart007",
    "unart008",
    "unart009",
    "unart010",
    "unart011",
    "unart012",
    "unart013",
    "unart014",
    "unart015",
    "unart016",
    "unart017",
    "unart018",
    "unart019",
    "unart020",
    "unart021",
    "unart022",
    "unart023",
    "unart024",
    "unart025",
    "unart026",
    "unart027",
    "unart028",
    "unart029",
    "unart030",
    "unart031",
    "unart032",
    "unart033",
    "unart034",
    "unart035",
    "unart036",
    "unart037",
    "unart038",
    "unart039",
    "unart040",
    "unart041",
    "unart042",
    "unart043",
    "unart044",
    "unart045",
    "unart046",
    "unart047",
    "unart048",
    "unart049",
    "unart050",
    "unart051",
    "unart052",
    "unart053",
    "unart054",
    "unart055",
    "unart056",
    "unart057",
    "unart058",
    "unart059",
    "unart060",
    "unart061"
})
public class E1P1009 {

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
    @XmlElement(name = "UNART")
    protected String unart;
    @XmlElement(name = "UNART001")
    protected String unart001;
    @XmlElement(name = "UNART002")
    protected String unart002;
    @XmlElement(name = "UNART003")
    protected String unart003;
    @XmlElement(name = "UNART004")
    protected String unart004;
    @XmlElement(name = "UNART005")
    protected String unart005;
    @XmlElement(name = "UNART006")
    protected String unart006;
    @XmlElement(name = "UNART007")
    protected String unart007;
    @XmlElement(name = "UNART008")
    protected String unart008;
    @XmlElement(name = "UNART009")
    protected String unart009;
    @XmlElement(name = "UNART010")
    protected String unart010;
    @XmlElement(name = "UNART011")
    protected String unart011;
    @XmlElement(name = "UNART012")
    protected String unart012;
    @XmlElement(name = "UNART013")
    protected String unart013;
    @XmlElement(name = "UNART014")
    protected String unart014;
    @XmlElement(name = "UNART015")
    protected String unart015;
    @XmlElement(name = "UNART016")
    protected String unart016;
    @XmlElement(name = "UNART017")
    protected String unart017;
    @XmlElement(name = "UNART018")
    protected String unart018;
    @XmlElement(name = "UNART019")
    protected String unart019;
    @XmlElement(name = "UNART020")
    protected String unart020;
    @XmlElement(name = "UNART021")
    protected String unart021;
    @XmlElement(name = "UNART022")
    protected String unart022;
    @XmlElement(name = "UNART023")
    protected String unart023;
    @XmlElement(name = "UNART024")
    protected String unart024;
    @XmlElement(name = "UNART025")
    protected String unart025;
    @XmlElement(name = "UNART026")
    protected String unart026;
    @XmlElement(name = "UNART027")
    protected String unart027;
    @XmlElement(name = "UNART028")
    protected String unart028;
    @XmlElement(name = "UNART029")
    protected String unart029;
    @XmlElement(name = "UNART030")
    protected String unart030;
    @XmlElement(name = "UNART031")
    protected String unart031;
    @XmlElement(name = "UNART032")
    protected String unart032;
    @XmlElement(name = "UNART033")
    protected String unart033;
    @XmlElement(name = "UNART034")
    protected String unart034;
    @XmlElement(name = "UNART035")
    protected String unart035;
    @XmlElement(name = "UNART036")
    protected String unart036;
    @XmlElement(name = "UNART037")
    protected String unart037;
    @XmlElement(name = "UNART038")
    protected String unart038;
    @XmlElement(name = "UNART039")
    protected String unart039;
    @XmlElement(name = "UNART040")
    protected String unart040;
    @XmlElement(name = "UNART041")
    protected String unart041;
    @XmlElement(name = "UNART042")
    protected String unart042;
    @XmlElement(name = "UNART043")
    protected String unart043;
    @XmlElement(name = "UNART044")
    protected String unart044;
    @XmlElement(name = "UNART045")
    protected String unart045;
    @XmlElement(name = "UNART046")
    protected String unart046;
    @XmlElement(name = "UNART047")
    protected String unart047;
    @XmlElement(name = "UNART048")
    protected String unart048;
    @XmlElement(name = "UNART049")
    protected String unart049;
    @XmlElement(name = "UNART050")
    protected String unart050;
    @XmlElement(name = "UNART051")
    protected String unart051;
    @XmlElement(name = "UNART052")
    protected String unart052;
    @XmlElement(name = "UNART053")
    protected String unart053;
    @XmlElement(name = "UNART054")
    protected String unart054;
    @XmlElement(name = "UNART055")
    protected String unart055;
    @XmlElement(name = "UNART056")
    protected String unart056;
    @XmlElement(name = "UNART057")
    protected String unart057;
    @XmlElement(name = "UNART058")
    protected String unart058;
    @XmlElement(name = "UNART059")
    protected String unart059;
    @XmlElement(name = "UNART060")
    protected String unart060;
    @XmlElement(name = "UNART061")
    protected String unart061;
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
     * Gets the value of the unart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART() {
        return unart;
    }

    /**
     * Sets the value of the unart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART(String value) {
        this.unart = value;
    }

    /**
     * Gets the value of the unart001 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART001() {
        return unart001;
    }

    /**
     * Sets the value of the unart001 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART001(String value) {
        this.unart001 = value;
    }

    /**
     * Gets the value of the unart002 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART002() {
        return unart002;
    }

    /**
     * Sets the value of the unart002 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART002(String value) {
        this.unart002 = value;
    }

    /**
     * Gets the value of the unart003 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART003() {
        return unart003;
    }

    /**
     * Sets the value of the unart003 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART003(String value) {
        this.unart003 = value;
    }

    /**
     * Gets the value of the unart004 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART004() {
        return unart004;
    }

    /**
     * Sets the value of the unart004 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART004(String value) {
        this.unart004 = value;
    }

    /**
     * Gets the value of the unart005 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART005() {
        return unart005;
    }

    /**
     * Sets the value of the unart005 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART005(String value) {
        this.unart005 = value;
    }

    /**
     * Gets the value of the unart006 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART006() {
        return unart006;
    }

    /**
     * Sets the value of the unart006 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART006(String value) {
        this.unart006 = value;
    }

    /**
     * Gets the value of the unart007 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART007() {
        return unart007;
    }

    /**
     * Sets the value of the unart007 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART007(String value) {
        this.unart007 = value;
    }

    /**
     * Gets the value of the unart008 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART008() {
        return unart008;
    }

    /**
     * Sets the value of the unart008 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART008(String value) {
        this.unart008 = value;
    }

    /**
     * Gets the value of the unart009 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART009() {
        return unart009;
    }

    /**
     * Sets the value of the unart009 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART009(String value) {
        this.unart009 = value;
    }

    /**
     * Gets the value of the unart010 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART010() {
        return unart010;
    }

    /**
     * Sets the value of the unart010 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART010(String value) {
        this.unart010 = value;
    }

    /**
     * Gets the value of the unart011 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART011() {
        return unart011;
    }

    /**
     * Sets the value of the unart011 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART011(String value) {
        this.unart011 = value;
    }

    /**
     * Gets the value of the unart012 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART012() {
        return unart012;
    }

    /**
     * Sets the value of the unart012 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART012(String value) {
        this.unart012 = value;
    }

    /**
     * Gets the value of the unart013 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART013() {
        return unart013;
    }

    /**
     * Sets the value of the unart013 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART013(String value) {
        this.unart013 = value;
    }

    /**
     * Gets the value of the unart014 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART014() {
        return unart014;
    }

    /**
     * Sets the value of the unart014 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART014(String value) {
        this.unart014 = value;
    }

    /**
     * Gets the value of the unart015 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART015() {
        return unart015;
    }

    /**
     * Sets the value of the unart015 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART015(String value) {
        this.unart015 = value;
    }

    /**
     * Gets the value of the unart016 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART016() {
        return unart016;
    }

    /**
     * Sets the value of the unart016 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART016(String value) {
        this.unart016 = value;
    }

    /**
     * Gets the value of the unart017 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART017() {
        return unart017;
    }

    /**
     * Sets the value of the unart017 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART017(String value) {
        this.unart017 = value;
    }

    /**
     * Gets the value of the unart018 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART018() {
        return unart018;
    }

    /**
     * Sets the value of the unart018 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART018(String value) {
        this.unart018 = value;
    }

    /**
     * Gets the value of the unart019 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART019() {
        return unart019;
    }

    /**
     * Sets the value of the unart019 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART019(String value) {
        this.unart019 = value;
    }

    /**
     * Gets the value of the unart020 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART020() {
        return unart020;
    }

    /**
     * Sets the value of the unart020 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART020(String value) {
        this.unart020 = value;
    }

    /**
     * Gets the value of the unart021 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART021() {
        return unart021;
    }

    /**
     * Sets the value of the unart021 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART021(String value) {
        this.unart021 = value;
    }

    /**
     * Gets the value of the unart022 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART022() {
        return unart022;
    }

    /**
     * Sets the value of the unart022 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART022(String value) {
        this.unart022 = value;
    }

    /**
     * Gets the value of the unart023 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART023() {
        return unart023;
    }

    /**
     * Sets the value of the unart023 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART023(String value) {
        this.unart023 = value;
    }

    /**
     * Gets the value of the unart024 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART024() {
        return unart024;
    }

    /**
     * Sets the value of the unart024 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART024(String value) {
        this.unart024 = value;
    }

    /**
     * Gets the value of the unart025 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART025() {
        return unart025;
    }

    /**
     * Sets the value of the unart025 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART025(String value) {
        this.unart025 = value;
    }

    /**
     * Gets the value of the unart026 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART026() {
        return unart026;
    }

    /**
     * Sets the value of the unart026 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART026(String value) {
        this.unart026 = value;
    }

    /**
     * Gets the value of the unart027 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART027() {
        return unart027;
    }

    /**
     * Sets the value of the unart027 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART027(String value) {
        this.unart027 = value;
    }

    /**
     * Gets the value of the unart028 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART028() {
        return unart028;
    }

    /**
     * Sets the value of the unart028 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART028(String value) {
        this.unart028 = value;
    }

    /**
     * Gets the value of the unart029 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART029() {
        return unart029;
    }

    /**
     * Sets the value of the unart029 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART029(String value) {
        this.unart029 = value;
    }

    /**
     * Gets the value of the unart030 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART030() {
        return unart030;
    }

    /**
     * Sets the value of the unart030 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART030(String value) {
        this.unart030 = value;
    }

    /**
     * Gets the value of the unart031 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART031() {
        return unart031;
    }

    /**
     * Sets the value of the unart031 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART031(String value) {
        this.unart031 = value;
    }

    /**
     * Gets the value of the unart032 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART032() {
        return unart032;
    }

    /**
     * Sets the value of the unart032 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART032(String value) {
        this.unart032 = value;
    }

    /**
     * Gets the value of the unart033 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART033() {
        return unart033;
    }

    /**
     * Sets the value of the unart033 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART033(String value) {
        this.unart033 = value;
    }

    /**
     * Gets the value of the unart034 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART034() {
        return unart034;
    }

    /**
     * Sets the value of the unart034 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART034(String value) {
        this.unart034 = value;
    }

    /**
     * Gets the value of the unart035 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART035() {
        return unart035;
    }

    /**
     * Sets the value of the unart035 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART035(String value) {
        this.unart035 = value;
    }

    /**
     * Gets the value of the unart036 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART036() {
        return unart036;
    }

    /**
     * Sets the value of the unart036 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART036(String value) {
        this.unart036 = value;
    }

    /**
     * Gets the value of the unart037 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART037() {
        return unart037;
    }

    /**
     * Sets the value of the unart037 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART037(String value) {
        this.unart037 = value;
    }

    /**
     * Gets the value of the unart038 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART038() {
        return unart038;
    }

    /**
     * Sets the value of the unart038 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART038(String value) {
        this.unart038 = value;
    }

    /**
     * Gets the value of the unart039 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART039() {
        return unart039;
    }

    /**
     * Sets the value of the unart039 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART039(String value) {
        this.unart039 = value;
    }

    /**
     * Gets the value of the unart040 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART040() {
        return unart040;
    }

    /**
     * Sets the value of the unart040 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART040(String value) {
        this.unart040 = value;
    }

    /**
     * Gets the value of the unart041 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART041() {
        return unart041;
    }

    /**
     * Sets the value of the unart041 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART041(String value) {
        this.unart041 = value;
    }

    /**
     * Gets the value of the unart042 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART042() {
        return unart042;
    }

    /**
     * Sets the value of the unart042 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART042(String value) {
        this.unart042 = value;
    }

    /**
     * Gets the value of the unart043 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART043() {
        return unart043;
    }

    /**
     * Sets the value of the unart043 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART043(String value) {
        this.unart043 = value;
    }

    /**
     * Gets the value of the unart044 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART044() {
        return unart044;
    }

    /**
     * Sets the value of the unart044 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART044(String value) {
        this.unart044 = value;
    }

    /**
     * Gets the value of the unart045 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART045() {
        return unart045;
    }

    /**
     * Sets the value of the unart045 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART045(String value) {
        this.unart045 = value;
    }

    /**
     * Gets the value of the unart046 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART046() {
        return unart046;
    }

    /**
     * Sets the value of the unart046 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART046(String value) {
        this.unart046 = value;
    }

    /**
     * Gets the value of the unart047 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART047() {
        return unart047;
    }

    /**
     * Sets the value of the unart047 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART047(String value) {
        this.unart047 = value;
    }

    /**
     * Gets the value of the unart048 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART048() {
        return unart048;
    }

    /**
     * Sets the value of the unart048 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART048(String value) {
        this.unart048 = value;
    }

    /**
     * Gets the value of the unart049 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART049() {
        return unart049;
    }

    /**
     * Sets the value of the unart049 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART049(String value) {
        this.unart049 = value;
    }

    /**
     * Gets the value of the unart050 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART050() {
        return unart050;
    }

    /**
     * Sets the value of the unart050 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART050(String value) {
        this.unart050 = value;
    }

    /**
     * Gets the value of the unart051 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART051() {
        return unart051;
    }

    /**
     * Sets the value of the unart051 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART051(String value) {
        this.unart051 = value;
    }

    /**
     * Gets the value of the unart052 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART052() {
        return unart052;
    }

    /**
     * Sets the value of the unart052 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART052(String value) {
        this.unart052 = value;
    }

    /**
     * Gets the value of the unart053 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART053() {
        return unart053;
    }

    /**
     * Sets the value of the unart053 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART053(String value) {
        this.unart053 = value;
    }

    /**
     * Gets the value of the unart054 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART054() {
        return unart054;
    }

    /**
     * Sets the value of the unart054 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART054(String value) {
        this.unart054 = value;
    }

    /**
     * Gets the value of the unart055 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART055() {
        return unart055;
    }

    /**
     * Sets the value of the unart055 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART055(String value) {
        this.unart055 = value;
    }

    /**
     * Gets the value of the unart056 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART056() {
        return unart056;
    }

    /**
     * Sets the value of the unart056 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART056(String value) {
        this.unart056 = value;
    }

    /**
     * Gets the value of the unart057 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART057() {
        return unart057;
    }

    /**
     * Sets the value of the unart057 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART057(String value) {
        this.unart057 = value;
    }

    /**
     * Gets the value of the unart058 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART058() {
        return unart058;
    }

    /**
     * Sets the value of the unart058 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART058(String value) {
        this.unart058 = value;
    }

    /**
     * Gets the value of the unart059 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART059() {
        return unart059;
    }

    /**
     * Sets the value of the unart059 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART059(String value) {
        this.unart059 = value;
    }

    /**
     * Gets the value of the unart060 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART060() {
        return unart060;
    }

    /**
     * Sets the value of the unart060 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART060(String value) {
        this.unart060 = value;
    }

    /**
     * Gets the value of the unart061 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNART061() {
        return unart061;
    }

    /**
     * Sets the value of the unart061 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNART061(String value) {
        this.unart061 = value;
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
