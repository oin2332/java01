package day4;

public class Point {
	private int x;
	private int y;


	
	Point(int x, int y){
		this.x=x;
		this.y=y;
		
	}

	void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}

}
