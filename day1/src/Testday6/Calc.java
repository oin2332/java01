package Testday6;

public class Calc implements Calcinter{

	@Override
	public int Arr(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int Sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int Mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int Div(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

}

