package com.StringPrograms;

import java.util.Scanner;

public class SumOfNumberInAString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.next();
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 48 && ch <= 57) {
				ch-=48;
				sum+=ch;
			} 
		}
		System.out.println(sum);
		sc.close();
	}
}
//enter a string
//
//java123
//6