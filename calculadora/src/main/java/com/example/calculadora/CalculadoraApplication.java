package com.example.calculadora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculadoraApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraApplication.class, args);
		
		
		
		
		Operations operations = new Operations();
		
		operations.performOperation();
		
		operations.performOperation(10.5);
		operations.performOperation("+");
		operations.performOperation(5.2);
		operations.performOperation("*");
		operations.performOperation(10);
		operations.performOperation("=");
		
		operations.getResults();
	}

}
