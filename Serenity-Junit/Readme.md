# Serenity Junit starter project
This is small project using serenity 

# Run Tests 
mvn verify serenity:aggregate


# See results in jetty 9100 port

mvn jerry:run 


Maven settings.xml entry (this is optional) 
Under tag : pluginGroups 

    create tag :pluginGroup
    
    add entry : net.thucydides.maven.plugins

# How to Project organize 

# Important Properties 

# POM design tips & tricks

# Notes
1. It is based on maven-failsafe-plugin which is less strict than surefire, so the whole test execution will be treaed as intregration tests. 
   