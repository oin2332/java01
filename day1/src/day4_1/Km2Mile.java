package day4_1;

import java.util.Scanner;

public class Km2Mile {
	double a;
	public Km2Mile(double a){
		this.a = a; 
	}
	
	void run(){
		Scanner s =new Scanner(System.in);		
		System.out.print("Km�� mile�� �ٲߴϴ�.\nKm�� �Է��ϼ���>> ");
		int b = s.nextInt();
		System.out.println("��ȯ��� : "+b/a+"mile �Դϴ� ");
	}
	
//	Km�� mile�� �ٲߴϴ�.
//	Km�� �Է��ϼ���>> 30
//	��ȯ ���: 18.75mile�Դϴ�

}
