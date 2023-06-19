package day9;

import java.util.*;

public class CollectionsEx {
	// 3->5->6->8->10
	// 숫자 5개 입역
	static void printList(ArrayList<Integer> list) {
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			int num = it.next();
			String str;
			if (it.hasNext()) {
				str = "->";
			} else {
				str = "\n";
			}
			System.out.print(num+str);
			
		}

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 5; i++) {
			System.out.print(i + 1 + "번  번호를 입력하세요 : ");
			list.add(s.nextInt());
		}
		System.out.println("실행전");
		printList(list);
		Collections.sort(list);
		System.out.println("실행후");
		printList(list);
		Collections.reverse(list);
		System.out.println("정열역순:");
		printList(list);
		
//		스캐너 3을 입력하면
//		3의 위치 찾기
		int a= s.nextInt();
		int index = Collections.binarySearch(list, a)+1;
		System.out.println(index);
		
	}

}
