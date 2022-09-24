package zoho;

import java.util.Scanner;

public class ConcreateBox {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i,j,len= n*2-1;
		int m=0;
		
		for(i=0;i<len;i++) {
			for(j=0;j<len;j++) {
				m = min(i,j);
				m = min(m,len-i-1);
				m = min(m,len-j-1);
				System.out.print(n-m + " ");
			}
			System.out.println();
		}
	}
	public static int min(int a,int b) {
		return (a<b)? a:b;
	}

}
