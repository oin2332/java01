package day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ListTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		ArrayList<HashMap<String, Object>> list = 
				new ArrayList<HashMap<String, Object>>(
				3);
		for (int i = 0; i < 3; i++) {
			
			HashMap<String, Object> a1 = new HashMap<String, Object>();

			System.out.print("�̸��� �Է��Ͻÿ� : ");
			a1.put("name", s.next());
			System.out.print("������ �Է��Ͻÿ� : ");
			a1.put("age", s.nextInt());
			System.out.print("������ �Է��Ͻÿ� : ");
			a1.put("gender", s.next());
			System.out.print("�ּ��� �Է��Ͻÿ� : ");
			a1.put("addr", s.next());
					list.add(a1);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.print("�̸� : "+list.get(i).get("name"));
			System.out.print(", ���� : "+list.get(i).get("age"));
			System.out.print(", ���� : "+list.get(i).get("gender"));
			System.out.print(", �ּ� : "+list.get(i).get("addr"));
			System.out.println();
			
		}
		s.close();
		
		
	}
}
