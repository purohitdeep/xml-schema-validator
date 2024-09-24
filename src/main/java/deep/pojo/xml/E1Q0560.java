
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
 *         &lt;element name="ANH08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIH08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPE08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGR09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BER09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANH09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIH09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPE09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGR10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BER10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ANH10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EIH10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPE10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND17" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND18" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND19" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IND20" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INB01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INB02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INB03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INB04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INB05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INB06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INB07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INB08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INB09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INB10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PYCLS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
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
    "anh08",
    "eih08",
    "ope08",
    "lgr09",
    "ber09",
    "anh09",
    "eih09",
    "ope09",
    "lgr10",
    "ber10",
    "anh10",
    "eih10",
    "ope10",
    "ind01",
    "ind02",
    "ind03",
    "ind04",
    "ind05",
    "ind06",
    "ind07",
    "ind08",
    "ind09",
    "ind10",
    "ind11",
    "ind12",
    "ind13",
    "ind14",
    "ind15",
    "ind16",
    "ind17",
    "ind18",
    "ind19",
    "ind20",
    "inb01",
    "inb02",
    "inb03",
    "inb04",
    "inb05",
    "inb06",
    "inb07",
    "inb08",
    "inb09",
    "inb10",
    "pycls"
})
public class E1Q0560 {

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
    @XmlElement(name = "ANH08")
    protected String anh08;
    @XmlElement(name = "EIH08")
    protected String eih08;
    @XmlElement(name = "OPE08")
    protected String ope08;
    @XmlElement(name = "LGR09")
    protected String lgr09;
    @XmlElement(name = "BER09")
    protected String ber09;
    @XmlElement(name = "ANH09")
    protected String anh09;
    @XmlElement(name = "EIH09")
    protected String eih09;
    @XmlElement(name = "OPE09")
    protected String ope09;
    @XmlElement(name = "LGR10")
    protected String lgr10;
    @XmlElement(name = "BER10")
    protected String ber10;
    @XmlElement(name = "ANH10")
    protected String anh10;
    @XmlElement(name = "EIH10")
    protected String eih10;
    @XmlElement(name = "OPE10")
    protected String ope10;
    @XmlElement(name = "IND01")
    protected String ind01;
    @XmlElement(name = "IND02")
    protected String ind02;
    @XmlElement(name = "IND03")
    protected String ind03;
    @XmlElement(name = "IND04")
    protected String ind04;
    @XmlElement(name = "IND05")
    protected String ind05;
    @XmlElement(name = "IND06")
    protected String ind06;
    @XmlElement(name = "IND07")
    protected String ind07;
    @XmlElement(name = "IND08")
    protected String ind08;
    @XmlElement(name = "IND09")
    protected String ind09;
    @XmlElement(name = "IND10")
    protected String ind10;
    @XmlElement(name = "IND11")
    protected String ind11;
    @XmlElement(name = "IND12")
    protected String ind12;
    @XmlElement(name = "IND13")
    protected String ind13;
    @XmlElement(name = "IND14")
    protected String ind14;
    @XmlElement(name = "IND15")
    protected String ind15;
    @XmlElement(name = "IND16")
    protected String ind16;
    @XmlElement(name = "IND17")
    protected String ind17;
    @XmlElement(name = "IND18")
    protected String ind18;
    @XmlElement(name = "IND19")
    protected String ind19;
    @XmlElement(name = "IND20")
    protected String ind20;
    @XmlElement(name = "INB01")
    protected String inb01;
    @XmlElement(name = "INB02")
    protected String inb02;
    @XmlElement(name = "INB03")
    protected String inb03;
    @XmlElement(name = "INB04")
    protected String inb04;
    @XmlElement(name = "INB05")
    protected String inb05;
    @XmlElement(name = "INB06")
    protected String inb06;
    @XmlElement(name = "INB07")
    protected String inb07;
    @XmlElement(name = "INB08")
    protected String inb08;
    @XmlElement(name = "INB09")
    protected String inb09;
    @XmlElement(name = "INB10")
    protected String inb10;
    @XmlElement(name = "PYCLS")
    protected String pycls;
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
     * Gets the value of the anh08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANH08() {
        return anh08;
    }

    /**
     * Sets the value of the anh08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANH08(String value) {
        this.anh08 = value;
    }

    /**
     * Gets the value of the eih08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIH08() {
        return eih08;
    }

    /**
     * Sets the value of the eih08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIH08(String value) {
        this.eih08 = value;
    }

    /**
     * Gets the value of the ope08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPE08() {
        return ope08;
    }

    /**
     * Sets the value of the ope08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPE08(String value) {
        this.ope08 = value;
    }

    /**
     * Gets the value of the lgr09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGR09() {
        return lgr09;
    }

    /**
     * Sets the value of the lgr09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGR09(String value) {
        this.lgr09 = value;
    }

    /**
     * Gets the value of the ber09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBER09() {
        return ber09;
    }

    /**
     * Sets the value of the ber09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBER09(String value) {
        this.ber09 = value;
    }

    /**
     * Gets the value of the anh09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANH09() {
        return anh09;
    }

    /**
     * Sets the value of the anh09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANH09(String value) {
        this.anh09 = value;
    }

    /**
     * Gets the value of the eih09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIH09() {
        return eih09;
    }

    /**
     * Sets the value of the eih09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIH09(String value) {
        this.eih09 = value;
    }

    /**
     * Gets the value of the ope09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPE09() {
        return ope09;
    }

    /**
     * Sets the value of the ope09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPE09(String value) {
        this.ope09 = value;
    }

    /**
     * Gets the value of the lgr10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGR10() {
        return lgr10;
    }

    /**
     * Sets the value of the lgr10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGR10(String value) {
        this.lgr10 = value;
    }

    /**
     * Gets the value of the ber10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBER10() {
        return ber10;
    }

    /**
     * Sets the value of the ber10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBER10(String value) {
        this.ber10 = value;
    }

    /**
     * Gets the value of the anh10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANH10() {
        return anh10;
    }

    /**
     * Sets the value of the anh10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANH10(String value) {
        this.anh10 = value;
    }

    /**
     * Gets the value of the eih10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIH10() {
        return eih10;
    }

    /**
     * Sets the value of the eih10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIH10(String value) {
        this.eih10 = value;
    }

    /**
     * Gets the value of the ope10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPE10() {
        return ope10;
    }

    /**
     * Sets the value of the ope10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPE10(String value) {
        this.ope10 = value;
    }

    /**
     * Gets the value of the ind01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND01() {
        return ind01;
    }

    /**
     * Sets the value of the ind01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND01(String value) {
        this.ind01 = value;
    }

    /**
     * Gets the value of the ind02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND02() {
        return ind02;
    }

    /**
     * Sets the value of the ind02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND02(String value) {
        this.ind02 = value;
    }

    /**
     * Gets the value of the ind03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND03() {
        return ind03;
    }

    /**
     * Sets the value of the ind03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND03(String value) {
        this.ind03 = value;
    }

    /**
     * Gets the value of the ind04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND04() {
        return ind04;
    }

    /**
     * Sets the value of the ind04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND04(String value) {
        this.ind04 = value;
    }

    /**
     * Gets the value of the ind05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND05() {
        return ind05;
    }

    /**
     * Sets the value of the ind05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND05(String value) {
        this.ind05 = value;
    }

    /**
     * Gets the value of the ind06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND06() {
        return ind06;
    }

    /**
     * Sets the value of the ind06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND06(String value) {
        this.ind06 = value;
    }

    /**
     * Gets the value of the ind07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND07() {
        return ind07;
    }

    /**
     * Sets the value of the ind07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND07(String value) {
        this.ind07 = value;
    }

    /**
     * Gets the value of the ind08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND08() {
        return ind08;
    }

    /**
     * Sets the value of the ind08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND08(String value) {
        this.ind08 = value;
    }

    /**
     * Gets the value of the ind09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND09() {
        return ind09;
    }

    /**
     * Sets the value of the ind09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND09(String value) {
        this.ind09 = value;
    }

    /**
     * Gets the value of the ind10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND10() {
        return ind10;
    }

    /**
     * Sets the value of the ind10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND10(String value) {
        this.ind10 = value;
    }

    /**
     * Gets the value of the ind11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND11() {
        return ind11;
    }

    /**
     * Sets the value of the ind11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND11(String value) {
        this.ind11 = value;
    }

    /**
     * Gets the value of the ind12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND12() {
        return ind12;
    }

    /**
     * Sets the value of the ind12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND12(String value) {
        this.ind12 = value;
    }

    /**
     * Gets the value of the ind13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND13() {
        return ind13;
    }

    /**
     * Sets the value of the ind13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND13(String value) {
        this.ind13 = value;
    }

    /**
     * Gets the value of the ind14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND14() {
        return ind14;
    }

    /**
     * Sets the value of the ind14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND14(String value) {
        this.ind14 = value;
    }

    /**
     * Gets the value of the ind15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND15() {
        return ind15;
    }

    /**
     * Sets the value of the ind15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND15(String value) {
        this.ind15 = value;
    }

    /**
     * Gets the value of the ind16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND16() {
        return ind16;
    }

    /**
     * Sets the value of the ind16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND16(String value) {
        this.ind16 = value;
    }

    /**
     * Gets the value of the ind17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND17() {
        return ind17;
    }

    /**
     * Sets the value of the ind17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND17(String value) {
        this.ind17 = value;
    }

    /**
     * Gets the value of the ind18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND18() {
        return ind18;
    }

    /**
     * Sets the value of the ind18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND18(String value) {
        this.ind18 = value;
    }

    /**
     * Gets the value of the ind19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND19() {
        return ind19;
    }

    /**
     * Sets the value of the ind19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND19(String value) {
        this.ind19 = value;
    }

    /**
     * Gets the value of the ind20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIND20() {
        return ind20;
    }

    /**
     * Sets the value of the ind20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIND20(String value) {
        this.ind20 = value;
    }

    /**
     * Gets the value of the inb01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINB01() {
        return inb01;
    }

    /**
     * Sets the value of the inb01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINB01(String value) {
        this.inb01 = value;
    }

    /**
     * Gets the value of the inb02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINB02() {
        return inb02;
    }

    /**
     * Sets the value of the inb02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINB02(String value) {
        this.inb02 = value;
    }

    /**
     * Gets the value of the inb03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINB03() {
        return inb03;
    }

    /**
     * Sets the value of the inb03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINB03(String value) {
        this.inb03 = value;
    }

    /**
     * Gets the value of the inb04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINB04() {
        return inb04;
    }

    /**
     * Sets the value of the inb04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINB04(String value) {
        this.inb04 = value;
    }

    /**
     * Gets the value of the inb05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINB05() {
        return inb05;
    }

    /**
     * Sets the value of the inb05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINB05(String value) {
        this.inb05 = value;
    }

    /**
     * Gets the value of the inb06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINB06() {
        return inb06;
    }

    /**
     * Sets the value of the inb06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINB06(String value) {
        this.inb06 = value;
    }

    /**
     * Gets the value of the inb07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINB07() {
        return inb07;
    }

    /**
     * Sets the value of the inb07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINB07(String value) {
        this.inb07 = value;
    }

    /**
     * Gets the value of the inb08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINB08() {
        return inb08;
    }

    /**
     * Sets the value of the inb08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINB08(String value) {
        this.inb08 = value;
    }

    /**
     * Gets the value of the inb09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINB09() {
        return inb09;
    }

    /**
     * Sets the value of the inb09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINB09(String value) {
        this.inb09 = value;
    }

    /**
     * Gets the value of the inb10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINB10() {
        return inb10;
    }

    /**
     * Sets the value of the inb10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINB10(String value) {
        this.inb10 = value;
    }

    /**
     * Gets the value of the pycls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPYCLS() {
        return pycls;
    }

    /**
     * Sets the value of the pycls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPYCLS(String value) {
        this.pycls = value;
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
