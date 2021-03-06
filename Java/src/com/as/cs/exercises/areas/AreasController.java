package com.as.cs.exercises.areas;

import java.util.Scanner;

public class AreasController {
	public enum Shape {
		TRIANGLE, CIRCLE, RECTANGLE, SQUARE, SPHERE, CONE, CYLINDER
	}
	public static Shape shape;
	private static String shapeString;
	private static float val1;
	private static float val2;
	private static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Shape: ");
		shapeString = keyboard.next();
		switch (shapeString){
		case "triangle": shape = Shape.TRIANGLE; break;
		case "Triangle": shape = Shape.TRIANGLE; break;
		case "TRIANGLE": shape = Shape.TRIANGLE; break;
		case "circle": shape = Shape.CIRCLE; break;
		case "Circle": shape = Shape.CIRCLE; break;
		case "CIRCLE": shape = Shape.CIRCLE; break;
		case "rectangle": shape = Shape.RECTANGLE; break;
		case "Rectangle": shape = Shape.RECTANGLE; break;
		case "RECTANGLE": shape = Shape.RECTANGLE; break;
		case "square": shape = Shape.SQUARE; break;
		case "Square": shape = Shape.SQUARE; break;
		case "SQUARE": shape = Shape.SQUARE; break;
		case "sphere": shape = Shape.SPHERE; break;
		case "Sphere": shape = Shape.SPHERE; break;
		case "SPHERE": shape = Shape.SPHERE; break;
		case "cone": shape = Shape.CONE; break;
		case "Cone": shape = Shape.CONE; break;
		case "CONE": shape = Shape.CONE; break;
		case "cylinder": shape = Shape.CYLINDER; break;
		case "Cylinder": shape = Shape.CYLINDER; break;
		case "CYLINDER": shape = Shape.CYLINDER; break;
		}
		switch (shape){
		case TRIANGLE:  request("Width", "Height"); break;
		case CIRCLE:  request("Radius"); break;
		case RECTANGLE: request("Width", "Height"); break;
		case SQUARE: request("Edge"); break;
		case SPHERE: request("Radius"); break;
		case CONE: request("Radius","Height"); break;
		case CYLINDER: request("Radius","Height"); break;
		}
		
		@SuppressWarnings("unused")
		Areas areas = new Areas (val1, val2, shape);
	}
	
	public static void request(String req1, String req2){
		System.out.print(req1 +" : ");
		val1 = keyboard.nextFloat();
		System.out.print(req2 +" : ");
		val2 = keyboard.nextFloat();
	}
	
	public static void request(String req){
		System.out.print(req +" : ");
		val1 = keyboard.nextFloat();
		val2 = 0;
	}
}
