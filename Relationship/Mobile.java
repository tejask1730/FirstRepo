package Relationship;

public class Mobile {
	private String brand;
	private String name;
	private String color;
	private double price;
	private Sim1 s1;
	private Sim2 s2;
	
	public Mobile(String b,String n,String c,double p) {
		this.brand=b;
		this.color=c;
		this.name=n;
		this.price=p;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Sim1 getS1() {
		return s1;
	}

	public void setS1(Sim1 s1) {
		this.s1 = s1;
	}

	public Sim2 getS2() {
		return s2;
	}

	public void setS2(Sim2 s2) {
		this.s2 = s2;
	}
	
	public void printMobileDetails() {
		System.out.println("=====MOBILE=====");
		System.out.println(brand);
		System.out.println(name);
		System.out.println(color);
		System.out.println(price);
		s1.printSim1();
		s2.printSim2();
		
	}
	
	
}
