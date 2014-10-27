package edu.java.interpoly;

import java.io.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
 
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Car extends Vehicle {

    @Override
    public void run() {
        System.out.println("Car runs!");
    }

    @Override
    public void stop() {
        System.out.println("Car stops!");
    }

    @Override
    public void serializeToXML(Writer writer) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
     
            // root elements
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("company");
            doc.appendChild(rootElement);
     
            // staff elements
            Element staff = doc.createElement("Staff");
            rootElement.appendChild(staff);
     
            // set attribute to staff element
            Attr attr = doc.createAttribute("id");
            attr.setValue("1");
            staff.setAttributeNode(attr);
     
            // shorten way
            // staff.setAttribute("id", "1");
     
            // firstname elements
            Element firstname = doc.createElement("firstname");
            firstname.appendChild(doc.createTextNode("yong"));
            staff.appendChild(firstname);
     
            // lastname elements
            Element lastname = doc.createElement("lastname");
            lastname.appendChild(doc.createTextNode("mook kim"));
            staff.appendChild(lastname);
     
            // nickname elements
            Element nickname = doc.createElement("nickname");
            nickname.appendChild(doc.createTextNode("mkyong"));
            staff.appendChild(nickname);
     
            // salary elements
            Element salary = doc.createElement("salary");
            salary.appendChild(doc.createTextNode("100000"));
            staff.appendChild(salary);
            
         // staff elements
            Element staff2 = doc.createElement("Staff");
            rootElement.appendChild(staff2);
     
            // set attribute to staff element
            Attr attr2 = doc.createAttribute("id");
            attr2.setValue("2");
            staff2.setAttributeNode(attr2);
     
            // shorten way
            // staff.setAttribute("id", "1");
     
            // firstname elements
            Element firstname2 = doc.createElement("firstname");
            firstname2.appendChild(doc.createTextNode("quyen"));
            staff2.appendChild(firstname2);
     
            // lastname elements
            Element lastname2 = doc.createElement("lastname");
            lastname2.appendChild(doc.createTextNode("vuong"));
            staff2.appendChild(lastname2);
     
            // nickname elements
            Element nickname2 = doc.createElement("nickname");
            nickname2.appendChild(doc.createTextNode("vnquyen"));
            staff2.appendChild(nickname2);
     
            // salary elements
            Element salary2 = doc.createElement("salary");
            salary2.appendChild(doc.createTextNode("150000"));
            staff2.appendChild(salary2);
     
            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(writer);
     
            // Output to console for testing
            // StreamResult result = new StreamResult(System.out);
     
            transformer.transform(source, result);
     
            System.out.println("File saved!");
        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
          tfe.printStackTrace();
        }
        
    }

    @Override
    public void serializeToJSON(Writer writer) {
        JSONObject obj = new JSONObject();
        obj.put("name", "mkyong.com");
        obj.put("age", new Integer(100));
     
        JSONArray list = new JSONArray();
        list.add("msg 1");
        list.add("msg 2");
        list.add("msg 3");
     
        obj.put("messages", list);
        
        try {
            writer.write(obj.toJSONString());
            writer.flush();
            writer.close();
     
        } catch (IOException e) {
            e.printStackTrace();
        }
     
        System.out.print(obj);
    }

    @Override
    public void store() {
        // TODO Auto-generated method stub
        
    }

}
