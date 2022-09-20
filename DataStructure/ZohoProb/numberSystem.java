package javabasics;

import java.util.*;

public class numberSystem {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int m =0;
		for(int i=1;i<=n;i++) {
			m=i;
			while(m!=0) {
				if(3== m%10 || 4==m%10) {
					m = m/10;
				}
				else
					break;
			}
			if(m==0) {
				System.out.println(i);
			}
		}
	}

}
