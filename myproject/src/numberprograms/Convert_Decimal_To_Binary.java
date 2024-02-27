package numberprograms;

import java.util.Scanner;

public class Convert_Decimal_To_Binary {
public static void main(String[] args) {
	Scanner scn= new Scanner(System.in);
	System.out.println("enter anumber");
	int n=scn.nextInt();
	int num=n;
	int value=1;int bin=0;
	while(num>0) {
		int rem=num%2;
		bin+=rem*value;
		value=value*10;
		num=num/2;
	}
	System.out.println(n+" binary is : "+bin);
}
	
}
