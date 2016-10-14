# Easy Test , Data Driven testing for JUnit
This contains simple example with easy test

# Dependency 
1. JDK 1.8
2. Maven 3.3.9
3. Easy Test 1.4.0

# Local Settings : 
log : logs/
Report : TestReports

# maven command
mvn test

# Quick Start & Best Practices 
1. Run with DataDrivenTestRunner.class or BlockJUnit4ClassRunner.class (which needs lots of manual steps configurations.) 


# Pain Points
1. Easy test exceptions are not very much user friendly so, you may struggle to get the root cause. so, be target oriented from start and follow own rules.
2. Only one loade of a type should be in a test class (if you have two XML file loaders, you may see errors)

# known bugs : 
1. Local Report generated only with excel loader 
2. @Duration => makes tests tobe ignored.
3. @Report for failed tests with CSV & XML
4. @TestProperties at class level

# Where to use it

# This example does not contains 
1. Custom type which is supported by easy test. 
http://stackoverflow.com/questions/27233070/parameterizedassertionerror-using-easytest-when-test-case-fails
2. Following supported annotations.
 @Converters,@TestConfigProvider,@Intercept, @PreerveContext, @Provided,@TestBean
3. 