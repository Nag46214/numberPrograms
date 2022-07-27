// Perfect Number Nagarjuna
import java.util.*;
class PerfectNumber
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
      System.out.println ("Enter the Number");
    int num = sc.nextInt ();
    if (num == isPerfectNumber (num))
      System.out.println (num + " is a perfect Number");
    else
        System.out.println (num + " is not an perfect Number");
  }
  //static method to find the sum of the factors of the given user input

  static int isPerfectNumber (int num)
  {
    int sum = 0;
    for (int i = 1; i < num; i++)
      {
	if (num % i == 0)
	  sum = sum + i;
      }
    return sum;
  }
}
