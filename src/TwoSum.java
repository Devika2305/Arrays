//https://leetcode.com/problems/two-sum/

import java.util.HashMap;

public class TwoSum {
	
	public static int[] twosum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int a = target-nums[i];
            if(map.containsKey(a))
                return new int[] {map.get(a),i};
            map.put(nums[i],i);
        }
        return null;
    }
	
	public static void main(String[] args) {

		int nums[] = {2,7,11,15};
		int target = 9;
		System.out.println(twosum(nums,target));
	}

}
