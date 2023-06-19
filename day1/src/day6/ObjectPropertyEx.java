package day6;

public class ObjectPropertyEx {
	public static void main(String[] args) {
		Point p =new Point(2,3);
		System.out.println(p.getClass().getName()); // 클래스 이름
		System.out.println(p.hashCode()); // 해시 코드 값
		System.out.println(p.toString()); // 객체를 문자열로 만들어 출력
		System.out.println(p); // 객체 출력
        
        Point p1 = new Point(2,3);
        Point p2 = new Point(2,3);
        System.out.println();
        
        
	}   
        
}       
        