package com.tandeloopAssessment.test;

import java.util.Scanner;

public class Program_3 {
	
	static int digit(int n) {
		if(n == 1) {
			return 1;
		}
		String s = String.valueOf(n);
		return s.length() + digit(n-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.println(digit(n));
	}

}
