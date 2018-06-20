import java.util.Scanner;
public class loop
{

	public static void main(String[] arg)
			{
				Scanner keyboard = new Scanner(System.in);
				System.out.println("Welcome to the Class Average program!");
				System.out.print("How many students are in the class");
				int num = keyboard.nextInt();
				double total = 0.0;
				for(int i = 0;i <num ;i ++)
				{
					System.out.print("Input the Grade for student #"+(i+1)+":");
					double grade = keyboard.nextDouble();
					total +=grade;
				}
				double average = total/num;
				System.out.format("The average is %-5.2f.",average);
			}
		}
