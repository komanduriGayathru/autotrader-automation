package com.autotrader.uitests.framework;

import java.io.*;
import java.util.Properties;

public class ReadProperties {

    private Properties properties;
    private final String propertyFilePath= "configs//config.properties";


    public ReadProperties(){
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }

    public String getBrowser(){
        return properties.getProperty("BROWSER");
    }
}
