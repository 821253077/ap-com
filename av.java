import java.util.Scanner;
public class av
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
		double dev1 = Math.abs(da1-avg);
		double dev2 = Math.abs(da2-avg);
		double dev3 = Math.abs(da3-avg);
		double dev4 = Math.abs(da4-avg);
		double ave1 = (dev1+dev2+dev3+dev4)/4;
		System.out.println("avg of data:"+avg);
		System.out.println("avg of daviation: "+ave1);
	}
}