package Javabasics;

public class Xpattern {

	public static void main(String[] args) {
		int i,j,n;
		String s = "Program";
		n = s.length();
		int m = n-1;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(j==i ) {
					System.out.print(s.charAt(i));
				}
				else if( j+i == n-1) {
					System.out.print(s.charAt(m--));
					
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
