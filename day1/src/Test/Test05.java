package Test;

import java.util.Arrays;

public class Test05 {
	public static void main(String[] args) {

		// 이전 실습에서 진행한 선택정렬 완성하기
		// 30,20,60,0,25,20,60,0,10,30,

		int a[] = { 30, 20, 60, 0, 25, 20, 60, 0, 10, 30 };
		for (int i=0; i<a.length; i++) {
			int index = i; //0
			for (int j = i+1; j < a.length; j++) {
				if (a[index] > a[j]) {
					index = j;	//3							
				}
			}
			int temp = a[index]; //3
			
			a[index] = a[i];
//				3		0  -> index(0) 
			a[i] = temp;
//			 0     3   -> i
			
		}
		System.out.println(Arrays.toString(a));
		
		

	}// main
}
