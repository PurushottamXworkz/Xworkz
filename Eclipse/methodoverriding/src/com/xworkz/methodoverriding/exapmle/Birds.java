package com.xworkz.methodoverriding.exapmle;

import java.util.Objects;

public class Birds extends Object{
		
	String nameOfclass;
	int age;
	String living;
	boolean usesWeapon;
	@Override
	public String toString() {
		return "Birds [nameOfclass=" + nameOfclass + ", age=" + age + ", living=" + living + ", usesWeapon="
				+ usesWeapon + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, living, nameOfclass, usesWeapon);
	}
	
}
