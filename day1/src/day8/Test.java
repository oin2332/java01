package day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		// (1)�Է� (2) ����, (3) ��� (4) ���� 		
		Scanner s= new Scanner(System.in);	
		Ts01 in = new Ts01();
		
		while (true) {			
			System.out.print("(1)�Է�: , (2)����: , (3)���: , (4)����: ");
			
			int num = s.nextInt();
			
			if(num ==1 ){
				System.out.println("�Է� �κ�");
				in.input();
			}else if(num ==2){
				System.out.println("���� �κ�");
				in.remove();
			}else if(num ==3){
				System.out.println("��� �κ�");
				in.output();
			}else{
				System.out.println("���� �κ�");
				break;
			}
			
			
		   
			
			
		}
		
		
		
		
		
	}

}
