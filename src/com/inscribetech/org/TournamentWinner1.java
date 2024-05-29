package com.inscribetech.org;
import java.util.*;

public class TournamentWinner1 {
	
public static String tournamentWinner(String[][] competitions, int[] results) {
		
		String currentBestTeam = "";
		Map<String, Integer> scores = new HashMap<>();
		scores.put(currentBestTeam, 0);
		
		for (int idx=0; idx<competitions.length; idx++) {
			
			String[] competition = competitions[idx];
			int result = results[idx];
			String homeTeam = competition[0];
			String awayTeam = competition[1];
			
			String winningTeam = (result == 1) ? homeTeam : awayTeam;
			
			updateScores(winningTeam, 3, scores);
			
			if (scores.get(winningTeam) > scores.get(currentBestTeam)) {
				
				currentBestTeam = winningTeam;
				
			}
		
			
		}
		return currentBestTeam;
		
	}
	public static void updateScores(String team, int points, Map<String,Integer> scores) {
		
		if (!scores.containsKey(team)) {
			
			scores.put(team, 0);
			
		}
		scores.put(team, scores.get(team) + points);
		
	}


}
