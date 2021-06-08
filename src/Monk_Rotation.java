// Hackerearth:  https://www.hackerearth.com/practice/codemonk/
//Left rotation
public class Monk_Rotation {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int n =arr.length;
		int r = 2;
		int rp = r;
		int a[] = new int[n];
		int i = 0;
		while(rp<n) {
			a[i] = arr[rp];
			i++;
			rp++; 
		}
		rp=0;
		while(rp<r) {
			a[i] = arr[rp];
			i++;
			rp++;
		}
		for(int k=0;k<n;k++) {
			System.out.print(a[k]+" ");
		}

	}

}
