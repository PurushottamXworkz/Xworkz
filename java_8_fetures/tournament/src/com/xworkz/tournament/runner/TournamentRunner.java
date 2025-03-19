package com.xworkz.tournament.runner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.tournament.dto.CricketDto;

public class TournamentRunner {
	public static void main(String[] args) {
		List<CricketDto> players=new ArrayList<CricketDto>();
		players.add(new CricketDto(450,"Virat"));
		players.add(new CricketDto(350,"Dhoni"));
		players.add(new CricketDto(850,"Sachin"));
				
		
		List<String> list=new ArrayList<String>();
		players.stream().filter(score->{
			if(score.getScores() > 300) {
				list.add(score.getName());
				return true;
			}
			return false;
		}).collect(Collectors.toList());
		
		Collections.sort(players);
		
		System.out.println(players);
		
		
		
		
	}
}
