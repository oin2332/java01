package day8;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;

public class HumanMain {
	public static void main(String[] args) {
		
		HashMap<String, Human> map = new HashMap<String, Human>();
		Scanner s = new Scanner(System.in);
		
		Human hong = new Human("ȫ�浿", 30, "����");
		map.put("ȫ�浿", hong);
		// �̸� ���缮 , ���� 40 �ּ� ��õ
		map.put("���缮", new Human("���缮", 40, "��õ"));
		
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		

		
	
	}

}
