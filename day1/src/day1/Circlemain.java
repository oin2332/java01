package day1;

public class Circlemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle pizza = new Circle(); // Circle ��ü ����
		pizza.radius = 10; // ������ �������� 10���� ����
		pizza.name = "�ڹ�����"; // ������ �̸� ����
		System.out.println(pizza.name);
		double area = pizza.getArea(); // ������ ���� �˾Ƴ���
		System.out.println(pizza.name + "�� ������! " + area);
		System.out.println(pizza.getArea());
		
		
		Circle donut = new Circle(); // Circle ��ü ����
		donut.radius = 2; // ������ �������� 2�� ����
		donut.name = "�ڹٵ���"; // ������ �̸� ����
		area = donut.getArea(); // ������ ���� �˾Ƴ���
		System.out.println(donut.name + "�� ������ " + area);
	}

}
