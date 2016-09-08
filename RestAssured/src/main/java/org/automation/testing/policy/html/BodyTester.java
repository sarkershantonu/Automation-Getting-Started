package org.automation.testing.policy.html;

import java.util.List;

/**
 * Created by shantonu on 9/8/16.
 */
public interface BodyTester {
    void testTitle(String expectedTitle);
    void testLinks(List<String> hrefs);
}
