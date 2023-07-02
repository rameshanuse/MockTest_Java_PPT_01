import java.util.Scanner;

/*
 2. Write a Java program to print the Fibonacci series up to a given number using a for loop.
 */
public class Question02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number :: ");
		int num = scan.nextInt();
		int [] arr = new int[num]; 

		for (int i = 0; i < num; i++) { 
			if (i == 0) {
				arr[i] = 0;
			} else if(i == 1) {
				arr[i] = 1;
			} else if (i > 1) {
				arr[i] = arr[i-1] + arr[i - 2];
			}
		}
		for(int elem:arr) {
			System.out.print(elem+" ");
		}
		
		scan.close();
	}
}
