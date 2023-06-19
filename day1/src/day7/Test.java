package day7;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		//가장 작은 숫자 찾아서 출력
		// 중복있으면 중복 개수 출력
				
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner s= new Scanner(System.in);
		
		
		for(int i=0; i<5; i++){
			System.out.print("숫자 입력 : ");
			list.add(s.nextInt());
		}
		int min = list.get(0);
		for(int i=1; i<list.size(); i++){
			if(min > list.get(i)){
				min = list.get(i);
			}
		}
		int cut = 0;
		for(int i=0; i<list.size(); i++){
			if(min == list.get(i)){
				cut++;
			}
		}
		
	}

}
