package day7;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {

		// ArrayList Integer �����ϴ� ��ü ����
		// Scanner�� ���� 5�� �Է¹޾Ƽ� ArrayList ��ü�� ����

		// ���� ���� ���ڿ� ���� ū ������ ��ġ �ٲٱ�

		// ex, 5, 3 , 7, 6, 9

		ArrayList<Integer> arr = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("��ȣ�� �Է��ϼ��� : ");
			arr.add(s.nextInt());
		}
		int minindex = arr.get(0);
		int maxindex = arr.get(0);
		for (int i = 1; i < arr.size(); i++) {
			if (arr.get(minindex) < arr.get(i)) {
				minindex = i;
			}
			if (arr.get(maxindex) > arr.get(i)) {
				maxindex = i;
			}
		}
		int temp = arr.get(minindex);
		arr.add(maxindex, arr.get(minindex));
		arr.remove(maxindex + 1);
		arr.add(minindex, temp);
		arr.remove(minindex + 1);
		System.out.println(arr);

	}

}
