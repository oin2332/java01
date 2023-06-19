package day6;

public class Goodcalc extends Calculator{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double average(int[] a) {
		// TODO Auto-generated method stub
		int sum = 0;
		 for(int i=0; i<a.length; i++){
			 sum += a[i];
		 }
		 for(int num : a ){
			 sum +=num;
		 }
		return (double)sum/a.length;
	}
	

}
