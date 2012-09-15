package com.allstar;

import static org.junit.Assert.assertSame;

import org.junit.Test;

import com.allstar.Experiment;

public class ExperimentTest {

	@Test
	public void test() {
		Experiment ec = new Experiment();
		int rVal = ec.getInt();
		assertSame("Not same", 2, rVal);
	}
}
