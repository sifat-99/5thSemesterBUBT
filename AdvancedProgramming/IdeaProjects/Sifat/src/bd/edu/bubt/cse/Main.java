package bd.edu.bubt.cse;

public class Main {

    public static void main(String[] args) {

	Goalkeeper goalkeeper = new Goalkeeper();
    Striker striker = new Striker();
    Striker striker2 = new Striker();
    Striker striker3 = new Striker();
    MidFielder midFielder = new MidFielder();
    MidFielder midFielder2 = new MidFielder();
    MidFielder midFielder3 = new MidFielder();
    MidFielder midFielder4 = new MidFielder();
    Defender defender = new Defender();
    Defender defender2 = new Defender();
    Defender defender3 = new Defender();

    // Testing

    striker.setName("Lionel Messi");
    striker.setAge(37);
    striker.setJerseyNumber(10);
    striker.setTotalShotsOnTarget(80);
    striker.setTotalGoalsScored(57);
    striker.setTotalShotsOffTarget(10);
    striker.setMatchPlayed(2);
    striker.setTotalSuccessfulDribbles(100);
        System.out.printf("Name: ");
        System.out.println(striker.getName());
        System.out.printf("Age: ");
        System.out.println(striker.getAge());
        System.out.printf("Jersey Number: ");
        System.out.println(striker.getJerseyNumber());
        System.out.printf("Total Shots: ");
        System.out.println(striker.getTotalShotsOnTarget());
        System.out.printf("Successful Dribbles: ");
        System.out.println(striker.getTotalSuccessfulDribbles());
        System.out.printf("Total Goal: ");
        System.out.println(striker.getTotalGoalsScored());
        System.out.printf("Shots on Target Percentage: ");
        System.out.println(striker.getShotsOnTargetPercentage());

    }
}
