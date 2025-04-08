/*
 "Exercise: Prime Number Checker

Objective: In this exercise, you'll write a Java program to check if a given number is prime or not.

Instructions:

1. Create a new Java class called ""PrimeNumberChecker"".

2. Define a static method called ""isPrime"" that takes an integer as input and returns a boolean value indicating whether the number is prime or not.

3. Implement the ""isPrime"" method using the following logic:
   - If the number is less than 2, return false.
   - Iterate from 2 to the square root of the number (inclusive).
   - If the number is divisible evenly by any of the iteration values, return false.
   - If the loop completes without finding a divisor, return true.

4. In the main method, prompt the user to enter a positive integer.

5. Parse the user input and call the ""isPrime"" method to check if the entered number is prime or not.

6. Display an appropriate message to the user indicating whether the number is prime or not.

7. Test your program with different input values to verify its correctness.

Example Output:

Enter a positive integer: 13
13 is a prime number.

Enter a positive integer: 6
6 is not a prime number.

Bonus Challenge:

- Modify the program to accept a range of numbers and display all the prime numbers within that range.
- Enhance the program to handle negative numbers gracefully and provide appropriate error messages.

This exercise will help you practice conditional statements, loops, and basic arithmetic operations in Java. Feel free to customize or expand the exercise based on your learning goals."



 */




import java.util.Scanner;

public class PrimeNumberChecker {

	static boolean isPrime(int no)
	{
		if(no<2)
		{
			return false;
		}

        for (int i = 2; i <= Math.sqrt(no); i++) {
            if (no % i == 0) {
                return false; 
            }
        }

        return true;
    }
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int no,ch;
		
		System.out.println("1 - check a single number or a range?");
	    System.out.println("2 - find prime numbers within range:");
		
	    System.out.println("Enter Your choice: ");
	    ch=sc.nextInt();
	    
	    switch (ch) 
	    {
			case 1: 
				System.out.println("enter a positive integer : ");
				no=sc.nextInt();
				boolean ans=PrimeNumberChecker.isPrime(no);
			
				if(ans)
				{
					System.out.println(no+ " is prime number");
				}
				else
				{
					System.out.println(no +" is not a prime number");
				}
				break;
			
			case 2:
				System.out.print("Enter starting number of the range: ");
	            int start = sc.nextInt();

	            System.out.print("Enter ending number of the range: ");
	            int end = sc.nextInt();

	            System.out.println("Prime numbers between " + start + " and " + end + " are:");

	            for (int i = start; i <= end; i++) 
	            {
	                if (isPrime(i)) 
	                {
	                    System.out.print(i + " ");
	                }
	            }
	            System.out.println(); 
	            break;
	
		default:
			System.out.println("Invalid choice");
			break;
		}
	    
	}

}
