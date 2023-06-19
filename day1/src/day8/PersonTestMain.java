package day8;

import java.util.*;

public class PersonTestMain {
	public static void main(String[] args) {

		// // p 객체에 name 홍길동으로 넣기
		// hong.setName("홍길동");
		// hong.setAddr("서울");
		// hong.setAge(30);
		//
		// Person yu =new Person("유재석",40,"인천");
		// 스캐너로 홍길동 30 서울 입력받아
		// 객체 만들고
		// map 넣기
Scanner s = new Scanner(System.in);
		Person hong = new Person();
		HashMap<String, Person> map = new HashMap<>();

		for (;;) {
			System.out.println( "(1) 입력, (2) 그만");
			int num = s.nextInt();
			if(num == 1){
			
			System.out.print("이름 : ");
			
			String name = s.next();
			System.out.print("나이 : ");
			
			int age = s.nextInt();
			System.out.print("서울 : ");
			
			String addr = s.next();
			Person p = new Person(name, age, addr);
			map.put(p.getName(), p);
			}else {
				System.out.println("종료");
			 break;
			}
		}
		
		
		
		

	}
}
