package com.StringPrograms;

import java.util.Scanner;

public class ReplaceChars {
	public static String replace(String str ,char ch1, char ch2) {
		//replace a string of ch1 char with ch2
		String res="";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch==ch1) {
				res+=ch2;
			}else {
				res+=ch;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.next();
		System.out.println("enter a char to replace");
		char ch = sc.next().charAt(0);
		System.out.println("enter a char to replace with");
		char ch1 = sc.next().charAt(0);
		System.out.println(replace(str, ch, ch1));
		sc.close();
	}
}
//enter a string
//java
//enter a char to replace
//a
//enter a char to replace with
//@
//j@v@