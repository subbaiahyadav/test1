package numberprograms;

import java.util.Scanner;

public class Alternate_ArmStrong_Number {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter a number");
	int num1=scn.nextInt();
	System.out.println("enter a number");
	int num2=scn.nextInt();
	isarmstrong(num1,num2);
}
public static void isarmstrong(int num1,int num2) {
	int temp=0;int rem=0;int even=1;
	for(int i=num1;i<=num2;i++) {
		temp=i;
		int count=0;
	while(temp>0) {
		count++;
		temp/=10;
	}
	temp=i;
	int sum=0;
	while(temp>0) {
		rem=temp%10;
		sum+=(int)Math.pow(rem,count);
		temp/=10;
	}
	if(sum==i) {
		
		if(even%2==0) {
	System.out.println(sum+" is armstrong "+i);
		}
		even++;
	}
	
	}
	
}
}
