package spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.service.PetStoreServiceImp;

public class Test1ApplicationContextLoadingBeans {

	public static void main(String[] args) {
		
//		create ApplicationContext by loading the configuration metadata
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(
				"/WebContent/WEB-INF/bean-defination.xml");

		System.out.println(applicationContext);

//		Getting bean
//		PetStoreServiceImp petStoreServiceImp = applicationContext.getBean(PetStoreServiceImp.class);
		
//		PetStoreServiceImp petStoreServiceImp = applicationContext.getBean("petStoreServiceImp",
//				PetStoreServiceImp.class);
		
//		PetStoreServiceImp petStoreServiceImp = applicationContext.getBean("petStore",
//				PetStoreServiceImp.class);
		
//		PetStoreServiceImp petStoreServiceImp = applicationContext.getBean("petStoreImpl",
//				PetStoreServiceImp.class);

		PetStoreServiceImp petStoreServiceImp = applicationContext.getBean("pet",
				PetStoreServiceImp.class);
		
		System.out.println(petStoreServiceImp);

//		calling a method on bean
		petStoreServiceImp.save();
		
		
		
	}

}
