import java.util.Scanner;
public class account
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How much is the deposits?");
		double dep = keyboard.nextDouble();
		keyboard.nextLine();
		System.out.print("Is the normal percentages will be use?");
		String normal = keyboard.nextLine();
		double payroll = 0;
		double expense = 0;
		double rainy = 0;
		if (normal.equals ("yes"))
		{
			payroll = dep *.6;
			expense = dep *.35;
			rainy = dep *.05;
			System.out.format("Deposit: $ %8.2f\n ", dep);
			System.out.format("Deposit: $ %8.2f\n ", payroll);
			System.out.format("Deposit: $ %8.2f\n ", expense);
			System.out.format("Deposit: $ %8.2f\n ", rainy);
		}
		else if (normal.equals ("no"))
		{
			System.out.print("what is the new percentage of payroll account?");
			double percent1 = keyboard.nextInt();
			System.out.print("what is the new percentage of expense account?");
		    double percent2 = keyboard.nextInt();
			System.out.print("what is the new percentage of rainy day account?");
			double percent3 = keyboard.nextInt();
			double fraction1 =((double)percent1)/100;
			double fraction2 =((double)percent2)/100;
			double fraction3 =((double)percent3)/100;
			double total = percent1+percent2+percent3;
			payroll = dep *fraction1;
			expense = dep *fraction2;
			rainy = dep *fraction3;
			if(total == 100)
			{
			  double payrollss = dep *fraction1;
			  double expensess = dep *fraction2;
			  double rainyss = dep *fraction3;
2			  System.out.format("Deposit:$ %8.2f\n ", payrollss);
			  System.out.format("Deposit:$ %8.2f\n ", expensess);
			  System.out.format("Deposit:$ %8.2f\n ", rainyss);
		  }
		  else if (total<100)
		  {
			  System.out.println("your percentage is wrong.");
			  System.exit(0);
		  }
	  }
  }
}