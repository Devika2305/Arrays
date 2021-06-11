//https://practice.geeksforgeeks.org/problems/maximum-product-subarray3604/1
public class MaxProductSubarray {
	public static void main(String[] args) {
		int arr[] = {6,-3,-10,0,2};
		int n = arr.length;
		
		//O(N) time complexity
		int min = arr[0];
		int max = arr[0];
		int pro = arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]<0) {
				int temp = max;
				max = min;
				min = temp;
			}
			max = Math.max(arr[i], (max*arr[i]));
			min = Math.min(arr[i], (min*arr[i]));
			pro = Math.max(max, pro);
		}
		System.out.println("Maximum Product of subarray = "+pro);
		
		
		//Brute force 
//		int product=arr[0];
//		for(int i=0;i<n;i++) {
//			int pro =1;
//			int max_pro = arr[i];
//			for(int j=i;j<n;j++) {
//				pro = pro*arr[j];
//				max_pro = Math.max(pro,max_pro);
//			}
//			product = Math.max(max_pro, product);
//		}
//		System.out.println("Maximum product = "+product);
	}

}
