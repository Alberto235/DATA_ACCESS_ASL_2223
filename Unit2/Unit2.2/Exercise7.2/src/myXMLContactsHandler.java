import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.util.ArrayList;
import java.util.List;
public class myXMLContactsHandler extends DefaultHandler {
    boolean isName = false;
    boolean isSurname = false;
    boolean isCell = false;
    boolean isWork = false;
    boolean isHome = false;
    protected String currentTag;
    protected String finishTag;
    protected String tagContent;

    private List<Contact> tane = null;
    private Contact stud = null;
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws  SAXException{
        currentTag = qName;
        if (currentTag.equals("contact")) {
                        stud = new Contact();

                        if (tane == null){
                            tane = new ArrayList<>();
                        }
        }else if (currentTag.equals("name")){
            isName = true;
        }else if (currentTag.equals("surname")){
            isSurname = true;

        }else if(currentTag.equals("cell")){
            isCell = true;
        }else if (currentTag.equals("work")){
            isWork = true;
        } else if (currentTag.equals("home")) {
            isHome = true;

        }
    }

    public void characters( char ch[], int start, int length)throws SAXException{
        tagContent = new String( ch, start, length );

        if (isName) {
             stud.setName(tagContent);
            isName = false;
        } else if (isSurname) {
            stud.setSurname(tagContent);
            isSurname = false;
        } else if (isCell) {
            stud.setCell(tagContent);
            isCell = false;
        } else if (isWork) {
            stud.setWork(tagContent);
            isWork = false;
        } else if (isHome) {
            stud.setHome(tagContent);
            isHome = false;
        }
    }

    public void endElement(String uri, String localName, String qName)throws SAXException{
        finishTag = qName;
        if (finishTag.equals("contact")){
            tane.add(stud);
        }
        }
        public List<Contact> getStudList(){
        return tane;
        }
    }

