package numberprograms;

import java.util.Scanner;

public class Count_Given_Number_Even_Or_Odd {
public static void main(String[] args) {
	Scanner scn=new Scanner (System.in);
	System.out.println("enter a number");
	int num=scn.nextInt();
	Counting(num);
	}
public static void Counting(int a) {
	int even=0,odd=0;
	while(a>0) {
		int rem=a%10;
		a=a/10;
		if(rem%2==0) {
			even++;
		}
		else odd++;
	}
	System.out.println("even :"+even);
	System.out.println( "odd :"+odd);
	}
}

