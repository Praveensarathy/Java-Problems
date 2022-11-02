

import java.util.Arrays;

public class ArrayProduct {

	public static void main(String[] args) {
		Integer i =0,a[]= {1,2,10,0,4},pro=1;
		int b[] = new int[a.length];
		for(i=0;i<a.length;i++) {
			if(a[i]==0) {
				continue;
			}
			pro *= a[i];
		}
		int flag =0;
		for(i=0;i<a.length;i++) {
			if(flag ==0 && a[i]!= 0) {
				b[i] = pro/a[i];
			}
			if(a[i] ==0 ) {
				b[i]= pro;
				flag = 1;
				continue;
			}
			b[i]= 0;
		}
		System.out.println(Arrays.toString(b));
	}

}
