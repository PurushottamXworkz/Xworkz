package com.xworkz.streamtask.dto;

import java.util.Objects;

public class EmployeesDto {
	private String name;
	private double salary;
	private double bonus;
	
	public EmployeesDto(String name, double salary, double bonus) {
		super();
		this.name = name;
		this.salary = salary;
		this.bonus = bonus;
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

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bonus, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeesDto other = (EmployeesDto) obj;
		return Double.doubleToLongBits(bonus) == Double.doubleToLongBits(other.bonus)
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	@Override
	public String toString() {
		return "EmployeesDto [name=" + name + ", salary=" + salary + ", bonus=" + bonus + "]";
	}
	
}
