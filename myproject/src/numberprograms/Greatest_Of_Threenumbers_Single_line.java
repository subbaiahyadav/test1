package numberprograms;

import java.util.Scanner;

public class Greatest_Of_Threenumbers_Single_line {
	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("entera number");
	int a=scn.nextInt();
	System.out.println("enter a number");
	int b=scn.nextInt();
	System.out.println("enter a number");
	int c=scn.nextInt();
	
	int largest=(a>b?a:b)>c?(a>b?a:b):c;
	System.out.println(largest);
	}
}
