package day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ts01 {

	// -> 다음과 같이 map에 스캐너로 입력된 값 저장
	// -> key : name, value : 이름 (ex, 홍길동)
	// -> key : age, value : 나이 (ex, 30)
	// -> key : addr, value : 주소 (ex, 서울)
	ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
	Scanner s = new Scanner(System.in);
	void input() {		
		for (int i = 0; i < 1; i++) {

			HashMap<String, Object> a1 = new HashMap<String, Object>();
			System.out.print("이름을 입력하시오 : ");
			a1.put("name", s.next());
			System.out.print("나이을 입력하시오 : ");
			a1.put("age", s.nextInt());
			System.out.print("주소을 입력하시오 : ");
			a1.put("addr", s.next());
			list.add(a1);
		}
	}//input_end

	void output() {		
		for(int i=0; i< list.size(); i++){			
			System.out.print("이름 : "+list.get(i).get("name"));
			System.out.print(", 나이 : "+list.get(i).get("age"));
			System.out.print(", 주소 : "+list.get(i).get("addr"));		
			System.out.println();
		}
	}//output_END
	
	void remove(){
		
		for(int i=0; i<list.size(); i++){
			HashMap<String, Object> map = list.get(i);
			System.out.print("삭제할 사용자 이름 입력 : ");
			if(map.get("name").equals(s.next())){
				list.remove(i);
			}
		}		
	}

}
