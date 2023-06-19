package day8;

import java.util.*;

public class Test02 {
	public static void main(String[] args) {
		// 스캐너로 홍길동, 30, 서울을 입력받아서
		Scanner s = new Scanner(System.in);
		HashMap<String, Person> map = new HashMap<>();
		// 무한루프로 바꾸는데
		// (1) 입력, (2) 그만
		// 1 입력하면 객체 생성 후 map에 저장
		// 다른 값 입력하면 break;
		while (true) {
			System.out.println("(1) 입력,2) 출력  (2) 그만");
			int num = s.nextInt();
			if (num == 1) {
				System.out.print("이름 입력 : ");
				String name = s.next();
				System.out.print("나이 입력 : ");
				int age = s.nextInt();
				System.out.print("주소 입력 : ");
				String addr = s.next();
				// 객체 만들고
				Person p = new Person(name, age, addr);
				// map 넣기
				map.put(p.getName(), p);
			} else if (num == 2) {
				// 이름 : 홍길동 , 나이 : 30 , 주소 : 서울
				Set<String> keys = map.keySet();
				Iterator<String> it = keys.iterator();

				while (it.hasNext()) {
					Person p = map.get(it.next());
					System.out.println(it.next());
					System.out.println("이름 : "+ p.getName());
					System.out.println("나이 : "+ p.getAge());
					System.out.println("주소 : "+ p.getAddr());
				}
			} else {
			}
			break;
		}
	}
}
