
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
 *         &lt;element name="BMGJV" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GABFG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FABFG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANZDJ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PENAB" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UKTAG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UGLFD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UGSZG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UENTS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MGLFD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MGSZG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANGAB" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANPAB" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANUAB" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AGLFD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AGSZG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SOSOZ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FAVDZ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
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
 *         &lt;element name="NIUEG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NIKEG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GRTXT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ABANZDJ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ABAUTO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EUAUTO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MAAUTO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KONT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MAANZDJ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GBMFACH" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KKTAG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KGLFD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KGSZG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KSVBG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KZFDT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="USVBG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UZFDT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FAAUTO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZSAUTO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FZMGT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SZMGT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AUFLJ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UESVF" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FAKT1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ABS_BETRG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANT_STFREI" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DN_SVBETRG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SONDERZAHL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ABZYE_STNET" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ABZYE_STBRT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ABSTAUTO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PENRED" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ABSTS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ABSTAUTO1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ABSTAUTO2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ABSTAUTO3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ABSTAUTO4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ABSTAUTO5" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ABSTAUTO6" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UGSZG_SVDAT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KGSZG_SVDAT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KOSTR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ABENT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EFZGEND" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
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
    "bmgjv",
    "gabfg",
    "fabfg",
    "anzdj",
    "penab",
    "uktag",
    "uglfd",
    "ugszg",
    "uents",
    "mglfd",
    "mgszg",
    "angab",
    "anpab",
    "anuab",
    "aglfd",
    "agszg",
    "sosoz",
    "favdz",
    "grpvl",
    "niueg",
    "nikeg",
    "grtxt",
    "abanzdj",
    "abauto",
    "euauto",
    "maauto",
    "kont",
    "maanzdj",
    "gbmfach",
    "kktag",
    "kglfd",
    "kgszg",
    "ksvbg",
    "kzfdt",
    "usvbg",
    "uzfdt",
    "faauto",
    "zsauto",
    "fzmgt",
    "szmgt",
    "auflj",
    "uesvf",
    "fakt1",
    "absbetrg",
    "antstfrei",
    "dnsvbetrg",
    "sonderzahl",
    "abzyestnet",
    "abzyestbrt",
    "abstauto",
    "penred",
    "absts",
    "abstauto1",
    "abstauto2",
    "abstauto3",
    "abstauto4",
    "abstauto5",
    "abstauto6",
    "ugszgsvdat",
    "kgszgsvdat",
    "kostr",
    "abent",
    "efzgend"
})
public class E1P0527 {

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
    @XmlElement(name = "BMGJV")
    protected String bmgjv;
    @XmlElement(name = "GABFG")
    protected String gabfg;
    @XmlElement(name = "FABFG")
    protected String fabfg;
    @XmlElement(name = "ANZDJ")
    protected String anzdj;
    @XmlElement(name = "PENAB")
    protected String penab;
    @XmlElement(name = "UKTAG")
    protected String uktag;
    @XmlElement(name = "UGLFD")
    protected String uglfd;
    @XmlElement(name = "UGSZG")
    protected String ugszg;
    @XmlElement(name = "UENTS")
    protected String uents;
    @XmlElement(name = "MGLFD")
    protected String mglfd;
    @XmlElement(name = "MGSZG")
    protected String mgszg;
    @XmlElement(name = "ANGAB")
    protected String angab;
    @XmlElement(name = "ANPAB")
    protected String anpab;
    @XmlElement(name = "ANUAB")
    protected String anuab;
    @XmlElement(name = "AGLFD")
    protected String aglfd;
    @XmlElement(name = "AGSZG")
    protected String agszg;
    @XmlElement(name = "SOSOZ")
    protected String sosoz;
    @XmlElement(name = "FAVDZ")
    protected String favdz;
    @XmlElement(name = "GRPVL")
    protected String grpvl;
    @XmlElement(name = "NIUEG")
    protected String niueg;
    @XmlElement(name = "NIKEG")
    protected String nikeg;
    @XmlElement(name = "GRTXT")
    protected String grtxt;
    @XmlElement(name = "ABANZDJ")
    protected String abanzdj;
    @XmlElement(name = "ABAUTO")
    protected String abauto;
    @XmlElement(name = "EUAUTO")
    protected String euauto;
    @XmlElement(name = "MAAUTO")
    protected String maauto;
    @XmlElement(name = "KONT")
    protected String kont;
    @XmlElement(name = "MAANZDJ")
    protected String maanzdj;
    @XmlElement(name = "GBMFACH")
    protected String gbmfach;
    @XmlElement(name = "KKTAG")
    protected String kktag;
    @XmlElement(name = "KGLFD")
    protected String kglfd;
    @XmlElement(name = "KGSZG")
    protected String kgszg;
    @XmlElement(name = "KSVBG")
    protected String ksvbg;
    @XmlElement(name = "KZFDT")
    protected String kzfdt;
    @XmlElement(name = "USVBG")
    protected String usvbg;
    @XmlElement(name = "UZFDT")
    protected String uzfdt;
    @XmlElement(name = "FAAUTO")
    protected String faauto;
    @XmlElement(name = "ZSAUTO")
    protected String zsauto;
    @XmlElement(name = "FZMGT")
    protected String fzmgt;
    @XmlElement(name = "SZMGT")
    protected String szmgt;
    @XmlElement(name = "AUFLJ")
    protected String auflj;
    @XmlElement(name = "UESVF")
    protected String uesvf;
    @XmlElement(name = "FAKT1")
    protected String fakt1;
    @XmlElement(name = "ABS_BETRG")
    protected String absbetrg;
    @XmlElement(name = "ANT_STFREI")
    protected String antstfrei;
    @XmlElement(name = "DN_SVBETRG")
    protected String dnsvbetrg;
    @XmlElement(name = "SONDERZAHL")
    protected String sonderzahl;
    @XmlElement(name = "ABZYE_STNET")
    protected String abzyestnet;
    @XmlElement(name = "ABZYE_STBRT")
    protected String abzyestbrt;
    @XmlElement(name = "ABSTAUTO")
    protected String abstauto;
    @XmlElement(name = "PENRED")
    protected String penred;
    @XmlElement(name = "ABSTS")
    protected String absts;
    @XmlElement(name = "ABSTAUTO1")
    protected String abstauto1;
    @XmlElement(name = "ABSTAUTO2")
    protected String abstauto2;
    @XmlElement(name = "ABSTAUTO3")
    protected String abstauto3;
    @XmlElement(name = "ABSTAUTO4")
    protected String abstauto4;
    @XmlElement(name = "ABSTAUTO5")
    protected String abstauto5;
    @XmlElement(name = "ABSTAUTO6")
    protected String abstauto6;
    @XmlElement(name = "UGSZG_SVDAT")
    protected String ugszgsvdat;
    @XmlElement(name = "KGSZG_SVDAT")
    protected String kgszgsvdat;
    @XmlElement(name = "KOSTR")
    protected String kostr;
    @XmlElement(name = "ABENT")
    protected String abent;
    @XmlElement(name = "EFZGEND")
    protected String efzgend;
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
     * Gets the value of the bmgjv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBMGJV() {
        return bmgjv;
    }

    /**
     * Sets the value of the bmgjv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBMGJV(String value) {
        this.bmgjv = value;
    }

    /**
     * Gets the value of the gabfg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGABFG() {
        return gabfg;
    }

    /**
     * Sets the value of the gabfg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGABFG(String value) {
        this.gabfg = value;
    }

    /**
     * Gets the value of the fabfg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFABFG() {
        return fabfg;
    }

    /**
     * Sets the value of the fabfg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFABFG(String value) {
        this.fabfg = value;
    }

    /**
     * Gets the value of the anzdj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZDJ() {
        return anzdj;
    }

    /**
     * Sets the value of the anzdj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZDJ(String value) {
        this.anzdj = value;
    }

    /**
     * Gets the value of the penab property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPENAB() {
        return penab;
    }

    /**
     * Sets the value of the penab property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPENAB(String value) {
        this.penab = value;
    }

    /**
     * Gets the value of the uktag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUKTAG() {
        return uktag;
    }

    /**
     * Sets the value of the uktag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUKTAG(String value) {
        this.uktag = value;
    }

    /**
     * Gets the value of the uglfd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUGLFD() {
        return uglfd;
    }

    /**
     * Sets the value of the uglfd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUGLFD(String value) {
        this.uglfd = value;
    }

    /**
     * Gets the value of the ugszg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUGSZG() {
        return ugszg;
    }

    /**
     * Sets the value of the ugszg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUGSZG(String value) {
        this.ugszg = value;
    }

    /**
     * Gets the value of the uents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUENTS() {
        return uents;
    }

    /**
     * Sets the value of the uents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUENTS(String value) {
        this.uents = value;
    }

    /**
     * Gets the value of the mglfd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMGLFD() {
        return mglfd;
    }

    /**
     * Sets the value of the mglfd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMGLFD(String value) {
        this.mglfd = value;
    }

    /**
     * Gets the value of the mgszg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMGSZG() {
        return mgszg;
    }

    /**
     * Sets the value of the mgszg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMGSZG(String value) {
        this.mgszg = value;
    }

    /**
     * Gets the value of the angab property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANGAB() {
        return angab;
    }

    /**
     * Sets the value of the angab property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANGAB(String value) {
        this.angab = value;
    }

    /**
     * Gets the value of the anpab property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANPAB() {
        return anpab;
    }

    /**
     * Sets the value of the anpab property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANPAB(String value) {
        this.anpab = value;
    }

    /**
     * Gets the value of the anuab property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANUAB() {
        return anuab;
    }

    /**
     * Sets the value of the anuab property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANUAB(String value) {
        this.anuab = value;
    }

    /**
     * Gets the value of the aglfd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGLFD() {
        return aglfd;
    }

    /**
     * Sets the value of the aglfd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGLFD(String value) {
        this.aglfd = value;
    }

    /**
     * Gets the value of the agszg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGSZG() {
        return agszg;
    }

    /**
     * Sets the value of the agszg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGSZG(String value) {
        this.agszg = value;
    }

    /**
     * Gets the value of the sosoz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOSOZ() {
        return sosoz;
    }

    /**
     * Sets the value of the sosoz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOSOZ(String value) {
        this.sosoz = value;
    }

    /**
     * Gets the value of the favdz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAVDZ() {
        return favdz;
    }

    /**
     * Sets the value of the favdz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAVDZ(String value) {
        this.favdz = value;
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
     * Gets the value of the niueg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIUEG() {
        return niueg;
    }

    /**
     * Sets the value of the niueg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIUEG(String value) {
        this.niueg = value;
    }

    /**
     * Gets the value of the nikeg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIKEG() {
        return nikeg;
    }

    /**
     * Sets the value of the nikeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIKEG(String value) {
        this.nikeg = value;
    }

    /**
     * Gets the value of the grtxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRTXT() {
        return grtxt;
    }

    /**
     * Sets the value of the grtxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRTXT(String value) {
        this.grtxt = value;
    }

    /**
     * Gets the value of the abanzdj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABANZDJ() {
        return abanzdj;
    }

    /**
     * Sets the value of the abanzdj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABANZDJ(String value) {
        this.abanzdj = value;
    }

    /**
     * Gets the value of the abauto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABAUTO() {
        return abauto;
    }

    /**
     * Sets the value of the abauto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABAUTO(String value) {
        this.abauto = value;
    }

    /**
     * Gets the value of the euauto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEUAUTO() {
        return euauto;
    }

    /**
     * Sets the value of the euauto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEUAUTO(String value) {
        this.euauto = value;
    }

    /**
     * Gets the value of the maauto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAAUTO() {
        return maauto;
    }

    /**
     * Sets the value of the maauto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAAUTO(String value) {
        this.maauto = value;
    }

    /**
     * Gets the value of the kont property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKONT() {
        return kont;
    }

    /**
     * Sets the value of the kont property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKONT(String value) {
        this.kont = value;
    }

    /**
     * Gets the value of the maanzdj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAANZDJ() {
        return maanzdj;
    }

    /**
     * Sets the value of the maanzdj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAANZDJ(String value) {
        this.maanzdj = value;
    }

    /**
     * Gets the value of the gbmfach property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGBMFACH() {
        return gbmfach;
    }

    /**
     * Sets the value of the gbmfach property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGBMFACH(String value) {
        this.gbmfach = value;
    }

    /**
     * Gets the value of the kktag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKKTAG() {
        return kktag;
    }

    /**
     * Sets the value of the kktag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKKTAG(String value) {
        this.kktag = value;
    }

    /**
     * Gets the value of the kglfd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKGLFD() {
        return kglfd;
    }

    /**
     * Sets the value of the kglfd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKGLFD(String value) {
        this.kglfd = value;
    }

    /**
     * Gets the value of the kgszg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKGSZG() {
        return kgszg;
    }

    /**
     * Sets the value of the kgszg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKGSZG(String value) {
        this.kgszg = value;
    }

    /**
     * Gets the value of the ksvbg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKSVBG() {
        return ksvbg;
    }

    /**
     * Sets the value of the ksvbg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKSVBG(String value) {
        this.ksvbg = value;
    }

    /**
     * Gets the value of the kzfdt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKZFDT() {
        return kzfdt;
    }

    /**
     * Sets the value of the kzfdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKZFDT(String value) {
        this.kzfdt = value;
    }

    /**
     * Gets the value of the usvbg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSVBG() {
        return usvbg;
    }

    /**
     * Sets the value of the usvbg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSVBG(String value) {
        this.usvbg = value;
    }

    /**
     * Gets the value of the uzfdt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUZFDT() {
        return uzfdt;
    }

    /**
     * Sets the value of the uzfdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUZFDT(String value) {
        this.uzfdt = value;
    }

    /**
     * Gets the value of the faauto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAAUTO() {
        return faauto;
    }

    /**
     * Sets the value of the faauto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAAUTO(String value) {
        this.faauto = value;
    }

    /**
     * Gets the value of the zsauto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZSAUTO() {
        return zsauto;
    }

    /**
     * Sets the value of the zsauto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZSAUTO(String value) {
        this.zsauto = value;
    }

    /**
     * Gets the value of the fzmgt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFZMGT() {
        return fzmgt;
    }

    /**
     * Sets the value of the fzmgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFZMGT(String value) {
        this.fzmgt = value;
    }

    /**
     * Gets the value of the szmgt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSZMGT() {
        return szmgt;
    }

    /**
     * Sets the value of the szmgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSZMGT(String value) {
        this.szmgt = value;
    }

    /**
     * Gets the value of the auflj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUFLJ() {
        return auflj;
    }

    /**
     * Sets the value of the auflj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUFLJ(String value) {
        this.auflj = value;
    }

    /**
     * Gets the value of the uesvf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUESVF() {
        return uesvf;
    }

    /**
     * Sets the value of the uesvf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUESVF(String value) {
        this.uesvf = value;
    }

    /**
     * Gets the value of the fakt1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAKT1() {
        return fakt1;
    }

    /**
     * Sets the value of the fakt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAKT1(String value) {
        this.fakt1 = value;
    }

    /**
     * Gets the value of the absbetrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABSBETRG() {
        return absbetrg;
    }

    /**
     * Sets the value of the absbetrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABSBETRG(String value) {
        this.absbetrg = value;
    }

    /**
     * Gets the value of the antstfrei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANTSTFREI() {
        return antstfrei;
    }

    /**
     * Sets the value of the antstfrei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANTSTFREI(String value) {
        this.antstfrei = value;
    }

    /**
     * Gets the value of the dnsvbetrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDNSVBETRG() {
        return dnsvbetrg;
    }

    /**
     * Sets the value of the dnsvbetrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDNSVBETRG(String value) {
        this.dnsvbetrg = value;
    }

    /**
     * Gets the value of the sonderzahl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSONDERZAHL() {
        return sonderzahl;
    }

    /**
     * Sets the value of the sonderzahl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSONDERZAHL(String value) {
        this.sonderzahl = value;
    }

    /**
     * Gets the value of the abzyestnet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABZYESTNET() {
        return abzyestnet;
    }

    /**
     * Sets the value of the abzyestnet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABZYESTNET(String value) {
        this.abzyestnet = value;
    }

    /**
     * Gets the value of the abzyestbrt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABZYESTBRT() {
        return abzyestbrt;
    }

    /**
     * Sets the value of the abzyestbrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABZYESTBRT(String value) {
        this.abzyestbrt = value;
    }

    /**
     * Gets the value of the abstauto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABSTAUTO() {
        return abstauto;
    }

    /**
     * Sets the value of the abstauto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABSTAUTO(String value) {
        this.abstauto = value;
    }

    /**
     * Gets the value of the penred property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPENRED() {
        return penred;
    }

    /**
     * Sets the value of the penred property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPENRED(String value) {
        this.penred = value;
    }

    /**
     * Gets the value of the absts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABSTS() {
        return absts;
    }

    /**
     * Sets the value of the absts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABSTS(String value) {
        this.absts = value;
    }

    /**
     * Gets the value of the abstauto1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABSTAUTO1() {
        return abstauto1;
    }

    /**
     * Sets the value of the abstauto1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABSTAUTO1(String value) {
        this.abstauto1 = value;
    }

    /**
     * Gets the value of the abstauto2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABSTAUTO2() {
        return abstauto2;
    }

    /**
     * Sets the value of the abstauto2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABSTAUTO2(String value) {
        this.abstauto2 = value;
    }

    /**
     * Gets the value of the abstauto3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABSTAUTO3() {
        return abstauto3;
    }

    /**
     * Sets the value of the abstauto3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABSTAUTO3(String value) {
        this.abstauto3 = value;
    }

    /**
     * Gets the value of the abstauto4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABSTAUTO4() {
        return abstauto4;
    }

    /**
     * Sets the value of the abstauto4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABSTAUTO4(String value) {
        this.abstauto4 = value;
    }

    /**
     * Gets the value of the abstauto5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABSTAUTO5() {
        return abstauto5;
    }

    /**
     * Sets the value of the abstauto5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABSTAUTO5(String value) {
        this.abstauto5 = value;
    }

    /**
     * Gets the value of the abstauto6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABSTAUTO6() {
        return abstauto6;
    }

    /**
     * Sets the value of the abstauto6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABSTAUTO6(String value) {
        this.abstauto6 = value;
    }

    /**
     * Gets the value of the ugszgsvdat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUGSZGSVDAT() {
        return ugszgsvdat;
    }

    /**
     * Sets the value of the ugszgsvdat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUGSZGSVDAT(String value) {
        this.ugszgsvdat = value;
    }

    /**
     * Gets the value of the kgszgsvdat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKGSZGSVDAT() {
        return kgszgsvdat;
    }

    /**
     * Sets the value of the kgszgsvdat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKGSZGSVDAT(String value) {
        this.kgszgsvdat = value;
    }

    /**
     * Gets the value of the kostr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOSTR() {
        return kostr;
    }

    /**
     * Sets the value of the kostr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOSTR(String value) {
        this.kostr = value;
    }

    /**
     * Gets the value of the abent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABENT() {
        return abent;
    }

    /**
     * Sets the value of the abent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABENT(String value) {
        this.abent = value;
    }

    /**
     * Gets the value of the efzgend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEFZGEND() {
        return efzgend;
    }

    /**
     * Sets the value of the efzgend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEFZGEND(String value) {
        this.efzgend = value;
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
