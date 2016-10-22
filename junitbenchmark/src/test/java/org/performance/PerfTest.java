package org.performance;

import com.carrotsearch.junitbenchmarks.BenchmarkOptions;
import com.carrotsearch.junitbenchmarks.BenchmarkRule;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;

/**
 * Created by shantonu on 10/22/16.
 * not using abstract benchmark
 */
public class PerfTest {
    protected Calculator aCalculator = null;
    @Before
    public void init(){
        aCalculator = new Calculator();
    }
    @Rule
    public TestRule benchmarkRun = new BenchmarkRule();
    @Test
    @BenchmarkOptions(concurrency = 2, warmupRounds = 0, benchmarkRounds = 5)
    public void testSub(){
        Assert.assertEquals(-5.0, aCalculator.sub(10.0,15.0), 0.01);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
