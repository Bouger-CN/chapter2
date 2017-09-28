package cn.bouger.spring.chapter3;

import org.junit.Test;
import org.springframework.beans.factory.BeanCurrentlyInCreationException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.bouger.spring.chapter2.helloworld.HelloApi;
import cn.bouger.spring.chapter3.bean.HelloApiDecorator;
import cn.bouger.spring.chapter3.bean.NavigationA;
import cn.bouger.spring.chapter3.bean.NavigationC;

public class HelloTest3 {
//	@Test
//	 public void testConstructorDependencyInjectTest() {
//	 BeanFactory beanFactory = new ClassPathXmlApplicationContext("chapter3/constructorDependencyInject.xml");
//	 //获取根据参数索引依赖注入的Bean
//	 HelloApi byIndex = beanFactory.getBean("byIndex", HelloApi.class);
//	 byIndex.sayHello();
//	 //获取根据参数类型依赖注入的Bean
//	 HelloApi byType = beanFactory.getBean("byType", HelloApi.class);
//	 byType.sayHello();
//	 //获取根据参数名字依赖注入的Bean
//	 HelloApi byName = beanFactory.getBean("byName", HelloApi.class);
//	 byName.sayHello();
//	}
//	
//	/**
//	 * 静态工厂方法注入
//	 */
//	@Test
//	 public void staticFactoryTest() {
//	 BeanFactory beanFactory = new ClassPathXmlApplicationContext("chapter3/staticFactoryDependencyInject.xml");
//	 //获取根据参数索引依赖注入的Bean
//	 HelloApi byIndex = beanFactory.getBean("byIndex", HelloApi.class);
//	 byIndex.sayHello();
//	 //获取根据参数类型依赖注入的Bean
//	 HelloApi byType = beanFactory.getBean("byType", HelloApi.class);
//	 byType.sayHello();
//	 //获取根据参数名字依赖注入的Bean
//	 HelloApi byName = beanFactory.getBean("byName", HelloApi.class);
//	 byName.sayHello();
//	}
	
	/**
	 * 实例工厂方法注入
	 */
//	@Test
//	 public void instanceFactoryTest() {
//	 BeanFactory beanFactory = new ClassPathXmlApplicationContext("chapter3/instanceFactoryDependencyInject.xml");
//	 //获取根据参数索引依赖注入的Bean
//	 HelloApi byIndex = beanFactory.getBean("byIndex", HelloApi.class);
//	 byIndex.sayHello();
//	 //获取根据参数类型依赖注入的Bean
//	 HelloApi byType = beanFactory.getBean("byType", HelloApi.class);
//	 byType.sayHello();
//	 //获取根据参数名字依赖注入的Bean
//	 HelloApi byName = beanFactory.getBean("byName", HelloApi.class);
//	 byName.sayHello();
//	}

/**
 * setter 注入
 */
//	@Test  
//	public void testSetterDependencyInject() {  
//	    BeanFactory beanFactory =  
//	new ClassPathXmlApplicationContext("chapter3/setterDependencyInject.xml");  
//	   Hello4Impl bean = beanFactory.getBean("bean", Hello4Impl.class); 
//	   //HelloApi bean2 = beanFactory.getBean("bean", HelloApi.class); 
//	    bean.sayHello();  
//	    System.out.println(bean.getRemark());
//	}
	
	
/**
 * 错误的方法
 */
//	@Test  
//	public void testSetterDependencyInject() {  
//	    BeanFactory beanFactory =  
//	new ClassPathXmlApplicationContext("chapter3/idRefInject.xml");  
//	   HelloApi bean = beanFactory.getBean("bean1", HelloApi.class);  
//	    bean.sayHello();  
//	}
	
//	 @Test
//	    public void testIdRefInject() {
//	        BeanFactory beanFactory = new ClassPathXmlApplicationContext("chapter3/idRefInject.xml");
//
//	        IdRefTestBean bean1 = beanFactory.getBean("idrefBean1", IdRefTestBean.class);
//	        System.out.println(bean1.getRefName());
//	        System.out.println(bean1.getId());
//	        
//	        IdRefTestBean bean2 = beanFactory.getBean("idrefBean2", IdRefTestBean.class);
//	        System.out.println(bean2.getRefName());
//	        System.out.println(bean2.getId());
//	    }
	/**
	 * 集合注入测试
	 */
//	@Test  
//	public void testListInject() {  
//	   BeanFactory beanFactory =  
//	new ClassPathXmlApplicationContext("chapter3/listInject.xml");  
//	//ListTestBean listBean = beanFactory.getBean("listBean", ListTestBean.class); 
//	CollectionTestBean listBean = beanFactory.getBean("setBean", CollectionTestBean.class);
//	System.out.println(listBean.getSetVals());
//	for(String var:listBean.getSetVals()){
//		System.out.println(var);
//	}
//	System.out.println(listBean.getSetVals().size());  
//	Assert.assertEquals(3, listBean.getValues().size());  
//	}  
	 
	/**
	 * 数组注入测试
	 */
//	@Test
//	public void testArrayList(){
//		BeanFactory beanFactory = new ClassPathXmlApplicationContext("chapter3/arrayInject.xml");
//		ArrayTestBean arrayBean = beanFactory.getBean("arrayBean",ArrayTestBean.class);
//		System.out.println("一维数组长度"+arrayBean.getArray().length);
//		System.out.println("二维数组长度"+arrayBean.getArray2().length);
//		Assert.assertEquals(2, arrayBean.getArray2().length);
//	}
	 
	/**
	 * Map注入测试
	 */
//	@Test
//	public void testMapList(){
//		BeanFactory beanFactory = new ClassPathXmlApplicationContext("chapter3/mapInject.xml");
//		MapTestBean mapBean = beanFactory.getBean("mapBean",MapTestBean.class);
//		System.out.println(mapBean.getValues().size());
//		Assert.assertEquals(2, mapBean.getValues().size());
//	}
	
	/**
	 * Porperties类注入测试
	 */
//	@Test
//	public void testPropertiesList(){
//		BeanFactory beanFactory = new ClassPathXmlApplicationContext("chapter3/testPropertiesInject.xml");
//		PropertiesTestBean propertiesBean = beanFactory.getBean("propertiesBean",PropertiesTestBean.class);
//		System.out.println(propertiesBean.getValues().size());
//		//Assert.assertEquals(2, propertiesBean.getValues().size());
//	}
	
	/**
	 * 引用其他bean
	 */
//	@Test
//	public void testBeanInject(){
//		BeanFactory beanFactory = new ClassPathXmlApplicationContext("chapter3/beanInject.xml");
//		HelloApiDecorator bean = beanFactory.getBean("testBean3",HelloApiDecorator.class);
//		bean.sayHello();
//		
//	}
	
//	@Test
//	public void testLocalAndparentBeanInject(){
//		ApplicationContext parentBeanContext = 
//				new ClassPathXmlApplicationContext("chapter3/parentBeanInject.xml");
//		
//		ApplicationContext beanContext = 
//				new ClassPathXmlApplicationContext(new String[] {"chapter3/localBeanInject.xml"},parentBeanContext);
//		HelloApi bean1 = beanContext.getBean("bean1", HelloApi.class);  
//	    bean1.sayHello();//该Bean引用local bean  	
//		HelloApi bean2 = beanContext.getBean("bean2", HelloApi.class);  
//		bean2.sayHello();//该Bean引用parent bean
//	}
	
//	@Test  
//	public void testInnerBeanInject() {  
//	ApplicationContext context =  
//	new ClassPathXmlApplicationContext("chapter3/innerBeanInject.xml");  
//	HelloApi bean = context.getBean("bean", HelloApi.class);  
//	bean.sayHello();  
//	}
	
//	/**
//	 * 3.1.10
//	 * 
//	 */
//	
//	//对象图导航  
//	@Test  
//	public void testNavigationBeanInject() {  
//	ApplicationContext context =  
//	new ClassPathXmlApplicationContext("chapter3/navigationBeanInject.xml");         
//	NavigationA navigationA = context.getBean("a", NavigationA.class);  
//	navigationA.getNavigationB().getNavigationC().sayNavigation();  
//	navigationA.getNavigationB().getList().get(0).sayNavigation();  
//	navigationA.getNavigationB().getMap().get("key").sayNavigation();  
//	navigationA.getNavigationB().getArray()[0].sayNavigation();  
//	((NavigationC)navigationA.getNavigationB().getProperties().get("1"))  
//	.sayNavigation();         
//	}  
	
	
	/**
	 * 循环引用
	 */
	
//	@Test(expected = BeanCurrentlyInCreationException.class)  
//	public void testCircleByConstructor() throws Throwable {  
//	try {  
//	      new ClassPathXmlApplicationContext("chapter3/circleInjectByConstructor.xml");  
//	    }  
//	    catch (Exception e) {  
//	      //因为要在创建circle3时抛出；  
//	      Throwable e1 = e.getCause().getCause().getCause();  
//	      throw e1;  
//	    }  
//	}  
	
	//测试代码cn.javass.spring.chapter3.CircleTest  
	@Test(expected = BeanCurrentlyInCreationException.class)  
	public void testCircleBySetterAndPrototype () throws Throwable {  
	    try {  
	        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(  
	"chapter3/circleInjectBySetterAndPrototype.xml");  
	        System.out.println(ctx.getBean("circleA"));  
	    }  
	    catch (Exception e) {  
	        Throwable e1 = e.getCause().getCause().getCause();  
	        throw e1;  
	    }  
	}  
	
}
