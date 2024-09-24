
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
 *         &lt;element name="FAMSA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OBJID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MACOD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DOC01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADT01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UVN01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UBS01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ULD01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DOC02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADT02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UVN02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UBS02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ULD02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DOC03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADT03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UVN03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UBS03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ULD03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DOC04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADT04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UVN04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UBS04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ULD04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DOC05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADT05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UVN05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UBS05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ULD05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DOC06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADT06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UVN06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UBS06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ULD06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DOC07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADT07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UVN07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UBS07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ULD07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DOC08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADT08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UVN08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UBS08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ULD08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DOC09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADT09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UVN09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UBS09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ULD09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DOC10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADT10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UVN10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UBS10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ULD10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DOC11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADT11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UVN11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UBS11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ULD11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DOC12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADT12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UVN12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UBS12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ULD12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DOC13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADT13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UVN13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UBS13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ULD13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DOC14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADT14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UVN14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UBS14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ULD14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DOC15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADT15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UVN15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UBS15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ULD15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DOC16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADT16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UVN16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UBS16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ULD16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DOC17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADT17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UVN17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UBS17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ULD17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DOC18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADT18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UVN18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UBS18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ULD18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DOC19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADT19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UVN19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UBS19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ULD19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DOC20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADT20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UVN20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UBS20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ULD20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRT01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DPL01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADR01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRT02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DPL02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADR02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRT03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DPL03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADR03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRT04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DPL04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADR04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRT05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DPL05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADR05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRT06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DPL06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADR06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRT07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DPL07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADR07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRT08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DPL08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADR08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRT09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DPL09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADR09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRT10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DPL10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADR10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRT11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DPL11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADR11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRT12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DPL12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADR12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRT13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DPL13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADR13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRT14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DPL14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADR14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRT15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DPL15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADR15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRT16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DPL16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADR16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRT17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DPL17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADR17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRT18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DPL18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADR18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRT19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DPL19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADR19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRT20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DPL20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADR20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
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
    "famsa",
    "objid",
    "macod",
    "doc01",
    "adt01",
    "uvn01",
    "ubs01",
    "uld01",
    "doc02",
    "adt02",
    "uvn02",
    "ubs02",
    "uld02",
    "doc03",
    "adt03",
    "uvn03",
    "ubs03",
    "uld03",
    "doc04",
    "adt04",
    "uvn04",
    "ubs04",
    "uld04",
    "doc05",
    "adt05",
    "uvn05",
    "ubs05",
    "uld05",
    "doc06",
    "adt06",
    "uvn06",
    "ubs06",
    "uld06",
    "doc07",
    "adt07",
    "uvn07",
    "ubs07",
    "uld07",
    "doc08",
    "adt08",
    "uvn08",
    "ubs08",
    "uld08",
    "doc09",
    "adt09",
    "uvn09",
    "ubs09",
    "uld09",
    "doc10",
    "adt10",
    "uvn10",
    "ubs10",
    "uld10",
    "doc11",
    "adt11",
    "uvn11",
    "ubs11",
    "uld11",
    "doc12",
    "adt12",
    "uvn12",
    "ubs12",
    "uld12",
    "doc13",
    "adt13",
    "uvn13",
    "ubs13",
    "uld13",
    "doc14",
    "adt14",
    "uvn14",
    "ubs14",
    "uld14",
    "doc15",
    "adt15",
    "uvn15",
    "ubs15",
    "uld15",
    "doc16",
    "adt16",
    "uvn16",
    "ubs16",
    "uld16",
    "doc17",
    "adt17",
    "uvn17",
    "ubs17",
    "uld17",
    "doc18",
    "adt18",
    "uvn18",
    "ubs18",
    "uld18",
    "doc19",
    "adt19",
    "uvn19",
    "ubs19",
    "uld19",
    "doc20",
    "adt20",
    "uvn20",
    "ubs20",
    "uld20",
    "prt01",
    "dpl01",
    "adr01",
    "prt02",
    "dpl02",
    "adr02",
    "prt03",
    "dpl03",
    "adr03",
    "prt04",
    "dpl04",
    "adr04",
    "prt05",
    "dpl05",
    "adr05",
    "prt06",
    "dpl06",
    "adr06",
    "prt07",
    "dpl07",
    "adr07",
    "prt08",
    "dpl08",
    "adr08",
    "prt09",
    "dpl09",
    "adr09",
    "prt10",
    "dpl10",
    "adr10",
    "prt11",
    "dpl11",
    "adr11",
    "prt12",
    "dpl12",
    "adr12",
    "prt13",
    "dpl13",
    "adr13",
    "prt14",
    "dpl14",
    "adr14",
    "prt15",
    "dpl15",
    "adr15",
    "prt16",
    "dpl16",
    "adr16",
    "prt17",
    "dpl17",
    "adr17",
    "prt18",
    "dpl18",
    "adr18",
    "prt19",
    "dpl19",
    "adr19",
    "prt20",
    "dpl20",
    "adr20",
    "grpvl"
})
public class E1P0056 {

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
    @XmlElement(name = "FAMSA")
    protected String famsa;
    @XmlElement(name = "OBJID")
    protected String objid;
    @XmlElement(name = "MACOD")
    protected String macod;
    @XmlElement(name = "DOC01")
    protected String doc01;
    @XmlElement(name = "ADT01")
    protected String adt01;
    @XmlElement(name = "UVN01")
    protected String uvn01;
    @XmlElement(name = "UBS01")
    protected String ubs01;
    @XmlElement(name = "ULD01")
    protected String uld01;
    @XmlElement(name = "DOC02")
    protected String doc02;
    @XmlElement(name = "ADT02")
    protected String adt02;
    @XmlElement(name = "UVN02")
    protected String uvn02;
    @XmlElement(name = "UBS02")
    protected String ubs02;
    @XmlElement(name = "ULD02")
    protected String uld02;
    @XmlElement(name = "DOC03")
    protected String doc03;
    @XmlElement(name = "ADT03")
    protected String adt03;
    @XmlElement(name = "UVN03")
    protected String uvn03;
    @XmlElement(name = "UBS03")
    protected String ubs03;
    @XmlElement(name = "ULD03")
    protected String uld03;
    @XmlElement(name = "DOC04")
    protected String doc04;
    @XmlElement(name = "ADT04")
    protected String adt04;
    @XmlElement(name = "UVN04")
    protected String uvn04;
    @XmlElement(name = "UBS04")
    protected String ubs04;
    @XmlElement(name = "ULD04")
    protected String uld04;
    @XmlElement(name = "DOC05")
    protected String doc05;
    @XmlElement(name = "ADT05")
    protected String adt05;
    @XmlElement(name = "UVN05")
    protected String uvn05;
    @XmlElement(name = "UBS05")
    protected String ubs05;
    @XmlElement(name = "ULD05")
    protected String uld05;
    @XmlElement(name = "DOC06")
    protected String doc06;
    @XmlElement(name = "ADT06")
    protected String adt06;
    @XmlElement(name = "UVN06")
    protected String uvn06;
    @XmlElement(name = "UBS06")
    protected String ubs06;
    @XmlElement(name = "ULD06")
    protected String uld06;
    @XmlElement(name = "DOC07")
    protected String doc07;
    @XmlElement(name = "ADT07")
    protected String adt07;
    @XmlElement(name = "UVN07")
    protected String uvn07;
    @XmlElement(name = "UBS07")
    protected String ubs07;
    @XmlElement(name = "ULD07")
    protected String uld07;
    @XmlElement(name = "DOC08")
    protected String doc08;
    @XmlElement(name = "ADT08")
    protected String adt08;
    @XmlElement(name = "UVN08")
    protected String uvn08;
    @XmlElement(name = "UBS08")
    protected String ubs08;
    @XmlElement(name = "ULD08")
    protected String uld08;
    @XmlElement(name = "DOC09")
    protected String doc09;
    @XmlElement(name = "ADT09")
    protected String adt09;
    @XmlElement(name = "UVN09")
    protected String uvn09;
    @XmlElement(name = "UBS09")
    protected String ubs09;
    @XmlElement(name = "ULD09")
    protected String uld09;
    @XmlElement(name = "DOC10")
    protected String doc10;
    @XmlElement(name = "ADT10")
    protected String adt10;
    @XmlElement(name = "UVN10")
    protected String uvn10;
    @XmlElement(name = "UBS10")
    protected String ubs10;
    @XmlElement(name = "ULD10")
    protected String uld10;
    @XmlElement(name = "DOC11")
    protected String doc11;
    @XmlElement(name = "ADT11")
    protected String adt11;
    @XmlElement(name = "UVN11")
    protected String uvn11;
    @XmlElement(name = "UBS11")
    protected String ubs11;
    @XmlElement(name = "ULD11")
    protected String uld11;
    @XmlElement(name = "DOC12")
    protected String doc12;
    @XmlElement(name = "ADT12")
    protected String adt12;
    @XmlElement(name = "UVN12")
    protected String uvn12;
    @XmlElement(name = "UBS12")
    protected String ubs12;
    @XmlElement(name = "ULD12")
    protected String uld12;
    @XmlElement(name = "DOC13")
    protected String doc13;
    @XmlElement(name = "ADT13")
    protected String adt13;
    @XmlElement(name = "UVN13")
    protected String uvn13;
    @XmlElement(name = "UBS13")
    protected String ubs13;
    @XmlElement(name = "ULD13")
    protected String uld13;
    @XmlElement(name = "DOC14")
    protected String doc14;
    @XmlElement(name = "ADT14")
    protected String adt14;
    @XmlElement(name = "UVN14")
    protected String uvn14;
    @XmlElement(name = "UBS14")
    protected String ubs14;
    @XmlElement(name = "ULD14")
    protected String uld14;
    @XmlElement(name = "DOC15")
    protected String doc15;
    @XmlElement(name = "ADT15")
    protected String adt15;
    @XmlElement(name = "UVN15")
    protected String uvn15;
    @XmlElement(name = "UBS15")
    protected String ubs15;
    @XmlElement(name = "ULD15")
    protected String uld15;
    @XmlElement(name = "DOC16")
    protected String doc16;
    @XmlElement(name = "ADT16")
    protected String adt16;
    @XmlElement(name = "UVN16")
    protected String uvn16;
    @XmlElement(name = "UBS16")
    protected String ubs16;
    @XmlElement(name = "ULD16")
    protected String uld16;
    @XmlElement(name = "DOC17")
    protected String doc17;
    @XmlElement(name = "ADT17")
    protected String adt17;
    @XmlElement(name = "UVN17")
    protected String uvn17;
    @XmlElement(name = "UBS17")
    protected String ubs17;
    @XmlElement(name = "ULD17")
    protected String uld17;
    @XmlElement(name = "DOC18")
    protected String doc18;
    @XmlElement(name = "ADT18")
    protected String adt18;
    @XmlElement(name = "UVN18")
    protected String uvn18;
    @XmlElement(name = "UBS18")
    protected String ubs18;
    @XmlElement(name = "ULD18")
    protected String uld18;
    @XmlElement(name = "DOC19")
    protected String doc19;
    @XmlElement(name = "ADT19")
    protected String adt19;
    @XmlElement(name = "UVN19")
    protected String uvn19;
    @XmlElement(name = "UBS19")
    protected String ubs19;
    @XmlElement(name = "ULD19")
    protected String uld19;
    @XmlElement(name = "DOC20")
    protected String doc20;
    @XmlElement(name = "ADT20")
    protected String adt20;
    @XmlElement(name = "UVN20")
    protected String uvn20;
    @XmlElement(name = "UBS20")
    protected String ubs20;
    @XmlElement(name = "ULD20")
    protected String uld20;
    @XmlElement(name = "PRT01")
    protected String prt01;
    @XmlElement(name = "DPL01")
    protected String dpl01;
    @XmlElement(name = "ADR01")
    protected String adr01;
    @XmlElement(name = "PRT02")
    protected String prt02;
    @XmlElement(name = "DPL02")
    protected String dpl02;
    @XmlElement(name = "ADR02")
    protected String adr02;
    @XmlElement(name = "PRT03")
    protected String prt03;
    @XmlElement(name = "DPL03")
    protected String dpl03;
    @XmlElement(name = "ADR03")
    protected String adr03;
    @XmlElement(name = "PRT04")
    protected String prt04;
    @XmlElement(name = "DPL04")
    protected String dpl04;
    @XmlElement(name = "ADR04")
    protected String adr04;
    @XmlElement(name = "PRT05")
    protected String prt05;
    @XmlElement(name = "DPL05")
    protected String dpl05;
    @XmlElement(name = "ADR05")
    protected String adr05;
    @XmlElement(name = "PRT06")
    protected String prt06;
    @XmlElement(name = "DPL06")
    protected String dpl06;
    @XmlElement(name = "ADR06")
    protected String adr06;
    @XmlElement(name = "PRT07")
    protected String prt07;
    @XmlElement(name = "DPL07")
    protected String dpl07;
    @XmlElement(name = "ADR07")
    protected String adr07;
    @XmlElement(name = "PRT08")
    protected String prt08;
    @XmlElement(name = "DPL08")
    protected String dpl08;
    @XmlElement(name = "ADR08")
    protected String adr08;
    @XmlElement(name = "PRT09")
    protected String prt09;
    @XmlElement(name = "DPL09")
    protected String dpl09;
    @XmlElement(name = "ADR09")
    protected String adr09;
    @XmlElement(name = "PRT10")
    protected String prt10;
    @XmlElement(name = "DPL10")
    protected String dpl10;
    @XmlElement(name = "ADR10")
    protected String adr10;
    @XmlElement(name = "PRT11")
    protected String prt11;
    @XmlElement(name = "DPL11")
    protected String dpl11;
    @XmlElement(name = "ADR11")
    protected String adr11;
    @XmlElement(name = "PRT12")
    protected String prt12;
    @XmlElement(name = "DPL12")
    protected String dpl12;
    @XmlElement(name = "ADR12")
    protected String adr12;
    @XmlElement(name = "PRT13")
    protected String prt13;
    @XmlElement(name = "DPL13")
    protected String dpl13;
    @XmlElement(name = "ADR13")
    protected String adr13;
    @XmlElement(name = "PRT14")
    protected String prt14;
    @XmlElement(name = "DPL14")
    protected String dpl14;
    @XmlElement(name = "ADR14")
    protected String adr14;
    @XmlElement(name = "PRT15")
    protected String prt15;
    @XmlElement(name = "DPL15")
    protected String dpl15;
    @XmlElement(name = "ADR15")
    protected String adr15;
    @XmlElement(name = "PRT16")
    protected String prt16;
    @XmlElement(name = "DPL16")
    protected String dpl16;
    @XmlElement(name = "ADR16")
    protected String adr16;
    @XmlElement(name = "PRT17")
    protected String prt17;
    @XmlElement(name = "DPL17")
    protected String dpl17;
    @XmlElement(name = "ADR17")
    protected String adr17;
    @XmlElement(name = "PRT18")
    protected String prt18;
    @XmlElement(name = "DPL18")
    protected String dpl18;
    @XmlElement(name = "ADR18")
    protected String adr18;
    @XmlElement(name = "PRT19")
    protected String prt19;
    @XmlElement(name = "DPL19")
    protected String dpl19;
    @XmlElement(name = "ADR19")
    protected String adr19;
    @XmlElement(name = "PRT20")
    protected String prt20;
    @XmlElement(name = "DPL20")
    protected String dpl20;
    @XmlElement(name = "ADR20")
    protected String adr20;
    @XmlElement(name = "GRPVL")
    protected String grpvl;
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
     * Gets the value of the famsa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAMSA() {
        return famsa;
    }

    /**
     * Sets the value of the famsa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAMSA(String value) {
        this.famsa = value;
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
     * Gets the value of the macod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMACOD() {
        return macod;
    }

    /**
     * Sets the value of the macod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMACOD(String value) {
        this.macod = value;
    }

    /**
     * Gets the value of the doc01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOC01() {
        return doc01;
    }

    /**
     * Sets the value of the doc01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOC01(String value) {
        this.doc01 = value;
    }

    /**
     * Gets the value of the adt01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADT01() {
        return adt01;
    }

    /**
     * Sets the value of the adt01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADT01(String value) {
        this.adt01 = value;
    }

    /**
     * Gets the value of the uvn01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUVN01() {
        return uvn01;
    }

    /**
     * Sets the value of the uvn01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUVN01(String value) {
        this.uvn01 = value;
    }

    /**
     * Gets the value of the ubs01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUBS01() {
        return ubs01;
    }

    /**
     * Sets the value of the ubs01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUBS01(String value) {
        this.ubs01 = value;
    }

    /**
     * Gets the value of the uld01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULD01() {
        return uld01;
    }

    /**
     * Sets the value of the uld01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULD01(String value) {
        this.uld01 = value;
    }

    /**
     * Gets the value of the doc02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOC02() {
        return doc02;
    }

    /**
     * Sets the value of the doc02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOC02(String value) {
        this.doc02 = value;
    }

    /**
     * Gets the value of the adt02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADT02() {
        return adt02;
    }

    /**
     * Sets the value of the adt02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADT02(String value) {
        this.adt02 = value;
    }

    /**
     * Gets the value of the uvn02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUVN02() {
        return uvn02;
    }

    /**
     * Sets the value of the uvn02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUVN02(String value) {
        this.uvn02 = value;
    }

    /**
     * Gets the value of the ubs02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUBS02() {
        return ubs02;
    }

    /**
     * Sets the value of the ubs02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUBS02(String value) {
        this.ubs02 = value;
    }

    /**
     * Gets the value of the uld02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULD02() {
        return uld02;
    }

    /**
     * Sets the value of the uld02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULD02(String value) {
        this.uld02 = value;
    }

    /**
     * Gets the value of the doc03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOC03() {
        return doc03;
    }

    /**
     * Sets the value of the doc03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOC03(String value) {
        this.doc03 = value;
    }

    /**
     * Gets the value of the adt03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADT03() {
        return adt03;
    }

    /**
     * Sets the value of the adt03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADT03(String value) {
        this.adt03 = value;
    }

    /**
     * Gets the value of the uvn03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUVN03() {
        return uvn03;
    }

    /**
     * Sets the value of the uvn03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUVN03(String value) {
        this.uvn03 = value;
    }

    /**
     * Gets the value of the ubs03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUBS03() {
        return ubs03;
    }

    /**
     * Sets the value of the ubs03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUBS03(String value) {
        this.ubs03 = value;
    }

    /**
     * Gets the value of the uld03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULD03() {
        return uld03;
    }

    /**
     * Sets the value of the uld03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULD03(String value) {
        this.uld03 = value;
    }

    /**
     * Gets the value of the doc04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOC04() {
        return doc04;
    }

    /**
     * Sets the value of the doc04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOC04(String value) {
        this.doc04 = value;
    }

    /**
     * Gets the value of the adt04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADT04() {
        return adt04;
    }

    /**
     * Sets the value of the adt04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADT04(String value) {
        this.adt04 = value;
    }

    /**
     * Gets the value of the uvn04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUVN04() {
        return uvn04;
    }

    /**
     * Sets the value of the uvn04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUVN04(String value) {
        this.uvn04 = value;
    }

    /**
     * Gets the value of the ubs04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUBS04() {
        return ubs04;
    }

    /**
     * Sets the value of the ubs04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUBS04(String value) {
        this.ubs04 = value;
    }

    /**
     * Gets the value of the uld04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULD04() {
        return uld04;
    }

    /**
     * Sets the value of the uld04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULD04(String value) {
        this.uld04 = value;
    }

    /**
     * Gets the value of the doc05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOC05() {
        return doc05;
    }

    /**
     * Sets the value of the doc05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOC05(String value) {
        this.doc05 = value;
    }

    /**
     * Gets the value of the adt05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADT05() {
        return adt05;
    }

    /**
     * Sets the value of the adt05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADT05(String value) {
        this.adt05 = value;
    }

    /**
     * Gets the value of the uvn05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUVN05() {
        return uvn05;
    }

    /**
     * Sets the value of the uvn05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUVN05(String value) {
        this.uvn05 = value;
    }

    /**
     * Gets the value of the ubs05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUBS05() {
        return ubs05;
    }

    /**
     * Sets the value of the ubs05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUBS05(String value) {
        this.ubs05 = value;
    }

    /**
     * Gets the value of the uld05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULD05() {
        return uld05;
    }

    /**
     * Sets the value of the uld05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULD05(String value) {
        this.uld05 = value;
    }

    /**
     * Gets the value of the doc06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOC06() {
        return doc06;
    }

    /**
     * Sets the value of the doc06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOC06(String value) {
        this.doc06 = value;
    }

    /**
     * Gets the value of the adt06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADT06() {
        return adt06;
    }

    /**
     * Sets the value of the adt06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADT06(String value) {
        this.adt06 = value;
    }

    /**
     * Gets the value of the uvn06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUVN06() {
        return uvn06;
    }

    /**
     * Sets the value of the uvn06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUVN06(String value) {
        this.uvn06 = value;
    }

    /**
     * Gets the value of the ubs06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUBS06() {
        return ubs06;
    }

    /**
     * Sets the value of the ubs06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUBS06(String value) {
        this.ubs06 = value;
    }

    /**
     * Gets the value of the uld06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULD06() {
        return uld06;
    }

    /**
     * Sets the value of the uld06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULD06(String value) {
        this.uld06 = value;
    }

    /**
     * Gets the value of the doc07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOC07() {
        return doc07;
    }

    /**
     * Sets the value of the doc07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOC07(String value) {
        this.doc07 = value;
    }

    /**
     * Gets the value of the adt07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADT07() {
        return adt07;
    }

    /**
     * Sets the value of the adt07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADT07(String value) {
        this.adt07 = value;
    }

    /**
     * Gets the value of the uvn07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUVN07() {
        return uvn07;
    }

    /**
     * Sets the value of the uvn07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUVN07(String value) {
        this.uvn07 = value;
    }

    /**
     * Gets the value of the ubs07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUBS07() {
        return ubs07;
    }

    /**
     * Sets the value of the ubs07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUBS07(String value) {
        this.ubs07 = value;
    }

    /**
     * Gets the value of the uld07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULD07() {
        return uld07;
    }

    /**
     * Sets the value of the uld07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULD07(String value) {
        this.uld07 = value;
    }

    /**
     * Gets the value of the doc08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOC08() {
        return doc08;
    }

    /**
     * Sets the value of the doc08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOC08(String value) {
        this.doc08 = value;
    }

    /**
     * Gets the value of the adt08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADT08() {
        return adt08;
    }

    /**
     * Sets the value of the adt08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADT08(String value) {
        this.adt08 = value;
    }

    /**
     * Gets the value of the uvn08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUVN08() {
        return uvn08;
    }

    /**
     * Sets the value of the uvn08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUVN08(String value) {
        this.uvn08 = value;
    }

    /**
     * Gets the value of the ubs08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUBS08() {
        return ubs08;
    }

    /**
     * Sets the value of the ubs08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUBS08(String value) {
        this.ubs08 = value;
    }

    /**
     * Gets the value of the uld08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULD08() {
        return uld08;
    }

    /**
     * Sets the value of the uld08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULD08(String value) {
        this.uld08 = value;
    }

    /**
     * Gets the value of the doc09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOC09() {
        return doc09;
    }

    /**
     * Sets the value of the doc09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOC09(String value) {
        this.doc09 = value;
    }

    /**
     * Gets the value of the adt09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADT09() {
        return adt09;
    }

    /**
     * Sets the value of the adt09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADT09(String value) {
        this.adt09 = value;
    }

    /**
     * Gets the value of the uvn09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUVN09() {
        return uvn09;
    }

    /**
     * Sets the value of the uvn09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUVN09(String value) {
        this.uvn09 = value;
    }

    /**
     * Gets the value of the ubs09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUBS09() {
        return ubs09;
    }

    /**
     * Sets the value of the ubs09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUBS09(String value) {
        this.ubs09 = value;
    }

    /**
     * Gets the value of the uld09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULD09() {
        return uld09;
    }

    /**
     * Sets the value of the uld09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULD09(String value) {
        this.uld09 = value;
    }

    /**
     * Gets the value of the doc10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOC10() {
        return doc10;
    }

    /**
     * Sets the value of the doc10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOC10(String value) {
        this.doc10 = value;
    }

    /**
     * Gets the value of the adt10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADT10() {
        return adt10;
    }

    /**
     * Sets the value of the adt10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADT10(String value) {
        this.adt10 = value;
    }

    /**
     * Gets the value of the uvn10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUVN10() {
        return uvn10;
    }

    /**
     * Sets the value of the uvn10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUVN10(String value) {
        this.uvn10 = value;
    }

    /**
     * Gets the value of the ubs10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUBS10() {
        return ubs10;
    }

    /**
     * Sets the value of the ubs10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUBS10(String value) {
        this.ubs10 = value;
    }

    /**
     * Gets the value of the uld10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULD10() {
        return uld10;
    }

    /**
     * Sets the value of the uld10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULD10(String value) {
        this.uld10 = value;
    }

    /**
     * Gets the value of the doc11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOC11() {
        return doc11;
    }

    /**
     * Sets the value of the doc11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOC11(String value) {
        this.doc11 = value;
    }

    /**
     * Gets the value of the adt11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADT11() {
        return adt11;
    }

    /**
     * Sets the value of the adt11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADT11(String value) {
        this.adt11 = value;
    }

    /**
     * Gets the value of the uvn11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUVN11() {
        return uvn11;
    }

    /**
     * Sets the value of the uvn11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUVN11(String value) {
        this.uvn11 = value;
    }

    /**
     * Gets the value of the ubs11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUBS11() {
        return ubs11;
    }

    /**
     * Sets the value of the ubs11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUBS11(String value) {
        this.ubs11 = value;
    }

    /**
     * Gets the value of the uld11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULD11() {
        return uld11;
    }

    /**
     * Sets the value of the uld11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULD11(String value) {
        this.uld11 = value;
    }

    /**
     * Gets the value of the doc12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOC12() {
        return doc12;
    }

    /**
     * Sets the value of the doc12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOC12(String value) {
        this.doc12 = value;
    }

    /**
     * Gets the value of the adt12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADT12() {
        return adt12;
    }

    /**
     * Sets the value of the adt12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADT12(String value) {
        this.adt12 = value;
    }

    /**
     * Gets the value of the uvn12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUVN12() {
        return uvn12;
    }

    /**
     * Sets the value of the uvn12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUVN12(String value) {
        this.uvn12 = value;
    }

    /**
     * Gets the value of the ubs12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUBS12() {
        return ubs12;
    }

    /**
     * Sets the value of the ubs12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUBS12(String value) {
        this.ubs12 = value;
    }

    /**
     * Gets the value of the uld12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULD12() {
        return uld12;
    }

    /**
     * Sets the value of the uld12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULD12(String value) {
        this.uld12 = value;
    }

    /**
     * Gets the value of the doc13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOC13() {
        return doc13;
    }

    /**
     * Sets the value of the doc13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOC13(String value) {
        this.doc13 = value;
    }

    /**
     * Gets the value of the adt13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADT13() {
        return adt13;
    }

    /**
     * Sets the value of the adt13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADT13(String value) {
        this.adt13 = value;
    }

    /**
     * Gets the value of the uvn13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUVN13() {
        return uvn13;
    }

    /**
     * Sets the value of the uvn13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUVN13(String value) {
        this.uvn13 = value;
    }

    /**
     * Gets the value of the ubs13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUBS13() {
        return ubs13;
    }

    /**
     * Sets the value of the ubs13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUBS13(String value) {
        this.ubs13 = value;
    }

    /**
     * Gets the value of the uld13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULD13() {
        return uld13;
    }

    /**
     * Sets the value of the uld13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULD13(String value) {
        this.uld13 = value;
    }

    /**
     * Gets the value of the doc14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOC14() {
        return doc14;
    }

    /**
     * Sets the value of the doc14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOC14(String value) {
        this.doc14 = value;
    }

    /**
     * Gets the value of the adt14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADT14() {
        return adt14;
    }

    /**
     * Sets the value of the adt14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADT14(String value) {
        this.adt14 = value;
    }

    /**
     * Gets the value of the uvn14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUVN14() {
        return uvn14;
    }

    /**
     * Sets the value of the uvn14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUVN14(String value) {
        this.uvn14 = value;
    }

    /**
     * Gets the value of the ubs14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUBS14() {
        return ubs14;
    }

    /**
     * Sets the value of the ubs14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUBS14(String value) {
        this.ubs14 = value;
    }

    /**
     * Gets the value of the uld14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULD14() {
        return uld14;
    }

    /**
     * Sets the value of the uld14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULD14(String value) {
        this.uld14 = value;
    }

    /**
     * Gets the value of the doc15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOC15() {
        return doc15;
    }

    /**
     * Sets the value of the doc15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOC15(String value) {
        this.doc15 = value;
    }

    /**
     * Gets the value of the adt15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADT15() {
        return adt15;
    }

    /**
     * Sets the value of the adt15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADT15(String value) {
        this.adt15 = value;
    }

    /**
     * Gets the value of the uvn15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUVN15() {
        return uvn15;
    }

    /**
     * Sets the value of the uvn15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUVN15(String value) {
        this.uvn15 = value;
    }

    /**
     * Gets the value of the ubs15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUBS15() {
        return ubs15;
    }

    /**
     * Sets the value of the ubs15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUBS15(String value) {
        this.ubs15 = value;
    }

    /**
     * Gets the value of the uld15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULD15() {
        return uld15;
    }

    /**
     * Sets the value of the uld15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULD15(String value) {
        this.uld15 = value;
    }

    /**
     * Gets the value of the doc16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOC16() {
        return doc16;
    }

    /**
     * Sets the value of the doc16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOC16(String value) {
        this.doc16 = value;
    }

    /**
     * Gets the value of the adt16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADT16() {
        return adt16;
    }

    /**
     * Sets the value of the adt16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADT16(String value) {
        this.adt16 = value;
    }

    /**
     * Gets the value of the uvn16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUVN16() {
        return uvn16;
    }

    /**
     * Sets the value of the uvn16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUVN16(String value) {
        this.uvn16 = value;
    }

    /**
     * Gets the value of the ubs16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUBS16() {
        return ubs16;
    }

    /**
     * Sets the value of the ubs16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUBS16(String value) {
        this.ubs16 = value;
    }

    /**
     * Gets the value of the uld16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULD16() {
        return uld16;
    }

    /**
     * Sets the value of the uld16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULD16(String value) {
        this.uld16 = value;
    }

    /**
     * Gets the value of the doc17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOC17() {
        return doc17;
    }

    /**
     * Sets the value of the doc17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOC17(String value) {
        this.doc17 = value;
    }

    /**
     * Gets the value of the adt17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADT17() {
        return adt17;
    }

    /**
     * Sets the value of the adt17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADT17(String value) {
        this.adt17 = value;
    }

    /**
     * Gets the value of the uvn17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUVN17() {
        return uvn17;
    }

    /**
     * Sets the value of the uvn17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUVN17(String value) {
        this.uvn17 = value;
    }

    /**
     * Gets the value of the ubs17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUBS17() {
        return ubs17;
    }

    /**
     * Sets the value of the ubs17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUBS17(String value) {
        this.ubs17 = value;
    }

    /**
     * Gets the value of the uld17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULD17() {
        return uld17;
    }

    /**
     * Sets the value of the uld17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULD17(String value) {
        this.uld17 = value;
    }

    /**
     * Gets the value of the doc18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOC18() {
        return doc18;
    }

    /**
     * Sets the value of the doc18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOC18(String value) {
        this.doc18 = value;
    }

    /**
     * Gets the value of the adt18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADT18() {
        return adt18;
    }

    /**
     * Sets the value of the adt18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADT18(String value) {
        this.adt18 = value;
    }

    /**
     * Gets the value of the uvn18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUVN18() {
        return uvn18;
    }

    /**
     * Sets the value of the uvn18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUVN18(String value) {
        this.uvn18 = value;
    }

    /**
     * Gets the value of the ubs18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUBS18() {
        return ubs18;
    }

    /**
     * Sets the value of the ubs18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUBS18(String value) {
        this.ubs18 = value;
    }

    /**
     * Gets the value of the uld18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULD18() {
        return uld18;
    }

    /**
     * Sets the value of the uld18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULD18(String value) {
        this.uld18 = value;
    }

    /**
     * Gets the value of the doc19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOC19() {
        return doc19;
    }

    /**
     * Sets the value of the doc19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOC19(String value) {
        this.doc19 = value;
    }

    /**
     * Gets the value of the adt19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADT19() {
        return adt19;
    }

    /**
     * Sets the value of the adt19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADT19(String value) {
        this.adt19 = value;
    }

    /**
     * Gets the value of the uvn19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUVN19() {
        return uvn19;
    }

    /**
     * Sets the value of the uvn19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUVN19(String value) {
        this.uvn19 = value;
    }

    /**
     * Gets the value of the ubs19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUBS19() {
        return ubs19;
    }

    /**
     * Sets the value of the ubs19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUBS19(String value) {
        this.ubs19 = value;
    }

    /**
     * Gets the value of the uld19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULD19() {
        return uld19;
    }

    /**
     * Sets the value of the uld19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULD19(String value) {
        this.uld19 = value;
    }

    /**
     * Gets the value of the doc20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOC20() {
        return doc20;
    }

    /**
     * Sets the value of the doc20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOC20(String value) {
        this.doc20 = value;
    }

    /**
     * Gets the value of the adt20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADT20() {
        return adt20;
    }

    /**
     * Sets the value of the adt20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADT20(String value) {
        this.adt20 = value;
    }

    /**
     * Gets the value of the uvn20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUVN20() {
        return uvn20;
    }

    /**
     * Sets the value of the uvn20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUVN20(String value) {
        this.uvn20 = value;
    }

    /**
     * Gets the value of the ubs20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUBS20() {
        return ubs20;
    }

    /**
     * Sets the value of the ubs20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUBS20(String value) {
        this.ubs20 = value;
    }

    /**
     * Gets the value of the uld20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULD20() {
        return uld20;
    }

    /**
     * Sets the value of the uld20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULD20(String value) {
        this.uld20 = value;
    }

    /**
     * Gets the value of the prt01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRT01() {
        return prt01;
    }

    /**
     * Sets the value of the prt01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRT01(String value) {
        this.prt01 = value;
    }

    /**
     * Gets the value of the dpl01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPL01() {
        return dpl01;
    }

    /**
     * Sets the value of the dpl01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPL01(String value) {
        this.dpl01 = value;
    }

    /**
     * Gets the value of the adr01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADR01() {
        return adr01;
    }

    /**
     * Sets the value of the adr01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADR01(String value) {
        this.adr01 = value;
    }

    /**
     * Gets the value of the prt02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRT02() {
        return prt02;
    }

    /**
     * Sets the value of the prt02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRT02(String value) {
        this.prt02 = value;
    }

    /**
     * Gets the value of the dpl02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPL02() {
        return dpl02;
    }

    /**
     * Sets the value of the dpl02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPL02(String value) {
        this.dpl02 = value;
    }

    /**
     * Gets the value of the adr02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADR02() {
        return adr02;
    }

    /**
     * Sets the value of the adr02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADR02(String value) {
        this.adr02 = value;
    }

    /**
     * Gets the value of the prt03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRT03() {
        return prt03;
    }

    /**
     * Sets the value of the prt03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRT03(String value) {
        this.prt03 = value;
    }

    /**
     * Gets the value of the dpl03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPL03() {
        return dpl03;
    }

    /**
     * Sets the value of the dpl03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPL03(String value) {
        this.dpl03 = value;
    }

    /**
     * Gets the value of the adr03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADR03() {
        return adr03;
    }

    /**
     * Sets the value of the adr03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADR03(String value) {
        this.adr03 = value;
    }

    /**
     * Gets the value of the prt04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRT04() {
        return prt04;
    }

    /**
     * Sets the value of the prt04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRT04(String value) {
        this.prt04 = value;
    }

    /**
     * Gets the value of the dpl04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPL04() {
        return dpl04;
    }

    /**
     * Sets the value of the dpl04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPL04(String value) {
        this.dpl04 = value;
    }

    /**
     * Gets the value of the adr04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADR04() {
        return adr04;
    }

    /**
     * Sets the value of the adr04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADR04(String value) {
        this.adr04 = value;
    }

    /**
     * Gets the value of the prt05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRT05() {
        return prt05;
    }

    /**
     * Sets the value of the prt05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRT05(String value) {
        this.prt05 = value;
    }

    /**
     * Gets the value of the dpl05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPL05() {
        return dpl05;
    }

    /**
     * Sets the value of the dpl05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPL05(String value) {
        this.dpl05 = value;
    }

    /**
     * Gets the value of the adr05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADR05() {
        return adr05;
    }

    /**
     * Sets the value of the adr05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADR05(String value) {
        this.adr05 = value;
    }

    /**
     * Gets the value of the prt06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRT06() {
        return prt06;
    }

    /**
     * Sets the value of the prt06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRT06(String value) {
        this.prt06 = value;
    }

    /**
     * Gets the value of the dpl06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPL06() {
        return dpl06;
    }

    /**
     * Sets the value of the dpl06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPL06(String value) {
        this.dpl06 = value;
    }

    /**
     * Gets the value of the adr06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADR06() {
        return adr06;
    }

    /**
     * Sets the value of the adr06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADR06(String value) {
        this.adr06 = value;
    }

    /**
     * Gets the value of the prt07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRT07() {
        return prt07;
    }

    /**
     * Sets the value of the prt07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRT07(String value) {
        this.prt07 = value;
    }

    /**
     * Gets the value of the dpl07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPL07() {
        return dpl07;
    }

    /**
     * Sets the value of the dpl07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPL07(String value) {
        this.dpl07 = value;
    }

    /**
     * Gets the value of the adr07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADR07() {
        return adr07;
    }

    /**
     * Sets the value of the adr07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADR07(String value) {
        this.adr07 = value;
    }

    /**
     * Gets the value of the prt08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRT08() {
        return prt08;
    }

    /**
     * Sets the value of the prt08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRT08(String value) {
        this.prt08 = value;
    }

    /**
     * Gets the value of the dpl08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPL08() {
        return dpl08;
    }

    /**
     * Sets the value of the dpl08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPL08(String value) {
        this.dpl08 = value;
    }

    /**
     * Gets the value of the adr08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADR08() {
        return adr08;
    }

    /**
     * Sets the value of the adr08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADR08(String value) {
        this.adr08 = value;
    }

    /**
     * Gets the value of the prt09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRT09() {
        return prt09;
    }

    /**
     * Sets the value of the prt09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRT09(String value) {
        this.prt09 = value;
    }

    /**
     * Gets the value of the dpl09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPL09() {
        return dpl09;
    }

    /**
     * Sets the value of the dpl09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPL09(String value) {
        this.dpl09 = value;
    }

    /**
     * Gets the value of the adr09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADR09() {
        return adr09;
    }

    /**
     * Sets the value of the adr09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADR09(String value) {
        this.adr09 = value;
    }

    /**
     * Gets the value of the prt10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRT10() {
        return prt10;
    }

    /**
     * Sets the value of the prt10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRT10(String value) {
        this.prt10 = value;
    }

    /**
     * Gets the value of the dpl10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPL10() {
        return dpl10;
    }

    /**
     * Sets the value of the dpl10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPL10(String value) {
        this.dpl10 = value;
    }

    /**
     * Gets the value of the adr10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADR10() {
        return adr10;
    }

    /**
     * Sets the value of the adr10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADR10(String value) {
        this.adr10 = value;
    }

    /**
     * Gets the value of the prt11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRT11() {
        return prt11;
    }

    /**
     * Sets the value of the prt11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRT11(String value) {
        this.prt11 = value;
    }

    /**
     * Gets the value of the dpl11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPL11() {
        return dpl11;
    }

    /**
     * Sets the value of the dpl11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPL11(String value) {
        this.dpl11 = value;
    }

    /**
     * Gets the value of the adr11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADR11() {
        return adr11;
    }

    /**
     * Sets the value of the adr11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADR11(String value) {
        this.adr11 = value;
    }

    /**
     * Gets the value of the prt12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRT12() {
        return prt12;
    }

    /**
     * Sets the value of the prt12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRT12(String value) {
        this.prt12 = value;
    }

    /**
     * Gets the value of the dpl12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPL12() {
        return dpl12;
    }

    /**
     * Sets the value of the dpl12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPL12(String value) {
        this.dpl12 = value;
    }

    /**
     * Gets the value of the adr12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADR12() {
        return adr12;
    }

    /**
     * Sets the value of the adr12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADR12(String value) {
        this.adr12 = value;
    }

    /**
     * Gets the value of the prt13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRT13() {
        return prt13;
    }

    /**
     * Sets the value of the prt13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRT13(String value) {
        this.prt13 = value;
    }

    /**
     * Gets the value of the dpl13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPL13() {
        return dpl13;
    }

    /**
     * Sets the value of the dpl13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPL13(String value) {
        this.dpl13 = value;
    }

    /**
     * Gets the value of the adr13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADR13() {
        return adr13;
    }

    /**
     * Sets the value of the adr13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADR13(String value) {
        this.adr13 = value;
    }

    /**
     * Gets the value of the prt14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRT14() {
        return prt14;
    }

    /**
     * Sets the value of the prt14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRT14(String value) {
        this.prt14 = value;
    }

    /**
     * Gets the value of the dpl14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPL14() {
        return dpl14;
    }

    /**
     * Sets the value of the dpl14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPL14(String value) {
        this.dpl14 = value;
    }

    /**
     * Gets the value of the adr14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADR14() {
        return adr14;
    }

    /**
     * Sets the value of the adr14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADR14(String value) {
        this.adr14 = value;
    }

    /**
     * Gets the value of the prt15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRT15() {
        return prt15;
    }

    /**
     * Sets the value of the prt15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRT15(String value) {
        this.prt15 = value;
    }

    /**
     * Gets the value of the dpl15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPL15() {
        return dpl15;
    }

    /**
     * Sets the value of the dpl15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPL15(String value) {
        this.dpl15 = value;
    }

    /**
     * Gets the value of the adr15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADR15() {
        return adr15;
    }

    /**
     * Sets the value of the adr15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADR15(String value) {
        this.adr15 = value;
    }

    /**
     * Gets the value of the prt16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRT16() {
        return prt16;
    }

    /**
     * Sets the value of the prt16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRT16(String value) {
        this.prt16 = value;
    }

    /**
     * Gets the value of the dpl16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPL16() {
        return dpl16;
    }

    /**
     * Sets the value of the dpl16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPL16(String value) {
        this.dpl16 = value;
    }

    /**
     * Gets the value of the adr16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADR16() {
        return adr16;
    }

    /**
     * Sets the value of the adr16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADR16(String value) {
        this.adr16 = value;
    }

    /**
     * Gets the value of the prt17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRT17() {
        return prt17;
    }

    /**
     * Sets the value of the prt17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRT17(String value) {
        this.prt17 = value;
    }

    /**
     * Gets the value of the dpl17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPL17() {
        return dpl17;
    }

    /**
     * Sets the value of the dpl17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPL17(String value) {
        this.dpl17 = value;
    }

    /**
     * Gets the value of the adr17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADR17() {
        return adr17;
    }

    /**
     * Sets the value of the adr17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADR17(String value) {
        this.adr17 = value;
    }

    /**
     * Gets the value of the prt18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRT18() {
        return prt18;
    }

    /**
     * Sets the value of the prt18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRT18(String value) {
        this.prt18 = value;
    }

    /**
     * Gets the value of the dpl18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPL18() {
        return dpl18;
    }

    /**
     * Sets the value of the dpl18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPL18(String value) {
        this.dpl18 = value;
    }

    /**
     * Gets the value of the adr18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADR18() {
        return adr18;
    }

    /**
     * Sets the value of the adr18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADR18(String value) {
        this.adr18 = value;
    }

    /**
     * Gets the value of the prt19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRT19() {
        return prt19;
    }

    /**
     * Sets the value of the prt19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRT19(String value) {
        this.prt19 = value;
    }

    /**
     * Gets the value of the dpl19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPL19() {
        return dpl19;
    }

    /**
     * Sets the value of the dpl19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPL19(String value) {
        this.dpl19 = value;
    }

    /**
     * Gets the value of the adr19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADR19() {
        return adr19;
    }

    /**
     * Sets the value of the adr19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADR19(String value) {
        this.adr19 = value;
    }

    /**
     * Gets the value of the prt20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRT20() {
        return prt20;
    }

    /**
     * Sets the value of the prt20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRT20(String value) {
        this.prt20 = value;
    }

    /**
     * Gets the value of the dpl20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPL20() {
        return dpl20;
    }

    /**
     * Sets the value of the dpl20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPL20(String value) {
        this.dpl20 = value;
    }

    /**
     * Gets the value of the adr20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADR20() {
        return adr20;
    }

    /**
     * Sets the value of the adr20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADR20(String value) {
        this.adr20 = value;
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
