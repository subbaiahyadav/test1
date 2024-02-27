package numberprograms;

public class Swap_Two_Numbers_With_Out_Third_Variable {
public static void main(String[] args) {
	int a=10;
	int b=20;
/*	a=a+b;
	b=a-b;
	a=a-b;*/
	
	a=a^b;
	b=a^b;
	a=a^b;
	System.out.println(a);
	System.out.println(b);
}
}
