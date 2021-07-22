//https://practice.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1

import java.util.*;
public class ChocolateDistribution {

	static int minDiff(int[] arr,int m,int n) {
		int min = Integer.MAX_VALUE;
		for(int i =0;i+m-1<n;i++) {
			int diff = arr[i+m-1] - arr[i];
			min = Math.min(min,diff);
		}
		return min;
	}
	public static void main(String[] args) {

		int n = 8;
		int m = 5;
		int arr[] = {3,4,1,9,56,7,9,12};
		Arrays.sort(arr);
		System.out.println("Min diff between max and min chocolates = "+minDiff(arr,m,n));
	}

}
