package numberprograms;

import java.util.Scanner;

public class Sum_Of_Digits {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter a digits :");
	long number=scn.nextLong();
	long temp=number;int sum=0;
	while(temp>0) {
		int  rem=(int) (temp%10);
		temp/=10;
		sum+=rem;
	}
	System.out.println(number +" sum is 🤣 :"+sum);
}
}
