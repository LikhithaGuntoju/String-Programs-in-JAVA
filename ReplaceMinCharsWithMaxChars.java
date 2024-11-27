package com.StringPrograms;


import java.util.Scanner;

public class ReplaceMinCharsWithMaxChars {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.next();
		String res = remDuplicate(str);
		System.out.println("Duplicates removed "+res);
		char minChar = minOcc(str, res);
		System.out.println("Min char: "+minChar);
		char maxChar = maxChar(str, res);
		System.out.println("Max Char: "+maxChar);
		System.out.println("replaced string "+replaceMinWithMAx(str, minChar, maxChar));
		sc.close();
	}
	
	public static String remDuplicate(String str) {
		String res="";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(!(res.contains(ch+""))) {
				res+=ch;
			}
		}
		return res;
	}
	
	public static char minOcc(String str ,String res) {
		int minCount=str.length();
		char minChar=' ';
		for (int i = 0; i < res.length(); i++) {
			int count=0;
			char ch1=res.charAt(i);
			for (int j = 0; j < str.length(); j++) {
				char ch2=str.charAt(j);
				if(ch1==ch2) {
					count++;
				}
			}
			if (count<minCount) {
				minChar=ch1;
				minCount=count;
			}
		}
		return minChar;
	}
	
	public static char maxChar(String str,String res) {
		int maxCount=0;
		char maxChar=' ';
		for (int i = 0; i < res.length(); i++) {
			int count=0;
			char ch1=res.charAt(i);
			for (int j = 0; j < str.length(); j++) {
				char ch2 = str.charAt(j);
				if(ch1==ch2) {
					count++;
				}
			}
			if (count>maxCount) {
				maxChar=ch1;
				maxCount=count;
			}
		}
		return maxChar;
	}
	public static String replaceMinWithMAx(String str,char MinOcc,char MaxOcc) {
		String res="";
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			if(ch==MinOcc) {
				res+=MaxOcc;
			}else {;
				res+=ch;
			}
		}
		return res;
	}
}
