import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class Functions {

    public static final String delimiter = ",";
    public static ArrayList<Players> allPlayers = new ArrayList<Players>();
    public static ArrayList<Team> allTeams = new ArrayList<Team>();
    public static <Player> void readData(String csvFile) {
        try {
            File file = new File(csvFile);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String[] individualField;

            //allPlayers

            while ((line = br.readLine()) != null) {
                while ((line = br.readLine()) != null) {
                    individualField = line.split(delimiter);
                    String playerName = individualField[0];
                    String playerTeam = individualField[1];
                    String playerRole = individualField[2];
                    int playerMatches = Integer.parseInt(individualField[3]);
                    int playerRuns = Integer.parseInt(individualField[4]);
                    Double playerAverage = Double.parseDouble(individualField[5]);
                    Double playerStrikeRate = Double.parseDouble(individualField[6]);
                    int playerWickets = Integer.parseInt(individualField[7]);
                    allPlayers.add(new Players(playerName, playerTeam, playerRole, playerMatches, playerRuns, playerAverage, playerStrikeRate, playerWickets));
                }
            }

            //allTeams object

            for (Players player : allPlayers) {
                boolean flag = false;
                String temp = player.getTeam();
                for (Team t : allTeams) {
                    if (t.Name.equals(temp)) {
                        flag = true;
                        t.players.add(player);
                        t.Name = temp;
                        break;
                    }
                }
                if (!flag) {
                    ArrayList<Players> play = new ArrayList<Players>();
                    play.add(new Players(player.getName(), player.getTeam(), player.getRole(), player.getMatches(), player.getRuns(), player.getAverage(), player.getStrikeRate(), player.getWickets()));
                    allTeams.add(new Team(temp, play));
                }
            }

            br.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //Second Task
    public static void matchFixture() throws FileNotFoundException {
        try {
            PrintWriter pw = new PrintWriter(new File("fixture.csv"));
            StringBuilder sb = new StringBuilder();

            sb.append("Sr.No");
            sb.append(",");
            sb.append("Guest Team");
            sb.append(",");
            sb.append(("Home Team"));
            sb.append(",");
            sb.append("Venue-Ground");
            sb.append("\n");
            Set<String> hash_Set = new HashSet<String>();
            for (Players t : allPlayers) {
                hash_Set.add(t.getTeam());
            }
            Integer srNo = 0;
            for (String s : hash_Set) {
                for (String t : hash_Set) {
                    if (s != t) {
                        srNo++;
//                        System.out.println(s + " " + t);
                        sb.append(srNo);
                        sb.append(",");
                        sb.append(s);
                        sb.append(",");
                        sb.append(t);
                        sb.append(",");
                        sb.append("null");
                        sb.append("\n");
                    }
                }
            }

            pw.write(sb.toString());
            pw.close();
            System.out.println("fixture.csv file created!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

//    Third Task
    public static void bowlersWithLeast40Wickets(String bowlersTeam) {
        try {
            for (Players p : allPlayers) {
                if (p.getTeam().equals(bowlersTeam)) {
                    if (p.getWickets() >= 40) {
                        System.out.println(p.getName() + " " + p.getWickets());
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //Fourth Task
    public static void searchPlayer(String playerName) {
        try {
            boolean flag = true;
            for(Players p : allPlayers) {
                if(p.getName().contains(playerName))
                {
                    flag = true;
                    System.out.println("Name: " + p.getName());
                    System.out.println("Team: " + p.getTeam());
                    System.out.println("Role: " + p.getRole());
                    System.out.println();
                }
                else {
                    flag = false;
                }
            }
            if(!flag) {
                System.out.println("No Player found with name " + playerName);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

//    Fifth Task

    public static void runsAndWicketsScorer(String teamName) {

        HashMap<String, Integer> runScorer = new HashMap<>();
        HashMap<String, Integer> wicketTaker = new HashMap<>();
        Map<String, Integer> sorted = new HashMap<>();
        try {
            for (Players player : allPlayers) {
                if (player.getTeam().equals(teamName)) {
                    runScorer.put(player.getName(), player.getRuns());
                }
                if (player.getTeam().equals(teamName)) {
                    wicketTaker.put(player.getName(), player.getWickets());
                }
            }
            Map<String, Integer> map = new HashMap<>();

            sorted = runScorer.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
            Map.Entry<String, Integer> entry = sorted.entrySet().iterator().next();
            System.out.println("Highest Run Scorer");
            System.out.println(entry.getKey() + " " + entry.getValue());

            sorted = wicketTaker.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
            Map.Entry<String, Integer> entry1 = sorted.entrySet().iterator().next();
            System.out.println("\nHighest Wicket Taker");
            System.out.println(entry1.getKey() + " " + entry1.getValue());
        } catch (Exception e) {
            e.getMessage();
        }
    }

    //Sixth Task
    public static void top3BatBowlAllRounder() {
        System.out.println("\nTop 3 Batsman of the season");
        try {
            List<Players> topBatters = allPlayers.stream()
                    .sorted(Comparator.comparingInt(Players::getRuns).reversed()).limit(3)
                    .collect(Collectors.toList());
            for (Players lp : topBatters) {
                System.out.println(lp.getName());
            }
            System.out.println("\nTop 3 Bowlers of the season");
            List<Players> topBallers = allPlayers.stream()
                    .sorted(Comparator.comparingInt(Players::getWickets).reversed()).limit(3)
                    .collect(Collectors.toList());
            for (Players lp : topBallers) {
                System.out.println(lp.getName());
            }
            List<Players> topAllrounders = allPlayers.stream()
                    .sorted(Comparator.comparingInt(Players::getAllRounders).reversed()).limit(3)
                    .collect(Collectors.toList());
            System.out.println("\nTop 3 AllRounders of the season");
            for (Players lp : topAllrounders) {
                System.out.println(lp.getName());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void highestRunScorerTeam() {
        HashMap<String, Double> teamAndAvg = new HashMap<>();
        LinkedHashMap<String, Double> reverseSorted = new LinkedHashMap<>();
        try {
            for (Team t : allTeams) {
                List<Players> topBatsman = t.players.stream()
                        .sorted(Comparator.comparingDouble(Players::getAverage).reversed()).limit(6)
                        .collect(Collectors.toList());
                Double score = topBatsman.stream().mapToDouble(Players::getAverage).sum();
                teamAndAvg.put(t.Name, score);
            }
            teamAndAvg.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(2)
                    .forEachOrdered(x -> reverseSorted.put(x.getKey(), x.getValue()));
            Set<String> keys = reverseSorted.keySet();
            System.out.println("Task 7");
            System.out.println("Below are two Teams which would score the highest runs");
            System.out.println("________________________________________________________");
            System.out.println("Team | Predicted Score");

            for (String key : keys) {
                System.out.println(key + "  | " + Math.round(reverseSorted.get(key)));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("________________________________________________________");
        }
    }


    // Eighth Task
    public static void nextGenPlayers() {
        Set<Players> nextGenPlayers = new HashSet<Players>();
        try {

            for (Players newGenPlayer : allPlayers) {
                if (newGenPlayer.getMatches() <= 20) {
                    if (newGenPlayer.getAverage() >= 15.0) {
                        nextGenPlayers.add(newGenPlayer);
                    }
                }
                if (newGenPlayer.getMatches() <= 15) {
                    if (newGenPlayer.getWickets() >= 10) {
                        nextGenPlayers.add(newGenPlayer);
                    }
                }
            }
            for (Players newPlayers : nextGenPlayers) {
                System.out.println(newPlayers.getName() + " " + newPlayers.getRole());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
