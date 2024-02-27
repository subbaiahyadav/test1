package numberprograms;

import java.util.Scanner;

public class Happy_Number {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter a number");
	int num1=scn.nextInt();
	System.out.println("enter a number");
	int num2=scn.nextInt();
	ishappy(num1,num2);
}
public static void ishappy(int num1,int num2) {
	int temp=0;int sum=0;int rem=0;
	for(int i=num1;i<=num2;i++) {
		temp=i;
		while(temp>9) {
			while(temp>0) {
			rem=temp%10;
			sum+=rem*rem;
			temp/=10;
		}
		temp=sum;
		sum=0;
		}
		/*if(temp!=1 && temp!=4) {
			temp=0;
		}*/
		 if (temp==1)System.out.println(i+" is happy number "+temp);
		else System.out.println(i+" not happy number "+temp);
	}
}
}
