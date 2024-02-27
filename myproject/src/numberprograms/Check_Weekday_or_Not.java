package numberprograms;

import java.util.Scanner;

public class Check_Weekday_or_Not {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter a dayname : ");
	String day=scn.next();
	switch(day) {
	   case "monday":
	   case "tuesday":
	   case "wednesday":
	   case "thursday":
	   case "friday":
	   case "MONDAY":
	   case "TUESDAY":
	   case "WEDNESDAY":
	   case "THURSDAY":
	   case "FRIDAY":System.out.println("it is a weekday");break;
	   case "saturday":
	   case "sunday":
	   case "SATURDAY":
	   case "SUNDAY":System.out.println("it's weekend");
	   default:System.out.println("it,s a wrong input  😁❤️");
    
		
	}
}
}
