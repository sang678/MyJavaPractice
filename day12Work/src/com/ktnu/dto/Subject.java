package com.ktnu.dto;

public class Subject {
	
	
	//Filed
	private double algorithm;
	private double dataStructure;
	private double swEngineering;
	private double java;
	protected double avg;
	
	public Subject() {
		// TODO Auto-generated constructor stub
	}
	
	public Subject(double algorithm, double dataStructure, double swEngineering, double java)
	{
		this.algorithm = algorithm;
		this.dataStructure = dataStructure;
		this.swEngineering = swEngineering;
		this.java = java;
		
		avg = (this.algorithm + this.dataStructure + this.swEngineering + this.java ) / 4;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "algorithm : " + algorithm + " dataStructure : " + dataStructure + " swEngineering : " + swEngineering + " java : " + java; 
	}
	
	private void avgCalculator()
	{
		avg = (this.algorithm + this.dataStructure + this.swEngineering + this.java ) / 4;
	}
	
	
	public double getAlgorithm() {
		return algorithm;
	}
	public double getDataStructure() {
		return dataStructure;
	}
	public double getJava() {
		return java;
	}
	public double getSwEngineering() {
		return swEngineering;
	}
	public void setAlgorithm(double algorithm) {
		this.algorithm = algorithm;
		avgCalculator();
	}
	public void setDataStructure(double dataStructure) {
		this.dataStructure = dataStructure;
		avgCalculator();
	}
	public void setJava(double java) {
		this.java = java;
		avgCalculator();
	}
	public void setSwEngineering(double swEngineering) {
		this.swEngineering = swEngineering;
		avgCalculator();
	}

}
