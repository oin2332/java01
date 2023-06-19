package day6;

import java.util.Scanner;

public class Jumin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	String Jumin = "800000-1234567";
		
		Scanner s = new Scanner(System.in);
		
		String Jumin = s.nextLine();
		
		if(Jumin.length()!= 14){
			System.out.println("재시도 14글자 이상  ");
			return ;
		}
		if(Jumin.subSequence(7, 8).equals("1") || Jumin.subSequence(7, 8).equals("3") ){
			System.out.println("남자");
		}else{
			System.out.println("여자");
		}
	

	}

}
