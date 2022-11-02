package org.automation.junit5.runner;

import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;

import java.util.List;

public abstract class Junit5Runner {

    private List<Class<?>> listeners;

    public TestExecutionListener getDefaultListener(){
        return new SummaryGeneratingListener();
    }

    public void setListeners(List<Class<?>> listeners) {
        this.listeners = listeners;
    }
}
