package test;

import java.util.logging.Level;

public class TestHello {

	private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TestHello.class.getName());

	public void test() {
		logger.log(Level.INFO, "test");
	}
}
