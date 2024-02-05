import fr.campusnumerique.cda.games.game.GameAbstract;
import fr.campusnumerique.cda.games.game.GameFactory;
import fr.campusnumerique.cda.games.players.PlayerInterface;
import fr.campusnumerique.cda.games.utils.GameController;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainDebug {
    public static void main(String[] args) {
        GameAbstract game11 = new GameFactory().createGame("1", "1");
        //PlayerInterface[] players = game.getPlayers();
        System.out.println("type: 1, mode: 1");
        System.out.println("game: " + game11);
        System.out.print("player1: ");
        System.out.println(game11.getPlayer1());
        System.out.print("player2: ");
        System.out.println(game11.getPlayer2());

        System.out.println();
        System.out.println("****************");
        System.out.println();

        GameAbstract game12 = new GameFactory().createGame("1", "2");
        System.out.println("type: 1, mode: 2");
        System.out.println("game: " + game12);
        System.out.print("player1: ");
        System.out.println(game12.getPlayer1());
        System.out.print("player2: ");
        System.out.println(game12.getPlayer2());

        System.out.println();
        System.out.println("****************");
        System.out.println();

        GameAbstract game13 = new GameFactory().createGame("1", "3");
        System.out.println("type: 1, mode: 3");
        System.out.println("game: " + game13);
        System.out.print("player1: ");
        System.out.println(game13.getPlayer1());
        System.out.print("player2: ");
        System.out.println(game13.getPlayer2());

    }
}