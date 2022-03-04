package Problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem02 {

	 public static LinkedList<LinkedList<Integer>> problem02(LinkedList<Integer> L,int a){
	        LinkedList<LinkedList<Integer>> ans=new LinkedList<>();
	            for(int i=0;i<L.size()-1;i++){
	                LinkedList<Integer> K=new LinkedList<>();
	                if(L.get(i)+L.get(i+1)==a){
	                    K.add(L.get(i));
	                    K.add(L.get(i+1));
	                
	                }
	                else{}
	                if(K.isEmpty()==false){ans.add(K);};
	                
	            }
	        return ans;
	    
	    }
	    public static void main(String[] args) {
	        
	        LinkedList<Integer> fin=new LinkedList<>();
	        Scanner scanner=new Scanner(System.in);
	        System.out.print("Enter the value of k");
	        int k=scanner.nextInt();
	        System.out.print("How many elements you want to add?");
	        int a=scanner.nextInt();                
	        for(int i=0;i<a;i++){  
	            System.out.print("Enter the Element ");
	            fin.add(scanner.nextInt());
	        }        
	        
	      
	        System.out.println("Output is"+problem02(fin,k));
	        
	    }
	    
	}