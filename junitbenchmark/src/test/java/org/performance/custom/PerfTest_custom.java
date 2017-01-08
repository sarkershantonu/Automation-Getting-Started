package org.performance.custom;

import com.carrotsearch.junitbenchmarks.BenchmarkOptions;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by shantonu on 1/8/17.
 */
public class PerfTest_custom extends Benchmarking {
    @Test
    @BenchmarkOptions(concurrency = 2, warmupRounds = 0, benchmarkRounds = 5)
    public void testSub(){
        Assert.assertEquals(-5.0, aCalculator.sub(10.0,15.0), 0.01);
        //To run the test slow enough to see it running
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
