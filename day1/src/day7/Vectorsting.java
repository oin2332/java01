package day7;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Vectorsting {

	public static void main(String[] args) {

		// ArrayList ���ڿ��� �����ϴ� ��ü ����
		// Scanner �� ���ڸ� 5�� �Է¹޾Ƽ� ArrayList ��ü ����

		ArrayList<String> a = new ArrayList<String>();

		Scanner s = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "�� ���� �Է� : ");
			a.add(s.next());

		}
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
			
		}
		System.out.println();
		// ����� ���ڿ� ���
		
		String str = "";
		for (int i = 0; i < a.size(); i++) {
		 if (str.length() < a.get(i).length()) {			 
				str = a.get(i);
			}
		}
		
		for (int i = 0; i < a.size(); i++) {
			 if (str.length() == a.get(i).length()) {			 
					System.out.println(a.get(i));
			 }
			 
			}

		

	}
}
