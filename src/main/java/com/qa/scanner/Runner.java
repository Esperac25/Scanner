package com.qa.scanner;

import java.util.Scanner;

public class Runner {
	static Scanner mathScanner = new Scanner(System.in);

	public static void main(String[] arg) {

		boolean running = true;
		do {
			System.out.println("Welcome to the Java calculator\n\t" + "Please enter a number from the following:\n\t"
					+ "1: Addition\n\t" + "2: Subtraction\n\t" + "3: Division\n\t" + "4: Multiplication\n\t"
					+ "5: Close Calculator");
			int res = Integer.parseInt(mathScanner.nextLine());// parses the string comes back as an integer

			switch (res) {
			case 1:
				print("Addition");
				break;
			case 2:
				print("Subtraction");
				break;
			case 3:
				print("Division");
				break;
			case 4:
				print("Multiplication");
				break;
			case 5:
				System.out.println("Application has closed");
				running = false;
				break;
			default:
				running = false;
				break;
			}
		} while (running);

		mathScanner.close();
	}

	public static void print(String m) {
		System.out.println(m + ": Enter numbers below");
		int n1 = Integer.parseInt(mathScanner.nextLine());
		int n2 = Integer.parseInt(mathScanner.nextLine());
		System.out.println("= " + Calculator.calc(m, n1, n2));
	}
}
