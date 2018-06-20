import java.util.Scanner;
public class digital
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print(" what is the numebr?");
		int num = keyboard.nextInt();
	    int dig1 = num/(int)1E8;
	    int rem1 = num%(int)1E8;
	    int dig2 = rem1/(int)1E7;
	    int rem2 = rem1%(int)1E7;
	    int dig3 = rem2/(int)1E6;
	    int rem3 = rem2%(int)1E6;
	    int dig4 = rem3/(int)1E5;
	    int rem4 = rem3%(int)1E5;
	    int dig5 = rem4/(int)1E4;
	    int rem5 = rem4%(int)1E4;
	    int dig6 = rem5/(int)1E3;
	    int rem6 = rem5%(int)1E3;
	    int dig7 = rem6/100;
	    int rem7 = rem6%100;
	    int dig8 = rem7/10;
	    int rem8 = rem7%10;
	    int digital = dig1+dig2+dig3+dig4+dig5+dig6+dig7+dig8+rem8;
	    if (digital >9)
	    {
		  dig1 = digital/10;
		  dig2 = digital%10;
		  int sum2 = (dig1+dig2);
		  System.out.println("sum: " +sum2);
	  }
	  else if (digital <10)
	  {
	      System.out.println( "the digital: " +digital);
	  }
  }
}