package javaTest;

import java.util.*;

//[문항5]  * 숫자 1을 입력할 경우 '입력 부분', 2를 입력할 경우 '삭제 부분', 3을 입력할 경우 '출력 부분'
//그 외의 값을 입력할 경우 '종료 부분'을 실행 한다.
//
//1. 입력 부분
//-> key를 String, value를 Object로 받는 HashMap 생성
//-> 다음과 같이 map에 스캐너로 입력된 값 저장
//-> key : name, value : 이름 (ex, 홍길동)
//-> key : java, value : 자바 점수 (ex, 20), 단 0~30 사이 값이 아니면 다시 입력
//-> key : oracle, value : 오라클 점수 (ex, 35), 단 0~50 사이 값이 아니면 다시 입력
//-> key : html, value : html 점수(ex, 15), 단 0~20 사이 값이 아니면 다시 입력
//
//=> 해당 map을 ArrayList 객체에 저장
//
//2. 삭제 부분
//스캐너로 입력한 값과 map의 name value 값이 동일할 경우 리스트에서 삭제
//
//-> ex, 스캐너로 "홍길동"을 입력하면 name의 value가 "홍길동"인 map을 리스트에서 제거
//
//3. 출력 부분
//-> 콘솔에 '이름 : 홍길동, 총점 : 70' 과 같은 형태로 출력
//-> 총점은 java + oracle + html value의 총 합
//
//4. 종료 부분
//-> 프로그램 종료

public class Test5 {
	static int score(Scanner s, String kind) {
		System.out.print(kind + " 점수를 입력해주세요: ");
		int num;
		while (true) {
			num = s.nextInt();
			if (num > 20 || num < 0) {
				System.out.println("0~20 사이 값 입력");
			} else if (num > 30 || num < 0) {
				System.out.println("0~30 사이 값 입력");
			} else if (num > 50 || num < 0) {
				System.out.println("0~50 사이 값 입력");
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
			System.out.println("(1)입력,  (2)삭제,  (3)출력   (그외)종료 ");
			System.out.print("번호 입력 :");
			int num = s.nextInt();

			if (num == 1) {//입력
				HashMap<String, Object> map = new HashMap<>();
				System.out.println("이름 : ");
				map.put("name", s.next());

				map.put("java", score(s, "자바"));

				map.put("oracle", score(s, "오라클"));
				
				map.put("html", score(s, "hteml"));

			} else if (num == 2) {//삭제
				System.out.println("삭제할 이름 입력 ");
				String name = s.next();
				for(int i=0; i<list.size(); i++){
					HashMap<String, Object> map = list.get(i);
					if(map.get("name").equals(name)){
						list.remove(i);
					}
				}

			} else if (num == 3) {//출력
				for(int i=0; i<list.size(); i++){
					HashMap<String, Object> map = list.get(i);
					
					System.out.println("이름 : "+map.get("name"));
					System.out.println("총점 : "+map.get("java")+map.get("oracle")+map.get("name"));
					
					
				}

			} else {//종료
				System.out.println("종료되었습니다");
				break;
			}

		}

	}
}
