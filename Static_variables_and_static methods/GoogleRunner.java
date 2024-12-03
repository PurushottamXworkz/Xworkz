class GoogleRunner{
	public static void main(String[] args) {
		Google.services();
		Google.products();
		System.out.println("----------------------------------------------");
		System.out.println("Name Of Organization : "+Google.nameOfOrganization);
		System.out.println("----------------------------------------------");
		System.out.println("Browser Name : "+Google.browserName);
		System.out.println("----------------------------------------------");
		Google googleHr=new Google();
		System.out.println("----------------------------------------------");
		googleHr.hrDept();
		System.out.println("----------------------------------------------");
		googleHr.talentAqusition();
		System.out.println("----------------------------------------------");
		Google googleHr1=new Google("Sundar Pichai");
		System.out.println("----------------------------------------------");
		Google googleHr2=new Google("Sundar Pichai",45555l);
		System.out.println("----------------------------------------------");

	}
}