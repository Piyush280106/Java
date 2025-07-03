public class Assignment11 {

	public static void main(String[] args) {
		int arr[] = {15, 5, 10};
		int max = arr[0]; 

		for (int i = 1; i <3; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println("Max: " + max);
	}
}
