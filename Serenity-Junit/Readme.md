# Serenity Junit starter project
This is small project using serenity 

# Run Tests 
mvn verify serenity:aggregate


To run Jetty and see report in local pc @9100 port:  
mvn jerry:run 


Maven settings.xml entry (this is optional) 
Under tag : pluginGroups 

    create tag :pluginGroup
    
    add entry : net.thucydides.maven.plugins

