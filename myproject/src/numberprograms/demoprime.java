package numberprograms;

import java.util.Scanner;

public class demoprime {
public static void main(String[] args) {
	
	  
	        Scanner scn = new Scanner(System.in);
	        System.out.println("Enter first number: ");
	        int num1 = scn.nextInt();
	        System.out.println("Enter second number: ");
	        int num2 = scn.nextInt();
	        printPrimeNumbers(num1, num2);
	    }

	    public static void printPrimeNumbers(int num1, int num2) 
	    {
	        int count=0;
	        for (int i = num1; i <= num2; i++) 
	        {
	            boolean flag = true;
	            for (int j = 2; j <= Math.sqrt(i); j++) 
	            {
	                if (i % j == 0) 
	                {
	                    flag = false;
	                    break;
	                }
	            }
	            if (flag) 
	            {
	                if(count%2==0)
	                {
	                    
	                System.out.println("Prime number is: " + i);
	                
	                }
	                count++;
	            }
	        }
	    }
}

	            
	            
