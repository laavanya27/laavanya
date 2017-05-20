package factory;

import designPatterns.LoggerInterface;

public class ConsoleLoggerFactory implements LoggerFactory{

	@Override
	public LoggerInterface createLogger() {
		// TODO Auto-generated method stub
		return new ConsoleLogger(1);
	}

}
