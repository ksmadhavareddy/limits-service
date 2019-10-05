package com.example.microservices.limitsservice.bean;

public class LimitConfiguration {

	private int minimum;
	private int maximum;
	
	private int limit1;
	private int limit2;
	
	
	protected LimitConfiguration() {

	}
	
	
	public LimitConfiguration(int minimum, int maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	
	
}
