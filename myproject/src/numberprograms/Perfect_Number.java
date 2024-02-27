package numberprograms;

import java.util.Scanner;

public class Perfect_Number {
public static void main(String[] args) {
	Scanner scn= new Scanner(System.in);
	System.out.println("enter a number");
	int num=scn.nextInt();
	isperfect(num);
}
public static void isperfect(int a) {
	int sum=0;
	for(int i=1;i<a;i++) {
		if(a%i==0) {
			sum+=i;
		}
	}
	if(sum==a)System.out.println(sum+" is perfect number "+a);
	else System.out.println(sum+ " not a perfect number "+a);
}
}
