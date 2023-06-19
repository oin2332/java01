package day1;

import java.util.Random;
import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		/*
		 * String name = "홍길동"; // 이름 int age = 30; // 나이 double height = 170.5;
		 * double weight = 60.3; boolean flg = true;// true or false if (height
		 * > 180) { System.out.println("키가 180이상 입니다."); } else {
		 * System.out.println("키가 180이하 입니다"); }// if if (flg) {
		 * System.out.println("실행"); } flg = false; if (flg) {
		 * System.out.println("실행"); }
		 * 
		 * if (height > 180) { System.out.println("키가 180이하 입니다"); }else if
		 * (height > 170) { System.out.println("키가 170이하 입니다"); }else if (height
		 * > 160) { System.out.println("키가 160이하 입니다"); }
		 * 
		 * if (height >=180 & weight >= 60){ System.out.println("출력"); }
		 */

		// 1 입력후 20까지 찍을수있게
		// 입력받은 숫자는 age 변수에 저장되기 때문에 입력받은 숫자만큼 커지기 위해서

		// i= 1 i(1)이 입력받은 age(변수)만큼 조건식을 입력하면된다
		// for (int i = 1; i <= 9; i++) {
		// for (int k = 9; k >= 2; k--) {
		// System.out.print(i + "x" + k + "=" + k * i + " ");
		// }
		// System.out.println();
		// }
		// int a = 0;
		// while (true) {
		// System.out.println(a++);
		// if (a == 100) {
		// break;
		// }
		// }// /while
/*
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		System.out.print("문제 수를 입력해주시요 ");
		int num = s.nextInt();
	while(true){
		for (int i = 1; i <= num; i++) {
			int a = r.nextInt(8) + 2;// 2~9
			System.out.println(i + "문제");
			int b = r.nextInt(9) + 1;
			System.out.print(a + "*" + b + " = ");
			int age = s.nextInt();
			if (a * b == age) {
				System.out.println("정답");
			} else {
				System.out.println("오답. 정답은 " + a * b + "입니다");

			}//if1
			
			System.out.println("개속하시겠습니까? 0을 누르면 종료 ");
			int q = s.nextInt();
			if (q == 0) {
				break;
			}

		}// for'
		System.out.println("종료");
	}
*/
//==============================================================================
	//컴퓨터가 1~100중 랜덤 숫자 하나를 정합니다.
	//이숫자를 맞춰주세요 
		System.out.println("컴퓨터가 1~100중 랜덤 숫자 하나를 정합니다.");
		System.out.println("이숫자를 마춰주세요.");
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		int a = r.nextInt(100)+1; //랜덤문 생성 
		int i=1; // 지역변수 선언 
		System.out.println(a);
		//반복문 시작 
	while(true){
		System.out.print("1~100 숫자 입력");
		
		int num = s.nextInt();
		
		if(num==a){
			System.out.println("정답"+i+"번"); 
			break;
		}else if(num>a){
			System.out.println("DOWN");
		}else{
			System.out.println("up");
		}		
		i++;
	}//while--------------
	
	

	}// main
}// class
