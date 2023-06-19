package day9;

import java.util.HashMap;

public class MethodTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodTest method = new MethodTest("홍길동", 100, 90, 80);
		
		//result 메소드 호출 ( method , result();)
		//name , list , arr 3개를 리턴
		
			HashMap<String, Object> map = method.result();
			System.out.println(map.get("name"));
			System.out.println(map.get("list"));
			System.out.println(map.get("array"));
		
		
		
		

	}

}
