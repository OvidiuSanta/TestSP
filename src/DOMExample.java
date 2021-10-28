import javax.xml.parsers.*;  // JAXP
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import java.io.IOException;


public class DOMExample {

    public static void main(String[] args) {
        String path="D:\\Facultate\\1cursuri\\TW\\lab3.xml";
        DOMExample iterator = new DOMExample();
        try {
            // Use JAXP to find a parser
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            // Turn on namespace support
            factory.setNamespaceAware(true);
            DocumentBuilder parser = factory.newDocumentBuilder();

            // Read the entire document into memory
            Node document = parser.parse(path);

            // Process it starting at the root
            iterator.followNode(document);

        }
        catch (SAXException e) {
            System.out.println(args[0] + " is not well-formed.");
            System.out.println(e.getMessage());
        }
        catch (IOException e) {
            System.out.println(e);
        }
        catch (ParserConfigurationException e) {
            System.out.println("Could not locate a JAXP parser");
        }

    }

    public void followNode(Node node) throws IOException {
        // Print information on node.
        System.out.println("Node name:" + node.getNodeName());
        System.out.println("Node type:" + node.getNodeType());
        System.out.println("Node local name:" + node.getLocalName());
        System.out.println("Node value:" + node.getNodeValue());

        // Process the children.
        NodeList children = node.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            Node child = children.item(i);
            // Recursion on child.
            followNode(child);
        }
    }
}