package Problems;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Problem10 {

static String val = ""; 
	
	public static void main(String[] args) {
	
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements in deque: ");
		int size=scanner.nextInt();
		
		Deque<String> deque = new ArrayDeque<String>();

		for (int i=0;i<size;i++)
		{
			System.out.println("Enter element"+i+" to Deque");
			deque.add(scanner.next());
		}
		
		System.out.println("Enter the number of elements in Array : ");
		int size2=scanner.nextInt();
		
		int[] ia = new int[size2];
		
		//Providing input for Array
		for (int i=0;i<size2;i++)
		{
			ia[i]=scanner.nextInt();
		}
		
		for (Integer p : ia) {
			problem10(p,deque);
		}

		String res = "";
		
		for (String string : deque) {
			res+=string;
		}
		
		System.out.println("\""+res+"\"");	
		
	}
	
	public static void problem10(int p, Deque<String> d1) {
		
		
		if(p == 1) {
			val = d1.poll();
		}else {
			
			if(val!="") {
				d1.addFirst(val);
				val="";
			}
		}
		
	}
	
}
