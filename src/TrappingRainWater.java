//https://practice.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1
public class TrappingRainWater {

	static int rainWater(int arr[], int n) {
		int left[] = new int[n];
		int right[] = new int[n];
		
		left[0] = arr[0];
		for(int i = 1;i<n;i++) {
			left[i] = Math.max(arr[i], left[i-1]);
		}
		
		right[n-1] = arr[n-1];
		for(int i = n-2;i>=0;i--) {
			right[i] = Math.max(arr[i], right[i+1]);
		}
		
		int maxWater = 0;
		for(int i =0;i<n;i++) {
			maxWater += Math.min(left[i],right[i]) - arr[i];
		}
		return maxWater;
	}
	public static void main(String[] args) {

		int n = 6;
		int arr[] = {3,0,0,2,0,4};
		System.out.println("Max units of water stored = "+rainWater(arr,n));
	}

}


