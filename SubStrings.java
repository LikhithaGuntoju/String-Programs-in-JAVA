package com.StringPrograms;

import java.util.Scanner;

public class SubStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.next();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				for (int k = i; k <=j; k++) {
					System.out.print(str.charAt(k));
				}
				System.out.println();
			}
		}                          
		sc.close();
	}
}
