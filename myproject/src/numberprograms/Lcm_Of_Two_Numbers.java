package numberprograms;

import java.util.Scanner;

public class Lcm_Of_Two_Numbers {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter  a number");
	int num1=scn.nextInt();
	System.out.println("enter a number");
	int num2=scn.nextInt();
	islcm(num1,num2);
}
public static void islcm(int a,int b) {
	int lcm=a>b?a:b;
	while(true) {
		if(lcm%a==0 && lcm%b==0)
			break;
		lcm++;
	}
	System.out.println( "lcm is "+lcm);
}
}
