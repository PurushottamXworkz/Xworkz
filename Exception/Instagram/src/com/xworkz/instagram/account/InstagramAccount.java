package com.xworkz.instagram.account;

public class InstagramAccount {
		public void login(String userName,String psw) throws Exception{
			if(userName == null && psw ==null) {
				throw new NullPointerException(); 
			}else if(userName !=null && psw=="Hello@234"){
				System.out.println("Logged in Successfully");
			}else{
				System.out.println("Provide valid credentials");
			}
		}
		
		public void reelsWatch(String userName,String psw) throws Exception {
			if(userName ==null && psw ==null) {
				throw new NullPointerException();
			}else if(userName ==null && psw=="Hello@234") {
				System.out.println("You are able to watch reels");
			}else {
				System.out.println("provide proper credentials");
			}
		}
}
