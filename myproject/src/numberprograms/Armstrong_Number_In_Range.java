package numberprograms;

import java.util.Scanner;

public class Armstrong_Number_In_Range {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter a number");
	int num1=scn.nextInt();
	System.out.println("enter a number");
	int num2=scn.nextInt();
	isarmstrong(num1,num2);
}
public static void isarmstrong(int num1,int num2) {
	for(int i=num1;i<=num2;i++) {
		int n=i;int count=0;
		while(n>0) {
			count++;
			n=n/10;
		}
		n=i;
		int sum=0;
		while(n>0) {
		int	temp=n%10;
		sum+= (int)Math.pow(temp, count);
		n/=10;
		}
		
		if(sum==i) {
			
			System.out.println(i+"  is arm strong 😁 "+sum);
		}
		else
			System.out.println(i+"  not armstrong 🥲 "+sum);
	}
}
}
