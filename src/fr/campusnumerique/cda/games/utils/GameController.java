package fr.campusnumerique.cda.games.utils;

public class GameController {
    private View view = new View();
    private Validator validator = new Validator();

    private UserInteraction userInteraction = new UserInteraction();


    public void play() {
        view.showWelcomeMsg();
    }


}
