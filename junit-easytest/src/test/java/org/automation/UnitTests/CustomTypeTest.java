package org.automation.UnitTests;

import org.automation.MyDataType;
import org.automation.policy.TestPolicyExample;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.annotation.TestPolicy;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by shantonu on 7/21/16.
 */
@TestPolicy(TestPolicyExample.class)
@RunWith(DataDrivenTestRunner.class)
public class CustomTypeTest {

    @Test
    public void testParameter(@Param(name = "id", convertEmptyToNull = true)MyDataType id){
        System.out.println("the valie is = "+ id);

    }
}
