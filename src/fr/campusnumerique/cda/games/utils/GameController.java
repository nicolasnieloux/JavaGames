package fr.campusnumerique.cda.games.utils;

public class GameController {
    private View view = View.getInstance();
    private Validator validator = Validator.getInstance();

    private UserInteraction userInteraction = UserInteraction.getInstance();


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
