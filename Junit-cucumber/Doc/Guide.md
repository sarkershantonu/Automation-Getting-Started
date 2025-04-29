
###OutDated

Installation :

1. Java 8
2. Maven 3.3.9
3. IntellijIDEA community
    install junit & gherkin plugins
    use maven that you installed
4. Download from guthub
5. open with intellij and

RUN all test : mvn test
or From IDE, tun CucumberTest


Mandatory :

Package/Folder : Test classes Path should same as Feature path, file name can be different

Test Runner class : maven(probably gradle too) need to have the runner class named <anything>Test
 if you rename, locally you can run using IDE plugins but maven will not work
 (i think some maven parameter should be there for commandline)-maven surfire run test suffix class.

This is a very small class that only defines that it should be executed by a JUnit runner that invokes Cucumber,
The class name ends with Test. This means that the Surefire plugin in Maven will be able to pick it up and execute it.
The feature file must be located in the same package as the runner.
Cucumber will examine its classpath and search for all files with the suffix .feature and execute any scenarios it can find.

all stp definations should be same package as test runner

Best practices :
as all step defination method names are cucumber entry, all names should be unique .
So, better use single God Like class to prevent duplicacy during test creation.
And , all features in same package

CucumberOptions allows to have
  -> steps in different package via glue
  -> features in different folders via features

Example :
1. All manually config : all can stay separately
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}/*Default config upto this, rest of them to support different test organization*/
        , features = {"src/test/resources/skeleton", "src/test/resources/regression"}  //=> this will allow folder structure inside resources
        , glue = {"skeleton", "regression"}// this will aloow step definations in different packages(package name only), no input[glue = {""}] will get all items from package
)
public class CucumberTest {
}

2. Default :(keeping runer in same package)
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"})
public class CucumberTest {

3. not specifying step def, default it will get all

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}
        , features = {"src/test/resources/skeleton", "src/test/resources/regression"}
        , glue = {""}
)
public class CucumberTest {
}



Format/Plugins :

pretty = will show detail in console + test plugins
html:target/cucumberReport : create a filder that contains whole set of files to show reports in html => use a http server to show
json:target/cucumber.json : creates a JSON file containing report

Note : a nice example : http://www.srccodes.com/p/article/48/cucumber-test-behavior-driven-development-bdd-feature-step-runner-glue-gherkin-data-table-scenario-given-when-then






