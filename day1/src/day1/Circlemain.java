package day1;

public class Circlemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle pizza = new Circle(); // Circle 객체 생성
		pizza.radius = 10; // 피자의 반지름을 10으로 설정
		pizza.name = "자바피자"; // 피자의 이름 설정
		System.out.println(pizza.name);
		double area = pizza.getArea(); // 피자의 면적 알아내기
		System.out.println(pizza.name + "의 면적은! " + area);
		System.out.println(pizza.getArea());
		
		
		Circle donut = new Circle(); // Circle 객체 생성
		donut.radius = 2; // 도넛의 반지름을 2로 설정
		donut.name = "자바도넛"; // 도넛의 이름 설정
		area = donut.getArea(); // 도넛의 면적 알아내기
		System.out.println(donut.name + "의 면적은 " + area);
	}

}
