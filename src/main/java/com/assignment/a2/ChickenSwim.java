package com.assignment.a2;

public class ChickenSwim implements SwimBehaviour{

	@Override
	public String swim() {
		System.out.println("Chicken can't swim");
		return "Chicken can't swim";
	}

}
