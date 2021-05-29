//https://leetcode.com/problems/find-the-duplicate-number/
import java.util.*;
public class FindDuplicate {

    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i] == nums[i+1])
                return nums[i];
        }
        return -1;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {3,1,3,4,2};
		FindDuplicate obj = new FindDuplicate();
		System.out.println(obj.findDuplicate(nums));
}

}