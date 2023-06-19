package day4;

public class ColorPoint extends Point {

	private String color;

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}