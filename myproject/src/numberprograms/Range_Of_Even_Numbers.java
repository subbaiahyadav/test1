package numberprograms;

import java.util.Scanner;

public class Range_Of_Even_Numbers {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter first num : ");
	int num1=scn.nextInt();
	System.out.println("enter second num");
	int num2=scn.nextInt();
	Evennumbers(num1,num2);
}
public static void Evennumbers(int num1,int num2) {
	for(int i=num1;i<=num2;i++) {
		if(i%2==0) {
			System.out.print(i+" ");
		}
	}
}
}
