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
	
    @Test
    public void subtractTester() {
    	Computation comp = new Computation();
	assertEquals(-1, comp.subtract(2,3));
    }

}