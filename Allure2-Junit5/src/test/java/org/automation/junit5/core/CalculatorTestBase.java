package org.automation.junit5.core;

import io.qameta.allure.listener.StepLifecycleListener;
import io.qameta.allure.model.StepResult;
import org.automation.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculatorTestBase implements StepLifecycleListener {
    protected Calculator myCal;
    public Logger logger = LoggerFactory.getLogger(this.getClass());

    @BeforeAll
    public static void initForAllTest(){

    }
    @AfterAll
    public static void cleanupForAllTest(){

    }

    @Override
    public void beforeStepStop(StepResult result) {
        logger.info("Finished step : {}",result.getName());
    }
    
}
