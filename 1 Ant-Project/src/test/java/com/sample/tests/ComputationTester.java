package com.sample.tests;

import org.junit.*;
import static org.junit.Assert.*;

import com.sample.Computation;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class ComputationTester{
	
	private static final Logger logger = LogManager.getFormatterLogger(ComputationTester.class);

    @Test
    public void addTester() {
    Computation comp = new Computation();
	assertEquals(5, comp.add(2,3));
	}

}