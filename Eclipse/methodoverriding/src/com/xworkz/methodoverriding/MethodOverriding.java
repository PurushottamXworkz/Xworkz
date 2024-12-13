package com.xworkz.methodoverriding;

import com.xworkz.methodoverriding.exapmle.Animal;
import com.xworkz.methodoverriding.exapmle.Birds;
import com.xworkz.methodoverriding.exapmle.Human;

public class MethodOverriding {
		public static void main(String[] args) {
			Human human=new Human();
			System.out.println(human.getClass());
			System.out.println(human.hashCode());
			System.out.println(human.toString());
			
			Animal animal=new Animal();
			System.out.println(animal.getClass());
			System.out.println(animal.hashCode());
			System.out.println(animal.toString());
			
			Birds birds=new Birds();
			System.out.println(birds.getClass());
			System.out.println(birds.hashCode());
			System.out.println(birds.toString());
			
			
		}
}
