package day8;

public class Person {
	private String name;
	private int age;
	private String addr;

	Person(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
		
	}
	Person(){
		
	}
	

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddr() {
		return addr;
	}



}
