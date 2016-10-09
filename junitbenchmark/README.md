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
  
  