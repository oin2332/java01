package day4_1;

import java.util.Arrays;
//import java.util.Scanner;

public class ClacMain {

	public static void main(String[] args) {

		Calc calc = new Calc();
		calc.message();
		// �ȳ��ϼ���
		System.out.println(calc.message2());
		// �ȳ��ϼ��� 2
		calc.sum(1, 2);
		// 3���
		int a = calc.sum2(3, 4);
		System.out.println(a);

		
		double b = calc.sum2(1, 2.5);
		System.out.println(b);

//		Scanner s = new Scanner(System.in);
//		int c = s.nextInt();
//		int d = s.nextInt();
//		calc.max(c, d);
//		s.close();

		int arr[] = { 3, 2, 6, 5, 4 };
	//	calc.arr1(arr);
		
		calc.arr2(arr);

		

		
	}// main
}// class
