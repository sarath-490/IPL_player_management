package View;

import Model.Player;
import java.util.List;

public class PlayerView {
    public void displayPlayerDetails(Player player) {
        System.out.println("Player Details:");
        System.out.println("ID: " + player.getId());
        System.out.println("Name: " + player.getName());
        System.out.println("Team: " + player.getTeam());
        System.out.println("Role: " + player.getRole());
        System.out.println("Runs: " + player.getRuns());
        System.out.println("Wickets: " + player.getWickets());
    }

    public void displayAllPlayers(List<Player> players) {
        System.out.println("Team Roster:");
        for (Player player : players) {
            System.out.println(player.getName() + " (" + player.getTeam() + ")");
        }
    }
}