
public class Value_index {

	public static void main(String[] args) {

		int arr[] = {15,8,2,21,7};
		int f = 0;
		for(int i =0;i<arr.length;i++) {
			if(arr[i] == i)
				System.out.println(arr[i]);
			else
				f++;
		}
		if(f == arr.length)
			System.out.println("Value equal to index not found");
	}
	
}
