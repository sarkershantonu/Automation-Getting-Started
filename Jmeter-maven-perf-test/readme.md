# Jmeter tests with maven
- We will run test 
- we will analyze results
# Why we need
- Running in CI/CD
- Running in CLI without Jmeter installed

# Run test 

        mvn verify -Pperformance
        
# Result Analysis

        mvn jmeter-analysis:analysis

# Java Properties
# User Properties
# How to Script in Jmeter to run using this plugins
# JVM Arguments