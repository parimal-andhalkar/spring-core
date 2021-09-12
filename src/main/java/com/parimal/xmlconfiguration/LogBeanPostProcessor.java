package com.parimal.xmlconfiguration;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class LogBeanPostProcessor implements BeanPostProcessor {

	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		
		System.out.println(String.format("Bean instantiated with name %s and class %s", beanName, bean.getClass().getSimpleName()));
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(String.format("Bean instantiated with name %s and class %s", beanName, bean.getClass().getSimpleName()));
		return bean;
	}

	
}
