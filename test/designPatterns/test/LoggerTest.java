package designPatterns.test;

import static org.junit.Assert.*;

import org.junit.Test;

import designPatterns.LoggerClass;

public class LoggerTest {

	@Test
	public void test() {
		LoggerClass logger = LoggerClass.getInstance();
		logger.log("Test Message");
		
		LoggerClass logger1 = LoggerClass.getInstance();
		logger1.log("Test Message");
		assertEquals(true, true);
	}

}
