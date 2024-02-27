package numberprograms;

import java.util.Scanner;

public class Reverse_A_Number {
public static void main(String[] args) {
	Scanner scn =new Scanner(System.in);
	System.out.println("enter a number :");
	int num=scn.nextInt();
	int temp=num;int rev=0;
	while(temp>0) {
		int rem=temp%10;
		temp/=10;
		rev=rev*10+rem;
	}
	System.out.println(num +" reverse is : "+rev);
}
}
