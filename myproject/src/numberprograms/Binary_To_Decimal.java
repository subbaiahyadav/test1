package numberprograms;

import java.util.Scanner;

public class Binary_To_Decimal {
public static void main(String[] args) {
	Scanner scn =new Scanner(System.in);
	System.out.println("enter a binary number :");
	int binary=scn.nextInt();
	int temp=binary;int dec=0;int power=1;
	while(temp>0) {
		int rem=temp%10;
		dec+=rem*power;
		power=power*2;
		temp/=10;
	}
	System.out.println(binary +" value of decimal is :"+ dec);
}
}
