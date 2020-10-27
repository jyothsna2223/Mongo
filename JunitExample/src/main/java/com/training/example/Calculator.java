package com.training.example;

public class Calculator {

	public int sum(int x,int y) {
		return x+y;
	}
	public int diff(int x,int y) {
		return x-y;
	}
	public int div(int x,int y) {
		return x/y;
	}
	public double average(int x,int y,int z) {
		if(x>100 ||y>100 || z>100 ) {
			throw new ExceedingException("Value beyond limit");
		}
		if(x<=0 || y<=0 || z<=0 ) {
			throw new NegativevalueException("Value should not be negative");
		}
		return (x+y+z)/3;
	}

}
