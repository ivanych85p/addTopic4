package Note_2_topic_2.topic_4;

import javax.xml.stream.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Stax {
    public static void main(String[] args) {
        //Note 2, task 11, page 37......................................................................................
        System.out.println("Note 2, task 11, page 37");
        System.out.println();

        boolean isPoint = false;
        boolean isX = false;
        boolean isY = false;
        String unit = "";

        XMLInputFactory factory = XMLInputFactory.newFactory();
        try {
            XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream("D:\\Java\\src\\Note_2_topic_2\\dom_and_stax\\forparse.xml"));
            while (reader.hasNext()) {
                int res = reader.next();
                if (res == reader.START_ELEMENT) {
                    if (reader.getLocalName().equals("point")) {
                        unit = reader.getAttributeValue(0);
                        isPoint = true;
                    } else if (reader.getLocalName().equals("x")) {
                        isX = true;
                    } else if (reader.getLocalName().equals("y")) {
                        isY = true;
                    }
                } else if (res == reader.CHARACTERS) {
                    if (isPoint) {
                        System.out.print("point: ");
                        isPoint = false;
                    } else if (isX) {
                        System.out.print(reader.getText() + unit + ", ");
                        isX = false;
                    } else if (isY) {
                        System.out.println(reader.getText() + unit);
                        isY = false;
                    }
                }
            }

        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
