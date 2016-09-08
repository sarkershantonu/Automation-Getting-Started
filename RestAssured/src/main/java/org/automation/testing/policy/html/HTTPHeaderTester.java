package org.automation.testing.policy.html;

import java.util.List;
import java.util.Map;

/**
 * Created by shantonu on 9/8/16.
 */
public interface HTTPHeaderTester {
    void testResposeCode(String responseCode);
    void testResposeMessage(String responseMessage);
    void testContentType(String type);
    void testServer(String servertype);
    void testDate(String expectedDate_futureOfResponse);// assert test date is future than when request is sent
    void testOtherHeaderItems(Map<String,String> parameters);
}
