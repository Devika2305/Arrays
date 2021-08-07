
public class BinarySearch {

	static boolean binary_search(int arr[], int low,int high,int data) {
		int mid = (low+high)/2;
		if(low > high)
			return false;
		if(arr[mid] == data)
			return true;
		else if(arr[mid] > data)
			return binary_search(arr,low,mid-1,data);
		else 
			return binary_search(arr,mid+1,high,data);
	}
	public static void main(String[] args) {

		int arr[] = {1,5,8,7,6,2,9,4,3};
		int data = 8;
		boolean res = binary_search(arr,0,arr.length-1,data);
		
		if(res == false)
			System.out.println("Number not found");
		else
			System.out.println("Number found");
	}
}
