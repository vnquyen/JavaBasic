package edu.java.interabstract;

import java.net.*;
import java.io.*;

public abstract class URLProcessorBase implements URLProcessor {
    public void process(URL url) throws IOException {
        URLConnection urlConnection = url.openConnection();
        InputStream input = urlConnection.getInputStream();

        try{
            processURLData(input);
        } finally {
            input.close();
        }
    }

    protected abstract void processURLData(InputStream input)
        throws IOException;
}
