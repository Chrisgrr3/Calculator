package com.christopher.calculator.classes;

public class Addition extends Equation {

	public Addition(int operandOne, String operation, int operandTwo) {
		super(operandOne, operation, operandTwo);
		// TODO Auto-generated constructor stub
	}

	public Addition() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void performOperation() {
		// TODO Auto-generated method stub
		double o1 = this.getOperandOne();
		double o2 = this.getOperandTwo();
		if (this.getOperation() == "+") {
			this.setResult(o1 + o2);
		}
		else if (this.getOperation() == "-") {
			this.setResult(o1 - o2);
		}
		else if (this.getOperation() == "*") {
			this.setResult(o1 * o2);
		}
		else if (this.getOperation() == "/") {
			this.setResult(o1 / o2);
		}
		System.out.println("Calculation successful");
	}

}
