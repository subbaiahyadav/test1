package numberprograms;

import java.util.Scanner;

public class Factorial_Of_A_Number {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter a number :");
	int num=scn.nextInt();
	int temp=num;
	int fact=1;
	for(int i=1;i<=temp;i++) {
	fact=fact*i;
	}
	System.out.println(num+" factorial is = "+fact);
}
}
