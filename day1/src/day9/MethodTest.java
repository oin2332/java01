package day9;

import java.util.*;

public class MethodTest {
	String name;
	ArrayList<Integer> list;
	int arr[];

	MethodTest(String name, int java, int oracle, int html) {
		list = new ArrayList<Integer>();
		this.name = name;
		list.add(java);
		list.add(oracle);
		list.add(html);
		arr = new int[3];
		arr[0]=java;
		arr[1]=oracle;
		arr[2]=html;
		
	}
	
	HashMap<String, Object> result (){
		HashMap<String, Object> obj = new HashMap<String, Object>();
		obj.put("name", name);
		obj.put("list", list);
		obj.put("array", arr);
		
		return obj;
	}

}
