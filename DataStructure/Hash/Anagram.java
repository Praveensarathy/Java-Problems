package javabasics;

import java.util.HashMap;

public class Anagram {

	public static void main(String[] args) {
		String s2 = "cat";
		String s1 = "atc";
		
		HashMap<Character ,Integer> hash = new HashMap<>();
		HashMap<Character ,Integer> hash1 = new HashMap<>();
		int j=1;
		
		if(s1.length()!= s2.length()) {
			System.out.println("not a anagram");
			return;
		}
			

		for(int i =0;i<s1.length();i++) {
			if(hash.containsKey(s1.charAt(i))) {
				hash.put(s1.charAt(i), hash.get(s1.charAt(i))+1);
			}
			else
				hash.put(s1.charAt(i),j);
			
			if(hash1.containsKey(s2.charAt(i))) {
				hash1.put(s2.charAt(i), hash1.get(s2.charAt(i))+1);
			}
			else
				hash1.put(s2.charAt(i),j);
		}

		if(hash.equals(hash1)) 
			System.out.println("Its a anagaram");
		else
			System.out.println("Its not a anagram");
		

	}

}
