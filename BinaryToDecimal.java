//BinaryToDecimal
import java.util.*;
class BinarytoDecimal
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Binary Number");
		int binary = sc.nextInt();
		System.out.println("Decimal Value of the given "+binary+" value is : "+BinaryToDecimal(binary));
	}
	//method to calculate Binary To Decimal
	static int BinaryToDecimal(int binary){
		int decimal = 0;
		int i = 1;
		int digit = 0;
		while(binary!=0){
		    digit = binary%10;
		    decimal = decimal+digit*i;
        //Here we have added the final digit present in the number to the variable decimal and multiplying it with 2 every time we storing it to the decimal .
		    i=i*2;
		    binary = binary/10; 
		}
		return decimal;
	}
}
