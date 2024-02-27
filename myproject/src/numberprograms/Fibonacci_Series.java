package numberprograms;

import java.util.Scanner;

public class Fibonacci_Series {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter first number :");
	int num1=scn.nextInt();
	System.out.println("enter second number :");
	int num2=scn.nextInt();
	int a=0;int b=1;
	System.out.print(a+" "+b);
	for(int i=num1;i<num2-1;i++) {
	int sum=a+b;
	System.out.print(" "+ sum);
	a=b;
	b=sum;
	}
}
}
