package day9;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		StringTokenizer st = new StringTokenizer(str);
		System.out.println("어절 개수는"+ st.countTokens());

	}

}
