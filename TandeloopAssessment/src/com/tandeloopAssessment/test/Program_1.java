package com.tandeloopAssessment.test;

import java.util.Scanner;

public class Program_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char operator;
		Double number1, number2, result;

		Scanner sc = new Scanner(System.in);
		System.out.println("Choose a operator : +, -, *,  or /");
		operator = sc.next().charAt(0);

		System.out.println("Enter the first number");
		number1 = sc.nextDouble();

		System.out.println("Enter the Second number");
		number2 = sc.nextDouble();

		switch (operator) {
		case '+':
			result = number1 + number2;
			System.out.println(number1 + "+" + number2 + "=" + result);
			break;

		case '-':
			result = number1 - number2;
			System.out.println(number1 + "-" + number2 + "=" + result);
			break;

		case '*':
			result = number1 * number2;
			System.out.println(number1 + "*" + number2 + "=" + result);
			break;

		case '/':
			result = number1 / number2;
			System.out.println(number1 + "/" + number2 + "=" + result);
			break;

		default:
			System.out.println("Invalid operator!");
			break;
		}

		sc.close();
	}

}
