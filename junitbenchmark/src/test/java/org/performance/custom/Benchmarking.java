package org.performance.custom;

import com.carrotsearch.junitbenchmarks.BenchmarkRule;
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
public abstract class Benchmarking {
    protected Calculator aCalculator = null;
    public static Properties properties = new Properties();
    @BeforeClass
    public static void loadProperties() throws IOException {
        properties.load(new FileInputStream(new File("jub.properties")));
    }

    @Rule
    public TestRule benchmarkRun = new BenchmarkRule();


    @Before
    public void init(){
        aCalculator = new Calculator();
    }
}
