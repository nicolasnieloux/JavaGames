package fr.campusnumerique.cda.games.utils;

public class GameController {
    private View view = new View();
    private Validator validator = new Validator();

    private UserInteraction userInteraction = new UserInteraction();


    public void play() {

        view.showWelcomeMsg();
        String modeChoise = getModeChoice();


    }

    private String getModeChoice(){

        String modeChoice = "";
        while(!validator.verifyInputUserInt(1,3, modeChoice)){
            view.showAskGameModeMsg();
            modeChoice = userInteraction.getUserInput();
        }
        return modeChoice;
    }
}
