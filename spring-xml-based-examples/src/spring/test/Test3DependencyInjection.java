package spring.test;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.bean.CollectionMerge;
import com.spring.bean.CommandManager;
import com.spring.bean.Company;
import com.spring.bean.ComplexObject;
import com.spring.bean.Employee;
import com.spring.bean.ExampleBean;
import com.spring.bean.InstituteBean;
import com.spring.datasource.BasicDataSource;
import com.spring.service.PetStoreServiceImp;

public class Test3DependencyInjection {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(
				"/WebContent/WEB-INF/depenedency-injection-defination.xml");

		System.out.println(applicationContext);

//		Straight values (primitives, Strings, and so on)
		BasicDataSource basicDataSource = applicationContext.getBean("basicDataSource", BasicDataSource.class);
		System.out.println("Straight values (primitives, Strings, and so on): " + basicDataSource);

//		Configuring an instance as: java.util.Properties
		PropertyPlaceholderConfigurer placeholderConfigurer = applicationContext.getBean("mappings",
				PropertyPlaceholderConfigurer.class);
		System.out.println("Configuring an instance as: java.util.Properties: " + placeholderConfigurer);

//		Using collection
		ComplexObject collections = applicationContext.getBean("collections", ComplexObject.class);

//		Properties
		Properties properties = collections.getProperties();
		System.out.println("properties: " + properties);

		Set<Map.Entry<Object, Object>> propertyEntries = properties.entrySet();
		for (Map.Entry<Object, Object> entry : propertyEntries) {
			System.out.print(entry.getKey() + "=> ");
			System.out.print(entry.getValue());
			System.out.println();
		}

//		list
		List<Object> list = collections.getList();
		System.out.println("list::" + list);
		Object str = list.get(0);
		System.out.println("str: " + str);

//		set
		Set<Object> set = collections.getSet();
		System.out.println("set::" + set);

//		map
		Map<String, String> map = collections.getMap();
		System.out.println("map::" + map);

//		Collection Merging
		CollectionMerge collectionMerge = applicationContext.getBean("child", CollectionMerge.class);
		System.out.println("collectionMerge::" + collectionMerge);

//		Null and empty string values
		ExampleBean exampleBean1 = applicationContext.getBean("exampleBean1", ExampleBean.class);
		System.out.println("Null and empty string values::" + exampleBean1);

//		XML shortcut with the p-namespace
//		ExampleBean exampleBean2 = applicationContext.getBean("exampleBean2", ExampleBean.class);
		ExampleBean exampleBean3 = applicationContext.getBean("exampleBean3", ExampleBean.class);
		System.out.println("XML shortcut with the p-namespace::" + exampleBean3);

//		XML shortcut with the c-namespace
		ExampleBean exampleBean4 = applicationContext.getBean("exampleBean4", ExampleBean.class);
		System.out.println("XML shortcut with the c-namespace:: " + exampleBean4);

//		Using depends-on
		InstituteBean instituteBean = applicationContext.getBean("instituteBean", InstituteBean.class);
		System.out.println("instituteBean Using depends-on:: " + instituteBean);
		System.out.println("getManagerBean:: " + instituteBean.getManagerBean());

//		Lazy-init
//		applicationContext.getBean("exampleBean5", ExampleBean.class);

//		Autowiring collaborators
		Employee employee = applicationContext.getBean("employee1", Employee.class);
		System.out.println(employee.getAddress());

//		Method injection
		CommandManager commandManager = applicationContext.getBean("commandManager", CommandManager.class);
		commandManager.process(new Object());

//		Bean scopes: singleton
		Company company1 = applicationContext.getBean("company1", Company.class);
		Company company2 = applicationContext.getBean("company1", Company.class);

		System.out.println(company1);
		System.out.println(company2);
		
		company1.setName("Apple");
		
		System.out.println(company1.getName());
		System.out.println(company2.getName());

	}
}
