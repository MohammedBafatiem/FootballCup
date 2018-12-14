package footballcup;

import round.Round;
import round.RoundController;

import java.util.ArrayList;
import java.util.Collections;  // We have to import the Collections class

public class FootballCup {

    public static void main(String[] args) {
        // Assigning every Professional team
        String[] professionalListName = {"Brazil","Argentina","France","Porugal"};
        //Assigning every Amateur team
        String[] amateurlListName = {"Netherlans","Eygpt","Spain","Belgie"};

        ArrayList<Teams> fullTeamsList = new ArrayList();
        //loop through array of names and construct teams
        for (int i = 0; i < professionalListName.length; i++) {
            fullTeamsList.add(new Professional(professionalListName[i]));
            System.out.println("test:" + i + "length:" + professionalListName.length);
        }
        for (int i = 0; i < amateurlListName.length; i++) {
            fullTeamsList.add(new Amateur(amateurlListName[i]));
        }
         // Using collection.shuffle to randomly permuting the list elements
        Collections.shuffle(fullTeamsList);

       //in the 1round there are 4 matches, in the 2round there are 2 matches and the 3round is the finals
        Round round = new Round("One");
        Round round2 = new Round("Two");
        Round round3 = new Round("Three");


        RoundController.startTournament(fullTeamsList);
        ArrayList<Teams> round1Winners = RoundController.roundResults(round, fullTeamsList);
        ArrayList<Teams> round2Winners = RoundController.roundResults(round2, round1Winners);
        ArrayList<Teams> round3Winners = RoundController.roundResults(round3, round2Winners);

        RoundController.endTournament(round3Winners.get(0));

    }
}