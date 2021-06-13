// Hackerearth:  https://www.hackerearth.com/practice/codemonk/
//Right rotation
public class RightRotation {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int n =arr.length;
		int r = 2;
		int rp = r;
		int a[] = new int[n-rp];
		//int i = 0;
//		while(rp>n) {
//			a[i] = arr[rp];
//			i++;
//			rp++; 
//		}
//		rp=0;
//		while(rp<r) {
//			a[i] = arr[rp];
//			i++;
//			rp++;
//		}
//		for(int k=0;k<n;k++) {
//			System.out.print(a[k]+" ");
//		}
		while(rp>n) {
			rp = rp-n;
		}
		for(int i =n-rp;i<n;i++) {
			arr[i-rp-1] = arr[i];
		}
		for(int i = 0;i<n-rp;i++) {
			a[i] = arr[i];
		}
		for(int i = 0;i<n-rp;i++) {
			arr[i+rp] = a[i];
		}
		for(int k=0;k<n;k++) {
			System.out.print(a[k]+" ");
		}

	}

}
