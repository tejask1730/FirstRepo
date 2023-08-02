package Relationship;

public class MobileDriver {
 public static void main(String [ ]args) {
	 Mobile m=new Mobile("APPLE","IPHONE","BLACK",165000);
	 m.setS1(new Sim1("JIO","5G",9702374062l));
	 m.setS2(new Sim2("IDEA","5G",9702374062l));
	 m.printMobileDetails();
 }
 
}
