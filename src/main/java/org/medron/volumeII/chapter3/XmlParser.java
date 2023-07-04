package org.medron.volumeII.chapter3;

import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;


public class XmlParser {
    public static void main(String[] args) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();

        File file = new File("../../main/java/org/medron/volumeII/chapter3/asdasd");
        Document document = documentBuilder.parse(file);
        System.out.println(document.getDocumentElement().getPrefix());




    }
}
