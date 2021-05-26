package com.qa.scanner;

import java.util.Scanner;

public class Runner {
	static Scanner mathScanner = new Scanner(System.in);

	public static void main(String[] arg) {

		boolean running = true;
		while (running) {
			System.out.println("Welcome to the Java calculator\n\t" + "Please enter a number from the following:\n\t"
					+ "1: Addition\n\t" + "2: Subtraction\n\t" + "3: Division\n\t" + "4: Multiplication\n\t"
					+ "5: Close Calculator");
			int res = 0;
			if(mathScanner == null) {
				res = 5;
			} 
			try{res = mathScanner.nextInt();
			}catch(Exception e){
				System.out.println(e);
			}

			switch (res) {
			case 1:
				print("Addition");
				continue;
			case 2:
				print("Subtraction");
				continue;
			case 3:
				print("Division");
				continue;
			case 4:
				print("Multiplication");
				continue;
			case 5:
				System.out.println("Application has closed");
				running = false;
				continue;
			default:
				running = false;
				break;
			}
			mathScanner.close();
		}
	}
	
	

	public static void print(String m) {
		System.out.println(m + ": Enter numbers below");
		try {
			double n1 = mathScanner.nextDouble();
			double n2 = mathScanner.nextDouble();
			System.out.println("= " + Calculator.calc(m, n1, n2));
		} catch (Exception e) {
			System.out.println("Exception cannot execute because: " + e);
		} 
		mathScanner.nextLine();
	}
}
