package Note_2_topic_2.topic_4;

import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Dom {
    public static void main(String[] args) {
        //Note 2, task 10, page 36.......................................................................................
        System.out.println("Note 2, task 10, page 36");
        System.out.println();
        try {
            File inputFile = new File("D:\\Java\\src\\Note_2_topic_2\\topic_4\\forparsing.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("point");
            System.out.println("-----------------------");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.print(nNode.getNodeName() + ": ");

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.print(eElement.getElementsByTagName("x").item(0).getTextContent() + eElement.getAttribute("unit") + ", ");
                    System.out.println(eElement.getElementsByTagName("y").item(0).getTextContent() + eElement.getAttribute("unit"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
