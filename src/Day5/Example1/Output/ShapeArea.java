package Day5.Example1.Output;

import Day5.Example1.Shape.Circle;
import Day5.Example1.Shape.Triangle;

public class ShapeArea extends Circle{

	static Triangle t;
	
	public ShapeArea() {
		this.t= null;
	}
	
	public ShapeArea(Triangle t) {
		this.t= t;
	}
	
	public ShapeArea(float base,float height,float radius) {
		super(radius);
		t = new Triangle(base,height);
	}
	
	public Triangle getT() {
		return t;
	}
}
