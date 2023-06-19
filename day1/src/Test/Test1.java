package Test;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		// 6개의 숫자를 입력받아 배열에 저장하고 숫자에
		// 순차적으로 접근하여 홀수일 경우 음수로 바꿔준다
		Scanner s = new Scanner(System.in);
		int arr[] = new int[6];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("6개의 숫자를 입력하시오 : ");
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
