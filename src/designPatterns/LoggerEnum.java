package designPatterns;

public enum LoggerEnum {
INSTANCE;
	public void log(String message){
		System.out.println(message);
	}
}
