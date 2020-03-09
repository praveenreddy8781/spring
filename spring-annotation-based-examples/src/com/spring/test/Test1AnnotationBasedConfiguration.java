package com.spring.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.bean.Employee1;
import com.spring.bean.Employee2;
import com.spring.bean.Employee3;
import com.spring.bean.Employee4;
import com.spring.bean.Employee5;
import com.spring.bean.Employee6;
import com.spring.bean.Employee7;
import com.spring.bean.SimpleMovieCatalog;

public class Test1AnnotationBasedConfiguration {

	public static void main(String[] args) {

//		create ApplicationContext by loading the configuration metadata
		ConfigurableApplicationContext applicationContext = new FileSystemXmlApplicationContext(
				"/WebContent/WEB-INF/bean-defination.xml");

		System.out.println(applicationContext);

		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

//		@Required
		Employee1 employee1 = applicationContext.getBean("employeeBean1", Employee1.class);
		System.out.println("@Required:: employee1 : " + employee1 + " getAddress:: " + employee1.getAddress());

//		@Autowire on constructor
		Employee2 employee2 = applicationContext.getBean("employeeBean2", Employee2.class);
		System.out.println(
				"@Autowire on constructor:: employee2 : " + employee2 + " getAddress:: " + employee2.getAddress());

//		@Autowire on setter method
		Employee3 employee3 = applicationContext.getBean("employeeBean3", Employee3.class);
		System.out.println(
				"@Autowire on setter method:: employee3 : " + employee3 + " getAddress:: " + employee3.getAddress());

//		@Autowire on arbitary method
		Employee4 employee4 = applicationContext.getBean("employeeBean4", Employee4.class);
		System.out.println(
				"@Autowire on arbitary method:: employee4 : " + employee4 + " getAddress:: " + employee4.getAddress());

//		@Autowired : You can apply
//		to fields as well and even mix it with constructors:
		Employee5 employee5 = applicationContext.getBean("employee5", Employee5.class);
		System.out
				.println("@Autowired : You can apply to fields as well and even mix it with constructors:: employee5 : "
						+ employee5 + " getAddress:: " + employee5.getAddress() + " getAccount():: "
						+ employee5.getAccount());

//		@Autowired : annotation to a field or method that expects an array of that type:
		Employee6 employee6 = applicationContext.getBean("employee6", Employee6.class);
		System.out.println(
				"@Autowired : annotation to a field or method that expects an array of that type:: employee6 : "
						+ employee6 + " getAddress:: " + employee6.getAddress());

//		@Autowired : annotation to a field or method that expects collection
		Employee7 employee7 = applicationContext.getBean("employee7", Employee7.class);
		System.out.println("@Autowired : annotation to a field or method that expects collection:: employee6 : "
				+ employee7 + " getAddress:: " + employee7.getAddress());

//		Using Primary in xml config
		SimpleMovieCatalog catalog = applicationContext.getBean(SimpleMovieCatalog.class);
		System.out.println("Using Primary in xml config::" + catalog);

		applicationContext.registerShutdownHook();
	}

}
