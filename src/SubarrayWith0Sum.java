//https://practice.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1
import java.util.*;
public class SubarrayWith0Sum {
	public static void main(String[] args) {
		int arr[] = {4,2,-3,1,6};
		int n = arr.length;
		
		HashSet<Integer> s = new HashSet<>();
		int sum = 0;
		int flag = 0;
		for(int el:arr) {
			s.add(sum);
			sum+=el;
			if(s.contains(sum))
				flag=1;
		}
		System.out.println(s);
		if(flag==1)
			System.out.println("Subarray with sum 0 is present");
		else
			System.out.println("Subarray with sum 0 is not present");

	}

}
