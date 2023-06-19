package day7;

import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector<Integer> v =new Vector<Integer>();
		//integer(정수값) 제네릭 백터 생성
		
		// 정수 삽입
		v.add(5);
		v.add(4);
		v.add(3);
		
		//백터 중간 삽입
		v.add(2, 10);
		
		System.out.println("사이즈 "+v.size()); //배열 객체 수
		System.out.println("용량 "+v.capacity()); // 배열 용량 
		System.out.println();
		
		for(int i=0; i<v.size(); i++){
			System.out.println(v.get(i));
		}
		
		int sum = 0;
		for(int i=0; i<v.size(); i++) {
		
		sum += v.elementAt(i);
		}
		System.out.println("벡터에 있는 정수 합 : "
		+ sum);
		
		
	}
}
