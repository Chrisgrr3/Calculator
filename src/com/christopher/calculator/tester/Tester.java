package com.christopher.calculator.tester;

import com.christopher.calculator.classes.Addition;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition example = new Addition();
		example.setOperandOne(10.5);
		example.setOperation("+");
		example.setOperandTwo(5.2);
		example.performOperation();
		example.getResult();
		
		System.out.println();
		
		Addition example2 = new Addition(5, "*", 5);
		example2.performOperation();
		example2.getResult();
	}

}
