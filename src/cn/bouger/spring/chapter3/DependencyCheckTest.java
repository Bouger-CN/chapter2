package cn.bouger.spring.chapter3;

import java.io.IOException;

import org.junit.Test;
import org.springframework.beans.factory.UnsatisfiedDependencyException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyCheckTest {
	@Test(expected = UnsatisfiedDependencyException.class)  
	public void testDependencyCheckByObject() throws IOException {  
	//���׳��쳣  
	    new ClassPathXmlApplicationContext("chapter3/dependency-check-object.xml");  
	    }  
}
