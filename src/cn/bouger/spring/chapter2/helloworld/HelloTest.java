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
//      //1.׼�������ļ������ļ�ϵͳ��ȡ�����ļ���Ĭ�������·��������ָ������·��
////		File file = new File("fileSystemConfig.xml");
//        File file = new File("resources/chapter2/helloworld.xml");
//        Resource resource = new FileSystemResource(file);
//        //2.��ʼ������
//        BeanFactory beanFactory = new XmlBeanFactory(resource);
//        //2���������л�ȡBean
//        HelloApi helloApi = beanFactory.getBean("hello", HelloApi.class);
//        //3��ִ��ҵ���߼�
//        helloApi.sayHello();
//        
//	}
	
//	@Test
//	public void test3(){
//		//�����ļ���û������bean����
//		BeanFactory beanFactory =  
//	   new ClassPathXmlApplicationContext("chapter2/meiyoumingzi.xml");  
//	    //�������ͻ�ȡbean  
//	    HelloApi helloApi = beanFactory.getBean(HelloApi.class);  
//	    helloApi.sayHello();
//	}
//	
//	@Test
//	public void test4(){
//		BeanFactory beanFactory =  
//		new ClassPathXmlApplicationContext("chapter2/helloworld.xml");  
//		//����id��ȡbean  
//		    HelloApi bean = beanFactory.getBean("hello", HelloApi.class);  
//		    bean.sayHello(); 
//	}
	
//	@Test
//	public void test5(){
//		//����name����������ȡ��Ӧ��bean
//		//
//		BeanFactory beanFactory =  
//		new ClassPathXmlApplicationContext("chapter2/helloworld.xml");  
//		//����name����������ȡbean  
////		    HelloApi bean = beanFactory.getBean("helloname", HelloApi.class);  
////		    bean.sayHello();
////		    
////		    HelloApi bean2 = beanFactory.getBean("hello2",HelloApi.class);
////		    bean2.sayHello();
//		    
//		    String[] bean3Alias = beanFactory.getAliases("hello3");  
//		    //��˱������ܺ�idһ�������һ������IoC��������������ͻ  
//		    Assert.assertEquals(1, bean3Alias.length);
//	}
	
//	/**
//	 * ���Զ������
//	 */
//	@Test
//	public void test6(){
//		BeanFactory beanFactory = new ClassPathXmlApplicationContext("chapter2/helloworld.xml");
//		HelloApi bean1 = beanFactory.getBean("hello4",HelloApi.class);
//		System.out.println("--����ID��ȡbean--");
//		bean1.sayHello();
//		
//		HelloApi alias1 = beanFactory.getBean("hello4",HelloApi.class);
//		System.out.println("--���ݱ�����ȡbean--");
//		alias1.sayHello();
//		
//		String[] aliasList = beanFactory.getAliases("alias42");
//		System.out.println("--ȷ�ϱ�������--");
//		for(String alias:aliasList){
//			System.out.println(alias);
//		}
//		Assert.assertEquals(4, aliasList.length);
//	}
	
	/**
	 * ʹ��<alias>��ǩָ������������Ҳ������IoC������Ψһ
	 */
	@Test
	public void test7(){
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("chapter2/helloworld.xml");
		HelloApi bean = beanFactory.getBean("hello5",HelloApi.class);
		bean.sayHello();
		
//		HelloApi bean1 = beanFactory.getBean("alias51",HelloApi.class);
//		bean1.sayHello();
		
		String[] aliasList = beanFactory.getAliases("hello5");
		System.out.println("--ȷ�ϱ�������--");
		for(String alias:aliasList){
			System.out.println(alias);
		}
		Assert.assertEquals(3, aliasList.length);
	}
	
	
	
	
	
}
