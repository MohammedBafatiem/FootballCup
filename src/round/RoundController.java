package round;

import footballcup.Teams;

import java.util.ArrayList;// import the ArrayList class


public class RoundController {
// Using tournament in which pairs of remaining contestants play a match and the winner advances onto the next round
    public static void startTournament(ArrayList<Teams> teamsList) {
        System.out.println("All Teams Info. : \n");
        teamsList.forEach(teams -> System.out.println("Name: " + teams.getName() + " , Level: " + teams.getTeamsCategory()));
    }

    public static ArrayList<Teams> roundResults(Round round, ArrayList<Teams> teamsList) {

        System.out.println("\n \n------------  Ronde " + round.name + "  ------------    \n\n");

        // defining Teams as a new arrylist
        ArrayList<Teams> firstGroup = new ArrayList();

          // loop through first group
        for (int i = 0; i < teamsList.size(); i = i + 1) {
            firstGroup.add(teamsList.get(i));

        }

        ArrayList<Teams> winnenTeams = new ArrayList();

        for (int i = 0; i < firstGroup.size(); i++) {
            System.out.println("\n   Game " + (i + 1) + ": ");
            System.out.println(firstGroup.get(i).getName() + " VS " + firstGroup.get(i).getName());

            // Generate random number
            
            int teams1Score = 1 + (int) (Math.random() * ((25 - 1) + 1));
            int teams2Score = 1 + (int) (Math.random() * ((25 - 1) + 1));
            if (teams1Score > teams2Score) {
                winnenTeams.add(firstGroup.get(i));
            } else if (teams1Score < teams2Score) {
                winnenTeams.add(firstGroup.get(i));
            } else {
                winnenTeams.add(firstGroup.get(i));
            }

        }


        System.out.println("\n\n ------------- Rond " + round.name + "Winning Players ------------- \n\n ");
        winnenTeams.forEach(teams -> System.out.println("Name: " + teams.getName() + " , Level: " + teams.getTeamsCategory()));
        return winnenTeams;
    }

    public static void endTournament(Teams teams) {
        System.out.println("\n\n ------------- Winning Player ------------- \n\n ");
        System.out.println("Name: " + teams.getName() + " , Level: " + teams.getTeamsCategory());
        System.out.println("\n\n ------------- End Of Champion ------------- \n\n ");

    }
}

