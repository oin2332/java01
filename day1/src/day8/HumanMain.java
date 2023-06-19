package day8;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;

public class HumanMain {
	public static void main(String[] args) {
		
		HashMap<String, Human> map = new HashMap<String, Human>();
		Scanner s = new Scanner(System.in);
		
		Human hong = new Human("홍길동", 30, "서울");
		map.put("홍길동", hong);
		// 이름 유재석 , 나이 40 주소 인천
		map.put("유재석", new Human("유재석", 40, "인천"));
		
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		

		
	
	}

}
