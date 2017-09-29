package cn.bouger.spring.chapter3.bean;

public class CircleB {
	public CircleB(){
		
	}
	public CircleB(CircleC circleC){
		
	}
	private CircleC circleC;
	public CircleC getCircleC() {
		return circleC;
	}
	public void setCircleC(CircleC circleC) {
		this.circleC = circleC;
	}
	
	public void b(){
		circleC.c();
	}
}
