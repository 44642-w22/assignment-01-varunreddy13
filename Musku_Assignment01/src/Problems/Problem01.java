package Problems;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Problem01 {

	public void problem01() {
		
	      Scanner scanner = new Scanner(System.in);
			
			LinkedList<Integer> L1 = new LinkedList<Integer>();
			LinkedList<Integer> L2 = new LinkedList<Integer>();
			
			System.out.println("Enter 5 linked list L1 elements:");
			
			L1.add(scanner.nextInt());
			L1.add(scanner.nextInt());
			L1.add(scanner.nextInt());
			L1.add(scanner.nextInt());
			L1.add(scanner.nextInt());
			System.out.println("Input (L1): "+L1);
			
			Iterator<Integer> iterator=L1.iterator();
		     while(iterator.hasNext()){

		    	 int i=1,sum=0;  
		    	 int n=iterator.next();
		    	 while(i <= n/2)  
		    	 {  
		    	 if( n% i == 0)  
		    	 {  
		    	 sum = sum + i;  
		    	 }
		    	 i++;  
		    	 }
		    	 if(sum==n)  
		    	 {  
		    	 L2.add(n); 
		    	 }
		    	 
		     }
		     System.out.println("Output (L2): "+L2);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem01 p = new Problem01();
		p.problem01();

	}
			
			
			
		}