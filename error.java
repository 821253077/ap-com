import java.util.Scanner;
public class error
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("what is data 1?");
		double da1 = keyboard.nextDouble();
		System.out.print("what is data 2?");
		double da2 = keyboard.nextDouble();
		System.out.print("what is data 3?");
		double da3 = keyboard.nextDouble();
		System.out.print("what is data 4?");
		double da4 = keyboard.nextDouble();
		double avg = (da1+da2+da3+da4)/4;
		System.out.print("press 1 for average deviatio or press 2 for %error");
		double num = keyboard.nextDouble();
		double num1 = 0;
		if ( num == 1)
		{
			double dev1 = Math.abs(da1-avg);
			double dev2 = Math.abs(da2-avg);
			double dev3 = Math.abs(da3-avg);
			double dev4 = Math.abs(da4-avg);
			double ave1 = (dev1+dev2+dev3+dev4)/4;
			System.out.println("avg of data:"+avg);
		    System.out.println("avg of daviation: "+ave1);
		}
		else if ( num == 2)
		{
		    System.out.print("what is the actual number?");
		    num1 = keyboard.nextDouble();
		    double error = Math.abs(num1-avg)/num1*100;
		    System.out.println("avg of data: " +avg);
		    System.out.println("%error: "+error+"%");
		}
	}
}
