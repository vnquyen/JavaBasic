package edu.java.interabstract;

import java.io.IOException;
import java.net.*;

public class URLProcessorTest {

    public static void main(String[] args) {
        URLProcessor urlProcessor = new URLProcessorImpl();

        try {
            urlProcessor.process(new URL("http://jenkov.com"));
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            //e.printStackTrace();
            System.out.println(1);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            //e.printStackTrace();
            System.out.println(2);
        }
    }

}
