package com.StringPrograms;

import java.util.Scanner;

public class CharIsPresent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.next();
		char ch =sc.next().charAt(0);
		System.out.println(isPresent(str, ch));
		sc.close();
	}
	public static String isPresent( String str ,char ch) {
		for(int i=0;i<str.length();i++) {
			char ch1 = str.charAt(i);
			if(ch1==ch) {
				return "true";
			}
		}
		return "false";
	}
}
