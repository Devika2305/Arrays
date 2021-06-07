//Merging 2 arrays using 3rd array
public class MergeWithExtra {
	
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
	
	public static void main(String[] args) {
		int A[] = {2,3,5,8};
		int B[] = {10,12,14,16,18,20};
		int C[] = merge(A, B, A.length, B.length);
		for(int i = 0;i<C.length;i++) {
			System.out.print(C[i]+" ");
		}
	}
}
