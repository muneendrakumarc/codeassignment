package com.assignment.d1;

import org.junit.Test;

import com.assignment.d1.Butterfly;
import com.assignment.d1.Caterpillar;

public class ButterflyServiceTest {

	@Test
	public void testFishService(){
		Caterpillar caterpillar = new Caterpillar();
		caterpillar.walk();
		caterpillar.fly();

		caterpillar.setFlyBehaviour(new Butterfly());
		caterpillar.setSoundBehaviour(new Butterfly());

		caterpillar.performAction();
	}
}

