package day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Hmap {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("name", "홍길동");
		map.put("age", 30);
		map.put("addr", "서울");
		map.put("phone", "010-1234-4567");
		
		
		HashMap<String, Object> yu = new HashMap<String, Object>();
		
		yu.put("name", "유재석");
		yu.put("age", 40);
		yu.put("addr", "인천");
		yu.put("phone", "010-6778-4567");
//		
//		
//		while (true) {
//			System.out.print("정보를 입력하시오 : ");
//			String name = s.next();
//			if (map.containsKey(name)) {
//				System.out.println(map.get(name));
//			} else {
//				System.out.println("그런 사람 없음");
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
