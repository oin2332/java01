package day7;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		//���� ���� ���� ã�Ƽ� ���
		// �ߺ������� �ߺ� ���� ���
				
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner s= new Scanner(System.in);
		
		
		for(int i=0; i<5; i++){
			System.out.print("���� �Է� : ");
			list.add(s.nextInt());
		}
		int min = list.get(0);
		for(int i=1; i<list.size(); i++){
			if(min > list.get(i)){
				min = list.get(i);
			}
		}
		int cut = 0;
		for(int i=0; i<list.size(); i++){
			if(min == list.get(i)){
				cut++;
			}
		}
		
	}

}
