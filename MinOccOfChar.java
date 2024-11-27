package com.StringPrograms;

import java.util.Scanner;

public class MinOccOfChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.next();
		String res = removeDuplicate(str);
		System.out.println("Min char in a given String : "+minOcc(str, res));
		sc.close();
	}
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
	public static char minOcc(String str ,String res) {
		int minCount=str.length();
		char minChar=' ';
		for (int i = 0; i < res.length(); i++) {
			int count=0;
			char ch2 = res.charAt(i);
			for (int j = 0; j < str.length(); j++) {
				char ch3 = str.charAt(j);
				if(ch2==ch3) {
					count++;
				}
			}
			if (count<minCount) {
				minChar=ch2;
				minCount=count;
			}
		}
		return minChar;
		
	}
}
//enter a string
//likki
//Min char in a given String : l
