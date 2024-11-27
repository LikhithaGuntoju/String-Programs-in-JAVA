package com.StringPrograms;

import java.util.Scanner;

public class RightShift {
	public static String rightShift(String str,int userInput) {
		String res="";
		for (int i = str.length()-1; i >= str.length()-userInput; i--) {
//			i = str.length()-userInput; i < str.length(); i++
			char ch1=str.charAt(i);
			res=ch1+res;
			//res=res+ch1
		}
		for (int j = 0; j < str.length()-userInput; j++) {
			char ch2 = str.charAt(j);
			res+=ch2;
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str =sc.next();
		System.out.println("enter no of char to right shift");
		int userInput=sc.nextInt();
		System.out.println(rightShift(str, userInput));
		sc.close();
	}
}
