import java.util.ArrayList;
import java.util.Scanner;

public class PlayerSelection {
    public static void main(String[] args) {

        ArrayList<Player> players = new ArrayList<Player>();

        Scanner myScanner = new Scanner(System.in);

        boolean continueLoop = true;
        while(continueLoop == true) {
            System.out.println("---------MENU---------");
            System.out.println("Press A : to Add a player");
            System.out.println("Press V : to View all players");
            System.out.println("Press B : to Display two best batmans");
            System.out.println("Press C : to Display two best bowlers");
            System.out.println("Press D : to Display the best keeper");
            System.out.println("Press E : to exit the program");
            System.out.println("");
            System.out.print("Enter the code you want to access: ");
            String accessedFunction = myScanner.nextLine();

            if (accessedFunction.equalsIgnoreCase("A")) {                               //Add a player
                System.out.print("Enter Player name: ");
                String playerName = myScanner.nextLine();

                System.out.print("Enter Player age: ");
                int playerAge = myScanner.nextInt();

                System.out.print("Enter Player type: ");
                String playerType= myScanner.next();

                System.out.print("Enter the number of runs or wickets in the last 15 matches: ");
                int playerStatistic = myScanner.nextInt();
                System.out.println("");

                Player newPlayer = new Player(playerName, playerAge, playerType, playerStatistic);

                newPlayer.getDetails();
                players.add(newPlayer);

            } else if (accessedFunction.equalsIgnoreCase("V")) {                        //View all players
                for(int i = 0; i < players.size(); i++) {
                    players.get(i).getDetails();
                }

            } else if (accessedFunction.equalsIgnoreCase("B")) {                        //Display two best batmans
                System.out.println("The best batmen is          Dawid Malan     -   BAT RATING-888");
                System.out.println("The Second best batmen is   Virat Kohli     -   BAT RATING-702");

            } else if (accessedFunction.equalsIgnoreCase("C")) {                        //Display two best bowlers
                System.out.println("The best bowler is          Tabraiz         -   BOWLING RATING-821");
                System.out.println("The Second Best Bowler is   Ashton Agar     -   B0WLING RATING-702");

            } else if (accessedFunction.equalsIgnoreCase("D")) {                        //Display the best keeper
                System.out.println("The best wicket keeper is   Mohammad Nabi   -   285");

            } else if (accessedFunction.equalsIgnoreCase("E")) {                        //to exit the program
                System.out.println("Thank you. Have a nice day!!!");
                continueLoop = false;

            } else {
                System.out.println("Invalid Input");
            }
        }
    }
}