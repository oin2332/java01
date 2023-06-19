package day6;

public class Rect {
	private int width;
	private int height;

	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public boolean equ(Object obj) {
		Rect p = (Rect) obj;
		if (width * height == p.width * p.height) {
			return true;
		} else {
			return false;
		}
	}

}
