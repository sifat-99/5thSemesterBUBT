import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OctionCenter {
    Scanner scanner = new Scanner(System.in);
    public void startBidding(List<Player> localPlayers, List<Player> foreignPlayers, List<Team> teams) {

        int totalPicks = (2 * teams.size()) + (3 * teams.size());
        int picksDone = 0;

        while (picksDone < totalPicks && (!localPlayers.isEmpty() || !foreignPlayers.isEmpty())) {
            // Show teams
            System.out.println("\nTeams:");
            for (int i = 0; i < teams.size(); i++) {
                System.out.println(i + ": " + teams.get(i).name + " (Local picked: " + teams.get(i).localCount + ", Total: " + teams.get(i).players.size() + ")");
            }
            System.out.print("Select team index: ");
            int teamIdx = scanner.nextInt();
            if (teamIdx < 0 || teamIdx >= teams.size()) {
                System.out.println("Invalid team index.");
                continue;
            }
            Team team = teams.get(teamIdx);

            if (team.players.size() >= 5) {
                System.out.println("This team already has 5 players. Pick another team.");
                continue;
            }

            boolean canPickLocal = team.localCount < 2 && !localPlayers.isEmpty();
            boolean canPickForeign = !foreignPlayers.isEmpty() && (team.players.size() < 5);

            if (!canPickLocal && !canPickForeign) {
                System.out.println("No players left to pick for this team.");
                continue;
            }

            System.out.println("Pick type:");
            if (canPickLocal) System.out.println("0: Local"+ "\tRemaining: " + localPlayers.size());
            if (canPickForeign) System.out.println("1: Foreign" + "\tRemaining: " + foreignPlayers.size());
            int pickType = scanner.nextInt();

            if (pickType == 0 && canPickLocal) {
                Collections.shuffle(localPlayers);
                Player picked = localPlayers.remove(0);
                team.addPlayer(picked, true);
                System.out.println("Picked local: " + picked);
                picksDone++;
            } else if (pickType == 1 && canPickForeign) {
                Collections.shuffle(foreignPlayers);
                Player picked = foreignPlayers.remove(0);
                team.addPlayer(picked, false);
                System.out.println("Picked foreign: " + picked);
                picksDone++;
            } else {
                System.out.println("Invalid pick type or no players left in that category.");
            }
        }

    }
}
