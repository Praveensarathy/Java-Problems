package javabasics;

import java.util.Arrays;

public class MergeSort {
	
	
	

	public static void main(String[] args) {
		int[] b = {3,7,8,1,9,4,2,5,0,6};
		System.out.println(Arrays.toString(mergeSort(b)));
		
		
		}
	

	public static int[] mergeSort(int []arr) {
		if(arr.length ==1) {
			return arr;
		}
		int mid = arr.length/2;
		int[] f = mergeSort(Arrays.copyOfRange(arr, 0, mid));
		int[] s = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
		
		return merge(f,s);
		
	}
	
	public static int[] merge(int[] a ,int[] b) {
		int [] c = new int[a.length+b.length];
		int i=0,k=0,j=0;
		while(i < a.length && j < b.length) {
			if(a[i]<b[j])
				c[k++] = a[i++];
			else
				c[k++] = b[j++];
		}
		while(i<a.length) {
			c[k++] = a[i++];
		}
		while(j<b.length) {
			c[k++] = b[j++];
		}
		return c;

	}
}
