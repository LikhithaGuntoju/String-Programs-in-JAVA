package com.StringPrograms;

import java.util.Scanner;

public class LeftShift {
	public static String leftShift(String str,int userInput) {
		String res = "";
		for (int i = userInput; i < str.length(); i++) {
			char ch1=str.charAt(i);
			res+=ch1;
		}
		for (int j = 0; j < userInput; j++) {
			char ch2=str.charAt(j);
			res+=ch2;
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.next();
		System.out.println("enter no of chars to left shift");
		int userInput=sc.nextInt();
		System.out.println(leftShift(str, userInput));
		sc.close();
	}
}
