package com.StringPrograms;

import java.util.Scanner;

public class RemoveDuplicates {
	public static String removeDuplicate(String str) {
		String res ="";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(!(res.contains(ch+""))) {
				res =res+ch;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.next();
		System.out.println(removeDuplicate(str));
		sc.close();
	}
}
//enter a string
//aaabbbbbcbcbc
//abc