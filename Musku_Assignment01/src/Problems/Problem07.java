package Problems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem07 {

	public static int prob7(Queue Q){
        String K=new String();
        while(!Q.isEmpty()){
            K=K+String.valueOf(Q.remove());
            }
        
        return Integer.parseInt(K, 2);
    }
    public static void main(String[] args) {
        Queue Q=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("How many elements you want to add? : ");
        int k=sc.nextInt();                
        for(int i=0;i<k;i++){  
            System.out.print("Enter the Element no "+(i+1) + " ");
            Q.add(sc.nextInt());
        }        
       
        
        System.out.println(prob7(Q));
        
    }
    
}