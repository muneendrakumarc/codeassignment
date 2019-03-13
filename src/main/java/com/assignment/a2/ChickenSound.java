package com.assignment.a2;

public class ChickenSound implements SoundBehaviour{
	
	@Override
	public String sound(){
		System.out.println("Cluck, cluck");
		return "Cluck, cluck";
		
	}
}
