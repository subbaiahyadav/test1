package numberprograms;

import java.util.Scanner;

public class Hcf {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter a number");
	int num1=scn.nextInt();
	System.out.println("enter a number");
	int num2=scn.nextInt();
	ishcf(num1,num2);
}
public static void ishcf(int num1,int num2) {
	int hcf=num1<num2?num1:num2;
	int sum=0;
	for(int i=1;i<=hcf;i++) {
		if(num1%i==0 && num2%i==0)
			sum=i;
	}
	System.out.println("hcf is "+sum);
}
}
