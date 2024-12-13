package com.xworkz.methodoverriding.exapmle;

import java.util.Objects;

public class Human extends Object{
		String nameOfclass;
		int age;
		String living;
		boolean usesWeapon;
		
		
		
		public String toString() {
			return "Human [nameOfclass=" + nameOfclass + ", age=" + age + ", living=" + living + ", usesWeapon="
					+ usesWeapon + "]";
		}


		public int hashCode() {
			return Objects.hash(age, living, nameOfclass, usesWeapon);
		}
		
		
}
