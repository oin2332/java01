package day7;

import java.util.*;

public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> javaScore = new HashMap<String, Integer>();
		Scanner s = new Scanner(System.in);

		javaScore.put("�輺��", 97);
		javaScore.put("Ȳ����", 88);
		javaScore.put("�賲��", 98);
		javaScore.put("���繮", 70);
		javaScore.put("�ѿ���", 99);
		while (true) {
			System.out.print("�̸��� �Է��Ͻÿ� : ");
			String name = s.next();
			if (javaScore.containsKey(name)) {
				System.out.println(javaScore.get(name));
			} else {
				System.out.println("�׷� ��� ����");
				break;
			}
		}
	}

}
