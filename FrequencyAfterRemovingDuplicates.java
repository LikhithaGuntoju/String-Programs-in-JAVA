package com.StringPrograms;

import java.util.Scanner;

public class FrequencyAfterRemovingDuplicates {
	public static String remDuplicate(String str) {
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(!(res.contains(ch+""))) {
				res+=ch;
			}
		}
		return res;
		
	}
	public static void frequency(String str ,String res) {
		for (int i = 0; i < res.length(); i++) {
			int count=0;
			char ch1=res.charAt(i);
			for (int j = 0; j < str.length(); j++) {
				char ch2 = str.charAt(j);
				if (ch1==ch2) {
					count++;
				}
			}
			System.out.println(ch1+"Frequency is : "+count);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.next();
		String res=remDuplicate(str);
		System.out.println(res);
		frequency(str, res);
		sc.close();
	}
}
