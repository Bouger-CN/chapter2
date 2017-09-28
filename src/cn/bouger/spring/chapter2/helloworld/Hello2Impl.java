package cn.bouger.spring.chapter2.helloworld;

public class Hello2Impl implements HelloApi {
	private String message;
	public Hello2Impl(){
		this.message = "Hello BinJiang";
	}
	public Hello2Impl(String message){
		this.message = message;
	}
	public Hello2Impl(String first,String message){
		this.message = first+message+"second";
	}
	@Override
	public void sayHello() {
		System.out.println(message);
	}

}
