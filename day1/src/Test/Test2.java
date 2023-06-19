package Test;

public class Test2 {
	public static void main(String[] args) {
		// ¹è¿­ { 15, 22, 33, 50, 19, 2}ÀÇ È¦¼öµéÀÇ
		// Æò±Õ°ú Â¦¼öµéÀÇ Æò±Õ ±¸ÇÏ±â
		int arr[] = { 15, 22, 33, 50, 19, 2 };
		int oddSum = 0;
		int evenSum = 0;
		double oddCnt = 0;
		double evenCnt = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				oddSum += arr[i];
				oddCnt++;
			} else {
				evenSum += arr[i];
				evenCnt++;
			}
		}// forOUT
		System.out.println("Â¦¼ö Æò±Õ : " + oddSum / oddCnt);
		System.out.println("È¦¼ö Æò±Õ : " + evenSum / evenCnt);
	}// main
}// class
