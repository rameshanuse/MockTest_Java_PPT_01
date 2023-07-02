import java.util.ArrayList;
import java.util.List;

/*
 	3. Write a Java program to calculate the average of a list of numbers using a do-while loop.
 */
public class Question03 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		int count = 0;
		int sum = 0;
		do {
			sum = sum + (int) list.get(count);
			count++;
		} while(count < list.size()); 
		
		int avg = sum/count;
		System.out.println("The avarage of list is :: "+avg);
		
	}
}
