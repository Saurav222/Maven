package app1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//Log levels: T -trace, D -debug, I -Info, W -warn, E -error, F -fatal

public class LoggingDemo {
	private static Logger logger = LogManager.getLogger(LoggingDemo.class);
	public static void main(String[] args) {
//		System.out.println(); //never use this
		logger.fatal("fatal message");
		logger.error("error message");
		logger.warn("warningmessage");
		logger.info("info message");
		logger.debug("this is debug message");
		logger.trace("trace");
	}
}
