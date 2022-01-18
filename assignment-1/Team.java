import java.util.ArrayList;

public class Team extends Players {
    public String Name;
    public ArrayList<Players> players;

    public Team(String name, ArrayList<Players> players) {
        this.Name = name;
        this.players = players;
    }

    public Team() {}
//    public void setName(String name) {
//        this.Name = name;
//    }
//
//    public String getName() {
//        return Name;
//    }
//
//    public void setPlayers(ArrayList<Players> players) {
//        this.players = players;
//    }
//    public ArrayList<Players> setPlayers() {
//        return players;
//    }
}
