//https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1

public class KadaneAlgo {
	int kadane(int arr[], int n) {
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for(int i=0;i<n;i++) {
			sum = sum + arr[i];
			if(max<sum)
				max=sum;
			if(sum<0)
				sum=0;			
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,-2,5};
		KadaneAlgo obj =  new KadaneAlgo();
		System.out.println(obj.kadane(arr, 5));
	}
}
