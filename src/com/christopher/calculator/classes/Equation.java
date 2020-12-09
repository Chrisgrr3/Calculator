package com.christopher.calculator.classes;

public abstract class Equation {

	private double operandOne;
	private String operation;
	private double operandTwo;
	private double result;
	
	public abstract void performOperation();
	
	
	public Equation(int operandOne, String operation, int operandTwo) {
		// TODO Auto-generated constructor stub
		this.setOperandOne(operandOne);
		this.setOperation(operation);
		this.setOperandTwo(operandTwo);
	}
	
	public Equation() {
		
	}


	public double getOperandOne() {
		return operandOne;
	}


	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
		System.out.println("Set operandOne to " + Double.toString(this.operandOne));
	}


	public String getOperation() {
		return operation;
	}


	public void setOperation(String operation) {
		this.operation = operation;
		System.out.println("Set operation to " + this.operation);
	}


	public double getOperandTwo() {
		return operandTwo;
	}


	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
		System.out.println("Set operandTwo to " + Double.toString(this.operandTwo));
	}


	public double getResult() {
		System.out.println("Result: " + result);
		return result;
	}


	public void setResult(double result) {
		this.result = result;
	}
	
	

}
