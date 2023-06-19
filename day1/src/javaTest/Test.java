package javaTest;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		while (true) {

			int num = s.nextInt();
			if (num > 30 || num < 0) {
				System.out.println("0~30");
			} else if (num > 40 || num < 0) {
				System.out.println("dd");
			}

		}
	}
}
