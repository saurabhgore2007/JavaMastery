package Day5;

//Abstraction
/*
1) Only abstract classes can declare abstract functions
2) abstract classes can also define functions
3) If any class extends abstract-class, then must override all abstract-methods
   of the inherited class
4) Instance of Abstract-class can not be created. Only Child classes can initialize abstract-class-objects
*/

abstract class Car{
	
	abstract public void engineSpec();
	
	public void show()
	{
		System.out.println("This is Abstract class Car");
	}
}

class Bmw extends Car
{
	@Override
	public void engineSpec()
	{
		System.out.println("Bmw Move Fast");
	}
}

class Auddi extends Bmw
{
	@Override
	public void engineSpec() 
	{
		System.out.println("Auddi Move Fast and Smooth");
	}
}


public class MainApp2 {

	public static void main(String[] args) {

		Car c1 = new Bmw();
		
		c1.engineSpec();
		c1.show();
		
		Car c2 = new  Auddi();
		
		c2.engineSpec();
		c2.show();
	}

}
