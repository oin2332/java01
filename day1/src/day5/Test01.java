package day5;

import java.io.ObjectInputStream.GetField;

public class Test01 {
//		static void pack(Fruit f) {
//				int a = 0;
//			if (f instanceof Banana) {
//				Banana obj =(Banana)f;//�ٿ�ĳ����
//				a = obj.getPrice(); // �ٿ�ĳ��ƽ
//			}else if(f instanceof Orange){
//				a =((Orange) f).getPrice();
//			}else if(f instanceof Apple){
//				a =((Apple) f).getPrice();
//			}
//			System.out.println(a+"��¥�� "+f.getName() + "�� ��ҽ��ϴ�.");
//			// 1000��¥�� �ٳ����� ��ҽ��ϴ�
//	
//		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banana banana = new Banana("�ٳ���", "�����", 1000);
		Apple apple = new Apple("���", "��Ȳ��", 1500);
		Orange orange = new Orange("������", "��Ȳ��", 2000);

//		pack(banana);
//		pack(apple);
//		pack(orange);
		
		banana.view();
		apple.view();
		orange.view();
		
		System.out.println("\"ȫ�浿\"");

	}

}
