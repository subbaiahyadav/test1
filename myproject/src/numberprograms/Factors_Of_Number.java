package numberprograms;

import java.util.Scanner;

public class Factors_Of_Number {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter a number");
	int num=scn.nextInt();
	factors(num);
}
public static void factors(int a) {
	for(int i=1;i<a;i++) {
		if(a%i==0) {
			System.out.println( a+" factors is "+i);
		}
	}
}
}
