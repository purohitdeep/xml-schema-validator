package deep;

import deep.xml.pojo.ZRMDA08;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class XmlLogic {

    public boolean validateXMLSchema(String xsdPath, String xmlPath) {
        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(xsdPath));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(xmlPath)));
        } catch (IOException | SAXException e) {
            System.out.println("Exception: " + e.getMessage());
            return false;
        }
        return true;
    }

    public void readXml(String xmlPath) {
        JAXBContext jaxbContext = null;
        try {
            jaxbContext = JAXBContext.newInstance(ZRMDA08.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            ZRMDA08 customer = (ZRMDA08) jaxbUnmarshaller.unmarshal(new File(xmlPath));
            System.out.println(customer);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

}
