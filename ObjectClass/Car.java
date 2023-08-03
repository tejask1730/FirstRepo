package Object;

import java.util.Objects;

public class Car {
	double price;
	String name;
	String color;
	public Car(double price, String n,String c) {
		this.price=price;
		this.color=c;
		this.name=n;
		}
	@Override
	public String toString() {
		return name + " this is the name of car"   +  color + "with the color" + price + " is the cost";
	}
	@Override
	public  boolean equals(Object obj) {
		Car c = (Car)obj;
		if(this.name == c.name && this.color == c.color && this.price == c.price) {
			return true;
			
		}else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return Objects.hash(price,name,color);
	}


}
