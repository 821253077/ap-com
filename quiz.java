import java.util.Scanner;
public class quiz
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("what is the month?");
		int month = keyboard.nextInt();
		System.out.print("what is the day?");
		int day = keyboard.nextInt();
		System.out.print("what is the year?");
		int year = keyboard.nextInt();
		int days = day +1;
		String months = "nah";
		String dayss = "nah";
		int years = 0;
	 if ( month == 1 && day == 31)
	 {
		dayss = "February 1,";
		System.out.println( "Next Day: "+dayss+""+years);
	 }
	 else if ( month == 2 && day == 28)
	 {
		 dayss = "March 1,";
		 System.out.println( "Next Day: "+dayss+""+year);
	 }
	 else if ( month == 3 && day == 31)
	 {
		 dayss = "April 1,";
		 System.out.println( "Next Day: "+dayss+""+year);
	 }
	 else if ( month == 4 && day == 30)
	 {
		 dayss = "May 1,";
		 System.out.println( "Next Day: "+dayss+""+year);
	 }
	 else if (month == 5 && day == 31)
	 {
		 dayss = "June 1,";
		 System.out.println( "Next Day: "+dayss+""+year);
	 }
	 else if (month == 6 && day == 30)
	 {
		 dayss = "July 1,";
		 System.out.println( "Next Day: "+dayss+""+year);
	 }
	 else if (month == 7 && day == 31)
	 {
		 dayss = "Asgust 1,";
		 System.out.println( "Next Day: "+dayss+""+year);
	 }
	 else if (month == 8 && day == 31)
	 {
		 dayss = "September 1,";
		 System.out.println( "Next Day: "+dayss+""+year);
	 }
	 else if (month == 9 && day == 30)
	 {
		 dayss = "October 1,";
		 System.out.println( "Next Day: "+dayss+""+year);
	 }
	 else if (month == 10 && day == 31)
	 {
		 dayss = "November 1,";
		 System.out.println( "Next Day: "+dayss+""+year);
	 }
	 else if (month == 11 && day == 30)
	 {
		 dayss = "December 1,";
		 System.out.println( "Next Day: "+days+""+year);
	 }
	 else if (month == 12 && day == 31)
	 {
		 dayss = "January 1,";
		 years = year + 1;
		 System.out.println( "Next Day: "+dayss+""+years);
	 }
	  else if (month == 1)
	 	 {
	 		 months ="January";
	 		  System.out.println("Next day: "+month+""+days+","+year);
	 }
	 else if (month == 2)
	 {
		 months ="Feburary";
		  System.out.println("Next day: "+months+""+days+","+year);
	 }
	 else if (month == 3)
	 {
		 months ="March";
		  System.out.println("Next day: "+months+""+days+","+year);
	 }
	 else if (month == 4)
	 {
		 months ="April";
		  System.out.println("Next day: "+months+""+days+","+year);
	 }
	 else if (month == 5)
	 {
		 months ="May";
		  System.out.println("Next day: "+months+""+days+","+year);
	 }
	 else if (month == 6)
	 {
		 months ="June";
		  System.out.println("Next day: "+months+""+days+","+year);
	 }
	 else if (month == 7)
	 {
		 months ="July";
		  System.out.println("Next day: "+months+""+days+","+year);
	 }
	 else if (month == 8)
	 {
		 months ="August";
		  System.out.println("Next day: "+months+""+days+","+year);
	 }
	 else if (month == 9)
	 {
		 months ="September";
		  System.out.println("Next day: "+months+""+days+","+year);
	 }
	 else if (month == 10)
	 {
		 months ="October";
		  System.out.println("Next day: "+months+""+days+","+year);
	 }
	 else if (month == 11)
	 {
		 months ="November";
		  System.out.println("Next day: "+months+""+days+","+year);
	 }
	 else if (month == 12)
	 {
		 months ="December";
		  System.out.println("Next day: "+months+""+days+","+year);
	  }
 }
}
