package Problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem08 {

	
	public static ArrayList<Integer> problem08(Queue Q){
        ArrayList<Integer> arraylist=new ArrayList<>();
        while(!Q.isEmpty()){
            arraylist.add((int) Q.remove());
        }
        int k=arraylist.size()-1;
        int j=0;
        ArrayList<Integer> arraylist2=new ArrayList<>();
        while(arraylist2.size()!=arraylist.size()){
            arraylist2.add(arraylist.get(k));
            
            if(!arraylist.isEmpty()){
               arraylist2.add(arraylist.get(j));
               
               j=j+1;
            }
            
            k=k-1;
        }
        return arraylist2;
    }
    
    public static void main(String[] args) {
        Queue queue=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("How many elements you want to add? ");
        int k=sc.nextInt();                
        for(int i=0;i<k;i++){  
            System.out.print("Enter the Element no "+(i+1) + " ");
            queue.add(sc.nextInt());
        }        
        
        System.out.println(problem08(queue));
    }
    
}