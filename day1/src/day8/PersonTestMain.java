package day8;

import java.util.*;

public class PersonTestMain {
	public static void main(String[] args) {

		// // p ��ü�� name ȫ�浿���� �ֱ�
		// hong.setName("ȫ�浿");
		// hong.setAddr("����");
		// hong.setAge(30);
		//
		// Person yu =new Person("���缮",40,"��õ");
		// ��ĳ�ʷ� ȫ�浿 30 ���� �Է¹޾�
		// ��ü �����
		// map �ֱ�
Scanner s = new Scanner(System.in);
		Person hong = new Person();
		HashMap<String, Person> map = new HashMap<>();

		for (;;) {
			System.out.println( "(1) �Է�, (2) �׸�");
			int num = s.nextInt();
			if(num == 1){
			
			System.out.print("�̸� : ");
			
			String name = s.next();
			System.out.print("���� : ");
			
			int age = s.nextInt();
			System.out.print("���� : ");
			
			String addr = s.next();
			Person p = new Person(name, age, addr);
			map.put(p.getName(), p);
			}else {
				System.out.println("����");
			 break;
			}
		}
		
		
		
		

	}
}
