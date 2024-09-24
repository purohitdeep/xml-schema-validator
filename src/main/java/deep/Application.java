package deep;

import javax.xml.bind.JAXBException;

public class Application {

    public static void main(String[] args) {
        System.setProperty("jdk.xml.maxOccurLimit", "999999");
        Application app = new Application();
        boolean isSuccess = app.doValidate("./src/main/resources/schemas/schema.xsd", "./src/main/resources/gv.xml");
        System.out.println(isSuccess);
        app.readXml("./src/main/resources/gv.xml");
    }

    private boolean doValidate(String xsdPath, String xmlPath) {
        XmlLogic validate = new XmlLogic();
        return validate.validateXMLSchema(xsdPath, xmlPath);
    }

    private void readXml(String xmlPath){
        XmlLogic xmlLogic = new XmlLogic();
        xmlLogic.readXml(xmlPath);
    }

}
