package com.xworkz.youtube.things;

public class Youtube {
	private String createdBy;
	private String content;
	private boolean available;
	private String title;
	private String editedBy;
	
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEditedBy() {
		return editedBy;
	}
	public void setEditedBy(String editedBy) {
		this.editedBy = editedBy;
	}
	@Override
	public String toString() {
		return "Youtube : createdBy=" + createdBy + ", content=" + content + ", available=" + available + ", title="
				+ title + ", editedBy=" + editedBy ;
	}
	
	
	
}
