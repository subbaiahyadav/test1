package arrayalgorithms;

import java.util.Arrays;

public class bubblesort {
	public static void main(String[] args) {
	int[]a= {5,9,4,10,6};
	sort(a);
	System.out.println(Arrays.toString(a));
	}
	public static void sort(int[]a) {
		for(int j=0;j<a.length;j++) {
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1]) {
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
		}
	}
	
}
