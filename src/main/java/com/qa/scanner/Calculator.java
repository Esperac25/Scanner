package com.qa.scanner;



public class Calculator {

	public static double calc(String m, double n1, double n2) {
		if (m == "Addition") {
			return add(n1, n2);
		} else if (m == "Subtraction") {
			return sub(n1, n2);
		} else if (m == "Multiplication") {
			return multi(n1, n2);
		} else {
			return div(n1,n2);
			
		}
		
	}

	public static double add(double i, double j) {
		return i + j;
	}

	public static double sub(double n1, double n2) {
		return n1 - n2;

	}

	public static double multi(double n1, double n2) {
		return n1 * n2;
	}

	public static double div(double i, double j) {
		try {
			return i/j;
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} 
		return 0;	
	} 
//	public static void divException(double i, double j){
//		try {
//			if(i == 0 || j == 0) {
//				System.out.print("Error: cannot divide by 0");
//				System.out.print(div(i, j));
//			}
//			
//		} catch (InputMismatchException e) {
//			System.out.println("Error: input must be a number");
//			System.out.println(e);
//		}
//	}

	}

