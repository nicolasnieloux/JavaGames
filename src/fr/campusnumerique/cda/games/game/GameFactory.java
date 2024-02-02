package fr.campusnumerique.cda.games.game;

public class GameFactory {
    public void createGame(String type, String mode){
        switch (type){
            case "1" : new TicTacToeGame(mode);
            case "2" : new GomokuGame(mode);
            case "3" : new Connect4Game(mode);
        }

    };
}
