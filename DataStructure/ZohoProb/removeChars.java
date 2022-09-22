class Solution{
    static String removeChars(String s1, String s2){
        String str ="";
        if(s1.length() > s2.length()){
            ArrayList<Character> c = new ArrayList<Character>();
            for(int i =0;i<s1.length();i++)
                c.add(s1.charAt(i));
            
            for(int i =0;i<s2.length();i++){
                for(int j =0;j<c.size();j++){
                    if(s2.charAt(i)==c.get(j))
                        c.remove(j);
                }
            }
            for(int i =0;i<c.size();i++)
                str+=c.get(i);
                
        }
        return str;
    }
}
