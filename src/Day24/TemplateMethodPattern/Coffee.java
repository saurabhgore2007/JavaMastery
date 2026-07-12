package Day24.TemplateMethodPattern;

public class Coffee extends Beverage{

	@Override
	protected void addIngredient() {
        System.out.println("Adding Coffee Powder");		
	}
}
