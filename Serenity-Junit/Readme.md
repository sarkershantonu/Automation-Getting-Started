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

# Best Practices
1. Avoid @DefaultUrl from annotation, use properties. 
2. Use Page specif URL(path url) inside POM
3. Never Use Page logic inside Test Classes
4. You should make Steps Pages to reuse the steps
5. Sanity checks : Put assertion in each @step to validate on the spot.
6. In Test case, keep test data only not sanity check items
7. If you have complex validation logic, put in separate package like steps
8.   

# Reporting :
1. All test methods names will be seperated
    a. Camel case , space add in middle of words
    b. Underscores(_) are replaced by Space
2. 

# Notes
1. It is based on maven-failsafe-plugin which is less strict than surefire, so the whole test execution will be treaed as intregration tests. 
2. It is better not to use serenity for non intregration tests (like unit tests)
3. serenity.properties must be at the project root level (in CI server, at the workspace root)
4. Project structure samples are inside DOC folder (TBD)
5.   