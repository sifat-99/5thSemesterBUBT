import java.util.ArrayList;
import java.util.List;

class Team {
    String name;
    List<Player> players = new ArrayList<>();
    int localCount = 0;

    public Team(String name) {
        this.name = name;
    }

    public void addPlayer(Player p, boolean isLocal) {
        players.add(p);
        if (isLocal) localCount++;
    }

    public String toString() {
        System.out.println("Team: " + name);
        for(Player p : players) {
            System.out.println(" - " + p);
        }
        return "";
    }
}