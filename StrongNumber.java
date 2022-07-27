//Strong_Number
import java.util.*;
class StrongNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = sc.nextInt();
		if(isStrong(number))
		System.out.println(number+" is StrongNumber");
		else
		System.out.println(number+" is not StrongNumber");
	}
		static boolean isStrong(int number){
		int temp = number;
		int digit = 0;
		int sum = 0;
		int fact = 1;
		while(temp>0){
		    digit = temp % 10;
		    fact = 1;
		    for(int i = 1;i<=digit;i++){ //Here we are finding the factorial of the digit that we extracted from the number.
		        fact = fact*i;
		    }
		    sum = sum+fact; //Here we are adding the final factorial of the digit to the sum which is zero at its initial state. 
		    temp = temp/10;
		}
		if(sum==number)
		   return true;
		return false;
	}
}
