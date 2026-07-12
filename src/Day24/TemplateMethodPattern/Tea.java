package Day24.TemplateMethodPattern;

public class Tea extends Beverage{

	@Override
	protected void addIngredient() {
        System.out.println("Adding Tea Leaves");		
	}
}
