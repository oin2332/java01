package javaTest;

import java.util.*;

//[����5]  * ���� 1�� �Է��� ��� '�Է� �κ�', 2�� �Է��� ��� '���� �κ�', 3�� �Է��� ��� '��� �κ�'
//�� ���� ���� �Է��� ��� '���� �κ�'�� ���� �Ѵ�.
//
//1. �Է� �κ�
//-> key�� String, value�� Object�� �޴� HashMap ����
//-> ������ ���� map�� ��ĳ�ʷ� �Էµ� �� ����
//-> key : name, value : �̸� (ex, ȫ�浿)
//-> key : java, value : �ڹ� ���� (ex, 20), �� 0~30 ���� ���� �ƴϸ� �ٽ� �Է�
//-> key : oracle, value : ����Ŭ ���� (ex, 35), �� 0~50 ���� ���� �ƴϸ� �ٽ� �Է�
//-> key : html, value : html ����(ex, 15), �� 0~20 ���� ���� �ƴϸ� �ٽ� �Է�
//
//=> �ش� map�� ArrayList ��ü�� ����
//
//2. ���� �κ�
//��ĳ�ʷ� �Է��� ���� map�� name value ���� ������ ��� ����Ʈ���� ����
//
//-> ex, ��ĳ�ʷ� "ȫ�浿"�� �Է��ϸ� name�� value�� "ȫ�浿"�� map�� ����Ʈ���� ����
//
//3. ��� �κ�
//-> �ֿܼ� '�̸� : ȫ�浿, ���� : 70' �� ���� ���·� ���
//-> ������ java + oracle + html value�� �� ��
//
//4. ���� �κ�
//-> ���α׷� ����

public class Test5 {
	static int score(Scanner s, String kind) {
		System.out.print(kind + " ������ �Է����ּ���: ");
		int num;
		while (true) {
			num = s.nextInt();
			if (num > 20 || num < 0) {
				System.out.println("0~20 ���� �� �Է�");
			} else if (num > 30 || num < 0) {
				System.out.println("0~30 ���� �� �Է�");
			} else if (num > 50 || num < 0) {
				System.out.println("0~50 ���� �� �Է�");
			} else {
				break;
			}
		}
		return num;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
		while (true) {
			System.out.println("(1)�Է�,  (2)����,  (3)���   (�׿�)���� ");
			System.out.print("��ȣ �Է� :");
			int num = s.nextInt();

			if (num == 1) {//�Է�
				HashMap<String, Object> map = new HashMap<>();
				System.out.println("�̸� : ");
				map.put("name", s.next());

				map.put("java", score(s, "�ڹ�"));

				map.put("oracle", score(s, "����Ŭ"));
				
				map.put("html", score(s, "hteml"));

			} else if (num == 2) {//����
				System.out.println("������ �̸� �Է� ");
				String name = s.next();
				for(int i=0; i<list.size(); i++){
					HashMap<String, Object> map = list.get(i);
					if(map.get("name").equals(name)){
						list.remove(i);
					}
				}

			} else if (num == 3) {//���
				for(int i=0; i<list.size(); i++){
					HashMap<String, Object> map = list.get(i);
					
					System.out.println("�̸� : "+map.get("name"));
					System.out.println("���� : "+map.get("java")+map.get("oracle")+map.get("name"));
					
					
				}

			} else {//����
				System.out.println("����Ǿ����ϴ�");
				break;
			}

		}

	}
}
