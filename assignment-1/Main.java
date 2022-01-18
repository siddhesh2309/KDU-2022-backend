import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("IPL Model based on JAVA and Object Oriented Programming Concepts");
            Scanner sc = new Scanner(System.in);
            String csvFile = "assignment-1/IPL_2021_data.csv";
            Functions iplModel = new Functions();
            iplModel.readData(csvFile);


            // Second Task
//            iplModel.matchFixture();

//        Third Task
//        System.out.println("Enter player's Team");
//        String teamName = sc.nextLine();
//        iplModel.bowlersWithLeast40Wickets(teamName);


//        Fourth Task
//        System.out.println("Write a string to search for player");
//        String playerName = sc.nextLine();
//        iplModel.searchPlayer(playerName);

//        Fifth Task
//        System.out.println("Enter Team to get Highest run scorer and Highest Wicket Taker");
//        String teamName = sc.nextLine();
//        iplModel.runsAndWicketsScorer(teamName);

//        Sixth Task
//            iplModel.top3BatBowlAllRounder();

//            Seventh Task
//            iplModel.highestRunScorerTeam();

//            Eighth Task
//            iplModel.nextGenPlayers();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
