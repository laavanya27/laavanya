package designPatterns;

public class LoggerClass implements LoggerInterface {
	
	private static LoggerClass instance;
	
	private LoggerClass(){
		
	}
	
	public static LoggerClass getInstance(){
		if(instance==null)
		return new LoggerClass();
		
		return instance;
	}
		
	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		System.out.println(message);
	}

}
