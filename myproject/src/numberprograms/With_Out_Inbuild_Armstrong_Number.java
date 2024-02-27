package numberprograms;

import java.util.Scanner;

public class With_Out_Inbuild_Armstrong_Number {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter a number");
	int num1=scn.nextInt();
	
	System.out.println("enter a number");
    int num2=scn.nextInt();
    isarmstrong(num1,num2);
    
}
public static void isarmstrong(int num1,int num2) {
	int n=0;int count=0;
	for(int i=num1;i<=num2;i++) {
	n=i;
	while(n>0) {
		count++;
		n/=10;
	}
	n=i;;int sum=0;
	while(n>0) {
		int pow=1;
		int rem=n%10;
		for(int j=1;j<=count;j++) {
			pow=pow*rem;
			
		}
		
		n/=10;
		sum+=pow;
		
	}
	
	if(sum==i)System.out.println( i+ " is armstrong "+sum);
	else System.out.println(i+" not armstrong "+sum);
	}
}
}
