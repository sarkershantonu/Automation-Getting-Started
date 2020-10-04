package org.automation.webtest.core;


public enum DriverWindow {
    FIRST(0),
    SECOND(1);
    public int index;
    private DriverWindow(int index){
        this.index = index;
    }
}
