package cn.bouger.spring.chapter3;

import cn.bouger.spring.chapter2.helloworld.HelloApi;

public class Hello3Impl implements HelloApi {
	private String message;
	private int index;
	public Hello3Impl(String message,int index){
		this.message = message;
		this.index = index;
	}

	@java.beans.ConstructorProperties({ "indexB","messageB"})
	public Hello3Impl(){
	}
	@Override
	public void sayHello() {
		System.out.println(index + ":" + message);
	}

}
