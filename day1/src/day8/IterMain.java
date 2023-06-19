package day8;

import java.util.*;

public class IterMain {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		// v 객체에 숫자 5개 넣어보기
		v.add(5);
		v.add(6);
		v.add(2);
		v.add(1);
		v.add(4);
		// for (int i = 0; i < v.size(); i++) {
		// System.out.println(v.get(i));
		// }

		Iterator<Integer> it = v.iterator();
		// it.hasNext();//다음 방문할 요소가있다면 true
		while (it.hasNext()) {
			System.out.println(it.next());

		}

		// ArrayList<String>생성
		// 문자열 5개 스캐너로 입력 받아서 저장
		// Iterator 객체를 통해서 출력

		ArrayList<String> list = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		for(int i=0 ; i<5; i++){
			list.add(s.next());
		}
		Iterator<String> it2 = list.iterator();

		while (it2.hasNext()) {
			System.out.println(it2.next());
		}

	}

}
