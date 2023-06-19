package day4_1;

import java.util.Scanner;

public class Km2Mile {
	double a;
	public Km2Mile(double a){
		this.a = a; 
	}
	
	void run(){
		Scanner s =new Scanner(System.in);		
		System.out.print("Km을 mile로 바꿉니다.\nKm을 입력하세요>> ");
		int b = s.nextInt();
		System.out.println("변환결과 : "+b/a+"mile 입니다 ");
	}
	
//	Km을 mile로 바꿉니다.
//	Km을 입력하세요>> 30
//	변환 결과: 18.75mile입니다

}
