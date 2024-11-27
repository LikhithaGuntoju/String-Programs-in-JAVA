package com.StringPrograms;

import java.util.Scanner;

public class PrintEvenIndex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.next();
		for (int i = 0; i < str.length(); i++) {
			if(i%2==0) {
				System.out.println(str.charAt(i));
			}
		}
		sc.close();
	}
}
//enter a string
//likhitha
//l
//k
//i
//h