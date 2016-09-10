package org.automation;

import org.junit.internal.runners.InitializationError;
import org.junit.internal.runners.JUnit4ClassRunner;

/**
 * Created by shantonu on 9/10/16.
 */
public class MyRunner extends JUnit4ClassRunner {
    public MyRunner(Class<?> klass) throws InitializationError {
        super(klass);
    }

    protected void validate() throws InitializationError {
        // ignore
    }
}
