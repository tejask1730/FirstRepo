package Object;

import java.util.Objects;

public class Employee {
	int id;
	String name;
	String email;
	public Employee(int id, String n,String e) {
		this.email=e;
		this.id=id;
		this.name=n;
		
	}
	@Override
	public String toString() {
		return id + " this is the id of employee"   +  name + "and the name" + email + "email is";
	}
	@Override
	public  boolean equals(Object obj) {
		Employee e = (Employee)obj;
		if(this.id == e.id && this.email == e.email && this.name == e.name) {
			return true;
			
		}else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return Objects.hash(id,name, email);
	}

}
