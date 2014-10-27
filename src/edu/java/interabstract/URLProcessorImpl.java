package edu.java.interabstract;

import java.io.*;

public class URLProcessorImpl extends URLProcessorBase {
    @Override
    protected void processURLData(InputStream input) throws IOException {
        int data = input.read();
        while(data != -1){
            System.out.println(3);
            //System.out.println((char) data);
            data = input.read();
        }
    }
    
}
