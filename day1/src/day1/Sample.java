package day1;

import java.util.Random;
import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		/*
		 * String name = "ȫ�浿"; // �̸� int age = 30; // ���� double height = 170.5;
		 * double weight = 60.3; boolean flg = true;// true or false if (height
		 * > 180) { System.out.println("Ű�� 180�̻� �Դϴ�."); } else {
		 * System.out.println("Ű�� 180���� �Դϴ�"); }// if if (flg) {
		 * System.out.println("����"); } flg = false; if (flg) {
		 * System.out.println("����"); }
		 * 
		 * if (height > 180) { System.out.println("Ű�� 180���� �Դϴ�"); }else if
		 * (height > 170) { System.out.println("Ű�� 170���� �Դϴ�"); }else if (height
		 * > 160) { System.out.println("Ű�� 160���� �Դϴ�"); }
		 * 
		 * if (height >=180 & weight >= 60){ System.out.println("���"); }
		 */

		// 1 �Է��� 20���� �������ְ�
		// �Է¹��� ���ڴ� age ������ ����Ǳ� ������ �Է¹��� ���ڸ�ŭ Ŀ���� ���ؼ�

		// i= 1 i(1)�� �Է¹��� age(����)��ŭ ���ǽ��� �Է��ϸ�ȴ�
		// for (int i = 1; i <= 9; i++) {
		// for (int k = 9; k >= 2; k--) {
		// System.out.print(i + "x" + k + "=" + k * i + " ");
		// }
		// System.out.println();
		// }
		// int a = 0;
		// while (true) {
		// System.out.println(a++);
		// if (a == 100) {
		// break;
		// }
		// }// /while
/*
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		System.out.print("���� ���� �Է����ֽÿ� ");
		int num = s.nextInt();
	while(true){
		for (int i = 1; i <= num; i++) {
			int a = r.nextInt(8) + 2;// 2~9
			System.out.println(i + "����");
			int b = r.nextInt(9) + 1;
			System.out.print(a + "*" + b + " = ");
			int age = s.nextInt();
			if (a * b == age) {
				System.out.println("����");
			} else {
				System.out.println("����. ������ " + a * b + "�Դϴ�");

			}//if1
			
			System.out.println("�����Ͻðڽ��ϱ�? 0�� ������ ���� ");
			int q = s.nextInt();
			if (q == 0) {
				break;
			}

		}// for'
		System.out.println("����");
	}
*/
//==============================================================================
	//��ǻ�Ͱ� 1~100�� ���� ���� �ϳ��� ���մϴ�.
	//�̼��ڸ� �����ּ��� 
		System.out.println("��ǻ�Ͱ� 1~100�� ���� ���� �ϳ��� ���մϴ�.");
		System.out.println("�̼��ڸ� �����ּ���.");
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		int a = r.nextInt(100)+1; //������ ���� 
		int i=1; // �������� ���� 
		System.out.println(a);
		//�ݺ��� ���� 
	while(true){
		System.out.print("1~100 ���� �Է�");
		
		int num = s.nextInt();
		
		if(num==a){
			System.out.println("����"+i+"��"); 
			break;
		}else if(num>a){
			System.out.println("DOWN");
		}else{
			System.out.println("up");
		}		
		i++;
	}//while--------------
	
	

	}// main
}// class
