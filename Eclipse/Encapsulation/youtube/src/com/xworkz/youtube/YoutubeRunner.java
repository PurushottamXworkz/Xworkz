package com.xworkz.youtube;

import com.xworkz.youtube.things.Youtube;

public class YoutubeRunner {
	public static void main(String[] args) {
		Youtube youtube = new Youtube();
		 youtube.setAvailable(true);
		 youtube.setContent("Educational");
		 youtube.setCreatedBy("Hansika");
		 youtube.setEditedBy("Rajesh");
		 youtube.setTitle("Java encapsulation concept");
		 System.out.println(youtube.toString());
	}
}
