package org.automation.junit5.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Junit5Runner implements Runnable{
   private static final Logger logging = LoggerFactory.getLogger(Junit5Runner.class);
   private final List<Class<?>> testClasses;

   public Junit5Runner(List<Class<?>> testClasses) {
      this.testClasses = testClasses;
   }



   public void run(){
      logging.debug("Starting the executor");

   }
}
