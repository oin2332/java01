package Test;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// 0�� �ԷµǱ� ������ �Էµ� ���ڵ� ���ϱ�(���� �Է½� �ٽ� �Է��ϵ���)
		// 3 5 2 1 0 => 11
		
		int b = 0 ;
		System.out.println();
		while (true) {		
			System.out.print("���ڸ� �Է� ���ּ��� : ");
			int num = s.nextInt();
				if (num > 0) {
					b+=num;		
				} else if(num < 0){
					System.out.println("�ٽ� �Է����ּ���");
				} else {
					System.out.println(b);	
			    	break;
				}				
		}// while
	}// main

}
