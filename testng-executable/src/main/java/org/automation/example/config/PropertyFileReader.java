package org.automation.example.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {
    protected Properties properties;
    protected final String propertyFileName;

    public String getPropertyFileName() {
        return this.propertyFileName;
    }
    public Properties load() throws IOException {
        this.properties = new Properties();
        this.properties.load(new FileInputStream(new File(this.propertyFileName)));
        return this.properties;
    }
    public PropertyFileReader(final String fileName) {
        this.propertyFileName = fileName;
    }

    public Properties getProperties() {
        return properties;
    }

    public void reload() throws IOException {
        this.load();
    }

    public void refresh() throws IOException {
        this.load();
    }
}
