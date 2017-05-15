package com.wuyt3;

public class CrazyMain {
	public static void main(String[] args)
	{
		System.out.println("main E!");
		
		String str1 = "hello";
		String str2 = "hello";
		String str3 = "he" + "llo";
		String str4 = "he";
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1 == str4);
		
		System.out.println("main X!");
	}
}
