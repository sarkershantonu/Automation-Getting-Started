# Parallel Cucumber Example
Using Allure with cucumber JVM

# Target 
a simple calculator for testing cucumber features in parallel

# Testing command 
(use maven 3.3.9)

mvn clean test 

# How it works
 1. First it reads the pom configuration 
 2. Reads the Runner Template java class
 3. Generates test classes under generated test resources 
 4. Put those test classes under test-classes 
 5. Finally run those generated runner classes. 
 
 Here is a image of target folder
 
 ![target](generated_runners.JPG)

