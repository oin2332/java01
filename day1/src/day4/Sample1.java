package day4;

public class Sample1{
	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		StaticSample.staticNum=10;

		
		StaticSample obj = new StaticSample();
		obj.nonStaticNum = 20;
		obj.staticNum = 30;
		System.out.println(StaticSample.staticNum);
		System.out.println(obj.staticNum);
		
		StaticSample obj2 = new StaticSample();
		obj2.staticNum = 100;
		obj2.nonStaticNum = 200;
		System.out.println(StaticSample.staticNum);
		System.out.println(obj.nonStaticNum);
		
		
		System.out.println(Math.PI);
		
		
	}//main

}//class

