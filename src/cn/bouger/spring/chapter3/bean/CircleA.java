package cn.bouger.spring.chapter3.bean;

public class CircleA {
	public CircleA(){
		
	}
	public CircleA(CircleB circleB){
		this.circleB = circleB;
	}
	private CircleB circleB;
	
	/**
	 * @return the cirlcleB
	 */
	public CircleB getCirlcleB() {
		return circleB;
	}
	/**
	 * @param cirlcleB the cirlcleB to set
	 */
	public void setCirlcleB(CircleB circleB) {
		this.circleB = circleB;
	}
	public void a(){
		circleB.b();
	}
	
}
