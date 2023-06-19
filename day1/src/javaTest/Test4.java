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
			System.out.println(i + "문제");
			int b = r.nextInt(9) + 1;
			System.out.print(a + "*" + b + " = ");
			int age = s.nextInt();
			if (a * b == age) {
				System.out.println("정답");
				num += 20;
			} else {
				System.out.println("오답. 정답은 " + a * b + "입니다");

			}// if1

		}// for'
		System.out.println("총점수는 : " + num + "점입니다");
		System.out.println("종료");
	}

}
