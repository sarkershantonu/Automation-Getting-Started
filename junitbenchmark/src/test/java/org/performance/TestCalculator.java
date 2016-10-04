package org.performance;


import com.carrotsearch.junitbenchmarks.AbstractBenchmark;
import com.carrotsearch.junitbenchmarks.BenchmarkOptions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@BenchmarkOptions(concurrency = 2, warmupRounds = 2, benchmarkRounds = 20)
public class TestCalculator extends AbstractBenchmark{
    protected Calculator aCalculator = null;

    @Before
    public void init(){
        aCalculator = new Calculator();
    }
    @Test
    public void testAddition(){
        Assert.assertEquals(25.0, aCalculator.add(10.0,15.0), 0.01);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test

    public void testSub(){
        Assert.assertEquals(-5.0, aCalculator.sub(10.0,15.0), 0.01);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
