package arrayalgorithms;

import java.util.Arrays;

public class mergesort {
	public static void main(String[] args) {
		int[]a= {5,8,6,5,2,4,1,9};
		sort(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static void sort(int []a) {
		if(a.length==1)return;
		int []left=new int[a.length/2];
		int [] right=new int[a.length-left.length];
		int i;
		for(i=0;i<left.length;i++) {
			left[i]=a[i];
		}
		for(int j=0;j<right.length;j++) {
			right[j]=a[i++];
		}
		sort(left);
		sort(right);
		merge(left,right,a);
	}
	public static void merge(int[]a,int[]b,int[]c) {
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length) {
			if(a[i]< b[j])c[k++]=a[i++];
			else
				c[k++]=b[j++];
		}
		while(i<a.length)c[k++]=a[i++];
		while(j<b.length)c[k++]=b[j++];
	}

}
