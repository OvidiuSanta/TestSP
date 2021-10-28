import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class DOMCreatorExample {

    public static void main(String[] av) throws IOException {
        DOMCreatorExample dc = new DOMCreatorExample();
        Document doc = dc.makeXML();
    }

    public Document makeXML() {
        try {
            DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
            DocumentBuilder parser = fact.newDocumentBuilder();
            Document doc = parser.newDocument();

            Node root = doc.createElement("books");
            doc.appendChild(root);

            Node book = doc.createElement("book");
            ((Element) book).setAttribute("title", "Processing XML with Java");
            ((Element) book).setAttribute("author", "Elliotte Rusty Harold");
            book.appendChild(doc.createTextNode("A complete tutorial about writing Java programs that read and write XML documents."));
            root.appendChild(book);

            return doc;

        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}