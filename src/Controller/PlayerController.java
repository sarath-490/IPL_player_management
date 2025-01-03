package Controller;

import Model.Player;
import View.PlayerView;
import java.util.ArrayList;
import java.util.List;

public class PlayerController {
    private List<Player> players;
    private PlayerView view;

    public PlayerController(PlayerView view) {
        this.players = new ArrayList<>();
        this.view = view;
    }

    public void addPlayer(Player player) {
        players.add(player);
        System.out.println("Player added successfully: " + player.getName());
    }

    public Player getPlayerById(int id) {
        for (Player player : players) {
            if (player.getId() == id) {
                return player;
            }
        }
        return null;
    }

    public List<Player> getAllPlayers() {
        return players;
    }

    public void updatePlayerStats(int id, int runs, int wickets) {
        Player player = getPlayerById(id);
        if (player != null) {
            player.setRuns(runs);
            player.setWickets(wickets);
            System.out.println("Player stats updated for: " + player.getName());
        } else {
            System.out.println("Player not found!");
        }
    }

    public void displayPlayer(int id) {
        Player player = getPlayerById(id);
        if (player != null) {
            view.displayPlayerDetails(player);
        } else {
            System.out.println("Player not found!");
        }
    }

    public void displayAllPlayers() {
        view.displayAllPlayers(players);
    }
}