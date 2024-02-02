package fr.campusnumerique.cda.games.utils;

import java.util.Scanner;

public class UserInteraction {

    private static UserInteraction instance;
    private UserInteraction(){};

    public static UserInteraction getInstance(){
        if (instance == null){
            instance = new UserInteraction();
        }
        return instance;
    }

    public String getUserInput() {
        // Enter data using Scanner
        Scanner scn = new Scanner(System.in);

        // Returning the read data using readLine
        return scn.nextLine();
    }
}
