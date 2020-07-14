package entities;

public class Employer {

	private int id;
	private String name;
	private double salary;

	public void increaseSalary(int percentage) {
		
		salary+=salary*percentage/100;
	}

	public Employer(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public String toString() {
		return id+", "+name+", "+salary;
	}
}
