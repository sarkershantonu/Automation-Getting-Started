# Example Project with Selenide
Selenide is a selenium wrapper framework that makes selenium easy to use and organize

# Dependency 
- Java 
- Junit
- Selenide

# Run Command 
- mvn clean test 


# Main Site Link  

- https://selenide.org/quick-start.html

# Test 1 
Simple searching google (my name)

# Side goal

Adding steps logs 
An annotaion way 

# Opencart Structure
- Page structure
- WebPart structure
- Header & Footer area
- Preview element

# WebGoat Structure 

### Project Link 
- [Standalone JAR](https://github.com/WebGoat/WebGoat/releases)

### Installation : Standalone 

if you run locally, quickest way is to runs as standalone JAR. 
- You should have Java 17+ 
- download from [Releases](https://github.com/WebGoat/WebGoat/releases) 
- Run Command with selected port ***java -jar webgoat-Version_Number.jar --webgoat.port=8001 --webwolf.port=800***
  - Example ```java -jar webgoat-2023.8.jar --webgoat.port=8001 --webwolf.port=8002```
  
### Installation : Build your self 
Clone Project Repo Link 

```shell
git clone git@github.com:WebGoat/WebGoat.git
```

- You should have Java 17+
- Clean & Install using Maven 
```shell
./mvnw clean install
``` 
- Run As SpringBoot App with maven (with default port)
```shell
./mvnw spring-boot:run
```