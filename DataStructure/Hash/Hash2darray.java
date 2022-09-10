package Javabasics;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class Hash2darray  {

	public static void main(String[] args) {
		
		String arr[][] = {{"luke" , "shaw"},{"whyne","rooney"},{"rooney","ronaldo"},{"shaw","rooney"}};
		int j =0;
		String str = "ronaldo" ;
		String str2 = null;
		HashMap<String ,String> hash = new HashMap<String ,String> ();
		for(int i=0;i<arr.length;i++) {
			hash.put(arr[i][j++],arr[i][j]);
			j=0;
			}
		System.out.println(hash);
		for(Entry<String,String> entry : hash.entrySet() ) {
			if(entry.getValue()== str) {
				str2 = entry.getKey();
			}
		}
		int count=0;
		for(Entry<String,String> entry : hash.entrySet() ) {
			if(entry.getValue()== str2) {
				System.out.println(entry.getKey());
				count++;
			}
		}
		System.out.println("count is "+ count);
		
	}
}
