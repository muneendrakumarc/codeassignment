package com.assignment.a3;


public class Rooster extends Bird{
	private SoundBehaviour soundBehaviour;
	private FlyBehaviourIF flyBehaviour;

	public void setSoundBehaviour(SoundBehaviour soundBehaviour) {
		this.soundBehaviour = soundBehaviour;
	}

	public void setFlyBehaviour(FlyBehaviourIF flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	
	public String performSound(){
		return soundBehaviour.sound();
	}
	
	public String performFly(){
		return flyBehaviour.fly();
	}

}
