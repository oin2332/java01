package day6;

public class SamsungPhone implements PhoneInterface {

	@Override
	public void sendcall() { //전화걸기
		// TODO Auto-generated method stub
		System.out.println("띠리리링");
	}

	@Override
	public void receivecall() {//전화 받기 
		// TODO Auto-generated method stub
		System.out.println("전화가 왔습니다");
	}

	@Override
	public void printLogo() {
		// TODO Auto-generated method stub

	}

}
