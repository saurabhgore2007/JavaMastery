package Day21;

interface Calculator {

    int calculate(int a, int b);

    static Calculator getAdditionCalculator() {
    	return new Addition();
    }
    
    static Calculator getSubtractionCalculator() {
    	return new Subtraction();
    }

}

class Addition implements Calculator {

    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}

class Subtraction implements Calculator {

    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}

public class StaticMethodInterface {

	public static void main(String[] args) {

		Addition add = new Addition();
		Subtraction sub = new Subtraction();
		
        System.out.println(add.calculate(10, 20));
        System.out.println(sub.calculate(10, 20));
        
        Calculator calcAddition = Calculator.getAdditionCalculator();
        System.out.println(calcAddition.calculate(30, 20));

        Calculator calcSubtraction = Calculator.getSubtractionCalculator();
        System.out.println(calcSubtraction.calculate(30, 20));


	}

}
