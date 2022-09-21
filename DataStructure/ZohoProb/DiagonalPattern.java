package zoho;

import java.util.Scanner;

public class DiagonalPattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int i,j,mid=s.length()/2,n=s.length()-1;
		int min =0;
		if(s.length()%2!=0) {
		for(i=0;i<s.length();i++) {
			for(j=0;j<s.length();j++) {
				if(j == mid && (i==min|| i==s.length()-1)) {
					System.out.print(s.charAt(mid)+" ");
				}
				else if(i==mid && (j==min || j==n ))
					System.out.print(s.charAt(min)+" ");
				else if((j==mid-1 || j==mid+1) && (i==min+1 ||i==n-min-1  ) )
					System.out.print(s.charAt(mid-1)+" ");
				else if((j==mid-2 || j==mid+2) && (i== min+2 || i == n-min-2 ))
					System.out.print(s.charAt(mid-2 )+" ");
				else
					System.out.print("   ");
				
			}
			System.out.println();
		}
		}
		else {
			System.out.println("Not Possible");
		}

	}

}
