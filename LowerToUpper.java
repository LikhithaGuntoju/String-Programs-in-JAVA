package com.StringPrograms;

import java.util.Scanner;

public class LowerToUpper {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.next();
		String res="";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			ch-=32;
			res+=ch;
		}
		System.out.println(res);
		sc.close();
	}
}
//Enter a String
//java
//JAVA