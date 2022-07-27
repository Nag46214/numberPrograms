//DecimalToBinary
import java.util.*;
class DecimalToBinary
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Decimal Number");
		int decimal = sc.nextInt();
		System.out.println("Binary Value of the given "+decimal+" number is: "+decimalToBinary(decimal));
	}
	static int decimalToBinary(int decimal){
		int binary = 0;
		int i = 1;
		while(decimal!=0){
		    int digit = decimal%2;
		    binary = binary+(digit*i);
		    i=i*10;
		    decimal = decimal/2;
		}
		return binary;
	}
}
