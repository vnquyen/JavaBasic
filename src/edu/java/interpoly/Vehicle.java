package edu.java.interpoly;

public abstract class Vehicle implements Storable, Serializable {
    protected abstract void run();
    protected abstract void stop();
}
