package javaTest;

import java.util.*;

public class Test4 {

	public static void main(String[] args) {

		Random r = new Random();
		Scanner s = new Scanner(System.in);
		int num = 0;

		// for(int x= 0; x<5; x++ ){
		for (int i = 1; i <= 5; i++) {
			int a = r.nextInt(8) + 2;// 2~9
			System.out.println(i + "����");
			int b = r.nextInt(9) + 1;
			System.out.print(a + "*" + b + " = ");
			int age = s.nextInt();
			if (a * b == age) {
				System.out.println("����");
				num += 20;
			} else {
				System.out.println("����. ������ " + a * b + "�Դϴ�");

			}// if1

		}// for'
		System.out.println("�������� : " + num + "���Դϴ�");
		System.out.println("����");
	}

}
