# Rest Assure Example with serenity 
Demo web service testing project
Report will be created by serenity
Report will be published locally using jetty 

# Test Webservice 
https://github.com/sarkershantonu/Bug-Storing-WS

# Run this before running tests
We need to run Bug web service release 
https://github.com/sarkershantonu/Bug-Storing-WS/releases

Java -Jar bug-store-1.2-SNAPSHOT.jar 

# Serenity Test running 
mvn clean

mvn verify 

mvn deploy

mvn jetty:run 

you can see reports in http://localhost:9001 , your site should be ready 
