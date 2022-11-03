package org.automation.junit5.runner;

import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public abstract class Junit5Runner {
    protected static final Logger logger = LoggerFactory.getLogger("CalculatorLogger");
    private List<Class<?>> listeners;

    public TestExecutionListener getDefaultListener(){
        return new SummaryGeneratingListener();
    }

    public void setListeners(List<Class<?>> listeners) {
        this.listeners = listeners;
    }

    public static Logger getLogger(){return logger;}
}
