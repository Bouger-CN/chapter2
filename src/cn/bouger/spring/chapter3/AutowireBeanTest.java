package cn.bouger.spring.chapter3;

import java.io.IOException;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.bouger.spring.chapter2.helloworld.HelloApi;

public class AutowireBeanTest {
	//根据类型自动装配
	 @Test  
	    public void testAutowireByName() throws IOException {  
	ClassPathXmlApplicationContext context =  
	new ClassPathXmlApplicationContext("chapter3/autowire-byName.xml");  
	        HelloApi helloApi = context.getBean("bean", HelloApi.class);  
	        helloApi.sayHello();  
	    }  
}
