package day9;

import java.sql.Time;
import java.util.Calendar;
import java.util.Scanner;

public class Timegame {
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("1p ���� ������ ����");
		s.nextLine();
		Calendar now = Calendar.getInstance();
		int s1 = now.get(Calendar.SECOND);
		System.out.println("���� �� : " + s1);
		System.out.print("10�ʿ� ������ enter ������");
		s.nextLine();
		now = Calendar.getInstance();
		int s2 = now.get(Calendar.SECOND);
		System.out.println("������ �� : " + s2);
		int sen = (s2 > s1) ? s2-s1 : (s2+60) - s1;
		System.out.println("1p ���̴� " + sen);
		
		System.out.print("2p ���� ������ ����");
		s.nextLine();
		now = Calendar.getInstance();
		s1 = now.get(Calendar.SECOND);
		System.out.println("���� �� : " + s1);
		System.out.print("10�ʿ� ������ enter ������");
		s.nextLine();
		now = Calendar.getInstance();
		s2 = now.get(Calendar.SECOND);
		System.out.println("������ �� : " + s2);
		int sen2 = (s2 > s1) ? s2-s1 : (s2+60) - s1;
		System.out.println("2p ���̴� " + sen2);
		
		if(sen == sen2){
			System.out.println("���");
		}
		else if(sen > sen2){
			System.out.println("1p �̱�");
		}
		else{
			System.out.println("2p �̱�");
		}
		


	}

}
