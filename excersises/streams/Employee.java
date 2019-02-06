package streams;

import java.io.IOException;

public class Employee {
	String name;
	private int salary;
	private int age;

	public Employee(String name, int salary, int age) {
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) throws Exception {
		if (salary < 560) {
			throw new Exception("Salary lower than lowest");
		}
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		if (age < 16) {
			throw new Exception("Too young for employee");
		}
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Employee))
			return false;

		Employee e = (Employee) obj;
		return this.name.equals(e.getName()) && this.salary == e.getSalary() && this.age == e.getAge();

	}

}
