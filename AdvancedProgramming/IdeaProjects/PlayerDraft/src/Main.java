import java.util.*;

public class Main {
    public static void main(String[] args) {
        String localCountry = "Bangladesh";
        List<Player> draftPool = new ArrayList<>();

        // Add 10 local players
        draftPool.add(new Player("Rahim", "Bangladesh"));
        draftPool.add(new Player("Tamim", "Bangladesh"));
        draftPool.add(new Player("Shakib", "Bangladesh"));
        draftPool.add(new Player("Liton", "Bangladesh"));
        draftPool.add(new Player("Afif", "Bangladesh"));
        draftPool.add(new Player("Taskin", "Bangladesh"));
        draftPool.add(new Player("Nasum", "Bangladesh"));
        draftPool.add(new Player("Mehidy", "Bangladesh"));
        draftPool.add(new Player("Soumya", "Bangladesh"));
        draftPool.add(new Player("Mustafiz", "Bangladesh"));

        // Add 15 foreign players
        draftPool.add(new Player("Smith", "Australia"));
        draftPool.add(new Player("Stokes", "England"));
        draftPool.add(new Player("Rashid", "Afghanistan"));
        draftPool.add(new Player("Kane", "New Zealand"));
        draftPool.add(new Player("Warner", "Australia"));
        draftPool.add(new Player("Buttler", "England"));
        draftPool.add(new Player("Conway", "New Zealand"));
        draftPool.add(new Player("Maxwell", "Australia"));
        draftPool.add(new Player("Boult", "New Zealand"));
        draftPool.add(new Player("Starc", "Australia"));
        draftPool.add(new Player("Morgan", "England"));
        draftPool.add(new Player("Root", "England"));
        draftPool.add(new Player("Hazlewood", "Australia"));
        draftPool.add(new Player("Nabi", "Afghanistan"));
        draftPool.add(new Player("Mujeeb", "Afghanistan"));

        // Create 5 teams
        List<Team> teams = new ArrayList<>();
        teams.add(new Team("Rangpur Riders"));
        teams.add(new Team("Khulna Tigers"));
        teams.add(new Team("Barishal Bullets"));
        teams.add(new Team("Dhaka Warriors"));
        teams.add(new Team("Rajshahi Kings"));

        // Separate local and foreign players using a for loop
        List<Player> localPlayers = new ArrayList<>();
        List<Player> foreignPlayers = new ArrayList<>();
        for (Player p : draftPool) {
            if (p.isLocal(localCountry)) {
                localPlayers.add(p);
            } else {
                foreignPlayers.add(p);
            }
        }

        OctionCenter octionCenter = new OctionCenter();
        octionCenter.startBidding(localPlayers, foreignPlayers, teams);

        // Show final teams
        System.out.println("\nFinal Teams:");
        for (Team t : teams) {
            System.out.println(t);
            System.out.println();
        }
    }
}
