package org.example.jftunit;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.moditect.jfrunit.JfrEventTest;

@JfrEventTest
public abstract class JftUnitTestBase {
    @BeforeClass
    public static void beforeClass(){}
}
