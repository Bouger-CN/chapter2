package cn.bouger.spring.chapter3;

import cn.bouger.spring.chapter2.helloworld.HelloApi;

public class Hello4Impl implements HelloApi {
	
	private String message;
	private int index;
	private String remark;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println(index +":"+message+"--remark--"+remark);
	}

}
