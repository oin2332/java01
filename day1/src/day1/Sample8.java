package day1;

import java.util.Arrays;

public class Sample8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int arr[] = { 9, 6, 7, 3, 5 }; int minIndex = 0; int maxIndex = 0;
		 * System.out.println(Arrays.toString(arr)); for (int i = 1; i <
		 * arr.length; i++) { if (arr[maxIndex] < arr[i]) { maxIndex = i; } if
		 * (arr[minIndex] > arr[i]) { minIndex = i; } }// for int temp =
		 * arr[maxIndex]; arr[maxIndex] = arr[minIndex]; arr[minIndex] = temp;
		 * System.out.println("�ִ밪 :" + arr[maxIndex]);
		 * System.out.println("�ּҰ� :" + arr[minIndex]);
		 * System.out.println(Arrays.toString(arr));
		 */

		// ���� ���� ���ڿ� 0�� ��� ����
		int arr[] = { 9, 6, 3, 7, 5 };
		int minIndex = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[minIndex] < arr[i]) {
				minIndex = i;
			}

		}
		int temp = arr[0];
		arr[0] = arr[minIndex];
		arr[minIndex] = temp;

		System.out.println(Arrays.toString(arr));
	}

}
