package Object;

public class CarDriver {
	public static void main(String[] args) {
		Car e1 = new Car(250000,"xyz","xyz@mail.com");
		Car e2 = new Car(250000,"xyz","xyz@mail.com");
		System.out.println(e1);
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
	}

}
