package cn.bouger.spring.chapter3.bean;

import org.springframework.util.StringUtils;

import cn.bouger.spring.chapter2.helloworld.HelloApi;

public class HelloApiDecorator implements HelloApi {
	private HelloApi helloApi;
	
	private String message;
	
	public HelloApi getHelloApi() {
		return helloApi;
	}

	public void setHelloApi(HelloApi helloApi) {
		this.helloApi = helloApi;
	}

	public  HelloApiDecorator(){
		
	}
	public HelloApiDecorator(HelloApi helloApi){
		this.helloApi = helloApi;
	}
	public HelloApiDecorator(String value){
		this.message = value;
	}
	@Override
	public void sayHello() {
		System.out.println("==========装饰一下==========="); 
		if(helloApi!=null){
			System.out.println("--helloApi有值--");
			helloApi.sayHello(); 
		}
         
        System.out.println("message = "+message);
        System.out.println("==========装饰一下===========");  
	}

}
