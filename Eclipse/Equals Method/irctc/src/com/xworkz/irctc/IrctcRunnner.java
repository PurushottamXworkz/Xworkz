package com.xworkz.irctc;

import com.xworkz.irctc.things.Irctc;

public class IrctcRunnner {
		public static void main(String[] args) {
			Irctc user1=new Irctc();
			user1.setUserName("Akash");
			user1.setLoginId(2345);
			
			Irctc user2=new Irctc();
			user2.setUserName("Meghana");
			user2.setLoginId(2345);
			
			Irctc user3=user2;
			
			System.out.println(user1.toString());
			System.out.println(user2.toString());
			
			System.out.println(user1.equals(user2));
			System.out.println(user3.equals(user2));
			
			System.out.println("---------------------------------");
			System.out.println(user1.hashCode());
			System.out.println("---------------------------------");
			System.out.println(user2.hashCode());
			System.out.println("---------------------------------");
		}
}
