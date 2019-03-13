package com.assignment.a2;

import org.junit.Test;

import com.assignment.a2.Chicken;
import com.assignment.a2.ChickenSound;
import com.assignment.a2.ChickenSwim;
import com.assignment.a2.Duck;
import com.assignment.a2.DuckSound;
import com.assignment.a2.DuckSwim;
import com.assignment.a2.FlyWithWings;
import com.assignment.a2.FlyWithoutWings;

import junit.framework.Assert;

public class DuckServiceTest {

	@Test
	public void test(){
		Duck duck = new Duck();
		duck.setFlyBehaviour(new FlyWithWings());
		Assert.assertEquals("I am flying",duck.performFly());

		duck.setSoundBehaviour(new DuckSound());
		Assert.assertEquals("Quack, quack",duck.performSound());

		duck.setSwimBehaviour(new DuckSwim());
		Assert.assertEquals("Duck can Swim",duck.performSwim());

		//Chicken
		Chicken chicken = new Chicken();
		chicken.setFlyBehaviour(new FlyWithoutWings());
		Assert.assertEquals("I am not flying",chicken.performFly());

		chicken.setSoundBehaviour(new ChickenSound());
		Assert.assertEquals("Cluck, cluck",chicken.performSound());

		chicken.setSwimBehaviour(new ChickenSwim());
		Assert.assertEquals("Chicken can't swim",chicken.performSwim());
	}

}
