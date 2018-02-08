package com.sample.tests;

import org.junit.*;
import static org.junit.Assert.*;

import com.sample.Computation;

public class ComputationTester{

    @Test
    public void addTester() {
    Computation comp = new Computation();
	assertEquals(5, comp.add(2,3));
	}

}