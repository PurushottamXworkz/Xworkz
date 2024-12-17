package com.xworkz.organisation;

import com.xworkz.organisation.things.Organisation;

public class OrganisationRunner {
	public static void main(String[] args) {
		Organisation organisation=new Organisation();
		organisation.setCeoName("Ramesh");
		organisation.setEmployess(15000);
		organisation.setHeadQuaters("London");
		organisation.setNameOfOrganisation("Infotech");
		organisation.setOdc("Bangalore");
		System.out.println(organisation.toString());
	}
}
