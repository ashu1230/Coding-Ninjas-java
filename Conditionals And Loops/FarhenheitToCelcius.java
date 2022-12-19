import java.util.Scanner;
public class Solution {

  public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        int s,e,w;
	        Scanner sc= new Scanner(System.in);
	        s=sc.nextInt();
	        e=sc.nextInt();
	        w=sc.nextInt();
	        int temp=0;
	        double k = 0.55556;
    
	 
	        
	            while(0<=s && s<=e){
	                temp = (int)((s-32) * k);
	              	
	                
	                System.out.println(s+"\t"+temp);
	                s=s+w;
	            }

	        
	        
	    }

	}
