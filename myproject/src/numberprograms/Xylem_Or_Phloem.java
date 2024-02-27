package numberprograms;

import java.util.Scanner;

public class Xylem_Or_Phloem {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("entera a number");
	int num=scn.nextInt();
	xylemorphloem(num);
}
public static void xylemorphloem(int a) {
	int temp=a;int outer=0;int inner=0;int rem=0;
	while(temp>0) {
	if(a==temp||temp<10) {
		 rem=temp%10;
		outer+=rem;
		temp/=10;
	}
	else {
		rem=temp%10;
     	inner+=rem;
	    temp/=10;
	}
	}
	if(inner==outer) {
		System.out.println( inner+ " is xylem "+outer);
	}
	else System.out.println(inner +" is phloem "+outer);
}
}
