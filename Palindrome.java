package com.StringPrograms;

import java.util.Scanner;

public class Palindrome {
	public static boolean palindrome(String str) {
		str=str.toUpperCase();
		int i=0;
		int j=str.length()-1;
		while (i<=j) {
			char ch1=str.charAt(i);
			char ch2=str.charAt(j);
			if(ch1==ch2) {//or ch1!=ch2
				return true;//or false
			}
			i++;
			j--;
		}
		return false;//or true
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.next();
		if (palindrome(str)) {
			System.out.println(str+" is palindrome");
		} else {
			System.out.println(str+" is not palindrome");
		}
		sc.close();
	}
}
