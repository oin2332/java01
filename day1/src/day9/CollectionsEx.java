package day9;

import java.util.*;

public class CollectionsEx {
	// 3->5->6->8->10
	// ���� 5�� �Կ�
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
			System.out.print(i + 1 + "��  ��ȣ�� �Է��ϼ��� : ");
			list.add(s.nextInt());
		}
		System.out.println("������");
		printList(list);
		Collections.sort(list);
		System.out.println("������");
		printList(list);
		Collections.reverse(list);
		System.out.println("��������:");
		printList(list);
		
//		��ĳ�� 3�� �Է��ϸ�
//		3�� ��ġ ã��
		int a= s.nextInt();
		int index = Collections.binarySearch(list, a)+1;
		System.out.println(index);
		
	}

}
