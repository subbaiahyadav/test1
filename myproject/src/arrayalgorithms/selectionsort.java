package arrayalgorithms;

import java.util.Arrays;

public class selectionsort {
	public static void main(String[] args) {
		int[]a= {5,8,1,6,2};
		sort(a);
		System.out.println(Arrays.toString(a));
	}
public static void sort(int[]a) {
	for(int i=0;i<a.length;i++) {
		int index=i;
		for(int j=i+1;j<a.length;j++) {
			if(a[j]<a[index])index=j;
		}
		if(i!=index) {
			int temp=a[i];
			a[i]=a[index];
			a[index]=temp;
		}
	}
}
}
