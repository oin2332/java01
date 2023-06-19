package Test;

import java.util.Arrays;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
		//5개의 숫자를 입력받아 배열에 넣기.
		//		(단음수는 제외)
		
		Scanner s= new Scanner(System.in);
		int a[] = new int[5];
		for(int i = 0; i < a.length; i++){
			System.out.print("숫자를 입력 해주세요 : ");
			int num = s.nextInt();
			if(num > 0){		
				a[i]=num;
			}else{
				System.out.println("다시 입력 하시오" );
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
				System.out.println("음수x");
				i--;
			}
		}
		
		
		
		
	}//main

}//class
