package cn.bouger.spring.chapter3;

import cn.bouger.spring.chapter2.helloworld.HelloApi;

public class DependencyInjectByInstanceFactory {
	public HelloApi newInstance(String message,int index){
		return new Hello3Impl(message,index);
	}
}
