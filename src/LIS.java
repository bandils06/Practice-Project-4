
public class LIS {
	int lengthLIS(int arr[]) {
		int r = 1;
		int small = arr[0];
		
		int i = 1;
		while (i < arr.length) { 	
			if (small < arr[i]) {
				r++;	
				small = arr[i];
			}
			i++;	
		}
		return r;
	}
}
