package numberprograms;

import java.util.Scanner;

public class Armstrong_Number {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	
	System.out.println("enter a secomd number :");
    int num2=scn.nextInt();
    isarmstrongnumber1(num2);
    }

    public  static void isarmstrongnumber1(int n) {
    int temp,count=0,rem=0,sum=0;
    temp=n;
    while(temp>0) {
    	temp/=10;
    	count++;
    }
    
      temp=n;
    	while(temp>0) {
    		 rem=temp%10;
    		sum+=(int)( Math.pow(rem,count));
    		temp/=10;
    	}
    	
    	if(n==sum)System.out.println(n+" is armstrong = "+sum);
    	else System.out.println(n+" not a armstrong = "+sum);
  
}


	
}

