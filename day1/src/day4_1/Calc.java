package day4_1;

import java.util.Arrays;
import java.util.Scanner;

import javax.sound.sampled.Mixer;

public class Calc {

	public Calc() {

	}

	void message() {
		System.out.println("�ȳ��ϼ���");
	}

	String message2() {
		return "�ȳ��ϼ���2";
	}

	void sum(int a, int b) {
		System.out.println(a + b);
	}

	int sum2(int a, int b) {
		return a + b;
	}

	double sum2(int a, double b) {
		return a + b;
	}

	void max(int a, int b) {
		int c = a >= b ? a : b;
		System.out.println("ū����" + c + "�Դϴ�");
	}

//	void arr1(int arr[]) {
//		int maxIndex = 0;
//		int minIndex = 0;
//
//		// 3,2,6,5,4
//		// 3,6,2,5,4 (���� ���� ���ڿ� ����ū ���� �ٲٱ� )
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i] > arr[maxIndex]) {
//				maxIndex = i;
//			}
//			if (arr[minIndex] > arr[i]) {
//				minIndex = i;
//			}
//		}
//		int temp = arr[maxIndex];
//		arr[maxIndex] = arr[minIndex];
//		arr[minIndex] = temp;
//
//		System.out.println(Arrays.toString(arr));
//
//	}
//	
	
	void arr2(int arr[]){
		//���� ���� ������ ��ġ�� ������ �迭 ���� ��ġ �ٲٱ�
		// 3,2,6,5,4
		int minIndex = 0;
		int q = 0;
		for(int i = 1; i < arr.length; i++){
			q=i;
			if (arr[minIndex] > arr[i]){
				minIndex = i;
			}
		}
		
//		int temp =arr[minIndex];
//		arr[minIndex] = arr[q];
//		arr[q] = temp;
		
		int temp =arr[minIndex];
		arr[minIndex] = arr[arr.length-1];
		arr[arr.length-1] = temp;
		System.out.println(q);
		System.out.println(Arrays.toString(arr));
		
		
	}

}
