# Jmeter tests with maven
- We will run test 
- we will analyze results
# Why we need
- Running in CI/CD
- Running in CLI without Jmeter installed

# Run test 

        mvn clean verify 
        
# Result Analysis(optional)

        mvn jmeter-analysis:analysis
# Note : 
- Plugin version 2.5.1 (this is last tested working version which needs reports)
- this use Jmeter 3.3
- Report version 1.0.6

This is OLD plugin example, unless you  need, use latest example