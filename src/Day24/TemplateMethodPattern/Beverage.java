package Day24.TemplateMethodPattern;

public abstract class Beverage {

	// Template Method
	public final void prepare() {
		
		boilWater();
		addIngredient();
		pour();
		addSugar();
	}
	
	private void boilWater() {
		System.out.println("Boiling Water");
	}
	
	protected abstract void addIngredient();
	
	private void pour() {
        System.out.println("Pouring into Cup");
	}
	
	private void addSugar() {

        System.out.println("Adding Sugar");

    }
}
