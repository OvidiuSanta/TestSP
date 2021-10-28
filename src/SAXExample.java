import org.xml.sax.*;
import org.xml.sax.helpers.XMLReaderFactory;
import java.io.IOException;


public class SAXExample {

    public static void main(String[] args) throws IOException {
        String path="D:\\Facultate\\1cursuri\\TW\\lab3.xml";
        try {
            XMLReader parser = XMLReaderFactory.createXMLReader();
            ContentHandler handler = new TextExtractor();
            parser.setContentHandler(handler);

            parser.parse(path);
            System.out.println(path + " is well-formed.");
        }
        catch (SAXException e) {
            System.out.println(path + " is not well-formed.");
        }
    }

}