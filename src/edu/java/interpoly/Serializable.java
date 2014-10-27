package edu.java.interpoly;

import java.io.*;

public interface Serializable {
    public void serializeToXML(Writer writer);
    public void serializeToJSON(Writer writer);
}
