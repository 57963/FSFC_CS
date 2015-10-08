package com.as.cs.exercises;
import java.util.*;

public class CalcController {
	private static float num1;
	private static float num2;
	public enum Op{
		MULTIPLY, DIVIDE, ADD, SUBTRACT
	}
	private static Op op;
	private static String opString;
	
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Operation: ");
		opString = keyboard.next();
		
		switch(opString){
		case "multiply": op = Op.MULTIPLY; break;
		case "Multiply": op = Op.MULTIPLY; break;
		case "MULTIPLY": op = Op.MULTIPLY; break;
		case "*": op = Op.MULTIPLY; break;
		case "mult": op = Op.MULTIPLY; break;
		}
		
		System.out.print("First Number: ");
		num1 = keyboard.nextFloat();
		System.out.print("Second Number: ");
		num2 = keyboard.nextFloat();
		
	}
	
	Calc calculator = new Calc(num1, num2, op);
}
