package Test;

public class Test2 {
	public static void main(String[] args) {
		// �迭 { 15, 22, 33, 50, 19, 2}�� Ȧ������
		// ��հ� ¦������ ��� ���ϱ�
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
		System.out.println("¦�� ��� : " + oddSum / oddCnt);
		System.out.println("Ȧ�� ��� : " + evenSum / evenCnt);
	}// main
}// class
