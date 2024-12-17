package com.xworkz.songs;

import com.xworkz.songs.things.Songs;

public class SongsRunner {
	public static void main(String[] args) {
		Songs songs=new Songs();
		songs.setSinger("Sudeep");
		songs.setSongType("Movie");
		songs.setComposedBy("Arjun");
		songs.setCorus("Ananya");
		songs.setBudget(45000);
		System.out.println(songs.toString());
	}
}
