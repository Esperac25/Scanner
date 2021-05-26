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

	public static double div(double i, double j) {
		return i / j;

	}

}