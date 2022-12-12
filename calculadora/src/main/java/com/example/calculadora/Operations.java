package com.example.calculadora;

import java.util.ArrayList;

public class Operations {

	public double operandOne;
	public double operandTwo;
	public String operation = "";
	
	private ArrayList<Double> variables = new ArrayList<Double>();
	private ArrayList<String> simbolo = new ArrayList<String>();

	
	
	public Operations() {

	}

	public double getOperandOne() {
		return operandOne;
	}

	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}

	public double getOperandTwo() {
		return operandTwo;
	}

	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public void performOperation() {

	//	Operations operations = new Operations();

		this.setOperandOne(10.5);
		this.setOperandTwo(5.2);
		double var1=this.getOperandOne();
		double var2=this.getOperandTwo();
		this.setOperation("+");
		
		double result=0.0;
		
		if(this.getOperation().equalsIgnoreCase("+")) {
			result=var1+var2;
		}else {
			result=var1-var2;
		}

		System.out.println(result);

	}
	
	public void performOperation(double var) {
		variables.add(var);
		System.out.println(variables);
	}
	
	public void performOperation(String simb) {
		simbolo.add(simb);
		System.out.println(simbolo);
	}
	
	public void getResults() {
		System.out.printf("Resultado final es: ");
	}

}
