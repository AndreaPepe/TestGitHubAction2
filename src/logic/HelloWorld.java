package logic;

import java.util.logging.Level;

public class HelloWorld {
	
	private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(HelloWorld.class.getName());
	
	public static void main(String[] args) {
		// print "Hello World!" to the standard output
		logger.log(Level.INFO"Hello World!!!");
	}

}
