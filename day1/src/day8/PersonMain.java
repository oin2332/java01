package day8;

import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class PersonMain {
	Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		HashMap<String, Person> map = new HashMap<String, Person>();

		while (true) {// �Է�
			Scanner s = new Scanner(System.in);
			System.out.println("1 �Է�, 2 ���, 3 ����, 4 ����");
			int num = s.nextInt();
			if (num == 1) {// �Է�
				System.out.print("�̸� �Է� :");
				String name = s.next();
				System.out.print("���� �Է� :");
				int age = s.nextInt();
				System.out.print("�ּ� �Է� :");
				String addr = s.next();
				map.put(name, new Person(name, age, addr));
			} else if (num == 2) {// ����
				System.out.print("������ ����� �̸� �Է� : ");
				String name = s.next();
				if (map.containsKey(name)) {
					map.remove(name);

				} else if (num == 3) {// ���
					Set<String> keys = map.keySet();
					Iterator<String> it = keys.iterator();

					while (it.hasNext()) {
						Person p = map.get(it.next());
						System.out.print("�̸� : " + p.getName());
						System.out.print(", ���� : " + p.getAge());
						System.out.print(", �ּ� : " + p.getAddr());
						System.out.println();
					}

				} else if (num == 4) {// ����

				}

			}

		}
	}
}
