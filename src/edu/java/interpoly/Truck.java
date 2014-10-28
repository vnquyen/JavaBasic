package edu.java.interpoly;

import java.io.*;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class Truck extends Vehicle {

    @Override
    public void store() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void serializeToXML(Writer writer) {
        // create an XMLOutputFactory
        XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
        
        // create XMLEventWriter
        try {
            XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(writer);
            
            // create an EventFactory
            XMLEventFactory eventFactory = XMLEventFactory.newInstance();
            XMLEvent end = eventFactory.createDTD("\n");
            
            // create and write Start Tag
            StartDocument startDocument = eventFactory.createStartDocument();
            eventWriter.add(startDocument);
            
            // create config open tag
            eventWriter.add(end);
            StartElement configStartElement = eventFactory.createStartElement("", "", "config");
            eventWriter.add(configStartElement);    
            eventWriter.add(eventFactory.createAttribute("version", "2.0"));
            eventWriter.add(end);

            // Write the different nodes
            createNode(eventWriter, "mode", "1");
            createNode(eventWriter, "unit", "901");
            createNode(eventWriter, "current", "0");
            createNode(eventWriter, "interactive", "0");

            eventWriter.add(eventFactory.createEndElement("", "", "config"));
            eventWriter.add(end);
            eventWriter.add(eventFactory.createEndDocument());
            eventWriter.close();
            
            System.out.println("File (Truck) saved!");
        } catch (XMLStreamException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    private void createNode(XMLEventWriter eventWriter, String name, String value) throws XMLStreamException {
        XMLEventFactory eventFactory = XMLEventFactory.newInstance();
        XMLEvent end = eventFactory.createDTD("\n");
        XMLEvent tab = eventFactory.createDTD("\t");
       
        // create Start node
        StartElement sElement = eventFactory.createStartElement("", "", name);
        eventWriter.add(tab);
        eventWriter.add(sElement);
        
        // create Content
        Characters characters = eventFactory.createCharacters(value);
        eventWriter.add(characters);
       
        // create End node
        EndElement eElement = eventFactory.createEndElement("", "", name);
        eventWriter.add(eElement);
        eventWriter.add(end);
    }

    @Override
    public void serializeToJSON(Writer writer) {
        // TODO Auto-generated method stub
        
    }

    @Override
    protected void run() {
        System.out.println("Truck runs!");
        
    }

    @Override
    protected void stop() {
        System.out.println("Truck stops!");
        
    }

}
