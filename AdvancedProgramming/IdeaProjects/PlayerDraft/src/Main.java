import java.util.*;
import java.util.stream.Collectors;

// Player class
class Player {
    String name;
    String nationality;

    public Player(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }

    public boolean isLocal(String localCountry) {
        return nationality.equalsIgnoreCase(localCountry);
    }

    @Override
    public String toString() {
        return name + " (" + nationality + ")";
    }
}

class Team {
    String name;
    List<Player> players = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addPlayer(Player p) {
        players.add(p);
    }

    public void displayTeam() {
        System.out.println("Team: " + name);
        players.forEach(p -> System.out.println(" - " + p));
    }
}

// DraftManager
class DraftManager {
    private List<Player> draftPool;
    private String localCountry;

    public DraftManager(String localCountry) {
        this.localCountry = localCountry;
        draftPool = new ArrayList<>();
    }

    public void addPlayer(Player p) {
        draftPool.add(p);
    }

    public void draftPlayers(List<Team> teams) {
        // Split local and foreign players
        List<Player> localPlayers = draftPool.stream()
                .filter(p -> p.isLocal(localCountry)).collect(Collectors.toList());

        List<Player> foreignPlayers = draftPool.stream()
                .filter(p -> !p.isLocal(localCountry)).collect(Collectors.toList());

        // Shuffle both lists
        Collections.shuffle(localPlayers);
        Collections.shuffle(foreignPlayers);

        // Each team gets 2 local players and 3 foreign players
        for (Team team : teams) {
            for (int i = 0; i < 2; i++) {
                if (!localPlayers.isEmpty()) {
                    team.addPlayer(localPlayers.remove(0));
                }
            }
            for (int i = 0; i < 3; i++) {
                if (!foreignPlayers.isEmpty()) {
                    team.addPlayer(foreignPlayers.remove(0));
                }
            }
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        DraftManager manager = new DraftManager("Bangladesh");

        // Add 10 local players
        manager.addPlayer(new Player("Rahim", "Bangladesh"));
        manager.addPlayer(new Player("Tamim", "Bangladesh"));
        manager.addPlayer(new Player("Shakib", "Bangladesh"));
        manager.addPlayer(new Player("Liton", "Bangladesh"));
        manager.addPlayer(new Player("Afif", "Bangladesh"));
        manager.addPlayer(new Player("Taskin", "Bangladesh"));
        manager.addPlayer(new Player("Nasum", "Bangladesh"));
        manager.addPlayer(new Player("Mehidy", "Bangladesh"));
        manager.addPlayer(new Player("Soumya", "Bangladesh"));
        manager.addPlayer(new Player("Mustafiz", "Bangladesh"));

        // Add 15 foreign players
        manager.addPlayer(new Player("Smith", "Australia"));
        manager.addPlayer(new Player("Stokes", "England"));
        manager.addPlayer(new Player("Rashid", "Afghanistan"));
        manager.addPlayer(new Player("Kane", "New Zealand"));
        manager.addPlayer(new Player("Warner", "Australia"));
        manager.addPlayer(new Player("Buttler", "England"));
        manager.addPlayer(new Player("Conway", "New Zealand"));
        manager.addPlayer(new Player("Maxwell", "Australia"));
        manager.addPlayer(new Player("Boult", "New Zealand"));
        manager.addPlayer(new Player("Starc", "Australia"));
        manager.addPlayer(new Player("Morgan", "England"));
        manager.addPlayer(new Player("Root", "England"));
        manager.addPlayer(new Player("Hazlewood", "Australia"));
        manager.addPlayer(new Player("Nabi", "Afghanistan"));
        manager.addPlayer(new Player("Mujeeb", "Afghanistan"));

        // Create 5 teams
        List<Team> teams = new ArrayList<>();
        teams.add(new Team("Rangpur Riders"));
        teams.add(new Team("Khulna Tigers"));
        teams.add(new Team("Barishal Bullets"));
        teams.add(new Team("Dhaka Warriors"));
        teams.add(new Team("Rajshahi Kings"));

        // Draft players
        manager.draftPlayers(teams);

        // Display all teams
        for (Team team : teams) {
            team.displayTeam();
            System.out.println();
        }
    }
}