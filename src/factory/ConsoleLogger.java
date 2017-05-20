package factory;

import designPatterns.LoggerInterface;

public class ConsoleLogger implements LoggerInterface{
	
	public int logLevel;
	
	public ConsoleLogger(int logLevel) {
		// TODO Auto-generated constructor stub
		this.logLevel= logLevel;
	}
	
	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		System.out.println(message);
	}

	
}
