
public class FirstLastOccurrence {

	static int last(int arr[],int k) {
		int low =0,high=arr.length-1,res=-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid] == k) {
				res = mid;
				low = mid+1;
			}
			else if(arr[mid] < k) {
				low = mid+1;
			}
			else
				high = mid-1;
		}
		return res;
	}
	
	static int first(int arr[],int k) {
		int low =0,high=arr.length-1,res=-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid] == k) {
				res = mid;
				high = mid-1;
			}
			else if(arr[mid] < k) {
				low = mid+1;
			}
			else
				high = mid-1;
		}
		return res;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,3,5,5,5,5,7,8,6};
		int k = 5;
		int lst = last(arr,k);
		int frst = first(arr,k);
		System.out.println("First occurence = "+frst);
		System.out.println("Last occurrence = "+lst);
	}

}
