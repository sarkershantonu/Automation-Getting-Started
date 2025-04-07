# Allure Junit
This repository contains 

1. How can we start Allure Junit
2. Examples with all annotation supported
3. This is maven surefire plugins base execution. if you want integration tests, use failsafe. 

# Project Requirements
1. JDK 8
2. maven 3.3.9

And in sider POM : 

3. Junit for test
4. SLF4J/log4j for logging support of allure
5. Allure Junit Adapter
6. Allure support plugins & reporters 
7. Jetty server to deploy report locally : pre-configured port 9000 

# How to start :
1. Download this project
2. ```mvn clean test ``` [for testing]
3. ```mvn allure:report``` [make allure report]
4. ```mvn allure:serve``` [show report]

to change port include this option in mavn command  , -Dallure.port=YourPort like 

```mvn -Dallure.port=9000 allure:serve```

Then from browser , if you goto http://localhost:9000 you can see the report. 
