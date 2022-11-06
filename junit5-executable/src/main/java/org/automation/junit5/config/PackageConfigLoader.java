package org.automation.junit5.config;

import java.io.IOException;
import java.util.Properties;

public class PackageConfigLoader {
    private final String propertyFile;

    public PackageConfigLoader(String propertyFile) {
        this.propertyFile = propertyFile;
    }
    public Properties load() throws IOException {
        Properties prop = PropertyLoaders.read(propertyFile);
        PropertyLoaders.setAsSystemProperty(prop);
        return prop;
    }
}
