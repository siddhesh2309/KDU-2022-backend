public class Players {
    private String name;
    private String team;
    private String role;
    private Integer matches;
    private Integer runs;
    private Double average;
    private Double strikeRate;
    private Integer wickets;
    private Integer allRounders;
    public Players() {}

    public Players(String name, String team, String role, Integer matches, Integer runs, Double average, Double strikeRate, Integer wickets) {
        this.name = name;
        this.team = team;
        this.role = role;
        this.matches = matches;
        this.runs = runs;
        this.average = average;
        this.strikeRate = strikeRate;
        this.wickets = wickets;
        this.allRounders = wickets*runs;
    }


    public String getName() {
        return name;
    }
    public String getTeam() {
        return team;
    }
    public String getRole() {
        return role;
    }
    public int getMatches() {
        return matches;
    }
    public int getRuns() {
        return runs;
    }public Double getAverage() {
        return average;
    }
    public Double getStrikeRate() {
        return strikeRate;
    }
    public int getWickets() {
        return wickets;
    }

    public Integer getAllRounders() {
        return allRounders;
    }
}
