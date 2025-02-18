package com.xworkz.instagram.runner;

import com.xworkz.instagram.account.InstagramAccount;

public class InstagramRunner {
		public static void main(String[] args) {
			InstagramAccount account=new InstagramAccount();
			try {
				account.login(null, "Hello@234");
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				account.reelsWatch(null, "Hello@234");
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
}
