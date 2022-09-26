package zoho;

import java.util.Scanner;

public class RevStr {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		String str = sc.nextLine(); 
		str +='\0';
		System.out.println(fun(str));
	}
	public static String fun (String str) {
		int i =0;
		String temp = "";
		while(str.charAt(i) != ' ' ) {
			if( str.charAt(i) == '\0')
				break;
			else
				temp += str.charAt(i++);
		}
		if(str.charAt(i)== '\0' ) {
			return temp;
		}
		return fun(str.substring(++i)) +" "+ temp;
	}

}
