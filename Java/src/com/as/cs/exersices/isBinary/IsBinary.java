package com.as.cs.exersices.isBinary;

import java.util.Scanner;

public class IsBinary {
	static Scanner keyboard = new Scanner(System.in);
	static String input;
	static char[] array;
	static boolean isBinary;
	public static void main(String[] args){
		isBinary = true;
		System.out.print("Input number: ");
		input = keyboard.next();
		array = input.toCharArray();
		for(char c:array){
			if(c != '0' && c != '1'){
				isBinary = false;
			}
		}
		System.out.print(isBinary);
	}
}
