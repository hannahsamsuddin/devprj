package com.nissan.devop;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAdd {

	@Test
	public void test() {
		//fail("Not yet implemented");
		Addnum ad = new Addnum();
		assertEquals(5.0,ad.add(2.0, 3.0),0.001);
	}

}
