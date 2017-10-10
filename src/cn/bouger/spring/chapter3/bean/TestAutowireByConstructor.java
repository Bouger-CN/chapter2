package cn.bouger.spring.chapter3.bean;

import java.io.IOException;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.bouger.spring.chapter2.helloworld.HelloApi;

public class TestAutowireByConstructor {
	@Test  
	public void testAutowireByConstructor() throws IOException {  
	ClassPathXmlApplicationContext context =  
	 new ClassPathXmlApplicationContext("chapter3/autowire-byConstructor.xml");  
	HelloApi helloApi = context.getBean("bean2", HelloApi.class);  
	helloApi.sayHello();  
	}  
}
