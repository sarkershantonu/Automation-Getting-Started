package org.automation.core;

import org.junit.Rule;
import org.junit.rules.ErrorCollector;

/**
 * Created by SSarker on 8/4/2018.
 */
public abstract class TestBase {

    @Rule
    public ErrorCollector collector = new ErrorCollector();

}
