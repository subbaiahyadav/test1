package numberprograms;

public class Given_Number_Is_Prime_Or_Not {
public static void main(String[] args) {
	int num=6;int count=0;
	for(int i=1;i<=num;i++) {
		if(num%i==0)count++;
		
	}
	if(count==2)System.out.println("is prime");
	else System.out.println("is not prime");
}
}
