package Day10;

import java.util.ArrayList;

/* WAP to create a class Product. Add products to Array List and show 4 Product Records */


class Products{
	public int id;
	public String prodName;
	public float cost;

	public Products(){
		this.id = 0;
		this.prodName = null;
		this.cost = 0;

	}

	public Products(int id, String prodName, float cost)
	{
		this.id = id;
		this.prodName = prodName;
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return String.format("%10d %20s %.2f",this.id,this.prodName,this.cost);
	}

}

public class ArrayListEx3 {

	public static void main(String[] args) {

		ArrayList<Products> products = new ArrayList<>();
		
		products.add(new Products(1848, "Mouse", 800.00f));
		products.add(new Products(2811, "Keyboard", 1700.00f));
		
		Products p1 = new Products(8943, "Speaker", 1600.00f);
		products.add(p1);

		products.add(new Products(1891, "USB", 700.00f));

		for(Products i : products)
		{
			System.out.println(i);
		}
	}

}