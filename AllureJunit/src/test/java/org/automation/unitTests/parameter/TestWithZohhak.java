package org.automation.unitTests.parameter;

import com.googlecode.zohhak.api.TestWith;
import com.googlecode.zohhak.api.runners.ZohhakRunner;
import org.automation.core.TestingCalculator;
import org.junit.Assert;

import org.junit.runner.RunWith;
import ru.yandex.qatools.allure.annotations.Parameter;

import static org.junit.Assert.assertNull;

/***
 * A set of data considered in " Separated by comma " and each set also separeted by comma
 *
 * @author shantonu
 *         => Allure @Parameter does not works, we can not see in tests about parameters
 */
@RunWith(ZohhakRunner.class)
public class TestWithZohhak extends TestingCalculator {

    @TestWith(value = {" 3, 2, 1", " 5, 2, 3", " 9, 8, 1 ", " 200, 50, 150 ", "null, null, null"}, separator = ",")
    public void testAddWithParameters(@Parameter("Allure Parameter : Expected") Integer expected,
                                      @Parameter("Allure Parameter : First Number") Integer first,
                                      @Parameter("Allure Parameter : Second Number") Integer second) {

        if (first == null || second == null || expected == null) {
            assertNull(expected);
            assertNull(second);
            assertNull(first);
        } else {
            Assert.assertEquals(expected.intValue(), aCalculator.add(first.intValue(), second.intValue()), 0.01);
        }
    }

    @TestWith(value = {" 3, 2, 1", " 5, 2, 3", " 9, 8, 1 ", " 200, 50, 150 "}, separator = ",")
    public void testWithParameters(@Parameter("Allure Parameter : Expected") int expected,
                                   @Parameter("Allure Parameter : First Number") int first,
                                   @Parameter("Allure Parameter : Second Number") int second) {
        Assert.assertEquals(expected, aCalculator.add(first, second), 0.01);
    }
}
