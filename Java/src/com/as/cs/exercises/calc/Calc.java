package com.as.cs.exercises.calc;
import com.as.cs.exercises.calc.CalcController.Op;

public class Calc {
	private static float num1;
	private static float num2;
	private static Op op;
	private static float ans;

	Calc(float num1, float num2, Op op){
		Calc.num1 = num1;
		Calc.num2 = num2;
		Calc.op = op;
		switch (op){
		case MULTIPLY: multiply(num1,num2); break;
		case SUBTRACT: subtract(num1,num2); break;
		case ADD: add(num1,num2); break;
		case DIVIDE: divide(num1,num2); break;
		}
		System.out.println(ans);
		System.out.println("-------------");
	}
	
	public static void multiply (float num1, float num2){
		ans = num1*num2;
		
	}
	
	public static void subtract (float num1, float num2){
		ans = num1-num2;
		
	}
	
	public static void add (float num1, float num2){
		ans = num1+num2;
		
	}
	
	public static void divide (float num1, float num2){
		ans = num1/num2;
		
	}
	
	public static float getNum1() {
		return num1;
	}
	public static void setNum1(float num1) {
		Calc.num1 = num1;
	}
	public static float getNum2() {
		return num2;
	}
	public static void setNum2(float num2) {
		Calc.num2 = num2;
	}

	public static Op getOp() {
		return op;
	}

	public static void setOp(Op op) {
		Calc.op = op;
	}

	public float getAns() {
		return ans;
	}

	public void setAns(float ans) {
		Calc.ans = ans;
	}
	
}
