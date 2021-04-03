package org.automation.junit5.tests.parameterized;

/**
 * Created by shantonu on 4/3/2021
 */
public class User {
    private final String fName;
    private final String mName;
    private final String lName;

    public User(String fName, String mName, String lName) {
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
    }
    public String getName(){
        if((null==mName)||mName.trim().isEmpty())
            {
            return  String.format("%s %s", fName,lName);
            }
        else
            {
        return String.format("%s %s %s", fName,mName,lName);
            }
    }
    public String fullName(){
        return this.getName();
    }

    public String getfName() {
        return fName;
    }

    public String getmName() {
        return mName;
    }

    public String getlName() {
        return lName;
    }
}
