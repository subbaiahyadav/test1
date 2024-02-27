package numberprograms;

import java.util.Scanner;

public class Counting_Number_Of_Digits_In_A_Number {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter a number :");
	int num=scn.nextInt();
	int temp=num;int count=0;
	while(temp>0) {
		temp/=10;
		count++;
	}
	System.out.println(num +" count is = "+count);
}
}
