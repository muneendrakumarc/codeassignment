package com.assignment.a2;

public class FlyWithWings implements FlyBehaviourIF{
	
	@Override
	public String fly(){
		System.out.println("I am flying");
		return "I am flying";
	}

}
