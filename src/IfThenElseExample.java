import java.util.Scanner;

	public class IfThenElseExample {
		
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int num1, num2 = 0;
			
			System.out.println("Enter the first number: ");
			num1 = scanner.nextInt();
			System.out.println("Enter the second number: ");
			num2 = scanner.nextInt();
			
			//Example 0
			if(num1 > 0) {
				System.out.println("First number is positive.");
			} else if (num1 < 0) {
				System.out.println("First number is negative.");
			} else if (num1 == 0) {
				System.out.println("First number is neither positive nor negative.");
			}
			
			//Example 1
			if(num1 > num2) {
				System.out.println("First number is greater than second number.");
			} else {
				System.out.println("Second number is greater than first number.");
			}
			
			//Example 2
			System.out.println("Enter a number: ");
			num1 = scanner.nextInt();
			
			if(num1 % 2 == 0) {
				System.out.println("Number is even.");
			} else {
				System.out.println("Number is odd.");
			}
			
			//Example3
			/*
			  Ask the user to enter two integers.
				Using 3 or less if statements, output the highest number.
				What happens if both numbers are the same?
				Modify the program to use an else statement.
				What happens if both numbers are the same?
			 */
			
			if (num1 > num2) {
				System.out.println("First number is the greatest number.");
			} else if (num2 > num1) {
				System.out.println("Second number is the greatest number.");
			} else if (num1 == num2) {
				System.out.println("First number equals the second number.");
			}
			
		}
}
