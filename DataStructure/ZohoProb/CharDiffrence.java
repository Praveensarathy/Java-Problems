package zoho;

public class CharDiffrence {

	public static void main(String[] args) {
		String s = "adzx";
		
		int def = s.charAt(0) - s.charAt(1),temp,flag =0;
		for(int i =1;i<s.length()-1;i++) {
			temp = s.charAt(i) - s.charAt(i+1);
			if(def==temp) {
				flag=0;
			}
			else {
				flag = 1;
	
				break;
			}
		}
		if(flag==0) {
			System.out.println("Equal Difference");
		}
		else
			System.out.println("Not Equal Difference");
	}

}
