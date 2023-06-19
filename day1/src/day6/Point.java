package day6;

public class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "Point(" + x + "," + y + ")";
	}

	public boolean equals(Object p) {
		Point obj = (Point)p;
		boolean flg = true;
		if ((x + y) == (obj.x + obj.y)) {
			return true;
		}else{
			return false;
		}
		
	}

	public static void main(String[] args) {

	}

}
