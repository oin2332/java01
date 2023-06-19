package day1;

public class Sample06 {
	public static void main(String[] args) {
		// 모든숫자의 합 ( 음순
		int arr[] = { 4, -3, 5, -2, 1, -8, 7, -9 };
		int sum = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				sum += arr[i];
			} else {
				sum += -arr[i];
			}//if
//		sum+= Math.abs(arr[i]);
		}

	}
}
