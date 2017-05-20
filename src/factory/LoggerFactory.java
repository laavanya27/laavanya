package factory;

import designPatterns.LoggerInterface;

public interface LoggerFactory {

	public LoggerInterface createLogger();
	
	public static LoggerInterface createLogger(String loggerType){
		switch(loggerType){
		case "Console":
			ConsoleLoggerFactory f = new ConsoleLoggerFactory();
			return f.createLogger();
		default :
			return null;
		}
	}
	
	
}
