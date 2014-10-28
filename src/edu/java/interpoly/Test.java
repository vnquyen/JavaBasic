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
        
        Truck truck = new Truck();
        truck.run();
        truck.stop();
        
        Storable storable2 = (Storable) truck;
        storable2.store();

        Serializable serializable2 = (Serializable) truck;
        serializable2.serializeToXML (new FileWriter("truck.xml"));
        serializable2.serializeToJSON(new FileWriter("truck.json"));
    }
}
