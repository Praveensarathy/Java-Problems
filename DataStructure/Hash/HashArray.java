class HashArray {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer,Integer> list = new HashMap<>();
		for(int i =0; i<nums.length;i++) {
			if(list.get(nums[i])!=null) {
				int num = list.get(nums[i]);
				num++;
				list.put(nums[i], num);
			}
			else
				list.put(nums[i], 1);
		}
        int val =0;
        for(int i : list.keySet()){
            if(list.get(i) == 1)
                val = i;
        }
        return val;
    }
}
