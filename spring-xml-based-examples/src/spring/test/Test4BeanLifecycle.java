package spring.test;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.bean.BasicDataSource;
import com.spring.bean.Bean;
import com.spring.bean.Bean2;
import com.spring.bean.Bean3;
import com.spring.bean.Bean4;

public class Test4BeanLifecycle {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new FileSystemXmlApplicationContext(
				"/WebContent/WEB-INF/beanlifecycle.xml");

		System.out.println(applicationContext);

//		BeanLifeCycle - InitialingBean, DisposableBean
		Bean bean1 = (Bean) applicationContext.getBean("bean1");
		System.out.println("BeanLifeCycle - InitialingBean, DisposableBean::::::::bean1:: " + bean1);

//		@PostConstruct and @PreDestroy ANNOTATION BEASED
		Bean2 bean2 = (Bean2) applicationContext.getBean("bean2");
		System.out.println("@PostConstruct and @PreDestroy ANNOTATION BEASED::::::bean2:: " + bean2);

//		Using init-method and destroy-method attribute
		Bean3 bean3 = (Bean3) applicationContext.getBean("bean3");
		System.out.println("Using init-method and destroy-method attribute::::::::bean3:: " + bean3);

		Bean4 bean4 = (Bean4) applicationContext.getBean("bean4");
		System.out.println("Using init-method and destroy-method attribute::::::::bean4:: " + bean4);

//		PropertyPlaceholderConfigurer
		BasicDataSource basicDataSource = applicationContext.getBean("datasource", BasicDataSource.class);
		System.out.println("Using PropertyPlaceholderConfigurer::::::::");
		System.out.println("getDriverClassName: " + basicDataSource.getDriverClassName());
		System.out.println("getUrl(): " + basicDataSource.getUrl());
		System.out.println("getUserName(): " + basicDataSource.getUserName());
		System.out.println("getPassword(): " + basicDataSource.getPassword());
		
//		shutting down the applicationcontext
		applicationContext.registerShutdownHook();
	}
}
