package com.your.dream.real;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger logger = LoggerFactory.getLogger(App.class);
	private App() 
	{
		// do not create App class directly
	}
	
    public static void main( String[] args ) {
    	for(String arg : args) {
			logger.info("My Message");
    	}
    }
}
