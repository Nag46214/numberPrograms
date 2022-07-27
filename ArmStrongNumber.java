// Armstrong_Number by Nagarjuna
import java.util.*;
class ArmstrongNumber
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
      System.out.println ("Enter the Number");
    int number = sc.nextInt ();
    if (calculatePowerAndSum(number) == number)
      System.out.println (number + " is Armstrong_Number");
    else
        System.out.println (number + " is not an Armstrong_Number");
  }
  // Method to find the length of the Given Number
  static int getLength (int len)
  {
    int length = 0;
    while (len != 0)
      {
	len /= 10;
	length++;
      }
    return length;
  }
  //Method to find the Power and Equivalent sum of the each digits w.r.to Power
  static int calculatePowerAndSum(int num)
  {
    int rem = 0, res = 0;
    int temp = num;
    int sum = 0;
    while (temp > 0)
      {
	rem = temp % 10;
	res = (int) Math.pow (rem, getLength (num));
  //Here getLength Method is called  inside this method (power and sum calculation) to find the digits final value in its power.
	sum += res;
	temp /= 10;
      }
    return sum;
  }
}
