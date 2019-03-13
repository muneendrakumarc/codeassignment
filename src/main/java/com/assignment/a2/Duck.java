package com.assignment.a2;

public class Duck extends Bird{
	
	private FlyBehaviourIF flyBehaviour;
	private SoundBehaviour soundBehaviour;
	
	private SwimBehaviour swimBehaviour;
	
	
	public void setSwimBehaviour(SwimBehaviour swimBehaviour) {
		this.swimBehaviour = swimBehaviour;
	}

	public String performSound(){
		return soundBehaviour.sound();
	}
	
	public String performFly(){
		return flyBehaviour.fly();
	}
	
	public String performSwim(){
		return swimBehaviour.swim();
	}
	
	public void setFlyBehaviour(FlyBehaviourIF flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}
	public void setSoundBehaviour(SoundBehaviour soundBehaviour) {
		this.soundBehaviour = soundBehaviour;
	}
	//common behaviour for all animals 
	public void walk(){
		System.out.println("I am walking");
	}

}
