
class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        HashMap<Integer,Integer>  hash = new HashMap<Integer,Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        int count  = 0;
        for(int i=0;i<n;i++){
            count =1;
            if(!(hash.containsKey(arr[i])))
                hash.put(arr[i],count);
            else{
                for(Entry<Integer,Integer> entry : hash.entrySet() ) {
            		if(entry.getValue()== hash.get(arr[i])){
            			hash.put(arr[i],entry.getValue()+1); 
            			break;
            		}
            	}
            }
        }
        for(Entry<Integer,Integer> entry : hash.entrySet() ) {
       		if(entry.getValue()!=1){
       		    list.add(entry.getKey());
        	}
        }
        Collections.sort(list);
        if(list.size()==0){
            list.add(-1);
        }
        return list;
    }
}
