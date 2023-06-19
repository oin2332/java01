package day5;

public class Apple extends Fruit{
	private int price;
	
	Apple(String name, String color, int price){
		super(name,color);
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void getPrice(int price) {
		this.price = price;
	}
	
	void view(){
		super.view();
		System.out.print(", АЁАн : "+price+"\n");
	}
	

}
