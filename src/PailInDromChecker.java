/*
 
  *Excercise 1	"Exercise: Number Palindrome Checker

Objective: In this exercise, you'll write a Java program to check if a given number is a palindrome.

Instructions:

Create a new Java class called """"PalindromeChecker"""".

Write a static method called """"isPalindrome"""" that takes an integer as input and returns a boolean value indicating whether the number is a palindrome.

Inside the """"isPalindrome"""" method, convert the integer to a string using the Integer.toString() method.

Check if the string representation of the number is equal to its reverse. You can use the StringBuilder class to reverse the string.

If the original string and its reverse are equal, return true; otherwise, return false.

In the main method of the """"PalindromeChecker"""" class, prompt the user to enter a number and read it using the Scanner class.

Call the """"isPalindrome"""" method with the entered number as the argument and store the result in a boolean variable.

Print an appropriate message indicating whether the number is a palindrome or not.

Compile and run your program to test it with various inputs.

Example Output:

Enter a number: 12321
12321 is a palindrome.

Enter a number: 45678
45678 is not a palindrome.

Bonus Challenge:

Modify the program to handle negative numbers as well. Consider negative numbers to be non-palindromes.
This exercise will help you practice string manipulation, logical comparisons, and conditional statements in Java. Feel free to customize and extend the exercise based on your learning goals."""
	
	
  *
  *
  */

//101   



import java.util.Scanner;

public class PailInDromChecker {

	static boolean isPalindrome(int no)
	{
		
		  if (no < 0) 
		  {
		        System.out.println("It's a negative number — not a palindrome.");
		        return false;
		  }
		  String number=Integer.toString(no);
		  StringBuilder sb=new StringBuilder(number);
		  
		  StringBuilder reverse= sb.reverse();
		  
		  if(sb.toString().equals(number))
		  {
			  return true;
		  }
		  else
		  {
			  return false;
				
		  }
		  
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int no;
		boolean ans;
		System.out.println("Enter a number : ");
		no=sc.nextInt();
		
		ans=PailInDromChecker.isPalindrome(no);
		
		if(ans)
		{
			System.out.println(no+" is a pailindrom");
		}
		else
		{
			System.out.println(no+ " is not pailindrom");
		}
		
	}
}
