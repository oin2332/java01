package day8;

import java.util.*;

public class Test02 {
	public static void main(String[] args) {
		// ��ĳ�ʷ� ȫ�浿, 30, ������ �Է¹޾Ƽ�
		Scanner s = new Scanner(System.in);
		HashMap<String, Person> map = new HashMap<>();
		// ���ѷ����� �ٲٴµ�
		// (1) �Է�, (2) �׸�
		// 1 �Է��ϸ� ��ü ���� �� map�� ����
		// �ٸ� �� �Է��ϸ� break;
		while (true) {
			System.out.println("(1) �Է�,2) ���  (2) �׸�");
			int num = s.nextInt();
			if (num == 1) {
				System.out.print("�̸� �Է� : ");
				String name = s.next();
				System.out.print("���� �Է� : ");
				int age = s.nextInt();
				System.out.print("�ּ� �Է� : ");
				String addr = s.next();
				// ��ü �����
				Person p = new Person(name, age, addr);
				// map �ֱ�
				map.put(p.getName(), p);
			} else if (num == 2) {
				// �̸� : ȫ�浿 , ���� : 30 , �ּ� : ����
				Set<String> keys = map.keySet();
				Iterator<String> it = keys.iterator();

				while (it.hasNext()) {
					Person p = map.get(it.next());
					System.out.println(it.next());
					System.out.println("�̸� : "+ p.getName());
					System.out.println("���� : "+ p.getAge());
					System.out.println("�ּ� : "+ p.getAddr());
				}
			} else {
			}
			break;
		}
	}
}
