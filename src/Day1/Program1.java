package Day1;

// WAP to Print Min and Max value for the primitive data types along with Memory Size

public class Program1 {
	   public static void main(String []args)
	   {
		System.out.println(String.format("Byte   \t : Min value = %4d \t\t\t Max value = %4d \t\t Size = %2d bytes",Byte.MIN_VALUE,Byte.MAX_VALUE,Byte.SIZE));
		System.out.println(String.format("Short  \t : Min value = %4d \t\t\t Max value = %4d \t\t Size = %2d bytes",Short.MIN_VALUE,Short.MAX_VALUE,Short.SIZE));
		System.out.println(String.format("Integer\t : Min value = %4d \t\t Max value = %4d \t\t Size = %2d bytes",Integer.MIN_VALUE,Integer.MAX_VALUE,Integer.SIZE));
		System.out.println(String.format("Long   \t : Min value = %4d \t Max value = %4d Size = %2d bytes",Long.MIN_VALUE,Long.MAX_VALUE,Long.SIZE));
		System.out.println(String.format("Float  \t : Min value = %e \t\t Max value = %e \t Size = %2d bytes",Float.MIN_VALUE,Float.MAX_VALUE,Float.SIZE));
		System.out.println(String.format("Double \t : Min value = %e \t\t Max value = %e \t Size = %2d bytes",Double.MIN_VALUE,Double.MAX_VALUE,Double.SIZE));
		System.out.println(String.format("Character\t:Min value = %d \t\t\t Max value = %d \t\t Size = %2d bytes",(int)Character.MIN_VALUE,(int)Character.MAX_VALUE,Character.SIZE));
		System.out.println("\nBoolean   : Min value = "+ Boolean.FALSE + " Max value = " + Boolean.TRUE + " Size = "+"1bytes");

	}
}