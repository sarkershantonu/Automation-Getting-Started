package org.performance;


import com.carrotsearch.junitbenchmarks.AbstractBenchmark;
import com.carrotsearch.junitbenchmarks.BenchmarkOptions;
import com.carrotsearch.junitbenchmarks.annotation.AxisRange;
import com.carrotsearch.junitbenchmarks.annotation.BenchmarkHistoryChart;
import com.carrotsearch.junitbenchmarks.annotation.BenchmarkMethodChart;
import com.carrotsearch.junitbenchmarks.annotation.LabelType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

@AxisRange(min = 0, max =1)
@BenchmarkMethodChart(filePrefix = "benchmark-lists2")
@BenchmarkHistoryChart(labelWith = LabelType.TIMESTAMP, maxRuns = 20)
public class TestCalculator_MethodLevelExample extends AbstractBenchmark{
    protected Calculator aCalculator = null;

    @BeforeClass
    public static void loadProperties() throws IOException {
        Properties p = new Properties();
        p.load(new FileInputStream(new File("src/test/resources/jub.properties")));
        for(String k:p.stringPropertyNames()){
            System.setProperty(k,p.getProperty(k));
        }
    }
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
