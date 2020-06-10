# Jmeter tests with maven plugins
- We will run test 
- we will generate reports

# Maven POM
- As this is performance testing , we will run test in maven verify phase(as integration test)
- There is no Java coding involve, so, no source/test code. those will be empty folders. 
- JMX Script folder : /src/test/jmeter
- Properties folder : /src/test/jmeter
- jmeter config folder (like log4j2.xml) : /src/test/conf
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
- To add Jmeter properties  under  <configuration> use this 

		<propertiesJMeter>
			<jmeter.save.saveservice.thread_counts>true</jmeter.save.saveservice.thread_counts>
		</propertiesJMeter>

- its best practice not to change jmeter properties, rather you should change in user properties
# User Properties
- To add user properties  under  <configuration> use propertiesUser . As example 


		<propertiesUser>
			<base.url>${base.url}</base.url>
			<jobs.url>${jobs.url}</jobs.url>
			<app.protocol>${protocol}</app.protocol>
			<app.port>${port}</app.port>
			<connect.timeout>${connect.timeout}</connect.timeout>
			<response.timeout>${response.timeout}</response.timeout>
			<thread.name>${thread.name}</thread.name>
			<thread.number>${thread.number}</thread.number>
			<rampup>${rampup}</rampup>
			<startup.delay>${startup.delay}</startup.delay>
			<test.duration>${test.duration}</test.duration>
			<target.rpm>${target.rpm}</target.rpm>
			<jmeter.save.saveservice.thread_counts>true</jmeter.save.saveservice.thread_counts>
		</propertiesUser>
		
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
			<jMeterTestFile>your_test_file2.jmx</jMeterTestFile>
		</testFilesIncluded>

* you can add multiple files 

- you can specify Regular Expression based test scripts

			<testFilesIncluded>
				<jMeterTestFile>your_scripts_prefix_*.jmx</jMeterTestFile>
			</testFilesIncluded>

# Excluding any JMX from default folder 
- Use <testFilesExcluded> under <configuration>. Example

		<testFilesExcluded>
			<excludeJMeterTestFile>your_excluded_test_file.jmx</excludeJMeterTestFile>
			<excludeJMeterTestFile>your_excluded_test_file2.jmx</excludeJMeterTestFile>
		</testFilesExcluded>

- Like include, exclude also supports regular expression 

		<testFilesExcluded>
			<excludeJMeterTestFile>your_scripts_prefix_*.jmx</excludeJMeterTestFile>
		</testFilesExcluded>

# Specify JMX folder (other than default)
- Default JMX files are confiured in /src/test/jmeter , but if you want to change this location. you need this in configuration
		
		<testFilesDirectory>/scratch/testfiles/</testFilesDirectory>
		
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

# Specify Jmeter version to use
- use <jmeterVersion> under configuration to specify jmeter version 

	<jmeterVersion>5.1.1</jmeterVersion>
# Specify Jmeter Core components(optional) 
- use <jmeterArtifacts> under configuration to specify artifact

		<jmeterArtifacts>
			<jmeterArtifact>org.apache.jmeter:ApacheJMeter:5.1.1</jmeterArtifact>
			<jmeterArtifact>org.apache.jmeter:ApacheJMeter_components:5.1.1</jmeterArtifact>
			<jmeterArtifact>org.apache.jmeter:ApacheJMeter_config:5.1.1</jmeterArtifact>
		</jmeterArtifacts>
# Including Libraries (this will put jars in lib)
- you need to add under configuration section  as <testPlanLibraries>, for example

		<testPlanLibraries>
			<artifact>org.apache.activemq:activemq-spring:5.15.2</artifact>
			<artifact>org.apache.activemq:activemq-client:5.15.2</artifact>
			<artifact>org.apache.activemq:activemq-broker:5.15.2</artifact>
		</testPlanLibraries>

# Excluding Libraries that you dont use in test case 
- you need to add under configuration section  as <excludedArtifacts>

		<excludedArtifacts>
			<exclusion>com.sun.jdmk:jmxtools</exclusion>
			<exclusion>com.sun.jmx:jmxri</exclusion>
		</excludedArtifacts>

# Jmeter Plugins : (this will add Jar's in the /lib/ext)
- To add Jmeter Plugins, you need to specify inside <configuration> like with <jmeterExtensions>

		<jmeterExtensions>
			<artifact>kg.apc:jmeter-plugins-casutg:2.8</artifact>
		</jmeterExtensions>

All of the plugins artifacts are linked [here](https://mvnrepository.com/artifact/kg.apc)

if any plugin use outdated dependencies , use this 

		<downloadExtensionDependencies>false</downloadExtensionDependencies>

# Adding JAR in  /lib/junit directory
- you need to use  <junitLibraries> under configuration 

			<junitLibraries>
				<artifact>com.lazerycode.junit:junit-test:1.0.0</artifact>
			</junitLibraries>

# Excluding JARs from class path 
- To exclude jar from classpath , use   <excludedArtifacts>. for example

		<excludedArtifacts>
			<exclusion>log4j:log4j</exclusion>
		</excludedArtifacts>
		
# Reporting 
- To generate reports , put like this under <configuration> 
	
	<generateReports>true</generateReports>   
	
- To ignore result failure 	

	 <ignoreResultFailures>true</ignoreResultFailures>
- To disable test result time stamp
	 
		<testResultsTimestamp>false</testResultsTimestamp>


# Jmeter running under proxy 
- if you want to specify corporate proxy configuration , under  <configuration> use this 

		<proxyConfig>
           <host>host_ip</host>
           <port>proxy_port</port>
           <username>user_name</username>
           <password>password_of_proxy</password>
           <hostExclusions>localhost|*.shantonu.com</hostExclusions>
		</proxyConfig>

# Jmeter Remote Master POM 

# Jmeter Remote Slave POM

# Notes
- plugins 3.1.0 use jmeter 5.3
- This does not need analysis plugins, just need and extra execution step