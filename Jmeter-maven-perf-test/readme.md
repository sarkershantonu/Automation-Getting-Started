# Jmeter tests with maven plugins
- We will run test 
- we will generate reports

# Maven POM
- As this is performance testing , we will run test in maven verify phase(as integration test)
- There is no Java coding involve, so, no source/test code. those will be empty folders. 
- JMX Script folder : /src/test/jmeter
- Properties folder : /src/test/jmeter
- Test Data(CSV) folder : 


# The jmeter JMX
- 

# Run test 

        mvn clean verify 

# What happens during test 
- mvn clean => clean target folder (if it has old results)
- mvn verify, it actually tests. In test plugins we have 3 execution goals. 
1. configure : it downloads and premiere Jmeter as confirmed by plugin. you will seen inside target folder this 
![image](./images/configure-step.jpg) 

2. jmeter : it runs original test following properties. A test file invoked from /src/test/jmeter to target/testFiles. you will see this 
![testFiles](./images/testFiles.JPG)
3. results: it analyze the results and save as CSV (default) in results 
![folder](./images/results.JPG)

# Maven Plugins executions
- Upto now,from [source code](https://github.com/jmeter-maven-plugin/jmeter-maven-plugin/tree/master/src/main/java/com/lazerycode/jmeter/mojo), i see there are 5 executions
configure,gui,jmeter,results, remote-server. All will work under integration (verify) lifecycle of maven. 
- In the test we have use configure , test & results. 
- "remote-server" is used only when we are making slave-master configuration for distributed jmeter tests. 

# Java Properties

# User Properties

# How to Script in Jmeter to run using this plugins
- Make variable for all possible information. 
- Keep all these value injectable via jmeter properties using [__P](https://jmeter.apache.org/usermanual/functions.html#__P) or [__property](https://jmeter.apache.org/usermanual/functions.html#__property)
- Keep these variable a default value
- Do not change Test Plan name
- 
 

# Specify test script(JMX)
- if you want to specify JMX file , under  <configuration> use this 
			
			<testFilesIncluded>
                	<jMeterTestFile>your_test_file.jmx</jMeterTestFile>
            </testFilesIncluded>

# JVM Arguments
- To add JVM argument , under plugins configuration section <jMeterProcessJVMSettings> will be present. Here are some examples. 
- to run jmeter JVM with 3gb memory, and 768mb of metaSpace + enable profiling (for initial diagonysis) 

		<jMeterProcessJVMSettings>
			<xms>3072</xms>
			<xmx>3072</xmx>
			<arguments>
				<argument>-Xprof</argument>
				<argument>-Xfuture</argument>
				<argument>-XX:MaxMetaspaceSize=768m</argument>
			</arguments>
         </jMeterProcessJVMSettings>

- to increase JVM memory only 

		<jMeterProcessJVMSettings>
			<xms>3072</xms>
			<xmx>3072</xmx>
			<arguments>
				<argument>-XX:MaxMetaspaceSize=768m</argument>
			</arguments>
         </jMeterProcessJVMSettings>
		 
- Another way , you can do the same thing

		<jMeterProcessJVMSettings>
			<arguments>
				<argument>-XX:MaxMetaspaceSize=256m</argument>
				<argument>-Xmx1024m</argument>
				<argument>-Xms1024m</argument>
			</arguments>
		</jMeterProcessJVMSettings>		

# Jmeter Plugins : 
- To add Jmeter Plugins, you need to specify inside <configuration> like this (i am adding extra thread groups)

	<jmeterExtensions>
		<artifact>kg.apc:jmeter-plugins-casutg:2.8</artifact>
	</jmeterExtensions>

All of the plugins artifacts are linked [here](https://mvnrepository.com/artifact/kg.apc)

# Reporting 
- To generate reports , put like this under <configuration> 
	
	<generateReports>true</generateReports>   
- To ignore result failure 	

	 <ignoreResultFailures>true</ignoreResultFailures>
- 	 

# Jmeter Remote Master POM 

# Jmeter Remote Slave POM

# Notes
- plugins 3.1.0 use jmeter 5.3
- This does not need analysis plugins, just need and extra execution step