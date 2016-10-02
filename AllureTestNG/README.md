# Allure TestNG
This repository contains 

1. How can we start Allure Test NG
2. Examples with all annotation supported

# Project Requirements
1. JDK 8
2. maven 3.3.9

And in sider POM : 

4. TestNG for test
5. SLF4J/log4j for logging support of allure
6. Allure testNG Adapter
7. Allure support plugins & reporters 
8. Jetty server to deploy report locally : pre-configured port 9001 

# How to start :
1. Download this project
2. mvn clean test [for testing]
3. mvn site [make allure report]
4. mvn jetty:run 

or if you want to run in your own port 
jetty:run -Djetty.port=<port>

Then from browser , if you goto http://localhost:9001 you can see the report. 

# Blog : 
Please visit detail Junit aluure blog for more explanation. All test examples are from the same project. 
http://shantonusarker.blogspot.com/2016/10/allure-maven-test-junit.html