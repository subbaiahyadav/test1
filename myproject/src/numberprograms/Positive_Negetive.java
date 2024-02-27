package numberprograms;

import java.util.Scanner;

public class Positive_Negetive {
public static void main(String[] args) {
	Scanner scn= new Scanner(System.in);
	System.out.println("enter a number");
	int num=scn.nextInt();
	if(num<0) {
		System.out.println("is negativenumber");
	}
	else System.out.println("is positive");
}
}
