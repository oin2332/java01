package day9;

import java.util.HashMap;

public class MethodTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodTest method = new MethodTest("ȫ�浿", 100, 90, 80);
		
		//result �޼ҵ� ȣ�� ( method , result();)
		//name , list , arr 3���� ����
		
			HashMap<String, Object> map = method.result();
			System.out.println(map.get("name"));
			System.out.println(map.get("list"));
			System.out.println(map.get("array"));
		
		
		
		

	}

}
