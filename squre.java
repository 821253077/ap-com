import java.util.Scanner;
public class squre
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
	    dig1 = digital/10;
		dig2 = digital%10;
		int sum2 = (dig1+dig2);
		System.out.println(sum2);
		int sum3 =0;
		int sum4 =0;
		if (sum2 >=9)
		{
			sum3 = sum2/10;
			sum4 = sum2%10;
			int sum5 = sum3+sum4;
			System.out.println(sum5);
			boolean interge = sum5 ==1 || sum5==1 || sum5== 4|| sum5 ==7 || sum5==9;
			System.out.println("is it a perfect integer: "+interge);
		}
	    if (rem8 == 9|| rem8 == 4)
	    {
			System.out.println("It is perfect square." );
		}
		else if (sum2 == 1 || sum2 == 4 || sum2 !=7 )
		{
		    System.out.println("It is a perfect square.");
		}
		else if (rem8 ==2 || rem8 == 3 || rem8 == 7 || rem8==8)
		{
			System.out.println("It is not a perfect square.");
		}
	}
}

