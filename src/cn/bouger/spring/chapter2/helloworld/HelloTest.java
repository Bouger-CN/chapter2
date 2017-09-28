package cn.bouger.spring.chapter2.helloworld;

import java.io.File;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import junit.framework.Assert;

public class HelloTest {
//	@Test
//	public void testHelloWorld(){
//		ApplicationContext context = new ClassPathXmlApplicationContext("chapter2/helloworld.xml");
//		HelloApi helloApi = context.getBean("hello",HelloApi.class);
//		helloApi.sayHello();
//	}
//	@Test
//	public void test2(){
////		File file = new File("chapter2/helloworld.xml");
////        Resource resource = new FileSystemResource(file);
////        BeanFactory beanFactory = new XmlBeanFactory(resource);
//        
//      //1.准备配置文件，从文件系统获取配置文件，默认是相对路径，可以指定绝对路径
////		File file = new File("fileSystemConfig.xml");
//        File file = new File("resources/chapter2/helloworld.xml");
//        Resource resource = new FileSystemResource(file);
//        //2.初始化容器
//        BeanFactory beanFactory = new XmlBeanFactory(resource);
//        //2、从容器中获取Bean
//        HelloApi helloApi = beanFactory.getBean("hello", HelloApi.class);
//        //3、执行业务逻辑
//        helloApi.sayHello();
//        
//	}
	
//	@Test
//	public void test3(){
//		//配置文件中没有配置bean名字
//		BeanFactory beanFactory =  
//	   new ClassPathXmlApplicationContext("chapter2/meiyoumingzi.xml");  
//	    //根据类型获取bean  
//	    HelloApi helloApi = beanFactory.getBean(HelloApi.class);  
//	    helloApi.sayHello();
//	}
//	
//	@Test
//	public void test4(){
//		BeanFactory beanFactory =  
//		new ClassPathXmlApplicationContext("chapter2/helloworld.xml");  
//		//根据id获取bean  
//		    HelloApi bean = beanFactory.getBean("hello", HelloApi.class);  
//		    bean.sayHello(); 
//	}
	
//	@Test
//	public void test5(){
//		//根据name（别名）获取对应的bean
//		//
//		BeanFactory beanFactory =  
//		new ClassPathXmlApplicationContext("chapter2/helloworld.xml");  
//		//根据name（别名）获取bean  
////		    HelloApi bean = beanFactory.getBean("helloname", HelloApi.class);  
////		    bean.sayHello();
////		    
////		    HelloApi bean2 = beanFactory.getBean("hello2",HelloApi.class);
////		    bean2.sayHello();
//		    
//		    String[] bean3Alias = beanFactory.getAliases("hello3");  
//		    //因此别名不能和id一样，如果一样则由IoC容器负责消除冲突  
//		    Assert.assertEquals(1, bean3Alias.length);
//	}
	
//	/**
//	 * 测试多个别名
//	 */
//	@Test
//	public void test6(){
//		BeanFactory beanFactory = new ClassPathXmlApplicationContext("chapter2/helloworld.xml");
//		HelloApi bean1 = beanFactory.getBean("hello4",HelloApi.class);
//		System.out.println("--根据ID获取bean--");
//		bean1.sayHello();
//		
//		HelloApi alias1 = beanFactory.getBean("hello4",HelloApi.class);
//		System.out.println("--根据别名获取bean--");
//		alias1.sayHello();
//		
//		String[] aliasList = beanFactory.getAliases("alias42");
//		System.out.println("--确认别名数量--");
//		for(String alias:aliasList){
//			System.out.println(alias);
//		}
//		Assert.assertEquals(4, aliasList.length);
//	}
	
	/**
	 * 使用<alias>标签指定别名，别名也必须在IoC容器中唯一
	 */
	@Test
	public void test7(){
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("chapter2/helloworld.xml");
		HelloApi bean = beanFactory.getBean("hello5",HelloApi.class);
		bean.sayHello();
		
//		HelloApi bean1 = beanFactory.getBean("alias51",HelloApi.class);
//		bean1.sayHello();
		
		String[] aliasList = beanFactory.getAliases("hello5");
		System.out.println("--确认别名数量--");
		for(String alias:aliasList){
			System.out.println(alias);
		}
		Assert.assertEquals(3, aliasList.length);
	}
	
	
	
	
	
}
