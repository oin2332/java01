package day7;

public class PersonmMain {
//	 매소드 생성 (info)
//	 person 을 상속받아서 만들어진 클래스들의 객채를
//	 매개변수(파라미터)로 받는 메소드
	
	static void number(int num){
		if(num == 1){
			
		}
		// num = 3
	}
	static void info (Person p){
		
		// Student 객체가 넘어오면 " 학생 입니다 "문구 출력
		if(p instanceof Studentworker){
			System.out.print("직장인 ");
			((Studentworker) p).worker();	// 다운캐스팅
			
		}else if(p instanceof Student){
			System.out.print("학생 ");
			((Student) p).study();
		}else if(p instanceof Professor){
			System.out.print("연구원 ");
			((Professor) p).연구();
		}else if(p instanceof Researchar){
			System.out.print("교수 ");
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
