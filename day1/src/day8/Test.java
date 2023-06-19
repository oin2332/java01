package day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		// (1)입력 (2) 삭제, (3) 출력 (4) 종료 		
		Scanner s= new Scanner(System.in);	
		Ts01 in = new Ts01();
		
		while (true) {			
			System.out.print("(1)입력: , (2)삭제: , (3)출력: , (4)종료: ");
			
			int num = s.nextInt();
			
			if(num ==1 ){
				System.out.println("입렵 부분");
				in.input();
			}else if(num ==2){
				System.out.println("삭제 부분");
				in.remove();
			}else if(num ==3){
				System.out.println("출력 부분");
				in.output();
			}else{
				System.out.println("종료 부분");
				break;
			}
			
			
		   
			
			
		}
		
		
		
		
		
	}

}
