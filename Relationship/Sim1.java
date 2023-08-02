package Relationship;

public class Sim1 {
	private String brand;
	private String type;
	private long cno;
	
	public Sim1(String b,String t,long c) {
		this.brand=b;
		this.type=t;
		this.cno=c;
	}
	

	public void setBrand(String brand){
		this.brand=brand;
	}
	
	public String getBrand() {
		return brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getCno() {
		return cno;
	}

	public void setCno(long cno) {
		this.cno = cno;
	}
	public void printSim1() {
		System.out.println("=====SIM1=====");
		System.out.println(brand);
		System.out.println(type);
		System.out.println(cno);
	
	}
}
