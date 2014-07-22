package day14.work3;

public class Employee implements Comparable {
	
	private String name;
	private int age;
	private double salary;
	private double tax;
	
	

	
	public Employee(String name, int age, double salary, double tax) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.tax = tax;
	}




	@Override
	public String toString() {
		return "Employee name=" + name + ", age=" + age + ", salary=" + salary
				+ ", tax=" + tax;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public double getSalary() {
		return salary;
	}




	public void setSalary(double salary) {
		this.salary = salary;
	}




	public double getTax() {
		return tax;
	}




	public void setTax(double tax) {
		this.tax = tax;
	}




	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return name.compareTo(((Employee)arg0).getName());
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	

}
