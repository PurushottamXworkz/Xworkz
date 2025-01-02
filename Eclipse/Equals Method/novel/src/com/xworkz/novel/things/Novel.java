package com.xworkz.novel.things;

public class Novel {
		public int uniqueNumber=151;
		private String author_name;
		private long contact;
		private int book_id;
		private String book_name;
		private String publisher;
		private String preface_writer;
		private String ISBN;
		private String address;
		
		public String getAuthor_name() {
			return author_name;
		}
		public void setAuthor_name(String author_name) {
			this.author_name = author_name;
		}
		public long getContact() {
			return contact;
		}
		public void setContact(long contact) {
			this.contact = contact;
		}
		public int getBook_id() {
			return book_id;
		}
		public void setBook_id(int book_id) {
			this.book_id = book_id;
		}
		public String getBook_name() {
			return book_name;
		}
		public void setBook_name(String book_name) {
			this.book_name = book_name;
		}
		public String getPublisher() {
			return publisher;
		}
		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}
		public String getPreface_writer() {
			return preface_writer;
		}
		public void setPreface_writer(String preface_writer) {
			this.preface_writer = preface_writer;
		}
		public String getISBN() {
			return ISBN;
		}
		public void setISBN(String iSBN) {
			ISBN = iSBN;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		
		@Override
		public String toString() {
			return "Novel [author_name=" + author_name + ","
					+ " contact=" + contact + ", book_id=" + book_id
					+ ", book_name=" + book_name +
					", publisher=" + publisher + ", preface_writer=" + preface_writer
					+ ", ISBN=" + ISBN + ", address=" + address + "]";
		}
		
		@Override
		public boolean equals(Object obj) {
			if(obj==null)
				return false;
			if(obj==this)
				return true;
			if(getClass()!=this.getClass())
				return false;
			
			Novel novel=(Novel) obj;
			
			if(novel.getAuthor_name()!=null)
				if(!(this.getAuthor_name()==novel.getAuthor_name()))
					return false;
			
			if(novel.getBook_name()!=null)
					if(!(this.getBook_name()==novel.getBook_name()))
						return false;
			
			if(!(this.getContact()==novel.getContact()))
						return false;
			
			if(!(novel.getBook_id()==this.getBook_id()))
					return false;
			
			if(novel.getPublisher()!=null)
					if(!(this.getPublisher()==novel.getPublisher()))
						return false;
			if(novel.getPreface_writer()!=null)
				if(this.getPreface_writer()!=null)
					if(!(this.getPreface_writer()==novel.getPreface_writer()))
						return false;
			if(novel.getISBN()!=null)
				if(this.getISBN()!=null)
					if(!(this.getISBN()==novel.getISBN()))
						return false;
			
			if(novel.getAddress()!=null)
				if(this.getAddress()!=null)
					if(!(this.getAddress()==novel.getAddress()))
						return false;			
			
			return true;
		}
		@Override
		public int hashCode() {
			int code=3;
			int hashResult=1;
			hashResult=code*hashResult+uniqueNumber;
			hashResult=code*hashResult+((this.address==null)? 0 : address.hashCode());
			hashResult=code*hashResult+((this.author_name==null) ? 0 : author_name.hashCode());
			hashResult=code*hashResult+((this.book_name==null) ? 0: book_name.hashCode());
			hashResult=code*hashResult+((this.ISBN==null) ? 0 :ISBN.hashCode());
			hashResult=code*hashResult+((this.preface_writer==null) ? 0 :preface_writer.hashCode());			
			return hashResult;	
		}
		
		
		
}
