package numberprograms;

import java.util.Scanner;

public class Print_Range_Of_Given_Prime_Numbers {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter first num : ");
    int num1=scn.nextInt();
    System.out.println("enter second number : ");
    int num2=scn.nextInt();
    printprimenumbers(num1,num2);
}
public static void printprimenumbers(int num1,int num2) {
	for(int i=num1;i<=num2;i++) {
		int count=0;
		for(int j=1;j<=i;j++) {
			if(i%j==0)count++;
		}
		 if(count==2) {
			
			System.out.println("prime num is :"+i);
			
		}
	}
}
}
