package Problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem09 {

	public static void main(String[] args) {

		Queue<Integer> q1 = new LinkedList<Integer>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the elements");
		int size = scanner.nextInt();
		for (int i=0;i<size;i++)
		{
			System.out.println("Enter element "+i);
			q1.add(scanner.nextInt());
		}
		
		System.out.println(problem09(q1));
		

	}
	
	public static ArrayList<Integer> problem09 (Queue<Integer> q1){
		

		ArrayList<Integer> array = new ArrayList<Integer>();
		int size2 = q1.size();
		int size3 = 0;
		
		if (q1.size() % 2 == 0)
			size3 = q1.size() / 2;
		else
			size3 = q1.size() / 2 + 1;


		for (int i=0;i<size3;i++) 
		{ 

		int a = q1.poll();
		int b = -1;

		try {
		b = q1.poll();
		}catch(Exception e) {

		}

		if (a % 2 != 0 && b % 2 == 0) {
			array.add(b);
			if (b != -1)
				array.add(a);
		} else {
			array.add(a);
			if (b != -1)
				array.add(b);
		}

	}
		
		return array;


		}

}
