
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
 *         &lt;element name="SCT03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SPR03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SNF03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SCC04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SCT04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SPR04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SNF04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SCC05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SCT05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SPR05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SNF05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SATOT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SPIID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SPINC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
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
 *         &lt;element name="CCN01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCN02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCN03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCN04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCN05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCN06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCN07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCN08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCN09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCN10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCN11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCN12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCN13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCN14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCN15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCC06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCC07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCC08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCC09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCC10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCC11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCC12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCC13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCC14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCC15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCT06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCT07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCT08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCT09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCT10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCT11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCT12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCT13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCT14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CCT15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CPR06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CPR07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CPR08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CPR09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CPR10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CPR11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CPR12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CPR13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CPR14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CPR15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CNF06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CNF07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CNF08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CNF09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CNF10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CNF11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CNF12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CNF13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CNF14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CNF15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PCN01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PCN02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PCN03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PCN04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PCN05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LCN01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LCN02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LCN03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LCN04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LCN05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LRM01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LRM02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LRM03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LRM04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LRM05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SCN01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SCN02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SCN03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SCN04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SCN05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SRM01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SRM02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SRM03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SRM04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SRM05" minOccurs="0"&gt;
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
 *         &lt;element name="CTP01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CTP02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CTP03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CTP04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CTP05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CTP06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CTP07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CTP08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CTP09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CTP10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CTP11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CTP12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CTP13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CTP14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CTP15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PTP01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PTP02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PTP03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PTP04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PTP05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NLTOT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NPTOT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NCC01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NCT01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NPR01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NCN01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NNF01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NCC02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NCT02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NPR02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NCN02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NNF02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NCC03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NCT03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NPR03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NCN03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NNF03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NCC04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NCT04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NPR04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NCN04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NCC05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NCT05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NPR05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
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
    "sct03",
    "spr03",
    "snf03",
    "scc04",
    "sct04",
    "spr04",
    "snf04",
    "scc05",
    "sct05",
    "spr05",
    "snf05",
    "satot",
    "spiid",
    "spinc",
    "waers",
    "ccn01",
    "ccn02",
    "ccn03",
    "ccn04",
    "ccn05",
    "ccn06",
    "ccn07",
    "ccn08",
    "ccn09",
    "ccn10",
    "ccn11",
    "ccn12",
    "ccn13",
    "ccn14",
    "ccn15",
    "ccc06",
    "ccc07",
    "ccc08",
    "ccc09",
    "ccc10",
    "ccc11",
    "ccc12",
    "ccc13",
    "ccc14",
    "ccc15",
    "cct06",
    "cct07",
    "cct08",
    "cct09",
    "cct10",
    "cct11",
    "cct12",
    "cct13",
    "cct14",
    "cct15",
    "cpr06",
    "cpr07",
    "cpr08",
    "cpr09",
    "cpr10",
    "cpr11",
    "cpr12",
    "cpr13",
    "cpr14",
    "cpr15",
    "cnf06",
    "cnf07",
    "cnf08",
    "cnf09",
    "cnf10",
    "cnf11",
    "cnf12",
    "cnf13",
    "cnf14",
    "cnf15",
    "pcn01",
    "pcn02",
    "pcn03",
    "pcn04",
    "pcn05",
    "lcn01",
    "lcn02",
    "lcn03",
    "lcn04",
    "lcn05",
    "lrm01",
    "lrm02",
    "lrm03",
    "lrm04",
    "lrm05",
    "scn01",
    "scn02",
    "scn03",
    "scn04",
    "scn05",
    "srm01",
    "srm02",
    "srm03",
    "srm04",
    "srm05",
    "grpvl",
    "ctp01",
    "ctp02",
    "ctp03",
    "ctp04",
    "ctp05",
    "ctp06",
    "ctp07",
    "ctp08",
    "ctp09",
    "ctp10",
    "ctp11",
    "ctp12",
    "ctp13",
    "ctp14",
    "ctp15",
    "ptp01",
    "ptp02",
    "ptp03",
    "ptp04",
    "ptp05",
    "nltot",
    "nptot",
    "ncc01",
    "nct01",
    "npr01",
    "ncn01",
    "nnf01",
    "ncc02",
    "nct02",
    "npr02",
    "ncn02",
    "nnf02",
    "ncc03",
    "nct03",
    "npr03",
    "ncn03",
    "nnf03",
    "ncc04",
    "nct04",
    "npr04",
    "ncn04",
    "ncc05",
    "nct05",
    "npr05"
})
public class E1Q0146 {

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
    @XmlElement(name = "SCT03")
    protected String sct03;
    @XmlElement(name = "SPR03")
    protected String spr03;
    @XmlElement(name = "SNF03")
    protected String snf03;
    @XmlElement(name = "SCC04")
    protected String scc04;
    @XmlElement(name = "SCT04")
    protected String sct04;
    @XmlElement(name = "SPR04")
    protected String spr04;
    @XmlElement(name = "SNF04")
    protected String snf04;
    @XmlElement(name = "SCC05")
    protected String scc05;
    @XmlElement(name = "SCT05")
    protected String sct05;
    @XmlElement(name = "SPR05")
    protected String spr05;
    @XmlElement(name = "SNF05")
    protected String snf05;
    @XmlElement(name = "SATOT")
    protected String satot;
    @XmlElement(name = "SPIID")
    protected String spiid;
    @XmlElement(name = "SPINC")
    protected String spinc;
    @XmlElement(name = "WAERS")
    protected String waers;
    @XmlElement(name = "CCN01")
    protected String ccn01;
    @XmlElement(name = "CCN02")
    protected String ccn02;
    @XmlElement(name = "CCN03")
    protected String ccn03;
    @XmlElement(name = "CCN04")
    protected String ccn04;
    @XmlElement(name = "CCN05")
    protected String ccn05;
    @XmlElement(name = "CCN06")
    protected String ccn06;
    @XmlElement(name = "CCN07")
    protected String ccn07;
    @XmlElement(name = "CCN08")
    protected String ccn08;
    @XmlElement(name = "CCN09")
    protected String ccn09;
    @XmlElement(name = "CCN10")
    protected String ccn10;
    @XmlElement(name = "CCN11")
    protected String ccn11;
    @XmlElement(name = "CCN12")
    protected String ccn12;
    @XmlElement(name = "CCN13")
    protected String ccn13;
    @XmlElement(name = "CCN14")
    protected String ccn14;
    @XmlElement(name = "CCN15")
    protected String ccn15;
    @XmlElement(name = "CCC06")
    protected String ccc06;
    @XmlElement(name = "CCC07")
    protected String ccc07;
    @XmlElement(name = "CCC08")
    protected String ccc08;
    @XmlElement(name = "CCC09")
    protected String ccc09;
    @XmlElement(name = "CCC10")
    protected String ccc10;
    @XmlElement(name = "CCC11")
    protected String ccc11;
    @XmlElement(name = "CCC12")
    protected String ccc12;
    @XmlElement(name = "CCC13")
    protected String ccc13;
    @XmlElement(name = "CCC14")
    protected String ccc14;
    @XmlElement(name = "CCC15")
    protected String ccc15;
    @XmlElement(name = "CCT06")
    protected String cct06;
    @XmlElement(name = "CCT07")
    protected String cct07;
    @XmlElement(name = "CCT08")
    protected String cct08;
    @XmlElement(name = "CCT09")
    protected String cct09;
    @XmlElement(name = "CCT10")
    protected String cct10;
    @XmlElement(name = "CCT11")
    protected String cct11;
    @XmlElement(name = "CCT12")
    protected String cct12;
    @XmlElement(name = "CCT13")
    protected String cct13;
    @XmlElement(name = "CCT14")
    protected String cct14;
    @XmlElement(name = "CCT15")
    protected String cct15;
    @XmlElement(name = "CPR06")
    protected String cpr06;
    @XmlElement(name = "CPR07")
    protected String cpr07;
    @XmlElement(name = "CPR08")
    protected String cpr08;
    @XmlElement(name = "CPR09")
    protected String cpr09;
    @XmlElement(name = "CPR10")
    protected String cpr10;
    @XmlElement(name = "CPR11")
    protected String cpr11;
    @XmlElement(name = "CPR12")
    protected String cpr12;
    @XmlElement(name = "CPR13")
    protected String cpr13;
    @XmlElement(name = "CPR14")
    protected String cpr14;
    @XmlElement(name = "CPR15")
    protected String cpr15;
    @XmlElement(name = "CNF06")
    protected String cnf06;
    @XmlElement(name = "CNF07")
    protected String cnf07;
    @XmlElement(name = "CNF08")
    protected String cnf08;
    @XmlElement(name = "CNF09")
    protected String cnf09;
    @XmlElement(name = "CNF10")
    protected String cnf10;
    @XmlElement(name = "CNF11")
    protected String cnf11;
    @XmlElement(name = "CNF12")
    protected String cnf12;
    @XmlElement(name = "CNF13")
    protected String cnf13;
    @XmlElement(name = "CNF14")
    protected String cnf14;
    @XmlElement(name = "CNF15")
    protected String cnf15;
    @XmlElement(name = "PCN01")
    protected String pcn01;
    @XmlElement(name = "PCN02")
    protected String pcn02;
    @XmlElement(name = "PCN03")
    protected String pcn03;
    @XmlElement(name = "PCN04")
    protected String pcn04;
    @XmlElement(name = "PCN05")
    protected String pcn05;
    @XmlElement(name = "LCN01")
    protected String lcn01;
    @XmlElement(name = "LCN02")
    protected String lcn02;
    @XmlElement(name = "LCN03")
    protected String lcn03;
    @XmlElement(name = "LCN04")
    protected String lcn04;
    @XmlElement(name = "LCN05")
    protected String lcn05;
    @XmlElement(name = "LRM01")
    protected String lrm01;
    @XmlElement(name = "LRM02")
    protected String lrm02;
    @XmlElement(name = "LRM03")
    protected String lrm03;
    @XmlElement(name = "LRM04")
    protected String lrm04;
    @XmlElement(name = "LRM05")
    protected String lrm05;
    @XmlElement(name = "SCN01")
    protected String scn01;
    @XmlElement(name = "SCN02")
    protected String scn02;
    @XmlElement(name = "SCN03")
    protected String scn03;
    @XmlElement(name = "SCN04")
    protected String scn04;
    @XmlElement(name = "SCN05")
    protected String scn05;
    @XmlElement(name = "SRM01")
    protected String srm01;
    @XmlElement(name = "SRM02")
    protected String srm02;
    @XmlElement(name = "SRM03")
    protected String srm03;
    @XmlElement(name = "SRM04")
    protected String srm04;
    @XmlElement(name = "SRM05")
    protected String srm05;
    @XmlElement(name = "GRPVL")
    protected String grpvl;
    @XmlElement(name = "CTP01")
    protected String ctp01;
    @XmlElement(name = "CTP02")
    protected String ctp02;
    @XmlElement(name = "CTP03")
    protected String ctp03;
    @XmlElement(name = "CTP04")
    protected String ctp04;
    @XmlElement(name = "CTP05")
    protected String ctp05;
    @XmlElement(name = "CTP06")
    protected String ctp06;
    @XmlElement(name = "CTP07")
    protected String ctp07;
    @XmlElement(name = "CTP08")
    protected String ctp08;
    @XmlElement(name = "CTP09")
    protected String ctp09;
    @XmlElement(name = "CTP10")
    protected String ctp10;
    @XmlElement(name = "CTP11")
    protected String ctp11;
    @XmlElement(name = "CTP12")
    protected String ctp12;
    @XmlElement(name = "CTP13")
    protected String ctp13;
    @XmlElement(name = "CTP14")
    protected String ctp14;
    @XmlElement(name = "CTP15")
    protected String ctp15;
    @XmlElement(name = "PTP01")
    protected String ptp01;
    @XmlElement(name = "PTP02")
    protected String ptp02;
    @XmlElement(name = "PTP03")
    protected String ptp03;
    @XmlElement(name = "PTP04")
    protected String ptp04;
    @XmlElement(name = "PTP05")
    protected String ptp05;
    @XmlElement(name = "NLTOT")
    protected String nltot;
    @XmlElement(name = "NPTOT")
    protected String nptot;
    @XmlElement(name = "NCC01")
    protected String ncc01;
    @XmlElement(name = "NCT01")
    protected String nct01;
    @XmlElement(name = "NPR01")
    protected String npr01;
    @XmlElement(name = "NCN01")
    protected String ncn01;
    @XmlElement(name = "NNF01")
    protected String nnf01;
    @XmlElement(name = "NCC02")
    protected String ncc02;
    @XmlElement(name = "NCT02")
    protected String nct02;
    @XmlElement(name = "NPR02")
    protected String npr02;
    @XmlElement(name = "NCN02")
    protected String ncn02;
    @XmlElement(name = "NNF02")
    protected String nnf02;
    @XmlElement(name = "NCC03")
    protected String ncc03;
    @XmlElement(name = "NCT03")
    protected String nct03;
    @XmlElement(name = "NPR03")
    protected String npr03;
    @XmlElement(name = "NCN03")
    protected String ncn03;
    @XmlElement(name = "NNF03")
    protected String nnf03;
    @XmlElement(name = "NCC04")
    protected String ncc04;
    @XmlElement(name = "NCT04")
    protected String nct04;
    @XmlElement(name = "NPR04")
    protected String npr04;
    @XmlElement(name = "NCN04")
    protected String ncn04;
    @XmlElement(name = "NCC05")
    protected String ncc05;
    @XmlElement(name = "NCT05")
    protected String nct05;
    @XmlElement(name = "NPR05")
    protected String npr05;
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
     * Gets the value of the sct03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCT03() {
        return sct03;
    }

    /**
     * Sets the value of the sct03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCT03(String value) {
        this.sct03 = value;
    }

    /**
     * Gets the value of the spr03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPR03() {
        return spr03;
    }

    /**
     * Sets the value of the spr03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPR03(String value) {
        this.spr03 = value;
    }

    /**
     * Gets the value of the snf03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNF03() {
        return snf03;
    }

    /**
     * Sets the value of the snf03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNF03(String value) {
        this.snf03 = value;
    }

    /**
     * Gets the value of the scc04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCC04() {
        return scc04;
    }

    /**
     * Sets the value of the scc04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCC04(String value) {
        this.scc04 = value;
    }

    /**
     * Gets the value of the sct04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCT04() {
        return sct04;
    }

    /**
     * Sets the value of the sct04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCT04(String value) {
        this.sct04 = value;
    }

    /**
     * Gets the value of the spr04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPR04() {
        return spr04;
    }

    /**
     * Sets the value of the spr04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPR04(String value) {
        this.spr04 = value;
    }

    /**
     * Gets the value of the snf04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNF04() {
        return snf04;
    }

    /**
     * Sets the value of the snf04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNF04(String value) {
        this.snf04 = value;
    }

    /**
     * Gets the value of the scc05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCC05() {
        return scc05;
    }

    /**
     * Sets the value of the scc05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCC05(String value) {
        this.scc05 = value;
    }

    /**
     * Gets the value of the sct05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCT05() {
        return sct05;
    }

    /**
     * Sets the value of the sct05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCT05(String value) {
        this.sct05 = value;
    }

    /**
     * Gets the value of the spr05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPR05() {
        return spr05;
    }

    /**
     * Sets the value of the spr05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPR05(String value) {
        this.spr05 = value;
    }

    /**
     * Gets the value of the snf05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNF05() {
        return snf05;
    }

    /**
     * Sets the value of the snf05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNF05(String value) {
        this.snf05 = value;
    }

    /**
     * Gets the value of the satot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSATOT() {
        return satot;
    }

    /**
     * Sets the value of the satot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSATOT(String value) {
        this.satot = value;
    }

    /**
     * Gets the value of the spiid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPIID() {
        return spiid;
    }

    /**
     * Sets the value of the spiid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPIID(String value) {
        this.spiid = value;
    }

    /**
     * Gets the value of the spinc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPINC() {
        return spinc;
    }

    /**
     * Sets the value of the spinc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPINC(String value) {
        this.spinc = value;
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
     * Gets the value of the ccn01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCN01() {
        return ccn01;
    }

    /**
     * Sets the value of the ccn01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCN01(String value) {
        this.ccn01 = value;
    }

    /**
     * Gets the value of the ccn02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCN02() {
        return ccn02;
    }

    /**
     * Sets the value of the ccn02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCN02(String value) {
        this.ccn02 = value;
    }

    /**
     * Gets the value of the ccn03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCN03() {
        return ccn03;
    }

    /**
     * Sets the value of the ccn03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCN03(String value) {
        this.ccn03 = value;
    }

    /**
     * Gets the value of the ccn04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCN04() {
        return ccn04;
    }

    /**
     * Sets the value of the ccn04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCN04(String value) {
        this.ccn04 = value;
    }

    /**
     * Gets the value of the ccn05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCN05() {
        return ccn05;
    }

    /**
     * Sets the value of the ccn05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCN05(String value) {
        this.ccn05 = value;
    }

    /**
     * Gets the value of the ccn06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCN06() {
        return ccn06;
    }

    /**
     * Sets the value of the ccn06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCN06(String value) {
        this.ccn06 = value;
    }

    /**
     * Gets the value of the ccn07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCN07() {
        return ccn07;
    }

    /**
     * Sets the value of the ccn07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCN07(String value) {
        this.ccn07 = value;
    }

    /**
     * Gets the value of the ccn08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCN08() {
        return ccn08;
    }

    /**
     * Sets the value of the ccn08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCN08(String value) {
        this.ccn08 = value;
    }

    /**
     * Gets the value of the ccn09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCN09() {
        return ccn09;
    }

    /**
     * Sets the value of the ccn09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCN09(String value) {
        this.ccn09 = value;
    }

    /**
     * Gets the value of the ccn10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCN10() {
        return ccn10;
    }

    /**
     * Sets the value of the ccn10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCN10(String value) {
        this.ccn10 = value;
    }

    /**
     * Gets the value of the ccn11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCN11() {
        return ccn11;
    }

    /**
     * Sets the value of the ccn11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCN11(String value) {
        this.ccn11 = value;
    }

    /**
     * Gets the value of the ccn12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCN12() {
        return ccn12;
    }

    /**
     * Sets the value of the ccn12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCN12(String value) {
        this.ccn12 = value;
    }

    /**
     * Gets the value of the ccn13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCN13() {
        return ccn13;
    }

    /**
     * Sets the value of the ccn13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCN13(String value) {
        this.ccn13 = value;
    }

    /**
     * Gets the value of the ccn14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCN14() {
        return ccn14;
    }

    /**
     * Sets the value of the ccn14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCN14(String value) {
        this.ccn14 = value;
    }

    /**
     * Gets the value of the ccn15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCN15() {
        return ccn15;
    }

    /**
     * Sets the value of the ccn15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCN15(String value) {
        this.ccn15 = value;
    }

    /**
     * Gets the value of the ccc06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCC06() {
        return ccc06;
    }

    /**
     * Sets the value of the ccc06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCC06(String value) {
        this.ccc06 = value;
    }

    /**
     * Gets the value of the ccc07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCC07() {
        return ccc07;
    }

    /**
     * Sets the value of the ccc07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCC07(String value) {
        this.ccc07 = value;
    }

    /**
     * Gets the value of the ccc08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCC08() {
        return ccc08;
    }

    /**
     * Sets the value of the ccc08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCC08(String value) {
        this.ccc08 = value;
    }

    /**
     * Gets the value of the ccc09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCC09() {
        return ccc09;
    }

    /**
     * Sets the value of the ccc09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCC09(String value) {
        this.ccc09 = value;
    }

    /**
     * Gets the value of the ccc10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCC10() {
        return ccc10;
    }

    /**
     * Sets the value of the ccc10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCC10(String value) {
        this.ccc10 = value;
    }

    /**
     * Gets the value of the ccc11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCC11() {
        return ccc11;
    }

    /**
     * Sets the value of the ccc11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCC11(String value) {
        this.ccc11 = value;
    }

    /**
     * Gets the value of the ccc12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCC12() {
        return ccc12;
    }

    /**
     * Sets the value of the ccc12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCC12(String value) {
        this.ccc12 = value;
    }

    /**
     * Gets the value of the ccc13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCC13() {
        return ccc13;
    }

    /**
     * Sets the value of the ccc13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCC13(String value) {
        this.ccc13 = value;
    }

    /**
     * Gets the value of the ccc14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCC14() {
        return ccc14;
    }

    /**
     * Sets the value of the ccc14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCC14(String value) {
        this.ccc14 = value;
    }

    /**
     * Gets the value of the ccc15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCC15() {
        return ccc15;
    }

    /**
     * Sets the value of the ccc15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCC15(String value) {
        this.ccc15 = value;
    }

    /**
     * Gets the value of the cct06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCT06() {
        return cct06;
    }

    /**
     * Sets the value of the cct06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCT06(String value) {
        this.cct06 = value;
    }

    /**
     * Gets the value of the cct07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCT07() {
        return cct07;
    }

    /**
     * Sets the value of the cct07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCT07(String value) {
        this.cct07 = value;
    }

    /**
     * Gets the value of the cct08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCT08() {
        return cct08;
    }

    /**
     * Sets the value of the cct08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCT08(String value) {
        this.cct08 = value;
    }

    /**
     * Gets the value of the cct09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCT09() {
        return cct09;
    }

    /**
     * Sets the value of the cct09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCT09(String value) {
        this.cct09 = value;
    }

    /**
     * Gets the value of the cct10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCT10() {
        return cct10;
    }

    /**
     * Sets the value of the cct10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCT10(String value) {
        this.cct10 = value;
    }

    /**
     * Gets the value of the cct11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCT11() {
        return cct11;
    }

    /**
     * Sets the value of the cct11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCT11(String value) {
        this.cct11 = value;
    }

    /**
     * Gets the value of the cct12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCT12() {
        return cct12;
    }

    /**
     * Sets the value of the cct12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCT12(String value) {
        this.cct12 = value;
    }

    /**
     * Gets the value of the cct13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCT13() {
        return cct13;
    }

    /**
     * Sets the value of the cct13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCT13(String value) {
        this.cct13 = value;
    }

    /**
     * Gets the value of the cct14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCT14() {
        return cct14;
    }

    /**
     * Sets the value of the cct14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCT14(String value) {
        this.cct14 = value;
    }

    /**
     * Gets the value of the cct15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCT15() {
        return cct15;
    }

    /**
     * Sets the value of the cct15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCT15(String value) {
        this.cct15 = value;
    }

    /**
     * Gets the value of the cpr06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPR06() {
        return cpr06;
    }

    /**
     * Sets the value of the cpr06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPR06(String value) {
        this.cpr06 = value;
    }

    /**
     * Gets the value of the cpr07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPR07() {
        return cpr07;
    }

    /**
     * Sets the value of the cpr07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPR07(String value) {
        this.cpr07 = value;
    }

    /**
     * Gets the value of the cpr08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPR08() {
        return cpr08;
    }

    /**
     * Sets the value of the cpr08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPR08(String value) {
        this.cpr08 = value;
    }

    /**
     * Gets the value of the cpr09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPR09() {
        return cpr09;
    }

    /**
     * Sets the value of the cpr09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPR09(String value) {
        this.cpr09 = value;
    }

    /**
     * Gets the value of the cpr10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPR10() {
        return cpr10;
    }

    /**
     * Sets the value of the cpr10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPR10(String value) {
        this.cpr10 = value;
    }

    /**
     * Gets the value of the cpr11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPR11() {
        return cpr11;
    }

    /**
     * Sets the value of the cpr11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPR11(String value) {
        this.cpr11 = value;
    }

    /**
     * Gets the value of the cpr12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPR12() {
        return cpr12;
    }

    /**
     * Sets the value of the cpr12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPR12(String value) {
        this.cpr12 = value;
    }

    /**
     * Gets the value of the cpr13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPR13() {
        return cpr13;
    }

    /**
     * Sets the value of the cpr13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPR13(String value) {
        this.cpr13 = value;
    }

    /**
     * Gets the value of the cpr14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPR14() {
        return cpr14;
    }

    /**
     * Sets the value of the cpr14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPR14(String value) {
        this.cpr14 = value;
    }

    /**
     * Gets the value of the cpr15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPR15() {
        return cpr15;
    }

    /**
     * Sets the value of the cpr15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPR15(String value) {
        this.cpr15 = value;
    }

    /**
     * Gets the value of the cnf06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNF06() {
        return cnf06;
    }

    /**
     * Sets the value of the cnf06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNF06(String value) {
        this.cnf06 = value;
    }

    /**
     * Gets the value of the cnf07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNF07() {
        return cnf07;
    }

    /**
     * Sets the value of the cnf07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNF07(String value) {
        this.cnf07 = value;
    }

    /**
     * Gets the value of the cnf08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNF08() {
        return cnf08;
    }

    /**
     * Sets the value of the cnf08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNF08(String value) {
        this.cnf08 = value;
    }

    /**
     * Gets the value of the cnf09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNF09() {
        return cnf09;
    }

    /**
     * Sets the value of the cnf09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNF09(String value) {
        this.cnf09 = value;
    }

    /**
     * Gets the value of the cnf10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNF10() {
        return cnf10;
    }

    /**
     * Sets the value of the cnf10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNF10(String value) {
        this.cnf10 = value;
    }

    /**
     * Gets the value of the cnf11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNF11() {
        return cnf11;
    }

    /**
     * Sets the value of the cnf11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNF11(String value) {
        this.cnf11 = value;
    }

    /**
     * Gets the value of the cnf12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNF12() {
        return cnf12;
    }

    /**
     * Sets the value of the cnf12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNF12(String value) {
        this.cnf12 = value;
    }

    /**
     * Gets the value of the cnf13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNF13() {
        return cnf13;
    }

    /**
     * Sets the value of the cnf13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNF13(String value) {
        this.cnf13 = value;
    }

    /**
     * Gets the value of the cnf14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNF14() {
        return cnf14;
    }

    /**
     * Sets the value of the cnf14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNF14(String value) {
        this.cnf14 = value;
    }

    /**
     * Gets the value of the cnf15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNF15() {
        return cnf15;
    }

    /**
     * Sets the value of the cnf15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNF15(String value) {
        this.cnf15 = value;
    }

    /**
     * Gets the value of the pcn01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCN01() {
        return pcn01;
    }

    /**
     * Sets the value of the pcn01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCN01(String value) {
        this.pcn01 = value;
    }

    /**
     * Gets the value of the pcn02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCN02() {
        return pcn02;
    }

    /**
     * Sets the value of the pcn02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCN02(String value) {
        this.pcn02 = value;
    }

    /**
     * Gets the value of the pcn03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCN03() {
        return pcn03;
    }

    /**
     * Sets the value of the pcn03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCN03(String value) {
        this.pcn03 = value;
    }

    /**
     * Gets the value of the pcn04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCN04() {
        return pcn04;
    }

    /**
     * Sets the value of the pcn04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCN04(String value) {
        this.pcn04 = value;
    }

    /**
     * Gets the value of the pcn05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCN05() {
        return pcn05;
    }

    /**
     * Sets the value of the pcn05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCN05(String value) {
        this.pcn05 = value;
    }

    /**
     * Gets the value of the lcn01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLCN01() {
        return lcn01;
    }

    /**
     * Sets the value of the lcn01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLCN01(String value) {
        this.lcn01 = value;
    }

    /**
     * Gets the value of the lcn02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLCN02() {
        return lcn02;
    }

    /**
     * Sets the value of the lcn02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLCN02(String value) {
        this.lcn02 = value;
    }

    /**
     * Gets the value of the lcn03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLCN03() {
        return lcn03;
    }

    /**
     * Sets the value of the lcn03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLCN03(String value) {
        this.lcn03 = value;
    }

    /**
     * Gets the value of the lcn04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLCN04() {
        return lcn04;
    }

    /**
     * Sets the value of the lcn04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLCN04(String value) {
        this.lcn04 = value;
    }

    /**
     * Gets the value of the lcn05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLCN05() {
        return lcn05;
    }

    /**
     * Sets the value of the lcn05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLCN05(String value) {
        this.lcn05 = value;
    }

    /**
     * Gets the value of the lrm01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLRM01() {
        return lrm01;
    }

    /**
     * Sets the value of the lrm01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLRM01(String value) {
        this.lrm01 = value;
    }

    /**
     * Gets the value of the lrm02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLRM02() {
        return lrm02;
    }

    /**
     * Sets the value of the lrm02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLRM02(String value) {
        this.lrm02 = value;
    }

    /**
     * Gets the value of the lrm03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLRM03() {
        return lrm03;
    }

    /**
     * Sets the value of the lrm03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLRM03(String value) {
        this.lrm03 = value;
    }

    /**
     * Gets the value of the lrm04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLRM04() {
        return lrm04;
    }

    /**
     * Sets the value of the lrm04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLRM04(String value) {
        this.lrm04 = value;
    }

    /**
     * Gets the value of the lrm05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLRM05() {
        return lrm05;
    }

    /**
     * Sets the value of the lrm05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLRM05(String value) {
        this.lrm05 = value;
    }

    /**
     * Gets the value of the scn01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCN01() {
        return scn01;
    }

    /**
     * Sets the value of the scn01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCN01(String value) {
        this.scn01 = value;
    }

    /**
     * Gets the value of the scn02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCN02() {
        return scn02;
    }

    /**
     * Sets the value of the scn02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCN02(String value) {
        this.scn02 = value;
    }

    /**
     * Gets the value of the scn03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCN03() {
        return scn03;
    }

    /**
     * Sets the value of the scn03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCN03(String value) {
        this.scn03 = value;
    }

    /**
     * Gets the value of the scn04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCN04() {
        return scn04;
    }

    /**
     * Sets the value of the scn04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCN04(String value) {
        this.scn04 = value;
    }

    /**
     * Gets the value of the scn05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCN05() {
        return scn05;
    }

    /**
     * Sets the value of the scn05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCN05(String value) {
        this.scn05 = value;
    }

    /**
     * Gets the value of the srm01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRM01() {
        return srm01;
    }

    /**
     * Sets the value of the srm01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRM01(String value) {
        this.srm01 = value;
    }

    /**
     * Gets the value of the srm02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRM02() {
        return srm02;
    }

    /**
     * Sets the value of the srm02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRM02(String value) {
        this.srm02 = value;
    }

    /**
     * Gets the value of the srm03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRM03() {
        return srm03;
    }

    /**
     * Sets the value of the srm03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRM03(String value) {
        this.srm03 = value;
    }

    /**
     * Gets the value of the srm04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRM04() {
        return srm04;
    }

    /**
     * Sets the value of the srm04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRM04(String value) {
        this.srm04 = value;
    }

    /**
     * Gets the value of the srm05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRM05() {
        return srm05;
    }

    /**
     * Sets the value of the srm05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRM05(String value) {
        this.srm05 = value;
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
     * Gets the value of the ctp01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTP01() {
        return ctp01;
    }

    /**
     * Sets the value of the ctp01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTP01(String value) {
        this.ctp01 = value;
    }

    /**
     * Gets the value of the ctp02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTP02() {
        return ctp02;
    }

    /**
     * Sets the value of the ctp02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTP02(String value) {
        this.ctp02 = value;
    }

    /**
     * Gets the value of the ctp03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTP03() {
        return ctp03;
    }

    /**
     * Sets the value of the ctp03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTP03(String value) {
        this.ctp03 = value;
    }

    /**
     * Gets the value of the ctp04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTP04() {
        return ctp04;
    }

    /**
     * Sets the value of the ctp04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTP04(String value) {
        this.ctp04 = value;
    }

    /**
     * Gets the value of the ctp05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTP05() {
        return ctp05;
    }

    /**
     * Sets the value of the ctp05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTP05(String value) {
        this.ctp05 = value;
    }

    /**
     * Gets the value of the ctp06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTP06() {
        return ctp06;
    }

    /**
     * Sets the value of the ctp06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTP06(String value) {
        this.ctp06 = value;
    }

    /**
     * Gets the value of the ctp07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTP07() {
        return ctp07;
    }

    /**
     * Sets the value of the ctp07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTP07(String value) {
        this.ctp07 = value;
    }

    /**
     * Gets the value of the ctp08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTP08() {
        return ctp08;
    }

    /**
     * Sets the value of the ctp08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTP08(String value) {
        this.ctp08 = value;
    }

    /**
     * Gets the value of the ctp09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTP09() {
        return ctp09;
    }

    /**
     * Sets the value of the ctp09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTP09(String value) {
        this.ctp09 = value;
    }

    /**
     * Gets the value of the ctp10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTP10() {
        return ctp10;
    }

    /**
     * Sets the value of the ctp10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTP10(String value) {
        this.ctp10 = value;
    }

    /**
     * Gets the value of the ctp11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTP11() {
        return ctp11;
    }

    /**
     * Sets the value of the ctp11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTP11(String value) {
        this.ctp11 = value;
    }

    /**
     * Gets the value of the ctp12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTP12() {
        return ctp12;
    }

    /**
     * Sets the value of the ctp12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTP12(String value) {
        this.ctp12 = value;
    }

    /**
     * Gets the value of the ctp13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTP13() {
        return ctp13;
    }

    /**
     * Sets the value of the ctp13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTP13(String value) {
        this.ctp13 = value;
    }

    /**
     * Gets the value of the ctp14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTP14() {
        return ctp14;
    }

    /**
     * Sets the value of the ctp14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTP14(String value) {
        this.ctp14 = value;
    }

    /**
     * Gets the value of the ctp15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTP15() {
        return ctp15;
    }

    /**
     * Sets the value of the ctp15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTP15(String value) {
        this.ctp15 = value;
    }

    /**
     * Gets the value of the ptp01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTP01() {
        return ptp01;
    }

    /**
     * Sets the value of the ptp01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTP01(String value) {
        this.ptp01 = value;
    }

    /**
     * Gets the value of the ptp02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTP02() {
        return ptp02;
    }

    /**
     * Sets the value of the ptp02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTP02(String value) {
        this.ptp02 = value;
    }

    /**
     * Gets the value of the ptp03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTP03() {
        return ptp03;
    }

    /**
     * Sets the value of the ptp03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTP03(String value) {
        this.ptp03 = value;
    }

    /**
     * Gets the value of the ptp04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTP04() {
        return ptp04;
    }

    /**
     * Sets the value of the ptp04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTP04(String value) {
        this.ptp04 = value;
    }

    /**
     * Gets the value of the ptp05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTP05() {
        return ptp05;
    }

    /**
     * Sets the value of the ptp05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTP05(String value) {
        this.ptp05 = value;
    }

    /**
     * Gets the value of the nltot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNLTOT() {
        return nltot;
    }

    /**
     * Sets the value of the nltot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNLTOT(String value) {
        this.nltot = value;
    }

    /**
     * Gets the value of the nptot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPTOT() {
        return nptot;
    }

    /**
     * Sets the value of the nptot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPTOT(String value) {
        this.nptot = value;
    }

    /**
     * Gets the value of the ncc01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCC01() {
        return ncc01;
    }

    /**
     * Sets the value of the ncc01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCC01(String value) {
        this.ncc01 = value;
    }

    /**
     * Gets the value of the nct01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCT01() {
        return nct01;
    }

    /**
     * Sets the value of the nct01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCT01(String value) {
        this.nct01 = value;
    }

    /**
     * Gets the value of the npr01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPR01() {
        return npr01;
    }

    /**
     * Sets the value of the npr01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPR01(String value) {
        this.npr01 = value;
    }

    /**
     * Gets the value of the ncn01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCN01() {
        return ncn01;
    }

    /**
     * Sets the value of the ncn01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCN01(String value) {
        this.ncn01 = value;
    }

    /**
     * Gets the value of the nnf01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNNF01() {
        return nnf01;
    }

    /**
     * Sets the value of the nnf01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNNF01(String value) {
        this.nnf01 = value;
    }

    /**
     * Gets the value of the ncc02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCC02() {
        return ncc02;
    }

    /**
     * Sets the value of the ncc02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCC02(String value) {
        this.ncc02 = value;
    }

    /**
     * Gets the value of the nct02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCT02() {
        return nct02;
    }

    /**
     * Sets the value of the nct02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCT02(String value) {
        this.nct02 = value;
    }

    /**
     * Gets the value of the npr02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPR02() {
        return npr02;
    }

    /**
     * Sets the value of the npr02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPR02(String value) {
        this.npr02 = value;
    }

    /**
     * Gets the value of the ncn02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCN02() {
        return ncn02;
    }

    /**
     * Sets the value of the ncn02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCN02(String value) {
        this.ncn02 = value;
    }

    /**
     * Gets the value of the nnf02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNNF02() {
        return nnf02;
    }

    /**
     * Sets the value of the nnf02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNNF02(String value) {
        this.nnf02 = value;
    }

    /**
     * Gets the value of the ncc03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCC03() {
        return ncc03;
    }

    /**
     * Sets the value of the ncc03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCC03(String value) {
        this.ncc03 = value;
    }

    /**
     * Gets the value of the nct03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCT03() {
        return nct03;
    }

    /**
     * Sets the value of the nct03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCT03(String value) {
        this.nct03 = value;
    }

    /**
     * Gets the value of the npr03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPR03() {
        return npr03;
    }

    /**
     * Sets the value of the npr03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPR03(String value) {
        this.npr03 = value;
    }

    /**
     * Gets the value of the ncn03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCN03() {
        return ncn03;
    }

    /**
     * Sets the value of the ncn03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCN03(String value) {
        this.ncn03 = value;
    }

    /**
     * Gets the value of the nnf03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNNF03() {
        return nnf03;
    }

    /**
     * Sets the value of the nnf03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNNF03(String value) {
        this.nnf03 = value;
    }

    /**
     * Gets the value of the ncc04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCC04() {
        return ncc04;
    }

    /**
     * Sets the value of the ncc04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCC04(String value) {
        this.ncc04 = value;
    }

    /**
     * Gets the value of the nct04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCT04() {
        return nct04;
    }

    /**
     * Sets the value of the nct04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCT04(String value) {
        this.nct04 = value;
    }

    /**
     * Gets the value of the npr04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPR04() {
        return npr04;
    }

    /**
     * Sets the value of the npr04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPR04(String value) {
        this.npr04 = value;
    }

    /**
     * Gets the value of the ncn04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCN04() {
        return ncn04;
    }

    /**
     * Sets the value of the ncn04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCN04(String value) {
        this.ncn04 = value;
    }

    /**
     * Gets the value of the ncc05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCC05() {
        return ncc05;
    }

    /**
     * Sets the value of the ncc05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCC05(String value) {
        this.ncc05 = value;
    }

    /**
     * Gets the value of the nct05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCT05() {
        return nct05;
    }

    /**
     * Sets the value of the nct05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCT05(String value) {
        this.nct05 = value;
    }

    /**
     * Gets the value of the npr05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPR05() {
        return npr05;
    }

    /**
     * Sets the value of the npr05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPR05(String value) {
        this.npr05 = value;
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
