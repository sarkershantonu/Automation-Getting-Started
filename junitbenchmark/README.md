# Junit Benchmark
This repository has examples for method level benchmark testing examples using test rules of Junit

# Dependency 
1. Jdk 1.8
2. Junit 4.12
3. JUnit Benchmark 0.7.2

# Maven run
mvn test

# For Chart 
h2database

# Configuration 
in jub.properties. Load those as system properties. and after test chart will be present in chart folder. 
I am loading all of the properties from jub.properties using this part of the code

 Properties p = new Properties();
 p.load(new FileInputStream(new File("src/test/resources/jub.properties")));
 for(String k:p.stringPropertyNames()){
     System.setProperty(k,p.getProperty(k));
 }
 
So, if you need to change any property, you can change in this jub.properties, it will effect before tests.
 
This part I am adding in @BeforeClass so that we can get those before test starting
 
 
# Chart View 
See chart folder 

# Report Type 
1. History report
2. Test Report (for each class) 
 
# Where to use this 
1. You have your unit tests, use this to know your concurrency state performance.
As this is unit level performance, this will not prove concurrent user actions but, it can prove concurrent request processing.
So, when you have Strict SLA , use this to validate throughput. 
This type of test is not suitable for Response Time SLAs as this is not user time. 
And , important factor, error rate or error tolerant. This type of test can ensure (mostly) about server's error possibility. 
  
2. You have functional integration tests which validates backend request. Like DB request, webservice calls via UI layer. 
you can use this to to test before actual tests for performance. This will help you to know how system behaves when they are intregrated .
Some time it is very useful to run with manual tests in QA environment.
A number of parallel request is going on while a manual tester is testing aplication UI behavior. 
    
3. Mission critical/Business critical data concurrency tests can be easily done by this. 
Example, business transaction data concurrency testing for a banking or financial domain. This can validate data intregrity when concurrent requests are in place in the system. (Synchronization, locks etc)
    
4. simulate thread deadlock scenario 
 
5. simulate OOM scenario

6. Testing individual component, tire, request for Throughput and Error%

7. Simulate Required Resource Capacity scenario.     