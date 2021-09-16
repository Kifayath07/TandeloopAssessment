package com.tandeloopAssessment.test;

import java.util.Scanner;

public class Program_2 {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit ,i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the InputLimit : ");
		limit = sc.nextInt();
		for(i =1 ; i<= limit ; i++) {
			if(i%2 != 0) {
				System.out.println(i);
				
			}
		}
	}

}
