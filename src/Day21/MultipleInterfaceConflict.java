package Day21;

interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B {
    default void show() {
        System.out.println("B");
    }
}

class Test implements A, B {

    @Override
    public void show() {
        A.super.show();
        System.out.println("Test");
    }
}

public class MultipleInterfaceConflict {

	public static void main(String[] args) {
		new Test().show();
	}

}
