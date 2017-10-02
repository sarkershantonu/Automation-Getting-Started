# Allure Junit
This repository contains 

1. How can we start Allure Junit
2. Examples with all annotation supported
3. This is maven surefire plugins base execution. if you want integration tests, use failsafe. 

# Project Requirements
1. JDK 8
2. maven 3.3.9

And in sider POM : 

3. Zohhak, for parametrized example
4. Junit for test
5. SLF4J/log4j for logging support of allure
6. Allure Junit Adapter
7. Allure support plugins & reporters 
8. Jetty server to deploy report locally : pre-configured port 9000 

# How to start :
1. Download this project
2. mvn clean test [for testing]
3. mvn site [make allure report]
4. mvn jetty:run 

or if you want to run in your own port 
jetty:run -Djetty.port=<port>

Then from browser , if you goto http://localhost:9000 you can see the report. 
