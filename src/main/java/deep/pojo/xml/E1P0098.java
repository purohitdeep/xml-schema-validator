
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
 *         &lt;element name="AATTR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PARTI" minOccurs="0"&gt;
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
 *         &lt;element name="TOTAL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DOCSG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPTIO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MOT01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PAR01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAT01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CSG01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MOT02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PAR02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAT02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CSG02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MOT03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PAR03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAT03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CSG03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MOT04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PAR04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAT04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CSG04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MOT05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PAR05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAT05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CSG05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MOT06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PAR06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAT06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CSG06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MOT07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PAR07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAT07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CSG07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MOT08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PAR08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAT08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CSG08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MOT09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PAR09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAT09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CSG09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MOT10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PAR10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAT10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CSG10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MOT11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PAR11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAT11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CSG11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MOT12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PAR12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAT12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CSG12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRDS01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRDS02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRDS03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRDS04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRDS05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRDS06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRDS07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRDS08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRDS09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRDS10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRDS11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRDS12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INT01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INT02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INT03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INT04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INT05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INT06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INT07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INT08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INT09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INT10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INT11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INT12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DOCRDS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRE_DAYS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MOPAR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CUR01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CUR02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CUR03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CUR04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CUR05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CUR06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CUR07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CUR08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CUR09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CUR10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CUR11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CUR12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NPS01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NPS02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NPS03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NPS04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NPS05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NPS06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NPS07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NPS08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NPS09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NPS10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NPS11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NPS12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PLI01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PLI02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="E1Q0098" minOccurs="0"&gt;
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
 *                   &lt;element name="PLI03" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="11"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PLI04" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="11"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PLI05" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="11"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PLI06" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="11"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PLI07" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="11"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PLI08" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="11"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PLI09" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="11"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PLI10" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="11"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PLI11" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="11"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PLI12" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="11"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BSMOD" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="11"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="MUSER" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="12"/&gt;
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
 *                   &lt;element name="DOFOSO" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="11"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RSA01" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="11"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RSA02" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="11"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RSA03" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="11"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RSA04" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="11"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RSA05" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="11"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RSA06" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="11"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RSA07" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="11"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RSA08" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="11"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RSA09" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="11"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RSA10" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="11"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RSA11" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="11"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RSA12" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="11"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PERCO" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="11"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CCBAM" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="11"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="DADAM" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="11"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="DRFOS" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FOSON" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="11"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FOSOR" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="11"/&gt;
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
    "aattr",
    "parti",
    "waers",
    "total",
    "docsg",
    "optio",
    "mot01",
    "par01",
    "dat01",
    "csg01",
    "mot02",
    "par02",
    "dat02",
    "csg02",
    "mot03",
    "par03",
    "dat03",
    "csg03",
    "mot04",
    "par04",
    "dat04",
    "csg04",
    "mot05",
    "par05",
    "dat05",
    "csg05",
    "mot06",
    "par06",
    "dat06",
    "csg06",
    "mot07",
    "par07",
    "dat07",
    "csg07",
    "mot08",
    "par08",
    "dat08",
    "csg08",
    "mot09",
    "par09",
    "dat09",
    "csg09",
    "mot10",
    "par10",
    "dat10",
    "csg10",
    "mot11",
    "par11",
    "dat11",
    "csg11",
    "mot12",
    "par12",
    "dat12",
    "csg12",
    "crds01",
    "crds02",
    "crds03",
    "crds04",
    "crds05",
    "crds06",
    "crds07",
    "crds08",
    "crds09",
    "crds10",
    "crds11",
    "crds12",
    "int01",
    "int02",
    "int03",
    "int04",
    "int05",
    "int06",
    "int07",
    "int08",
    "int09",
    "int10",
    "int11",
    "int12",
    "docrds",
    "predays",
    "mopar",
    "cur01",
    "cur02",
    "cur03",
    "cur04",
    "cur05",
    "cur06",
    "cur07",
    "cur08",
    "cur09",
    "cur10",
    "cur11",
    "cur12",
    "nps01",
    "nps02",
    "nps03",
    "nps04",
    "nps05",
    "nps06",
    "nps07",
    "nps08",
    "nps09",
    "nps10",
    "nps11",
    "nps12",
    "pli01",
    "pli02",
    "e1Q0098"
})
public class E1P0098 {

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
    @XmlElement(name = "AATTR")
    protected String aattr;
    @XmlElement(name = "PARTI")
    protected String parti;
    @XmlElement(name = "WAERS")
    protected String waers;
    @XmlElement(name = "TOTAL")
    protected String total;
    @XmlElement(name = "DOCSG")
    protected String docsg;
    @XmlElement(name = "OPTIO")
    protected String optio;
    @XmlElement(name = "MOT01")
    protected String mot01;
    @XmlElement(name = "PAR01")
    protected String par01;
    @XmlElement(name = "DAT01")
    protected String dat01;
    @XmlElement(name = "CSG01")
    protected String csg01;
    @XmlElement(name = "MOT02")
    protected String mot02;
    @XmlElement(name = "PAR02")
    protected String par02;
    @XmlElement(name = "DAT02")
    protected String dat02;
    @XmlElement(name = "CSG02")
    protected String csg02;
    @XmlElement(name = "MOT03")
    protected String mot03;
    @XmlElement(name = "PAR03")
    protected String par03;
    @XmlElement(name = "DAT03")
    protected String dat03;
    @XmlElement(name = "CSG03")
    protected String csg03;
    @XmlElement(name = "MOT04")
    protected String mot04;
    @XmlElement(name = "PAR04")
    protected String par04;
    @XmlElement(name = "DAT04")
    protected String dat04;
    @XmlElement(name = "CSG04")
    protected String csg04;
    @XmlElement(name = "MOT05")
    protected String mot05;
    @XmlElement(name = "PAR05")
    protected String par05;
    @XmlElement(name = "DAT05")
    protected String dat05;
    @XmlElement(name = "CSG05")
    protected String csg05;
    @XmlElement(name = "MOT06")
    protected String mot06;
    @XmlElement(name = "PAR06")
    protected String par06;
    @XmlElement(name = "DAT06")
    protected String dat06;
    @XmlElement(name = "CSG06")
    protected String csg06;
    @XmlElement(name = "MOT07")
    protected String mot07;
    @XmlElement(name = "PAR07")
    protected String par07;
    @XmlElement(name = "DAT07")
    protected String dat07;
    @XmlElement(name = "CSG07")
    protected String csg07;
    @XmlElement(name = "MOT08")
    protected String mot08;
    @XmlElement(name = "PAR08")
    protected String par08;
    @XmlElement(name = "DAT08")
    protected String dat08;
    @XmlElement(name = "CSG08")
    protected String csg08;
    @XmlElement(name = "MOT09")
    protected String mot09;
    @XmlElement(name = "PAR09")
    protected String par09;
    @XmlElement(name = "DAT09")
    protected String dat09;
    @XmlElement(name = "CSG09")
    protected String csg09;
    @XmlElement(name = "MOT10")
    protected String mot10;
    @XmlElement(name = "PAR10")
    protected String par10;
    @XmlElement(name = "DAT10")
    protected String dat10;
    @XmlElement(name = "CSG10")
    protected String csg10;
    @XmlElement(name = "MOT11")
    protected String mot11;
    @XmlElement(name = "PAR11")
    protected String par11;
    @XmlElement(name = "DAT11")
    protected String dat11;
    @XmlElement(name = "CSG11")
    protected String csg11;
    @XmlElement(name = "MOT12")
    protected String mot12;
    @XmlElement(name = "PAR12")
    protected String par12;
    @XmlElement(name = "DAT12")
    protected String dat12;
    @XmlElement(name = "CSG12")
    protected String csg12;
    @XmlElement(name = "CRDS01")
    protected String crds01;
    @XmlElement(name = "CRDS02")
    protected String crds02;
    @XmlElement(name = "CRDS03")
    protected String crds03;
    @XmlElement(name = "CRDS04")
    protected String crds04;
    @XmlElement(name = "CRDS05")
    protected String crds05;
    @XmlElement(name = "CRDS06")
    protected String crds06;
    @XmlElement(name = "CRDS07")
    protected String crds07;
    @XmlElement(name = "CRDS08")
    protected String crds08;
    @XmlElement(name = "CRDS09")
    protected String crds09;
    @XmlElement(name = "CRDS10")
    protected String crds10;
    @XmlElement(name = "CRDS11")
    protected String crds11;
    @XmlElement(name = "CRDS12")
    protected String crds12;
    @XmlElement(name = "INT01")
    protected String int01;
    @XmlElement(name = "INT02")
    protected String int02;
    @XmlElement(name = "INT03")
    protected String int03;
    @XmlElement(name = "INT04")
    protected String int04;
    @XmlElement(name = "INT05")
    protected String int05;
    @XmlElement(name = "INT06")
    protected String int06;
    @XmlElement(name = "INT07")
    protected String int07;
    @XmlElement(name = "INT08")
    protected String int08;
    @XmlElement(name = "INT09")
    protected String int09;
    @XmlElement(name = "INT10")
    protected String int10;
    @XmlElement(name = "INT11")
    protected String int11;
    @XmlElement(name = "INT12")
    protected String int12;
    @XmlElement(name = "DOCRDS")
    protected String docrds;
    @XmlElement(name = "PRE_DAYS")
    protected String predays;
    @XmlElement(name = "MOPAR")
    protected String mopar;
    @XmlElement(name = "CUR01")
    protected String cur01;
    @XmlElement(name = "CUR02")
    protected String cur02;
    @XmlElement(name = "CUR03")
    protected String cur03;
    @XmlElement(name = "CUR04")
    protected String cur04;
    @XmlElement(name = "CUR05")
    protected String cur05;
    @XmlElement(name = "CUR06")
    protected String cur06;
    @XmlElement(name = "CUR07")
    protected String cur07;
    @XmlElement(name = "CUR08")
    protected String cur08;
    @XmlElement(name = "CUR09")
    protected String cur09;
    @XmlElement(name = "CUR10")
    protected String cur10;
    @XmlElement(name = "CUR11")
    protected String cur11;
    @XmlElement(name = "CUR12")
    protected String cur12;
    @XmlElement(name = "NPS01")
    protected String nps01;
    @XmlElement(name = "NPS02")
    protected String nps02;
    @XmlElement(name = "NPS03")
    protected String nps03;
    @XmlElement(name = "NPS04")
    protected String nps04;
    @XmlElement(name = "NPS05")
    protected String nps05;
    @XmlElement(name = "NPS06")
    protected String nps06;
    @XmlElement(name = "NPS07")
    protected String nps07;
    @XmlElement(name = "NPS08")
    protected String nps08;
    @XmlElement(name = "NPS09")
    protected String nps09;
    @XmlElement(name = "NPS10")
    protected String nps10;
    @XmlElement(name = "NPS11")
    protected String nps11;
    @XmlElement(name = "NPS12")
    protected String nps12;
    @XmlElement(name = "PLI01")
    protected String pli01;
    @XmlElement(name = "PLI02")
    protected String pli02;
    @XmlElement(name = "E1Q0098")
    protected E1Q0098 e1Q0098;
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
     * Gets the value of the aattr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAATTR() {
        return aattr;
    }

    /**
     * Sets the value of the aattr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAATTR(String value) {
        this.aattr = value;
    }

    /**
     * Gets the value of the parti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARTI() {
        return parti;
    }

    /**
     * Sets the value of the parti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARTI(String value) {
        this.parti = value;
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
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTAL() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTAL(String value) {
        this.total = value;
    }

    /**
     * Gets the value of the docsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCSG() {
        return docsg;
    }

    /**
     * Sets the value of the docsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCSG(String value) {
        this.docsg = value;
    }

    /**
     * Gets the value of the optio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPTIO() {
        return optio;
    }

    /**
     * Sets the value of the optio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPTIO(String value) {
        this.optio = value;
    }

    /**
     * Gets the value of the mot01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOT01() {
        return mot01;
    }

    /**
     * Sets the value of the mot01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOT01(String value) {
        this.mot01 = value;
    }

    /**
     * Gets the value of the par01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAR01() {
        return par01;
    }

    /**
     * Sets the value of the par01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAR01(String value) {
        this.par01 = value;
    }

    /**
     * Gets the value of the dat01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAT01() {
        return dat01;
    }

    /**
     * Sets the value of the dat01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAT01(String value) {
        this.dat01 = value;
    }

    /**
     * Gets the value of the csg01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSG01() {
        return csg01;
    }

    /**
     * Sets the value of the csg01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSG01(String value) {
        this.csg01 = value;
    }

    /**
     * Gets the value of the mot02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOT02() {
        return mot02;
    }

    /**
     * Sets the value of the mot02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOT02(String value) {
        this.mot02 = value;
    }

    /**
     * Gets the value of the par02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAR02() {
        return par02;
    }

    /**
     * Sets the value of the par02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAR02(String value) {
        this.par02 = value;
    }

    /**
     * Gets the value of the dat02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAT02() {
        return dat02;
    }

    /**
     * Sets the value of the dat02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAT02(String value) {
        this.dat02 = value;
    }

    /**
     * Gets the value of the csg02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSG02() {
        return csg02;
    }

    /**
     * Sets the value of the csg02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSG02(String value) {
        this.csg02 = value;
    }

    /**
     * Gets the value of the mot03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOT03() {
        return mot03;
    }

    /**
     * Sets the value of the mot03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOT03(String value) {
        this.mot03 = value;
    }

    /**
     * Gets the value of the par03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAR03() {
        return par03;
    }

    /**
     * Sets the value of the par03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAR03(String value) {
        this.par03 = value;
    }

    /**
     * Gets the value of the dat03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAT03() {
        return dat03;
    }

    /**
     * Sets the value of the dat03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAT03(String value) {
        this.dat03 = value;
    }

    /**
     * Gets the value of the csg03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSG03() {
        return csg03;
    }

    /**
     * Sets the value of the csg03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSG03(String value) {
        this.csg03 = value;
    }

    /**
     * Gets the value of the mot04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOT04() {
        return mot04;
    }

    /**
     * Sets the value of the mot04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOT04(String value) {
        this.mot04 = value;
    }

    /**
     * Gets the value of the par04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAR04() {
        return par04;
    }

    /**
     * Sets the value of the par04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAR04(String value) {
        this.par04 = value;
    }

    /**
     * Gets the value of the dat04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAT04() {
        return dat04;
    }

    /**
     * Sets the value of the dat04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAT04(String value) {
        this.dat04 = value;
    }

    /**
     * Gets the value of the csg04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSG04() {
        return csg04;
    }

    /**
     * Sets the value of the csg04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSG04(String value) {
        this.csg04 = value;
    }

    /**
     * Gets the value of the mot05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOT05() {
        return mot05;
    }

    /**
     * Sets the value of the mot05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOT05(String value) {
        this.mot05 = value;
    }

    /**
     * Gets the value of the par05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAR05() {
        return par05;
    }

    /**
     * Sets the value of the par05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAR05(String value) {
        this.par05 = value;
    }

    /**
     * Gets the value of the dat05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAT05() {
        return dat05;
    }

    /**
     * Sets the value of the dat05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAT05(String value) {
        this.dat05 = value;
    }

    /**
     * Gets the value of the csg05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSG05() {
        return csg05;
    }

    /**
     * Sets the value of the csg05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSG05(String value) {
        this.csg05 = value;
    }

    /**
     * Gets the value of the mot06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOT06() {
        return mot06;
    }

    /**
     * Sets the value of the mot06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOT06(String value) {
        this.mot06 = value;
    }

    /**
     * Gets the value of the par06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAR06() {
        return par06;
    }

    /**
     * Sets the value of the par06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAR06(String value) {
        this.par06 = value;
    }

    /**
     * Gets the value of the dat06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAT06() {
        return dat06;
    }

    /**
     * Sets the value of the dat06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAT06(String value) {
        this.dat06 = value;
    }

    /**
     * Gets the value of the csg06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSG06() {
        return csg06;
    }

    /**
     * Sets the value of the csg06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSG06(String value) {
        this.csg06 = value;
    }

    /**
     * Gets the value of the mot07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOT07() {
        return mot07;
    }

    /**
     * Sets the value of the mot07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOT07(String value) {
        this.mot07 = value;
    }

    /**
     * Gets the value of the par07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAR07() {
        return par07;
    }

    /**
     * Sets the value of the par07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAR07(String value) {
        this.par07 = value;
    }

    /**
     * Gets the value of the dat07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAT07() {
        return dat07;
    }

    /**
     * Sets the value of the dat07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAT07(String value) {
        this.dat07 = value;
    }

    /**
     * Gets the value of the csg07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSG07() {
        return csg07;
    }

    /**
     * Sets the value of the csg07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSG07(String value) {
        this.csg07 = value;
    }

    /**
     * Gets the value of the mot08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOT08() {
        return mot08;
    }

    /**
     * Sets the value of the mot08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOT08(String value) {
        this.mot08 = value;
    }

    /**
     * Gets the value of the par08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAR08() {
        return par08;
    }

    /**
     * Sets the value of the par08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAR08(String value) {
        this.par08 = value;
    }

    /**
     * Gets the value of the dat08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAT08() {
        return dat08;
    }

    /**
     * Sets the value of the dat08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAT08(String value) {
        this.dat08 = value;
    }

    /**
     * Gets the value of the csg08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSG08() {
        return csg08;
    }

    /**
     * Sets the value of the csg08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSG08(String value) {
        this.csg08 = value;
    }

    /**
     * Gets the value of the mot09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOT09() {
        return mot09;
    }

    /**
     * Sets the value of the mot09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOT09(String value) {
        this.mot09 = value;
    }

    /**
     * Gets the value of the par09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAR09() {
        return par09;
    }

    /**
     * Sets the value of the par09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAR09(String value) {
        this.par09 = value;
    }

    /**
     * Gets the value of the dat09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAT09() {
        return dat09;
    }

    /**
     * Sets the value of the dat09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAT09(String value) {
        this.dat09 = value;
    }

    /**
     * Gets the value of the csg09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSG09() {
        return csg09;
    }

    /**
     * Sets the value of the csg09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSG09(String value) {
        this.csg09 = value;
    }

    /**
     * Gets the value of the mot10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOT10() {
        return mot10;
    }

    /**
     * Sets the value of the mot10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOT10(String value) {
        this.mot10 = value;
    }

    /**
     * Gets the value of the par10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAR10() {
        return par10;
    }

    /**
     * Sets the value of the par10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAR10(String value) {
        this.par10 = value;
    }

    /**
     * Gets the value of the dat10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAT10() {
        return dat10;
    }

    /**
     * Sets the value of the dat10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAT10(String value) {
        this.dat10 = value;
    }

    /**
     * Gets the value of the csg10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSG10() {
        return csg10;
    }

    /**
     * Sets the value of the csg10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSG10(String value) {
        this.csg10 = value;
    }

    /**
     * Gets the value of the mot11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOT11() {
        return mot11;
    }

    /**
     * Sets the value of the mot11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOT11(String value) {
        this.mot11 = value;
    }

    /**
     * Gets the value of the par11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAR11() {
        return par11;
    }

    /**
     * Sets the value of the par11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAR11(String value) {
        this.par11 = value;
    }

    /**
     * Gets the value of the dat11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAT11() {
        return dat11;
    }

    /**
     * Sets the value of the dat11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAT11(String value) {
        this.dat11 = value;
    }

    /**
     * Gets the value of the csg11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSG11() {
        return csg11;
    }

    /**
     * Sets the value of the csg11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSG11(String value) {
        this.csg11 = value;
    }

    /**
     * Gets the value of the mot12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOT12() {
        return mot12;
    }

    /**
     * Sets the value of the mot12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOT12(String value) {
        this.mot12 = value;
    }

    /**
     * Gets the value of the par12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAR12() {
        return par12;
    }

    /**
     * Sets the value of the par12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAR12(String value) {
        this.par12 = value;
    }

    /**
     * Gets the value of the dat12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAT12() {
        return dat12;
    }

    /**
     * Sets the value of the dat12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAT12(String value) {
        this.dat12 = value;
    }

    /**
     * Gets the value of the csg12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSG12() {
        return csg12;
    }

    /**
     * Sets the value of the csg12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSG12(String value) {
        this.csg12 = value;
    }

    /**
     * Gets the value of the crds01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRDS01() {
        return crds01;
    }

    /**
     * Sets the value of the crds01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRDS01(String value) {
        this.crds01 = value;
    }

    /**
     * Gets the value of the crds02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRDS02() {
        return crds02;
    }

    /**
     * Sets the value of the crds02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRDS02(String value) {
        this.crds02 = value;
    }

    /**
     * Gets the value of the crds03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRDS03() {
        return crds03;
    }

    /**
     * Sets the value of the crds03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRDS03(String value) {
        this.crds03 = value;
    }

    /**
     * Gets the value of the crds04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRDS04() {
        return crds04;
    }

    /**
     * Sets the value of the crds04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRDS04(String value) {
        this.crds04 = value;
    }

    /**
     * Gets the value of the crds05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRDS05() {
        return crds05;
    }

    /**
     * Sets the value of the crds05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRDS05(String value) {
        this.crds05 = value;
    }

    /**
     * Gets the value of the crds06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRDS06() {
        return crds06;
    }

    /**
     * Sets the value of the crds06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRDS06(String value) {
        this.crds06 = value;
    }

    /**
     * Gets the value of the crds07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRDS07() {
        return crds07;
    }

    /**
     * Sets the value of the crds07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRDS07(String value) {
        this.crds07 = value;
    }

    /**
     * Gets the value of the crds08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRDS08() {
        return crds08;
    }

    /**
     * Sets the value of the crds08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRDS08(String value) {
        this.crds08 = value;
    }

    /**
     * Gets the value of the crds09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRDS09() {
        return crds09;
    }

    /**
     * Sets the value of the crds09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRDS09(String value) {
        this.crds09 = value;
    }

    /**
     * Gets the value of the crds10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRDS10() {
        return crds10;
    }

    /**
     * Sets the value of the crds10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRDS10(String value) {
        this.crds10 = value;
    }

    /**
     * Gets the value of the crds11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRDS11() {
        return crds11;
    }

    /**
     * Sets the value of the crds11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRDS11(String value) {
        this.crds11 = value;
    }

    /**
     * Gets the value of the crds12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRDS12() {
        return crds12;
    }

    /**
     * Sets the value of the crds12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRDS12(String value) {
        this.crds12 = value;
    }

    /**
     * Gets the value of the int01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINT01() {
        return int01;
    }

    /**
     * Sets the value of the int01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINT01(String value) {
        this.int01 = value;
    }

    /**
     * Gets the value of the int02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINT02() {
        return int02;
    }

    /**
     * Sets the value of the int02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINT02(String value) {
        this.int02 = value;
    }

    /**
     * Gets the value of the int03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINT03() {
        return int03;
    }

    /**
     * Sets the value of the int03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINT03(String value) {
        this.int03 = value;
    }

    /**
     * Gets the value of the int04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINT04() {
        return int04;
    }

    /**
     * Sets the value of the int04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINT04(String value) {
        this.int04 = value;
    }

    /**
     * Gets the value of the int05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINT05() {
        return int05;
    }

    /**
     * Sets the value of the int05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINT05(String value) {
        this.int05 = value;
    }

    /**
     * Gets the value of the int06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINT06() {
        return int06;
    }

    /**
     * Sets the value of the int06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINT06(String value) {
        this.int06 = value;
    }

    /**
     * Gets the value of the int07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINT07() {
        return int07;
    }

    /**
     * Sets the value of the int07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINT07(String value) {
        this.int07 = value;
    }

    /**
     * Gets the value of the int08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINT08() {
        return int08;
    }

    /**
     * Sets the value of the int08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINT08(String value) {
        this.int08 = value;
    }

    /**
     * Gets the value of the int09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINT09() {
        return int09;
    }

    /**
     * Sets the value of the int09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINT09(String value) {
        this.int09 = value;
    }

    /**
     * Gets the value of the int10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINT10() {
        return int10;
    }

    /**
     * Sets the value of the int10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINT10(String value) {
        this.int10 = value;
    }

    /**
     * Gets the value of the int11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINT11() {
        return int11;
    }

    /**
     * Sets the value of the int11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINT11(String value) {
        this.int11 = value;
    }

    /**
     * Gets the value of the int12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINT12() {
        return int12;
    }

    /**
     * Sets the value of the int12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINT12(String value) {
        this.int12 = value;
    }

    /**
     * Gets the value of the docrds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCRDS() {
        return docrds;
    }

    /**
     * Sets the value of the docrds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCRDS(String value) {
        this.docrds = value;
    }

    /**
     * Gets the value of the predays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPREDAYS() {
        return predays;
    }

    /**
     * Sets the value of the predays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPREDAYS(String value) {
        this.predays = value;
    }

    /**
     * Gets the value of the mopar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOPAR() {
        return mopar;
    }

    /**
     * Sets the value of the mopar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOPAR(String value) {
        this.mopar = value;
    }

    /**
     * Gets the value of the cur01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUR01() {
        return cur01;
    }

    /**
     * Sets the value of the cur01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUR01(String value) {
        this.cur01 = value;
    }

    /**
     * Gets the value of the cur02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUR02() {
        return cur02;
    }

    /**
     * Sets the value of the cur02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUR02(String value) {
        this.cur02 = value;
    }

    /**
     * Gets the value of the cur03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUR03() {
        return cur03;
    }

    /**
     * Sets the value of the cur03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUR03(String value) {
        this.cur03 = value;
    }

    /**
     * Gets the value of the cur04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUR04() {
        return cur04;
    }

    /**
     * Sets the value of the cur04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUR04(String value) {
        this.cur04 = value;
    }

    /**
     * Gets the value of the cur05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUR05() {
        return cur05;
    }

    /**
     * Sets the value of the cur05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUR05(String value) {
        this.cur05 = value;
    }

    /**
     * Gets the value of the cur06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUR06() {
        return cur06;
    }

    /**
     * Sets the value of the cur06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUR06(String value) {
        this.cur06 = value;
    }

    /**
     * Gets the value of the cur07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUR07() {
        return cur07;
    }

    /**
     * Sets the value of the cur07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUR07(String value) {
        this.cur07 = value;
    }

    /**
     * Gets the value of the cur08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUR08() {
        return cur08;
    }

    /**
     * Sets the value of the cur08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUR08(String value) {
        this.cur08 = value;
    }

    /**
     * Gets the value of the cur09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUR09() {
        return cur09;
    }

    /**
     * Sets the value of the cur09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUR09(String value) {
        this.cur09 = value;
    }

    /**
     * Gets the value of the cur10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUR10() {
        return cur10;
    }

    /**
     * Sets the value of the cur10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUR10(String value) {
        this.cur10 = value;
    }

    /**
     * Gets the value of the cur11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUR11() {
        return cur11;
    }

    /**
     * Sets the value of the cur11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUR11(String value) {
        this.cur11 = value;
    }

    /**
     * Gets the value of the cur12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUR12() {
        return cur12;
    }

    /**
     * Sets the value of the cur12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUR12(String value) {
        this.cur12 = value;
    }

    /**
     * Gets the value of the nps01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPS01() {
        return nps01;
    }

    /**
     * Sets the value of the nps01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPS01(String value) {
        this.nps01 = value;
    }

    /**
     * Gets the value of the nps02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPS02() {
        return nps02;
    }

    /**
     * Sets the value of the nps02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPS02(String value) {
        this.nps02 = value;
    }

    /**
     * Gets the value of the nps03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPS03() {
        return nps03;
    }

    /**
     * Sets the value of the nps03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPS03(String value) {
        this.nps03 = value;
    }

    /**
     * Gets the value of the nps04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPS04() {
        return nps04;
    }

    /**
     * Sets the value of the nps04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPS04(String value) {
        this.nps04 = value;
    }

    /**
     * Gets the value of the nps05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPS05() {
        return nps05;
    }

    /**
     * Sets the value of the nps05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPS05(String value) {
        this.nps05 = value;
    }

    /**
     * Gets the value of the nps06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPS06() {
        return nps06;
    }

    /**
     * Sets the value of the nps06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPS06(String value) {
        this.nps06 = value;
    }

    /**
     * Gets the value of the nps07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPS07() {
        return nps07;
    }

    /**
     * Sets the value of the nps07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPS07(String value) {
        this.nps07 = value;
    }

    /**
     * Gets the value of the nps08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPS08() {
        return nps08;
    }

    /**
     * Sets the value of the nps08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPS08(String value) {
        this.nps08 = value;
    }

    /**
     * Gets the value of the nps09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPS09() {
        return nps09;
    }

    /**
     * Sets the value of the nps09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPS09(String value) {
        this.nps09 = value;
    }

    /**
     * Gets the value of the nps10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPS10() {
        return nps10;
    }

    /**
     * Sets the value of the nps10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPS10(String value) {
        this.nps10 = value;
    }

    /**
     * Gets the value of the nps11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPS11() {
        return nps11;
    }

    /**
     * Sets the value of the nps11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPS11(String value) {
        this.nps11 = value;
    }

    /**
     * Gets the value of the nps12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPS12() {
        return nps12;
    }

    /**
     * Sets the value of the nps12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPS12(String value) {
        this.nps12 = value;
    }

    /**
     * Gets the value of the pli01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLI01() {
        return pli01;
    }

    /**
     * Sets the value of the pli01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLI01(String value) {
        this.pli01 = value;
    }

    /**
     * Gets the value of the pli02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLI02() {
        return pli02;
    }

    /**
     * Sets the value of the pli02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLI02(String value) {
        this.pli02 = value;
    }

    /**
     * Gets the value of the e1Q0098 property.
     * 
     * @return
     *     possible object is
     *     {@link E1Q0098 }
     *     
     */
    public E1Q0098 getE1Q0098() {
        return e1Q0098;
    }

    /**
     * Sets the value of the e1Q0098 property.
     * 
     * @param value
     *     allowed object is
     *     {@link E1Q0098 }
     *     
     */
    public void setE1Q0098(E1Q0098 value) {
        this.e1Q0098 = value;
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
