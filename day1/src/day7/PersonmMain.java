package day7;

public class PersonmMain {
//	 �żҵ� ���� (info)
//	 person �� ��ӹ޾Ƽ� ������� Ŭ�������� ��ä��
//	 �Ű�����(�Ķ����)�� �޴� �޼ҵ�
	
	static void number(int num){
		if(num == 1){
			
		}
		// num = 3
	}
	static void info (Person p){
		
		// Student ��ü�� �Ѿ���� " �л� �Դϴ� "���� ���
		if(p instanceof Studentworker){
			System.out.print("������ ");
			((Studentworker) p).worker();	// �ٿ�ĳ����
			
		}else if(p instanceof Student){
			System.out.print("�л� ");
			((Student) p).study();
		}else if(p instanceof Professor){
			System.out.print("������ ");
			((Professor) p).����();
		}else if(p instanceof Researchar){
			System.out.print("���� ");
			((Researchar) p).research();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student();		
		Professor p = new Professor();		
		Researchar r = new Researchar();		
		Studentworker st = new Studentworker();		
		Object obj = new Professor();
		
		info(s);
		System.out.println();
		info(p);
		System.out.println();
		info(r);
		System.out.println();
		info(st);

		number(3);
		
		
		
		
	}
}
