package day7;

import java.util.*;

public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> javaScore = new HashMap<String, Integer>();
		Scanner s = new Scanner(System.in);

		javaScore.put("김성동", 97);
		javaScore.put("황기태", 88);
		javaScore.put("김남윤", 98);
		javaScore.put("이재문", 70);
		javaScore.put("한원선", 99);
		while (true) {
			System.out.print("이름을 입력하시오 : ");
			String name = s.next();
			if (javaScore.containsKey(name)) {
				System.out.println(javaScore.get(name));
			} else {
				System.out.println("그런 사람 없음");
				break;
			}
		}
	}

}
