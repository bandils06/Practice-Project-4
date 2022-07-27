
public class MainLIS {

	public static void main(String[] args) {
		int arr[] = {5, 23, 33,64,22,12,69};
		LIS obj = new LIS();
		System.out.println("Longest increasing sequence: " + obj.lengthLIS(arr));
	}

}
