package numberprograms;

import java.util.Scanner;

public class Greatest_Number {
public static void main(String[] args) {
	Scanner scn =new Scanner(System.in);
	System.out.println("enter a gretest number");
	int num1=scn.nextInt();
	System.out.println("enter a gretest number");
	int num2=scn.nextInt();
	System.out.println("enter a geratest number");
	int num3=scn.nextInt();
	isgreatest(num1,num2,num3);
}
public static void isgreatest(int num1,int num2,int num3) {
	if(num1>num2 && num1>num3) {
		System.out.println("num1 is greater "+num1);
	}
	else if(num2>num3)System.out.println("num2 is greater "+num2);
	else System.out.println("num3 is greater "+num3);
}
}
