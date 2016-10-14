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

# known bugs : 
1. Local Report generated only with excel loader 
2. @Duration => makes tests tobe ignored.
3. @Report for failed tests with CSV & XML
4. @TestProperties at class level

# Where to use it

# This example does not contains 
1. Custom type which is supported by easy test. 
2. Following supported annotations.
 @Converters,@TestConfigProvider,@Intercept, @PreerveContext, @Provided,@TestBean
3. 