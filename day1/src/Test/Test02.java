package Test;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// 0이 입력되기 전까지 입력된 숫자들 더하기(음수 입력시 다시 입력하도록)
		// 3 5 2 1 0 => 11
		
		int b = 0 ;
		System.out.println();
		while (true) {		
			System.out.print("숫자를 입력 해주세요 : ");
			int num = s.nextInt();
				if (num > 0) {
					b+=num;		
				} else if(num < 0){
					System.out.println("다시 입력해주세요");
				} else {
					System.out.println(b);	
			    	break;
				}				
		}// while
	}// main

}
