package fr.campusnumerique.cda.games.utils;

public class Validator {

    private static Validator instance;
    private Validator(){};

    public static Validator getInstance(){
        if (instance == null){
            instance = new Validator();
        }
        return instance;
    }
    public boolean verifyInputUserInt (int min, int max, String gameChoice){
        return gameChoice.matches("[1-3]");
        }
    }

