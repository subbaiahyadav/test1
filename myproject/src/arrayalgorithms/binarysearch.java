package arrayalgorithms;

public class binarysearch {
    public static void main(String[] args) {
		   int []a= {5,9,12,19,21};
		   System.out.println(sort(a,19));
	}
    
    public static int sort(int[]a,int b) {
    	int i=0,j=a.length-1;
    	while(i<=j) {
    		int mid=(i+j)/2;
    	if(b==a[mid])return mid;
    	else if (b<a[mid])j=mid-1;
    	else i=mid+1;
    	}
    	return -1;
    }
}
