//https://www.geeksforgeeks.org/number-subarrays-sum-exactly-equal-k/
import java.util.*;
public class SubarrayWith_K_Sum {
	public static void main(String[] args) {
		int arr[] = {9,4,20,3,10,5};
		int n = arr.length;
		int k= 33;
		HashSet<Integer> s = new HashSet<>();
		int sum = 0;
		int flag = 0;
		for(int el:arr) {
			s.add(sum);
			sum+=el;
			//s.add(sum);
			if(s.contains(sum-k))
				flag=1;
		}
		System.out.println(s);
		if(flag==1)
			System.out.println("Subarray with sum "+k+" is present");
		else
			System.out.println("Subarray with sum "+k+" is not present");

	}

}
