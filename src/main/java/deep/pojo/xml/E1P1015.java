
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
 *         &lt;element name="CTYPE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="14"/&gt;
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
 *         &lt;element name="BUDGT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ABART" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DIRCT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RSERV" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CTYPE001" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="14"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WAERS001" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BUDGT001" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ABART001" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DIRCT001" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RSERV001" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CTYPE002" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="14"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WAERS002" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BUDGT002" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ABART002" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DIRCT002" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RSERV002" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CTYPE003" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="14"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WAERS003" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BUDGT003" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ABART003" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DIRCT003" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RSERV003" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CTYPE004" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="14"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WAERS004" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BUDGT004" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ABART004" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DIRCT004" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RSERV004" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CTYPE005" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="14"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WAERS005" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BUDGT005" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ABART005" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DIRCT005" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RSERV005" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CTYPE006" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="14"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WAERS006" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BUDGT006" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ABART006" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DIRCT006" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RSERV006" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
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
    "ctype",
    "waers",
    "budgt",
    "abart",
    "dirct",
    "rserv",
    "ctype001",
    "waers001",
    "budgt001",
    "abart001",
    "dirct001",
    "rserv001",
    "ctype002",
    "waers002",
    "budgt002",
    "abart002",
    "dirct002",
    "rserv002",
    "ctype003",
    "waers003",
    "budgt003",
    "abart003",
    "dirct003",
    "rserv003",
    "ctype004",
    "waers004",
    "budgt004",
    "abart004",
    "dirct004",
    "rserv004",
    "ctype005",
    "waers005",
    "budgt005",
    "abart005",
    "dirct005",
    "rserv005",
    "ctype006",
    "waers006",
    "budgt006",
    "abart006",
    "dirct006",
    "rserv006"
})
public class E1P1015 {

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
    @XmlElement(name = "CTYPE")
    protected String ctype;
    @XmlElement(name = "WAERS")
    protected String waers;
    @XmlElement(name = "BUDGT")
    protected String budgt;
    @XmlElement(name = "ABART")
    protected String abart;
    @XmlElement(name = "DIRCT")
    protected String dirct;
    @XmlElement(name = "RSERV")
    protected String rserv;
    @XmlElement(name = "CTYPE001")
    protected String ctype001;
    @XmlElement(name = "WAERS001")
    protected String waers001;
    @XmlElement(name = "BUDGT001")
    protected String budgt001;
    @XmlElement(name = "ABART001")
    protected String abart001;
    @XmlElement(name = "DIRCT001")
    protected String dirct001;
    @XmlElement(name = "RSERV001")
    protected String rserv001;
    @XmlElement(name = "CTYPE002")
    protected String ctype002;
    @XmlElement(name = "WAERS002")
    protected String waers002;
    @XmlElement(name = "BUDGT002")
    protected String budgt002;
    @XmlElement(name = "ABART002")
    protected String abart002;
    @XmlElement(name = "DIRCT002")
    protected String dirct002;
    @XmlElement(name = "RSERV002")
    protected String rserv002;
    @XmlElement(name = "CTYPE003")
    protected String ctype003;
    @XmlElement(name = "WAERS003")
    protected String waers003;
    @XmlElement(name = "BUDGT003")
    protected String budgt003;
    @XmlElement(name = "ABART003")
    protected String abart003;
    @XmlElement(name = "DIRCT003")
    protected String dirct003;
    @XmlElement(name = "RSERV003")
    protected String rserv003;
    @XmlElement(name = "CTYPE004")
    protected String ctype004;
    @XmlElement(name = "WAERS004")
    protected String waers004;
    @XmlElement(name = "BUDGT004")
    protected String budgt004;
    @XmlElement(name = "ABART004")
    protected String abart004;
    @XmlElement(name = "DIRCT004")
    protected String dirct004;
    @XmlElement(name = "RSERV004")
    protected String rserv004;
    @XmlElement(name = "CTYPE005")
    protected String ctype005;
    @XmlElement(name = "WAERS005")
    protected String waers005;
    @XmlElement(name = "BUDGT005")
    protected String budgt005;
    @XmlElement(name = "ABART005")
    protected String abart005;
    @XmlElement(name = "DIRCT005")
    protected String dirct005;
    @XmlElement(name = "RSERV005")
    protected String rserv005;
    @XmlElement(name = "CTYPE006")
    protected String ctype006;
    @XmlElement(name = "WAERS006")
    protected String waers006;
    @XmlElement(name = "BUDGT006")
    protected String budgt006;
    @XmlElement(name = "ABART006")
    protected String abart006;
    @XmlElement(name = "DIRCT006")
    protected String dirct006;
    @XmlElement(name = "RSERV006")
    protected String rserv006;
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
     * Gets the value of the ctype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTYPE() {
        return ctype;
    }

    /**
     * Sets the value of the ctype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTYPE(String value) {
        this.ctype = value;
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
     * Gets the value of the budgt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUDGT() {
        return budgt;
    }

    /**
     * Sets the value of the budgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUDGT(String value) {
        this.budgt = value;
    }

    /**
     * Gets the value of the abart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABART() {
        return abart;
    }

    /**
     * Sets the value of the abart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABART(String value) {
        this.abart = value;
    }

    /**
     * Gets the value of the dirct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIRCT() {
        return dirct;
    }

    /**
     * Sets the value of the dirct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIRCT(String value) {
        this.dirct = value;
    }

    /**
     * Gets the value of the rserv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSERV() {
        return rserv;
    }

    /**
     * Sets the value of the rserv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSERV(String value) {
        this.rserv = value;
    }

    /**
     * Gets the value of the ctype001 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTYPE001() {
        return ctype001;
    }

    /**
     * Sets the value of the ctype001 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTYPE001(String value) {
        this.ctype001 = value;
    }

    /**
     * Gets the value of the waers001 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAERS001() {
        return waers001;
    }

    /**
     * Sets the value of the waers001 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAERS001(String value) {
        this.waers001 = value;
    }

    /**
     * Gets the value of the budgt001 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUDGT001() {
        return budgt001;
    }

    /**
     * Sets the value of the budgt001 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUDGT001(String value) {
        this.budgt001 = value;
    }

    /**
     * Gets the value of the abart001 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABART001() {
        return abart001;
    }

    /**
     * Sets the value of the abart001 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABART001(String value) {
        this.abart001 = value;
    }

    /**
     * Gets the value of the dirct001 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIRCT001() {
        return dirct001;
    }

    /**
     * Sets the value of the dirct001 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIRCT001(String value) {
        this.dirct001 = value;
    }

    /**
     * Gets the value of the rserv001 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSERV001() {
        return rserv001;
    }

    /**
     * Sets the value of the rserv001 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSERV001(String value) {
        this.rserv001 = value;
    }

    /**
     * Gets the value of the ctype002 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTYPE002() {
        return ctype002;
    }

    /**
     * Sets the value of the ctype002 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTYPE002(String value) {
        this.ctype002 = value;
    }

    /**
     * Gets the value of the waers002 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAERS002() {
        return waers002;
    }

    /**
     * Sets the value of the waers002 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAERS002(String value) {
        this.waers002 = value;
    }

    /**
     * Gets the value of the budgt002 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUDGT002() {
        return budgt002;
    }

    /**
     * Sets the value of the budgt002 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUDGT002(String value) {
        this.budgt002 = value;
    }

    /**
     * Gets the value of the abart002 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABART002() {
        return abart002;
    }

    /**
     * Sets the value of the abart002 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABART002(String value) {
        this.abart002 = value;
    }

    /**
     * Gets the value of the dirct002 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIRCT002() {
        return dirct002;
    }

    /**
     * Sets the value of the dirct002 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIRCT002(String value) {
        this.dirct002 = value;
    }

    /**
     * Gets the value of the rserv002 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSERV002() {
        return rserv002;
    }

    /**
     * Sets the value of the rserv002 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSERV002(String value) {
        this.rserv002 = value;
    }

    /**
     * Gets the value of the ctype003 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTYPE003() {
        return ctype003;
    }

    /**
     * Sets the value of the ctype003 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTYPE003(String value) {
        this.ctype003 = value;
    }

    /**
     * Gets the value of the waers003 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAERS003() {
        return waers003;
    }

    /**
     * Sets the value of the waers003 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAERS003(String value) {
        this.waers003 = value;
    }

    /**
     * Gets the value of the budgt003 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUDGT003() {
        return budgt003;
    }

    /**
     * Sets the value of the budgt003 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUDGT003(String value) {
        this.budgt003 = value;
    }

    /**
     * Gets the value of the abart003 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABART003() {
        return abart003;
    }

    /**
     * Sets the value of the abart003 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABART003(String value) {
        this.abart003 = value;
    }

    /**
     * Gets the value of the dirct003 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIRCT003() {
        return dirct003;
    }

    /**
     * Sets the value of the dirct003 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIRCT003(String value) {
        this.dirct003 = value;
    }

    /**
     * Gets the value of the rserv003 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSERV003() {
        return rserv003;
    }

    /**
     * Sets the value of the rserv003 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSERV003(String value) {
        this.rserv003 = value;
    }

    /**
     * Gets the value of the ctype004 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTYPE004() {
        return ctype004;
    }

    /**
     * Sets the value of the ctype004 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTYPE004(String value) {
        this.ctype004 = value;
    }

    /**
     * Gets the value of the waers004 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAERS004() {
        return waers004;
    }

    /**
     * Sets the value of the waers004 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAERS004(String value) {
        this.waers004 = value;
    }

    /**
     * Gets the value of the budgt004 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUDGT004() {
        return budgt004;
    }

    /**
     * Sets the value of the budgt004 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUDGT004(String value) {
        this.budgt004 = value;
    }

    /**
     * Gets the value of the abart004 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABART004() {
        return abart004;
    }

    /**
     * Sets the value of the abart004 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABART004(String value) {
        this.abart004 = value;
    }

    /**
     * Gets the value of the dirct004 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIRCT004() {
        return dirct004;
    }

    /**
     * Sets the value of the dirct004 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIRCT004(String value) {
        this.dirct004 = value;
    }

    /**
     * Gets the value of the rserv004 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSERV004() {
        return rserv004;
    }

    /**
     * Sets the value of the rserv004 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSERV004(String value) {
        this.rserv004 = value;
    }

    /**
     * Gets the value of the ctype005 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTYPE005() {
        return ctype005;
    }

    /**
     * Sets the value of the ctype005 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTYPE005(String value) {
        this.ctype005 = value;
    }

    /**
     * Gets the value of the waers005 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAERS005() {
        return waers005;
    }

    /**
     * Sets the value of the waers005 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAERS005(String value) {
        this.waers005 = value;
    }

    /**
     * Gets the value of the budgt005 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUDGT005() {
        return budgt005;
    }

    /**
     * Sets the value of the budgt005 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUDGT005(String value) {
        this.budgt005 = value;
    }

    /**
     * Gets the value of the abart005 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABART005() {
        return abart005;
    }

    /**
     * Sets the value of the abart005 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABART005(String value) {
        this.abart005 = value;
    }

    /**
     * Gets the value of the dirct005 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIRCT005() {
        return dirct005;
    }

    /**
     * Sets the value of the dirct005 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIRCT005(String value) {
        this.dirct005 = value;
    }

    /**
     * Gets the value of the rserv005 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSERV005() {
        return rserv005;
    }

    /**
     * Sets the value of the rserv005 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSERV005(String value) {
        this.rserv005 = value;
    }

    /**
     * Gets the value of the ctype006 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTYPE006() {
        return ctype006;
    }

    /**
     * Sets the value of the ctype006 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTYPE006(String value) {
        this.ctype006 = value;
    }

    /**
     * Gets the value of the waers006 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAERS006() {
        return waers006;
    }

    /**
     * Sets the value of the waers006 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAERS006(String value) {
        this.waers006 = value;
    }

    /**
     * Gets the value of the budgt006 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUDGT006() {
        return budgt006;
    }

    /**
     * Sets the value of the budgt006 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUDGT006(String value) {
        this.budgt006 = value;
    }

    /**
     * Gets the value of the abart006 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABART006() {
        return abart006;
    }

    /**
     * Sets the value of the abart006 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABART006(String value) {
        this.abart006 = value;
    }

    /**
     * Gets the value of the dirct006 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIRCT006() {
        return dirct006;
    }

    /**
     * Sets the value of the dirct006 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIRCT006(String value) {
        this.dirct006 = value;
    }

    /**
     * Gets the value of the rserv006 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSERV006() {
        return rserv006;
    }

    /**
     * Sets the value of the rserv006 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSERV006(String value) {
        this.rserv006 = value;
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
