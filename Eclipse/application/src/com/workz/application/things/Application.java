package com.workz.application.things;

public class Application {
	private int noOfApplication;
	private String builtBy;
	private String userName;
	private int userAccounts;
	private String domainName;
	
	public Application(int noOfApplication, String builtBy, String userName, int userAccounts, String domainName) {
		this.noOfApplication = noOfApplication;
		this.builtBy = builtBy;
		this.userName = userName;
		this.userAccounts = userAccounts;
		this.domainName = domainName;
	}


	public String toString() {
		return "Application [Nuber Of Application=" + noOfApplication + ", Built By=" + builtBy + ", User Name=" + userName
				+ ", User Accounts=" + userAccounts + ", Domain Name=" + domainName + "]";
	}
	
}
