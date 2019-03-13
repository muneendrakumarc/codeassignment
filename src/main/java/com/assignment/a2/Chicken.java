package com.assignment.a2;

public class Chicken extends Bird{

	private FlyBehaviourIF flyBehaviour;
	private SoundBehaviour soundBehaviour;
	private SwimBehaviour swimBehaviour;
	
	
	public String performSound(){
		return soundBehaviour.sound();
	}
	public String performFly(){
		return flyBehaviour.fly();
	}
	
	public String performSwim(){
		return swimBehaviour.swim();
	}
	
	//setters
	
	public void setFlyBehaviour(FlyBehaviourIF flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}
	public void setSoundBehaviour(SoundBehaviour soundBehaviour) {
		this.soundBehaviour = soundBehaviour;
	}
	public void setSwimBehaviour(SwimBehaviour swimBehaviour) {
		this.swimBehaviour = swimBehaviour;
	}
}
