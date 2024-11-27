package com.StringPrograms;

public class Frequency {
	public static void main(String[] args) {
		String str ="java";
		for (int i = 0; i < str.length(); i++) {
			char ch =str.charAt(i);
			System.out.println(frequency(str, ch));
		}
	}
	public static String frequency(String str,char ch) {
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			char ch1 =str.charAt(i);
			if(ch1==ch) {
				count++;
			}
		}
		return ch+" frequency: " +count;	
	}
}
//j frequency: 1
//a frequency: 2
//v frequency: 1
//a frequency: 2