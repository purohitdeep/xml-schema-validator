
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
 *         &lt;element name="GRPVL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
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
 *         &lt;element name="CASE_NUMBER" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="REGNR_FVP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SEND_DATE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PARTTIME_PERC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PENSION_DATE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PENSION_SALARY" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FRANCH_AMOUNT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BUILDUP_PERC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="YEAR_BUILDOP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NP_PERC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="YEAR_BUILDNP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CONTIN_PERC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PROVISION_PERC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GROSS_FVPAMOUNT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DEDUCTION_AMOUNT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DEDUCTION_PERC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NET_FVPAMOUNT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VALUE_DATE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PAY_DATE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="COMPENS_PERC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="COMPENS_AMOUNT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PAYMENT_DUE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FVP_CLAIMOP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FVP_CLAIMNP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BEGDA_BENEFIT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ENDDA_BENEFIT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SEND_CURR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RCV_CURR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="STATUS_OLD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="STATUS_ACT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WAITPER_PERC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PARTTIME_PERC2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BUILDUP_PERC2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NP_PERC2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CONTIN_PERC2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PROVISION_PERC2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DEDUCTION_PERC2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="COMPENS_PERC2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WAITPER_PERC2" minOccurs="0"&gt;
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
    "grpvl",
    "status",
    "casenumber",
    "regnrfvp",
    "senddate",
    "parttimeperc",
    "pensiondate",
    "pensionsalary",
    "franchamount",
    "buildupperc",
    "yearbuildop",
    "npperc",
    "yearbuildnp",
    "continperc",
    "provisionperc",
    "grossfvpamount",
    "deductionamount",
    "deductionperc",
    "netfvpamount",
    "valuedate",
    "paydate",
    "compensperc",
    "compensamount",
    "paymentdue",
    "fvpclaimop",
    "fvpclaimnp",
    "begdabenefit",
    "enddabenefit",
    "sendcurr",
    "rcvcurr",
    "statusold",
    "statusact",
    "waitperperc",
    "parttimeperc2",
    "buildupperc2",
    "npperc2",
    "continperc2",
    "provisionperc2",
    "deductionperc2",
    "compensperc2",
    "waitperperc2"
})
public class E1P0646 {

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
    @XmlElement(name = "GRPVL")
    protected String grpvl;
    @XmlElement(name = "STATUS")
    protected String status;
    @XmlElement(name = "CASE_NUMBER")
    protected String casenumber;
    @XmlElement(name = "REGNR_FVP")
    protected String regnrfvp;
    @XmlElement(name = "SEND_DATE")
    protected String senddate;
    @XmlElement(name = "PARTTIME_PERC")
    protected String parttimeperc;
    @XmlElement(name = "PENSION_DATE")
    protected String pensiondate;
    @XmlElement(name = "PENSION_SALARY")
    protected String pensionsalary;
    @XmlElement(name = "FRANCH_AMOUNT")
    protected String franchamount;
    @XmlElement(name = "BUILDUP_PERC")
    protected String buildupperc;
    @XmlElement(name = "YEAR_BUILDOP")
    protected String yearbuildop;
    @XmlElement(name = "NP_PERC")
    protected String npperc;
    @XmlElement(name = "YEAR_BUILDNP")
    protected String yearbuildnp;
    @XmlElement(name = "CONTIN_PERC")
    protected String continperc;
    @XmlElement(name = "PROVISION_PERC")
    protected String provisionperc;
    @XmlElement(name = "GROSS_FVPAMOUNT")
    protected String grossfvpamount;
    @XmlElement(name = "DEDUCTION_AMOUNT")
    protected String deductionamount;
    @XmlElement(name = "DEDUCTION_PERC")
    protected String deductionperc;
    @XmlElement(name = "NET_FVPAMOUNT")
    protected String netfvpamount;
    @XmlElement(name = "VALUE_DATE")
    protected String valuedate;
    @XmlElement(name = "PAY_DATE")
    protected String paydate;
    @XmlElement(name = "COMPENS_PERC")
    protected String compensperc;
    @XmlElement(name = "COMPENS_AMOUNT")
    protected String compensamount;
    @XmlElement(name = "PAYMENT_DUE")
    protected String paymentdue;
    @XmlElement(name = "FVP_CLAIMOP")
    protected String fvpclaimop;
    @XmlElement(name = "FVP_CLAIMNP")
    protected String fvpclaimnp;
    @XmlElement(name = "BEGDA_BENEFIT")
    protected String begdabenefit;
    @XmlElement(name = "ENDDA_BENEFIT")
    protected String enddabenefit;
    @XmlElement(name = "SEND_CURR")
    protected String sendcurr;
    @XmlElement(name = "RCV_CURR")
    protected String rcvcurr;
    @XmlElement(name = "STATUS_OLD")
    protected String statusold;
    @XmlElement(name = "STATUS_ACT")
    protected String statusact;
    @XmlElement(name = "WAITPER_PERC")
    protected String waitperperc;
    @XmlElement(name = "PARTTIME_PERC2")
    protected String parttimeperc2;
    @XmlElement(name = "BUILDUP_PERC2")
    protected String buildupperc2;
    @XmlElement(name = "NP_PERC2")
    protected String npperc2;
    @XmlElement(name = "CONTIN_PERC2")
    protected String continperc2;
    @XmlElement(name = "PROVISION_PERC2")
    protected String provisionperc2;
    @XmlElement(name = "DEDUCTION_PERC2")
    protected String deductionperc2;
    @XmlElement(name = "COMPENS_PERC2")
    protected String compensperc2;
    @XmlElement(name = "WAITPER_PERC2")
    protected String waitperperc2;
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
     * Gets the value of the casenumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCASENUMBER() {
        return casenumber;
    }

    /**
     * Sets the value of the casenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCASENUMBER(String value) {
        this.casenumber = value;
    }

    /**
     * Gets the value of the regnrfvp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGNRFVP() {
        return regnrfvp;
    }

    /**
     * Sets the value of the regnrfvp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGNRFVP(String value) {
        this.regnrfvp = value;
    }

    /**
     * Gets the value of the senddate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENDDATE() {
        return senddate;
    }

    /**
     * Sets the value of the senddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENDDATE(String value) {
        this.senddate = value;
    }

    /**
     * Gets the value of the parttimeperc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARTTIMEPERC() {
        return parttimeperc;
    }

    /**
     * Sets the value of the parttimeperc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARTTIMEPERC(String value) {
        this.parttimeperc = value;
    }

    /**
     * Gets the value of the pensiondate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPENSIONDATE() {
        return pensiondate;
    }

    /**
     * Sets the value of the pensiondate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPENSIONDATE(String value) {
        this.pensiondate = value;
    }

    /**
     * Gets the value of the pensionsalary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPENSIONSALARY() {
        return pensionsalary;
    }

    /**
     * Sets the value of the pensionsalary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPENSIONSALARY(String value) {
        this.pensionsalary = value;
    }

    /**
     * Gets the value of the franchamount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFRANCHAMOUNT() {
        return franchamount;
    }

    /**
     * Sets the value of the franchamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFRANCHAMOUNT(String value) {
        this.franchamount = value;
    }

    /**
     * Gets the value of the buildupperc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUILDUPPERC() {
        return buildupperc;
    }

    /**
     * Sets the value of the buildupperc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUILDUPPERC(String value) {
        this.buildupperc = value;
    }

    /**
     * Gets the value of the yearbuildop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYEARBUILDOP() {
        return yearbuildop;
    }

    /**
     * Sets the value of the yearbuildop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYEARBUILDOP(String value) {
        this.yearbuildop = value;
    }

    /**
     * Gets the value of the npperc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPPERC() {
        return npperc;
    }

    /**
     * Sets the value of the npperc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPPERC(String value) {
        this.npperc = value;
    }

    /**
     * Gets the value of the yearbuildnp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYEARBUILDNP() {
        return yearbuildnp;
    }

    /**
     * Sets the value of the yearbuildnp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYEARBUILDNP(String value) {
        this.yearbuildnp = value;
    }

    /**
     * Gets the value of the continperc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTINPERC() {
        return continperc;
    }

    /**
     * Sets the value of the continperc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTINPERC(String value) {
        this.continperc = value;
    }

    /**
     * Gets the value of the provisionperc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROVISIONPERC() {
        return provisionperc;
    }

    /**
     * Sets the value of the provisionperc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROVISIONPERC(String value) {
        this.provisionperc = value;
    }

    /**
     * Gets the value of the grossfvpamount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGROSSFVPAMOUNT() {
        return grossfvpamount;
    }

    /**
     * Sets the value of the grossfvpamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGROSSFVPAMOUNT(String value) {
        this.grossfvpamount = value;
    }

    /**
     * Gets the value of the deductionamount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEDUCTIONAMOUNT() {
        return deductionamount;
    }

    /**
     * Sets the value of the deductionamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEDUCTIONAMOUNT(String value) {
        this.deductionamount = value;
    }

    /**
     * Gets the value of the deductionperc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEDUCTIONPERC() {
        return deductionperc;
    }

    /**
     * Sets the value of the deductionperc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEDUCTIONPERC(String value) {
        this.deductionperc = value;
    }

    /**
     * Gets the value of the netfvpamount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNETFVPAMOUNT() {
        return netfvpamount;
    }

    /**
     * Sets the value of the netfvpamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNETFVPAMOUNT(String value) {
        this.netfvpamount = value;
    }

    /**
     * Gets the value of the valuedate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALUEDATE() {
        return valuedate;
    }

    /**
     * Sets the value of the valuedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALUEDATE(String value) {
        this.valuedate = value;
    }

    /**
     * Gets the value of the paydate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYDATE() {
        return paydate;
    }

    /**
     * Sets the value of the paydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYDATE(String value) {
        this.paydate = value;
    }

    /**
     * Gets the value of the compensperc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPENSPERC() {
        return compensperc;
    }

    /**
     * Sets the value of the compensperc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPENSPERC(String value) {
        this.compensperc = value;
    }

    /**
     * Gets the value of the compensamount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPENSAMOUNT() {
        return compensamount;
    }

    /**
     * Sets the value of the compensamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPENSAMOUNT(String value) {
        this.compensamount = value;
    }

    /**
     * Gets the value of the paymentdue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYMENTDUE() {
        return paymentdue;
    }

    /**
     * Sets the value of the paymentdue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYMENTDUE(String value) {
        this.paymentdue = value;
    }

    /**
     * Gets the value of the fvpclaimop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFVPCLAIMOP() {
        return fvpclaimop;
    }

    /**
     * Sets the value of the fvpclaimop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFVPCLAIMOP(String value) {
        this.fvpclaimop = value;
    }

    /**
     * Gets the value of the fvpclaimnp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFVPCLAIMNP() {
        return fvpclaimnp;
    }

    /**
     * Sets the value of the fvpclaimnp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFVPCLAIMNP(String value) {
        this.fvpclaimnp = value;
    }

    /**
     * Gets the value of the begdabenefit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEGDABENEFIT() {
        return begdabenefit;
    }

    /**
     * Sets the value of the begdabenefit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBEGDABENEFIT(String value) {
        this.begdabenefit = value;
    }

    /**
     * Gets the value of the enddabenefit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENDDABENEFIT() {
        return enddabenefit;
    }

    /**
     * Sets the value of the enddabenefit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENDDABENEFIT(String value) {
        this.enddabenefit = value;
    }

    /**
     * Gets the value of the sendcurr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENDCURR() {
        return sendcurr;
    }

    /**
     * Sets the value of the sendcurr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENDCURR(String value) {
        this.sendcurr = value;
    }

    /**
     * Gets the value of the rcvcurr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCVCURR() {
        return rcvcurr;
    }

    /**
     * Sets the value of the rcvcurr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCVCURR(String value) {
        this.rcvcurr = value;
    }

    /**
     * Gets the value of the statusold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUSOLD() {
        return statusold;
    }

    /**
     * Sets the value of the statusold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUSOLD(String value) {
        this.statusold = value;
    }

    /**
     * Gets the value of the statusact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUSACT() {
        return statusact;
    }

    /**
     * Sets the value of the statusact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUSACT(String value) {
        this.statusact = value;
    }

    /**
     * Gets the value of the waitperperc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAITPERPERC() {
        return waitperperc;
    }

    /**
     * Sets the value of the waitperperc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAITPERPERC(String value) {
        this.waitperperc = value;
    }

    /**
     * Gets the value of the parttimeperc2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARTTIMEPERC2() {
        return parttimeperc2;
    }

    /**
     * Sets the value of the parttimeperc2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARTTIMEPERC2(String value) {
        this.parttimeperc2 = value;
    }

    /**
     * Gets the value of the buildupperc2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUILDUPPERC2() {
        return buildupperc2;
    }

    /**
     * Sets the value of the buildupperc2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUILDUPPERC2(String value) {
        this.buildupperc2 = value;
    }

    /**
     * Gets the value of the npperc2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPPERC2() {
        return npperc2;
    }

    /**
     * Sets the value of the npperc2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPPERC2(String value) {
        this.npperc2 = value;
    }

    /**
     * Gets the value of the continperc2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTINPERC2() {
        return continperc2;
    }

    /**
     * Sets the value of the continperc2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTINPERC2(String value) {
        this.continperc2 = value;
    }

    /**
     * Gets the value of the provisionperc2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROVISIONPERC2() {
        return provisionperc2;
    }

    /**
     * Sets the value of the provisionperc2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROVISIONPERC2(String value) {
        this.provisionperc2 = value;
    }

    /**
     * Gets the value of the deductionperc2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEDUCTIONPERC2() {
        return deductionperc2;
    }

    /**
     * Sets the value of the deductionperc2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEDUCTIONPERC2(String value) {
        this.deductionperc2 = value;
    }

    /**
     * Gets the value of the compensperc2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPENSPERC2() {
        return compensperc2;
    }

    /**
     * Sets the value of the compensperc2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPENSPERC2(String value) {
        this.compensperc2 = value;
    }

    /**
     * Gets the value of the waitperperc2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAITPERPERC2() {
        return waitperperc2;
    }

    /**
     * Sets the value of the waitperperc2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAITPERPERC2(String value) {
        this.waitperperc2 = value;
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
