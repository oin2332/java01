package day4_1;

import java.util.Scanner;

public class Won2Dollar {
	int d;

	Won2Dollar(int d) {
		this.d = d;
	}
	
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("���� �޷��� �ٲߴϴ�.\n���� �Է��ϼ���>>");
		int c = s.nextInt();
		System.out.println(c/d+"�޷��Դϴ�");
		
	}
}
