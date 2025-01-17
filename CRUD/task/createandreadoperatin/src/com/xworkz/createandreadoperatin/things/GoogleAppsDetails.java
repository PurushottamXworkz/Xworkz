package com.xworkz.createandreadoperatin.things;

import java.util.Objects;

public class GoogleAppsDetails {
		private String nameOfApp;
		private String developedBy;
		private String versionOfApp;
		private long contact;
		
		
		
		public GoogleAppsDetails() {
			System.out.println("This is default constructor");
		}
				
		public GoogleAppsDetails(String nameOfApp, String developedBy, String versionOfApp, long contact) {
			super();
			this.nameOfApp = nameOfApp;
			this.developedBy = developedBy;
			this.versionOfApp = versionOfApp;
			this.contact = contact;
		}

		public String getNameOfApp() {
			return nameOfApp;
		}

		public void setNameOfApp(String nameOfApp) {
			this.nameOfApp = nameOfApp;
		}

		public String getDevelopedBy() {
			return developedBy;
		}

		public void setDevelopedBy(String developedBy) {
			this.developedBy = developedBy;
		}

		public String getVersionOfApp() {
			return versionOfApp;
		}

		public void setVersionOfApp(String versionOfApp) {
			this.versionOfApp = versionOfApp;
		}

		public long getContact() {
			return contact;
		}

		public void setContact(long contact) {
			this.contact = contact;
		}

		@Override
		public String toString() {
			return "GoogleAppsDetails [nameOfApp=" + nameOfApp + ", developedBy=" + developedBy + ", versionOfApp="
					+ versionOfApp + ", contact=" + contact + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(contact, developedBy, nameOfApp, versionOfApp);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			GoogleAppsDetails other = (GoogleAppsDetails) obj;
			return contact == other.contact && Objects.equals(developedBy, other.developedBy)
					&& Objects.equals(nameOfApp, other.nameOfApp) && Objects.equals(versionOfApp, other.versionOfApp);
		}
		
		
		
		
}
