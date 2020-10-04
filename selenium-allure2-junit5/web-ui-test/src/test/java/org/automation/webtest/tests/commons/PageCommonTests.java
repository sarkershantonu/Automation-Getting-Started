package org.automation.webtest.tests.commons;


import org.automation.webtest.core.TestBase;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PageCommonTests extends TestBase {
    @Parameterized.Parameter(value = 0)
    public Class testClass;

    @Parameterized.Parameters(name = "TEST : {0}")
    public static Collection testClasses(){
        return Arrays.asList(new Class[]{AboutUs.class, ViewCart.class, AboutUs.class});
    }

    /***
     * check http 200
     * check page title
     * check load time
     */
//    @Test(timeout = 15000)
//    public void test_page_loaded_under_timeout() throws IllegalAccessException, InstantiationException {
//        PageBase base = (PageBase) testClass.newInstance();
//        base.navigate(base.pageUrl);
//        base.verifyPageLoadedText(base.pageLoadedText);
//        Assert.assertEquals("Title Miss match:",base.title,base.getTitle());
//    }
}
