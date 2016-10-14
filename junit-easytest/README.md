# Easy Test , Data Driven testing for JUnit
This contains simple example with easy test

# Dependency 
1. JDK 1.8
2. Maven 3.3.9
3. Easy Test 1.4.0

# Local Settings : 
1. log : logs/
2. Report : TestReports

# maven command
mvn test

# Quick Start & Best Practices 
1. Run with DataDrivenTestRunner.class or BlockJUnit4ClassRunner.class (which needs lots of manual steps configurations.) 
2. It supports Excel, CSV, XML DataLoaders, but use single type in single @DataLoader 
2. With Test method, loads data for test (not in class level) 
3. If you use in class, use single data loader for all tests (same type from same file) 
4. You may keep test settings with policy class, which can be used as global test parameter for test settings. 

# Pain Points
1. Easy test exceptions are not very much user friendly so, you may struggle to get the root cause. so, be target oriented from start and follow own rules.
2. Only one loade of a type should be in a test class (if you have two XML file loaders, you may see errors)
3. Can not use different type of file in same annotation(class/method level)
4. Files will be ignore if multiple same type file loading data (only one)
5. If you open parameter file while testing, you will see errors as resources are locked/busy

# known bugs : 
1. Local Report generated only with excel loader 
2. @Duration => makes tests tobe ignored.
3. @Report for failed tests with CSV & XML
4. @TestProperties at class level

# Where to use it
1. When you have single test method with different type of input data
2. When you want to provide data as parameter for your existing tests
3. Whe you are designing Data Driven framework or hybrid framework, this will help you to solve data driven part. 
4. This fills up gap from TestNG data parameter of Junit. Now you can use junit with data drivent tests.    

# Where not to use
1. Performance tests, it will cause resource concurrency error (busy)
2. Do not use local reporting while measuring method time. This report generation will add up extra time with tests.   

# This example does not contains 
1. Custom type which is supported by easy test. 
http://stackoverflow.com/questions/27233070/parameterizedassertionerror-using-easytest-when-test-case-fails
2. Following supported annotations.
 @Converters,@TestConfigProvider,@Intercept, @PreerveContext, @Provided,@TestBean
3. 