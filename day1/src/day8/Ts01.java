package day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ts01 {

	// -> ������ ���� map�� ��ĳ�ʷ� �Էµ� �� ����
	// -> key : name, value : �̸� (ex, ȫ�浿)
	// -> key : age, value : ���� (ex, 30)
	// -> key : addr, value : �ּ� (ex, ����)
	ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
	Scanner s = new Scanner(System.in);
	void input() {		
		for (int i = 0; i < 1; i++) {

			HashMap<String, Object> a1 = new HashMap<String, Object>();
			System.out.print("�̸��� �Է��Ͻÿ� : ");
			a1.put("name", s.next());
			System.out.print("������ �Է��Ͻÿ� : ");
			a1.put("age", s.nextInt());
			System.out.print("�ּ��� �Է��Ͻÿ� : ");
			a1.put("addr", s.next());
			list.add(a1);
		}
	}//input_end

	void output() {		
		for(int i=0; i< list.size(); i++){			
			System.out.print("�̸� : "+list.get(i).get("name"));
			System.out.print(", ���� : "+list.get(i).get("age"));
			System.out.print(", �ּ� : "+list.get(i).get("addr"));		
			System.out.println();
		}
	}//output_END
	
	void remove(){
		
		for(int i=0; i<list.size(); i++){
			HashMap<String, Object> map = list.get(i);
			System.out.print("������ ����� �̸� �Է� : ");
			if(map.get("name").equals(s.next())){
				list.remove(i);
			}
		}		
	}

}
