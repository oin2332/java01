package day8;

import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class PersonMain {
	Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		HashMap<String, Person> map = new HashMap<String, Person>();

		while (true) {// 입력
			Scanner s = new Scanner(System.in);
			System.out.println("1 입력, 2 출력, 3 삭제, 4 종료");
			int num = s.nextInt();
			if (num == 1) {// 입력
				System.out.print("이름 입력 :");
				String name = s.next();
				System.out.print("나이 입력 :");
				int age = s.nextInt();
				System.out.print("주소 입력 :");
				String addr = s.next();
				map.put(name, new Person(name, age, addr));
			} else if (num == 2) {// 삭제
				System.out.print("삭제할 사용자 이름 입력 : ");
				String name = s.next();
				if (map.containsKey(name)) {
					map.remove(name);

				} else if (num == 3) {// 출력
					Set<String> keys = map.keySet();
					Iterator<String> it = keys.iterator();

					while (it.hasNext()) {
						Person p = map.get(it.next());
						System.out.print("이름 : " + p.getName());
						System.out.print(", 나이 : " + p.getAge());
						System.out.print(", 주소 : " + p.getAddr());
						System.out.println();
					}

				} else if (num == 4) {// 종료

				}

			}

		}
	}
}
