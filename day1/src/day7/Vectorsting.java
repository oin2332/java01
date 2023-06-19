package day7;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Vectorsting {

	public static void main(String[] args) {

		// ArrayList 문자열을 관리하는 객체 생성
		// Scanner 로 문자를 5개 입력받아서 ArrayList 객체 저장

		ArrayList<String> a = new ArrayList<String>();

		Scanner s = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "번 문자 입력 : ");
			a.add(s.next());

		}
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
			
		}
		System.out.println();
		// 가장긴 문자열 출력
		
		String str = "";
		for (int i = 0; i < a.size(); i++) {
		 if (str.length() < a.get(i).length()) {			 
				str = a.get(i);
			}
		}
		
		for (int i = 0; i < a.size(); i++) {
			 if (str.length() == a.get(i).length()) {			 
					System.out.println(a.get(i));
			 }
			 
			}

		

	}
}
