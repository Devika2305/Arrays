
public class First_Repeat {

	static void repeat(int arr[]) {
		for(int i =0;i<arr.length;i++) {
			int c =0;
			for(int j =0;j<arr.length;j++) {
				if(arr[i] == arr[j])
					c++;
			}
			if(c>1) {
				System.out.println(arr[i]);
				break;
			}
		}
	}
	public static void main(String[] args) {

		int arr[] = {3,2,1,2,2,3};
		repeat(arr);
		
	}

}
