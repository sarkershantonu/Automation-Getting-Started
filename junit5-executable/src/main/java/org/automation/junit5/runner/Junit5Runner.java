package org.automation.junit5.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Junit5Runner implements Runnable{
   private Logger logging = LoggerFactory.getLogger(Junit5Runner.class);


   public void run(){
      logging.debug("Starting the executor");

   }
}
