# Allure 2 with Junit 5 examples

# Run commands 
- To test 
        
      ./mvnw clean varify

- To build & see report 

      ./mvnw allure:report      
      ./mvnw allure:serve

# Test Project  
- Calculator class for test app 

# Allure : Installations  
 1. Download latest allure ZIP file from [here](https://repo.maven.apache.org/maven2/io/qameta/allure/allure-commandline/) . I used 2.13.2.
 2. Extract & goto bin directory, you can see allure.bat/allure. Put this directory path as system path. In my case, i have added in win 10 path variable this path "C:\Users\Shantonu\apps\allure-2.13.2\bin"   

# Allure : POM integration

# Allure : Annotation

# Junit 5 Basics
- There are three projects groups in Junit 5
- JUnit Platform :(Making framework/Runners) It defines the TestEngine API for developing new testing frameworks that runs on the platform.
- JUnit Jupiter : (most of people needs) It has all new junit annotations and TestEngine implementation to run tests written with these annotations.
- JUnit Vintage:(back compatibility) To support running JUnit 3 and JUnit 4 written tests on the JUnit 5 platform.
- Annotation comparison with Junit 4 
![junit 5 annotations](./images/junit5-vs-junit4.JPG)
