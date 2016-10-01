package org.automation.suits;

import org.automation.unitTests.attachment.TestWithAttachment;
import org.automation.unitTests.attachment.TestWithAttachment_Rules;
import org.automation.unitTests.attachment.TestWithAttachment_returnFromTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by shantonu on 10/1/16.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({TestWithAttachment.class, TestWithAttachment_Rules.class, TestWithAttachment_returnFromTests.class})
public class TestSuitForAttachment {
}
