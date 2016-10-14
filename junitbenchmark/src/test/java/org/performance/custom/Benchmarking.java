package org.performance.custom;

import com.carrotsearch.junitbenchmarks.BenchmarkRule;
import com.carrotsearch.junitbenchmarks.annotation.AxisRange;
import com.carrotsearch.junitbenchmarks.annotation.BenchmarkHistoryChart;
import com.carrotsearch.junitbenchmarks.annotation.BenchmarkMethodChart;
import com.carrotsearch.junitbenchmarks.annotation.LabelType;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.performance.Calculator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by shantonu on 10/5/16.
 */
@AxisRange(min = 0, max =1)
@BenchmarkMethodChart(filePrefix = "benchmark-lists2")
@BenchmarkHistoryChart(labelWith = LabelType.RUN_ID, maxRuns = 20)
public abstract class Benchmarking {
    protected Calculator aCalculator = null;
    public static Properties properties = new Properties();
    @BeforeClass
    public static void loadProperties() throws IOException {
        Properties p = new Properties();
        p.load(new FileInputStream(new File("src/test/resources/jub.properties")));
        for(String k:p.stringPropertyNames()){
            System.setProperty(k,p.getProperty(k));
        }
    }

    @Rule
    public TestRule benchmarkRun = new BenchmarkRule();

    @Before
    public void init(){
        aCalculator = new Calculator();
    }
}
