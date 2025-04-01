# Allure Cucumber Example
Using Allure with cucumber JVM

# Target 
a simple calculator with allure report

# Testing commands  

### Running Tests 

- Run test ```mvn clean test``` 

### Running Report
 - Build Site ```mvn allure:report```
 - Run Site ```mvn allure:serve```

See in your http://localhost:9100 

# Requirements 
- Updated to JDK 21

### Tips 
Make sure ```allure-maven``` has same version as ```allure-commandline``` in maven repo , if not you may need to fix this 
- [Main issue Link](https://github.com/allure-framework/allure2/issues/975)
- Solution Example
```xml
            <plugin>
                <groupId>io.qameta.allure</groupId>
                <artifactId>allure-maven</artifactId>
                <version>2.15.2</version>
                <configuration>
                    <reportVersion>${allure.version}</reportVersion>
                    <resultsDirectory>${project.build.directory}/allure-results</resultsDirectory>
                    <allureDownloadUrl>
                        ${repo.base.url}/io/qameta/allure/allure-commandline/${allure.cmd.version}/allure-commandline-${allure.cmd.version}.zip
                    </allureDownloadUrl>
                </configuration>
            </plugin>
```
    In properties Section =>  
    <allure.cmd.version>2.33.0</allure.cmd.version>
    <allure.version>2.29.0</allure.version>

- Change port : in plugin configuration use ```<servePort>9099</servePort>``` to use port 9099. you can use properties section to inject property with maven command. 

# Allure installations (optional)
- Download from https://github.com/allure-framework/allure2/releases
- Unzip and set inside path (environment variable) 
