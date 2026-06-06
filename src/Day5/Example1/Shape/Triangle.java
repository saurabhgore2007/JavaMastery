package Day5.Example1.Shape;

public class Triangle {

	protected float base;
	protected float height;

	
	public Triangle() {
		this.base = 0.0f;
		this.height = 0.0f;
	}
	
	public Triangle(float base , float height) {
		this.base = base;
		this.height = height;
	}
	
	public float getBase() {
		return this.base;
	}
	
	public float getHeight() {
		return this.height;
	}
}
