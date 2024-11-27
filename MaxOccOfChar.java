package com.StringPrograms;

import java.util.Scanner;

public class MaxOccOfChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.next();
		String res = removeDuplicate(str);
		System.out.println("MAx char in a given String : "+maxOcc(str, res));
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
	public static char maxOcc(String str ,String res) {
		int maxCount=0;
		char maxChar=' ';
		for (int i = 0; i < res.length(); i++) {
			int count=0;
			char ch2 = res.charAt(i);
			for (int j = 0; j < str.length(); j++) {
				char ch3 = str.charAt(j);
				if(ch2==ch3) {
					count++;
				}
			}
			if (count>maxCount) {
				maxChar=ch2;
				maxCount=count;
			}
		}
		return maxChar;
		
	}
}
//enter a string
//likki
//if elements count is same it will take first element c
//MAx char in a given String : i
//enter a string
//aabbbcccc
//MAx char in a given String : c