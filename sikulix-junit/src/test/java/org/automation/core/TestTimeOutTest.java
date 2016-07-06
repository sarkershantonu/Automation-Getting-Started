package org.automation.core;

import org.junit.Rule;
import org.junit.rules.Timeout;


/**
 * Created by shantonu on 7/6/16.
 */
public abstract class TestTimeOutTest extends TestBase{

    @Rule
    public Timeout globalTimeOut = Timeout.seconds(2);

}
