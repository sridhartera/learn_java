package com.company;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
//import org.apache.log4j.BasicConfigurator;
//Log4j.class

  
  public class Log4j {
		private static org.apache.log4j.Logger log = Logger.getLogger(Log4j.class);
		public static void main(String[] args) {		
			PropertyConfigurator.configure("emp-log4j.properties");
			//DOMConfigurator.configure("log4j.xml");
		log.trace("Trace");
		log.debug("Debug");
		log.info("Info");
		log.warn("Warn");
		log.error("Error");
		log.fatal("Fatal");
		log.info("-------end log------\n");
				
		}
	}

