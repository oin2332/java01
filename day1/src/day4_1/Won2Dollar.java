package day4_1;

import java.util.Scanner;

public class Won2Dollar {
	int d;

	Won2Dollar(int d) {
		this.d = d;
	}
	
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("원을 달러로 바꿉니다.\n원을 입력하세요>>");
		int c = s.nextInt();
		System.out.println(c/d+"달러입니다");
		
	}
}
