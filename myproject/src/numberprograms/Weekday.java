package numberprograms;

import java.util.Scanner;

public class Weekday {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter a day number");
	int number=scn.nextInt();
	switch(number) {
	case 1:System.out.println("sunday");break;
	case 2:System.out.println("monday");break;
	case 3:System.out.println("tuesday");break;
	case 4:System.out.println("wednesday");break;
	case 5:System.out.println("thursday");break;
	case 6:System.out.println("friday");break;
	case 7:System.out.println("saturday");break;
	default :System.out.println("not a day");
	}
}
}
