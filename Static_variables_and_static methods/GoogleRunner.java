class GoogleRunner{
	public static void main(String[] args) {
		Google.services();
		Google.products();
		System.out.println("Name Of Organization : "+Google.nameOfOrganization);
		System.out.println("Browser Name : "+Google.browserName);

		Google googleHr=new Google();
		googleHr.hrDept();
		googleHr.talentAqusition();
	}
}