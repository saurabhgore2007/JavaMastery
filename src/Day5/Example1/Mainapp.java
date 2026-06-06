package Day5.Example1;

import Day5.Example1.Output.ShapeArea;

public class Mainapp {

	public static void main(String[] args) {
		
		//Q1.set radius:7.0 , base:7.0   and height:7.0 through object shape.
		
		ShapeArea shape = new ShapeArea(7.0f,7.0f,7.0f);
		
		//Q2.show value of radius, base and height through object shape

		System.out.println("Radius : " + shape.getRadius());
		System.out.println("Base : " + shape.getT().getBase());
		System.out.println("Height : " + shape.getT().getHeight());

		/*
		 * Here ShapeArea extends Circle since shape object able to fetch method from
		 * Circle object where object of triangle is created in ShapeArea so for base
		 * and height we need .getT().getBase()
		 */
	}
}
