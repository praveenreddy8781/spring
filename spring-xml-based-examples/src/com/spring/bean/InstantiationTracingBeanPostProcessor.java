package com.spring.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InstantiationTracingBeanPostProcessor implements BeanPostProcessor, InitializingBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean:: afterPropertiesSet()");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) {
		System.out.println("BeanPostProcessor:: postProcessBeforeInitialization(Object bean, String beanName)");
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) {
		beanName += ":: changed";
		System.out.println("BeanPostProcessor:: postProcessAfterInitialization(Object bean, String beanName)");
		System.out.println("Bean '" + beanName + "' created : " + bean.toString());
		return bean;
	}
}
