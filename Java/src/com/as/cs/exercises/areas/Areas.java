package com.as.cs.exercises.areas;

import com.as.cs.exercises.areas.AreasController.Shape;

public class Areas {
	private static float val1;
	private static float val2;
	private static float ans;
	private static Shape shape;
	Areas (float val1, float val2, Shape shape){
		Areas.val1 = val1;
		Areas.val2 = val2;
		Areas.shape = shape;
		switch (shape){
		case TRIANGLE: triangle(val1, val2); break;
		case CIRCLE: circle(val1); break;
		case RECTANGLE: rectangle(val1,val2); break;
		case SQUARE: square(val1); break;
		case SPHERE: sphere(val1); break;
		}
		System.out.println(ans);
		System.out.println("-------------");
	}
	
	private void sphere(float val1) {
		ans = (float) (Math.PI* Math.pow(val1, 2)*4);
	}

	private void square(float val1) {
		ans = (float) (Math.pow(val1, 2));
	}

	private void rectangle(float val1, float val2) {
		ans = (float) (val1*val2);
	}

	private void circle(float val1) {
		ans = (float) (Math.PI* Math.pow(val1, 2));
	}

	public void triangle(float val1, float val2){
		ans = (float) (val1*val2*0.5);
		
	}
	
	public float getVal1() {
		return val1;
	}
	public void setVal1(float val1) {
		this.val1 = val1;
	}
	public float getVal2() {
		return val2;
	}
	public void setVal2(float val2) {
		this.val2 = val2;
	}
	public Shape getShape() {
		return shape;
	}
	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public static float getAns() {
		return ans;
	}

	public static void setAns(float ans) {
		Areas.ans = ans;
	}
}