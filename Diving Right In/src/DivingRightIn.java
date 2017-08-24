import java.util.Scanner;

public class DivingRightIn
	{
		static String userInput;
		static int age;
		static int yearDiff;
		static int i;

		public static void main(String[] args)
			{
				greetUser();
				askAge();
				tellAgeInYears();
				tellAgeInDogYears();

			}

		private static void greetUser()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Hello, what is your name?");
				String name = userInput.nextLine();
				System.out.println("Hi " + name);
			}

		private static void askAge()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("How old are you?");
				int age = userInput.nextInt();
				if (age <= 16)
					{
						System.out.println("Okay, great!");
					}
				if (age == 17)
					{
						System.out.println("You can see R rated movies!");
					}
				if (age >= 18)
					{
						System.out.println("Congrats! You're a legal adult");
					}

			}

		private static void tellAgeInYears()
			{
				for (int i = 2004; i > 1998; i--)
					{
						int ageDiff = 2017 - age;
						int yearDiff = i - ageDiff;
						System.out.println("	In year " + i + " you were " + yearDiff);
					}
			}

		private static void tellAgeInDogYears()
			{
				int dogAge = yearDiff * 7;
				System.out.println("	In dog years, in year " + i + " you were " + dogAge);
				System.out.println(" ");
			}

	}
