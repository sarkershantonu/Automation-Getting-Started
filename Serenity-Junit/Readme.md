# Serenity Junit starter project

To test and generate report : 
mvn verify serenity:aggregate

To run Jetty and see report in local pc @9100 port:  
mvn jerry:run 

# Maven settings.xml entry
Under tag : pluginGroups 

    create tag :pluginGroup
    
    add entry : net.thucydides.maven.plugins

