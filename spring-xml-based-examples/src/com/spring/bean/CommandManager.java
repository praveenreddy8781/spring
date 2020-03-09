package com.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

//public class CommandManager implements ApplicationContextAware {

public abstract class CommandManager{
	
//	ApplicationContext applicationContext;

	public CommandManager() {
		System.out.println("CommandManager() Constructor");
	}

	public Object process(Object someObject) {
		System.out.println("CommandManager: process(Object someObject)");
		AsynchCommand command = createCommand();
		return command.execute(new Object());
	}

//
//	@Override
//	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//		this.applicationContext = applicationContext;
//	}

//	Method Injection
//	public AsynchCommand createCommand() {
//		return this.applicationContext.getBean("command", AsynchCommand.class);
//	}

	@Lookup
	protected abstract AsynchCommand createCommand();
}
