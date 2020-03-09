package spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.service.ClientSeervice;

public class Test2instantiatingbeans {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(
				"/WebContent/WEB-INF/bean-defination.xml");

		System.out.println(applicationContext);

		ClientSeervice clientSeervice = (ClientSeervice) applicationContext.getBean("clientSeervice3");
		System.out.println("clientSeervice: " + clientSeervice);
	}
}
