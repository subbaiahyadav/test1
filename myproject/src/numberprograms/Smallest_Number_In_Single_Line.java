package numberprograms;

import java.util.Scanner;

public class Smallest_Number_In_Single_Line {
public static void main(String[] args) {
	Scanner scn =new Scanner(System.in);
	System.out.println("enter a number");
	int a=scn.nextInt();
	System.out.println("enter a number");
	int b=scn.nextInt();
	System.out.println("enter a number");
	int c=scn.nextInt();
	
	int smallest=(c<(a<b?a:b))?c:(a<b?a:b);
	System.out.println(smallest);
}
}
