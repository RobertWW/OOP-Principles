
public class Employee {
	String name;
	int age;
	String department;
	public Employee(String name, int age, String department) {
		this.name = name;
		this.age = age;
		this.department = department;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setDepartment (String department) {
		this.department = department;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String getDepartment() {
		return this.department;
	}
}
