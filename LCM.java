import java.util.*;
class LCM
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n1");
		int n1 = sc.nextInt();
		System.out.println("n2");
		int n2 = sc.nextInt();
		System.out.println("n3");
		int n3 = sc.nextInt();
		//Method Calling
		LcmOfThree(n1,n2,n3);
	}
	static void LcmOfThree(int n1,int n2,int n3){
		int num = n1>n2 && n1>n3 ? n1 : n2>n3 ? n2 : n3  ; 
		int lcm = 1;
	       for(int i = 1;i<=num;i++){
		    if(num % n1==0 && num %n2==0 && num%n3==0){
		        lcm = num;
		        break;
		    }
		  num++;
		}
		System.out.println("The Lcm of "+n1+ " and "+n2+ " and "+n3+ " is : "+lcm);
	}
}
