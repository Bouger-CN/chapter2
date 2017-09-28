package cn.bouger.spring.chapter3.bean;

public class CircleB {
	public CircleB(){
		
	}
	public CircleB(CircleC circlec){
		
	}
	private CircleC circleC;
	public CircleC getCirclec() {
		return circleC;
	}
	public void setCirclec(CircleC circleC) {
		this.circleC = circleC;
	}
	
	public void b(){
		circleC.c();
	}
}
