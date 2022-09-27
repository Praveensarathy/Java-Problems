package zoho;

import java.util.Arrays;
import java.util.HashMap;

public class Factors {

	public static void main(String[] args) {
		int a[] = {8,2,3,16,12};
		int i,j,count=0;
		int b[] = new int[a.length];
		HashMap<Integer,Integer> hash = new HashMap();
		for(i=0;i<a.length;i++) {
			if(a[i] <=3) {
				hash.put(a[i],1);
				b[i] = 1;
				continue;
			}
			for(j=2;j<a[i];j++) {
				if(a[i]%j == 0) {
					count++;
				}
			}
			hash.put(a[i], count);
			b[i] = count;
			count=0;
		}int temp;
		//System.out.println(Arrays.toString(b));
		for(i=0;i<b.length;i++) {
			for(j=i+1;j<b.length;j++) {
				if(b[i] < b[j] ) {
					temp =b[i];
					b[i] = b[j];
					b[j] = temp;
					
					temp =a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			
		}
		for(i=0;i<a.length;i++) {
			System.out.print(a[i] +"  " );
		}
		/*
		 * System.out.println(Arrays.toString(a)); System.out.println();
		 *///System.out.println(hash);

	}

}
