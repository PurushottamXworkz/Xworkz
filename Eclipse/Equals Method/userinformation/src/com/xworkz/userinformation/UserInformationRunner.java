package com.xworkz.userinformation;

import com.xworkz.userinformation.things.UserInfo;

public class UserInformationRunner {
	public static void main(String[] args) {
		UserInfo info=new UserInfo("Praveen123", "Delhi", "Praveen", "Patil", "praveen4@gmail.com", 7845957485749746l, 8745748510l, "EHFPP7419J", "Password@123", 580006, "India", "Delhi", "Book", 10, "ABCD89761");
		UserInfo info1=new UserInfo("Prashant02", "Delhi", "Prashant", "P", "prashant@gmail.com", 7845955485749746l, 8845748510l, "EHFPP7410J", "Password@23", 580008, "India", "Delhi", "Pens", 500, "ABCD88765");
		 
		UserInfo info2=new UserInfo("Kanishka12", "Patanagar", "Kanishka", "Gundlu", "kan4@gmail.com", 7745957485749746l, 9745748510l, "EJFPP7419J", "Password@129", 530006, "India", "Delhi", "Stationary", 15, "ABCD89768");
		UserInfo info3=new UserInfo("Pradush50", "Delhi", "Pradush", "Kungala", "pradhu@gmail.com", 7895955485749746l, 6845748510l, "EHFPP9410J", "Password@98", 500008, "India", "Delhi", "Paper", 4, "BBCD88765");
		UserInfo info4=new UserInfo("Pranab123", "Delhi", "Pranab", "Mukharjee", "pranab5@gmail.com", 9845957485749746l, 8745748519l, "EBFPP7419J", "Password@456", 590006, "India", "Delhi", "Clothing", 100, "XBCD89761");
		
		System.out.println(info.toString());
		System.out.println(info1.toString());
		System.out.println(info2.toString());
		System.out.println(info3.toString());
		System.out.println(info4.toString());
		
		System.out.println(info.equals(info1));
		System.out.println(info2.equals(info1));
		System.out.println(info3.equals(info2));
		System.out.println(info4.equals(info));
		
	}
 

 
 
}
