import java.util.Scanner;

/*
 1. Write a Java program to check whether a given number is positive, negative, or zero using 
 	an if-else statement.
 */
public class Question01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number :: ");
		int num = scan.nextInt();
		
		if(num > 0) {
			System.out.println("The number "+num+" is positive number");
		} else if(num < 0) {
			System.out.println("The number "+num+" is negative number");
		} else {
			System.out.println("The number "+num+" is equal to Zero");
		}
		
		scan.close();
		
	}
}
