package cn.bouger.spring.chapter2.helloworld;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstantiatingContainerTest {
	@Test
	public void test(){
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("chapter2/instantiatingBean.xml");
		HelloApi bean1 = beanFactory.getBean("bean1",HelloApi.class);
		bean1.sayHello();
		HelloApi bean2 = beanFactory.getBean("bean2",HelloApi.class);
		bean2.sayHello();
	}
	
	@Test
	public void test2(){
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("chapter2/instantiatingBean.xml");
		HelloApi bean3 = beanFactory.getBean("bean3",HelloApi.class);
		bean3.sayHello();
	}
	
	@Test
	public void test3(){
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("chapter2/instantiatingBean.xml");
		HelloApi bean4 = beanFactory.getBean("bean4",HelloApi.class);
		bean4.sayHello();
	}
}
