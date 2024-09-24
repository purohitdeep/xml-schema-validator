
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
 *         &lt;element name="FKBER05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GRANT05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FKBER06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GRANT06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FKBER07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GRANT07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FKBER08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GRANT08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FKBER09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GRANT09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FKBER10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GRANT10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FKBER11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GRANT11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FKBER12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GRANT12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FCT09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FCD09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FCT10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FCD10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FCT11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FCD11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FCT12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FCD12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
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
 *         &lt;element name="SGM01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SGM02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SGM03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SGM04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SGM05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SGM06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SGM07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SGM08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SGM09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SGM10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SGM11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SGM12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BUDGET_PD01" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BUDGET_PD02" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BUDGET_PD03" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BUDGET_PD04" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BUDGET_PD05" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BUDGET_PD06" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BUDGET_PD07" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BUDGET_PD08" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BUDGET_PD09" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BUDGET_PD10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BUDGET_PD11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BUDGET_PD12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
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
    "fkber05",
    "grant05",
    "fkber06",
    "grant06",
    "fkber07",
    "grant07",
    "fkber08",
    "grant08",
    "fkber09",
    "grant09",
    "fkber10",
    "grant10",
    "fkber11",
    "grant11",
    "fkber12",
    "grant12",
    "fct09",
    "fcd09",
    "fct10",
    "fcd10",
    "fct11",
    "fcd11",
    "fct12",
    "fcd12",
    "grpvl",
    "sgm01",
    "sgm02",
    "sgm03",
    "sgm04",
    "sgm05",
    "sgm06",
    "sgm07",
    "sgm08",
    "sgm09",
    "sgm10",
    "sgm11",
    "sgm12",
    "budgetpd01",
    "budgetpd02",
    "budgetpd03",
    "budgetpd04",
    "budgetpd05",
    "budgetpd06",
    "budgetpd07",
    "budgetpd08",
    "budgetpd09",
    "budgetpd10",
    "budgetpd11",
    "budgetpd12"
})
public class E1R0027 {

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
    @XmlElement(name = "FKBER05")
    protected String fkber05;
    @XmlElement(name = "GRANT05")
    protected String grant05;
    @XmlElement(name = "FKBER06")
    protected String fkber06;
    @XmlElement(name = "GRANT06")
    protected String grant06;
    @XmlElement(name = "FKBER07")
    protected String fkber07;
    @XmlElement(name = "GRANT07")
    protected String grant07;
    @XmlElement(name = "FKBER08")
    protected String fkber08;
    @XmlElement(name = "GRANT08")
    protected String grant08;
    @XmlElement(name = "FKBER09")
    protected String fkber09;
    @XmlElement(name = "GRANT09")
    protected String grant09;
    @XmlElement(name = "FKBER10")
    protected String fkber10;
    @XmlElement(name = "GRANT10")
    protected String grant10;
    @XmlElement(name = "FKBER11")
    protected String fkber11;
    @XmlElement(name = "GRANT11")
    protected String grant11;
    @XmlElement(name = "FKBER12")
    protected String fkber12;
    @XmlElement(name = "GRANT12")
    protected String grant12;
    @XmlElement(name = "FCT09")
    protected String fct09;
    @XmlElement(name = "FCD09")
    protected String fcd09;
    @XmlElement(name = "FCT10")
    protected String fct10;
    @XmlElement(name = "FCD10")
    protected String fcd10;
    @XmlElement(name = "FCT11")
    protected String fct11;
    @XmlElement(name = "FCD11")
    protected String fcd11;
    @XmlElement(name = "FCT12")
    protected String fct12;
    @XmlElement(name = "FCD12")
    protected String fcd12;
    @XmlElement(name = "GRPVL")
    protected String grpvl;
    @XmlElement(name = "SGM01")
    protected String sgm01;
    @XmlElement(name = "SGM02")
    protected String sgm02;
    @XmlElement(name = "SGM03")
    protected String sgm03;
    @XmlElement(name = "SGM04")
    protected String sgm04;
    @XmlElement(name = "SGM05")
    protected String sgm05;
    @XmlElement(name = "SGM06")
    protected String sgm06;
    @XmlElement(name = "SGM07")
    protected String sgm07;
    @XmlElement(name = "SGM08")
    protected String sgm08;
    @XmlElement(name = "SGM09")
    protected String sgm09;
    @XmlElement(name = "SGM10")
    protected String sgm10;
    @XmlElement(name = "SGM11")
    protected String sgm11;
    @XmlElement(name = "SGM12")
    protected String sgm12;
    @XmlElement(name = "BUDGET_PD01")
    protected String budgetpd01;
    @XmlElement(name = "BUDGET_PD02")
    protected String budgetpd02;
    @XmlElement(name = "BUDGET_PD03")
    protected String budgetpd03;
    @XmlElement(name = "BUDGET_PD04")
    protected String budgetpd04;
    @XmlElement(name = "BUDGET_PD05")
    protected String budgetpd05;
    @XmlElement(name = "BUDGET_PD06")
    protected String budgetpd06;
    @XmlElement(name = "BUDGET_PD07")
    protected String budgetpd07;
    @XmlElement(name = "BUDGET_PD08")
    protected String budgetpd08;
    @XmlElement(name = "BUDGET_PD09")
    protected String budgetpd09;
    @XmlElement(name = "BUDGET_PD10")
    protected String budgetpd10;
    @XmlElement(name = "BUDGET_PD11")
    protected String budgetpd11;
    @XmlElement(name = "BUDGET_PD12")
    protected String budgetpd12;
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
     * Gets the value of the fkber05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFKBER05() {
        return fkber05;
    }

    /**
     * Sets the value of the fkber05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFKBER05(String value) {
        this.fkber05 = value;
    }

    /**
     * Gets the value of the grant05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRANT05() {
        return grant05;
    }

    /**
     * Sets the value of the grant05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRANT05(String value) {
        this.grant05 = value;
    }

    /**
     * Gets the value of the fkber06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFKBER06() {
        return fkber06;
    }

    /**
     * Sets the value of the fkber06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFKBER06(String value) {
        this.fkber06 = value;
    }

    /**
     * Gets the value of the grant06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRANT06() {
        return grant06;
    }

    /**
     * Sets the value of the grant06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRANT06(String value) {
        this.grant06 = value;
    }

    /**
     * Gets the value of the fkber07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFKBER07() {
        return fkber07;
    }

    /**
     * Sets the value of the fkber07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFKBER07(String value) {
        this.fkber07 = value;
    }

    /**
     * Gets the value of the grant07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRANT07() {
        return grant07;
    }

    /**
     * Sets the value of the grant07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRANT07(String value) {
        this.grant07 = value;
    }

    /**
     * Gets the value of the fkber08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFKBER08() {
        return fkber08;
    }

    /**
     * Sets the value of the fkber08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFKBER08(String value) {
        this.fkber08 = value;
    }

    /**
     * Gets the value of the grant08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRANT08() {
        return grant08;
    }

    /**
     * Sets the value of the grant08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRANT08(String value) {
        this.grant08 = value;
    }

    /**
     * Gets the value of the fkber09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFKBER09() {
        return fkber09;
    }

    /**
     * Sets the value of the fkber09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFKBER09(String value) {
        this.fkber09 = value;
    }

    /**
     * Gets the value of the grant09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRANT09() {
        return grant09;
    }

    /**
     * Sets the value of the grant09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRANT09(String value) {
        this.grant09 = value;
    }

    /**
     * Gets the value of the fkber10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFKBER10() {
        return fkber10;
    }

    /**
     * Sets the value of the fkber10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFKBER10(String value) {
        this.fkber10 = value;
    }

    /**
     * Gets the value of the grant10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRANT10() {
        return grant10;
    }

    /**
     * Sets the value of the grant10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRANT10(String value) {
        this.grant10 = value;
    }

    /**
     * Gets the value of the fkber11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFKBER11() {
        return fkber11;
    }

    /**
     * Sets the value of the fkber11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFKBER11(String value) {
        this.fkber11 = value;
    }

    /**
     * Gets the value of the grant11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRANT11() {
        return grant11;
    }

    /**
     * Sets the value of the grant11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRANT11(String value) {
        this.grant11 = value;
    }

    /**
     * Gets the value of the fkber12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFKBER12() {
        return fkber12;
    }

    /**
     * Sets the value of the fkber12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFKBER12(String value) {
        this.fkber12 = value;
    }

    /**
     * Gets the value of the grant12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRANT12() {
        return grant12;
    }

    /**
     * Sets the value of the grant12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRANT12(String value) {
        this.grant12 = value;
    }

    /**
     * Gets the value of the fct09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCT09() {
        return fct09;
    }

    /**
     * Sets the value of the fct09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCT09(String value) {
        this.fct09 = value;
    }

    /**
     * Gets the value of the fcd09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCD09() {
        return fcd09;
    }

    /**
     * Sets the value of the fcd09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCD09(String value) {
        this.fcd09 = value;
    }

    /**
     * Gets the value of the fct10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCT10() {
        return fct10;
    }

    /**
     * Sets the value of the fct10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCT10(String value) {
        this.fct10 = value;
    }

    /**
     * Gets the value of the fcd10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCD10() {
        return fcd10;
    }

    /**
     * Sets the value of the fcd10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCD10(String value) {
        this.fcd10 = value;
    }

    /**
     * Gets the value of the fct11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCT11() {
        return fct11;
    }

    /**
     * Sets the value of the fct11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCT11(String value) {
        this.fct11 = value;
    }

    /**
     * Gets the value of the fcd11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCD11() {
        return fcd11;
    }

    /**
     * Sets the value of the fcd11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCD11(String value) {
        this.fcd11 = value;
    }

    /**
     * Gets the value of the fct12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCT12() {
        return fct12;
    }

    /**
     * Sets the value of the fct12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCT12(String value) {
        this.fct12 = value;
    }

    /**
     * Gets the value of the fcd12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCD12() {
        return fcd12;
    }

    /**
     * Sets the value of the fcd12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCD12(String value) {
        this.fcd12 = value;
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
     * Gets the value of the sgm01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSGM01() {
        return sgm01;
    }

    /**
     * Sets the value of the sgm01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSGM01(String value) {
        this.sgm01 = value;
    }

    /**
     * Gets the value of the sgm02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSGM02() {
        return sgm02;
    }

    /**
     * Sets the value of the sgm02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSGM02(String value) {
        this.sgm02 = value;
    }

    /**
     * Gets the value of the sgm03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSGM03() {
        return sgm03;
    }

    /**
     * Sets the value of the sgm03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSGM03(String value) {
        this.sgm03 = value;
    }

    /**
     * Gets the value of the sgm04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSGM04() {
        return sgm04;
    }

    /**
     * Sets the value of the sgm04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSGM04(String value) {
        this.sgm04 = value;
    }

    /**
     * Gets the value of the sgm05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSGM05() {
        return sgm05;
    }

    /**
     * Sets the value of the sgm05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSGM05(String value) {
        this.sgm05 = value;
    }

    /**
     * Gets the value of the sgm06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSGM06() {
        return sgm06;
    }

    /**
     * Sets the value of the sgm06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSGM06(String value) {
        this.sgm06 = value;
    }

    /**
     * Gets the value of the sgm07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSGM07() {
        return sgm07;
    }

    /**
     * Sets the value of the sgm07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSGM07(String value) {
        this.sgm07 = value;
    }

    /**
     * Gets the value of the sgm08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSGM08() {
        return sgm08;
    }

    /**
     * Sets the value of the sgm08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSGM08(String value) {
        this.sgm08 = value;
    }

    /**
     * Gets the value of the sgm09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSGM09() {
        return sgm09;
    }

    /**
     * Sets the value of the sgm09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSGM09(String value) {
        this.sgm09 = value;
    }

    /**
     * Gets the value of the sgm10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSGM10() {
        return sgm10;
    }

    /**
     * Sets the value of the sgm10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSGM10(String value) {
        this.sgm10 = value;
    }

    /**
     * Gets the value of the sgm11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSGM11() {
        return sgm11;
    }

    /**
     * Sets the value of the sgm11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSGM11(String value) {
        this.sgm11 = value;
    }

    /**
     * Gets the value of the sgm12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSGM12() {
        return sgm12;
    }

    /**
     * Sets the value of the sgm12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSGM12(String value) {
        this.sgm12 = value;
    }

    /**
     * Gets the value of the budgetpd01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUDGETPD01() {
        return budgetpd01;
    }

    /**
     * Sets the value of the budgetpd01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUDGETPD01(String value) {
        this.budgetpd01 = value;
    }

    /**
     * Gets the value of the budgetpd02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUDGETPD02() {
        return budgetpd02;
    }

    /**
     * Sets the value of the budgetpd02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUDGETPD02(String value) {
        this.budgetpd02 = value;
    }

    /**
     * Gets the value of the budgetpd03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUDGETPD03() {
        return budgetpd03;
    }

    /**
     * Sets the value of the budgetpd03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUDGETPD03(String value) {
        this.budgetpd03 = value;
    }

    /**
     * Gets the value of the budgetpd04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUDGETPD04() {
        return budgetpd04;
    }

    /**
     * Sets the value of the budgetpd04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUDGETPD04(String value) {
        this.budgetpd04 = value;
    }

    /**
     * Gets the value of the budgetpd05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUDGETPD05() {
        return budgetpd05;
    }

    /**
     * Sets the value of the budgetpd05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUDGETPD05(String value) {
        this.budgetpd05 = value;
    }

    /**
     * Gets the value of the budgetpd06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUDGETPD06() {
        return budgetpd06;
    }

    /**
     * Sets the value of the budgetpd06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUDGETPD06(String value) {
        this.budgetpd06 = value;
    }

    /**
     * Gets the value of the budgetpd07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUDGETPD07() {
        return budgetpd07;
    }

    /**
     * Sets the value of the budgetpd07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUDGETPD07(String value) {
        this.budgetpd07 = value;
    }

    /**
     * Gets the value of the budgetpd08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUDGETPD08() {
        return budgetpd08;
    }

    /**
     * Sets the value of the budgetpd08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUDGETPD08(String value) {
        this.budgetpd08 = value;
    }

    /**
     * Gets the value of the budgetpd09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUDGETPD09() {
        return budgetpd09;
    }

    /**
     * Sets the value of the budgetpd09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUDGETPD09(String value) {
        this.budgetpd09 = value;
    }

    /**
     * Gets the value of the budgetpd10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUDGETPD10() {
        return budgetpd10;
    }

    /**
     * Sets the value of the budgetpd10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUDGETPD10(String value) {
        this.budgetpd10 = value;
    }

    /**
     * Gets the value of the budgetpd11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUDGETPD11() {
        return budgetpd11;
    }

    /**
     * Sets the value of the budgetpd11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUDGETPD11(String value) {
        this.budgetpd11 = value;
    }

    /**
     * Gets the value of the budgetpd12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUDGETPD12() {
        return budgetpd12;
    }

    /**
     * Sets the value of the budgetpd12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUDGETPD12(String value) {
        this.budgetpd12 = value;
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
