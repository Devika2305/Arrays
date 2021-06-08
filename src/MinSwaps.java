//https://practice.geeksforgeeks.org/problems/minimum-swaps-required-to-bring-all-elements-less-than-or-equal-to-k-together4847/1
public class MinSwaps {
	public static void main(String args[]) {
		int arr[] = {2,1,5,6,3};
		int k = 3;
		int n = arr.length;
		int c=0;   //no. of values less than k
		for(int i=0;i<n;i++) {
			if(arr[i]<=k)
				c++;
		}
	    int bv = 0;  //unwanted elements
	    for (int i = 0; i < c; ++i) 
	    if (arr[i] > k) 
	        ++bv; 
	  
	    int ans = bv; 
	    for (int i = 0, j = c; j < n; ++i, ++j) 
	    { 	     
	    	if (arr[i] > k) 
	    		--bv;  
	    	if (arr[j] > k) 
	    		++bv; 
	  
	    	ans = Math.min(ans, bv); 
	    } 
	    System.out.println(ans);  
	}
}
