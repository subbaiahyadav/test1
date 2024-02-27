package numberprograms;

import java.util.Scanner;

public class Number_Of_Days_In_A_Month {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter a month name ⛅🌞🌞🌞👻👽👾👾🤖🤖 :");
	String month=scn.next();
	System.out.println("enter a year");
	int year=scn.nextInt();
	switch(month) {
	case "jan":
	case "mar":
	case "may":
	case "july":
	case "aug":
	case "oct":
	case "dec":System.out.println("31 days");break;
		
	case "apr":
	case "june":
	case "sep":
	case "nov": System.out.println("30 days");break;
	
	case "feb":if((year%4==0)&&((year%400==0)||(year%100!=0))){
		        System.out.println("28 days");
                 	}
	           else System.out.println(" 29 days");
		
	}
}
}
