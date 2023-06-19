package day6;

import java.util.Scanner;

public class AutoBoxingUnBoxingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n =10;
//		Integer intObject = n ;
//		System.out.println("Interger : "+ intObject);
//		
//		int m = intObject+10;
//		System.out.println(m);
//		
//		String s2 = "  Java Programming  ";
//		System.out.println(s2.toLowerCase());
//		System.out.println(s2.toUpperCase());
//		System.out.println(s2.trim());

		
		
//		String java= "Java";
//		String cpp = "C++";
//		int res = java.compareTo(cpp);
//		if(res == 0)
//		System.out.println("the same");
//		else if(res <0)
//		System.out.println(java + " < " + cpp);
//		else
//		System.out.println(java + " > " + cpp);
		
	//스캐너로 두개의 문자열 입력 받기
	//소문자는 대문자로 바꿔서 비교
		Scanner s =new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String a = s.nextLine().toLowerCase();
		System.out.print("문자열 입력 : ");
		String b = s.nextLine().toLowerCase();
//		a = a.toLowerCase();
//		b = b.toLowerCase();
		int res = a.compareTo(b);
		if(res == 0){
			System.out.println("the same");
		}else if ( res <0){
			System.out.println("d");
		}else{
			System.out.println("a");
		}
		System.out.println(a);
		System.out.println(b);

		
	}

}
