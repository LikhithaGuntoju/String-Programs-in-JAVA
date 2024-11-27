package com.StringPrograms;

import java.util.Scanner;

public class CountNoOfVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.next();
		int count=0;
		for (int i = 0; i <=str.length()-1; i++) {
			char ch =str.charAt(i);
			switch (ch) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
			}
		}
		System.out.println(count);
		sc.close();
//		int i=0;
//		int j=str.length();
//		while (i<j) {
//			char ch =str.charAt(i);
//			switch (ch) {
//			case 'A':
//			case 'E':
//			case 'I':
//			case 'O':
//			case 'U':
//			case 'a':
//			case 'e':
//			case 'i':
//			case 'o':
//			case 'u':
//				count++;
//			}
//			i++;
//		}
	}	
}
//enter a string
//likhitha
//3


