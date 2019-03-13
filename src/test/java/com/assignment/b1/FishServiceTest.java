package com.assignment.b1;

import org.junit.Test;

import com.assignment.b1.Clownfish;
import com.assignment.b1.ClownfishBehaviour;
import com.assignment.b1.Dolphin;
import com.assignment.b1.Fish;
import com.assignment.b1.Shark;
import com.assignment.b1.SharkBehaviour;
import com.assignment.b1.SwimBehaviour;

import junit.framework.Assert;

public class FishServiceTest {
	
	@Test
	public void testFishService(){
		Fish shark = new Shark();
		Assert.assertEquals("Sharks don’t sing", shark.sing());
		Assert.assertEquals("Sharks can swim",shark.swim());
		Assert.assertEquals("Sharks don't walk",shark.walk());

		Shark s = new Shark();
		s.setFishBehaviour(new SharkBehaviour());
		s.getFishBehaviour();
		Assert.assertEquals("Sharks are large and grey color",s.getFishColor());
		
		Fish clownfish = new Clownfish();
		Assert.assertEquals("Clownfish don’t sing",clownfish.sing());
		Assert.assertEquals("Clownfish can swim",clownfish.swim());
		Assert.assertEquals("Clownfish don't walk",clownfish.walk());
		
		Clownfish c = new Clownfish();
		c.setFishBehaviour(new ClownfishBehaviour());
		Assert.assertEquals("Clownfish make jokes",c.getFishBehaviour());
		Assert.assertEquals("Clownfish are small and colorful",c.getFishColor());

		SwimBehaviour d = new Dolphin();
		Assert.assertEquals("Dolphins are good swimmers",d.swim());
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
