import java.util.Scanner;

/*
 	4. Write a Java program to find the largest of three numbers using nested if-else statements.
 */
public class Question04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter First number :: ");
		int num1 = scan.nextInt();

		System.out.print("Enter Second number :: ");
		int num2 = scan.nextInt();
		System.out.print("Enter Third number :: ");
		int num3 = scan.nextInt();

		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println(num1 + " is largest number");
			} else {
				System.out.println(num3 + " is largest number");
			}
		} else if (num2 > num3) {
			System.out.println(num2 + " is largest number");
		} else {
			System.out.println(num3 + " is largest number");
		}

		scan.close();
	}
}
