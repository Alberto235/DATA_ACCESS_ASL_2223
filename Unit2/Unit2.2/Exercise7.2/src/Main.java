import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {







        try { File inputFile = new File("C:/Users/URJC/Desktop/contacts.xml");
            SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
            SAXParser saxParser = saxParserFactory.newSAXParser();
            myXMLContactsHandler xml = new myXMLContactsHandler();
            saxParser.parse(inputFile, xml);
            List<Contact> tane = xml.getStudList();
            for (Contact stud : tane){
                System.out.println(stud);
            }
        } catch ( Exception e ) { e.printStackTrace();

        }
    }
}