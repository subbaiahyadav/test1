package pattern;

public class L {
public static void main(String[] args) {
	int rows=5;
	for(int i=0;i<rows;i++) {
		for(int j=0;j<=i;j++) {
			if(j==0||i==rows-1)System.out.print("* ");
		}
		System.out.println();
	}
}
}
