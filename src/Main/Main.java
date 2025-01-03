//package Main;
//
//import Controller.PlayerController;
//import Model.Player;
//import View.PlayerView;
//
//public class Main {
//    public static void main(String[] args) {
//        // Create the View
//        PlayerView view = new PlayerView();
//
//        // Create the Controller
//        PlayerController controller = new PlayerController(view);
//
//        // Add Players
//        controller.addPlayer(new Player(1, "Virat Kohli", "RCB", "Batsman", 4500, 10));
//        controller.addPlayer(new Player(2, "MS Dhoni", "CSK", "Wicketkeeper", 4000, 5));
//        controller.addPlayer(new Player(3, "Jasprit Bumrah", "MI", "Bowler", 200, 150));
//
//        // Display All Players
//        controller.displayAllPlayers();
//
//        // Update Player Stats
//        controller.updatePlayerStats(1, 4600, 15);
//
//        // Display Individual Player
//        controller.displayPlayer(1);
//    }
//}


package Main;

import Controller.PlayerController;
import Model.Player;
import View.PlayerView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create the View
        PlayerView view = new PlayerView();

        // Create the Controller
        PlayerController controller = new PlayerController(view);

        // Add some initial Players
        controller.addPlayer(new Player(1, "Virat Kohli", "RCB", "Batsman", 4500, 10));
        controller.addPlayer(new Player(2, "MS Dhoni", "CSK", "Wicketkeeper", 4000, 5));
        controller.addPlayer(new Player(3, "Jasprit Bumrah", "MI", "Bowler", 200, 150));

        // Menu-driven interface
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Player Management System ---");
            System.out.println("1. Add a Player");
            System.out.println("2. Display All Players");
            System.out.println("3. Display Individual Player");
            System.out.println("4. Update Player Stats");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Player ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Player Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Player Team: ");
                    String team = scanner.nextLine();
                    System.out.print("Enter Player Role: ");
                    String role = scanner.nextLine();
                    System.out.print("Enter Player Runs: ");
                    int runs = scanner.nextInt();
                    System.out.print("Enter Player Wickets: ");
                    int wickets = scanner.nextInt();
                    controller.addPlayer(new Player(id, name, team, role, runs, wickets));
                    System.out.println("Player added successfully!");
                    break;

                case 2:
                    controller.displayAllPlayers();
                    break;

                case 3:
                    System.out.print("Enter Player ID to display: ");
                    int displayId = scanner.nextInt();
                    controller.displayPlayer(displayId);
                    break;

                case 4:
                    System.out.print("Enter Player ID to update: ");
                    int updateId = scanner.nextInt();
                    System.out.print("Enter New Runs: ");
                    int newRuns = scanner.nextInt();
                    System.out.print("Enter New Wickets: ");
                    int newWickets = scanner.nextInt();
                    controller.updatePlayerStats(updateId, newRuns, newWickets);
                    System.out.println("Player stats updated successfully!");
                    break;

                case 5:
                    System.out.println("Exiting the system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
