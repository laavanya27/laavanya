package main;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import abstractfactory.Factory;
import abstractfactory.RoomFactory;
import designPatterns.LoggerEnum;
import designPatterns.SingletonLogger;
import designPatterns.SingletonLogger.LoggerHolder;

public class TestClass {
public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	
	TestClass.singletonInnerClassTest();
	TestClass.singletonEnumTest();
	
}

public static void singletonInnerClassTest() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
	SingletonLogger obj = LoggerHolder.getInstance();
	obj.log("Logger Class");
	
	SingletonLogger obj2 = null ;
	
	for(Constructor<?> constructor : SingletonLogger.class.getDeclaredConstructors()){
		constructor.setAccessible(true);
		obj2 = (SingletonLogger) constructor.newInstance();
		break;
	}
	
	System.out.println(obj.hashCode());
	System.out.println(obj2.hashCode());
}

public static void singletonEnumTest(){
	LoggerEnum obj = LoggerEnum.INSTANCE;
	obj.log("Test");
	LoggerEnum obj2 = LoggerEnum.INSTANCE;
	System.out.println(obj.hashCode());
	System.out.println(obj2.hashCode());	
}

public static void abstractFactoryTest(){
	Factory factory = null;
	RoomFactory roomFactory = factory.getFactory();
	roomFactory.createDoor();
}

}
