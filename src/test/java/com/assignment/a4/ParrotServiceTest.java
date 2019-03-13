package com.assignment.a4;

import org.junit.Test;

import com.assignment.a4.CatSound;
import com.assignment.a4.DogSound;
import com.assignment.a4.DuckSound;
import com.assignment.a4.Parrot;
import com.assignment.a4.PhoneSound;
import com.assignment.a4.RoosterSound;

import junit.framework.Assert;

public class ParrotServiceTest {
	
	@Test
	public void testRoosterSound(){
		Parrot parrot = new Parrot();
		parrot.setSoundBehaviour(new DogSound());
		Assert.assertEquals("Woof, woof", parrot.performSound());
		parrot.setSoundBehaviour(new DuckSound());
		Assert.assertEquals("Quack, quack", parrot.performSound());
		parrot.setSoundBehaviour(new CatSound());
		Assert.assertEquals("Meow", parrot.performSound());
		parrot.setSoundBehaviour(new RoosterSound());
		Assert.assertEquals("Cock-a-doodle-doo", parrot.performSound());
		parrot.setSoundBehaviour(new PhoneSound());
		//Assert.assertEquals("", parrot.performSound());
	}

}
