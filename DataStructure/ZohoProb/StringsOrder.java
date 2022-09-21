package zoho;

import java.util.Arrays;
import java.util.Collections;

public class StringsOrder {

	public static void main(String[] args) {
		String s ="lpag";
		String s2 = ""; 
		char c[] = new char[s.length()];
		char temp;
		for(int i =0;i<s.length();i++) {
			c[i] = s.charAt(i);
		}
		Arrays.sort(c);
		System.out.println(c);
//		for(int i =0;i<s.length();i++) {
//			for(int j=i+1;j<s.length();j++) {
//				if(c[i] > c[j]) {
//					temp = c[i];
//					c[i] =c[j];
//					c[j] = temp;
//				}
//			}
//			s2 += c[i];
//		}
//		System.out.println(s2);
		
	}

}
