package com.xworkz.google;

import com.xworkz.google.things.Google;

public class GoogleRunner {
		public static void main(String[] args) {
				GoogleCloud cloud=new GoogleCloud();
				System.out.println(cloud);
				
				GoogleDocs docs=new GoogleDocs();
				System.out.println(docs);
				
				GooglePlayStore playStore = new GooglePlayStore();
				System.out.println(playStore);
				
				Youtube youtube=new Youtube();
				System.out.println(youtube);
				
				Google google= new Google();
				System.out.println(google);
				
				Google google2=new Google("Gmail");
				Google google3=new Google("Gmail", "Rajesh");
				Google google4=new Google("Gmail", "Rajesh", "Rajneesh"); 
				
				Google google5 = new Google("Gmail", "Rajesh", "Rajneesh", "Arya");
				
				Google google6 = new Google("Gmail", "Rajesh", "Rajneesh", "Arya", 15440);
				Google google7 = new Google("Gmail", "Rajesh", "Rajneesh", "Arya", 15440, "Alpha");
				
				Google google8 = new Google("Gmail", "Rajesh", "Rajneesh", "Arya", 15440, "Alpha", "Nagaraj");
				
				Google google9 = new Google("Gmail", "Rajesh", "Rajneesh", "Arya", 15440, "Alpha", "Nagaraj", "Anupam");
				
				Google google10 = new Google("Gmail", "Rajesh", "Rajneesh", "Arya", 15440, "Alpha", "Nagaraj", "Anupam", "Natesh");
				
				System.out.println(google.toString());
				
				System.out.println(google2.toString());
				System.out.println(google3.toString());
				
				System.out.println(google4.toString());
				System.out.println(google5.toString());
				System.out.println(google6.toString());
				System.out.println(google7.toString());
				System.out.println(google8.toString());
				System.out.println(google9.toString());
				System.out.println(google10.toString());				
		}
}
