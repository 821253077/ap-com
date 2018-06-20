
public class numericals
{
	public static void main (String[] args)
	{
		Scanner keyboard= new Scanner(System.in);
		String[] months = {"Januardy","February","March","April","May","June","Asgust","september","October","November","Decembew"};
		int[] days ={31,28,31,30,31,30,31,31,30,31,30,31};
		int month = 0;
		while (month <1 || month>12)
		{
			System.out.println("input the month: ");
			month = keyboard.nextInt();
		}
		int date = 0;
		while(date<1 ||date > days[month-1])
		{
			System.out.println("Input the day: ");
			date = keyboard.nextInt();
		}
		System.out.print("input the year: ");
		int year = keyboard.nextInt();
		System.out.println(months[month-1]+" "+date + "," +year);

		int newdate = date++;
		if (newdate >days[month-1])
		{
			month++;
			date = 1;
		}
		if (month ==13)
		{
			month = 1;
			year ++;
		}
		if (days[month-1]== 31|| days[month-1] == 28)
		{
		    date = 1;
		    month++;

		}
		System.out.println(months[month-1]+" "+date + "," +year);
	}
}
