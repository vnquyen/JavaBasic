package edu.java.interpoly;

import java.io.*;

public class Test {

    public static void main(String[] args) throws IOException {
        Car car = new Car();
        car.run();
        car.stop();
        
        Storable storable = (Storable) car;
        storable.store();

        Serializable serializable = (Serializable) car;
        serializable.serializeToXML (new FileWriter("car.xml"));
        serializable.serializeToJSON(new FileWriter("car.json"));
    }

}
