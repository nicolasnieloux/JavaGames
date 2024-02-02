package fr.campusnumerique.cda.games.utils;

import java.util.Scanner;

public class UserInteraction {

    public String getUserInput() {
        // Enter data using Scanner
        Scanner scn = new Scanner(System.in);

        // Returning the read data using readLine
        return scn.nextLine();
    }
}
