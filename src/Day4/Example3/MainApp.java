package Day4.Example3;

/* Task3
 * Create three classes Circle, Triangle, Square. Declare their respective 
dimensions as class-attributes using private access modifier. This will ensures
that no other class can modify respective shape dimension. 
Calcualte area of all the shapes in main function setting the radius, base, height and side.
*/

import Day4.Example3.Shapes.Circle;
import Day4.Example3.Shapes.Square;
import Day4.Example3.Shapes.Triangle;

public class MainApp {

	public static void main(String[] args) {

		double areaCircle,areaTriangle,areaSquare;
		
		Circle C1 = new Circle(10);
		Triangle T1 = new Triangle(10,10);
		Square S1 = new Square(5);

		areaCircle = Math.PI*Math.pow(C1.getRadius(),2);
		areaTriangle = 0.5*T1.getBase()*T1.getHeight();
		areaSquare = Math.pow(S1.getSide(),2);
				
		System.out.println(String.format("Area of Circle is %.4f",areaCircle));
		System.out.println(String.format("Area of Triangle is %.4f",areaTriangle));
		System.out.println(String.format("Area of Square is %.4f",areaSquare));

	}

}
