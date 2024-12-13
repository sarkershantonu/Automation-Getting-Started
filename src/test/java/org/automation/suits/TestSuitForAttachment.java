package org.automation.suits;

import org.automation.unitTests.attachment.TestWithAttachment;
import org.automation.unitTests.attachment.TestWithAttachment_withEachStepSnapRule;
import org.automation.unitTests.attachment.TestWithAttachment_directFromTestMethod_customRunner;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by shantonu on 10/1/16.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({TestWithAttachment.class, TestWithAttachment_withEachStepSnapRule.class, TestWithAttachment_directFromTestMethod_customRunner.class})
public class TestSuitForAttachment {
}
