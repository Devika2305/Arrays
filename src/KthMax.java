//https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1
import java.util.*;

public class KthMax {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();	
		// nlogn approach
		//Arrays.sort(arr);		
		//System.out.println("Kth max value: "+arr[(n-k)]);
		
		int d=0;
		PriorityQueue<Integer> mh = new PriorityQueue<Integer>(Collections.reverseOrder());   //MaxHeap
		if( k>0&& k<n) {
			for(int i:arr) {
				mh.add(i);
			}
			while(k-- !=0) {
				 d=mh.remove();
			}
			System.out.println("Kth max is: "+d);
		}
		else
			System.out.println("Invalid value of k");
		sc.close();
	}
}
