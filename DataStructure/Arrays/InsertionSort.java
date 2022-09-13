package javabasics;

public class Insertion {

	public static void main(String[] args) {
		int a[] = {5,8,2,4,3,1,6,7,9};
		int n = a.length;
		int i,j,temp;
		for(i=1;i<n;i++) {
			for(j=i;j>0;j--) {
				if(a[j] < a[j-1]) {
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
				else
					break;
			}
		}
		for(i=0;i<n;i++) {
			System.out.print(a[i] + " ");
		}
		

	}

}
