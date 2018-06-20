import java.util.Scanner;
public class grade
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String grade = "F";
		System.out.print("what is your grade? ");
		double ngrade = keyboard.nextDouble();
		if (ngrade >= 96.5)
		{
			grade = "A+";
		}
		else if (ngrade >=89.5 && ngrade<96.5)
		{
			grade = "A";
		}
		else if (ngrade >=85.5 && ngrade<89.5)
	    {
			grade = "B+";
		}
		else if (ngrade >=79.5 && ngrade<85.5)
		{
			grade = "B";
		}
		else if (ngrade >=75.5 && ngrade<79.5)
		{
			grade = "C+";
		}
		else if (ngrade >=69.5 && ngrade<75.5)
		{
			grade = "C";
		}
		else if (ngrade >=65.5 && ngrade<69.5)
		{
			grade = "D+";
		}
		else if (ngrade >=59.5 && ngrade<65.5)
		{
			grade = "D";
		}
		System.out.println("Your Grade: " +grade);
	}
}