package com.assignment.a3;

import com.assignment.a3.SoundBehaviour;

public class RoosterSound implements SoundBehaviour{
	public String sound(){
		System.out.println("Cock-a-doodle-doo");
		return "Cock-a-doodle-doo";
	}
}
