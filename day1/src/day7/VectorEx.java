package day7;

import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector<Integer> v =new Vector<Integer>();
		//integer(������) ���׸� ���� ����
		
		// ���� ����
		v.add(5);
		v.add(4);
		v.add(3);
		
		//���� �߰� ����
		v.add(2, 10);
		
		System.out.println("������ "+v.size()); //�迭 ��ü ��
		System.out.println("�뷮 "+v.capacity()); // �迭 �뷮 
		System.out.println();
		
		for(int i=0; i<v.size(); i++){
			System.out.println(v.get(i));
		}
		
		int sum = 0;
		for(int i=0; i<v.size(); i++) {
		
		sum += v.elementAt(i);
		}
		System.out.println("���Ϳ� �ִ� ���� �� : "
		+ sum);
		
		
	}
}
