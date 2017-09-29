package cn.bouger.spring.chapter3.bean;

public class CircleC {
	public CircleC(){
		
	}
	public CircleC(CircleA circleA){
		
	}
	private CircleA circleA;
	public CircleA getCircleA() {
		return circleA;
	}
	public void setCircleA(CircleA circleA) {
		this.circleA = circleA;
	}
	
	public void c(){
		circleA.a();
	}
}
