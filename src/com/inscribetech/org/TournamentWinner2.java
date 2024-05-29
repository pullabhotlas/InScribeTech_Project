package com.inscribetech.org;
import java.util.*;

public class TournamentWinner2 {
	
public static String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        
        String currentBestTeam = "";
        Map<String, Integer> scores = new HashMap<>();
        scores.put(currentBestTeam, 0);
        
        for (int idx = 0; idx < competitions.size(); idx++) {
            
            int result = results.get(idx);
            ArrayList<String> competition = competitions.get(idx);
            
            String homeTeam = competition.get(0);
            String awayTeam = competition.get(1);
            
            String winningTeam = "";
            if (result == 1) {
                winningTeam = homeTeam;
            } else {
                winningTeam = awayTeam;
            }
            
            updateScores(winningTeam, 3, scores);
            
            if (scores.get(winningTeam) > scores.get(currentBestTeam)) {
                currentBestTeam = winningTeam;
            }
        }
        
        return currentBestTeam;
    }
    
    public static void updateScores(String team, int points, Map<String, Integer> scores) {
        
        if (!scores.containsKey(team)) {
            scores.put(team, 0); 
        }
        
        scores.put(team, scores.get(team) + points);
        System.out.println(scores.get(team)+points);
    }
    
    public static void main(String[] args) {
        
        ArrayList<ArrayList<String>> competitions = new ArrayList<>();
        competitions.add(new ArrayList<>(Arrays.asList("HTML", "JS")));
        competitions.add(new ArrayList<>(Arrays.asList("JS", "C#")));
        competitions.add(new ArrayList<>(Arrays.asList("JS", "C#")));
        
        ArrayList<Integer> results = new ArrayList<>(Arrays.asList(0, 0, 1));
        
        String winner = tournamentWinner(competitions, results);
        System.out.println("The winner is: " + winner);
    }

}
