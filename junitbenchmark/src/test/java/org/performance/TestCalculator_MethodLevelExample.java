package org.performance;


import com.carrotsearch.junitbenchmarks.AbstractBenchmark;
import com.carrotsearch.junitbenchmarks.BenchmarkOptions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestCalculator_MethodLevelExample extends AbstractBenchmark{
    protected Calculator aCalculator = null;

    @Before
    public void init(){
        aCalculator = new Calculator();
    }
    @Test
    @BenchmarkOptions(concurrency = 2, warmupRounds = 1, benchmarkRounds = 10)
    public void testAddition(){
        Assert.assertEquals(25.0, aCalculator.add(10.0,15.0), 0.01);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

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
