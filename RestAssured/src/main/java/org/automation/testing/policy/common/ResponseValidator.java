package org.automation.testing.policy.common;

import java.util.List;

/**
 * Created by shantonu on 9/8/16.
 */
public interface ResponseValidator {
    void testResponse(List<String> expectedResponse);
}
