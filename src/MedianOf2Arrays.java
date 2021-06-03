//https://www.geeksforgeeks.org/median-of-two-sorted-arrays-of-different-sizes/
import java.util.*;
public class MedianOf2Arrays {
	
	public static int[] merge(int arr1[], int arr2[], int n, int m) 
    {
		int arr3[]=new int[n+m];
		int i=0,j=0,k=0;
        while(i < n && j < m)
        {
        	if(arr1[i]<arr2[j])
        		arr3[k++]=arr1[i++];
        	else
        		arr3[k++]=arr2[j++];
        }
        while(i<n)
        	arr3[k++]=arr1[i++];
        while(j<m)
        	arr3[k++]=arr2[j++];
        return arr3;
    }
	
	public static void median(int arr3[])
	{
		int l = arr3.length;
		int med;
		if(l%2 == 0) {
			med = (arr3[(l/2)-1] + arr3[l/2]) / 2;
		}
		else {
			med = arr3[(l)/2];
		}
		System.out.println("Median = "+med);
	}
	public static void main(String[] args) {
		int A[] = {2,3,5,8};
		int B[] = {10,12,14,16,18,20};
		int C[] = merge(A, B, A.length, B.length);
		median(C);
	}

}
