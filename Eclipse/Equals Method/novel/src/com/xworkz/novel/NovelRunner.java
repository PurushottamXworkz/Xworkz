package com.xworkz.novel;

import com.xworkz.novel.things.Novel;

public class NovelRunner {
	 public static void main(String[] args) {
		Novel novel=new Novel();
		novel.setBook_id(123);
		novel.setBook_name("Pema katha");
		novel.setAuthor_name("Shersha");
		novel.setAddress("Mumdai Bandra");
		novel.setContact(8974521421l);
		novel.setISBN("ISBN00123");
		novel.setPreface_writer("Kataraki");
		novel.setPublisher("Bhuddha Publisher");
		
		Novel novel2=new Novel();
		novel2.setAddress("ladakh");
		novel2.setAuthor_name("Megha");
		novel2.setBook_id(124);
		novel2.setBook_name("Megha mala");
		novel2.setContact(7485749641l);
		novel2.setISBN("ISBN456");
		novel2.setPreface_writer("Kaira");
		novel2.setPublisher("Manohar Granthamala");
		
		Novel novel3=new Novel();
		novel3.setBook_id(123);
		novel3.setBook_name("Pema katha");
		novel3.setAuthor_name("Shersha");
		novel3.setAddress("Mumdai Bandra");
		novel3.setContact(8974521421l);
		novel3.setISBN("ISBN00123");
		novel3.setPreface_writer("Kataraki");
		novel3.setPublisher("Bhuddha Publisher");
		
		Novel novel4=new Novel();
		novel4.setAddress("Ernakulum");
		novel4.setAuthor_name("Zinta");
		novel4.setBook_id(128);
		novel4.setBook_name("Kota King");
		novel4.setContact(7895641234l);
		novel4.setISBN("ISBN00789");
		novel4.setPreface_writer("Ayush");
		novel4.setPublisher("Chirag Publisher");
		
		System.out.println("-----------------------------------------");
		System.out.println("novel equals novel2 :"+novel.equals(novel2));
		System.out.println("-----------------------------------------");
		System.out.println("novel equals novel3 :"+novel.equals(novel3));
		System.out.println("-----------------------------------------");
		System.out.println("novel4 equals novel2 :"+novel4.equals(novel2));
		System.out.println("-----------------------------------------");
		System.out.println("novel3 equals novel2 :"+novel4.equals(novel2));
		System.out.println("------------------------------------------");
		System.out.println(novel.toString());
		System.out.println("-----------------------------------------");
		System.out.println(novel2.toString());
		System.out.println("-----------------------------------------");
		System.out.println(novel3.toString());
		System.out.println("-----------------------------------------");
		System.out.println(novel4.toString());
		System.out.println("-----------------------------------------");
		System.out.println("NOVEL : \n"+novel.hashCode());
		System.out.println("-----------------------------------------");
		System.out.println("NOVEL2 : \n "+novel2.hashCode());
		System.out.println("-----------------------------------------");
		System.out.println("NOVEL3 : \n"+novel3.hashCode());
		System.out.println("-----------------------------------------");
		System.out.println("NOVEL4 : \n"+novel4.hashCode());
		System.out.println("-----------------------------------------");
	}
}
