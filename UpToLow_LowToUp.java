package com.StringPrograms;

import java.util.Scanner;

public class UpToLow_LowToUp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.next();
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 65 && ch <= 90) {
				ch+=32; //UPPER TO LOWER CASE
				res+=ch;
			}else {
				ch-=32; //LOWER TO UPPER CASE
				res+=ch;
			}
		}
		System.out.println(res);
		sc.close();
	}
}
//enter a string
//LIKKI
//likki
//enter a string
//likki
//LIKKI