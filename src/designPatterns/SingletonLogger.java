package designPatterns;

public class SingletonLogger implements LoggerInterface{

	private SingletonLogger(){
		
	}
	
 public static class LoggerHolder{
	 private static final SingletonLogger INSTANCE= new SingletonLogger();
	 
	 public static SingletonLogger getInstance(){
		 return LoggerHolder.INSTANCE;
	 }
 }
 @Override
	public void log(String message) {
		// TODO Auto-generated method stub
		System.out.println(message);
	}
}
