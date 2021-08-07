
public class LinearSearch {

	static int linear_search(int arr[],int data) {
		for(int i =0;i<arr.length;i++) {
			if(arr[i] == data)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {

		int arr[] = {1,5,8,7,6,2,9,4,3};
		int data = 4;
		int res = linear_search(arr,data);
		
		if(res == -1)
			System.out.println("Number not found");
		else
			System.out.println("Number "+data+" found at position "+(res+1));
	}

}
