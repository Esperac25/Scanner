package com.qa.scanner;

public class Calculator {

	public static double calc(String m, int i, int j) {
		if (m == "Addition") {
			return add(i, j);
		} else if (m == "Subtraction") {
			return sub(i, j);
		} else if (m == "Multiplication") {
			return multi(i, j);
		} else {
			return div(i, j);
		}
	}

	public static int add(int i, int j) {
		return i + j;
	}

	public static int sub(int i, int j) {
		return i - j;

	}

	public static int multi(int i, int j) {
		return i * j;
	}

	public static double div(int i, int j) throws IllegalArgumentException {
//		 try { 
//			 	double s = i/j;
//	           System.out.println(s);
//	        } catch(IllegalArgumentException e) {
//	        	if(i == 0 || j == 0) {
//	        		throw new IllegalArgumentException("Error: cannot divide by 0");
//	        	}
//	        	else if(i !== (int i) || ) {
//	        		throw new IllegalArgumentException("Error: type mismatched, please enter a number");
//	        	} else {
//	        		System.out.println(e);
//	        	}
		return i/j;
	        } 
		

	}

