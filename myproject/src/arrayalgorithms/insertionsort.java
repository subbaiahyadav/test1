package arrayalgorithms;

import java.util.Arrays;

public class insertionsort {
	public static void main(String[] args) {
		int[]a= {5,4,8,9,1,3};
		sort(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static void sort(int []a) {
		for(int i=1;i<a.length;i++) {
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key) {
			  a[j+1]=a[j];
			  j--;
			}
			a[j+1]=key;
		}
	}

}
