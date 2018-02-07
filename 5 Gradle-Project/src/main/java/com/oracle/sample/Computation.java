package com.oracle.sample;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Computation{
	
private static final Logger logger = LogManager.getLogger("ComputationTester");

public int add(int a , int b){
	int sum = a+b;
	System.out.println("Input numbers are : "+a + " and "+b + " and their sum is "+sum);
	return sum;
}
public int subtract(int a , int b){
	int diff = a-b;
	System.out.println("Input numbers are : "+a + " and "+b + " and their diff is "+diff);
	return diff;
}
}