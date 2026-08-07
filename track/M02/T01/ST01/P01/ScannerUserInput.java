
    import java.util.Scanner;
    public class ScannerUserInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter byte value");
		byte a = scan.nextByte();
		System.out.println("Byte values is  " + a);
		
		System.out.println("Enter short value :");
		short b = scan.nextShort();
		System.out.println("Short values is " + b);
		
		System.out.println("Enter integer values : ");
		int c = scan.nextInt();
		System.out.println("Integer value is : "+ c);
		
		System.out.println("Enter long value : ");
		long d = scan.nextLong();
		System.out.println("Long values is : " + d);
		
		System.out.println("Enter float values:");
		float e =scan.nextFloat();
		System.out.println("flaot values is: " + e);
		
		System.out.println("Enter double values: ");
		double f = scan.nextDouble();
		System.out.println("double values is : " + f);
		
		System.out.println("Enter boolean values :");
		boolean g = scan.nextBoolean();
		System.out.println("boolean values is: " + g);
			
		}

}