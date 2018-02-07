package com.sample;

public class ComputationMain{
	
public static void main (String args[]){
	if(args.length< 2)
	{	
		System.out.println("Usage :"+" java -jar compute.jar firstNumber secondNumber");
		System.exit(1);
	}
	try
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		Computation compute = new Computation();
		int sum = compute.add(a,b);
		System.out.println("Input numbers are: "+a + " and "+b + " and their sum is "+sum);
	}catch(Exception e){
		System.out.println("Computation of input numbers failed with error :"+e.getMessage());
		System.exit(1);
	}
}
}