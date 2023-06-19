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

			System.out.print("이름을 입력하시오 : ");
			a1.put("name", s.next());
			System.out.print("나이을 입력하시오 : ");
			a1.put("age", s.nextInt());
			System.out.print("성별을 입력하시오 : ");
			a1.put("gender", s.next());
			System.out.print("주소을 입력하시오 : ");
			a1.put("addr", s.next());
					list.add(a1);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.print("이름 : "+list.get(i).get("name"));
			System.out.print(", 나이 : "+list.get(i).get("age"));
			System.out.print(", 성별 : "+list.get(i).get("gender"));
			System.out.print(", 주소 : "+list.get(i).get("addr"));
			System.out.println();
			
		}
		s.close();
		
		
	}
}
