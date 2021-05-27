//https://www.geeksforgeeks.org/move-negative-numbers-beginning-positive-end-constant-extra-space/
import java.util.*;
public class MoveNegative {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter array size");
			int n=sc.nextInt();
			int arr[]=new int[n];
			System.out.println("Enter array elements: ");
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			int left=0,right=n-1;
			while(left<=right) {
				int temp;
				if(arr[left]<0) 
					left++;
				if(arr[left]>0) {
					if(arr[right]>0)
						right--;
					else 
					{
						temp=arr[left];
						arr[left]=arr[right];
						arr[right]=temp;
						left++;
						right--;
					}
				}
				else {
					left++;
					right--;
				}
			}
			System.out.println("Final array: ");
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			sc.close();
		}
}


