package com.xworkz.google.things;

public class Google {
	protected String nameOfApplication="Google Doc";
	protected String productOwner="Ravi";
	protected String developedBy="Anup";
	protected String testerName="Teena";
	protected int numberOfEmployess=50;
	protected String teamName="Dunzo";
	protected String teamLead="Arnav";
	protected String projectManager="Asief";
	protected String teamManager="Mutti";
	protected float budgetOfProject=150000f;
	
	
	
	
	public Google() {
		super();
		System.out.println("This is default constructor");
	}
	
	public Google(String nameOfApplication) {
		this();
		this.nameOfApplication = nameOfApplication;
	}

	public Google(String nameOfApplication, String productOwner) {
		this(nameOfApplication);
		this.productOwner = productOwner;
	}
	
	
	
	public Google(String nameOfApplication, String productOwner, String developedBy) {
		this(nameOfApplication,productOwner);
		this.developedBy = developedBy;
	}

	public Google(String nameOfApplication, String productOwner, String developedBy, String testerName) {
		this(nameOfApplication,productOwner,developedBy);
		this.testerName = testerName;
	}

	public Google(String nameOfApplication, String productOwner, String developedBy, String testerName,
			int numberOfEmployess) {
		this(nameOfApplication,productOwner,developedBy,testerName);
		this.numberOfEmployess = numberOfEmployess;
	}
	

	public Google(String nameOfApplication, String productOwner, String developedBy, String testerName,
			int numberOfEmployess, String teamName) {
		this(nameOfApplication,productOwner,developedBy,testerName,numberOfEmployess);
		this.teamName = teamName;
	}

	public Google(String nameOfApplication, String productOwner, String developedBy, String testerName,
			int numberOfEmployess, String teamName, String teamLead) {
		this(nameOfApplication,productOwner,developedBy,testerName,numberOfEmployess,teamName);
		this.teamLead = teamLead;
	}
	
	

	public Google(String nameOfApplication, String productOwner, String developedBy, String testerName,
			int numberOfEmployess, String teamName, String teamLead, String projectManager) {
		this(nameOfApplication,productOwner,developedBy,testerName,numberOfEmployess,teamName,teamLead);
		this.projectManager = projectManager;
	}
	
	

	public Google(String nameOfApplication, String productOwner, String developedBy, String testerName,
			int numberOfEmployess, String teamName, String teamLead, String projectManager, String teamManager) {
		this(nameOfApplication,productOwner,developedBy,testerName,numberOfEmployess,teamName,teamLead,projectManager);
		this.teamManager = teamManager;
	}

	
	public Google(String nameOfApplication, String productOwner, String developedBy, String testerName,
			int numberOfEmployess, String teamName, String teamLead, String projectManager, String teamManager,
			float budgetOfProject) {
		this(nameOfApplication,productOwner,developedBy,testerName,numberOfEmployess,teamName,teamLead,projectManager,teamManager);
		this.budgetOfProject = budgetOfProject;
	}

	@Override
	public String toString() {
		return "Google [nameOfApplication=" + nameOfApplication + ", productOwner=" + productOwner + ", developedBy="
				+ developedBy + ", testerName=" + testerName + ", numberOfEmployess=" + numberOfEmployess
				+ ", teamName=" + teamName + ", teamLead=" + teamLead + ", projectManager=" + projectManager
				+ ", teamManager=" + teamManager + ", budgetOfProject=" + budgetOfProject + "]";
	}
	
}
