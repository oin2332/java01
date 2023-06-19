package day5;

import java.io.ObjectInputStream.GetField;

public class Test01 {
//		static void pack(Fruit f) {
//				int a = 0;
//			if (f instanceof Banana) {
//				Banana obj =(Banana)f;//다운캐스팅
//				a = obj.getPrice(); // 다운캐스틱
//			}else if(f instanceof Orange){
//				a =((Orange) f).getPrice();
//			}else if(f instanceof Apple){
//				a =((Apple) f).getPrice();
//			}
//			System.out.println(a+"원짜리 "+f.getName() + "를 담았습니다.");
//			// 1000원짜리 바나나를 담았습니다
//	
//		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banana banana = new Banana("바나나", "노란색", 1000);
		Apple apple = new Apple("사과", "주황색", 1500);
		Orange orange = new Orange("오렌지", "주황색", 2000);

//		pack(banana);
//		pack(apple);
//		pack(orange);
		
		banana.view();
		apple.view();
		orange.view();
		
		System.out.println("\"홍길동\"");

	}

}
