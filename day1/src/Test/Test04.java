package Test;

import java.util.Arrays;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
		//5���� ���ڸ� �Է¹޾� �迭�� �ֱ�.
		//		(�������� ����)
		
		Scanner s= new Scanner(System.in);
		int a[] = new int[5];
		for(int i = 0; i < a.length; i++){
			System.out.print("���ڸ� �Է� ���ּ��� : ");
			int num = s.nextInt();
			if(num > 0){		
				a[i]=num;
			}else{
				System.out.println("�ٽ� �Է� �Ͻÿ�" );
				System.out.println();
				i--;
			}
			
		}//for
		System.out.println(Arrays.toString(a));
		
		for(int i=0; i<5; i++){
			int num = s.nextInt();
			if(num >=0){
				a[i]=num; 
			}else{
				System.out.println("����x");
				i--;
			}
		}
		
		
		
		
	}//main

}//class
