package com.sample;

public class Computation{

public int add(int a , int b){
	int sum = a+b;
	System.out.println("Input numbers are : "+ a + " and " + b + " and their sum is "+sum);
	return sum;
}
public int subtract(int a , int b){
	int diff = a-b;
	System.out.println("Input numbers are : "+ a + " and " + b + " and their diff is "+diff);
	return diff;
}
}