package cn.bouger.spring.chapter2.helloworld;

public class HelloApiInstanceFactory {
	public HelloApi newInstance(String message) {  
        return new Hello2Impl(message);  
	}  
}
