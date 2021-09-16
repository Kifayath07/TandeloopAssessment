package com.tandeloopAssessment.test;

import java.util.Scanner;

public class Program_2 {

	static int sum(int n) {
		int num = 0;
		while(n>0 || num>9)
		{
			if(n == 0) {
				n = num;
				num = 0;
				
			}
			num += n%10;
			n/= 10;
		}
		return num;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of your choice");
		int n = sc.nextInt();
	
		System.out.println(sum(n));

	}

}
