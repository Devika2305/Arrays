//https://leetcode.com/problems/find-the-duplicate-number/
public class DuplicateN_1Array {

	
	//time complexity O(N) & space complexity O(N)
	static void duplicate(int arr[], int n ) {  
		int freq[] = new int[n];
		for(int i =0;i<n;i++) {
			if(arr[i] == 1)
				freq[0]++;
			if(arr[i] == 2)
				freq[1]++;
			if(arr[i] == 3)
				freq[2]++;
			if(arr[i] == 4)
				freq[3]++;
		}
		for(int i =0;i<n;i++) {
			if(freq[i] > 1)
				System.out.println("Element "+(i+1)+" frequency = "+freq[i]);
		}
	}
	
	public static void main(String[] args) {

		int n =5;
		int arr[] = {1,3,4,2,2};
		duplicate(arr,n);
		
	}

}
