//https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1
import java.util.*;
public class Sort012 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Sort012 obj=new Sort012();
		obj.sort(arr, n);
		sc.close();
	}
	void sort(int [] arr,int n) 
	{
		int i=0,j=0;
		int k=n-1;
		while(j<=k) 
		{
			switch(arr[j]) 
			{
			case 0: arr[i]+=arr[j]-(arr[j]=arr[i]);
					i++;j++;
					break;
			case 1: j++;
					break;
			case 2: arr[j]+=arr[k]-(arr[k]=arr[j]);
					k--;
			
			}
		}
		System.out.println("Sorted Array: ");
		for(int a=0;a<n;a++) 
		{
			System.out.print(arr[a]+" ");
	    }
	}
}


