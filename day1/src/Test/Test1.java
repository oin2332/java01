package Test;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		// 6���� ���ڸ� �Է¹޾� �迭�� �����ϰ� ���ڿ�
		// ���������� �����Ͽ� Ȧ���� ��� ������ �ٲ��ش�
		Scanner s = new Scanner(System.in);
		int arr[] = new int[6];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("6���� ���ڸ� �Է��Ͻÿ� : ");
			int a = s.nextInt();
			if (a % 2 == 0) {
				arr[i] = a;
			} else {
				arr[i] = -a;
			}
		}
		System.out.println(Arrays.toString(arr));

		
		
		
		
		
		
	}// main

}// class
