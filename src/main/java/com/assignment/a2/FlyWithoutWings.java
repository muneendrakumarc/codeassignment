package com.assignment.a2;

public class FlyWithoutWings implements FlyBehaviourIF{
	
	@Override
	public String fly(){
		System.out.println("I am not flying");
		return "I am not flying";
	}

}
