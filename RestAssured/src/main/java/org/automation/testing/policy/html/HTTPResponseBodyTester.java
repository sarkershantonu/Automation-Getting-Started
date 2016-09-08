package org.automation.testing.policy.html;

import org.automation.testing.policy.common.ResponseValidator;

import java.util.List;

/**
 * Created by shantonu on 9/8/16.
 */
public interface HTTPResponseBodyTester extends ResponseValidator {
    void testTitle(String expectedTitle);
    void testLinks(List<String> hrefs);
}
