//https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/1
import java.util.Arrays;

public class MinDiff {
	int getMinDiff(int arr[],int n,int k) {
		int min=0,max=0,r=0;
        Arrays.sort(arr);
        r=arr[n-1]-arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>=k)
            {
            max=Math.max(arr[i-1]+k,arr[n-1]-k);
            min=Math.min(arr[i]-k,arr[0]+k);
            r=Math.min(r,max-min);
            }
            else
            {
                continue;
            }
        }
        return r;
	}
	
	public static void main(String args[])
	{
		int arr[] = {1, 5, 8, 10};
		int k = 2;
		MinDiff obj = new MinDiff();
		System.out.println((obj.getMinDiff(arr, 10, k)));
		
		
	}
}
