// AutomorphicNumber
import java.util.*;
class AutomorphicNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println("The Length of "+num+" is : "+getLength(num));
		System.out.println("The square of "+num+" is : "+squareOfNumber(num));
		if(isAutomorphic(num)==num) 
		    System.out.println(num+" is Automorphic Number");
		else    
		    System.out.println(num+" is not an Automorphic Number");
	
	}
	static int squareOfNumber(int num){
	    int sqNum = (int)Math.pow(num,2);
	    /*
	    
	    Math.pow() function returns the boolean value as output so,
	    Here i have used (int) it means Typecasting changing one dataType.
	    
	    */
	    return sqNum;
	}
	static int getLength(int num){
	    int length=0;
	    while(num>0){
	        length++;
	        num/=10;
	    }
	    return length;
	}
	static int isAutomorphic(int num){
	    int result = (int)(squareOfNumber(num)%Math.pow(10,getLength(num)));
	    /*
	    Here in line 36 i have called two methods inside this current method to calculate the result followed by its function.
	    Math.pow() function returns the boolean value as output so,
	    Here i have used (int) it means Typecasting changing one dataType.
	    
	    */
	    return result;
	}
	
}
