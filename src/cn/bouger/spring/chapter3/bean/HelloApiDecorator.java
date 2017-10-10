package cn.bouger.spring.chapter3.bean;

import cn.bouger.spring.chapter2.helloworld.HelloApi;
import cn.bouger.spring.chapter3.Hello3Impl;

public class HelloApiDecorator implements HelloApi {
	private HelloApi helloApi;
	
//	private Hello3Impl hello3Impl;
	
	private String message;
	
	public HelloApi getHelloApi() {
		return helloApi;
	}

	public void setHelloApi(HelloApi helloApi) {
		this.helloApi = helloApi;
	}

	public  HelloApiDecorator(){
		
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	//	public HelloApiDecorator(HelloApi helloApi){
//		this.helloApi = helloApi;
//	}
	public HelloApiDecorator(String value){
		this.message = value;
	}
	
//	public Hello3Impl getHello3Impl() {
//		return hello3Impl;
//	}
//
//	public void setHello3Impl(Hello3Impl hello3Impl) {
//		this.hello3Impl = hello3Impl;
//	}

	
	
	@Override
	public void sayHello() {
		System.out.println("==========װ��һ��==========="); 
		if(helloApi!=null){
			System.out.println("--helloApi��ֵ--");
			helloApi.sayHello(); 
		}
         
        System.out.println("message = "+message);
        System.out.println("==========װ��һ��===========");  
        
        System.out.println("--hello3Impl ֵ���--");
        //hello3Impl.sayHello();
        
        
	}

}
