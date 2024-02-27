package arrayalgorithms;

public class linearsearch {
	public static void main(String[] args) {
		int []a= {5,1,2,9,6};
		System.out.println(search(a,6));
		
	}	
public static int search(int []a,int value) {
	for(int i=0;i<a.length;i++) {
		if(a[i]==value)return i;
	} 
	return -1;
}
}
