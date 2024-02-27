package numberprograms;

import java.util.Scanner;

public class Leaf_Year {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter a year");
	int year=scn.nextInt();
	if(year%400==0)System.out.println("leaf year :"+year);
    else if((year%4==0) && (year%100!=0))System.out.println("leaf year :"+year);
    else System.out.println("not leaf year :"+year);
}
}
