package Day5;

// Polymorphism

class Animal
{
	public void move()
	{
		System.out.println("Animal is unknown, cant move");
	}
}

class Fish extends Animal{
	
	@Override
	public void move() {
		System.out.println("Fish is Swimming.");

	}
}

class Dog extends Animal
{
	@Override
	public void move()
	{
		System.out.println("Dog is Running");
	}
}

class Bird extends Animal
{
	public void fly()
	{
		System.out.println("Bird is flying");
	}
}

public class MainApp1 {

	public static void main(String[] args) {
		
		Fish f = new Fish();
		f.move();
		
		Dog d = new Dog();
		d.move();
		
		Bird b = new Bird();
		b.move();
		b.fly();  // Hear Move is not Override
	}
}










