package day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Hmap {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("name", "ȫ�浿");
		map.put("age", 30);
		map.put("addr", "����");
		map.put("phone", "010-1234-4567");
		
		
		HashMap<String, Object> yu = new HashMap<String, Object>();
		
		yu.put("name", "���缮");
		yu.put("age", 40);
		yu.put("addr", "��õ");
		yu.put("phone", "010-6778-4567");
//		
//		
//		while (true) {
//			System.out.print("������ �Է��Ͻÿ� : ");
//			String name = s.next();
//			if (map.containsKey(name)) {
//				System.out.println(map.get(name));
//			} else {
//				System.out.println("�׷� ��� ����");
//				
//			}
//		}
		
		ArrayList<HashMap<String, Object>> list =
				new ArrayList<HashMap<String,Object>>();
			
		list.add(map);
		list.add(yu);
		
		System.out.println(list.get(1).get("name"));
		
		
		
	}

}
